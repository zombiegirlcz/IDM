package yh7;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.s3;
import com.revolut.core.ui_kit.delegates.widgets.t3;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f313877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f313878b;

    public i(j jVar, String str, dsh.e eVar) {
        this.f313877a = jVar;
        this.f313878b = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        e state = (e) obj2;
        ((Boolean) obj3).getClass();
        j jVar = this.f313877a;
        b bVar = jVar.f313880h;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof c) {
            return bVar.d(this.f313878b, jVar.i, ((c) state).f313870a);
        }
        if (!Intrinsics.f(state, d.f313871a)) {
            throw new NoWhenBranchMatchedException();
        }
        bVar.getClass();
        String listId = this.f313878b;
        Intrinsics.checkNotNullParameter(listId, "id");
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause header = new TextLocalisedClause(R$string.wealth_invest_widget_recommended_buys_header_title, null, null, 14);
        s3 locked = new s3(new TextLocalisedClause(R$string.invest_recommended_buys_widget_locked_title, null, null, 14), new TextLocalisedClause(R$string.invest_recommended_buys_widget_locked_title, null, null, 14));
        TextClause textClause = new TextClause("Long title", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause("Very long description", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        RowDelegate.Model.c.b bVar2 = new RowDelegate.Model.c.b(new TextClause("Value 1", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), xqi.a.c(new BigDecimal("0.5"), false, false, false, false, false, CertificateBody.profileType), null, false, 124);
        LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
        List items = v.k(new RowDelegate.Model("item0", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.a(companion2, R$drawable.uikit_icn_24_logo_revolut, new Color.Solid(R$attr.uikit_colorGreen), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorBlack), 0.05f), 4.0f, null, 48), null, null, false, null, false, 60), textClause, null, 0, textClause2, null, null, 0, bVar2, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848), new RowDelegate.Model("item1", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.a(companion2, R$drawable.uikit_icn_24_logo_revolut, new Color.Solid(R$attr.uikit_colorRed), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorBlack), 0.05f), 4.0f, null, 48), null, null, false, null, false, 60), new TextClause("Long title", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause("Very long description", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new RowDelegate.Model.c.b(new TextClause("Value 2", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), xqi.a.c(new BigDecimal("-0.5"), false, false, false, false, false, CertificateBody.profileType), null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
        companion.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(locked, "locked");
        Intrinsics.checkNotNullParameter(items, "items");
        t3 subtitleMode = t3.f55514a;
        Intrinsics.checkNotNullParameter(subtitleMode, "subtitleMode");
        if (items.isEmpty()) {
            throw new IllegalArgumentException("empty list cannot be passed for the locked state");
        }
        q qVar = q.DYNAMIC;
        aim.e eVarB = u.b();
        eVarB.add(new BaseDynamicWidgetDelegate.BigHeaderModel("header", header, null, true, null, 48));
        eVarB.addAll(RowsWidgetDelegate.Model.Companion.i(companion, d0.V0(items, 10), qVar, subtitleMode));
        return new RowsWidgetDelegate.Model(listId, u.a(eVarB), false, qVar, null, new py0.c(header), true, null, locked, 256);
    }
}
