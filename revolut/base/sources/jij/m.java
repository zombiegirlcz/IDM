package jij;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f174586a = new m();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(data, "data");
        return Boolean.valueOf(data instanceof bv0.b);
    }
}
