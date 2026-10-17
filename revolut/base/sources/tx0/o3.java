package tx0;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o3 implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.b f275218a = j6.a.h("create(...)");

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        int iAbs = Math.abs(i);
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        ihm.b bVar = this.f275218a;
        if (iAbs >= totalScrollRange) {
            bVar.onNext(n3.COLLAPSED);
        } else {
            bVar.onNext(n3.EXPANDED);
        }
    }
}
