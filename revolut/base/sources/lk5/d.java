package lk5;

import com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogContract$DomainState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommonRemittanceFieldDialogContract$DomainState f196221a;

    public d(CommonRemittanceFieldDialogContract$DomainState domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        this.f196221a = domainState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f196221a, ((d) obj2).f196221a);
    }

    public final int hashCode() {
        return this.f196221a.hashCode();
    }
}
