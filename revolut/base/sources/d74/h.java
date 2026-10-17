package d74;

import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentPreferencesSelection f111813a;

    public h(ConsentPreferencesSelection selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f111813a = selection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f111813a, ((h) obj2).f111813a);
    }

    public final int hashCode() {
        return this.f111813a.hashCode();
    }
}
