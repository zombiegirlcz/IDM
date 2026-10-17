package o7j;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$TargetPriceInputValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommodityTargetPriceScreenContract$TargetPriceInputValue f222863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd6.h f222864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f222865c;
    public final xi0.b d;
    public final wd6.e e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f222866g;

    public j(CommodityTargetPriceScreenContract$TargetPriceInputValue targetPriceInputValue, wd6.h orderType, xi0.b orderBaseCurrency, xi0.b counterCurrency, wd6.e exchangeMode, Data currentRate, Data inputValidationResult) {
        Intrinsics.checkNotNullParameter(targetPriceInputValue, "targetPriceInputValue");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderBaseCurrency, "orderBaseCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(inputValidationResult, "inputValidationResult");
        this.f222863a = targetPriceInputValue;
        this.f222864b = orderType;
        this.f222865c = orderBaseCurrency;
        this.d = counterCurrency;
        this.e = exchangeMode;
        this.f = currentRate;
        this.f222866g = inputValidationResult;
    }

    public static j a(j jVar, CommodityTargetPriceScreenContract$TargetPriceInputValue commodityTargetPriceScreenContract$TargetPriceInputValue, Data data, Data data2, int i) {
        if ((i & 1) != 0) {
            commodityTargetPriceScreenContract$TargetPriceInputValue = jVar.f222863a;
        }
        CommodityTargetPriceScreenContract$TargetPriceInputValue targetPriceInputValue = commodityTargetPriceScreenContract$TargetPriceInputValue;
        wd6.h orderType = jVar.f222864b;
        xi0.b orderBaseCurrency = jVar.f222865c;
        xi0.b counterCurrency = jVar.d;
        wd6.e exchangeMode = jVar.e;
        if ((i & 32) != 0) {
            data = jVar.f;
        }
        Data currentRate = data;
        if ((i & 64) != 0) {
            data2 = jVar.f222866g;
        }
        Data inputValidationResult = data2;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(targetPriceInputValue, "targetPriceInputValue");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderBaseCurrency, "orderBaseCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(inputValidationResult, "inputValidationResult");
        return new j(targetPriceInputValue, orderType, orderBaseCurrency, counterCurrency, exchangeMode, currentRate, inputValidationResult);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f222863a, jVar.f222863a) && this.f222864b == jVar.f222864b && Intrinsics.f(this.f222865c, jVar.f222865c) && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f222866g, jVar.f222866g);
    }

    public final int hashCode() {
        return this.f222866g.hashCode() + kii.e.c(this.f, wp5.y.g(this.e, h30.l.j(this.d, h30.l.j(this.f222865c, v1.c.b(this.f222864b, this.f222863a.hashCode() * 31, 31), 31), 31), 31), 31);
    }
}
