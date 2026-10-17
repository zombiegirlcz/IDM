package com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferences;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/LegacyConsentPreferencesFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LegacyConsentPreferencesFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LegacyConsentPreferencesFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentPreferences f67269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentPreferencesSelection f67270b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LegacyConsentPreferencesFlowContract$State((ConsentPreferences) parcel.readParcelable(LegacyConsentPreferencesFlowContract$State.class.getClassLoader()), (ConsentPreferencesSelection) parcel.readParcelable(LegacyConsentPreferencesFlowContract$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LegacyConsentPreferencesFlowContract$State[i];
        }
    }

    public LegacyConsentPreferencesFlowContract$State(ConsentPreferences consentPreferences, ConsentPreferencesSelection consentPreferencesSelection) {
        this.f67269a = consentPreferences;
        this.f67270b = consentPreferencesSelection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LegacyConsentPreferencesFlowContract$State)) {
            return false;
        }
        LegacyConsentPreferencesFlowContract$State legacyConsentPreferencesFlowContract$State = (LegacyConsentPreferencesFlowContract$State) obj2;
        return Intrinsics.f(this.f67269a, legacyConsentPreferencesFlowContract$State.f67269a) && Intrinsics.f(this.f67270b, legacyConsentPreferencesFlowContract$State.f67270b);
    }

    public final int hashCode() {
        ConsentPreferences consentPreferences = this.f67269a;
        int iHashCode = (consentPreferences == null ? 0 : consentPreferences.hashCode()) * 31;
        ConsentPreferencesSelection consentPreferencesSelection = this.f67270b;
        return iHashCode + (consentPreferencesSelection != null ? consentPreferencesSelection.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67269a, i);
        dest.writeParcelable(this.f67270b, i);
    }

    public LegacyConsentPreferencesFlowContract$State() {
        this(null, null);
    }
}
