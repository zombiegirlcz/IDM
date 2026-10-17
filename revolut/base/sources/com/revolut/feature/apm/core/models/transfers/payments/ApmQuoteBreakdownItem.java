package com.revolut.feature.apm.core.models.transfers.payments;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmQuoteBreakdownItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmQuoteBreakdownItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmQuoteBreakdownItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62216c;
    public final d d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmQuoteBreakdownItem(parcel.readString(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmQuoteBreakdownItem[i];
        }
    }

    public ApmQuoteBreakdownItem(String title, String description, String shortDescription, d amount, d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f62214a = title;
        this.f62215b = description;
        this.f62216c = shortDescription;
        this.d = amount;
        this.e = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmQuoteBreakdownItem)) {
            return false;
        }
        ApmQuoteBreakdownItem apmQuoteBreakdownItem = (ApmQuoteBreakdownItem) obj2;
        return Intrinsics.f(this.f62214a, apmQuoteBreakdownItem.f62214a) && Intrinsics.f(this.f62215b, apmQuoteBreakdownItem.f62215b) && Intrinsics.f(this.f62216c, apmQuoteBreakdownItem.f62216c) && Intrinsics.f(this.d, apmQuoteBreakdownItem.d) && Intrinsics.f(this.e, apmQuoteBreakdownItem.e);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(p.a.c(this.f62214a.hashCode() * 31, 31, this.f62215b), 31, this.f62216c), 31, this.d);
        d dVar = this.e;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62214a);
        dest.writeString(this.f62215b);
        dest.writeString(this.f62216c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
