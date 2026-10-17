package o0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221235a;

    public h(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f221235a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f221235a, ((h) obj2).f221235a);
    }

    public final int hashCode() {
        return this.f221235a.hashCode();
    }
}
