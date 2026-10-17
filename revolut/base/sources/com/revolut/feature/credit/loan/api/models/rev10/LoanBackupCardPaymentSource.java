package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCardPaymentSource;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "q35/c", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanBackupCardPaymentSource implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanBackupCardPaymentSource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q35.c f70137c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanBackupCardPaymentSource(parcel.readString(), parcel.readString(), q35.c.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanBackupCardPaymentSource[i];
        }
    }

    public LoanBackupCardPaymentSource(String id10, String ownerId, q35.c state, String cardId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f70135a = id10;
        this.f70136b = ownerId;
        this.f70137c = state;
        this.d = cardId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanBackupCardPaymentSource)) {
            return false;
        }
        LoanBackupCardPaymentSource loanBackupCardPaymentSource = (LoanBackupCardPaymentSource) obj2;
        return Intrinsics.f(this.f70135a, loanBackupCardPaymentSource.f70135a) && Intrinsics.f(this.f70136b, loanBackupCardPaymentSource.f70136b) && this.f70137c == loanBackupCardPaymentSource.f70137c && Intrinsics.f(this.d, loanBackupCardPaymentSource.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f70137c.hashCode() + p.a.c(this.f70135a.hashCode() * 31, 31, this.f70136b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70135a);
        dest.writeString(this.f70136b);
        dest.writeString(this.f70137c.name());
        dest.writeString(this.d);
    }
}
