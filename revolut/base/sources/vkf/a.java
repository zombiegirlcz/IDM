package vkf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f289924a = new a();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        kof.e eVar = (kof.e) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (eVar == null) {
            return error;
        }
        return null;
    }
}
