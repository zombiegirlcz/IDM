package xdi;

import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature_rev_points_pocket_api.R$string;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketBenefit;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RevPointsPocketOnboardingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RevPointsPocketOnboardingScreen revPointsPocketOnboardingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = revPointsPocketOnboardingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        RevPointsPocketOnboardingScreen revPointsPocketOnboardingScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) revPointsPocketOnboardingScreen.d();
                uVar.getClass();
                uVar.l2(new s(i2, continuation, uVar), new yi5.b(26));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) revPointsPocketOnboardingScreen.d()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar2 = (u) revPointsPocketOnboardingScreen.d();
                y yVar = uVar2.f304477y;
                RevPointsPocketDestination.Onboarding.Mode mode = uVar2.o.f97826a;
                if (Intrinsics.f(mode, RevPointsPocketDestination.Onboarding.Mode.Boost.f97800a)) {
                    j2 j2Var = (j2) yVar.f22677a;
                    j2 j2Var2 = (j2) yVar.f22677a;
                    RevPointsPocketInfo pointsPocketInfo = com.revolut.feature_rev_points_pocket_api.model.a.a((RevPointsPocketState) zi0.c.I(((g) j2Var.getValue()).f304452b));
                    if (pointsPocketInfo != null) {
                        dj0.d dVar = pointsPocketInfo.e;
                        List list = (List) zi0.c.I(((g) j2Var2.getValue()).f304451a);
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                i2 = -1;
                            } else if (((RevPointsPocketBenefit) it8.next()).f97781c.compareTo(dVar) <= 0) {
                                i2++;
                            }
                        }
                        if (i2 != -1) {
                            RevPointsPocketBenefit selectedBenefit = (RevPointsPocketBenefit) list.get(i2 + ((g) j2Var2.getValue()).f304453c);
                            if (dVar.f(dj0.d.e)) {
                                j60.a aVar4 = uVar2.v;
                                uVar2.u.getClass();
                                Intrinsics.checkNotNullParameter(selectedBenefit, "selectedBenefit");
                                Intrinsics.checkNotNullParameter(pointsPocketInfo, "pointsPocketInfo");
                                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.rev_points_pocket_transfer_description_reward, null, null, 14), new TextLocalisedClause(R$string.rev_points_pocket_benefits_breakdown_subtitle, null, null, 14), null, 28);
                                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_points_pocket_transfer_description_reward, null, null, 14);
                                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.rev_points_pocket_transfer_description_reward_value, zhm.u.c(new NumberClause(selectedBenefit.f97780b.b(), NumberClause.Format.Default.f57900a, null, null, 12)), null, 12);
                                com.revolut.core.ui_kit.delegates.j2 j2Var3 = com.revolut.core.ui_kit.delegates.j2.H6;
                                CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("UPGRADE_BREAKDOWN_REWARD_ITEM_ID", textLocalisedClause, textLocalisedClause2, 0, null, null, j2Var3, null, null, false, 0, 0, 32696);
                                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                                List listC = zhm.u.c(model);
                                List listK = zhm.v.k(new CellDetailsDelegate.Model("UPGRADE_BREAKDOWN_MINIMUM_BALANCE_ITEM_ID", new TextLocalisedClause(R$string.rev_points_pocket_benefit_breakdown_cells_min_balance, null, null, 14), new MoneyClause(selectedBenefit.f97781c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("UPGRADE_BREAKDOWN_YOUR_BREAKDOWN_ITEM_ID", new TextLocalisedClause(R$string.rev_points_pocket_benefit_breakdown_cells_your_balance, null, null, 14), new MoneyClause(pointsPocketInfo.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("UPGRADE_BREAKDOWN_AMOUNT_TO_ADD_ITEM_ID", new TextLocalisedClause(R$string.rev_points_pocket_benefit_breakdown_cells_amount, null, null, 14), new MoneyClause(pyd.c.H(selectedBenefit.f97781c, dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, j2Var3, null, null, false, 0, 0, 32696));
                                yp0.b.k(listK, 0, 0, 0, 0, 31);
                                ArrayList arrayListE0 = d0.E0(listK, listC);
                                LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("UPGRADE_BREAKDOWN_ADD_MONEY_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.rev_points_pocket_benefit_breakdown_button, null, null, 14), false, null, null, new zdi.b(selectedBenefit, pointsPocketInfo), null, 744);
                                yp0.b.r(model2, 0, 0, 0, 0, 15);
                                aVar4.x(new rp0.y(d0.F0(model2, arrayListE0), tVar, rp0.l.WINDOW, null, null, null, 1016));
                            } else {
                                uVar2.C2(new i(selectedBenefit, pointsPocketInfo));
                            }
                        }
                    }
                } else {
                    if (!(mode instanceof RevPointsPocketDestination.Onboarding.Mode.OptIn)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uVar2.l2(new s(3, continuation, uVar2), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
