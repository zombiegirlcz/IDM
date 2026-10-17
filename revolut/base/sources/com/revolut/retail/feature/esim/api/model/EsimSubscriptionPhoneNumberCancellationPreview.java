package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionPhoneNumberCancellationPreview;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionPhoneNumberCancellationPreview implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionPhoneNumberCancellationPreview> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f100476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f100477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumberCancellationPreviewRefund f100478c;
    public final EsimSubscriptionPhoneNumberPostCancellationBreakdown d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionPhoneNumberCancellationPreview((Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readInt() == 0 ? null : EsimSubscriptionPhoneNumberCancellationPreviewRefund.CREATOR.createFromParcel(parcel), EsimSubscriptionPhoneNumberPostCancellationBreakdown.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionPhoneNumberCancellationPreview[i];
        }
    }

    public EsimSubscriptionPhoneNumberCancellationPreview(Instant instant, Instant instant2, EsimSubscriptionPhoneNumberCancellationPreviewRefund esimSubscriptionPhoneNumberCancellationPreviewRefund, EsimSubscriptionPhoneNumberPostCancellationBreakdown postCancellationBreakdown) {
        Intrinsics.checkNotNullParameter(postCancellationBreakdown, "postCancellationBreakdown");
        this.f100476a = instant;
        this.f100477b = instant2;
        this.f100478c = esimSubscriptionPhoneNumberCancellationPreviewRefund;
        this.d = postCancellationBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionPhoneNumberCancellationPreview)) {
            return false;
        }
        EsimSubscriptionPhoneNumberCancellationPreview esimSubscriptionPhoneNumberCancellationPreview = (EsimSubscriptionPhoneNumberCancellationPreview) obj2;
        return Intrinsics.f(this.f100476a, esimSubscriptionPhoneNumberCancellationPreview.f100476a) && Intrinsics.f(this.f100477b, esimSubscriptionPhoneNumberCancellationPreview.f100477b) && Intrinsics.f(this.f100478c, esimSubscriptionPhoneNumberCancellationPreview.f100478c) && Intrinsics.f(this.d, esimSubscriptionPhoneNumberCancellationPreview.d);
    }

    public final int hashCode() {
        Instant instant = this.f100476a;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        Instant instant2 = this.f100477b;
        int iHashCode2 = (iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        EsimSubscriptionPhoneNumberCancellationPreviewRefund esimSubscriptionPhoneNumberCancellationPreviewRefund = this.f100478c;
        return this.d.f100493a.hashCode() + ((iHashCode2 + (esimSubscriptionPhoneNumberCancellationPreviewRefund != null ? esimSubscriptionPhoneNumberCancellationPreviewRefund.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100476a);
        dest.writeSerializable(this.f100477b);
        EsimSubscriptionPhoneNumberCancellationPreviewRefund esimSubscriptionPhoneNumberCancellationPreviewRefund = this.f100478c;
        if (esimSubscriptionPhoneNumberCancellationPreviewRefund == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimSubscriptionPhoneNumberCancellationPreviewRefund.writeToParcel(dest, i);
        }
        this.d.writeToParcel(dest, i);
    }
}
