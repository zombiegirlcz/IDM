package com.revolut.feature.credit_card.autopay.api.models_v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import h30.l;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayments;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardAutopayPayments implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardAutopayPayments> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f70722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f70723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f70724c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CreditCardAutopayPayments.class, parcel, arrayList, iE, 1);
            }
            return new CreditCardAutopayPayments(localDate, localDate2, arrayList, bVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardAutopayPayments[i];
        }
    }

    public CreditCardAutopayPayments(LocalDate currentDate, LocalDate dueDate, List autoPayments, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(autoPayments, "autoPayments");
        this.f70722a = currentDate;
        this.f70723b = dueDate;
        this.f70724c = currency;
        this.d = autoPayments;
    }

    public final CreditCardAutopayPayment.AutoPayment a() {
        Object next;
        List list = this.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof CreditCardAutopayPayment.AutoPayment) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((CreditCardAutopayPayment.AutoPayment) next).f70706c == nb5.d.ACTIVE) {
                break;
            }
        }
        return (CreditCardAutopayPayment.AutoPayment) next;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardAutopayPayments)) {
            return false;
        }
        CreditCardAutopayPayments creditCardAutopayPayments = (CreditCardAutopayPayments) obj2;
        return Intrinsics.f(this.f70722a, creditCardAutopayPayments.f70722a) && Intrinsics.f(this.f70723b, creditCardAutopayPayments.f70723b) && Intrinsics.f(this.f70724c, creditCardAutopayPayments.f70724c) && Intrinsics.f(this.d, creditCardAutopayPayments.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.j(this.f70724c, y.a(this.f70722a.hashCode() * 31, 31, this.f70723b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70722a);
        dest.writeSerializable(this.f70723b);
        dest.writeSerializable(this.f70724c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
