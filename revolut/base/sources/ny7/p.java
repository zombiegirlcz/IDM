package ny7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f220701a = new p();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        qv0.p it8 = (qv0.p) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        Object k = it8.getK();
        if (k != null) {
            return (zw7.z) k;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Pet.Gender");
    }
}
