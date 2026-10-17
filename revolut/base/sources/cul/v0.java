package cul;

import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f109192a = new v0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        v it8 = (v) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return zi0.c.P(Optional.ofNullable(it8.d), false, null, 3);
    }
}
