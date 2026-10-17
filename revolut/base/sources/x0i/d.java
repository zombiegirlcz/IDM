package x0i;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, yh5.b.class, "isEnabledAndOnboarded", "isEnabledAndOnboarded(Lcom/revolut/feature/crypto/onboarding/api/models/CryptoFeatureState;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yh5.a p0 = (yh5.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(yh5.b.x(p0));
    }
}
