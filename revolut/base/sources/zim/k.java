package zim;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends edl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f322653a;

    public k(Method method) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.f322653a = method;
    }

    @Override // edl.a
    public final String b() {
        return gc0.c.d(this.f322653a);
    }
}
