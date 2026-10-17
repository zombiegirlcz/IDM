package fe4;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wy3.p;
import wy3.q;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        q qVar = domainState.f134434a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_mortgage_offer_benchmark_interest_rate_title, u.c(new TextClause(qVar.f301089a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        String str = qVar.f301090b;
        lw0.a aVar = new lw0.a(textLocalisedClause, str != null ? new TextLocalisedClause(R$string.credit_application_mortgage_offer_benchmark_interest_rate_description, prk.o.v(0, 30, null, null, str), null, 12) : null, null, null, false, 28);
        List<p> list = qVar.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (p pVar : list) {
            String str2 = pVar.f301086a;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_mortgage_offer_benchmark_interest_rate_item_title, u.c(new TextClause(pVar.f301087b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_mortgage_offer_benchmark_interest_rate_item_description, u.c(new HtmlClause(0, 30, (Integer) null, (Object) null, pVar.f301088c)), null, 12);
            boolean z = pVar.e;
            arrayList.add(new RowDelegate.Model(str2, null, textLocalisedClause2, null, 0, textLocalisedClause3, null, null, 0, z ? new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246))) : null, true, null, z, null, null, null, null, null, null, pVar, null, 0, 0, 0, 0, 532665306));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        String str3 = qVar.f301091c;
        return new cii.b(new aw0.e(false, str3 != null ? new TextLocalisedClause(R$string.credit_application_mortgage_offer_benchmark_interest_rate_disclaimer, u.c(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.credit_application_mortgage_offer_benchmark_interest_rate_button, u.c(new TextClause(qVar.a().d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 53), arrayList, aVar);
    }
}
