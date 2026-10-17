package rjm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f254698b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f254699c = new e(1);
    public static final e d = new e(2);
    public static final e e = new e(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254700a;

    public /* synthetic */ e(int i) {
        this.f254700a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f254700a) {
            case 0:
                CallableMemberDescriptor it8 = (CallableMemberDescriptor) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ReceiverParameterDescriptor extensionReceiverParameter = it8.getExtensionReceiverParameter();
                Intrinsics.h(extensionReceiverParameter);
                KotlinType type = extensionReceiverParameter.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return type;
            case 1:
                CallableMemberDescriptor it9 = (CallableMemberDescriptor) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                KotlinType returnType = it9.getReturnType();
                Intrinsics.h(returnType);
                return returnType;
            case 2:
                UnwrappedType it10 = (UnwrappedType) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10 instanceof RawType);
            default:
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((UnwrappedType) obj2).getConstructor().mo3795getDeclarationDescriptor();
                if (classifierDescriptorMo3795getDeclarationDescriptor == null) {
                    return Boolean.FALSE;
                }
                Name name = classifierDescriptorMo3795getDeclarationDescriptor.getName();
                JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
                return Boolean.valueOf(Intrinsics.f(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.f(DescriptorUtilsKt.fqNameOrNull(classifierDescriptorMo3795getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME()));
        }
    }
}
