package com.revolut.feature.salary_switch.impl.models.v2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kqc.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/models/v2/PayrollSwitchCounterparty;", "Lkqc/f;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayrollSwitchCounterparty implements f, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PayrollSwitchCounterparty> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Institution f85248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85250c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayrollSwitchCounterparty(Institution.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayrollSwitchCounterparty[i];
        }
    }

    public PayrollSwitchCounterparty(Institution financialInstitution, String displayName, String search, String str) {
        Intrinsics.checkNotNullParameter(financialInstitution, "financialInstitution");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(search, "search");
        this.f85248a = financialInstitution;
        this.f85249b = displayName;
        this.f85250c = search;
        this.d = str;
    }

    @Override // kqc.f
    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getF85247c() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayrollSwitchCounterparty)) {
            return false;
        }
        PayrollSwitchCounterparty payrollSwitchCounterparty = (PayrollSwitchCounterparty) obj2;
        return Intrinsics.f(this.f85248a, payrollSwitchCounterparty.f85248a) && Intrinsics.f(this.f85249b, payrollSwitchCounterparty.f85249b) && Intrinsics.f(this.f85250c, payrollSwitchCounterparty.f85250c) && Intrinsics.f(this.d, payrollSwitchCounterparty.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f85248a.hashCode() * 31, 31, this.f85249b), 31, this.f85250c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f85248a.writeToParcel(dest, i);
        dest.writeString(this.f85249b);
        dest.writeString(this.f85250c);
        dest.writeString(this.d);
    }
}
