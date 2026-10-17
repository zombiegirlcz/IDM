package com.revolut.feature.bank_transfer.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_transfer/models/PaymentVendor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_bank_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentVendor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentVendor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64081c;
    public final String d;
    public final boolean e;
    public final ArrayList f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PaymentVendorCorridor.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PaymentVendor(string, string2, string3, string4, arrayList, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentVendor[i];
        }
    }

    public PaymentVendor(String id10, String name, String logoMono, String logoColored, ArrayList corridors, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoMono, "logoMono");
        Intrinsics.checkNotNullParameter(logoColored, "logoColored");
        Intrinsics.checkNotNullParameter(corridors, "corridors");
        this.f64079a = id10;
        this.f64080b = name;
        this.f64081c = logoMono;
        this.d = logoColored;
        this.e = z;
        this.f = corridors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentVendor)) {
            return false;
        }
        PaymentVendor paymentVendor = (PaymentVendor) obj2;
        return Intrinsics.f(this.f64079a, paymentVendor.f64079a) && Intrinsics.f(this.f64080b, paymentVendor.f64080b) && Intrinsics.f(this.f64081c, paymentVendor.f64081c) && Intrinsics.f(this.d, paymentVendor.d) && this.e == paymentVendor.e && this.f.equals(paymentVendor.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(p.a.c(p.a.c(p.a.c(this.f64079a.hashCode() * 31, 31, this.f64080b), 31, this.f64081c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64079a);
        dest.writeString(this.f64080b);
        dest.writeString(this.f64081c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            ((PaymentVendorCorridor) itY.next()).writeToParcel(dest, i);
        }
    }
}
