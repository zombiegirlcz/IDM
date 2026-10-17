package fqa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f137222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137223c;
    public final String d;
    public final String e;
    public final List f;

    public c(String pan, a cardInputMethod, String country, String issuerName, String scheme, List additionalFields) {
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(cardInputMethod, "cardInputMethod");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(issuerName, "issuerName");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(additionalFields, "additionalFields");
        this.f137221a = pan;
        this.f137222b = cardInputMethod;
        this.f137223c = country;
        this.d = issuerName;
        this.e = scheme;
        this.f = additionalFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f137221a, cVar.f137221a) && this.f137222b == cVar.f137222b && Intrinsics.f(this.f137223c, cVar.f137223c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c((this.f137222b.hashCode() + (this.f137221a.hashCode() * 31)) * 31, 31, this.f137223c), 31, this.d), 961, this.e);
    }
}
