package zim;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends edl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor f322649a;

    public j(Constructor constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        this.f322649a = constructor;
    }

    @Override // edl.a
    public final String b() {
        Class<?>[] parameterTypes = this.f322649a.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        return kotlin.collections.d.d0(parameterTypes, "", "<init>(", ")V", c.f322606h, 24);
    }
}
