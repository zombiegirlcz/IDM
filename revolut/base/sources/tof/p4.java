package tof;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f272987b;

    public p4(String recipientId, List fields) {
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f272986a = recipientId;
        this.f272987b = fields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj2;
        return Intrinsics.f(this.f272986a, p4Var.f272986a) && Intrinsics.f(this.f272987b, p4Var.f272987b);
    }

    public final int hashCode() {
        return this.f272987b.hashCode() + (this.f272986a.hashCode() * 31);
    }
}
