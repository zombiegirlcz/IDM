package wx7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;
import zw7.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f300777a = new h();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        p it8 = (p) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        Object f53016n = it8.getF53016n();
        if (f53016n != null) {
            return (c0) f53016n;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Pet.Type");
    }
}
