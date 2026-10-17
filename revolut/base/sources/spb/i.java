package spb;

import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d3;
import com.revolut.core.ui_kit.delegates.widgets.e3;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i extends q implements Function1 {
    /* JADX WARN: Type inference failed for: r8v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        c p0 = (c) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((k) this.receiver).getClass();
        String str = p0.f264924a;
        LayeredImage layeredImage = p0.f264925b;
        dj0.d dVar = p0.d;
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
        int i = R$attr.uikit_colorBackground;
        return new QuickActionWidgetDelegate.Model(str, layeredImage, null, null, p0.f264926c, new d3(new e3(R$drawable.uikit_icn_24_plus, true), (dVar.f115082a <= 0 || !p0.e) ? null : new e3(R$drawable.uikit_icn_24_arrow_down, true), 4), new TagViewData(null, moneyClause, i, null, i, null, 968), p0.f, 268);
    }
}
