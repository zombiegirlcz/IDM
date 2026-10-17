package xjm;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends ClassConstructorDescriptorImpl {
    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "containingClass";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
