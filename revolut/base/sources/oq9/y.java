package oq9;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f227865c;
    public final o d;
    public final o e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f227866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f227867h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f227868j;

    public y(String id10, String groupId, b0 type, o payer, o payee, o createdBy, dj0.d amount, dj0.d dVar, DateTime createdDate, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(payer, "payer");
        Intrinsics.checkNotNullParameter(payee, "payee");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f227863a = id10;
        this.f227864b = groupId;
        this.f227865c = type;
        this.d = payer;
        this.e = payee;
        this.f = createdBy;
        this.f227866g = amount;
        this.f227867h = dVar;
        this.i = createdDate;
        this.f227868j = str;
    }

    @Override // oq9.c0
    public final dj0.d a() {
        return this.f227866g;
    }

    @Override // oq9.c0
    public final o b() {
        return this.f;
    }

    @Override // oq9.c0
    public final DateTime c() {
        return this.i;
    }

    @Override // oq9.c0
    public final dj0.d d() {
        return this.f227867h;
    }

    @Override // oq9.c0
    public final String e() {
        return this.f227864b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f227863a, yVar.f227863a) && Intrinsics.f(this.f227864b, yVar.f227864b) && this.f227865c == yVar.f227865c && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f227866g, yVar.f227866g) && Intrinsics.f(this.f227867h, yVar.f227867h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f227868j, yVar.f227868j);
    }

    @Override // oq9.c0
    public final o f() {
        return this.e;
    }

    @Override // oq9.c0
    public final String getId() {
        return this.f227863a;
    }

    @Override // oq9.c0
    public final o h() {
        return this.d;
    }

    public final int hashCode() {
        int iC = v7.c(okl.m.d(this.f, okl.m.d(this.e, okl.m.d(this.d, (this.f227865c.hashCode() + p.a.c(this.f227863a.hashCode() * 31, 31, this.f227864b)) * 31, 31), 31), 31), 31, this.f227866g);
        dj0.d dVar = this.f227867h;
        int iF = m72.b.f(this.i, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        String str = this.f227868j;
        return iF + (str != null ? str.hashCode() : 0);
    }

    @Override // oq9.c0
    public final String i() {
        return this.f227868j;
    }

    @Override // oq9.c0
    public final b0 k() {
        return this.f227865c;
    }
}
