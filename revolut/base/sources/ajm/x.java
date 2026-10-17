package ajm;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes14.dex */
public final class x extends t implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object[] f5622g;

    /* JADX WARN: Illegal instructions before constructor call */
    public x(Method method, Object[] boundReceiverComponents) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(boundReceiverComponents, "boundReceiverComponents");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        super(method, false, (Type[]) kotlin.collections.d.K(boundReceiverComponents.length, genericParameterTypes).toArray(new Type[0]));
        this.f5622g = boundReceiverComponents;
    }

    @Override // ajm.t, ajm.i
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(args);
        s0 s0Var = new s0(2);
        s0Var.b(this.f5622g);
        s0Var.b(args);
        ArrayList arrayList = s0Var.f186433a;
        return f(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
