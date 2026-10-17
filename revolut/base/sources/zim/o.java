package zim;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends foh.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f322675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f322676b;

    public o(Method getterMethod, Method method) {
        Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
        this.f322675a = getterMethod;
        this.f322676b = method;
    }

    @Override // foh.i
    public final String b() {
        return gc0.c.d(this.f322675a);
    }
}
