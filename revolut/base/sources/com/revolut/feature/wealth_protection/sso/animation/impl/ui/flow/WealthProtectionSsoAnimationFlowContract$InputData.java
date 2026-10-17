package com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth_protection/sso/animation/impl/ui/flow/WealthProtectionSsoAnimationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_protection_sso_animation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthProtectionSsoAnimationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WealthProtectionSsoAnimationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f96295c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthProtectionSsoAnimationFlowContract$InputData(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthProtectionSsoAnimationFlowContract$InputData[i];
        }
    }

    public WealthProtectionSsoAnimationFlowContract$InputData(String url2, String state, List securityProfiles) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
        this.f96293a = url2;
        this.f96294b = state;
        this.f96295c = securityProfiles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthProtectionSsoAnimationFlowContract$InputData)) {
            return false;
        }
        WealthProtectionSsoAnimationFlowContract$InputData wealthProtectionSsoAnimationFlowContract$InputData = (WealthProtectionSsoAnimationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f96293a, wealthProtectionSsoAnimationFlowContract$InputData.f96293a) && Intrinsics.f(this.f96294b, wealthProtectionSsoAnimationFlowContract$InputData.f96294b) && Intrinsics.f(this.f96295c, wealthProtectionSsoAnimationFlowContract$InputData.f96295c);
    }

    public final int hashCode() {
        return this.f96295c.hashCode() + p.a.c(this.f96293a.hashCode() * 31, 31, this.f96294b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96293a);
        dest.writeString(this.f96294b);
        dest.writeStringList(this.f96295c);
    }
}
