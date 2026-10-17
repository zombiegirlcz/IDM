package defpackage;

import com.youTransactor.uCube.connexion.ConnectionService;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommandStatus;
import fnc.s;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes17.dex */
public final class k0 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f179876b;
    public RPCCommand d;
    public final /* synthetic */ n0 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f179875a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f179877c = new LinkedList();
    public final s e = new s(this, 17);

    public k0(n0 n0Var) {
        this.f = n0Var;
    }

    public static void d(k0 k0Var) {
        synchronized (k0Var.f179877c) {
            try {
                if (k0Var.f179877c.isEmpty()) {
                    return;
                }
                if (k0Var.d == null) {
                    return;
                }
                e.a("Command sending error: 0x" + Integer.toHexString(k0Var.d.getCommandId()));
                k0Var.f179877c.remove(k0Var.d);
                k0Var.d.setState(RPCCommandStatus.FAILED);
                synchronized (k0Var.f179875a) {
                    k0Var.f179876b = false;
                }
                k0Var.a();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void a() {
        if (this.f179877c.isEmpty()) {
            return;
        }
        synchronized (this.f179875a) {
            try {
                boolean z = false;
                if (this.f179876b) {
                    e.b("sender is busy!", new Exception[0]);
                    return;
                }
                synchronized (this.f179877c) {
                    try {
                        RPCCommand rPCCommand = (RPCCommand) this.f179877c.peek();
                        this.d = rPCCommand;
                        if (rPCCommand == null) {
                            this.f179877c.poll();
                            a();
                            return;
                        }
                        n0 n0Var = this.f;
                        short commandId = rPCCommand.getCommandId();
                        RPCCommand rPCCommandA = n0Var.f210827b.a();
                        if (rPCCommandA == null || commandId == 816) {
                            z = true;
                        } else if (commandId == 514 || commandId == 817) {
                            short s2 = rPCCommandA.e;
                            if (s2 != 514 && s2 != 20481 && s2 != 20483 && s2 != 20544 && s2 != 20576 && s2 != 20738 && s2 != 20785 && s2 != 21761 && s2 != 21763 && s2 != 769 && s2 != 770 && s2 != 816 && s2 != 817 && s2 != 20832 && s2 != 20833) {
                                switch (s2) {
                                    case 20514:
                                    case 20515:
                                    case 20516:
                                    case 20517:
                                    case 20518:
                                        z = true;
                                        break;
                                }
                            } else {
                                z = true;
                            }
                            z = !z;
                        }
                        if (z) {
                            synchronized (this.f179875a) {
                                this.f179876b = true;
                                e.a("start sending: 0x" + Integer.toHexString(this.d.getCommandId()));
                            }
                            ConnectionService.getInstance().connect(new h(this, 1));
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final void b(RPCCommand rPCCommand) {
        synchronized (this.f179877c) {
            ArrayList arrayList = new ArrayList(this.f179877c);
            this.f179877c.clear();
            this.f179877c.add(rPCCommand);
            this.f179877c.addAll(arrayList);
        }
        a();
    }

    public final void c(RPCCommandStatus rPCCommandStatus) {
        synchronized (this.f179877c) {
            try {
                if (rPCCommandStatus != null) {
                    ArrayList arrayList = new ArrayList(this.f179877c);
                    this.f179877c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        RPCCommand rPCCommand = (RPCCommand) obj2;
                        e.a("Clear next command: 0x" + Integer.toHexString(rPCCommand.getCommandId()) + " from queue with status: " + rPCCommandStatus);
                        rPCCommand.setState(rPCCommandStatus);
                    }
                } else {
                    this.f179877c.clear();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        synchronized (this.f179875a) {
            this.f179876b = false;
        }
    }

    public final void e(RPCCommand rPCCommand) {
        e.a("add command ID: 0x" + Integer.toHexString(rPCCommand.getCommandId()));
        synchronized (this.f179877c) {
            this.f179877c.add(rPCCommand);
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] f(com.youTransactor.uCube.rpc.RPCCommand r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0.f(com.youTransactor.uCube.rpc.RPCCommand):byte[]");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a();
    }
}
