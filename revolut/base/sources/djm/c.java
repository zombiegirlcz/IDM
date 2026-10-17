package djm;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f115406b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f115407c = new c(1);
    public static final c d = new c(2);
    public static final c e = new c(3);
    public static final c f = new c(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115408a;

    public /* synthetic */ c(int i) {
        this.f115408a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f115408a) {
            case 0:
                Intrinsics.checkNotNullParameter((ClassId) obj2, "it");
                return 0;
            case 1:
                PackageFragmentDescriptor it8 = (PackageFragmentDescriptor) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.getFqName();
            case 2:
                DeclarationDescriptor it9 = (DeclarationDescriptor) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9 instanceof CallableDescriptor);
            case 3:
                DeclarationDescriptor it10 = (DeclarationDescriptor) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(!(it10 instanceof ConstructorDescriptor));
            default:
                DeclarationDescriptor it11 = (DeclarationDescriptor) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) it11).getTypeParameters();
                Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
                return d0.Q(typeParameters);
        }
    }
}
