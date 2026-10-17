package defpackage;

import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.command.RepeatLastMessageCommand;
import ey7.a;

/* JADX INFO: loaded from: classes15.dex */
public final class o extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f221095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(RPCCommand rPCCommand, int i) {
        super(rPCCommand);
        this.f221095c = i;
    }

    public void b(TaskEvent taskEvent, Object[] objArr) {
        if (this.f301443b) {
            return;
        }
        int i = s.f258701a[taskEvent.ordinal()];
        if (i == 1 || i == 2) {
            e.b("Error! repeat last pkt " + taskEvent, new Exception[0]);
            e.b("Error! async recovery mechanism fails", new Exception[0]);
            super.run();
            return;
        }
        if (i != 3) {
            return;
        }
        e.a("repeat last pkt " + taskEvent);
    }

    @Override // defpackage.x0, java.lang.Runnable
    public final void run() {
        n0 n0Var;
        n0 n0Var2;
        switch (this.f221095c) {
            case 0:
                if (this.f301443b) {
                    return;
                }
                RPCCommand rPCCommand = this.f301442a;
                rPCCommand.k = new x0(rPCCommand);
                synchronized (n0.class) {
                    n0Var = n0.f;
                    break;
                }
                RPCCommand rPCCommand2 = this.f301442a;
                synchronized (n0Var) {
                    e.a("retry after lost pkt, command 0x" + Integer.toHexString(rPCCommand2.getCommandId()));
                    n0Var.f210827b.e(rPCCommand2);
                    n0Var.d(rPCCommand2);
                }
                this.f301443b = true;
                return;
            case 1:
                if (this.f301443b) {
                    return;
                }
                RPCCommand rPCCommand3 = this.f301442a;
                rPCCommand3.k = new x0(rPCCommand3);
                synchronized (n0.class) {
                    n0Var2 = n0.f;
                    break;
                }
                RPCCommand rPCCommand4 = this.f301442a;
                synchronized (n0Var2) {
                    e.a("retry command 0x" + Integer.toHexString(rPCCommand4.getCommandId()));
                    n0Var2.f210827b.e(rPCCommand4);
                    n0Var2.d = rPCCommand4.getSequenceNumber();
                    n0Var2.d(rPCCommand4);
                }
                this.f301443b = true;
                return;
            default:
                if (this.f301443b) {
                    return;
                }
                e.a("Send Repeat Last pkt");
                new RepeatLastMessageCommand().execute(new a(this, 7));
                return;
        }
    }
}
