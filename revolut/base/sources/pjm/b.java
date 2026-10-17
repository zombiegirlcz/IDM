package pjm;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaClassDescriptor f236880b;

    public /* synthetic */ b(LazyJavaClassDescriptor lazyJavaClassDescriptor, int i) {
        this.f236879a = i;
        this.f236880b = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f236879a;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f236880b;
        switch (i) {
            case 0:
                LazyJavaClassDescriptor.Companion companion = LazyJavaClassDescriptor.Companion;
                ClassId classId = DescriptorUtilsKt.getClassId(lazyJavaClassDescriptor);
                if (classId != null) {
                    return lazyJavaClassDescriptor.f186969h.getComponents().getJavaModuleResolver().getAnnotationsForModuleOwnerOfClass(classId);
                }
                return null;
            case 1:
                List<JavaTypeParameter> typeParameters = lazyJavaClassDescriptor.i.getTypeParameters();
                ArrayList arrayList = new ArrayList(w.t(typeParameters, 10));
                for (JavaTypeParameter javaTypeParameter : typeParameters) {
                    TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaClassDescriptor.k.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
                    if (typeParameterDescriptorResolveTypeParameter == null) {
                        throw new AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + lazyJavaClassDescriptor.i + ", so it must be resolved");
                    }
                    arrayList.add(typeParameterDescriptorResolveTypeParameter);
                }
                return arrayList;
            default:
                return TypeParameterUtilsKt.computeConstructorTypeParameters(lazyJavaClassDescriptor);
        }
    }
}
