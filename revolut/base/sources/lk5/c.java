package lk5;

import com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogContract$DomainState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommonRemittanceFieldDialogContract$DomainState f196220a;

    public c(CommonRemittanceFieldDialogContract$DomainState domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        this.f196220a = domainState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f196220a, ((c) obj2).f196220a);
    }

    public final int hashCode() {
        return this.f196220a.hashCode();
    }
}
