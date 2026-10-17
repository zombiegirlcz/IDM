package qlm;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class g0 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f247645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SerialDescriptor f247646c;

    public g0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f247644a = str;
        this.f247645b = serialDescriptor;
        this.f247646c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(v0.a.i(a0.d.w(i, "Illegal index ", ", "), this.f247644a, " expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f247645b;
        }
        if (i2 == 1) {
            return this.f247646c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.f247644a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f247644a, g0Var.f247644a) && Intrinsics.f(this.f247645b, g0Var.f247645b) && Intrinsics.f(this.f247646c, g0Var.f247646c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer numM = kotlin.text.z.m(name);
        if (numM != null) {
            return numM.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.bumptech.glide.d getKind() {
        return olm.k.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        if (i >= 0) {
            return zhm.f0.f322471a;
        }
        throw new IllegalArgumentException(v0.a.i(a0.d.w(i, "Illegal index ", ", "), this.f247644a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f247646c.hashCode() + ((this.f247645b.hashCode() + (this.f247644a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(v0.a.i(a0.d.w(i, "Illegal index ", ", "), this.f247644a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f247644a + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f247645b + ", " + this.f247646c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
