package u82;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.f3;
import mx0.h3;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w82.b f278096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yof.d f278097b;

    public n(w82.b amountItemsMapper, yof.d transferAmountMapper) {
        Intrinsics.checkNotNullParameter(amountItemsMapper, "amountItemsMapper");
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        this.f278096a = amountItemsMapper;
        this.f278097b = transferAmountMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listC;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        t82.a withdrawalData = domainState.f278079a;
        e extraData = domainState.f278080b;
        if (withdrawalData == null) {
            listC = ((ppf.c) this.f278097b).f();
        } else {
            long j2 = withdrawalData.f268799b;
            int i = domainState.f278081c;
            Intrinsics.checkNotNullParameter(withdrawalData, "withdrawalData");
            Intrinsics.checkNotNullParameter(extraData, "extraData");
            xi0.b bVar = w62.a.f295373a;
            dj0.d dVar = new dj0.d(j2, bVar);
            h02.g gVar = withdrawalData.f268798a;
            w82.b bVar2 = this.f278096a;
            String strD = bVar2.f295576c.d(j2, bVar.f306286a);
            String string = u80.o.b(new u80.g(dVar, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
            List list = ((ppf.c) bVar2.f295574a).f238600b;
            ldd.b bVar3 = bVar2.d;
            boolean zA = bVar3.a("ITEM_AMOUNT_INPUT_ID");
            bw0.h hVar = new bw0.h(strD, string, (TextClause) null, true, list, Boolean.valueOf(zA), extraData.f278083b, false, false, bVar3.c(i, "ITEM_AMOUNT_INPUT_ID"), false, (bw0.e) null, (Clause) null, false, 32132);
            PaymentPocketInfo paymentPocketInfoF = ((yt9.g) bVar2.f295575b).f(withdrawalData.f268800c, withdrawalData.d);
            hrf.h hVar2 = extraData.f278082a;
            boolean zA2 = hVar2.a();
            yqi.b bVar4 = hVar2.f154819c;
            f3 f3Var = new f3(paymentPocketInfoF.f79169a, paymentPocketInfoF.f79170b, paymentPocketInfoF.f79171c, false, zA2 ? h3.ERROR : h3.ACTIVE, false);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.multibanco_withdrawal_amount_limit, v.k(new TextClause(String.valueOf(gVar.d), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(gVar.f148189b, new MoneyClause.Format.Shorts(false, 63), null, null, 12)), null, 12);
            bw0.l lVar = (j2 == 0 || bVar4 == null) ? bw0.l.INFO : bw0.l.ERROR;
            listC = u.c(new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, hVar, f3Var, new bw0.m(textLocalisedClause, lVar, lVar == bw0.l.ERROR ? new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, false, null), null, null, false, false, new yof.b(bVar, bVar4), null, 1506));
        }
        return new f(listC, extraData.f278082a.b());
    }
}
