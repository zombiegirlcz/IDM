package nz7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zw7.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f220984a = new n();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        qv0.p it8 = (qv0.p) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        Object o = it8.getO();
        if (o != null) {
            return (d0) o;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Pet");
    }
}
