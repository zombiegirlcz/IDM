package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/ExcludedAmountRange;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExcludedAmountRange implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExcludedAmountRange> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f70105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f70106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70107c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExcludedAmountRange((dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExcludedAmountRange[i];
        }
    }

    public ExcludedAmountRange(dj0.d minAmount, dj0.d maxAmount, String text) {
        Intrinsics.checkNotNullParameter(minAmount, "minAmount");
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f70105a = minAmount;
        this.f70106b = maxAmount;
        this.f70107c = text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExcludedAmountRange)) {
            return false;
        }
        ExcludedAmountRange excludedAmountRange = (ExcludedAmountRange) obj2;
        return Intrinsics.f(this.f70105a, excludedAmountRange.f70105a) && Intrinsics.f(this.f70106b, excludedAmountRange.f70106b) && Intrinsics.f(this.f70107c, excludedAmountRange.f70107c);
    }

    public final int hashCode() {
        return this.f70107c.hashCode() + v7.c(this.f70105a.hashCode() * 31, 31, this.f70106b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70105a);
        dest.writeSerializable(this.f70106b);
        dest.writeString(this.f70107c);
    }
}
