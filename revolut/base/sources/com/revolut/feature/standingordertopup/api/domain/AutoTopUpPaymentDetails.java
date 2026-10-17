package com.revolut.feature.standingordertopup.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import io3.b;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/standingordertopup/api/domain/AutoTopUpPaymentDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_standing_order_topup_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoTopUpPaymentDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AutoTopUpPaymentDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f88171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f88172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88173c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoTopUpPaymentDetails((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoTopUpPaymentDetails[i];
        }
    }

    public AutoTopUpPaymentDetails(d threshold, d amount, String sourceName, b bVar) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        this.f88171a = threshold;
        this.f88172b = amount;
        this.f88173c = sourceName;
        this.d = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AutoTopUpPaymentDetails)) {
            return false;
        }
        AutoTopUpPaymentDetails autoTopUpPaymentDetails = (AutoTopUpPaymentDetails) obj2;
        return Intrinsics.f(this.f88171a, autoTopUpPaymentDetails.f88171a) && Intrinsics.f(this.f88172b, autoTopUpPaymentDetails.f88172b) && Intrinsics.f(this.f88173c, autoTopUpPaymentDetails.f88173c) && Intrinsics.f(this.d, autoTopUpPaymentDetails.d);
    }

    public final int hashCode() {
        int iC = p.a.c(v7.c(this.f88171a.hashCode() * 31, 31, this.f88172b), 31, this.f88173c);
        b bVar = this.d;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f88171a);
        dest.writeSerializable(this.f88172b);
        dest.writeString(this.f88173c);
        dest.writeSerializable(this.d);
    }
}
