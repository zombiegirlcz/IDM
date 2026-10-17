package zrd;

import amd.a0;
import amd.b0;
import amd.c0;
import amd.d0;
import amd.e0;
import amd.f0;
import amd.g0;
import amd.h0;
import amd.i0;
import amd.j0;
import amd.k0;
import amd.l0;
import amd.z;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.add.new_product.api.declaration.AddNewProductDestination;
import com.revolut.feature.cashback.api.navigation.YourCashbackFeatureConfig;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.credit.api.navigation.CreditCardHomeFeatureConfig;
import com.revolut.feature.credit.api.navigation.GetCreditDestination;
import com.revolut.feature.credit.api.navigation.LoanHomeFeatureConfig;
import com.revolut.feature.credit.api.navigation.PayLaterHomeFeatureConfig;
import com.revolut.feature.external_accounts.api.model.LinkedAccountPayload;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$Destination;
import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$InputData;
import com.revolut.feature.revolut_x_promo.api.navigation.destinations.RevolutXPromoDestination;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import grl.r2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends gim.i implements Function2 {
    public com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a f324706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l0 f324707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f324708y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar, l0 l0Var, RowDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.f324706w = aVar;
        this.f324707x = l0Var;
        this.f324708y = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.f324706w, this.f324707x, this.f324708y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar;
        Object objI;
        Object bridgeDestination;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            aVar = this.f324706w;
            frd.i iVar = aVar.f88021p;
            String str = this.f324708y.f53228a;
            this.u = aVar;
            this.v = 1;
            iVar.getClass();
            q78.e eVar = iVar.k;
            if (Intrinsics.f(str, "ROBO_ONBOARDING_ITEM_ID")) {
                objI = iVar.k(this);
            } else {
                l0 l0Var = this.f324707x;
                if (l0Var instanceof a0) {
                    objI = frd.i.d(AccountId.Personal.f51414a, ((a0) l0Var).f6307a);
                } else if (l0Var instanceof amd.v) {
                    amd.v vVar = (amd.v) l0Var;
                    objI = u68.b.c(eVar, vVar.f6350a, vVar.f6351b, null, this, 12);
                } else if (l0Var instanceof amd.u) {
                    amd.u uVar = (amd.u) l0Var;
                    objI = frd.i.d(uVar.f6349b, uVar.f6348a);
                } else if (l0Var instanceof g0) {
                    objI = frd.i.j(new ProductAccountId(((g0) l0Var).f6327a, null), ProductId.SAVINGS);
                } else if (l0Var instanceof amd.l) {
                    objI = new BridgeDestination(new FeatureCommand(new YourCashbackFeatureConfig.PlanCashbackDetails(((amd.l) l0Var).f6337a)));
                } else if (l0Var instanceof b0) {
                    objI = frd.i.j(new ProductAccountId(((b0) l0Var).f6308a.f163145a, null), ProductId.PRO);
                } else if (l0Var instanceof i0) {
                    Subaccount subaccount = ((i0) l0Var).f6331a;
                    objI = frd.i.j(new ProductAccountId(subaccount.getF88959a().f234881a, com.revolut.feature.subaccount.api.models.a.b(subaccount.c())), ProductId.SUBACCOUNT);
                } else {
                    if (l0Var instanceof amd.m) {
                        bridgeDestination = new CfdTradingFeatureConfig.HomeScreen.Destination(((amd.m) l0Var).f6338a);
                    } else if (l0Var instanceof amd.n) {
                        objI = u0.c(((c3b.a) iVar.f).b(new FinishCommand(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7)));
                    } else if (l0Var instanceof j0) {
                        objI = iVar.l(this);
                    } else {
                        boolean z = l0Var instanceof f0;
                        NetWorthAccount.Personal personal = NetWorthAccount.Personal.f87455a;
                        if (z || (l0Var instanceof amd.o) || (l0Var instanceof h0) || (l0Var instanceof k0)) {
                            objI = iVar.i(personal);
                        } else if (l0Var instanceof amd.q) {
                            objI = new BridgeDestination(new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(((amd.q) l0Var).f6342a, null, null, null, 62)));
                        } else if (l0Var instanceof amd.t) {
                            objI = RevolutXPromoDestination.f84265a;
                        } else if (l0Var instanceof e0) {
                            e0 e0Var = (e0) l0Var;
                            objI = new RevolutXFiatBalancesDetailsController$Destination(new RevolutXFiatBalancesDetailsController$InputData(e0Var.f6316a, new RevolutXFiatBalancesDetailsController$InputData.Stats(e0Var.f6317b, e0Var.f6318c, e0Var.d, e0Var.e)));
                        } else if (l0Var instanceof d0) {
                            objI = frd.i.j(new ProductAccountId(((d0) l0Var).f6315a, ExtendedSubaccountType.RevPoints.INSTANCE), ProductId.SUBACCOUNT);
                        } else if (l0Var instanceof amd.p) {
                            bridgeDestination = new BridgeDestination(new FeatureCommand(new CreditCardHomeFeatureConfig(((amd.p) l0Var).f6341a)));
                        } else if (l0Var instanceof z) {
                            bridgeDestination = new BridgeDestination(new FeatureCommand(new PayLaterHomeFeatureConfig(((z) l0Var).f6357b)));
                        } else if (l0Var instanceof amd.y) {
                            bridgeDestination = new BridgeDestination(new FeatureCommand(new LoanHomeFeatureConfig(((amd.y) l0Var).f6355a)));
                        } else {
                            String str2 = null;
                            if (l0Var instanceof amd.x) {
                                amd.x xVar = (amd.x) l0Var;
                                io3.d dVar = xVar.f6353a;
                                ExternalInstitution externalInstitution = xVar.f6354b;
                                ProductId productId = ProductId.LINKED;
                                String str3 = dVar.f163145a;
                                String str4 = dVar.o;
                                if (str4 == null) {
                                    str4 = externalInstitution != null ? externalInstitution.f66107a : null;
                                }
                                String str5 = dVar.f163154p;
                                if (str5 != null) {
                                    str2 = str5;
                                } else if (externalInstitution != null) {
                                    str2 = externalInstitution.f66108b;
                                }
                                objI = frd.i.j(new ProductAccountId(str3, new LinkedAccountPayload(str4, str2, null, false)), productId);
                            } else {
                                if (l0Var instanceof amd.s) {
                                    throw new IllegalStateException("ExistingProduct navigation should be handled inline");
                                }
                                if (l0Var instanceof c0) {
                                    c0 c0Var = (c0) l0Var;
                                    amd.b bVar = c0Var.f6310a;
                                    NetWorthAccount netWorthAccount = c0Var.f6311b;
                                    switch (frd.a.f137455a[bVar.ordinal()]) {
                                        case 1:
                                            objI = new AddNewProductDestination((qf1.c) null, 3);
                                            break;
                                        case 2:
                                            if (netWorthAccount instanceof NetWorthAccount.Junior) {
                                                objI = iVar.c(((NetWorthAccount.Junior) netWorthAccount).f87454a, this);
                                            } else {
                                                if (!Intrinsics.f(netWorthAccount, personal)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                objI = ((hob.d) iVar.f137467c).e();
                                            }
                                            break;
                                        case 3:
                                            objI = iVar.i(netWorthAccount);
                                            break;
                                        case 4:
                                            objI = new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6))));
                                            break;
                                        case 5:
                                            objI = new GetCreditDestination(r2.TOTAL_WEALTH);
                                            break;
                                        case 6:
                                            objI = new BridgeDestination(frd.i.a(new ft3.g(null, null, 3)));
                                            break;
                                        case 7:
                                            objI = new BridgeDestination(frd.i.a(ft3.d.INSTANCE));
                                            break;
                                        case 8:
                                            objI = iVar.d.d(this);
                                            break;
                                        case 9:
                                        case 10:
                                        case 11:
                                            objI = iVar.g(this);
                                            break;
                                        case 12:
                                            objI = iVar.h(netWorthAccount, this);
                                            break;
                                        case 13:
                                            throw new IllegalStateException("OTHER_ASSETS promo action should be handled via events");
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    if (l0Var instanceof amd.r) {
                                        throw new IllegalStateException("CustomAsset navigation should be handled via events");
                                    }
                                    if (!(l0Var instanceof amd.w)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    objI = u68.b.c(eVar, ((amd.w) l0Var).f6352a, null, null, this, 12);
                                }
                            }
                        }
                    }
                    objI = bridgeDestination;
                }
            }
            if (objI == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar3 = this.u;
            yhm.o.b(obj2);
            aVar = aVar3;
            objI = obj2;
        }
        return aVar.C1((aii.u) objI);
    }
}
