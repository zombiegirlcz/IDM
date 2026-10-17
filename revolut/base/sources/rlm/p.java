package rlm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import slm.i0;

/* JADX INFO: loaded from: classes14.dex */
public final class p extends kotlinx.serialization.json.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f255114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f255115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f255116c;

    public p(Object body, boolean z, SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f255114a = z;
        this.f255115b = serialDescriptor;
        this.f255116c = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // kotlinx.serialization.json.b
    public final String a() {
        return this.f255116c;
    }

    @Override // kotlinx.serialization.json.b
    public final boolean b() {
        return this.f255114a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || p.class != obj2.getClass()) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f255114a == pVar.f255114a && Intrinsics.f(this.f255116c, pVar.f255116c);
    }

    public final int hashCode() {
        return this.f255116c.hashCode() + (Boolean.hashCode(this.f255114a) * 31);
    }

    @Override // kotlinx.serialization.json.b
    public final String toString() {
        boolean z = this.f255114a;
        String str = this.f255116c;
        if (!z) {
            return str;
        }
        StringBuilder sb6 = new StringBuilder();
        i0.a(str, sb6);
        return sb6.toString();
    }
}
