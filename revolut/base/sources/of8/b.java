package of8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import pf8.c;
import pf8.e;
import pf8.i;
import pf8.j;
import pf8.k;
import pf8.m;
import pf8.n;
import pf8.o;
import pf8.p;
import pf8.q;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pf8.a f224749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f224750c;
    public final e d;
    public final p e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f224751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pf8.b f224752h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f224753j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f224754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f224755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f224756n;
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f224757p;

    public b(String userId, pf8.a weeklyAllowance, o tasks, e monthlyTopupLimit, p vaults, n savings, c coparents, pf8.b cards, q qVar, k paymentLinks, j partnerships, m googlePay, m applePay, m p2pTransfers, m firstPartyNfcPayments, i multicurrency) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(weeklyAllowance, "weeklyAllowance");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(monthlyTopupLimit, "monthlyTopupLimit");
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(savings, "savings");
        Intrinsics.checkNotNullParameter(coparents, "coparents");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(paymentLinks, "paymentLinks");
        Intrinsics.checkNotNullParameter(partnerships, "partnerships");
        Intrinsics.checkNotNullParameter(googlePay, "googlePay");
        Intrinsics.checkNotNullParameter(applePay, "applePay");
        Intrinsics.checkNotNullParameter(p2pTransfers, "p2pTransfers");
        Intrinsics.checkNotNullParameter(firstPartyNfcPayments, "firstPartyNfcPayments");
        Intrinsics.checkNotNullParameter(multicurrency, "multicurrency");
        this.f224748a = userId;
        this.f224749b = weeklyAllowance;
        this.f224750c = tasks;
        this.d = monthlyTopupLimit;
        this.e = vaults;
        this.f = savings;
        this.f224751g = coparents;
        this.f224752h = cards;
        this.i = qVar;
        this.f224753j = paymentLinks;
        this.k = partnerships;
        this.f224754l = googlePay;
        this.f224755m = applePay;
        this.f224756n = p2pTransfers;
        this.o = firstPartyNfcPayments;
        this.f224757p = multicurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f224748a, bVar.f224748a) && Intrinsics.f(this.f224749b, bVar.f224749b) && Intrinsics.f(this.f224750c, bVar.f224750c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f224751g, bVar.f224751g) && Intrinsics.f(this.f224752h, bVar.f224752h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f224753j, bVar.f224753j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f224754l, bVar.f224754l) && Intrinsics.f(this.f224755m, bVar.f224755m) && Intrinsics.f(this.f224756n, bVar.f224756n) && Intrinsics.f(this.o, bVar.o) && Intrinsics.f(this.f224757p, bVar.f224757p);
    }

    public final int hashCode() {
        int iHashCode = (this.f224752h.hashCode() + ((this.f224751g.hashCode() + ((this.f.f235521a.hashCode() + ((this.e.f235523a.hashCode() + ((this.d.hashCode() + ((this.f224750c.f235522a.hashCode() + ((this.f224749b.f235504a.hashCode() + (this.f224748a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        q qVar = this.i;
        return this.f224757p.hashCode() + ((this.o.f235520a.hashCode() + ((this.f224756n.f235520a.hashCode() + ((this.f224755m.f235520a.hashCode() + ((this.f224754l.f235520a.hashCode() + ((this.k.f235517a.hashCode() + ((this.f224753j.f235518a.hashCode() + ((iHashCode + (qVar == null ? 0 : qVar.f235524a.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
