package j53;

import androidx.viewpager2.widget.ViewPager2;
import cli.y;
import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationController;
import e93.g0;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CustomisationImageGenerationController f171464a;

    public b(CustomisationImageGenerationController customisationImageGenerationController) {
        this.f171464a = customisationImageGenerationController;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        com.revolut.feature.card_personalisation.generation.impl.ui.generation.a aVar = (com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) this.f171464a.d();
        y yVar = aVar.f65320y;
        l lVar = (l) ((j2) yVar.f22677a).getValue();
        if (lVar instanceof k) {
            k kVar = (k) lVar;
            Object content = kVar.f171471b.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aVar.H2(yVar, new j4h.m(kVar, (String) ((g0) content).f123867c.get(i), 3));
        }
    }
}
