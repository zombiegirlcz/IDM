package com.revolut.feature.pay_bills_taxes.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.core.api.model.BillTransferPaymentMethodDetails;
import com.revolut.feature.apm.bills.core.api.model.BillTransferType;
import com.revolut.feature.apm.bills.postal_check.impl.domain.PostalCheckPaymentMethodDetails;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/api/navigation/BillPaymentNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillPaymentNavigation$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BillPaymentNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f78670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillTransferType f78671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f78672c;
    public final BillPaymentNavigation$BillData d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BillTransferPaymentMethodDetails f78673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f78674h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f78675j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            BillTransferType billTransferType = (BillTransferType) parcel.readParcelable(BillPaymentNavigation$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(BillPaymentNavigation$InputData.class, parcel, arrayList, iE, 1);
            }
            return new BillPaymentNavigation$InputData(gVarValueOf, billTransferType, arrayList, BillPaymentNavigation$BillData.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(BillPaymentNavigation$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(BillPaymentNavigation$InputData.class.getClassLoader()), (BillTransferPaymentMethodDetails) parcel.readParcelable(BillPaymentNavigation$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillPaymentNavigation$InputData[i];
        }
    }

    public BillPaymentNavigation$InputData(g paymentMethod, BillTransferType transferType, List fields, BillPaymentNavigation$BillData billData, Clause amountDescriptor, Clause reviewDescriptor, BillTransferPaymentMethodDetails billTransferPaymentMethodDetails, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(billData, "billData");
        Intrinsics.checkNotNullParameter(amountDescriptor, "amountDescriptor");
        Intrinsics.checkNotNullParameter(reviewDescriptor, "reviewDescriptor");
        this.f78670a = paymentMethod;
        this.f78671b = transferType;
        this.f78672c = fields;
        this.d = billData;
        this.e = amountDescriptor;
        this.f = reviewDescriptor;
        this.f78673g = billTransferPaymentMethodDetails;
        this.f78674h = z;
        this.i = z3;
        this.f78675j = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillPaymentNavigation$InputData)) {
            return false;
        }
        BillPaymentNavigation$InputData billPaymentNavigation$InputData = (BillPaymentNavigation$InputData) obj2;
        return this.f78670a == billPaymentNavigation$InputData.f78670a && this.f78671b == billPaymentNavigation$InputData.f78671b && Intrinsics.f(this.f78672c, billPaymentNavigation$InputData.f78672c) && Intrinsics.f(this.d, billPaymentNavigation$InputData.d) && Intrinsics.f(this.e, billPaymentNavigation$InputData.e) && Intrinsics.f(this.f, billPaymentNavigation$InputData.f) && Intrinsics.f(this.f78673g, billPaymentNavigation$InputData.f78673g) && this.f78674h == billPaymentNavigation$InputData.f78674h && this.i == billPaymentNavigation$InputData.i && this.f78675j == billPaymentNavigation$InputData.f78675j;
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a((this.d.hashCode() + p.a.d((this.f78671b.hashCode() + (this.f78670a.hashCode() * 31)) * 31, 31, this.f78672c)) * 31, 31, this.e), 31, this.f);
        BillTransferPaymentMethodDetails billTransferPaymentMethodDetails = this.f78673g;
        return Boolean.hashCode(this.f78675j) + j6.a.c(j6.a.c((iA + (billTransferPaymentMethodDetails == null ? 0 : billTransferPaymentMethodDetails.hashCode())) * 31, 31, this.f78674h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78670a.name());
        dest.writeParcelable(this.f78671b, i);
        Iterator itV = p.a.v(this.f78672c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        this.d.writeToParcel(dest, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f78673g, i);
        dest.writeInt(this.f78674h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f78675j ? 1 : 0);
    }

    public /* synthetic */ BillPaymentNavigation$InputData(g gVar, BillTransferType billTransferType, List list, BillPaymentNavigation$BillData billPaymentNavigation$BillData, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, PostalCheckPaymentMethodDetails postalCheckPaymentMethodDetails, boolean z, boolean z3, int i) {
        this(gVar, billTransferType, list, billPaymentNavigation$BillData, textLocalisedClause, textLocalisedClause2, (i & 64) != 0 ? null : postalCheckPaymentMethodDetails, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z3, (i & 512) == 0);
    }
}
