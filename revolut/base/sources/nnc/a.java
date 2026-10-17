package nnc;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f217515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f217516c;
    public final boolean d;
    public final BigDecimal e;

    public a(String listId, int i, boolean z, boolean z3, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f217514a = listId;
        this.f217515b = i;
        this.f217516c = z;
        this.d = z3;
        this.e = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f217514a.equals(aVar.f217514a) && this.f217515b == aVar.f217515b && this.f217516c == aVar.f217516c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.b(this.f217515b, this.f217514a.hashCode() * 31, 31), 31, this.f217516c), 31, this.d);
        BigDecimal bigDecimal = this.e;
        return iC + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
