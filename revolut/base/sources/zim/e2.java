package zim;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.w0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class e2 implements wim.r, f0 {
    public static final /* synthetic */ KProperty[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeParameterDescriptor f322631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2 f322632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f322633c;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(e2.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0);
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        d = new KProperty[]{p0Var.j(h0Var), p.a.y(e2.class, "container", "getContainer()Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", 0, p0Var)};
    }

    public e2(f2 f2Var, TypeParameterDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f322631a = descriptor;
        this.f322632b = m70.a.n(null, new h0(this, 6));
        this.f322633c = m70.a.n(null, new ajm.e(f2Var, this, 21));
    }

    public static e0 b(ClassDescriptor classDescriptor) {
        Class clsJ = o2.j(classDescriptor);
        e0 e0Var = (e0) (clsJ != null ? nim.a.r(clsJ) : null);
        if (e0Var != null) {
            return e0Var;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + classDescriptor.getContainingDeclaration());
    }

    public final f2 a() {
        KProperty kProperty = d[1];
        Object objInvoke = this.f322633c.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (f2) objInvoke;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj2;
        return Intrinsics.f(a(), e2Var.a()) && Intrinsics.f(getName(), e2Var.getName());
    }

    @Override // zim.f0
    public final ClassifierDescriptor getDescriptor() {
        return this.f322631a;
    }

    @Override // wim.r
    public final String getName() {
        String strAsString = this.f322631a.getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return strAsString;
    }

    @Override // wim.r
    public final List getUpperBounds() {
        KProperty kProperty = d[0];
        Object objInvoke = this.f322632b.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // wim.r
    /* JADX INFO: renamed from: getVariance */
    public final wim.t getF186439b() {
        int i = d2.f322624a[this.f322631a.getVariance().ordinal()];
        if (i == 1) {
            return wim.t.INVARIANT;
        }
        if (i == 2) {
            return wim.t.IN;
        }
        if (i == 3) {
            return wim.t.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int hashCode() {
        return getName().hashCode() + (a().hashCode() * 31);
    }

    public final String toString() {
        kotlin.jvm.internal.w0.INSTANCE.getClass();
        return w0.Companion.a(this);
    }
}
