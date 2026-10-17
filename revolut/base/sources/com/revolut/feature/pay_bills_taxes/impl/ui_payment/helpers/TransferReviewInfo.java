package com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/helpers/TransferReviewInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReviewInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferReviewInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f78791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f78792c;
    public final LocalDate d;
    public final ServiceProvider e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TransferReviewInfo.class, parcel, arrayList, iE, 1);
            }
            return new TransferReviewInfo(string, dVar, arrayList, (LocalDate) parcel.readSerializable(), (ServiceProvider) parcel.readParcelable(TransferReviewInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReviewInfo[i];
        }
    }

    public TransferReviewInfo(String str, d amount, ArrayList fields, LocalDate localDate, ServiceProvider serviceProvider) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f78790a = str;
        this.f78791b = amount;
        this.f78792c = fields;
        this.d = localDate;
        this.e = serviceProvider;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReviewInfo)) {
            return false;
        }
        TransferReviewInfo transferReviewInfo = (TransferReviewInfo) obj2;
        return Intrinsics.f(this.f78790a, transferReviewInfo.f78790a) && Intrinsics.f(this.f78791b, transferReviewInfo.f78791b) && this.f78792c.equals(transferReviewInfo.f78792c) && Intrinsics.f(this.d, transferReviewInfo.d) && Intrinsics.f(this.e, transferReviewInfo.e);
    }

    public final int hashCode() {
        String str = this.f78790a;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f78792c, v7.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f78791b), 31);
        LocalDate localDate = this.d;
        int iHashCode = (iB + (localDate == null ? 0 : localDate.hashCode())) * 31;
        ServiceProvider serviceProvider = this.e;
        return iHashCode + (serviceProvider != null ? serviceProvider.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78790a);
        dest.writeSerializable(this.f78791b);
        Iterator itY = j6.a.y(this.f78792c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
    }
}
