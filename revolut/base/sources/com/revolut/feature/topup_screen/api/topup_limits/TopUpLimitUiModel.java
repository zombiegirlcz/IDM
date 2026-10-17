package com.revolut.feature.topup_screen.api.topup_limits;

import android.os.Parcel;
import android.os.Parcelable;
import aue.c;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/topup_limits/TopUpLimitUiModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopUpLimitUiModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TopUpLimitUiModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f90554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f90555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f90556c;
    public final d d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TopUpLimitUiModel(c.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopUpLimitUiModel[i];
        }
    }

    public TopUpLimitUiModel(c type, d totalLimit, d usedLimit, d remainingLimit, d remainingLimitInTopUpCurrency) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
        Intrinsics.checkNotNullParameter(usedLimit, "usedLimit");
        Intrinsics.checkNotNullParameter(remainingLimit, "remainingLimit");
        Intrinsics.checkNotNullParameter(remainingLimitInTopUpCurrency, "remainingLimitInTopUpCurrency");
        this.f90554a = type;
        this.f90555b = totalLimit;
        this.f90556c = usedLimit;
        this.d = remainingLimit;
        this.e = remainingLimitInTopUpCurrency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TopUpLimitUiModel)) {
            return false;
        }
        TopUpLimitUiModel topUpLimitUiModel = (TopUpLimitUiModel) obj2;
        return this.f90554a == topUpLimitUiModel.f90554a && Intrinsics.f(this.f90555b, topUpLimitUiModel.f90555b) && Intrinsics.f(this.f90556c, topUpLimitUiModel.f90556c) && Intrinsics.f(this.d, topUpLimitUiModel.d) && Intrinsics.f(this.e, topUpLimitUiModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(v7.c(this.f90554a.hashCode() * 31, 31, this.f90555b), 31, this.f90556c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90554a.name());
        dest.writeSerializable(this.f90555b);
        dest.writeSerializable(this.f90556c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
