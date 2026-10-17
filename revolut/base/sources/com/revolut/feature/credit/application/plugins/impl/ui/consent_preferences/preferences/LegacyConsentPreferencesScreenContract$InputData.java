package com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferences;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/preferences/LegacyConsentPreferencesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LegacyConsentPreferencesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LegacyConsentPreferencesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentPreferencesSelection f67282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConsentPreferences f67283c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LegacyConsentPreferencesScreenContract$InputData(parcel.readString(), (ConsentPreferencesSelection) parcel.readParcelable(LegacyConsentPreferencesScreenContract$InputData.class.getClassLoader()), (ConsentPreferences) parcel.readParcelable(LegacyConsentPreferencesScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LegacyConsentPreferencesScreenContract$InputData[i];
        }
    }

    public LegacyConsentPreferencesScreenContract$InputData(String applicationId, ConsentPreferencesSelection consentPreferencesSelection, ConsentPreferences consentPreferences) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f67281a = applicationId;
        this.f67282b = consentPreferencesSelection;
        this.f67283c = consentPreferences;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LegacyConsentPreferencesScreenContract$InputData)) {
            return false;
        }
        LegacyConsentPreferencesScreenContract$InputData legacyConsentPreferencesScreenContract$InputData = (LegacyConsentPreferencesScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67281a, legacyConsentPreferencesScreenContract$InputData.f67281a) && Intrinsics.f(this.f67282b, legacyConsentPreferencesScreenContract$InputData.f67282b) && Intrinsics.f(this.f67283c, legacyConsentPreferencesScreenContract$InputData.f67283c);
    }

    public final int hashCode() {
        int iHashCode = this.f67281a.hashCode() * 31;
        ConsentPreferencesSelection consentPreferencesSelection = this.f67282b;
        int iHashCode2 = (iHashCode + (consentPreferencesSelection == null ? 0 : consentPreferencesSelection.hashCode())) * 31;
        ConsentPreferences consentPreferences = this.f67283c;
        return iHashCode2 + (consentPreferences != null ? consentPreferences.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67281a);
        dest.writeParcelable(this.f67282b, i);
        dest.writeParcelable(this.f67283c, i);
    }
}
