package qrb;

import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MarginQuote f248683a;

    public c(MarginQuote marginQuote) {
        Intrinsics.checkNotNullParameter(marginQuote, "marginQuote");
        this.f248683a = marginQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f248683a, ((c) obj2).f248683a);
    }

    public final int hashCode() {
        return this.f248683a.hashCode();
    }
}
