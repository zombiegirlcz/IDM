package com.revolut.feature.credit.card.impl.ui.statement.details.page;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement/details/page/CreditCardStatementPageScreenContract$AccruedInterestParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardStatementPageScreenContract$AccruedInterestParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardStatementPageScreenContract$AccruedInterestParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f69690a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CreditCardStatementPageScreenContract$AccruedInterestParcel.class, parcel, arrayList, iE, 1);
            }
            return new CreditCardStatementPageScreenContract$AccruedInterestParcel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardStatementPageScreenContract$AccruedInterestParcel[i];
        }
    }

    public CreditCardStatementPageScreenContract$AccruedInterestParcel(ArrayList interests) {
        Intrinsics.checkNotNullParameter(interests, "interests");
        this.f69690a = interests;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CreditCardStatementPageScreenContract$AccruedInterestParcel) && this.f69690a.equals(((CreditCardStatementPageScreenContract$AccruedInterestParcel) obj2).f69690a);
    }

    public final int hashCode() {
        return this.f69690a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f69690a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
