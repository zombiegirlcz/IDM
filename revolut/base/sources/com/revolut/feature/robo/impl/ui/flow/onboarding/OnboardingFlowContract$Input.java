package com.revolut.feature.robo.impl.ui.flow.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/robo/impl/ui/flow/onboarding/OnboardingFlowContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingFlowContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OnboardingFlowContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f85120c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingFlowContract$Input(parcel.readString(), parcel.readString(), (NaviCommand) parcel.readParcelable(OnboardingFlowContract$Input.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingFlowContract$Input[i];
        }
    }

    public OnboardingFlowContract$Input(String accountId, String portfolioId, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f85118a = accountId;
        this.f85119b = portfolioId;
        this.f85120c = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingFlowContract$Input)) {
            return false;
        }
        OnboardingFlowContract$Input onboardingFlowContract$Input = (OnboardingFlowContract$Input) obj2;
        return Intrinsics.f(this.f85118a, onboardingFlowContract$Input.f85118a) && Intrinsics.f(this.f85119b, onboardingFlowContract$Input.f85119b) && Intrinsics.f(this.f85120c, onboardingFlowContract$Input.f85120c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f85118a.hashCode() * 31, 31, this.f85119b);
        NaviCommand naviCommand = this.f85120c;
        return iC + (naviCommand == null ? 0 : naviCommand.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85118a);
        dest.writeString(this.f85119b);
        dest.writeParcelable(this.f85120c, i);
    }
}
