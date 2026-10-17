package com.revolut.feature.revolutpay.api.shared.domain.models.payment_options;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t6c.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/payment_options/Cashback;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "t6c/a", "BreakdownItem", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Cashback implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f84348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f84349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f84350c;

    @NotNull
    public static final Parcelable.Creator<Cashback> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/payment_options/Cashback$BreakdownItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BreakdownItem implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f84352b;

        @NotNull
        public static final Parcelable.Creator<BreakdownItem> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BreakdownItem(parcel.readString(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BreakdownItem[i];
            }
        }

        public BreakdownItem(String title, BigDecimal percentage) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(percentage, "percentage");
            this.f84351a = title;
            this.f84352b = percentage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BreakdownItem)) {
                return false;
            }
            BreakdownItem breakdownItem = (BreakdownItem) obj2;
            return Intrinsics.f(this.f84351a, breakdownItem.f84351a) && Intrinsics.f(this.f84352b, breakdownItem.f84352b);
        }

        public final int hashCode() {
            return this.f84352b.hashCode() + (this.f84351a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84351a);
            dest.writeSerializable(this.f84352b);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            a aVarValueOf = a.valueOf(parcel.readString());
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BreakdownItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new Cashback(aVarValueOf, dVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Cashback[i];
        }
    }

    public Cashback(a type, d dVar, List breakdownItems) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(breakdownItems, "breakdownItems");
        this.f84348a = type;
        this.f84349b = dVar;
        this.f84350c = breakdownItems;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Cashback)) {
            return false;
        }
        Cashback cashback = (Cashback) obj2;
        return this.f84348a == cashback.f84348a && Intrinsics.f(this.f84349b, cashback.f84349b) && Intrinsics.f(this.f84350c, cashback.f84350c);
    }

    public final int hashCode() {
        int iHashCode = this.f84348a.hashCode() * 31;
        d dVar = this.f84349b;
        return this.f84350c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84348a.name());
        dest.writeSerializable(this.f84349b);
        Iterator itV = p.a.v(this.f84350c, dest);
        while (itV.hasNext()) {
            ((BreakdownItem) itV.next()).writeToParcel(dest, i);
        }
    }
}
