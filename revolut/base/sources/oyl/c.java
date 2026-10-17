package oyl;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f231057b;

    public /* synthetic */ c(f fVar, int i) {
        this.f231056a = i;
        this.f231057b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f231056a) {
            case 0:
                f fVar = this.f231057b;
                fVar.e.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(600L).withEndAction(new c(fVar, 1)).start();
                break;
            default:
                this.f231057b.e.setVisibility(4);
                break;
        }
    }
}
