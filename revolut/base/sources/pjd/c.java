package pjd;

import kotlin.jvm.internal.Intrinsics;
import shd.i;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f236738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236739c;

    public c(String shopName, i type, String termsLink) {
        Intrinsics.checkNotNullParameter(shopName, "shopName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(termsLink, "termsLink");
        this.f236737a = shopName;
        this.f236738b = type;
        this.f236739c = termsLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f236737a, cVar.f236737a) && this.f236738b == cVar.f236738b && Intrinsics.f(this.f236739c, cVar.f236739c);
    }

    public final int hashCode() {
        return this.f236739c.hashCode() + ((this.f236738b.hashCode() + (this.f236737a.hashCode() * 31)) * 31);
    }
}
