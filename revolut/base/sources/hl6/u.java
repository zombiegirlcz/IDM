package hl6;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f153006a = new u();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        od0.i iVar = (od0.i) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (iVar == null) {
            return error;
        }
        return null;
    }
}
