package gkm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;

/* JADX INFO: loaded from: classes14.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeParameterDescriptor f144526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ErasureTypeAttributes f144527b;

    public j(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        this.f144526a = typeParameter;
        this.f144527b = typeAttr;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(jVar.f144526a, this.f144526a) && Intrinsics.f(jVar.f144527b, this.f144527b);
    }

    public final int hashCode() {
        int iHashCode = this.f144526a.hashCode();
        return this.f144527b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f144526a + ", typeAttr=" + this.f144527b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
