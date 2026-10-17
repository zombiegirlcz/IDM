package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import zhm.e0;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class Annotations$Companion$EMPTY$1 implements Annotations {
    public Void findAnnotation(FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public /* bridge */ boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        f0.f322471a.getClass();
        return e0.f322469a;
    }

    public String toString() {
        return "EMPTY";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ AnnotationDescriptor mo3787findAnnotation(FqName fqName) {
        return (AnnotationDescriptor) findAnnotation(fqName);
    }
}
