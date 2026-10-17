package mx0;

import androidx.core.graphics.ColorUtils;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.legacy.LegacyContentContainerFrameLayout;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.IdentityDocumentsScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes20.dex */
public final class b3 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4l.j f209595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f209596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f209597c;
    public final List d;

    public b3(z4l.j adapter, ihm.f itemSelectedSubject, ihm.f scrollingSubject, ArrayList onScrollListeners) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(itemSelectedSubject, "itemSelectedSubject");
        Intrinsics.checkNotNullParameter(scrollingSubject, "scrollingSubject");
        Intrinsics.checkNotNullParameter(onScrollListeners, "onScrollListeners");
        this.f209595a = adapter;
        this.f209596b = itemSelectedSubject;
        this.f209597c = scrollingSubject;
        this.d = onScrollListeners;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        super.onPageScrollStateChanged(i);
        this.f209597c.onNext(Boolean.valueOf(i != 0));
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        super.onPageScrolled(i, f, i2);
        z4l.j jVar = this.f209595a;
        if (i < jVar.getItemCount() - 1) {
            List list = this.d;
            for (int size = list.size() - 1; size >= 0; size--) {
                tpl.b bVar = (tpl.b) list.get(size);
                koi.j leftItem = jVar.a(i);
                koi.j rightItem = jVar.a(i + 1);
                IdentityDocumentsScreen identityDocumentsScreen = bVar.f273418a;
                Intrinsics.checkNotNullParameter(leftItem, "leftItem");
                Intrinsics.checkNotNullParameter(rightItem, "rightItem");
                if ((leftItem instanceof qv0.p) && (rightItem instanceof qv0.p)) {
                    Object f4 = ((qv0.p) leftItem).getF();
                    Object f5 = ((qv0.p) rightItem).getF();
                    if ((f4 instanceof vpl.b) && (f5 instanceof vpl.b) && 1.0E-4f <= f && f <= 0.9999f) {
                        int iBlendARGB = ColorUtils.blendARGB(((vpl.b) f4).f291273a, ((vpl.b) f5).f291273a, f);
                        KProperty[] kPropertyArr = IdentityDocumentsScreen.f106741a0;
                        LegacyContentContainerFrameLayout legacyContentContainerFrameLayout = identityDocumentsScreen.k3().f115663b;
                        BasicNavBar carouselWithSheetNavBar = identityDocumentsScreen.k3().e;
                        Intrinsics.checkNotNullExpressionValue(carouselWithSheetNavBar, "carouselWithSheetNavBar");
                        legacyContentContainerFrameLayout.a(iBlendARGB, carouselWithSheetNavBar);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        this.f209596b.onNext(this.f209595a.a(i));
    }
}
