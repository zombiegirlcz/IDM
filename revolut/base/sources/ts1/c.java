package ts1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.c f273922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.m f273923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f273924c;

    public c(a12.c contactsInfo, a12.m transactionsInfo, e subscriptionsInfo) {
        Intrinsics.checkNotNullParameter(contactsInfo, "contactsInfo");
        Intrinsics.checkNotNullParameter(transactionsInfo, "transactionsInfo");
        Intrinsics.checkNotNullParameter(subscriptionsInfo, "subscriptionsInfo");
        this.f273922a = contactsInfo;
        this.f273923b = transactionsInfo;
        this.f273924c = subscriptionsInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f273922a, cVar.f273922a) && Intrinsics.f(this.f273923b, cVar.f273923b) && Intrinsics.f(this.f273924c, cVar.f273924c);
    }

    public final int hashCode() {
        return this.f273924c.f273925a.hashCode() + ((this.f273923b.hashCode() + (this.f273922a.f468a.hashCode() * 31)) * 31);
    }
}
