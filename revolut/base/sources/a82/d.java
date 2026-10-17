package a82;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.c f1999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.m f2000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f2001c;
    public final b d;

    public d(a12.c contactsInfo, a12.m transactionsInfo, g withdrawalsInfo, b cardInfo) {
        Intrinsics.checkNotNullParameter(contactsInfo, "contactsInfo");
        Intrinsics.checkNotNullParameter(transactionsInfo, "transactionsInfo");
        Intrinsics.checkNotNullParameter(withdrawalsInfo, "withdrawalsInfo");
        Intrinsics.checkNotNullParameter(cardInfo, "cardInfo");
        this.f1999a = contactsInfo;
        this.f2000b = transactionsInfo;
        this.f2001c = withdrawalsInfo;
        this.d = cardInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f1999a, dVar.f1999a) && Intrinsics.f(this.f2000b, dVar.f2000b) && Intrinsics.f(this.f2001c, dVar.f2001c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f2001c.hashCode() + ((this.f2000b.hashCode() + (this.f1999a.f468a.hashCode() * 31)) * 31)) * 31);
    }
}
