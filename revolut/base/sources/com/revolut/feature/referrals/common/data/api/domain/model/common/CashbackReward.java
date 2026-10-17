package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/CashbackReward;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashbackReward implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CashbackReward> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81717c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashbackReward(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashbackReward[i];
        }
    }

    public CashbackReward(String title, String amountLabel, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amountLabel, "amountLabel");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f81715a = title;
        this.f81716b = amountLabel;
        this.f81717c = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashbackReward)) {
            return false;
        }
        CashbackReward cashbackReward = (CashbackReward) obj2;
        return Intrinsics.f(this.f81715a, cashbackReward.f81715a) && Intrinsics.f(this.f81716b, cashbackReward.f81716b) && Intrinsics.f(this.f81717c, cashbackReward.f81717c);
    }

    public final int hashCode() {
        return this.f81717c.hashCode() + p.a.c(this.f81715a.hashCode() * 31, 31, this.f81716b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81715a);
        dest.writeString(this.f81716b);
        dest.writeString(this.f81717c);
    }
}
