package sxd;

import com.revolut.domain.models.topup.AutoTopUpState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutoTopUpState f266433a;

    public j(AutoTopUpState autoTopUpState) {
        Intrinsics.checkNotNullParameter(autoTopUpState, "autoTopUpState");
        this.f266433a = autoTopUpState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f266433a, ((j) obj2).f266433a);
    }

    public final int hashCode() {
        return this.f266433a.hashCode();
    }
}
