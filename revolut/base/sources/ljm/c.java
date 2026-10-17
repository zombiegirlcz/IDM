package ljm;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends DelegatedDescriptorVisibility {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f196158b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Visibility visibility, int i) {
        super(visibility);
        this.f196158b = i;
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "fromPackage";
        } else if (i != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "myPackage";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
        if (i == 2 || i == 3) {
            objArr[2] = "visibleFromPackage";
        } else {
            objArr[2] = "isVisible";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void b(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void c(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public final boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
        switch (this.f196158b) {
            case 0:
                if (declarationDescriptorWithVisibility == null) {
                    a(0);
                    throw null;
                }
                if (declarationDescriptor != null) {
                    return JavaDescriptorVisibilities.c(declarationDescriptorWithVisibility, declarationDescriptor);
                }
                a(1);
                throw null;
            case 1:
                if (declarationDescriptorWithVisibility == null) {
                    b(0);
                    throw null;
                }
                if (declarationDescriptor != null) {
                    return JavaDescriptorVisibilities.b(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
                }
                b(1);
                throw null;
            default:
                if (declarationDescriptorWithVisibility == null) {
                    c(0);
                    throw null;
                }
                if (declarationDescriptor != null) {
                    return JavaDescriptorVisibilities.b(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
                }
                c(1);
                throw null;
        }
    }
}
