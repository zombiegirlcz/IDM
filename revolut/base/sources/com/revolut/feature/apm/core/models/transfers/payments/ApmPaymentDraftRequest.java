package com.revolut.feature.apm.core.models.transfers.payments;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDraftRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmPaymentDraftRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmPaymentDraftRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmPaymentSource f62202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f62203c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmPaymentDraftRequest(parcel.readString(), ApmPaymentSource.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmPaymentDraftRequest[i];
        }
    }

    public ApmPaymentDraftRequest(String paymentIntent, ApmPaymentSource source, d paymentAmount, String description) {
        Intrinsics.checkNotNullParameter(paymentIntent, "paymentIntent");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f62201a = paymentIntent;
        this.f62202b = source;
        this.f62203c = paymentAmount;
        this.d = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmPaymentDraftRequest)) {
            return false;
        }
        ApmPaymentDraftRequest apmPaymentDraftRequest = (ApmPaymentDraftRequest) obj2;
        return Intrinsics.f(this.f62201a, apmPaymentDraftRequest.f62201a) && Intrinsics.f(this.f62202b, apmPaymentDraftRequest.f62202b) && Intrinsics.f(this.f62203c, apmPaymentDraftRequest.f62203c) && Intrinsics.f(this.d, apmPaymentDraftRequest.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c((this.f62202b.hashCode() + (this.f62201a.hashCode() * 31)) * 31, 31, this.f62203c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62201a);
        this.f62202b.writeToParcel(dest, i);
        dest.writeSerializable(this.f62203c);
        dest.writeString(this.d);
    }
}
