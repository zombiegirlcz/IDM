package com.revolut.feature.semi_independent_onboarding.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v0d.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/semi_independent_onboarding/api/navigation/SemiIndependentInvitationContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_semi_independent_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SemiIndependentInvitationContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SemiIndependentInvitationContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f85983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0d.a f85984b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SemiIndependentInvitationContract$InputData(d.valueOf(parcel.readString()), v0d.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SemiIndependentInvitationContract$InputData[i];
        }
    }

    public SemiIndependentInvitationContract$InputData(d startMode, v0d.a finishMode) {
        Intrinsics.checkNotNullParameter(startMode, "startMode");
        Intrinsics.checkNotNullParameter(finishMode, "finishMode");
        this.f85983a = startMode;
        this.f85984b = finishMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SemiIndependentInvitationContract$InputData)) {
            return false;
        }
        SemiIndependentInvitationContract$InputData semiIndependentInvitationContract$InputData = (SemiIndependentInvitationContract$InputData) obj2;
        return this.f85983a == semiIndependentInvitationContract$InputData.f85983a && this.f85984b == semiIndependentInvitationContract$InputData.f85984b;
    }

    public final int hashCode() {
        return this.f85984b.hashCode() + (this.f85983a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85983a.name());
        dest.writeString(this.f85984b.name());
    }
}
