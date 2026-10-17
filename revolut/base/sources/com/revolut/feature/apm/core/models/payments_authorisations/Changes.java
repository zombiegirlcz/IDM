package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/Changes;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Changes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Changes> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FieldChange f62007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FieldChange f62008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FieldChange f62009c;
    public final FieldChange d;
    public final FieldChange e;
    public final PaymentMethodDetailsAmendment f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Changes((FieldChange) parcel.readParcelable(Changes.class.getClassLoader()), (FieldChange) parcel.readParcelable(Changes.class.getClassLoader()), (FieldChange) parcel.readParcelable(Changes.class.getClassLoader()), (FieldChange) parcel.readParcelable(Changes.class.getClassLoader()), (FieldChange) parcel.readParcelable(Changes.class.getClassLoader()), (PaymentMethodDetailsAmendment) parcel.readParcelable(Changes.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Changes[i];
        }
    }

    public Changes(FieldChange amount, FieldChange expirationDate, FieldChange executionType, FieldChange period, FieldChange paymentAmounts, PaymentMethodDetailsAmendment paymentMethodDetailsAmendment) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(executionType, "executionType");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(paymentAmounts, "paymentAmounts");
        this.f62007a = amount;
        this.f62008b = expirationDate;
        this.f62009c = executionType;
        this.d = period;
        this.e = paymentAmounts;
        this.f = paymentMethodDetailsAmendment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Changes)) {
            return false;
        }
        Changes changes = (Changes) obj2;
        return Intrinsics.f(this.f62007a, changes.f62007a) && Intrinsics.f(this.f62008b, changes.f62008b) && Intrinsics.f(this.f62009c, changes.f62009c) && Intrinsics.f(this.d, changes.d) && Intrinsics.f(this.e, changes.e) && Intrinsics.f(this.f, changes.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f62009c.hashCode() + ((this.f62008b.hashCode() + (this.f62007a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        PaymentMethodDetailsAmendment paymentMethodDetailsAmendment = this.f;
        return iHashCode + (paymentMethodDetailsAmendment == null ? 0 : paymentMethodDetailsAmendment.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62007a, i);
        dest.writeParcelable(this.f62008b, i);
        dest.writeParcelable(this.f62009c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
