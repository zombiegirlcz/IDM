package com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/screen/three_ds/CardTopUpThreeDsUiModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardTopUpThreeDsUiModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardTopUpThreeDsUiModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zve.a f90956c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardTopUpThreeDsUiModel(parcel.readString(), parcel.readString(), (zve.a) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardTopUpThreeDsUiModel[i];
        }
    }

    public CardTopUpThreeDsUiModel(String transactionId, String challengeUrl, zve.a redirects, String str) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(challengeUrl, "challengeUrl");
        Intrinsics.checkNotNullParameter(redirects, "redirects");
        this.f90954a = transactionId;
        this.f90955b = challengeUrl;
        this.f90956c = redirects;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardTopUpThreeDsUiModel)) {
            return false;
        }
        CardTopUpThreeDsUiModel cardTopUpThreeDsUiModel = (CardTopUpThreeDsUiModel) obj2;
        return Intrinsics.f(this.f90954a, cardTopUpThreeDsUiModel.f90954a) && Intrinsics.f(this.f90955b, cardTopUpThreeDsUiModel.f90955b) && Intrinsics.f(this.f90956c, cardTopUpThreeDsUiModel.f90956c) && Intrinsics.f(this.d, cardTopUpThreeDsUiModel.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f90956c.hashCode() + p.a.c(this.f90954a.hashCode() * 31, 31, this.f90955b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90954a);
        dest.writeString(this.f90955b);
        dest.writeSerializable(this.f90956c);
        dest.writeString(this.d);
    }
}
