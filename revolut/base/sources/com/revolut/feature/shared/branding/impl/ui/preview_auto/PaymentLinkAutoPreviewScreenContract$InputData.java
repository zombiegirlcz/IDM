package com.revolut.feature.shared.branding.impl.ui.preview_auto;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import ip0.xo0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/branding/impl/ui/preview_auto/PaymentLinkAutoPreviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_branding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentLinkAutoPreviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PaymentLinkAutoPreviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo0 f86073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f86074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86075c;
    public final i6d.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentLinkAutoPreviewScreenContract$InputData(xo0.valueOf(parcel.readString()), (d) parcel.readSerializable(), parcel.readString(), i6d.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentLinkAutoPreviewScreenContract$InputData[i];
        }
    }

    public PaymentLinkAutoPreviewScreenContract$InputData(xo0 heightMode, d linkAmount, String linkTitle, i6d.a type) {
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(linkAmount, "linkAmount");
        Intrinsics.checkNotNullParameter(linkTitle, "linkTitle");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f86073a = heightMode;
        this.f86074b = linkAmount;
        this.f86075c = linkTitle;
        this.d = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentLinkAutoPreviewScreenContract$InputData)) {
            return false;
        }
        PaymentLinkAutoPreviewScreenContract$InputData paymentLinkAutoPreviewScreenContract$InputData = (PaymentLinkAutoPreviewScreenContract$InputData) obj2;
        return this.f86073a == paymentLinkAutoPreviewScreenContract$InputData.f86073a && Intrinsics.f(this.f86074b, paymentLinkAutoPreviewScreenContract$InputData.f86074b) && Intrinsics.f(this.f86075c, paymentLinkAutoPreviewScreenContract$InputData.f86075c) && this.d == paymentLinkAutoPreviewScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(v7.c(this.f86073a.hashCode() * 31, 31, this.f86074b), 31, this.f86075c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86073a.name());
        dest.writeSerializable(this.f86074b);
        dest.writeString(this.f86075c);
        dest.writeString(this.d.name());
    }
}
