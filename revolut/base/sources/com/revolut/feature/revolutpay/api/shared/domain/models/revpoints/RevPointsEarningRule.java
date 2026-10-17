package com.revolut.feature.revolutpay.api.shared.domain.models.revpoints;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/RevPointsEarningRule;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsEarningRule implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsEarningRule> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84429b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsEarningRule(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsEarningRule[i];
        }
    }

    public RevPointsEarningRule(String badge, String detailedBadge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(detailedBadge, "detailedBadge");
        this.f84428a = badge;
        this.f84429b = detailedBadge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsEarningRule)) {
            return false;
        }
        RevPointsEarningRule revPointsEarningRule = (RevPointsEarningRule) obj2;
        return Intrinsics.f(this.f84428a, revPointsEarningRule.f84428a) && Intrinsics.f(this.f84429b, revPointsEarningRule.f84429b);
    }

    public final int hashCode() {
        return this.f84429b.hashCode() + (this.f84428a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84428a);
        dest.writeString(this.f84429b);
    }
}
