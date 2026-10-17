package xsi;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsContract$InputData;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsController;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308532a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustAnalyticsContract$InputData f308533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustAnalyticsController f308534c;

    public /* synthetic */ g(AdjustAnalyticsContract$InputData adjustAnalyticsContract$InputData, AdjustAnalyticsController adjustAnalyticsController) {
        this.f308533b = adjustAnalyticsContract$InputData;
        this.f308534c = adjustAnalyticsController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f308532a;
        AdjustAnalyticsController adjustAnalyticsController = this.f308534c;
        AdjustAnalyticsContract$InputData adjustAnalyticsContract$InputData = this.f308533b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = AdjustAnalyticsController.V;
                phm.a aVar = (phm.a) ue0.e.j(adjustAnalyticsController.m2()).a().get(vsi.c.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 != null) {
                    return new vsi.d(((vsi.c) aVar2.b()).e, adjustAnalyticsController, adjustAnalyticsContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", vsi.c.class, " is not found"));
            default:
                KProperty[] kPropertyArr2 = AdjustAnalyticsController.V;
                return new CenteredAmountDelegate(new u3a.p(adjustAnalyticsContract$InputData, adjustAnalyticsController, 22));
        }
    }

    public /* synthetic */ g(AdjustAnalyticsController adjustAnalyticsController, AdjustAnalyticsContract$InputData adjustAnalyticsContract$InputData) {
        this.f308534c = adjustAnalyticsController;
        this.f308533b = adjustAnalyticsContract$InputData;
    }
}
