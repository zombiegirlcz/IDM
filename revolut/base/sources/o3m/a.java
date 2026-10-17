package o3m;

import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.api.UCubeAPI;
import com.youTransactor.uCube.api.UCubeLibMDMServiceListener;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UCubeLibMDMServiceListener f221884b;

    public /* synthetic */ a(UCubeLibMDMServiceListener uCubeLibMDMServiceListener, int i) {
        this.f221883a = i;
        this.f221884b = uCubeLibMDMServiceListener;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public final void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        switch (this.f221883a) {
            case 0:
                UCubeAPI.c(this.f221884b, taskEvent, objArr);
                break;
            case 1:
                UCubeAPI.d(this.f221884b, taskEvent, objArr);
                break;
            case 2:
                UCubeAPI.e(this.f221884b, taskEvent, objArr);
                break;
            case 3:
                UCubeAPI.b(this.f221884b, taskEvent, objArr);
                break;
            default:
                UCubeAPI.a(this.f221884b, taskEvent, objArr);
                break;
        }
    }
}
