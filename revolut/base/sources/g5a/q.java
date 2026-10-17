package g5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq9.p f140713a;

    public q(jq9.p recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f140713a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f140713a, ((q) obj2).f140713a);
    }

    public final int hashCode() {
        return this.f140713a.hashCode();
    }
}
