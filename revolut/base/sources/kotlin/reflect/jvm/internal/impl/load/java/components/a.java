package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements SignaturePropagator {
    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        if (i == 5 || i == 6) {
            objArr[2] = "reportSignatureErrors";
        } else {
            objArr[2] = "resolvePropagatedSignature";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
    public final void reportSignatureErrors(CallableMemberDescriptor callableMemberDescriptor, List list) {
        if (callableMemberDescriptor == null) {
            a(5);
            throw null;
        }
        if (list != null) {
            throw new UnsupportedOperationException("Should not be called");
        }
        a(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
    public final SignaturePropagator.PropagatedSignature resolvePropagatedSignature(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, KotlinType kotlinType2, List list, List list2) {
        if (javaMethod == null) {
            a(0);
            throw null;
        }
        if (classDescriptor == null) {
            a(1);
            throw null;
        }
        if (kotlinType == null) {
            a(2);
            throw null;
        }
        if (list == null) {
            a(3);
            throw null;
        }
        if (list2 != null) {
            return new SignaturePropagator.PropagatedSignature(kotlinType, kotlinType2, list, list2, Collections.EMPTY_LIST, false);
        }
        a(4);
        throw null;
    }
}
