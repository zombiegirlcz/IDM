package ds4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f117205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f117207c;
    public final wi0.b d;
    public final List e;

    public e(f fVar, List terms, boolean z, wi0.b countryCode, List creditCardMsiOffers) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(creditCardMsiOffers, "creditCardMsiOffers");
        this.f117205a = fVar;
        this.f117206b = terms;
        this.f117207c = z;
        this.d = countryCode;
        this.e = creditCardMsiOffers;
    }

    @Override // ds4.g
    public final List a() {
        return this.e;
    }

    @Override // ds4.g
    public final boolean b() {
        return this.f117207c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f117205a, eVar.f117205a) && Intrinsics.f(this.f117206b, eVar.f117206b) && this.f117207c == eVar.f117207c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        f fVar = this.f117205a;
        return this.e.hashCode() + p.a.c(j6.a.c(p.a.d((fVar == null ? 0 : fVar.hashCode()) * 31, 31, this.f117206b), 31, this.f117207c), 31, this.d.f297794a);
    }
}
