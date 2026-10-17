package k5k;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TermsScope f181542a;

    public j(TermsScope termsScope) {
        Intrinsics.checkNotNullParameter(termsScope, "termsScope");
        this.f181542a = termsScope;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f181542a, ((j) obj2).f181542a);
    }

    public final int hashCode() {
        return this.f181542a.f90390a.hashCode();
    }
}
