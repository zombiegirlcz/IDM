package rd3;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.api.models.CashbackByCurrencies;
import com.revolut.feature.cashback.impl.R$string;
import ip0.y10;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import od3.v0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f253325b;

    public /* synthetic */ h(j jVar, int i) {
        this.f253324a = i;
        this.f253325b = jVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        int i = this.f253324a;
        sa saVar = null;
        j jVar = this.f253325b;
        switch (i) {
            case 0:
                yhm.r rVar = (yhm.r) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                dj0.d dVar = (dj0.d) rVar.f314201a;
                hha.d dVar2 = (hha.d) rVar.f314202b;
                List listK = zhm.v.k(new CellDetailsNoteDelegate.Model("ID_CASHBACK_RATE", new TextLocalisedClause(R$string.cashback_product_plan_cashback_rate_title, null, null, 14), null, fgk.b.b(jVar.f253326c, dVar2), null, false, null, null, null, null, null, 0, 131060), new CellDetailsDelegate.Model("ID_CASHBACK_RATE_TOTAL", new TextLocalisedClause(R$string.cashback_product_plan_cashback_rate_total, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), R$drawable.uikit_icn_16_info_outline, new v0(dVar, dVar2, (CashbackByCurrencies) rVar.f314203c, false, false), null, null, null, null, false, 0, 0, 32736));
                yp0.b.k(listK, R$attr.uikit_dp16, 0, 0, 0, 30);
                return listK;
            case 1:
                uc3.c cashbackLimit = (uc3.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(cashbackLimit, "cashbackLimit");
                jVar.e.getClass();
                return od3.b.a(cashbackLimit);
            case 2:
                hha.d plan = (hha.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(plan, "plan");
                return fgk.b.b(jVar.f253326c, plan);
            case 3:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                hha.d dVar3 = (hha.d) pair.f186385a;
                if (((Boolean) pair.f186386b).booleanValue()) {
                    Clause clauseA = fgk.b.a(jVar.f253326c, dVar3);
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cashback_product_plan_upgrade_title, zhm.u.c(clauseA), null, 12);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cashback_product_plan_upgrade_text, zhm.v.k(clauseA, clauseA), null, 12);
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.cashback_product_plan_action_upgrade, null, null, 14);
                    ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_arrow_upgrade, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    hha.u.Companion.getClass();
                    sa saVar2 = new sa("ID_PRODUCT_NOT_AVAILABLE", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, zhm.u.c(new ActionsView.Item("ID_ACTION_UPGRADE", null, false, null, null, textLocalisedClause3, resourceImage2, null, null, null, false, null, null, hha.u.v, null, 24478)), false, (Image) resourceImage, (y10) null, (Object) null, 4032);
                    yp0.b.l(saVar2, 0, 0, 0, 0, null, false, 63);
                    saVar = saVar2;
                }
                return zhm.v.l(saVar);
            default:
                hha.d plan2 = (hha.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(plan2, "plan");
                return new TextLocalisedClause(R$string.cashback_product_plan_title, zhm.u.c(fgk.b.a(jVar.f253326c, plan2)), null, 12);
        }
    }
}
