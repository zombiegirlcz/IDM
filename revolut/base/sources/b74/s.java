package b74;

import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentRetention f12898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12899b;

    public s(ConsentRetention selection, boolean z) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f12898a = selection;
        this.f12899b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f12898a, sVar.f12898a) && this.f12899b == sVar.f12899b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12899b) + (this.f12898a.hashCode() * 31);
    }
}
