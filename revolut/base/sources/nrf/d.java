package nrf;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218632c;
    public final dj0.d d;
    public final dj0.d e;
    public final String f;

    public d(String shortDescription, String title, String description, dj0.d amount, dj0.d dVar, String str) {
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f218630a = shortDescription;
        this.f218631b = title;
        this.f218632c = description;
        this.d = amount;
        this.e = dVar;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f218630a, dVar.f218630a) && Intrinsics.f(this.f218631b, dVar.f218631b) && Intrinsics.f(this.f218632c, dVar.f218632c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(p.a.c(this.f218630a.hashCode() * 31, 31, this.f218631b), 31, this.f218632c), 31, this.d);
        dj0.d dVar = this.e;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
