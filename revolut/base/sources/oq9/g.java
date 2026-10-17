package oq9;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f227817c;
    public final dj0.d d;
    public final dj0.d e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f227818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f227819h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f227820j;
    public final String k;

    public g(String id10, String groupId, String title, dj0.d amount, dj0.d dVar, DateTime createDate, o owner, o createdBy, ArrayList splits, ArrayList arrayList, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(createDate, "createDate");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(splits, "splits");
        this.f227815a = id10;
        this.f227816b = groupId;
        this.f227817c = title;
        this.d = amount;
        this.e = dVar;
        this.f = createDate;
        this.f227818g = owner;
        this.f227819h = createdBy;
        this.i = splits;
        this.f227820j = arrayList;
        this.k = str;
    }

    @Override // oq9.i
    public final dj0.d a() {
        return this.d;
    }

    @Override // oq9.i
    public final DateTime b() {
        return this.f;
    }

    @Override // oq9.i
    public final o c() {
        return this.f227819h;
    }

    @Override // oq9.i
    public final dj0.d d() {
        return this.e;
    }

    @Override // oq9.i
    public final String e() {
        return this.f227816b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f227815a, gVar.f227815a) && Intrinsics.f(this.f227816b, gVar.f227816b) && Intrinsics.f(this.f227817c, gVar.f227817c) && this.d.equals(gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f.equals(gVar.f) && this.f227818g.equals(gVar.f227818g) && this.f227819h.equals(gVar.f227819h) && this.i.equals(gVar.i) && Intrinsics.f(this.f227820j, gVar.f227820j) && Intrinsics.f(this.k, gVar.k);
    }

    @Override // oq9.i
    public final List f() {
        return this.f227820j;
    }

    @Override // oq9.i
    public final String getId() {
        return this.f227815a;
    }

    @Override // oq9.i
    public final String getTitle() {
        return this.f227817c;
    }

    @Override // oq9.i
    public final o h() {
        return this.f227818g;
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(p.a.c(this.f227815a.hashCode() * 31, 31, this.f227816b), 31, this.f227817c), 31, this.d);
        dj0.d dVar = this.e;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, okl.m.d(this.f227819h, okl.m.d(this.f227818g, m72.b.f(this.f, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31), 31), 31);
        List list = this.f227820j;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.k;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // oq9.i
    public final String i() {
        return this.k;
    }

    @Override // oq9.i
    public final List k() {
        return this.i;
    }
}
