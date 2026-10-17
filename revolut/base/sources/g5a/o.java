package g5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq9.p f140711a;

    public o(jq9.p recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f140711a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f140711a, ((o) obj2).f140711a);
    }

    public final int hashCode() {
        return this.f140711a.hashCode();
    }
}
