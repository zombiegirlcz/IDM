package ise;

import com.revolut.domain.models.transactions.ThreeDSTransaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends com.revolut.feature.three_ds_verification.impl.ui.sceen.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreeDSTransaction f168213a;

    public l0(ThreeDSTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f168213a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.f168213a, ((l0) obj2).f168213a);
    }

    public final int hashCode() {
        return this.f168213a.hashCode();
    }
}
