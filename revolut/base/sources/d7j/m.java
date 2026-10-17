package d7j;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommodityOrderEditScreen f112023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CenteredAmountDelegate.Model f112024b;

    public m(CommodityOrderEditScreen commodityOrderEditScreen, CenteredAmountDelegate.Model model) {
        this.f112023a = commodityOrderEditScreen;
        this.f112024b = model;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Object value;
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        KProperty[] kPropertyArr = CommodityOrderEditScreen.W;
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f112023a.M.getValue();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.h(value, new nqi.a(formattedValue, z, this.f112024b)));
    }
}
