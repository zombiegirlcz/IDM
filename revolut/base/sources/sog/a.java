package sog;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f264824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264826c;

    public a(String countryDisplayName, String citizenship, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryDisplayName, "countryDisplayName");
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        this.f264824a = countryCode;
        this.f264825b = countryDisplayName;
        this.f264826c = citizenship;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f264824a, aVar.f264824a) && Intrinsics.f(this.f264825b, aVar.f264825b) && Intrinsics.f(this.f264826c, aVar.f264826c);
    }

    public final int hashCode() {
        return this.f264826c.hashCode() + p.a.c(this.f264824a.f297794a.hashCode() * 31, 31, this.f264825b);
    }
}
