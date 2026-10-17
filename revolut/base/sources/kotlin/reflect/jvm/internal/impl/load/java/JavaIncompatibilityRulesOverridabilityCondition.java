package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.f(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r0), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r3)) == false) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType a(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r5) {
            /*
                boolean r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.forceSingleValueParameterBoxing(r4)
                java.lang.String r1 = "getType(...)"
                if (r0 != 0) goto L6a
                java.util.List r0 = r4.getValueParameters()
                int r0 = r0.size()
                r2 = 1
                if (r0 == r2) goto L14
                goto L5e
            L14:
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r4.getContainingDeclaration()
                boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
                r3 = 0
                if (r2 == 0) goto L20
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r0
                goto L21
            L20:
                r0 = r3
            L21:
                if (r0 != 0) goto L24
                goto L5e
            L24:
                java.util.List r4 = r4.getValueParameters()
                java.lang.String r2 = "getValueParameters(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
                java.lang.Object r4 = zhm.d0.K0(r4)
                kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r4
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r4.getType()
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r4 = r4.getConstructor()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r4 = r4.mo3795getDeclarationDescriptor()
                boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
                if (r2 == 0) goto L46
                r3 = r4
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
            L46:
                if (r3 != 0) goto L49
                goto L5e
            L49:
                boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveClass(r0)
                if (r4 == 0) goto L5e
                kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r0)
                kotlin.reflect.jvm.internal.impl.name.FqName r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r3)
                boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r0)
                if (r4 == 0) goto L5e
                goto L6a
            L5e:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r5.getType()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.mapToJvmType(r4)
                return r4
            L6a:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r5.getType()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(r4)
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.mapToJvmType(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion.a(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor):kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType");
        }

        public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(@NotNull CallableDescriptor superDescriptor, @NotNull CallableDescriptor subDescriptor) {
            Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
            Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
            if (!(subDescriptor instanceof JavaMethodDescriptor) || !(superDescriptor instanceof FunctionDescriptor)) {
                return false;
            }
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
            javaMethodDescriptor.getValueParameters().size();
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) superDescriptor;
            functionDescriptor.getValueParameters().size();
            List<ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getOriginal().getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
            List<ValueParameterDescriptor> valueParameters2 = functionDescriptor.getOriginal().getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
            for (Pair pair : d0.l1(valueParameters, valueParameters2)) {
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.f186385a;
                ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) pair.f186386b;
                Intrinsics.h(valueParameterDescriptor);
                boolean z = a((FunctionDescriptor) subDescriptor, valueParameterDescriptor) instanceof JvmType.Primitive;
                Intrinsics.h(valueParameterDescriptor2);
                if (z != (a(functionDescriptor, valueParameterDescriptor2) instanceof JvmType.Primitive)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r1, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r2, false, false, 2, null)) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result isOverridable(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r8, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r9) {
        /*
            r6 = this;
            java.lang.String r0 = "superDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "subDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r0 == 0) goto La8
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r0 == 0) goto La8
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(r8)
            if (r0 == 0) goto L1a
            goto La8
        L1a:
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE
            r1 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r1
            kotlin.reflect.jvm.internal.impl.name.Name r2 = r1.getName()
            java.lang.String r3 = "getName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r0 = r0.getSameAsBuiltinMethodWithErasedValueParameters(r2)
            if (r0 != 0) goto L3f
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$Companion r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion
            kotlin.reflect.jvm.internal.impl.name.Name r2 = r1.getName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r0 = r0.getSameAsRenamedInJvmBuiltin(r2)
            if (r0 != 0) goto L3f
            goto La8
        L3f:
            r0 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenSpecialBuiltin(r0)
            boolean r2 = r7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            r3 = 0
            if (r2 == 0) goto L4f
            r4 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r4
            goto L50
        L4f:
            r4 = r3
        L50:
            if (r4 == 0) goto L5d
            boolean r5 = r1.isHiddenToOvercomeSignatureClash()
            boolean r4 = r4.isHiddenToOvercomeSignatureClash()
            if (r5 != r4) goto L5d
            goto L66
        L5d:
            if (r0 == 0) goto La5
            boolean r4 = r1.isHiddenToOvercomeSignatureClash()
            if (r4 != 0) goto L66
            goto La5
        L66:
            boolean r4 = r9 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor
            if (r4 == 0) goto La8
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4 = r1.getInitialSignatureDescriptor()
            if (r4 == 0) goto L71
            goto La8
        L71:
            if (r0 == 0) goto La8
            boolean r9 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(r9, r0)
            if (r9 == 0) goto L7a
            goto La8
        L7a:
            boolean r9 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r9 == 0) goto La5
            if (r2 == 0) goto La5
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r9 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(r0)
            if (r9 == 0) goto La5
            r9 = 0
            r0 = 2
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r1, r9, r9, r0, r3)
            r2 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r2
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r2 = r2.getOriginal()
            java.lang.String r4 = "getOriginal(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.String r9 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r2, r9, r9, r0, r3)
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r1, r9)
            if (r9 == 0) goto La5
            goto La8
        La5:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r7 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            return r7
        La8:
            kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition$Companion r9 = kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion
            boolean r7 = r9.doesJavaOverrideHaveIncompatibleValueParameterKinds(r7, r8)
            if (r7 == 0) goto Lb3
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r7 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            return r7
        Lb3:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r7 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.isOverridable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result");
    }
}
