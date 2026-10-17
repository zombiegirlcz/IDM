package j71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171828a;

    public a(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f171828a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f171828a, ((a) obj2).f171828a);
    }

    public final int hashCode() {
        return this.f171828a.hashCode();
    }
}
