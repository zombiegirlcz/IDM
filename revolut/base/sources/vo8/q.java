package vo8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f290906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f290908c;

    public q(boolean z, String firstName, String username) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(username, "username");
        this.f290906a = z;
        this.f290907b = firstName;
        this.f290908c = username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f290906a == qVar.f290906a && Intrinsics.f(this.f290907b, qVar.f290907b) && Intrinsics.f(this.f290908c, qVar.f290908c);
    }

    public final int hashCode() {
        return this.f290908c.hashCode() + p.a.c(Boolean.hashCode(this.f290906a) * 31, 31, this.f290907b);
    }
}
