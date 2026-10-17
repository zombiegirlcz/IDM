package qlm;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes13.dex */
public final class n1 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final olm.f f247683b;

    public n1(String serialName, olm.f kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f247682a = serialName;
        this.f247683b = kind;
    }

    public final void a() {
        throw new IllegalStateException(v0.a.i(new StringBuilder("Primitive descriptor "), this.f247682a, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor b(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.f247682a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f247682a, n1Var.f247682a) && Intrinsics.f(this.f247683b, n1Var.f247683b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.bumptech.glide.d getKind() {
        return this.f247683b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        a();
        throw null;
    }

    public final int hashCode() {
        return (this.f247683b.hashCode() * 31) + this.f247682a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        a();
        throw null;
    }

    public final String toString() {
        return j6.a.u(new StringBuilder("PrimitiveDescriptor("), this.f247682a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
