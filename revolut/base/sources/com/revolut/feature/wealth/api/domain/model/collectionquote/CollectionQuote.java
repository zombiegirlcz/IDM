package com.revolut.feature.wealth.api.domain.model.collectionquote;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/collectionquote/CollectionQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollectionQuote implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CollectionQuote> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f95265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f95266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f95267c;
    public final d d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f95268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f95269h;
    public final CollectionQuoteFee i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CollectionQuote(arrayList, (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : CollectionQuoteFee.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollectionQuote[i];
        }
    }

    public CollectionQuote(List currencies, d totalAmount, d totalFee, d totalAmountAfterFee, d amountPerCurrency, d dVar, d lowerLimitPerCurrency, d lowerLimitTotal, CollectionQuoteFee collectionQuoteFee) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(totalFee, "totalFee");
        Intrinsics.checkNotNullParameter(totalAmountAfterFee, "totalAmountAfterFee");
        Intrinsics.checkNotNullParameter(amountPerCurrency, "amountPerCurrency");
        Intrinsics.checkNotNullParameter(lowerLimitPerCurrency, "lowerLimitPerCurrency");
        Intrinsics.checkNotNullParameter(lowerLimitTotal, "lowerLimitTotal");
        this.f95265a = currencies;
        this.f95266b = totalAmount;
        this.f95267c = totalFee;
        this.d = totalAmountAfterFee;
        this.e = amountPerCurrency;
        this.f = dVar;
        this.f95268g = lowerLimitPerCurrency;
        this.f95269h = lowerLimitTotal;
        this.i = collectionQuoteFee;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CollectionQuote)) {
            return false;
        }
        CollectionQuote collectionQuote = (CollectionQuote) obj2;
        return Intrinsics.f(this.f95265a, collectionQuote.f95265a) && Intrinsics.f(this.f95266b, collectionQuote.f95266b) && Intrinsics.f(this.f95267c, collectionQuote.f95267c) && Intrinsics.f(this.d, collectionQuote.d) && Intrinsics.f(this.e, collectionQuote.e) && Intrinsics.f(this.f, collectionQuote.f) && Intrinsics.f(this.f95268g, collectionQuote.f95268g) && Intrinsics.f(this.f95269h, collectionQuote.f95269h) && Intrinsics.f(this.i, collectionQuote.i);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(v7.c(v7.c(this.f95265a.hashCode() * 31, 31, this.f95266b), 31, this.f95267c), 31, this.d), 31, this.e);
        d dVar = this.f;
        int iC2 = v7.c(v7.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f95268g), 31, this.f95269h);
        CollectionQuoteFee collectionQuoteFee = this.i;
        return iC2 + (collectionQuoteFee != null ? collectionQuoteFee.f95270a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f95265a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeSerializable(this.f95266b);
        dest.writeSerializable(this.f95267c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f95268g);
        dest.writeSerializable(this.f95269h);
        CollectionQuoteFee collectionQuoteFee = this.i;
        if (collectionQuoteFee == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            collectionQuoteFee.writeToParcel(dest, i);
        }
    }
}
