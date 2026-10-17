package qxg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.analytics.R$string;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f250092b;

    public /* synthetic */ d(g gVar, int i) {
        this.f250091a = i;
        this.f250092b = gVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f250091a) {
            case 0:
                List performanceAssets = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(performanceAssets, "performanceAssets");
                ArrayList arrayListA = this.f250092b.a(performanceAssets, true, true);
                yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                return arrayListA;
            default:
                List performanceAssets2 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(performanceAssets2, "performanceAssets");
                if (performanceAssets2.isEmpty()) {
                    return u.c(new FullScreenStateDelegate.Model("complex-analytics-performance-contributor-empty", new TextLocalisedClause(R$string.wealth_analytics_widgetised_performance_empty_title, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_widgetised_performance_empty_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_coins, null, null, 6)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736));
                }
                return this.f250092b.a(d0.P0(performanceAssets2, new f()), false, false);
        }
    }
}
