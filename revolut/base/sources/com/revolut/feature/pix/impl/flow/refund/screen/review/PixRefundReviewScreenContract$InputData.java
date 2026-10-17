package com.revolut.feature.pix.impl.flow.refund.screen.review;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/refund/screen/review/PixRefundReviewScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixRefundReviewScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixRefundReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80741c;
    public final d d;
    public final Instant e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f80742g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixRefundReviewScreenContract$InputData((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixRefundReviewScreenContract$InputData[i];
        }
    }

    public PixRefundReviewScreenContract$InputData(d amount, String groupId, String payerName, d originalAmount, Instant instant, String reference, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(payerName, "payerName");
        Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f80739a = amount;
        this.f80740b = groupId;
        this.f80741c = payerName;
        this.d = originalAmount;
        this.e = instant;
        this.f = reference;
        this.f80742g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixRefundReviewScreenContract$InputData)) {
            return false;
        }
        PixRefundReviewScreenContract$InputData pixRefundReviewScreenContract$InputData = (PixRefundReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80739a, pixRefundReviewScreenContract$InputData.f80739a) && Intrinsics.f(this.f80740b, pixRefundReviewScreenContract$InputData.f80740b) && Intrinsics.f(this.f80741c, pixRefundReviewScreenContract$InputData.f80741c) && Intrinsics.f(this.d, pixRefundReviewScreenContract$InputData.d) && Intrinsics.f(this.e, pixRefundReviewScreenContract$InputData.e) && Intrinsics.f(this.f, pixRefundReviewScreenContract$InputData.f) && this.f80742g == pixRefundReviewScreenContract$InputData.f80742g;
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(p.a.c(this.f80739a.hashCode() * 31, 31, this.f80740b), 31, this.f80741c), 31, this.d);
        Instant instant = this.e;
        return Boolean.hashCode(this.f80742g) + p.a.c((iC + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80739a);
        dest.writeString(this.f80740b);
        dest.writeString(this.f80741c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f);
        dest.writeInt(this.f80742g ? 1 : 0);
    }
}
