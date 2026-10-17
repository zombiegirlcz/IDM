package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/JuniorDetailsConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorDetailsConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorDetailsConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorDetailsConfirmationScreenContract$PersonalDetails f77021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorDetailsConfirmationScreenContract$UiConfiguration f77022b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorDetailsConfirmationScreenContract$InputData(JuniorDetailsConfirmationScreenContract$PersonalDetails.CREATOR.createFromParcel(parcel), JuniorDetailsConfirmationScreenContract$UiConfiguration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorDetailsConfirmationScreenContract$InputData[i];
        }
    }

    public JuniorDetailsConfirmationScreenContract$InputData(JuniorDetailsConfirmationScreenContract$PersonalDetails personalDetails, JuniorDetailsConfirmationScreenContract$UiConfiguration uiConfiguration) {
        Intrinsics.checkNotNullParameter(personalDetails, "personalDetails");
        Intrinsics.checkNotNullParameter(uiConfiguration, "uiConfiguration");
        this.f77021a = personalDetails;
        this.f77022b = uiConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorDetailsConfirmationScreenContract$InputData)) {
            return false;
        }
        JuniorDetailsConfirmationScreenContract$InputData juniorDetailsConfirmationScreenContract$InputData = (JuniorDetailsConfirmationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77021a, juniorDetailsConfirmationScreenContract$InputData.f77021a) && Intrinsics.f(this.f77022b, juniorDetailsConfirmationScreenContract$InputData.f77022b);
    }

    public final int hashCode() {
        return this.f77022b.hashCode() + (this.f77021a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f77021a.writeToParcel(dest, i);
        this.f77022b.writeToParcel(dest, i);
    }
}
