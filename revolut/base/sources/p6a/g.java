package p6a;

import aii.r;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f233238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x5a.b f233239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f233240c;

    public g(Provider provider, x5a.b paymentType, boolean z) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        this.f233238a = provider;
        this.f233239b = paymentType;
        this.f233240c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f233238a, gVar.f233238a) && this.f233239b == gVar.f233239b && this.f233240c == gVar.f233240c;
    }

    public final int hashCode() {
        Provider provider = this.f233238a;
        return Boolean.hashCode(this.f233240c) + ((this.f233239b.hashCode() + ((provider == null ? 0 : provider.hashCode()) * 31)) * 31);
    }
}
