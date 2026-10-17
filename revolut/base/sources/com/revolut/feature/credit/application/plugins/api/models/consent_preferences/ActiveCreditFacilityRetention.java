package com.revolut.feature.credit.application.plugins.api.models.consent_preferences;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ActiveCreditFacilityRetention;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActiveCreditFacilityRetention implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActiveCreditFacilityRetention> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentRetention.ActiveFacility f66431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f66432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f66433c;
    public final LocalDate d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActiveCreditFacilityRetention((ConsentRetention.ActiveFacility) parcel.readParcelable(ActiveCreditFacilityRetention.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActiveCreditFacilityRetention[i];
        }
    }

    public ActiveCreditFacilityRetention(ConsentRetention.ActiveFacility selection, LocalDate minimumExpirationDate, LocalDate maximumExpirationDate, LocalDate suggestedCustomExpirationDate) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(minimumExpirationDate, "minimumExpirationDate");
        Intrinsics.checkNotNullParameter(maximumExpirationDate, "maximumExpirationDate");
        Intrinsics.checkNotNullParameter(suggestedCustomExpirationDate, "suggestedCustomExpirationDate");
        this.f66431a = selection;
        this.f66432b = minimumExpirationDate;
        this.f66433c = maximumExpirationDate;
        this.d = suggestedCustomExpirationDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActiveCreditFacilityRetention)) {
            return false;
        }
        ActiveCreditFacilityRetention activeCreditFacilityRetention = (ActiveCreditFacilityRetention) obj2;
        return Intrinsics.f(this.f66431a, activeCreditFacilityRetention.f66431a) && Intrinsics.f(this.f66432b, activeCreditFacilityRetention.f66432b) && Intrinsics.f(this.f66433c, activeCreditFacilityRetention.f66433c) && Intrinsics.f(this.d, activeCreditFacilityRetention.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + y.a(y.a(this.f66431a.hashCode() * 31, 31, this.f66432b), 31, this.f66433c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66431a, i);
        dest.writeSerializable(this.f66432b);
        dest.writeSerializable(this.f66433c);
        dest.writeSerializable(this.d);
    }
}
