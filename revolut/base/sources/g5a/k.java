package g5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq9.o f140708a;

    public k(jq9.o recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f140708a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f140708a, ((k) obj2).f140708a);
    }

    public final int hashCode() {
        return this.f140708a.hashCode();
    }
}
