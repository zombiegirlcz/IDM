package wnc;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.data.model.Data;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreen;
import com.revolut.feature.wealth.models.robo.Template;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TemplatesScreen f298785a;

    public f(TemplatesScreen templatesScreen) {
        this.f298785a = templatesScreen;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        l lVar;
        List listA;
        Template template;
        TemplatesScreen templatesScreen = this.f298785a;
        if (templatesScreen.f85208b0 == null) {
            g0 g0Var = (g0) templatesScreen.T2();
            Data data = ((m) g0Var.t2()).f298806b;
            l lVar2 = data != null ? (l) data.getContent() : null;
            Data data2 = ((m) g0Var.t2()).f298805a;
            ilc.a aVar = data2 != null ? (ilc.a) data2.getContent() : null;
            if (lVar2 == null || aVar == null) {
                return;
            }
            g0Var.A.getClass();
            int i2 = a0.f298776a[ync.h.a(aVar, lVar2).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            Data data3 = ((m) g0Var.t2()).f298806b;
            if (data3 == null || (lVar = (l) data3.getContent()) == null || (listA = lVar.a()) == null || (template = (Template) zhm.d0.e0(i, listA)) == null) {
                return;
            }
            j2 j2Var = g0Var.B;
            j2Var.getClass();
            j2Var.g(null, template);
        }
    }
}
