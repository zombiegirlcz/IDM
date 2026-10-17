package ste;

import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayFee f265568a;

    public n(GooglePayFee fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f265568a = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f265568a, ((n) obj2).f265568a);
    }

    public final int hashCode() {
        return this.f265568a.hashCode();
    }
}
