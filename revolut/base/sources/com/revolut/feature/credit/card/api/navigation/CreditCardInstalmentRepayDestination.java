package com.revolut.feature.credit.card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql4.j;
import ql4.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardInstalmentRepayDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInstalmentRepayDestination implements CreditCardKompotDestination {

    @NotNull
    public static final Parcelable.Creator<CreditCardInstalmentRepayDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f68938c;
    public final ArrayList d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            v vVarValueOf = v.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(j.valueOf(parcel.readString()));
            }
            return new CreditCardInstalmentRepayDestination(string, string2, vVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInstalmentRepayDestination[i];
        }
    }

    public CreditCardInstalmentRepayDestination(String facilityId, String planId, v instalmentType, ArrayList repaymentMethods) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(instalmentType, "instalmentType");
        Intrinsics.checkNotNullParameter(repaymentMethods, "repaymentMethods");
        this.f68936a = facilityId;
        this.f68937b = planId;
        this.f68938c = instalmentType;
        this.d = repaymentMethods;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInstalmentRepayDestination)) {
            return false;
        }
        CreditCardInstalmentRepayDestination creditCardInstalmentRepayDestination = (CreditCardInstalmentRepayDestination) obj2;
        return Intrinsics.f(this.f68936a, creditCardInstalmentRepayDestination.f68936a) && Intrinsics.f(this.f68937b, creditCardInstalmentRepayDestination.f68937b) && this.f68938c == creditCardInstalmentRepayDestination.f68938c && this.d.equals(creditCardInstalmentRepayDestination.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f68938c.hashCode() + p.a.c(this.f68936a.hashCode() * 31, 31, this.f68937b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68936a);
        dest.writeString(this.f68937b);
        dest.writeString(this.f68938c.name());
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            dest.writeString(((j) itY.next()).name());
        }
    }
}
