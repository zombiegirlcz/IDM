package sf8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f262359a;

    public k(o documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f262359a = documentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f262359a == ((k) obj2).f262359a;
    }

    public final int hashCode() {
        return this.f262359a.hashCode();
    }
}
