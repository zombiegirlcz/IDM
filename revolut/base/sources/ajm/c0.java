package ajm;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f5598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f5600c;

    public c0(Method method, List list) {
        this.f5598a = method;
        this.f5599b = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        this.f5600c = returnType;
    }

    public final void a(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (ksj.b.j(this) == args.length) {
            return;
        }
        StringBuilder sb6 = new StringBuilder("Callable expects ");
        sb6.append(ksj.b.j(this));
        sb6.append(" arguments, but ");
        throw new IllegalArgumentException(j6.a.v(sb6, " were provided.", args.length));
    }

    @Override // ajm.i
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // ajm.i
    public final /* bridge */ boolean c() {
        return false;
    }

    @Override // ajm.i
    public final List d() {
        return this.f5599b;
    }

    @Override // ajm.i
    public final Type getReturnType() {
        return this.f5600c;
    }
}
