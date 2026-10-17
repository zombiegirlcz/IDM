package defpackage;

import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.rpc.TerminalStatus;
import com.youTransactor.uCube.rpc.command.GetStatusCommand;
import com.youTransactor.uCube.rpc.command.RepeatLastMessageCommand;
import java.util.Timer;

/* JADX INFO: loaded from: classes17.dex */
public final class e0 extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Timer f121358c;

    @Override // defpackage.x0
    public final void a() {
        this.f301443b = true;
        Timer timer = this.f121358c;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.f121358c.purge();
    }

    public final void b(TaskEvent taskEvent, Object[] objArr) {
        if (this.f301443b) {
            return;
        }
        int i = z.f318151a[taskEvent.ordinal()];
        int i2 = 1;
        if (i == 1 || i == 2) {
            e.b("Error! get terminal Status " + taskEvent, new Exception[0]);
            e.b("Error! async recovery mechanism fails", new Exception[0]);
            super.run();
            return;
        }
        if (i != 3) {
            return;
        }
        TerminalStatus terminalStatus = ((GetStatusCommand) objArr[0]).getTerminalStatus();
        if (terminalStatus == null) {
            e.b("Error! async recovery mechanism fails", new Exception[0]);
            super.run();
            return;
        }
        e.a("Terminal status: " + terminalStatus);
        int i3 = z.f318152b[terminalStatus.ordinal()];
        if (i3 == 1) {
            e.a("Process on going, Nothing to do just wait !");
            e.a("get terminal status after 9000 ms");
            try {
                Timer timer = new Timer();
                this.f121358c = timer;
                timer.schedule(new r(this, i2), 9000L);
                return;
            } catch (IllegalArgumentException | IllegalStateException e) {
                e.b("failed to schedule rx event timer ", e);
                return;
            }
        }
        if (i3 == 2) {
            e.b("Error! No process on going, call repeat pkt command", new Exception[0]);
            e.a("Send Repeat Last pkt");
            new RepeatLastMessageCommand().execute(new a0(this, 1));
        } else {
            if (i3 != 3) {
                return;
            }
            e.b("Error! unknown status, command fails", new Exception[0]);
            e.b("Error! async recovery mechanism fails", new Exception[0]);
            super.run();
        }
    }

    public final void c(TaskEvent taskEvent) {
        if (this.f301443b) {
            return;
        }
        int i = z.f318151a[taskEvent.ordinal()];
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
        if (this.f301443b) {
            return;
        }
        e.a("Get terminal status");
        new GetStatusCommand().execute(new a0(this, 0));
    }
}
