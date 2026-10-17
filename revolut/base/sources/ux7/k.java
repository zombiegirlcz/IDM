package ux7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f283900a = new k();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        p it8 = (p) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        Object k = it8.getK();
        if (k != null) {
            return (z) k;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Pet.Gender");
    }
}
