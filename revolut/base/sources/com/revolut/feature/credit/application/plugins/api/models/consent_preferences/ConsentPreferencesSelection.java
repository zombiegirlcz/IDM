package com.revolut.feature.credit.application.plugins.api.models.consent_preferences;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentPreferencesSelection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentPreferencesSelection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConsentPreferencesSelection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentRetention.ActiveFacility f66436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentRetention.Application f66437b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentPreferencesSelection((ConsentRetention.ActiveFacility) parcel.readParcelable(ConsentPreferencesSelection.class.getClassLoader()), (ConsentRetention.Application) parcel.readParcelable(ConsentPreferencesSelection.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentPreferencesSelection[i];
        }
    }

    public ConsentPreferencesSelection(ConsentRetention.ActiveFacility activeFacilityRetention, ConsentRetention.Application applicationRetention) {
        Intrinsics.checkNotNullParameter(activeFacilityRetention, "activeFacilityRetention");
        Intrinsics.checkNotNullParameter(applicationRetention, "applicationRetention");
        this.f66436a = activeFacilityRetention;
        this.f66437b = applicationRetention;
    }

    public static ConsentPreferencesSelection a(ConsentPreferencesSelection consentPreferencesSelection, ConsentRetention.ActiveFacility activeFacilityRetention, ConsentRetention.Application applicationRetention, int i) {
        if ((i & 1) != 0) {
            activeFacilityRetention = consentPreferencesSelection.f66436a;
        }
        if ((i & 2) != 0) {
            applicationRetention = consentPreferencesSelection.f66437b;
        }
        consentPreferencesSelection.getClass();
        Intrinsics.checkNotNullParameter(activeFacilityRetention, "activeFacilityRetention");
        Intrinsics.checkNotNullParameter(applicationRetention, "applicationRetention");
        return new ConsentPreferencesSelection(activeFacilityRetention, applicationRetention);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConsentPreferencesSelection)) {
            return false;
        }
        ConsentPreferencesSelection consentPreferencesSelection = (ConsentPreferencesSelection) obj2;
        return Intrinsics.f(this.f66436a, consentPreferencesSelection.f66436a) && Intrinsics.f(this.f66437b, consentPreferencesSelection.f66437b);
    }

    public final int hashCode() {
        return this.f66437b.hashCode() + (this.f66436a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66436a, i);
        dest.writeParcelable(this.f66437b, i);
    }
}
