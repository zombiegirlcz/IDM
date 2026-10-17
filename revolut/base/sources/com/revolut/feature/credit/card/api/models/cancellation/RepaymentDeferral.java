package com.revolut.feature.credit.card.api.models.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/cancellation/RepaymentDeferral;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RepaymentDeferral implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RepaymentDeferral> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f68718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68719b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RepaymentDeferral(parcel.readInt(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RepaymentDeferral[i];
        }
    }

    public RepaymentDeferral(int i, LocalDate dueDate) {
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        this.f68718a = dueDate;
        this.f68719b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RepaymentDeferral)) {
            return false;
        }
        RepaymentDeferral repaymentDeferral = (RepaymentDeferral) obj2;
        return Intrinsics.f(this.f68718a, repaymentDeferral.f68718a) && this.f68719b == repaymentDeferral.f68719b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68719b) + (this.f68718a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f68718a);
        dest.writeInt(this.f68719b);
    }
}
