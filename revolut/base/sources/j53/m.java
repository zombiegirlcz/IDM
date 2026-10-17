package j53;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f171473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f171474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f171475c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f171476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f171477h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f171478j;

    public m(List items, List pagerItems, List inputActions, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, String str, List suggestionsItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(inputActions, "inputActions");
        Intrinsics.checkNotNullParameter(suggestionsItems, "suggestionsItems");
        this.f171473a = items;
        this.f171474b = pagerItems;
        this.f171475c = inputActions;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f171476g = z6;
        this.f171477h = z11;
        this.i = str;
        this.f171478j = suggestionsItems;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof m)) {
            return null;
        }
        m mVar = (m) oldState;
        boolean z29 = !Intrinsics.f(this.f171474b, mVar.f171474b);
        boolean z31 = !Intrinsics.f(this.f171475c, mVar.f171475c);
        boolean z41 = false;
        if (this.d != mVar.d) {
            z = true;
            z3 = z31;
            z4 = true;
        } else {
            z = true;
            z3 = z31;
            z4 = false;
        }
        if (this.e != mVar.e) {
            z6 = z;
        } else {
            z6 = z;
            z = false;
        }
        if (this.f != mVar.f) {
            z11 = z6;
        } else {
            z11 = z6;
            z6 = false;
        }
        if (this.f171476g != mVar.f171476g) {
            z12 = false;
            z41 = z11;
        } else {
            z12 = false;
        }
        if (this.f171477h != mVar.f171477h) {
            z12 = z11;
        }
        return new n(z29, z3, z4, z, z6, z41, z12, Intrinsics.f(this.i, mVar.i) ^ z11, Intrinsics.f(this.f171478j, mVar.f171478j) ^ z11);
    }

    @Override // cli.p
    public final List c() {
        return this.f171473a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f171473a, mVar.f171473a) && Intrinsics.f(this.f171474b, mVar.f171474b) && Intrinsics.f(this.f171475c, mVar.f171475c) && this.d == mVar.d && this.e == mVar.e && this.f == mVar.f && this.f171476g == mVar.f171476g && this.f171477h == mVar.f171477h && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f171478j, mVar.f171478j);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.d(p.a.d(this.f171473a.hashCode() * 31, 31, this.f171474b), 31, this.f171475c), 31, this.d), 31, this.e), 31, this.f), 31, this.f171476g), 31, this.f171477h);
        String str = this.i;
        return this.f171478j.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(List list, List list2, boolean z, boolean z3, boolean z4) {
        f0 f0Var = f0.f322471a;
        this(list, list2, f0Var, false, z, z3, z4, false, null, f0Var);
    }
}
