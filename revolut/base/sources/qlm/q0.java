package qlm;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes13.dex */
public abstract class q0 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f247696a;

    public q0(SerialDescriptor serialDescriptor) {
        this.f247696a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor b(int i) {
        if (i >= 0) {
            return this.f247696a;
        }
        StringBuilder sbW = a0.d.w(i, "Illegal index ", ", ");
        sbW.append(e());
        sbW.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f247696a, q0Var.f247696a) && Intrinsics.f(e(), q0Var.e());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer numM = kotlin.text.z.m(name);
        if (numM != null) {
            return numM.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.bumptech.glide.d getKind() {
        return olm.k.f226488c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        if (i >= 0) {
            return zhm.f0.f322471a;
        }
        StringBuilder sbW = a0.d.w(i, "Illegal index ", ", ");
        sbW.append(e());
        sbW.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    public final int hashCode() {
        return e().hashCode() + (this.f247696a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbW = a0.d.w(i, "Illegal index ", ", ");
        sbW.append(e());
        sbW.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    public final String toString() {
        return e() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f247696a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
