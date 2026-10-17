package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/RepaymentSuggestion;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RepaymentSuggestion implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RepaymentSuggestion> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f70205b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RepaymentSuggestion((dj0.d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RepaymentSuggestion[i];
        }
    }

    public RepaymentSuggestion(dj0.d amount, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f70204a = title;
        this.f70205b = amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RepaymentSuggestion)) {
            return false;
        }
        RepaymentSuggestion repaymentSuggestion = (RepaymentSuggestion) obj2;
        return Intrinsics.f(this.f70204a, repaymentSuggestion.f70204a) && Intrinsics.f(this.f70205b, repaymentSuggestion.f70205b);
    }

    public final int hashCode() {
        return this.f70205b.hashCode() + (this.f70204a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70204a);
        dest.writeSerializable(this.f70205b);
    }
}
