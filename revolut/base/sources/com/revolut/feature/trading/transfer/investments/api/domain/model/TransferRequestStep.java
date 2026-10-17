package com.revolut.feature.trading.transfer.investments.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u8f.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferRequestStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferRequestStep implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferRequestStep> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f91528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f91529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91530c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferRequestStep(g.valueOf(parcel.readString()), (ZonedDateTime) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferRequestStep[i];
        }
    }

    public TransferRequestStep(g state, ZonedDateTime zonedDateTime, String title, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f91528a = state;
        this.f91529b = zonedDateTime;
        this.f91530c = title;
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
        if (!(obj2 instanceof TransferRequestStep)) {
            return false;
        }
        TransferRequestStep transferRequestStep = (TransferRequestStep) obj2;
        return this.f91528a == transferRequestStep.f91528a && Intrinsics.f(this.f91529b, transferRequestStep.f91529b) && Intrinsics.f(this.f91530c, transferRequestStep.f91530c) && Intrinsics.f(this.d, transferRequestStep.d);
    }

    public final int hashCode() {
        int iHashCode = this.f91528a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.f91529b;
        int iC = p.a.c((iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31, this.f91530c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91528a.name());
        dest.writeSerializable(this.f91529b);
        dest.writeString(this.f91530c);
        dest.writeString(this.d);
    }
}
