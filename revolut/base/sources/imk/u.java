package imk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements cli.j, ojk.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f162545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f162546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c f162547c;
    public final Data d;
    public final ojk.a0 e;

    public u(Data pricingPlan, Data screenConfig, com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c onScreenOpenedItem, Data legalEntityContext, ojk.a0 itemsExtraData) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(onScreenOpenedItem, "onScreenOpenedItem");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(itemsExtraData, "itemsExtraData");
        this.f162545a = pricingPlan;
        this.f162546b = screenConfig;
        this.f162547c = onScreenOpenedItem;
        this.d = legalEntityContext;
        this.e = itemsExtraData;
    }

    public static u c(u uVar, Data data, Data data2, com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c cVar, Data data3, ojk.a0 a0Var, int i) {
        if ((i & 1) != 0) {
            data = uVar.f162545a;
        }
        Data pricingPlan = data;
        if ((i & 2) != 0) {
            data2 = uVar.f162546b;
        }
        Data screenConfig = data2;
        if ((i & 4) != 0) {
            cVar = uVar.f162547c;
        }
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c onScreenOpenedItem = cVar;
        if ((i & 8) != 0) {
            data3 = uVar.d;
        }
        Data legalEntityContext = data3;
        if ((i & 16) != 0) {
            a0Var = uVar.e;
        }
        ojk.a0 itemsExtraData = a0Var;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(onScreenOpenedItem, "onScreenOpenedItem");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(itemsExtraData, "itemsExtraData");
        return new u(pricingPlan, screenConfig, onScreenOpenedItem, legalEntityContext, itemsExtraData);
    }

    @Override // ojk.v
    public final ojk.a0 a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f162545a, uVar.f162545a) && Intrinsics.f(this.f162546b, uVar.f162546b) && Intrinsics.f(this.f162547c, uVar.f162547c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, (this.f162547c.hashCode() + kii.e.c(this.f162546b, this.f162545a.hashCode() * 31, 31)) * 31, 31);
    }
}
