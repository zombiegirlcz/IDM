package zim;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes14.dex */
public final class b1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f322601b;

    public /* synthetic */ b1(d1 d1Var, int i) {
        this.f322600a = i;
        this.f322601b = d1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listN0;
        ReceiverParameterDescriptor thisAsReceiverParameter;
        int i = this.f322600a;
        d1 d1Var = this.f322601b;
        switch (i) {
            case 0:
                return o2.d(d1Var.a());
            default:
                ParameterDescriptor parameterDescriptorA = d1Var.a();
                int i2 = d1Var.f322622b;
                u uVar = d1Var.f322621a;
                if (parameterDescriptorA instanceof ReceiverParameterDescriptor) {
                    CallableMemberDescriptor callableMemberDescriptorJ = uVar.j();
                    FqName fqName = o2.f322677a;
                    Intrinsics.checkNotNullParameter(callableMemberDescriptorJ, "<this>");
                    if (callableMemberDescriptorJ.getDispatchReceiverParameter() != null) {
                        DeclarationDescriptor containingDeclaration = callableMemberDescriptorJ.getContainingDeclaration();
                        Intrinsics.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        thisAsReceiverParameter = ((ClassDescriptor) containingDeclaration).getThisAsReceiverParameter();
                    } else {
                        thisAsReceiverParameter = null;
                    }
                    if (Intrinsics.f(thisAsReceiverParameter, parameterDescriptorA) && uVar.j().getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                        DeclarationDescriptor containingDeclaration2 = uVar.j().getContainingDeclaration();
                        Intrinsics.i(containingDeclaration2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        Class clsJ = o2.j((ClassDescriptor) containingDeclaration2);
                        if (clsJ != null) {
                            return clsJ;
                        }
                        throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + parameterDescriptorA);
                    }
                }
                ajm.i iVarC = uVar.c();
                if (!(iVarC instanceof ajm.f0)) {
                    if (!(iVarC instanceof ajm.e0)) {
                        return (Type) iVarC.d().get(i2);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((ajm.e0) iVarC).d.get(i2)).toArray(new Class[0]);
                    Type[] typeArr = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length = typeArr.length;
                    if (length != 0) {
                        return length != 1 ? new c1(typeArr) : (Type) kotlin.collections.d.j0(typeArr);
                    }
                    throw new KotlinReflectionNotSupportedError("Expected at least 1 type for compound type");
                }
                if (uVar.p()) {
                    ajm.f0 f0Var = (ajm.f0) iVarC;
                    IntRange intRangeA = f0Var.a(i2 + 1);
                    int i3 = f0Var.a(0).f186449b + 1;
                    listN0 = zhm.d0.N0(f0Var.f5614b.d(), new IntRange(intRangeA.f186448a - i3, intRangeA.f186449b - i3, 1));
                } else {
                    ajm.f0 f0Var2 = (ajm.f0) iVarC;
                    listN0 = zhm.d0.N0(f0Var2.f5614b.d(), f0Var2.a(i2));
                }
                Type[] typeArr2 = (Type[]) listN0.toArray(new Type[0]);
                Type[] typeArr3 = (Type[]) Arrays.copyOf(typeArr2, typeArr2.length);
                int length2 = typeArr3.length;
                if (length2 != 0) {
                    return length2 != 1 ? new c1(typeArr3) : (Type) kotlin.collections.d.j0(typeArr3);
                }
                throw new KotlinReflectionNotSupportedError("Expected at least 1 type for compound type");
        }
    }
}
