package b74;

import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentRetention f12901a;

    public u(ConsentRetention retention) {
        Intrinsics.checkNotNullParameter(retention, "retention");
        this.f12901a = retention;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f12901a, ((u) obj2).f12901a);
    }

    public final int hashCode() {
        return this.f12901a.hashCode();
    }
}
