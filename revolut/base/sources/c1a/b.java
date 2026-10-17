package c1a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20432b;

    public b(String type, String referenceId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        this.f20431a = type;
        this.f20432b = referenceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f20431a, bVar.f20431a) && Intrinsics.f(this.f20432b, bVar.f20432b);
    }

    public final int hashCode() {
        return this.f20432b.hashCode() + (this.f20431a.hashCode() * 31);
    }
}
