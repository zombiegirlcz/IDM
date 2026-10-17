package fna;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f136557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136559c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f136560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f136561h;
    public final boolean i;

    public a(AccountId accountId, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f136557a = accountId;
        this.f136558b = z;
        this.f136559c = z3;
        this.d = z4;
        this.e = z6;
        this.f = z11;
        this.f136560g = z12;
        this.f136561h = z29;
        this.i = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f136557a, aVar.f136557a) && this.f136558b == aVar.f136558b && this.f136559c == aVar.f136559c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.f136560g == aVar.f136560g && this.f136561h == aVar.f136561h && this.i == aVar.i;
    }

    public final int hashCode() {
        AccountId accountId = this.f136557a;
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((accountId == null ? 0 : accountId.hashCode()) * 31, 31, this.f136558b), 31, this.f136559c), 31, this.d), 31, this.e), 31, this.f), 31, this.f136560g), 31, this.f136561h);
    }
}
