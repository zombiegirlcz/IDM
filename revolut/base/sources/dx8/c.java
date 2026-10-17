package dx8;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TermsScope f120917a;

    public c(TermsScope termsScope) {
        Intrinsics.checkNotNullParameter(termsScope, "termsScope");
        this.f120917a = termsScope;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f120917a, ((c) obj2).f120917a);
    }

    public final int hashCode() {
        return this.f120917a.f90390a.hashCode();
    }
}
