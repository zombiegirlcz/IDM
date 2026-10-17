package com.revolut.feature.junior.account_activation.impl.ui.flow.activation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior.account_activation.api.navigation.JuniorAccountActivationFeatureConfig;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountActivationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccountActivationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorBankingProfile f76633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorAccountActivationFeatureConfig.Request.InputState f76634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76635c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountActivationFlowContract$InputData((JuniorBankingProfile) parcel.readParcelable(AccountActivationFlowContract$InputData.class.getClassLoader()), (JuniorAccountActivationFeatureConfig.Request.InputState) parcel.readParcelable(AccountActivationFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountActivationFlowContract$InputData[i];
        }
    }

    public AccountActivationFlowContract$InputData(JuniorBankingProfile juniorProfile, JuniorAccountActivationFeatureConfig.Request.InputState inputState, boolean z) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        this.f76633a = juniorProfile;
        this.f76634b = inputState;
        this.f76635c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountActivationFlowContract$InputData)) {
            return false;
        }
        AccountActivationFlowContract$InputData accountActivationFlowContract$InputData = (AccountActivationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f76633a, accountActivationFlowContract$InputData.f76633a) && Intrinsics.f(this.f76634b, accountActivationFlowContract$InputData.f76634b) && this.f76635c == accountActivationFlowContract$InputData.f76635c;
    }

    public final int hashCode() {
        int iHashCode = this.f76633a.hashCode() * 31;
        JuniorAccountActivationFeatureConfig.Request.InputState inputState = this.f76634b;
        return Boolean.hashCode(this.f76635c) + ((iHashCode + (inputState == null ? 0 : inputState.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76633a, i);
        dest.writeParcelable(this.f76634b, i);
        dest.writeInt(this.f76635c ? 1 : 0);
    }
}
