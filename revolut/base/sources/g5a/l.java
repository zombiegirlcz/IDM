package g5a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jq9.s f140709a;

    public l(jq9.s recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f140709a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f140709a, ((l) obj2).f140709a);
    }

    public final int hashCode() {
        return this.f140709a.hashCode();
    }
}
