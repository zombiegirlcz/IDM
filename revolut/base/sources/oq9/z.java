package oq9;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f227871c;
    public final o d;
    public final o e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f227872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f227873h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f227874j;

    public z(String id10, String groupId, b0 type, o payer, o payee, o createdBy, dj0.d amount, dj0.d dVar, DateTime createdDate, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(payer, "payer");
        Intrinsics.checkNotNullParameter(payee, "payee");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f227869a = id10;
        this.f227870b = groupId;
        this.f227871c = type;
        this.d = payer;
        this.e = payee;
        this.f = createdBy;
        this.f227872g = amount;
        this.f227873h = dVar;
        this.i = createdDate;
        this.f227874j = str;
    }

    @Override // oq9.c0
    public final dj0.d a() {
        return this.f227872g;
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
        return this.f227873h;
    }

    @Override // oq9.c0
    public final String e() {
        return this.f227870b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f227869a, zVar.f227869a) && Intrinsics.f(this.f227870b, zVar.f227870b) && this.f227871c == zVar.f227871c && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f227872g, zVar.f227872g) && Intrinsics.f(this.f227873h, zVar.f227873h) && Intrinsics.f(this.i, zVar.i) && Intrinsics.f(this.f227874j, zVar.f227874j);
    }

    @Override // oq9.c0
    public final o f() {
        return this.e;
    }

    @Override // oq9.c0
    public final String getId() {
        return this.f227869a;
    }

    @Override // oq9.c0
    public final o h() {
        return this.d;
    }

    public final int hashCode() {
        int iC = v7.c(okl.m.d(this.f, okl.m.d(this.e, okl.m.d(this.d, (this.f227871c.hashCode() + p.a.c(this.f227869a.hashCode() * 31, 31, this.f227870b)) * 31, 31), 31), 31), 31, this.f227872g);
        dj0.d dVar = this.f227873h;
        int iF = m72.b.f(this.i, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        String str = this.f227874j;
        return iF + (str != null ? str.hashCode() : 0);
    }

    @Override // oq9.c0
    public final String i() {
        return this.f227874j;
    }

    @Override // oq9.c0
    public final b0 k() {
        return this.f227871c;
    }
}
