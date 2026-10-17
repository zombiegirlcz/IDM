package q85;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f242986a;

    public c(Data loanPaymentSource) {
        Intrinsics.checkNotNullParameter(loanPaymentSource, "loanPaymentSource");
        this.f242986a = loanPaymentSource;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f242986a, ((c) obj2).f242986a);
    }

    public final int hashCode() {
        return this.f242986a.hashCode();
    }
}
