package g5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq9.s f140710a;

    public m(jq9.s recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f140710a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f140710a, ((m) obj2).f140710a);
    }

    public final int hashCode() {
        return this.f140710a.hashCode();
    }
}
