package kka;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f184566a = new i();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(error, "error");
        return error;
    }
}
