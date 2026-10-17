package ju0;

import com.facebook.shimmer.ShimmerFrameLayout;
import ju0.j;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f178552b;

    public /* synthetic */ d(j jVar, int i) {
        this.f178551a = i;
        this.f178552b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f178551a;
        j jVar = this.f178552b;
        switch (i) {
            case 0:
                j.a aVar = j.Companion;
                if (!jVar.b()) {
                    ShimmerFrameLayout shimmerFrameLayout = jVar.f178562b;
                    shimmerFrameLayout.setVisibility(0);
                    shimmerFrameLayout.e();
                    shimmerFrameLayout.animate().cancel();
                    shimmerFrameLayout.animate().alpha(1.0f).setDuration(200L).start();
                }
                break;
            default:
                ShimmerFrameLayout shimmerFrameLayout2 = jVar.f178562b;
                shimmerFrameLayout2.f();
                shimmerFrameLayout2.setVisibility(8);
                break;
        }
    }
}
