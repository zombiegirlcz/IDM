package d8f;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.ManagedPortfolioSelectTemplateScreen;
import com.revolut.feature.wealth.models.robo.Template;
import java.util.List;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ManagedPortfolioSelectTemplateScreen f112236a;

    public d(ManagedPortfolioSelectTemplateScreen managedPortfolioSelectTemplateScreen) {
        this.f112236a = managedPortfolioSelectTemplateScreen;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        h hVar;
        List listA;
        Template template;
        String str;
        com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b bVar = (com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) this.f112236a.d();
        cli.y yVar = bVar.v;
        if (((i) ((j2) yVar.f22677a).getValue()).f112247c != o.MULTIPLE_TABS || (hVar = ((i) ((j2) yVar.f22677a).getValue()).d) == null || (listA = hVar.a()) == null || (template = (Template) d0.e0(i, listA)) == null || (str = template.f95706a) == null) {
            return;
        }
        bVar.H2(yVar, new d7a.p(str, 1));
    }
}
