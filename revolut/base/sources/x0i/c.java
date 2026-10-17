package x0i;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, uj3.b.class, "isEnabledAndOnboarded", "isEnabledAndOnboarded(Lcom/revolut/feature/commodities/onboarding/api/models/CommodityFeatureState;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        uj3.a p0 = (uj3.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(uj3.b.q(p0));
    }
}
