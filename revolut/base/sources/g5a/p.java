package g5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq9.k f140712a;

    public p(jq9.k recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f140712a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f140712a, ((p) obj2).f140712a);
    }

    public final int hashCode() {
        return this.f140712a.hashCode();
    }
}
