package com.revolut.feature.credit.application.plugins.api.models.consent_preferences;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentPreferences;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentPreferences implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConsentPreferences> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActiveCreditFacilityRetention f66434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncompleteApplicationRetention f66435b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentPreferences(ActiveCreditFacilityRetention.CREATOR.createFromParcel(parcel), IncompleteApplicationRetention.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentPreferences[i];
        }
    }

    public ConsentPreferences(ActiveCreditFacilityRetention activeCreditFacilityRetention, IncompleteApplicationRetention incompleteApplicationRetention) {
        Intrinsics.checkNotNullParameter(activeCreditFacilityRetention, "activeCreditFacilityRetention");
        Intrinsics.checkNotNullParameter(incompleteApplicationRetention, "incompleteApplicationRetention");
        this.f66434a = activeCreditFacilityRetention;
        this.f66435b = incompleteApplicationRetention;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConsentPreferences)) {
            return false;
        }
        ConsentPreferences consentPreferences = (ConsentPreferences) obj2;
        return Intrinsics.f(this.f66434a, consentPreferences.f66434a) && Intrinsics.f(this.f66435b, consentPreferences.f66435b);
    }

    public final int hashCode() {
        return this.f66435b.hashCode() + (this.f66434a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f66434a.writeToParcel(dest, i);
        this.f66435b.writeToParcel(dest, i);
    }
}
