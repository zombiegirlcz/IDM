package d74;

import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferences;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentPreferences f111814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentPreferencesSelection f111815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditPreferencesConfiguration f111816c;

    public i(ConsentPreferences preferences, ConsentPreferencesSelection selection, EditPreferencesConfiguration configuration) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f111814a = preferences;
        this.f111815b = selection;
        this.f111816c = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f111814a, iVar.f111814a) && Intrinsics.f(this.f111815b, iVar.f111815b) && Intrinsics.f(this.f111816c, iVar.f111816c);
    }

    public final int hashCode() {
        return this.f111816c.hashCode() + ((this.f111815b.hashCode() + (this.f111814a.hashCode() * 31)) * 31);
    }
}
