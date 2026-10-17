package zim;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f322618a = b.a(c.f322603b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f322619b = b.a(c.f322604c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f322620c = b.a(c.d);
    public static final e d = b.a(c.e);
    public static final e e = b.a(c.f);

    public static final e0 a(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Object objY = f322618a.y(jClass);
        Intrinsics.i(objY, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (e0) objY;
    }
}
