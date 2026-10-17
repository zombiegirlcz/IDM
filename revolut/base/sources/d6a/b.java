package d6a;

import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f111467a;

    public b(Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f111467a = provider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f111467a, ((b) obj2).f111467a);
    }

    public final int hashCode() {
        return this.f111467a.hashCode();
    }
}
