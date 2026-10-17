package au0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f9277a;

    public n(o oVar) {
        this.f9277a = oVar;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        float fAbs = appBarLayout.getTotalScrollRange() != 0 ? Math.abs(i) / appBarLayout.getTotalScrollRange() : BitmapDescriptorFactory.HUE_RED;
        if (fAbs > 1.0f) {
            return;
        }
        float f = 1 - fAbs;
        o oVar = this.f9277a;
        oVar.f9292a = f;
        oVar.f9294c = i;
        Iterator it8 = oVar.f9295g.iterator();
        while (it8.hasNext()) {
            ((m) it8.next()).a(f);
        }
        oVar.k(f, i);
    }
}
