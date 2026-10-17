package defpackage;

import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommandStatus;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes17.dex */
public final class c0 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f20074a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList f20075b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20076c = new Object();
    public boolean d;
    public final /* synthetic */ n0 e;

    public c0(n0 n0Var) {
        this.e = n0Var;
    }

    public final RPCCommand a() {
        RPCCommand rPCCommand;
        if (this.f20075b.isEmpty()) {
            return null;
        }
        synchronized (this.f20075b) {
            rPCCommand = (RPCCommand) this.f20075b.getLast();
        }
        return rPCCommand;
    }

    public final void b(RPCCommandStatus rPCCommandStatus) {
        synchronized (this.f20075b) {
            try {
                if (rPCCommandStatus != null) {
                    ArrayList arrayList = new ArrayList(this.f20075b);
                    this.f20075b.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        RPCCommand rPCCommand = (RPCCommand) obj2;
                        e.a("Clear current command: 0x" + Integer.toHexString(rPCCommand.getCommandId()) + " from queue with status: " + rPCCommandStatus);
                        rPCCommand.setState(rPCCommandStatus);
                    }
                } else {
                    this.f20075b.clear();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        synchronized (this.f20074a) {
            this.f20074a.clear();
        }
        synchronized (this.f20076c) {
            this.d = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(byte[] r11) {
        /*
            Method dump skipped, instruction units count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c0.c(byte[]):void");
    }

    public final void d() {
        if (this.f20074a.isEmpty()) {
            return;
        }
        synchronized (this.f20076c) {
            try {
                if (this.d) {
                    if (!this.f20075b.isEmpty()) {
                        e.b("receiver busy !", new Exception[0]);
                        return;
                    }
                    this.d = false;
                }
                this.d = true;
                synchronized (this.f20074a) {
                    try {
                        byte[] bArr = (byte[]) this.f20074a.peek();
                        if (bArr != null) {
                            c(bArr);
                        } else {
                            this.f20074a.poll();
                            d();
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final void e(RPCCommand rPCCommand) {
        synchronized (this.f20075b) {
            this.f20075b.remove(rPCCommand);
        }
        synchronized (this.f20076c) {
            this.d = false;
        }
    }

    public final void f(RPCCommand rPCCommand) {
        if (rPCCommand != null) {
            synchronized (this.f20075b) {
                this.f20075b.remove(rPCCommand);
            }
        }
        this.e.f210826a.a();
        synchronized (this.f20074a) {
            this.f20074a.poll();
        }
        synchronized (this.f20076c) {
            this.d = false;
        }
        d();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        d();
    }
}
