package com.revolut.feature.checkout.impl.resume.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.Checkout;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/checkout/impl/resume/flow/ResumeCheckoutFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_checkout_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResumeCheckoutFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ResumeCheckoutFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Checkout f65834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f65836c;
    public final AccountId d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ResumeCheckoutFlowContract$InputData((AccountId) parcel.readParcelable(ResumeCheckoutFlowContract$InputData.class.getClassLoader()), (Checkout) parcel.readParcelable(ResumeCheckoutFlowContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ResumeCheckoutFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ResumeCheckoutFlowContract$InputData[i];
        }
    }

    public ResumeCheckoutFlowContract$InputData(AccountId accountId, Checkout checkout, NaviCommand naviCommand, boolean z) {
        Intrinsics.checkNotNullParameter(checkout, "checkout");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f65834a = checkout;
        this.f65835b = z;
        this.f65836c = naviCommand;
        this.d = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ResumeCheckoutFlowContract$InputData)) {
            return false;
        }
        ResumeCheckoutFlowContract$InputData resumeCheckoutFlowContract$InputData = (ResumeCheckoutFlowContract$InputData) obj2;
        return Intrinsics.f(this.f65834a, resumeCheckoutFlowContract$InputData.f65834a) && this.f65835b == resumeCheckoutFlowContract$InputData.f65835b && Intrinsics.f(this.f65836c, resumeCheckoutFlowContract$InputData.f65836c) && Intrinsics.f(this.d, resumeCheckoutFlowContract$InputData.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f65834a.hashCode() * 31, 31, this.f65835b);
        NaviCommand naviCommand = this.f65836c;
        return this.d.hashCode() + ((iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65834a, i);
        dest.writeInt(this.f65835b ? 1 : 0);
        dest.writeParcelable(this.f65836c, i);
        dest.writeParcelable(this.d, i);
    }
}
