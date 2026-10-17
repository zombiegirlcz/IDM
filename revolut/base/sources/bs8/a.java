package bs8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f18077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f18078c;

    public a(String id10, e pocketType, dj0.d balance) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f18076a = id10;
        this.f18077b = pocketType;
        this.f18078c = balance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f18076a, aVar.f18076a) && Intrinsics.f(this.f18077b, aVar.f18077b) && Intrinsics.f(this.f18078c, aVar.f18078c);
    }

    public final int hashCode() {
        return this.f18078c.hashCode() + ((this.f18077b.hashCode() + (this.f18076a.hashCode() * 31)) * 31);
    }
}
