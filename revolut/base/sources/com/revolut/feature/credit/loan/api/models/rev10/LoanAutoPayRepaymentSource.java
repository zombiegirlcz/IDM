package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanAutoPayRepaymentSource;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "q35/a", "q35/b", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanAutoPayRepaymentSource implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanAutoPayRepaymentSource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q35.a f70127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q35.b f70128c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanAutoPayRepaymentSource(parcel.readString(), q35.a.valueOf(parcel.readString()), q35.b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanAutoPayRepaymentSource[i];
        }
    }

    public LoanAutoPayRepaymentSource(String id10, q35.a state, q35.b type, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f70126a = id10;
        this.f70127b = state;
        this.f70128c = type;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanAutoPayRepaymentSource)) {
            return false;
        }
        LoanAutoPayRepaymentSource loanAutoPayRepaymentSource = (LoanAutoPayRepaymentSource) obj2;
        return Intrinsics.f(this.f70126a, loanAutoPayRepaymentSource.f70126a) && this.f70127b == loanAutoPayRepaymentSource.f70127b && this.f70128c == loanAutoPayRepaymentSource.f70128c && Intrinsics.f(this.d, loanAutoPayRepaymentSource.d) && Intrinsics.f(this.e, loanAutoPayRepaymentSource.e) && Intrinsics.f(this.f, loanAutoPayRepaymentSource.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f70128c.hashCode() + ((this.f70127b.hashCode() + (this.f70126a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70126a);
        dest.writeString(this.f70127b.name());
        dest.writeString(this.f70128c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
