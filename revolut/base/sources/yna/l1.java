package yna;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.gb;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import e60.l;
import ima.a;
import ip0.um0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProfileScreen f315359w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(ProfileScreen profileScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f315359w = profileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l1 l1Var = new l1(this.f315359w, continuation, 0);
                l1Var.v = obj2;
                return l1Var;
            case 1:
                l1 l1Var2 = new l1(this.f315359w, continuation, 1);
                l1Var2.v = obj2;
                return l1Var2;
            case 2:
                l1 l1Var3 = new l1(this.f315359w, continuation, 2);
                l1Var3.v = obj2;
                return l1Var3;
            case 3:
                l1 l1Var4 = new l1(this.f315359w, continuation, 3);
                l1Var4.v = obj2;
                return l1Var4;
            case 4:
                l1 l1Var5 = new l1(this.f315359w, continuation, 4);
                l1Var5.v = obj2;
                return l1Var5;
            default:
                l1 l1Var6 = new l1(this.f315359w, continuation, 5);
                l1Var6.v = obj2;
                return l1Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((l1) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 2;
        int i3 = 0;
        Continuation continuation = null;
        ProfileScreen profileScreen = this.f315359w;
        switch (i) {
            case 0:
                e60.l lVar = (e60.l) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (lVar instanceof e60.m) {
                    c0 c0VarT2 = profileScreen.T2();
                    String imagePath = ((e60.m) lVar).b().getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(imagePath, "getAbsolutePath(...)");
                    c1 c1Var = (c1) c0VarT2;
                    c1Var.getClass();
                    Intrinsics.checkNotNullParameter(imagePath, "imagePath");
                    c1Var.l2(new j0(c1Var, imagePath, continuation, i2), new yi5.b(26));
                } else if (lVar instanceof l.a) {
                    c1 c1Var2 = (c1) profileScreen.T2();
                    c1Var2.l2(new yg6.v(c1Var2, c1Var2.z.e(), null, 11), new yi5.b(26));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Unsupported result: ".concat(lVar.getClass().getSimpleName()));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            case 1:
                String itemId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0 c0VarT22 = profileScreen.T2();
                Intrinsics.h(itemId);
                c1 c1Var3 = (c1) c0VarT22;
                c1Var3.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("UPGRADE_LIST_ID")) {
                    ima.a aVar3 = (ima.a) ((a) c1Var3.t2()).f315277g.getContent();
                    if ((aVar3 instanceof a.C0929a ? (a.C0929a) aVar3 : null) == null) {
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "ProfileMainScreenModel", "Upgrade is unavailable. Check if the DomainState is updated correctly.", null, h0Var2);
                    } else {
                        c1Var3.C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.PROFILE_UPGRADE, new PlanChangeSuccessActionStrategy.CardOrderIfNeeded(c1Var3.M.d()), 6))));
                    }
                }
                break;
            case 2:
                gb clickData = (gb) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0 c0VarT23 = profileScreen.T2();
                Intrinsics.h(clickData);
                c1 c1Var4 = (c1) c0VarT23;
                c1Var4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ActionsView.Item item = clickData.f54217b;
                String str = item.f58316a;
                Object obj3 = item.f58324n;
                switch (str.hashCode()) {
                    case -1895172828:
                        if (str.equals("ID_ASFT")) {
                            c1Var4.l2(new v0(c1Var4, null, 0), new yi5.b(26));
                        }
                        break;
                    case -1895053578:
                        if (str.equals("ID_ESIM")) {
                            c1Var4.l2(new v0(c1Var4, null, 2), new yi5.b(26));
                        }
                        break;
                    case -1894732851:
                        if (str.equals("ID_PLAN")) {
                            c1Var4.G2();
                        }
                        break;
                    case -676779211:
                        if (str.equals("ID_LOUNGES")) {
                            c1Var4.l2(new v0(c1Var4, null, 3), new yi5.b(26));
                        }
                        break;
                    case 1252809708:
                        if (str.equals("ID_NUDGE_SECONDARY")) {
                            oga.e eVar = obj3 instanceof oga.e ? (oga.e) obj3 : null;
                            if (eVar != null) {
                                c1Var4.l2(new j0(c1Var4, eVar.f225066b, continuation, i3), new yi5.b(26));
                            }
                        }
                        break;
                    case 1391247575:
                        if (str.equals("ID_NUDGE")) {
                            oga.e eVar2 = obj3 instanceof oga.e ? (oga.e) obj3 : null;
                            if (eVar2 != null) {
                                c1Var4.l2(new j0(c1Var4, eVar2.f225066b, continuation, i3), new yi5.b(26));
                            }
                        }
                        break;
                }
                break;
            case 3:
                String str2 = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(str2, "ID_FOOTER_APP_VERSION")) {
                    c1 c1Var5 = (c1) profileScreen.T2();
                    c70.a.b(c1Var5.f315316r, null, "Revolut ver. " + ((Object) c1Var5.f315323x.b(new TextClause(c1Var5.B.f(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126))), false, 5);
                    r70.c.b(c1Var5.f315320t, 3);
                    c1Var5.H2();
                }
                break;
            case 4:
                um0 model = (um0) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0 c0VarT24 = profileScreen.T2();
                Intrinsics.h(model);
                c1 c1Var6 = (c1) c0VarT24;
                c1Var6.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f166695a, "ID_BOTTOM_DIALOG_LOGOUT_ACTIONS")) {
                    j60.a.v(c1Var6.F, false, null, 3);
                }
                break;
            default:
                um0 model2 = (um0) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0 c0VarT25 = profileScreen.T2();
                Intrinsics.h(model2);
                c1 c1Var7 = (c1) c0VarT25;
                c1Var7.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                if (Intrinsics.f(model2.f166695a, "ID_BOTTOM_DIALOG_LOGOUT_ACTIONS")) {
                    j60.a.v(c1Var7.F, false, null, 3);
                    c1Var7.l2(new yg6.v(c1Var7, model2, null, 12), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
