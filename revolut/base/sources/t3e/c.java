package t3e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1e.d f267742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f267743c;

    public c(String shopName, t1e.d type, String termsLink) {
        Intrinsics.checkNotNullParameter(shopName, "shopName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(termsLink, "termsLink");
        this.f267741a = shopName;
        this.f267742b = type;
        this.f267743c = termsLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f267741a, cVar.f267741a) && this.f267742b == cVar.f267742b && Intrinsics.f(this.f267743c, cVar.f267743c);
    }

    public final int hashCode() {
        return this.f267743c.hashCode() + ((this.f267742b.hashCode() + (this.f267741a.hashCode() * 31)) * 31);
    }
}
