package oq9;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f227802c;
    public final o d;
    public final o e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f227803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f227804h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f227805j;
    public final String k;

    public a0(String id10, String groupId, b0 type, o payer, o payee, o createdBy, dj0.d amount, dj0.d dVar, DateTime createdDate, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(payer, "payer");
        Intrinsics.checkNotNullParameter(payee, "payee");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f227800a = id10;
        this.f227801b = groupId;
        this.f227802c = type;
        this.d = payer;
        this.e = payee;
        this.f = createdBy;
        this.f227803g = amount;
        this.f227804h = dVar;
        this.i = createdDate;
        this.f227805j = str;
        this.k = str2;
    }

    @Override // oq9.c0
    public final dj0.d a() {
        return this.f227803g;
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
        return this.f227804h;
    }

    @Override // oq9.c0
    public final String e() {
        return this.f227801b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f227800a, a0Var.f227800a) && Intrinsics.f(this.f227801b, a0Var.f227801b) && this.f227802c == a0Var.f227802c && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f) && Intrinsics.f(this.f227803g, a0Var.f227803g) && Intrinsics.f(this.f227804h, a0Var.f227804h) && Intrinsics.f(this.i, a0Var.i) && Intrinsics.f(this.f227805j, a0Var.f227805j) && Intrinsics.f(this.k, a0Var.k);
    }

    @Override // oq9.c0
    public final o f() {
        return this.e;
    }

    @Override // oq9.c0
    public final String getId() {
        return this.f227800a;
    }

    @Override // oq9.c0
    public final o h() {
        return this.d;
    }

    public final int hashCode() {
        int iC = v7.c(okl.m.d(this.f, okl.m.d(this.e, okl.m.d(this.d, (this.f227802c.hashCode() + p.a.c(this.f227800a.hashCode() * 31, 31, this.f227801b)) * 31, 31), 31), 31), 31, this.f227803g);
        dj0.d dVar = this.f227804h;
        int iF = m72.b.f(this.i, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        String str = this.f227805j;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // oq9.c0
    public final String i() {
        return this.f227805j;
    }

    @Override // oq9.c0
    public final b0 k() {
        return this.f227802c;
    }
}
