package oqb;

import kotlin.jvm.internal.Intrinsics;
import mm0.q;
import rl0.b;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f227876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f227877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f227878c;

    public a(q token, b credentials, q qVar) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        this.f227876a = token;
        this.f227877b = credentials;
        this.f227878c = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f227876a, aVar.f227876a) && Intrinsics.f(this.f227877b, aVar.f227877b) && Intrinsics.f(this.f227878c, aVar.f227878c);
    }

    public final int hashCode() {
        int iHashCode = (this.f227877b.hashCode() + (this.f227876a.hashCode() * 31)) * 31;
        q qVar = this.f227878c;
        return iHashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public final String toString() {
        return p.a.p("SessionSnapshot(tokenId=", this.f227876a.f207120a, ")");
    }
}
