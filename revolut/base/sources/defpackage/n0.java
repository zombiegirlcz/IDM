package defpackage;

import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.connexion.DisconnectListener;
import com.youTransactor.uCube.connexion.ResponseListener;
import com.youTransactor.uCube.rpc.EventListener;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommandStatus;
import com.youTransactor.uCube.rpc.RPCService;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Timer;
import p96.a;

/* JADX INFO: loaded from: classes20.dex */
public final class n0 extends Observable implements DisconnectListener, ResponseListener {
    public static final n0 f = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f210826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f210827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f210828c;
    public byte d;
    public EventListener e;

    public n0() {
        k0 k0Var = new k0(this);
        this.f210826a = k0Var;
        c0 c0Var = new c0(this);
        this.f210827b = c0Var;
        this.f210828c = false;
        this.d = (byte) 0;
        k0Var.start();
        c0Var.start();
    }

    public static RPCCommand a(LinkedList linkedList, byte[] bArr) {
        if (linkedList.isEmpty() || bArr == null || bArr.length < 6) {
            return null;
        }
        byte b4 = bArr[3];
        short sMakeShort = Tools.makeShort(bArr[4], bArr[5]);
        Iterator it8 = linkedList.iterator();
        while (it8.hasNext()) {
            RPCCommand rPCCommand = (RPCCommand) it8.next();
            if (sMakeShort == rPCCommand.getCommandId() && b4 == rPCCommand.getSequenceNumber()) {
                return rPCCommand;
            }
        }
        return null;
    }

    public static void b(n0 n0Var) {
        n0Var.setChanged();
        n0Var.notifyObservers(new a(15));
    }

    public final synchronized void c(RPCCommand rPCCommand) {
        if (rPCCommand == null) {
            e.b("Error command is 'null' !", new Exception[0]);
            return;
        }
        if (rPCCommand.getCommandId() == 0) {
            e.a("command ID is 'unknown' ! Try to retrieve the command id and seq number");
            if (rPCCommand.getPayload() == null) {
                e.b("Error! payload of unknown command is null", new Exception[0]);
                rPCCommand.setState(RPCCommandStatus.FAILED);
                return;
            }
            if (rPCCommand.getPayload().length < 9) {
                e.b("Error! payload's length of unknown command is < 9", new Exception[0]);
                rPCCommand.setState(RPCCommandStatus.FAILED);
                return;
            }
            rPCCommand.setSequenceNumber(rPCCommand.getPayload()[3]);
            rPCCommand.setCommandId(Tools.makeShort(rPCCommand.getPayload()[4], rPCCommand.getPayload()[5]));
            e.a("retrieved command ID: 0x" + Integer.toHexString(rPCCommand.getCommandId()));
            e.a("retrieved command sequence num:" + ((int) rPCCommand.getSequenceNumber()));
        }
        this.f210826a.e(rPCCommand);
    }

    public final synchronized void d(RPCCommand rPCCommand) {
        if (rPCCommand == null) {
            e.b("Error command is 'null' !", new Exception[0]);
            return;
        }
        if (rPCCommand.getCommandId() == 0) {
            e.a("command ID is 'unknown' ! Try to retrieve the command id and seq number");
            if (rPCCommand.getPayload() == null) {
                e.b("Error! payload of unknown command is null", new Exception[0]);
                rPCCommand.setState(RPCCommandStatus.FAILED);
                return;
            }
            if (rPCCommand.getPayload().length < 9) {
                e.b("Error! payload's length of unknown command is < 9", new Exception[0]);
                rPCCommand.setState(RPCCommandStatus.FAILED);
                return;
            }
            rPCCommand.setSequenceNumber(rPCCommand.getPayload()[3]);
            rPCCommand.setCommandId(Tools.makeShort(rPCCommand.getPayload()[4], rPCCommand.getPayload()[5]));
            e.a("retrieved command ID: 0x" + Integer.toHexString(rPCCommand.getCommandId()));
            e.a("retrieved command sequence num:" + ((int) rPCCommand.getSequenceNumber()));
        }
        this.f210826a.b(rPCCommand);
    }

    @Override // com.youTransactor.uCube.connexion.DisconnectListener
    public final void onDisconnect(boolean z) {
        e.a("Disconnection was detected");
        RPCCommandStatus rPCCommandStatus = RPCCommandStatus.DISCONNECT;
        this.f210827b.b(rPCCommandStatus);
        this.f210826a.c(rPCCommandStatus);
        setChanged();
        notifyObservers(new a(15));
        if (this.f210828c) {
            this.f210828c = false;
        }
        this.d = (byte) 0;
    }

    @Override // com.youTransactor.uCube.connexion.ResponseListener
    public final void onError(byte[] bArr) {
        e.b("response receiving error !", new Exception[0]);
        c0 c0Var = this.f210827b;
        if (bArr == null) {
            c0Var.getClass();
            return;
        }
        synchronized (c0Var.f20074a) {
            c0Var.f20074a.add(bArr);
        }
        c0Var.d();
    }

    @Override // com.youTransactor.uCube.connexion.ResponseListener
    public final void onStart(byte[] bArr) {
        c0 c0Var = this.f210827b;
        RPCCommand rPCCommandA = a(c0Var.f20075b, bArr);
        RPCCommand rPCCommandA2 = c0Var.a();
        if (rPCCommandA == null && rPCCommandA2 == null) {
            return;
        }
        if (rPCCommandA2 != null && rPCCommandA2.getCommandId() == 816) {
            rPCCommandA2.setState(RPCCommandStatus.RECEIVING);
        }
        if (rPCCommandA != null) {
            e.a("Start Receiving response of 0x" + Integer.toHexString(rPCCommandA.getCommandId()) + " seq num :" + ((int) rPCCommandA.getSequenceNumber()));
            rPCCommandA.setState(RPCCommandStatus.RECEIVING);
        }
    }

    @Override // com.youTransactor.uCube.connexion.ResponseListener
    public final void onSuccess(byte[] bArr) {
        e.a("Response received");
        c0 c0Var = this.f210827b;
        for (RPCCommand rPCCommand : c0Var.f20075b) {
            rPCCommand.getClass();
            if (RPCService.isRecoveryMechanismEnabled()) {
                short s2 = rPCCommand.e;
                if (s2 != 514 && s2 != 20481 && s2 != 20483 && s2 != 20544 && s2 != 20576 && s2 != 20738 && s2 != 20785 && s2 != 21761 && s2 != 21763 && s2 != 769 && s2 != 770 && s2 != 816 && s2 != 817 && s2 != 20832 && s2 != 20833) {
                    switch (s2) {
                    }
                }
                if (!rPCCommand.k.f301443b) {
                    e.a("restart timer command ID: 0x" + Integer.toHexString(rPCCommand.e));
                    rPCCommand.f107641j.cancel();
                    rPCCommand.f107641j.purge();
                    rPCCommand.f107641j = new Timer();
                    rPCCommand.b();
                }
            }
        }
        if (bArr == null) {
            return;
        }
        synchronized (c0Var.f20074a) {
            c0Var.f20074a.add(bArr);
        }
        c0Var.d();
    }
}
