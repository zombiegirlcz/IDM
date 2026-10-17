package kotlin.reflect.jvm.internal.impl.types.checker;

import hkm.a;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UtilsKt {
    public static final String a(TypeConstructor typeConstructor) {
        StringBuilder sb6 = new StringBuilder();
        b("type: " + typeConstructor, sb6);
        b("hashCode: " + typeConstructor.hashCode(), sb6);
        b("javaClass: " + typeConstructor.getClass().getCanonicalName(), sb6);
        for (DeclarationDescriptor declarationDescriptorMo3795getDeclarationDescriptor = typeConstructor.mo3795getDeclarationDescriptor(); declarationDescriptorMo3795getDeclarationDescriptor != null; declarationDescriptorMo3795getDeclarationDescriptor = declarationDescriptorMo3795getDeclarationDescriptor.getContainingDeclaration()) {
            b("fqName: " + DescriptorRenderer.FQ_NAMES_IN_TYPES.render(declarationDescriptorMo3795getDeclarationDescriptor), sb6);
            b("javaClass: " + declarationDescriptorMo3795getDeclarationDescriptor.getClass().getCanonicalName(), sb6);
        }
        return sb6.toString();
    }

    public static final void b(String str, StringBuilder sb6) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        sb6.append(str);
        sb6.append('\n');
    }

    public static final KotlinType findCorrespondingSupertype(@NotNull KotlinType subtype, @NotNull KotlinType supertype, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new a(subtype, null));
        TypeConstructor constructor = supertype.getConstructor();
        while (!arrayDeque.isEmpty()) {
            a aVar = (a) arrayDeque.poll();
            KotlinType upper = aVar.f152968a;
            TypeConstructor constructor2 = upper.getConstructor();
            if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor2, constructor)) {
                boolean zIsMarkedNullable = upper.isMarkedNullable();
                for (a aVar2 = aVar.f152969b; aVar2 != null; aVar2 = aVar2.f152969b) {
                    KotlinType kotlinType = aVar2.f152968a;
                    List<TypeProjection> arguments = kotlinType.getArguments();
                    if ((arguments instanceof Collection) && arguments.isEmpty()) {
                        upper = TypeConstructorSubstitution.Companion.create(kotlinType).buildSubstitutor().safeSubstitute(upper, Variance.INVARIANT);
                        Intrinsics.h(upper);
                    } else {
                        Iterator<T> it8 = arguments.iterator();
                        while (it8.hasNext()) {
                            Variance projectionKind = ((TypeProjection) it8.next()).getProjectionKind();
                            Variance variance = Variance.INVARIANT;
                            if (projectionKind != variance) {
                                KotlinType kotlinTypeSafeSubstitute = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(TypeConstructorSubstitution.Companion.create(kotlinType), false, 1, null).buildSubstitutor().safeSubstitute(upper, variance);
                                Intrinsics.checkNotNullExpressionValue(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
                                upper = CapturedTypeApproximationKt.approximateCapturedTypes(kotlinTypeSafeSubstitute).getUpper();
                                break;
                            }
                        }
                        upper = TypeConstructorSubstitution.Companion.create(kotlinType).buildSubstitutor().safeSubstitute(upper, Variance.INVARIANT);
                        Intrinsics.h(upper);
                    }
                    zIsMarkedNullable = zIsMarkedNullable || kotlinType.isMarkedNullable();
                }
                TypeConstructor constructor3 = upper.getConstructor();
                if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor)) {
                    return TypeUtils.makeNullableAsSpecified(upper, zIsMarkedNullable);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + a(constructor3) + ", \n\nsupertype: " + a(constructor) + " \n" + typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor));
            }
            for (KotlinType kotlinType2 : constructor2.getSupertypes()) {
                Intrinsics.h(kotlinType2);
                arrayDeque.add(new a(kotlinType2, aVar));
            }
        }
        return null;
    }
}
