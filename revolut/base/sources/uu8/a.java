package uu8;

import kotlin.jvm.internal.Intrinsics;
import my8.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f283163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f283164b;

    public a(k consent, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f283163a = consent;
        this.f283164b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f283163a == aVar.f283163a && Intrinsics.f(this.f283164b, aVar.f283164b);
    }

    public final int hashCode() {
        return this.f283164b.f297794a.hashCode() + (this.f283163a.hashCode() * 31);
    }
}
