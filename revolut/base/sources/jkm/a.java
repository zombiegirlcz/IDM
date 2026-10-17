package jkm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f175516b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f175517c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175518a;

    public /* synthetic */ a(int i) {
        this.f175518a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        UnwrappedType it8 = (UnwrappedType) obj2;
        switch (this.f175518a) {
            case 0:
                return Boolean.valueOf(TypeUtils.isTypeParameter(it8));
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = it8.getConstructor().mo3795getDeclarationDescriptor();
                return Boolean.valueOf(classifierDescriptorMo3795getDeclarationDescriptor != null ? TypeUtilsKt.isTypeAliasParameter(classifierDescriptorMo3795getDeclarationDescriptor) : false);
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor2 = it8.getConstructor().mo3795getDeclarationDescriptor();
                return Boolean.valueOf(classifierDescriptorMo3795getDeclarationDescriptor2 != null && ((classifierDescriptorMo3795getDeclarationDescriptor2 instanceof TypeAliasDescriptor) || (classifierDescriptorMo3795getDeclarationDescriptor2 instanceof TypeParameterDescriptor)));
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf((it8 instanceof StubTypeForBuilderInference) || (it8.getConstructor() instanceof TypeVariableTypeConstructorMarker) || KotlinTypeKt.isError(it8));
        }
    }
}
