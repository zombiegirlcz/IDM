package w72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationTerms;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoRegistrationTerms f295459a;

    public e(MultibancoRegistrationTerms terms) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.f295459a = terms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f295459a, ((e) obj2).f295459a);
    }

    public final int hashCode() {
        return this.f295459a.hashCode();
    }
}
