package zim;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;

/* JADX INFO: loaded from: classes13.dex */
public abstract class u implements KCallable, f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f322703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2 f322704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f322705c;
    public final h2 d;
    public final h2 e;
    public final h2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f322706g;

    public u() {
        h2 h2VarN = m70.a.n(null, new r(this, 0));
        Intrinsics.checkNotNullExpressionValue(h2VarN, "lazySoft(...)");
        this.f322703a = h2VarN;
        h2 h2VarN2 = m70.a.n(null, new r(this, 2));
        Intrinsics.checkNotNullExpressionValue(h2VarN2, "lazySoft(...)");
        this.f322704b = h2VarN2;
        h2 h2VarN3 = m70.a.n(null, new r(this, 3));
        Intrinsics.checkNotNullExpressionValue(h2VarN3, "lazySoft(...)");
        this.f322705c = h2VarN3;
        h2 h2VarN4 = m70.a.n(null, new r(this, 4));
        Intrinsics.checkNotNullExpressionValue(h2VarN4, "lazySoft(...)");
        this.d = h2VarN4;
        h2 h2VarN5 = m70.a.n(null, new r(this, 5));
        Intrinsics.checkNotNullExpressionValue(h2VarN5, "lazySoft(...)");
        this.e = h2VarN5;
        h2 h2VarN6 = m70.a.n(null, new r(this, 6));
        Intrinsics.checkNotNullExpressionValue(h2VarN6, "lazySoft(...)");
        this.f = h2VarN6;
        this.f322706g = yhm.j.c(yhm.k.PUBLICATION, new r(this, 7));
    }

    public static Object b(c2 c2Var) {
        Class clsO = nim.a.o(a.a.n(c2Var));
        if (clsO.isArray()) {
            Object objNewInstance = Array.newInstance(clsO.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsO.getSimpleName() + ", because it is not an array type");
    }

    public abstract ajm.i c();

    @Override // kotlin.reflect.KCallable
    public final Object call(Object... args) throws IllegalCallableAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return c().call(args);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KCallable
    public final Object callBy(Map args) throws IllegalCallableAccessException {
        boolean z;
        Object objB;
        Intrinsics.checkNotNullParameter(args, "args");
        boolean z3 = false;
        if (o()) {
            List<Object> parameters = getParameters();
            ArrayList arrayList = new ArrayList(zhm.w.t(parameters, 10));
            for (Object obj2 : parameters) {
                if (args.containsKey(obj2)) {
                    objB = args.get(obj2);
                    if (objB == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + obj2 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                    }
                } else {
                    d1 d1Var = (d1) obj2;
                    if (d1Var.g()) {
                        objB = null;
                    } else {
                        if (!d1Var.j()) {
                            throw new IllegalArgumentException("No argument provided for a required parameter: " + d1Var);
                        }
                        objB = b(d1Var.d());
                    }
                }
                arrayList.add(objB);
            }
            ajm.i iVarG = g();
            if (iVarG != null) {
                try {
                    return iVarG.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new IllegalCallableAccessException(e);
                }
            }
            throw new KotlinReflectionInternalError("This callable does not support a default call: " + j());
        }
        Intrinsics.checkNotNullParameter(args, "args");
        List<wim.m> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return c().call(isSuspend() ? new Continuation[]{null} : new Continuation[0]);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.f322706g.getValue()).booleanValue();
        int i = 0;
        for (wim.m mVar : parameters2) {
            int iN = zBooleanValue ? n(mVar) : 1;
            if (args.containsKey(mVar)) {
                d1 d1Var2 = (d1) mVar;
                objArr[d1Var2.b()] = args.get(d1Var2);
            } else {
                d1 d1Var3 = (d1) mVar;
                if (d1Var3.g()) {
                    if (zBooleanValue) {
                        int i2 = i + iN;
                        for (int i3 = i; i3 < i2; i3++) {
                            int i5 = (i3 / 32) + size;
                            Object obj3 = objArr[i5];
                            Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Int");
                            objArr[i5] = Integer.valueOf(((Integer) obj3).intValue() | (1 << (i3 % 32)));
                        }
                        z = true;
                    } else {
                        z = true;
                        int i6 = (i / 32) + size;
                        Object obj4 = objArr[i6];
                        Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i6] = Integer.valueOf(((Integer) obj4).intValue() | (1 << (i % 32)));
                    }
                    z3 = z;
                } else if (!d1Var3.j()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + d1Var3);
                }
            }
            if (((d1) mVar).c() == wim.l.VALUE) {
                i += iN;
            }
        }
        if (!z3) {
            try {
                ajm.i iVarC = c();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                return iVarC.call(objArrCopyOf);
            } catch (IllegalAccessException e4) {
                throw new IllegalCallableAccessException(e4);
            }
        }
        ajm.i iVarG2 = g();
        if (iVarG2 != null) {
            try {
                return iVarG2.call(objArr);
            } catch (IllegalAccessException e5) {
                throw new IllegalCallableAccessException(e5);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + j());
    }

    public abstract l0 d();

    public abstract ajm.i g();

    @Override // wim.b
    public final List getAnnotations() {
        Object objInvoke = this.f322703a.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final List getParameters() {
        Object objInvoke = this.f322705c.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final KType getReturnType() {
        Object objInvoke = this.d.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (KType) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final List getTypeParameters() {
        Object objInvoke = this.e.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final KVisibility getVisibility() {
        DescriptorVisibility visibility = j().getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        FqName fqName = o2.f322677a;
        Intrinsics.checkNotNullParameter(visibility, "<this>");
        if (Intrinsics.f(visibility, DescriptorVisibilities.PUBLIC)) {
            return KVisibility.PUBLIC;
        }
        if (Intrinsics.f(visibility, DescriptorVisibilities.PROTECTED)) {
            return KVisibility.PROTECTED;
        }
        if (Intrinsics.f(visibility, DescriptorVisibilities.INTERNAL)) {
            return KVisibility.INTERNAL;
        }
        if (Intrinsics.f(visibility, DescriptorVisibilities.PRIVATE) || Intrinsics.f(visibility, DescriptorVisibilities.PRIVATE_TO_THIS)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isAbstract() {
        return j().getModality() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isFinal() {
        return j().getModality() == Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isOpen() {
        return j().getModality() == Modality.OPEN;
    }

    public abstract CallableMemberDescriptor j();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int n(wim.m mVar) {
        if (!((Boolean) this.f322706g.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        d1 d1Var = (d1) mVar;
        if (!o2.g(d1Var.d())) {
            return 1;
        }
        ArrayList arrayListK = l9.l.k(TypeSubstitutionKt.asSimpleType(d1Var.d().f322615a));
        Intrinsics.h(arrayListK);
        return arrayListK.size();
    }

    public final boolean o() {
        return Intrinsics.f(getName(), "<init>") && d().getF186423a().isAnnotation();
    }

    public abstract boolean p();
}
