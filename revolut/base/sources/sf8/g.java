package sf8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f262356a;

    public g(o documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f262356a = documentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f262356a == ((g) obj2).f262356a;
    }

    public final int hashCode() {
        return this.f262356a.hashCode();
    }

    public g() {
        this(o.PLACE_OF_BIRTH);
    }
}
