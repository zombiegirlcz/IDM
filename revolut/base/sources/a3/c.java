package a3;

import android.view.Choreographer;
import skm.l;
import skm.p0;
import zkm.o;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f952b;

    public /* synthetic */ c(Runnable runnable, int i) {
        this.f951a = i;
        this.f952b = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        int i = this.f951a;
        Runnable runnable = this.f952b;
        switch (i) {
            case 0:
                runnable.run();
                break;
            default:
                p0 p0Var = p0.f264001a;
                ((l) runnable).E(o.f323119a, Long.valueOf(j2));
                break;
        }
    }
}
