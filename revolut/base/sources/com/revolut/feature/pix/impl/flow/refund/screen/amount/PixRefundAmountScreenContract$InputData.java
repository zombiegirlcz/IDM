package com.revolut.feature.pix.impl.flow.refund.screen.amount;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/refund/screen/amount/PixRefundAmountScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixRefundAmountScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixRefundAmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80738c;
    public final d d;
    public final Instant e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixRefundAmountScreenContract$InputData((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixRefundAmountScreenContract$InputData[i];
        }
    }

    public PixRefundAmountScreenContract$InputData(d amount, String payerName, String groupId, d limit, Instant until) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(payerName, "payerName");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(until, "until");
        this.f80736a = amount;
        this.f80737b = payerName;
        this.f80738c = groupId;
        this.d = limit;
        this.e = until;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixRefundAmountScreenContract$InputData)) {
            return false;
        }
        PixRefundAmountScreenContract$InputData pixRefundAmountScreenContract$InputData = (PixRefundAmountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80736a, pixRefundAmountScreenContract$InputData.f80736a) && Intrinsics.f(this.f80737b, pixRefundAmountScreenContract$InputData.f80737b) && Intrinsics.f(this.f80738c, pixRefundAmountScreenContract$InputData.f80738c) && Intrinsics.f(this.d, pixRefundAmountScreenContract$InputData.d) && Intrinsics.f(this.e, pixRefundAmountScreenContract$InputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(p.a.c(p.a.c(this.f80736a.hashCode() * 31, 31, this.f80737b), 31, this.f80738c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80736a);
        dest.writeString(this.f80737b);
        dest.writeString(this.f80738c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
