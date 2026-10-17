package b74;

import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentRetention f12887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12888b;

    public f(ConsentRetention selection, boolean z) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f12887a = selection;
        this.f12888b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f12887a, fVar.f12887a) && this.f12888b == fVar.f12888b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12888b) + (this.f12887a.hashCode() * 31);
    }
}
