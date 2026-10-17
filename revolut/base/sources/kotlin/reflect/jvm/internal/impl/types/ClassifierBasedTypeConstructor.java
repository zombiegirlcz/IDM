package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187765a;

    public abstract boolean a(ClassifierDescriptor classifierDescriptor);

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if ((obj2 instanceof TypeConstructor) && obj2.hashCode() == hashCode()) {
            TypeConstructor typeConstructor = (TypeConstructor) obj2;
            if (typeConstructor.getParameters().size() == getParameters().size()) {
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = mo3795getDeclarationDescriptor();
                ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor2 = typeConstructor.mo3795getDeclarationDescriptor();
                if (classifierDescriptorMo3795getDeclarationDescriptor2 == null || ErrorUtils.isError(classifierDescriptorMo3795getDeclarationDescriptor) || DescriptorUtils.isLocal(classifierDescriptorMo3795getDeclarationDescriptor) || ErrorUtils.isError(classifierDescriptorMo3795getDeclarationDescriptor2) || DescriptorUtils.isLocal(classifierDescriptorMo3795getDeclarationDescriptor2)) {
                    return false;
                }
                return a(classifierDescriptorMo3795getDeclarationDescriptor2);
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract ClassifierDescriptor mo3795getDeclarationDescriptor();

    public int hashCode() {
        int i = this.f187765a;
        if (i != 0) {
            return i;
        }
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = mo3795getDeclarationDescriptor();
        int iIdentityHashCode = (ErrorUtils.isError(classifierDescriptorMo3795getDeclarationDescriptor) || DescriptorUtils.isLocal(classifierDescriptorMo3795getDeclarationDescriptor)) ? System.identityHashCode(this) : DescriptorUtils.getFqName(classifierDescriptorMo3795getDeclarationDescriptor).hashCode();
        this.f187765a = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
