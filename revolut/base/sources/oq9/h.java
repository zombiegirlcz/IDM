package oq9;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f227823c;
    public final dj0.d d;
    public final dj0.d e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f227824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f227825h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f227826j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f227827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f227828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f227829n;

    public h(String id10, String groupId, String title, dj0.d amount, dj0.d dVar, DateTime createDate, o owner, o createdBy, ArrayList splits, ArrayList arrayList, String str, String str2, String transactionCategoryId, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(createDate, "createDate");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(splits, "splits");
        Intrinsics.checkNotNullParameter(transactionCategoryId, "transactionCategoryId");
        this.f227821a = id10;
        this.f227822b = groupId;
        this.f227823c = title;
        this.d = amount;
        this.e = dVar;
        this.f = createDate;
        this.f227824g = owner;
        this.f227825h = createdBy;
        this.i = splits;
        this.f227826j = arrayList;
        this.k = str;
        this.f227827l = str2;
        this.f227828m = transactionCategoryId;
        this.f227829n = str3;
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
        return this.f227825h;
    }

    @Override // oq9.i
    public final dj0.d d() {
        return this.e;
    }

    @Override // oq9.i
    public final String e() {
        return this.f227822b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f227821a, hVar.f227821a) && Intrinsics.f(this.f227822b, hVar.f227822b) && Intrinsics.f(this.f227823c, hVar.f227823c) && this.d.equals(hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f.equals(hVar.f) && this.f227824g.equals(hVar.f227824g) && this.f227825h.equals(hVar.f227825h) && this.i.equals(hVar.i) && Intrinsics.f(this.f227826j, hVar.f227826j) && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f227827l, hVar.f227827l) && Intrinsics.f(this.f227828m, hVar.f227828m) && Intrinsics.f(this.f227829n, hVar.f227829n);
    }

    @Override // oq9.i
    public final List f() {
        return this.f227826j;
    }

    @Override // oq9.i
    public final String getId() {
        return this.f227821a;
    }

    @Override // oq9.i
    public final String getTitle() {
        return this.f227823c;
    }

    @Override // oq9.i
    public final o h() {
        return this.f227824g;
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(p.a.c(this.f227821a.hashCode() * 31, 31, this.f227822b), 31, this.f227823c), 31, this.d);
        dj0.d dVar = this.e;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, okl.m.d(this.f227825h, okl.m.d(this.f227824g, m72.b.f(this.f, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31), 31), 31);
        List list = this.f227826j;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.k;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f227827l;
        int iC2 = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f227828m);
        String str3 = this.f227829n;
        return iC2 + (str3 != null ? str3.hashCode() : 0);
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
