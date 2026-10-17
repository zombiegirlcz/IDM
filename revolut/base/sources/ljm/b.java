package ljm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f196153b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f196154c = new b(1);
    public static final b d = new b(2);
    public static final b e = new b(3);
    public static final b f = new b(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f196155g = new b(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f196156h = new b(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196157a;

    public /* synthetic */ b(int i) {
        this.f196157a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = false;
        switch (this.f196157a) {
            case 0:
                CallableMemberDescriptor it8 = (CallableMemberDescriptor) obj2;
                BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getClass();
                return Boolean.valueOf(d0.T(SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), MethodSignatureMappingKt.computeJvmSignature(it8)));
            case 1:
                CallableMemberDescriptor it9 = (CallableMemberDescriptor) obj2;
                BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature2 = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 instanceof FunctionDescriptor) {
                    BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getClass();
                    if (d0.T(SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), MethodSignatureMappingKt.computeJvmSignature(it9))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                CallableMemberDescriptor it10 = (CallableMemberDescriptor) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(ClassicBuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(it10));
            case 3:
                return ((ValueParameterDescriptor) obj2).getType();
            case 4:
                CallableMemberDescriptor it11 = (CallableMemberDescriptor) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(ClassicBuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(DescriptorUtilsKt.getPropertyIfAccessor(it11)));
            case 5:
                CallableMemberDescriptor it12 = (CallableMemberDescriptor) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(BuiltinMethodsWithDifferentJvmName.INSTANCE.isBuiltinFunctionWithDifferentNameInJvm((SimpleFunctionDescriptor) it12));
            default:
                CallableMemberDescriptor it13 = (CallableMemberDescriptor) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                if (KotlinBuiltIns.isBuiltIn(it13) && BuiltinMethodsWithSpecialGenericSignature.getSpecialSignatureInfo(it13) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
