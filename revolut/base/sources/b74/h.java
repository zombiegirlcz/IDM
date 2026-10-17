package b74;

import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentRetention f12890a;

    public h(ConsentRetention retention) {
        Intrinsics.checkNotNullParameter(retention, "retention");
        this.f12890a = retention;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f12890a, ((h) obj2).f12890a);
    }

    public final int hashCode() {
        return this.f12890a.hashCode();
    }
}
