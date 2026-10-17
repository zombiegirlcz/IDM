package ny;

import kmi.g;
import kotlin.jvm.internal.Intrinsics;
import yji.d;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f220588c;

    public a(g nfcDelegate) {
        Intrinsics.checkNotNullParameter(nfcDelegate, "nfcDelegate");
        this.f220588c = nfcDelegate;
    }

    @Override // yji.d
    public final void onCreate() {
        g gVar = this.f220588c;
        gVar.f185894a.getLifecycle().addObserver(gVar.f185897g);
    }

    @Override // yji.d
    public final void onDestroy() {
        g gVar = this.f220588c;
        gVar.f185894a.getLifecycle().removeObserver(gVar.f185897g);
    }
}
