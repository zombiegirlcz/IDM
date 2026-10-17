package com.revolut.feature.apm.core.impl.crypto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/apm/core/impl/crypto/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getKid", "kid", "b", "getAlg", "alg", "c", "getTyp", "typ", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("kid")
    @NotNull
    private final String kid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("alg")
    @NotNull
    private final String alg;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("typ")
    private final String typ;

    public a(String kid2, String alg2, String str) {
        Intrinsics.checkNotNullParameter(kid2, "kid");
        Intrinsics.checkNotNullParameter(alg2, "alg");
        this.kid = kid2;
        this.alg = alg2;
        this.typ = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.kid, aVar.kid) && Intrinsics.f(this.alg, aVar.alg) && Intrinsics.f(this.typ, aVar.typ);
    }

    public final int hashCode() {
        int iC = p.a.c(this.kid.hashCode() * 31, 31, this.alg);
        String str = this.typ;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
