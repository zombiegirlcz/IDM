package wgj;

import cli.j;
import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimAutoRenewalTerms f297327a;

    public d(EsimAutoRenewalTerms autoRenewalTerms) {
        Intrinsics.checkNotNullParameter(autoRenewalTerms, "autoRenewalTerms");
        this.f297327a = autoRenewalTerms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f297327a, ((d) obj2).f297327a);
    }

    public final int hashCode() {
        return this.f297327a.hashCode();
    }
}
