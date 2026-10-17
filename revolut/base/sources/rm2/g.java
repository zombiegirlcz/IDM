package rm2;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogController;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f255184a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackgroundCatalogController f255185b;

    public g(BackgroundCatalogController backgroundCatalogController) {
        this.f255185b = backgroundCatalogController;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        int i2 = this.f255184a;
        if (i2 == -1 || i2 == i) {
            this.f255184a = -1;
            com.revolut.feature.backgroundpicker.impl.flow.catalogue.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) this.f255185b.d();
            bVar.H2(bVar.v, new l2c.l(i, 15));
        }
    }
}
