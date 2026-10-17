package zim;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt;

/* JADX INFO: loaded from: classes14.dex */
public final class n0 extends u implements kotlin.jvm.internal.o, KFunction, Function0, Function1, oim.a, oim.b, oim.c, oim.d, oim.e, oim.f, oim.g, oim.h, oim.i, oim.j, Function2, oim.k, oim.l, oim.m, Function3, oim.n, oim.o, oim.p, oim.q, oim.r, oim.s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f322667n = {kotlin.jvm.internal.o0.f186429a.j(new kotlin.jvm.internal.h0(n0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0 f322668h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f322669j;
    public final h2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f322670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f322671m;

    public n0(l0 l0Var, String str, String str2, FunctionDescriptor functionDescriptor, Object obj2) {
        this.f322668h = l0Var;
        this.i = str2;
        this.f322669j = obj2;
        this.k = m70.a.n(functionDescriptor, new ajm.e(this, str, 19));
        yhm.k kVar = yhm.k.PUBLICATION;
        this.f322670l = yhm.j.c(kVar, new m0(this, 0));
        this.f322671m = yhm.j.c(kVar, new m0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zim.u
    public final ajm.i c() {
        return (ajm.i) this.f322670l.getValue();
    }

    @Override // zim.u
    public final l0 d() {
        return this.f322668h;
    }

    public final boolean equals(Object obj2) {
        n0 n0VarB = o2.b(obj2);
        return n0VarB != null && Intrinsics.f(this.f322668h, n0VarB.f322668h) && Intrinsics.f(getName(), n0VarB.getName()) && Intrinsics.f(this.i, n0VarB.i) && Intrinsics.f(this.f322669j, n0VarB.f322669j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zim.u
    public final ajm.i g() {
        return (ajm.i) this.f322671m.getValue();
    }

    @Override // kotlin.jvm.internal.o
    public final int getArity() {
        return ksj.b.j(c());
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        String strAsString = j().getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return strAsString;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((getName().hashCode() + (this.f322668h.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isExternal() {
        return j().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInfix() {
        return j().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInline() {
        return j().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isOperator() {
        return j().isOperator();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isSuspend() {
        return j().isSuspend();
    }

    @Override // zim.u
    public final boolean p() {
        return this.f322669j != kotlin.jvm.internal.h.NO_RECEIVER;
    }

    public final ajm.z q(Constructor constructor, FunctionDescriptor functionDescriptor, boolean z) {
        Object obj2 = this.f322669j;
        if (!z && InlineClassManglingRulesKt.shouldHideConstructorDueToValueClassTypeValueParameters(functionDescriptor)) {
            if (p()) {
                return new ajm.j(constructor, l9.l.f(obj2, j()), 0);
            }
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            return new ajm.k(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : zhm.p.n(0, genericParameterTypes.length - 1, genericParameterTypes)), 0);
        }
        if (p()) {
            return new ajm.j(constructor, l9.l.f(obj2, j()), 1);
        }
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Class declaringClass2 = constructor.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass2, "getDeclaringClass(...)");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        Class<?> cls = (declaringClass4 == null || Modifier.isStatic(declaringClass3.getModifiers())) ? null : declaringClass4;
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes2, "getGenericParameterTypes(...)");
        return new ajm.k(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ajm.t r(java.lang.reflect.Method r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.p()
            if (r0 == 0) goto L45
            ajm.w r0 = new ajm.w
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = r5.j()
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r1 = r1.getDispatchReceiverParameter()
            java.lang.Object r2 = r5.f322669j
            if (r1 == 0) goto L39
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            if (r1 == 0) goto L39
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClassType(r1)
            r3 = 1
            if (r1 != r3) goto L39
            java.lang.Class[] r1 = r6.getParameterTypes()
            java.lang.String r4 = "getParameterTypes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.Object r1 = kotlin.collections.d.P(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L39
            boolean r1 = r1.isInterface()
            if (r1 != r3) goto L39
            goto L41
        L39:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = r5.j()
            java.lang.Object r2 = l9.l.f(r2, r1)
        L41:
            r0.<init>(r6, r7, r2)
            return r0
        L45:
            ajm.y r7 = new ajm.y
            r0 = 2
            r7.<init>(r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zim.n0.r(java.lang.reflect.Method, boolean):ajm.t");
    }

    @Override // zim.u
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final FunctionDescriptor j() {
        KProperty kProperty = f322667n[0];
        Object objInvoke = this.k.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (FunctionDescriptor) objInvoke;
    }

    public final String toString() throws IOException {
        Intrinsics.checkNotNullParameter(this, "function");
        StringBuilder sb6 = new StringBuilder();
        l2.a(sb6, this);
        sb6.append("fun ");
        l2.c(sb6, this);
        l2.b(getName(), sb6);
        zhm.d0.j0(czi.c.w(this), sb6, ", ", "(", ")", c.f322608l, 48);
        sb6.append(": ");
        sb6.append(l2.g(getReturnType()));
        return sb6.toString();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return call(obj2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return call(obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        return call(obj2, obj3, obj4);
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj2, obj3, obj4, obj5);
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj2, obj3, obj4, obj5, obj6);
    }

    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return call(obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(l0 container, String name, String signature, Object obj2) {
        this(container, name, signature, null, obj2);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    @Override // oim.q
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return call(obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(l0 container, FunctionDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strAsString = descriptor.getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        this(container, strAsString, m2.c(descriptor).b(), descriptor, kotlin.jvm.internal.h.NO_RECEIVER);
    }

    @Override // oim.r
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return call(obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // oim.s
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return call(obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }
}
