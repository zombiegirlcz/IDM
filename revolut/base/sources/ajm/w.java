package ajm;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes14.dex */
public final class w extends t implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f5621h;

    /* JADX WARN: Illegal instructions before constructor call */
    public w(Method method, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(method, "method");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : zhm.p.n(1, genericParameterTypes.length, genericParameterTypes)));
        this.f5620g = z;
        this.f5621h = obj2;
    }

    @Override // ajm.t, ajm.i
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(args);
        s0 s0Var = new s0(2);
        s0Var.a(this.f5621h);
        s0Var.b(args);
        ArrayList arrayList = s0Var.f186433a;
        return f(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
