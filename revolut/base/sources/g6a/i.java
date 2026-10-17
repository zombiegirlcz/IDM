package g6a;

import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f140905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x5a.b f140906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f140907c;

    public i(Provider provider, x5a.b paymentType, boolean z) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        this.f140905a = provider;
        this.f140906b = paymentType;
        this.f140907c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f140905a, iVar.f140905a) && this.f140906b == iVar.f140906b && this.f140907c == iVar.f140907c;
    }

    public final int hashCode() {
        Provider provider = this.f140905a;
        return Boolean.hashCode(this.f140907c) + ((this.f140906b.hashCode() + ((provider == null ? 0 : provider.hashCode()) * 31)) * 31);
    }
}
