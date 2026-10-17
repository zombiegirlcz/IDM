package com.revolut.feature.checkout.api.resume;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.Checkout;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/api/resume/ResumeCheckoutFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_checkout_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResumeCheckoutFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<ResumeCheckoutFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Checkout f65831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f65832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f65833c;
    public final NaviCommand d;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ResumeCheckoutFeatureConfig((AccountId) parcel.readParcelable(ResumeCheckoutFeatureConfig.class.getClassLoader()), (Checkout) parcel.readParcelable(ResumeCheckoutFeatureConfig.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ResumeCheckoutFeatureConfig.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ResumeCheckoutFeatureConfig[i];
        }
    }

    public ResumeCheckoutFeatureConfig(AccountId accountId, Checkout checkout, NaviCommand naviCommand, boolean z) {
        Intrinsics.checkNotNullParameter(checkout, "checkout");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f65831a = checkout;
        this.f65832b = accountId;
        this.f65833c = z;
        this.d = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ResumeCheckoutFeatureConfig)) {
            return false;
        }
        ResumeCheckoutFeatureConfig resumeCheckoutFeatureConfig = (ResumeCheckoutFeatureConfig) obj2;
        return Intrinsics.f(this.f65831a, resumeCheckoutFeatureConfig.f65831a) && Intrinsics.f(this.f65832b, resumeCheckoutFeatureConfig.f65832b) && this.f65833c == resumeCheckoutFeatureConfig.f65833c && Intrinsics.f(this.d, resumeCheckoutFeatureConfig.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(l.b(this.f65832b, this.f65831a.hashCode() * 31, 31), 31, this.f65833c);
        NaviCommand naviCommand = this.d;
        return iC + (naviCommand == null ? 0 : naviCommand.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65831a, i);
        dest.writeParcelable(this.f65832b, i);
        dest.writeInt(this.f65833c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ ResumeCheckoutFeatureConfig(Checkout checkout, AccountId accountId, NaviCommand naviCommand, int i) {
        this(accountId, checkout, (i & 8) != 0 ? null : naviCommand, true);
    }
}
