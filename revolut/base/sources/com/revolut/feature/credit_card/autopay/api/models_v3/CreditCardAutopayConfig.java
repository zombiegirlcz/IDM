package com.revolut.feature.credit_card.autopay.api.models_v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardAutopayConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardAutopayConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f70693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardAutopayContent f70694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f70695c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CreditCardAutopayConfig.class, parcel, arrayList, iE, 1);
            }
            ArrayList arrayList2 = null;
            CreditCardAutopayContent creditCardAutopayContentCreateFromParcel = parcel.readInt() == 0 ? null : CreditCardAutopayContent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditCardAutopayConfirmation.CREATOR, parcel, arrayList3, iA, 1);
                }
                arrayList2 = arrayList3;
            }
            return new CreditCardAutopayConfig(arrayList, creditCardAutopayContentCreateFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardAutopayConfig[i];
        }
    }

    public CreditCardAutopayConfig(ArrayList availableTypes, CreditCardAutopayContent creditCardAutopayContent, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(availableTypes, "availableTypes");
        this.f70693a = availableTypes;
        this.f70694b = creditCardAutopayContent;
        this.f70695c = arrayList;
    }

    public final CreditCardAutopayType.DirectDebit a() {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f70693a) {
            if (obj2 instanceof CreditCardAutopayType.DirectDebit) {
                arrayList.add(obj2);
            }
        }
        return (CreditCardAutopayType.DirectDebit) d0.d0(arrayList);
    }

    public final CreditCardAutopayType.RevolutPocket b() {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f70693a) {
            if (obj2 instanceof CreditCardAutopayType.RevolutPocket) {
                arrayList.add(obj2);
            }
        }
        return (CreditCardAutopayType.RevolutPocket) d0.d0(arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardAutopayConfig)) {
            return false;
        }
        CreditCardAutopayConfig creditCardAutopayConfig = (CreditCardAutopayConfig) obj2;
        return this.f70693a.equals(creditCardAutopayConfig.f70693a) && Intrinsics.f(this.f70694b, creditCardAutopayConfig.f70694b) && Intrinsics.f(this.f70695c, creditCardAutopayConfig.f70695c);
    }

    public final int hashCode() {
        int iHashCode = this.f70693a.hashCode() * 31;
        CreditCardAutopayContent creditCardAutopayContent = this.f70694b;
        int iHashCode2 = (iHashCode + (creditCardAutopayContent == null ? 0 : creditCardAutopayContent.hashCode())) * 31;
        List list = this.f70695c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f70693a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        CreditCardAutopayContent creditCardAutopayContent = this.f70694b;
        if (creditCardAutopayContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardAutopayContent.writeToParcel(dest, i);
        }
        List list = this.f70695c;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((CreditCardAutopayConfirmation) itQ.next()).writeToParcel(dest, i);
        }
    }
}
