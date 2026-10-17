package ok7;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreen;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CFACInsuranceDocumentsScreen f225914a;

    public e(CFACInsuranceDocumentsScreen cFACInsuranceDocumentsScreen) {
        this.f225914a = cFACInsuranceDocumentsScreen;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        l lVar = (l) this.f225914a.Q.getValue();
        lVar.getClass();
        k.Companion.getClass();
        String selectedTabId = (String) r0.h(Integer.valueOf(i), g.f225917b);
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        lVar.x2(new o23.l(selectedTabId, 22));
    }
}
