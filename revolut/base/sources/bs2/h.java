package bs2;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blocked_merchants.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.v5;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (!(domainState instanceof b)) {
            if (!(domainState instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar = (c) domainState;
            String str = cVar.f18026a;
            if (cVar.f18027b) {
                return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.merchants_block_disallowed_fallback_dialog_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.merchants_block_disallowed_fallback_dialog_kid_title, null, null, 14), new TextLocalisedClause(R$string.merchants_block_disallowed_fallback_dialog_kid_message, null, null, 14), null, null, false, 28));
            }
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.merchants_block_disallowed_fallback_dialog_title, u.c(str), null, 12), null, null, null, false, 30);
            List listC = u.c(new PlainTextDelegate.Model("BLOCK_DISALLOWED_MESSAGE", (Clause) null, (Clause) new TextLocalisedClause(R$string.merchants_block_disallowed_fallback_dialog_message, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.merchants_block_disallowed_fallback_dialog_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listC, aVar);
        }
        kr2.c cVar2 = ((b) domainState).f18025a;
        TextClause textClause = new TextClause(cVar2.f188639a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = cVar2.f188640b;
        lw0.a aVar2 = new lw0.a(textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
        ArrayList arrayList = cVar2.f188641c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            kr2.b bVar = (kr2.b) obj2;
            arrayList2.add(new RowDelegate.Model(a0.d.n("CONTENT_ITEM_", i), new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(bVar.f188637a, Integer.valueOf(R$attr.uikit_colorWidgetBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 8), false, false, 6), new TextClause(bVar.f188638b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        List listK = v.k(new TextClause(cVar2.d.f188635a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_24_link_external, ImageClauseTint.TextColor.f57790a, (Float) null, (Float) null, 28));
        m70.a.t(t0.f186434a);
        return new cii.b(new aw0.e(false, null, null, new n6(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), arrayList2, aVar2);
    }
}
