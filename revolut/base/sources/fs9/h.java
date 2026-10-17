package fs9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137660a;

    public h(String inviteLink) {
        Intrinsics.checkNotNullParameter(inviteLink, "inviteLink");
        this.f137660a = inviteLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f137660a, ((h) obj2).f137660a);
    }

    public final int hashCode() {
        return this.f137660a.hashCode();
    }
}
