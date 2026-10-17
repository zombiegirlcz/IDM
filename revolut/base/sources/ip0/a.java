package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb0 f163355b;

    public a(boolean z, lb0 rowDelegatePayload) {
        Intrinsics.checkNotNullParameter(rowDelegatePayload, "rowDelegatePayload");
        this.f163354a = z;
        this.f163355b = rowDelegatePayload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f163354a == aVar.f163354a && Intrinsics.f(this.f163355b, aVar.f163355b);
    }

    public final int hashCode() {
        return this.f163355b.hashCode() + (Boolean.hashCode(this.f163354a) * 31);
    }
}
