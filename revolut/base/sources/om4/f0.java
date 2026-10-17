package om4;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardFeatureConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f226571a = new f0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CreditCardFeatureConfig it8 = (CreditCardFeatureConfig) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        od0.i.Companion.getClass();
        return od0.h.a(it8);
    }
}
