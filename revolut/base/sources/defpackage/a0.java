package defpackage;

import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a0 implements ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f86b;

    public /* synthetic */ a0(e0 e0Var, int i) {
        this.f85a = i;
        this.f86b = e0Var;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public final void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        switch (this.f85a) {
            case 0:
                this.f86b.b(taskEvent, objArr);
                break;
            default:
                this.f86b.c(taskEvent);
                break;
        }
    }
}
