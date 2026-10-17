package ck7;

import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACCancellationReason f24790a;

    public f(CFACCancellationReason reasonGroup) {
        Intrinsics.checkNotNullParameter(reasonGroup, "reasonGroup");
        this.f24790a = reasonGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f24790a, ((f) obj2).f24790a);
    }

    public final int hashCode() {
        return this.f24790a.hashCode();
    }
}
