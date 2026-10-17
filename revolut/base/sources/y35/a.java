package y35;

import aii.e;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import x35.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f310682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f310683b;

    public a(b account, d dVar) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f310682a = account;
        this.f310683b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f310682a, aVar.f310682a) && Intrinsics.f(this.f310683b, aVar.f310683b);
    }

    public final int hashCode() {
        int iHashCode = this.f310682a.hashCode() * 31;
        d dVar = this.f310683b;
        return Boolean.hashCode(false) + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 29791);
    }
}
