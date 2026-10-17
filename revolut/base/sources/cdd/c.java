package cdd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f23238b;

    public c(b user, a token) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f23237a = user;
        this.f23238b = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f23237a, cVar.f23237a) && Intrinsics.f(this.f23238b, cVar.f23238b);
    }

    public final int hashCode() {
        return this.f23238b.hashCode() + (this.f23237a.hashCode() * 31);
    }
}
