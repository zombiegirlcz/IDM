package ejm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f126915a = new a();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Annotations it8 = (Annotations) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return d0.Q(it8);
    }
}
