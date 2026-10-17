package us7;

import com.revolut.feature.insurance_credit.impl.data.model.coverages.CoverageDetailsLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoverageDetailsLayout f282829a;

    public a(CoverageDetailsLayout details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f282829a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f282829a, ((a) obj2).f282829a);
    }

    public final int hashCode() {
        return this.f282829a.hashCode();
    }
}
