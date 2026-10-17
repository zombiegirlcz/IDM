package zim;

import java.lang.reflect.Array;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes13.dex */
public final class c2 extends a {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KotlinType f322615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f322616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f322617c;
    public final h2 d;
    public final h2 e;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(c2.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        f = new KProperty[]{p0Var.j(h0Var), p.a.y(c2.class, "arguments", "getArguments()Ljava/util/List;", 0, p0Var)};
    }

    public c2(KotlinType type, Function0 function0, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f322615a = type;
        this.f322616b = z;
        h2 h2Var = function0 instanceof h2 ? (h2) function0 : null;
        this.f322617c = h2Var == null ? function0 != null ? m70.a.n(null, function0) : null : h2Var;
        this.d = m70.a.n(null, new z1(this, 0));
        this.e = m70.a.n(null, new ajm.e(this, function0, 20));
    }

    public final wim.c a(KotlinType kotlinType) {
        KotlinType type;
        if (this.f322616b) {
            ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = kotlinType.getConstructor().mo3795getDeclarationDescriptor();
            NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorMo3795getDeclarationDescriptor instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor : null;
            if (mockClassDescriptor != null) {
                return new y1(DescriptorUtilsKt.getFqNameSafe(mockClassDescriptor));
            }
        }
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor2 = kotlinType.getConstructor().mo3795getDeclarationDescriptor();
        if (classifierDescriptorMo3795getDeclarationDescriptor2 instanceof ClassDescriptor) {
            Class<?> clsJ = o2.j((ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor2);
            if (clsJ != null) {
                if (!KotlinBuiltIns.isArray(kotlinType)) {
                    if (TypeUtils.isNullableType(kotlinType)) {
                        return new e0(clsJ);
                    }
                    Class<?> primitiveByWrapper = ReflectClassUtilKt.getPrimitiveByWrapper(clsJ);
                    if (primitiveByWrapper != null) {
                        clsJ = primitiveByWrapper;
                    }
                    return new e0(clsJ);
                }
                TypeProjection typeProjection = (TypeProjection) zhm.d0.M0(kotlinType.getArguments());
                if (typeProjection == null || (type = typeProjection.getType()) == null) {
                    return new e0(clsJ);
                }
                wim.c cVarA = a(TypeUtilsKt.makeNullable(type));
                if (cVarA != null) {
                    Class clsO = nim.a.o(a.a.o(cVarA));
                    Intrinsics.checkNotNullParameter(clsO, "<this>");
                    return new e0(Array.newInstance((Class<?>) clsO, 0).getClass());
                }
                throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
            }
        } else if (classifierDescriptorMo3795getDeclarationDescriptor2 instanceof TypeParameterDescriptor) {
            return new e2(null, (TypeParameterDescriptor) classifierDescriptorMo3795getDeclarationDescriptor2);
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f322615a, c2Var.f322615a) && Intrinsics.f(getF186441a(), c2Var.getF186441a()) && Intrinsics.f(getF186442b(), c2Var.getF186442b());
    }

    @Override // wim.b
    public final List getAnnotations() {
        return o2.d(this.f322615a);
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: getArguments */
    public final List getF186442b() {
        KProperty kProperty = f[1];
        Object objInvoke = this.e.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: getClassifier */
    public final wim.c getF186441a() {
        KProperty kProperty = f[0];
        return (wim.c) this.d.invoke();
    }

    @Override // kotlin.reflect.KType
    public final boolean h() {
        return this.f322615a.isMarkedNullable();
    }

    public final int hashCode() {
        int iHashCode = this.f322615a.hashCode() * 31;
        wim.c classifier = getF186441a();
        return getF186442b().hashCode() + ((iHashCode + (classifier != null ? classifier.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return l2.g(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c2(KotlinType type, Function0 function0) {
        this(type, function0, false);
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
