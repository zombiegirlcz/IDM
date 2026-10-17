package nbe;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import dce.k0;
import fva.h;
import ip0.z;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import n87.r;
import n8i.q0;
import org.jetbrains.annotations.NotNull;
import qua.p;
import qua.u;
import vz1.g;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends abe.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f214076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9e.b f214077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f214078c;

    public d(g apmPaymentsAuthorisationsRepository, a9e.b commonSubscriptionMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f214076a = apmPaymentsAuthorisationsRepository;
        this.f214077b = commonSubscriptionMapper;
        this.f214078c = dateProvider;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        List listK;
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = model.f214072a;
        boolean zA = u.A(pVar);
        a9e.b bVar = this.f214077b;
        if (zA || u.h(pVar, ((f) this.f214078c).k())) {
            i9e.f fVar = (i9e.f) bVar;
            listK = v.k(fVar.m(), fVar.i());
        } else {
            listK = f0.f322471a;
        }
        return ((i9e.f) bVar).c(listK);
    }

    @Override // abe.a
    public final List b(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        return (List) iii.c.f(model.f214074c, new q0(14), new r(15), new m88.c(this, model, 26));
    }

    @Override // abe.a
    public final efm.r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        efm.r map = rd0.e.c(this.f214076a.b(subscriptionContent.f150886a.f150883a.f249314a.f160150a), kotlin.coroutines.g.f186406a).map(new nae.a(new k0(subscriptionContent, 1), 13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // abe.a
    public final efm.r d(hce.c subscriptionContent) {
        Clause clause;
        TextLocalisedClause textLocalisedClause;
        Clause clause2;
        String str;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVarC = zae.c.c(subscriptionContent);
        h hVar = pVarC.E;
        ibd.f fVar = pVarC.f249316b;
        fva.c cVar = hVar != null ? hVar.f138397a : null;
        boolean z = fVar == ibd.f.ACTIVE;
        Long l2 = pVarC.f249323j;
        if (l2 == null || l2.longValue() <= 0) {
            l2 = null;
        }
        a9e.b bVar = this.f214077b;
        MoneyClause moneyClauseU = l2 != null ? ((i9e.f) bVar).u(zae.c.b(subscriptionContent), z) : null;
        String str2 = pVarC.k;
        if (str2 == null) {
            str2 = "";
        }
        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.mandate_details_subscription_payment_giro_title, null, null, 14);
        if (moneyClauseU == null) {
            textLocalisedClause = null;
            clause2 = textLocalisedClause2;
            clause = textClause;
        } else {
            clause = moneyClauseU;
            textLocalisedClause = textLocalisedClause2;
            clause2 = textClause;
        }
        int i = c.f214075a[fVar.ordinal()];
        b9e.a aVar = i != 1 ? i != 2 ? null : b9e.a.CANCELLED : b9e.a.ACTIVE;
        efm.r rVarJust = efm.r.just(new hce.a(clause, clause2, textLocalisedClause, (cVar == null || (str = cVar.d) == null) ? new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, pVarC.k, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063) : new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), aVar != null ? ((i9e.f) bVar).f(aVar) : null, (Serializable) null, 96));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
