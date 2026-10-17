package mr8;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f208074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f208075c;
    public final DateTime d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f208076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f208077h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f208078j;
    public final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f208079l;

    public b(String id10, dj0.d amount, e state, DateTime createdDate, String transactionId, String transactionWalletId, String transactionPocketId, String str, String str2, a sender, a recipient, d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionWalletId, "transactionWalletId");
        Intrinsics.checkNotNullParameter(transactionPocketId, "transactionPocketId");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f208073a = id10;
        this.f208074b = amount;
        this.f208075c = state;
        this.d = createdDate;
        this.e = transactionId;
        this.f = transactionWalletId;
        this.f208076g = transactionPocketId;
        this.f208077h = str;
        this.i = str2;
        this.f208078j = sender;
        this.k = recipient;
        this.f208079l = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f208073a, bVar.f208073a) && Intrinsics.f(this.f208074b, bVar.f208074b) && this.f208075c == bVar.f208075c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f208076g, bVar.f208076g) && Intrinsics.f(this.f208077h, bVar.f208077h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f208078j, bVar.f208078j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f208079l, bVar.f208079l);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(m72.b.f(this.d, (this.f208075c.hashCode() + v7.c(this.f208073a.hashCode() * 31, 31, this.f208074b)) * 31, 31), 31, this.e), 31, this.f), 31, this.f208076g);
        String str = this.f208077h;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (this.k.hashCode() + ((this.f208078j.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        d dVar = this.f208079l;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
