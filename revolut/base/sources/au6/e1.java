package au6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9519a;

    public e1(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        this.f9519a = invoiceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e1) && Intrinsics.f(this.f9519a, ((e1) obj2).f9519a);
    }

    public final int hashCode() {
        return this.f9519a.hashCode();
    }
}
