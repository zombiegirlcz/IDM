package en6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalInstitution f127748a;

    public e(ExternalInstitution institution) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        this.f127748a = institution;
    }

    @Override // en6.f
    public final String a() {
        return this.f127748a.f66107a;
    }

    @Override // en6.f
    public final String b() {
        return this.f127748a.f66108b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f127748a, ((e) obj2).f127748a);
    }

    public final int hashCode() {
        return this.f127748a.hashCode();
    }
}
