package bi2;

import bjk.c2;
import bjk.f3;
import bjk.k2;
import bjk.l2;
import bjk.p2;
import bjk.q2;
import bjk.u1;
import bjk.v;
import bjk.x2;
import bk1.e;
import bka.e1;
import bka.j0;
import bka.y;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.wero.impl.ui.home.settings.WeroSettingsScreen;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.PreferredScheduleController;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeader;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import qlm.d1;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15382a;

    public /* synthetic */ g(int i) {
        this.f15382a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15382a) {
            case 0:
                KProperty[] kPropertyArr = WeroSettingsScreen.S;
                return new FullScreenStateDelegate();
            case 1:
                Lazy lazy = bj9.a.f15588a;
                return ue0.e.b(Json.d, new bek.a(28));
            case 2:
                return bje.n.Companion.serializer();
            case 3:
                return j1.b("com.revolut.feature.staking.api.model.StakingInterestRateType", vtd.a.values());
            case 4:
                return new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.EarnFallback", bje.h.INSTANCE, new Annotation[0]);
            case 5:
                return new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.Learn", bje.i.INSTANCE, new Annotation[0]);
            case 6:
                return new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.LearnWithReward", bje.j.INSTANCE, new Annotation[0]);
            case 7:
                return new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.RevolutX", bje.k.INSTANCE, new Annotation[0]);
            case 8:
                return new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.Strategies", bje.l.INSTANCE, new Annotation[0]);
            case 9:
                return new d1("com.revolut.feature.tab.crypto.api.add_new.ProductItem.Trading", bje.m.INSTANCE, new Annotation[0]);
            case 10:
                return Unit.f186387a;
            case 11:
                return new qlm.e(v.f16087a);
            case 12:
                return new qlm.e(c2.f15705a);
            case 13:
                return new qlm.e(u1.f16081a);
            case 14:
                return new d1("com.revolut.retail.feature.pricing_plans.ui.impl.network.dto.PricingPlanActionDto.DeclineDto", k2.INSTANCE, new Annotation[0]);
            case 15:
                return new d1("com.revolut.retail.feature.pricing_plans.ui.impl.network.dto.PricingPlanActionDto.DismissDto", l2.INSTANCE, new Annotation[0]);
            case 16:
                p2.Companion bVar = p2.INSTANCE;
                return new qlm.e(q2.f16053a);
            case 17:
                return new qlm.e(x2.f16123a);
            case 18:
                return new qlm.e(f3.f15866a);
            case 19:
                e.Companion bVar2 = bk1.e.INSTANCE;
                return bk1.g.Companion.serializer();
            case 20:
                return j1.a("com.revolut.feature.air.tip.learn.impl.data.network.model.LearnAirTipViewState", bk1.g.values(), new String[]{"ACTIVE", "DEACTIVATED", "UNKNOWN"}, new Annotation[][]{null, null, null});
            case 21:
                KProperty[] kPropertyArr2 = PreferredScheduleController.T;
                return new FullScreenStateDelegate();
            case 22:
                return new qlm.e(bka.h.f16316a);
            case 23:
                return j1.b("com.revolut.feature.product_article.api.models.item.ProductArticleCardItem.LayoutType", bka.q.values());
            case 24:
                return new qlm.e(y.f16348a);
            case 25:
                return j1.b("com.revolut.feature.product_article.api.models.item.ProductArticleHeroItem.Style.Theme", j0.values());
            case 26:
                e1 e1Var = e1.INSTANCE;
                Intrinsics.checkNotNullParameter("type", "discriminator");
                return new d1("com.revolut.feature.product_article.api.models.item.ProductArticleUnknownItem", e1Var, new Annotation[]{new bka.b(7, false)});
            case 27:
                SlotChecklist.Content.Companion bVar3 = SlotChecklist.Content.INSTANCE;
                return SlotChecklistHeader.INSTANCE.serializer();
            case 28:
                SlotChecklist.Content.Companion bVar4 = SlotChecklist.Content.INSTANCE;
                return new qlm.e(SlotChecklist.Step.a.f87285a);
            default:
                SlotChecklist.Content.Companion bVar5 = SlotChecklist.Content.INSTANCE;
                return new qlm.e(SlotChecklist.Action.a.f87265a);
        }
    }
}
