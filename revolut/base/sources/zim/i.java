package zim;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends edl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f322646a;

    public i(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Method[] declaredMethods = jClass.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        this.f322646a = kotlin.collections.d.n0(new h(0), declaredMethods);
    }

    @Override // edl.a
    public final String b() {
        return zhm.d0.k0(this.f322646a, "", "<init>(", ")V", 0, c.f322605g, 24);
    }
}
