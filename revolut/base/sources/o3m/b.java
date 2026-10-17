package o3m;

import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.api.UCubeAPI;
import com.youTransactor.uCube.api.UCubeLibTaskListener;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UCubeLibTaskListener f221886b;

    public /* synthetic */ b(UCubeLibTaskListener uCubeLibTaskListener, int i) {
        this.f221885a = i;
        this.f221886b = uCubeLibTaskListener;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public final void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        switch (this.f221885a) {
            case 0:
                UCubeAPI.a(this.f221886b, taskEvent, objArr);
                break;
            case 1:
                UCubeAPI.c(this.f221886b, taskEvent, objArr);
                break;
            default:
                UCubeAPI.b(this.f221886b, taskEvent, objArr);
                break;
        }
    }
}
