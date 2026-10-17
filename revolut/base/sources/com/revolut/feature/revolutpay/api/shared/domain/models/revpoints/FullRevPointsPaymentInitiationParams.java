package com.revolut.feature.revolutpay.api.shared.domain.models.revpoints;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u6c.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/FullRevPointsPaymentInitiationParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FullRevPointsPaymentInitiationParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FullRevPointsPaymentInitiationParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84426c;
    public final t d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FullRevPointsPaymentInitiationParams(RevPoints.CREATOR.createFromParcel(parcel).f84427a, parcel.readString(), parcel.readString(), t.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FullRevPointsPaymentInitiationParams[i];
        }
    }

    public FullRevPointsPaymentInitiationParams(long j2, String orderToken, String quoteToken, t product) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(quoteToken, "quoteToken");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f84424a = j2;
        this.f84425b = orderToken;
        this.f84426c = quoteToken;
        this.d = product;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FullRevPointsPaymentInitiationParams)) {
            return false;
        }
        FullRevPointsPaymentInitiationParams fullRevPointsPaymentInitiationParams = (FullRevPointsPaymentInitiationParams) obj2;
        return RevPoints.a(this.f84424a, fullRevPointsPaymentInitiationParams.f84424a) && Intrinsics.f(this.f84425b, fullRevPointsPaymentInitiationParams.f84425b) && Intrinsics.f(this.f84426c, fullRevPointsPaymentInitiationParams.f84426c) && this.d == fullRevPointsPaymentInitiationParams.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(Long.hashCode(this.f84424a) * 31, 31, this.f84425b), 31, this.f84426c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f84424a);
        dest.writeString(this.f84425b);
        dest.writeString(this.f84426c);
        dest.writeString(this.d.name());
    }
}
