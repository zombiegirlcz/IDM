package e3k;

import com.revolut.retail.feature.payments.bank_transfer.impl.common.RemittanceRoutesException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemittanceRoutesException f122338a;

    public c(RemittanceRoutesException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f122338a = exception;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f122338a, ((c) obj2).f122338a);
    }

    public final int hashCode() {
        return this.f122338a.hashCode();
    }
}
