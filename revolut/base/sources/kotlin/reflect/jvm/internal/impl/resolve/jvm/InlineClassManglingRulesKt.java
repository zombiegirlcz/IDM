package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class InlineClassManglingRulesKt {
    public static final boolean a(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = kotlinType.getConstructor().mo3795getDeclarationDescriptor();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo3795getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo3795getDeclarationDescriptor : null;
        if (typeParameterDescriptor == null) {
            return false;
        }
        KotlinType representativeUpperBound = TypeUtilsKt.getRepresentativeUpperBound(typeParameterDescriptor);
        return isValueClassThatRequiresMangling(representativeUpperBound) || a(representativeUpperBound);
    }

    public static final boolean isValueClassThatRequiresMangling(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return InlineClassesUtilsKt.isValueClass(declarationDescriptor) && !Intrinsics.f(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) declarationDescriptor), StandardNames.RESULT_FQ_NAME);
    }

    public static final boolean shouldHideConstructorDueToValueClassTypeValueParameters(@NotNull CallableMemberDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ClassConstructorDescriptor classConstructorDescriptor = descriptor instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) descriptor : null;
        if (classConstructorDescriptor == null || DescriptorVisibilities.isPrivate(classConstructorDescriptor.getVisibility())) {
            return false;
        }
        ClassDescriptor constructedClass = classConstructorDescriptor.getConstructedClass();
        Intrinsics.checkNotNullExpressionValue(constructedClass, "getConstructedClass(...)");
        if (InlineClassesUtilsKt.isValueClass(constructedClass) || DescriptorUtils.isSealedClass(classConstructorDescriptor.getConstructedClass())) {
            return false;
        }
        List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it8.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (isValueClassThatRequiresMangling(type) || a(type)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isValueClassThatRequiresMangling(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = kotlinType.getConstructor().mo3795getDeclarationDescriptor();
        return classifierDescriptorMo3795getDeclarationDescriptor != null && ((InlineClassesUtilsKt.isInlineClass(classifierDescriptorMo3795getDeclarationDescriptor) && isValueClassThatRequiresMangling(classifierDescriptorMo3795getDeclarationDescriptor)) || InlineClassesUtilsKt.needsMfvcFlattening(kotlinType));
    }
}
