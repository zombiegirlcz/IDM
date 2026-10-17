package r89;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TermsScope f252401a;

    public a(TermsScope termsScope) {
        Intrinsics.checkNotNullParameter(termsScope, "termsScope");
        this.f252401a = termsScope;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f252401a, ((a) obj2).f252401a);
    }

    public final int hashCode() {
        return this.f252401a.f90390a.hashCode();
    }
}
