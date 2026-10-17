package zim;

import java.io.IOException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes14.dex */
public final class d1 implements wim.m {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f322621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f322622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wim.l f322623c;
    public final h2 d;
    public final h2 e;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(d1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        f = new KProperty[]{p0Var.j(h0Var), p.a.y(d1.class, "annotations", "getAnnotations()Ljava/util/List;", 0, p0Var)};
    }

    public d1(u callable, int i, wim.l kind, Function0 computeDescriptor) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(computeDescriptor, "computeDescriptor");
        this.f322621a = callable;
        this.f322622b = i;
        this.f322623c = kind;
        this.d = m70.a.n(null, computeDescriptor);
        this.e = m70.a.n(null, new b1(this, 0));
    }

    public final ParameterDescriptor a() {
        KProperty kProperty = f[0];
        Object objInvoke = this.d.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (ParameterDescriptor) objInvoke;
    }

    public final int b() {
        return this.f322622b;
    }

    public final wim.l c() {
        return this.f322623c;
    }

    public final c2 d() {
        KotlinType type = a().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return new c2(type, new b1(this, 1));
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f322621a, d1Var.f322621a) && this.f322622b == d1Var.f322622b;
    }

    public final boolean g() {
        ParameterDescriptor parameterDescriptorA = a();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorA instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorA : null;
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor);
        }
        return false;
    }

    @Override // wim.b
    public final List getAnnotations() {
        KProperty kProperty = f[1];
        Object objInvoke = this.e.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    public final String getName() {
        ParameterDescriptor parameterDescriptorA = a();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorA instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorA : null;
        if (valueParameterDescriptor == null || valueParameterDescriptor.getContainingDeclaration().hasSynthesizedParameterNames()) {
            return null;
        }
        Name name = valueParameterDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (name.isSpecial()) {
            return null;
        }
        return name.asString();
    }

    public final int hashCode() {
        return Integer.hashCode(this.f322622b) + (this.f322621a.hashCode() * 31);
    }

    public final boolean j() {
        ParameterDescriptor parameterDescriptorA = a();
        return (parameterDescriptorA instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) parameterDescriptorA).getVarargElementType() != null;
    }

    public final String toString() throws IOException {
        String string;
        Intrinsics.checkNotNullParameter(this, "parameter");
        StringBuilder sb6 = new StringBuilder();
        int i = k2.f322656a[this.f322623c.ordinal()];
        if (i == 1) {
            sb6.append("instance parameter");
        } else if (i == 2) {
            sb6.append("context parameter " + getName());
        } else if (i == 3) {
            sb6.append("extension receiver parameter");
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            sb6.append("parameter #" + this.f322622b + zsc.p.SPACE_CHAR + getName());
        }
        sb6.append(" of ");
        Object obj2 = this.f322621a;
        if (obj2 instanceof KProperty) {
            string = l2.e((KProperty) obj2);
        } else {
            if (!(obj2 instanceof KFunction)) {
                throw new IllegalStateException(("Illegal callable: " + obj2).toString());
            }
            KFunction function = (KFunction) obj2;
            Intrinsics.checkNotNullParameter(function, "function");
            StringBuilder sb9 = new StringBuilder();
            l2.a(sb9, function);
            sb9.append("fun ");
            l2.c(sb9, function);
            l2.b(function.getName(), sb9);
            zhm.d0.j0(czi.c.w(function), sb9, ", ", "(", ")", c.f322608l, 48);
            sb9.append(": ");
            sb9.append(l2.g(function.getReturnType()));
            string = sb9.toString();
        }
        sb6.append(string);
        return sb6.toString();
    }
}
