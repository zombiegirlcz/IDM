package qjm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaTypeResolver f246919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeParameterDescriptor f246920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JavaTypeAttributes f246921c;
    public final TypeConstructor d;
    public final JavaClassifierType e;

    public a(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        this.f246919a = javaTypeResolver;
        this.f246920b = typeParameterDescriptor;
        this.f246921c = javaTypeAttributes;
        this.d = typeConstructor;
        this.e = javaClassifierType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.f246919a.d;
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = this.d.mo3795getDeclarationDescriptor();
        return typeParameterUpperBoundEraser.getErasedUpperBound(this.f246920b, this.f246921c.withDefaultType(classifierDescriptorMo3795getDeclarationDescriptor != null ? classifierDescriptorMo3795getDeclarationDescriptor.getDefaultType() : null).markIsRaw(this.e.isRaw()));
    }
}
