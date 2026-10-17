package defpackage;

import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommandStatus;

/* JADX INFO: loaded from: classes21.dex */
public class x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RPCCommand f301442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f301443b = false;

    public x0(RPCCommand rPCCommand) {
        this.f301442a = rPCCommand;
    }

    public void a() {
        this.f301443b = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        n0 n0Var;
        if (this.f301443b) {
            return;
        }
        synchronized (n0.class) {
            n0Var = n0.f;
        }
        RPCCommand rPCCommand = this.f301442a;
        synchronized (n0Var) {
            n0Var.f210827b.e(rPCCommand);
            rPCCommand.setState(RPCCommandStatus.FAILED);
            n0Var.f210827b.f(null);
        }
        this.f301443b = true;
    }
}
