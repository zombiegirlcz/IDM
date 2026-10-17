package he8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd8.f f151596a;

    public c(vd8.f invitationApplication) {
        Intrinsics.checkNotNullParameter(invitationApplication, "invitationApplication");
        this.f151596a = invitationApplication;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f151596a, ((c) obj2).f151596a);
    }

    public final int hashCode() {
        return this.f151596a.hashCode();
    }
}
