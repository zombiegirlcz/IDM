package kkf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f184620a = new c1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        nl4.h hVar = (nl4.h) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (hVar == null) {
            return error;
        }
        return null;
    }
}
