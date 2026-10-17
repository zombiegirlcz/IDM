package c02;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20109c;
    public final dj0.d d;
    public final dj0.d e;

    public g(String shortDescription, String title, String description, dj0.d amount, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f20107a = shortDescription;
        this.f20108b = title;
        this.f20109c = description;
        this.d = amount;
        this.e = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f20107a, gVar.f20107a) && Intrinsics.f(this.f20108b, gVar.f20108b) && Intrinsics.f(this.f20109c, gVar.f20109c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(p.a.c(this.f20107a.hashCode() * 31, 31, this.f20108b), 31, this.f20109c), 31, this.d);
        dj0.d dVar = this.e;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
