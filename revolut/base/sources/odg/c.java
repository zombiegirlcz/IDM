package odg;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.cashback.CashbackDetails;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import efm.d0;
import efm.r;
import ffk.t;
import gim.i;
import hha.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.CoroutineScope;
import rp0.l;
import rp0.y;
import yhm.o;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f224466w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224466w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f224466w, continuation, 0);
            default:
                return new c(this.f224466w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Object objB2;
        String str;
        Style style;
        int i;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                e eVar = this.f224466w;
                if (i2 == 0) {
                    o.b(obj2);
                    r rVarC3 = e.c3(eVar);
                    t tVar = eVar.f224468m;
                    d0 d0VarL = prk.o.l(mif.a.e(rVarC3, nim.a.w(tVar.q(), new o9h.b(eVar, 15)), tVar.o()), null, null, 3, "firstOrError(...)");
                    this.v = 1;
                    objB = nim.a.b(d0VarL, this);
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                yhm.r rVar = (yhm.r) objB;
                List list = (List) rVar.f314201a;
                vei.a aVar2 = (vei.a) rVar.f314202b;
                List list2 = (List) rVar.f314203c;
                if (list2.isEmpty() || ta6.a.w(list, aVar2)) {
                    j60.a.v(eVar.o, false, null, 3);
                } else {
                    j60.a.v(eVar.o, false, null, 3);
                    ArrayList arrayListL = ta6.a.l(list, list2);
                    if (arrayListL.size() == 1 && ((CashbackDetails) arrayListL.get(0)).f97896a == vei.a.ULTRA) {
                        u.Companion.getClass();
                        eVar.A2(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.UltraDashboard(u.U))));
                    } else {
                        u.Companion.getClass();
                        eVar.A2(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByFeature(u.U, xfa.b.STAYS_CASHBACK, null, false, 1020))));
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                int i5 = 3;
                int i6 = 1;
                e eVar2 = this.f224466w;
                if (i3 == 0) {
                    o.b(obj2);
                    r rVarC32 = e.c3(eVar2);
                    t tVar2 = eVar2.f224468m;
                    d0 d0VarL2 = prk.o.l(mif.a.e(rVarC32, nim.a.w(tVar2.q(), new o9h.b(eVar2, 15)), tVar2.o()), null, null, 3, "firstOrError(...)");
                    this.v = 1;
                    objB2 = nim.a.b(d0VarL2, this);
                    if (objB2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB2 = obj2;
                }
                yhm.r rVar2 = (yhm.r) objB2;
                List list3 = (List) rVar2.f314201a;
                vei.a aVar4 = (vei.a) rVar2.f314202b;
                List list4 = (List) rVar2.f314203c;
                eVar2.getClass();
                TextLocalisedClause textLocalisedClause3 = ta6.a.w(list3, aVar4) ? new TextLocalisedClause(R$string.hotels_cashback_dialog_highest_value, null, null, 14) : new TextLocalisedClause(R$string.hotels_cashback_bottom_dialog_subtitle, null, null, 14);
                j60.a aVar5 = eVar2.o;
                rp0.t tVar3 = new rp0.t(new TextLocalisedClause(R$string.hotels_cashback_dialog_details_title, null, null, 14), textLocalisedClause3, null, 28);
                l lVar = l.WINDOW;
                List listP0 = zhm.d0.P0(list3, new d());
                CashbackDetails cashbackDetailsK = ta6.a.k(listP0, aVar4);
                Iterable<CashbackDetails> iterableL = ta6.a.w(listP0, aVar4) ? v.l(cashbackDetailsK) : zhm.d0.E0(ta6.a.l(listP0, list4), v.l(cashbackDetailsK));
                ArrayList arrayList = new ArrayList(w.t(iterableL, 10));
                for (CashbackDetails cashbackDetails : iterableL) {
                    vei.a aVar6 = cashbackDetails.f97896a;
                    int[] iArr = b.f224465a;
                    int i21 = iArr[aVar6.ordinal()];
                    if (i21 == i6) {
                        str = "STANDARD";
                    } else if (i21 == 2) {
                        str = "PLUS";
                    } else if (i21 == i5) {
                        str = "PREMIUM";
                    } else if (i21 == 4) {
                        str = "METAL";
                    } else {
                        if (i21 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "ULTRA";
                    }
                    vei.a aVar7 = cashbackDetails.f97896a;
                    if (aVar4 == aVar7) {
                        style = null;
                        textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_cashback_your_plan, null, null, 14);
                        i = 3;
                    } else {
                        style = null;
                        int i22 = iArr[aVar7.ordinal()];
                        if (i22 == i6) {
                            i = 3;
                            textLocalisedClause = new TextLocalisedClause(R$string.hotels_cashback_standard, null, null, 14);
                        } else if (i22 != 2) {
                            i = 3;
                            if (i22 == 3) {
                                textLocalisedClause = new TextLocalisedClause(R$string.hotels_cashback_premium, null, null, 14);
                            } else if (i22 == 4) {
                                textLocalisedClause = new TextLocalisedClause(R$string.hotels_cashback_metal, null, null, 14);
                            } else {
                                if (i22 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                textLocalisedClause = new TextLocalisedClause(R$string.hotels_cashback_ultra, null, null, 14);
                            }
                        } else {
                            i = 3;
                            textLocalisedClause = new TextLocalisedClause(R$string.hotels_cashback_plus, null, null, 14);
                        }
                        textLocalisedClause2 = textLocalisedClause;
                    }
                    arrayList.add(new CellDetailsDelegate.Model(str, textLocalisedClause2, new TextLocalisedClause(R$string.hotels_cashback_amount, zhm.u.c(cashbackDetails.f97897b), style, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
                    i5 = i;
                    i6 = 1;
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                qv0.i[] iVarArr = (qv0.i[]) arrayList.toArray(new qv0.i[0]);
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("VIEW_UPGRADE_OPTIONS_ITEM_ID", LargeActionButton.ButtonStyle.f58725a, null, ta6.a.w(listP0, aVar4) ? new TextLocalisedClause(R$string.hotels_common_action_got_it, null, null, 14) : new TextLocalisedClause(R$string.hotels_common_action_view_plans, null, null, 14), false, null, null, null, null, 1000);
                yp0.b.r(model, 0, 0, 0, 0, 15);
                s0 s0Var = new s0(2);
                s0Var.b(iVarArr);
                s0Var.a(model);
                ArrayList arrayList2 = s0Var.f186433a;
                aVar5.x(new y(v.k(arrayList2.toArray(new qv0.i[arrayList2.size()])), tVar3, lVar, new Integer(0), null, null, 1000));
                return Unit.f186387a;
        }
    }
}
