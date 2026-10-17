package com.revolut.feature.support.impl.transfer_tracker.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferArrivalRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferArrivalRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f89381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f89383c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            String string = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new TransferArrivalRequest(dVar, string, localDate, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferArrivalRequest[i];
        }
    }

    public TransferArrivalRequest(d amount, String senderBankCountry, LocalDate sentOn, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(senderBankCountry, "senderBankCountry");
        Intrinsics.checkNotNullParameter(sentOn, "sentOn");
        this.f89381a = amount;
        this.f89382b = senderBankCountry;
        this.f89383c = sentOn;
        this.d = z;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferArrivalRequest)) {
            return false;
        }
        TransferArrivalRequest transferArrivalRequest = (TransferArrivalRequest) obj2;
        return Intrinsics.f(this.f89381a, transferArrivalRequest.f89381a) && Intrinsics.f(this.f89382b, transferArrivalRequest.f89382b) && Intrinsics.f(this.f89383c, transferArrivalRequest.f89383c) && this.d == transferArrivalRequest.d && this.e == transferArrivalRequest.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(y.a(p.a.c(this.f89381a.hashCode() * 31, 31, this.f89382b), 31, this.f89383c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f89381a);
        dest.writeString(this.f89382b);
        dest.writeSerializable(this.f89383c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }
}
