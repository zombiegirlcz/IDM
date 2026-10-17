package akm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f6127a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        DeclarationDescriptor it8 = (DeclarationDescriptor) obj2;
        int i = DescriptorUtilsKt.f187593a;
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.getContainingDeclaration();
    }
}
