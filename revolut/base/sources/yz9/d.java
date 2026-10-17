package yz9;

import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f318055a = new d();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        Map map = (Map) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (map == null) {
            return error;
        }
        return null;
    }
}
