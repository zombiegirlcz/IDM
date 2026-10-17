package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r5b.m;
import r6.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f82419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82420c;
    public final d d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f82421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f82422h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f82423j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f82424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f82425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CobrandedCardsTransactionBadge f82426n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CobrandedCardsUpsellBanner f82427p;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String str;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Instant instant = (Instant) parcel.readSerializable();
            int i = parcel.readInt();
            d dVar = (d) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            m mVarValueOf = m.valueOf(parcel.readString());
            String string9 = parcel.readString();
            CobrandedCardsTransactionBadge cobrandedCardsTransactionBadgeCreateFromParcel = parcel.readInt() == 0 ? null : CobrandedCardsTransactionBadge.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                str = string;
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                str = string;
                int iA = 0;
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsTransactionPointsDetail.CREATOR, parcel, arrayList, iA, 1);
                    i2 = i2;
                    instant = instant;
                }
            }
            return new CobrandedCardsTransaction(str, instant, i, dVar, string2, string3, string4, string5, string6, string7, string8, mVarValueOf, string9, cobrandedCardsTransactionBadgeCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : CobrandedCardsUpsellBanner.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsTransaction[i];
        }
    }

    public CobrandedCardsTransaction(String id10, Instant date, int i, d amount, String description, String str, String str2, String str3, String str4, String str5, String str6, m state, String str7, CobrandedCardsTransactionBadge cobrandedCardsTransactionBadge, List list, CobrandedCardsUpsellBanner cobrandedCardsUpsellBanner) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f82418a = id10;
        this.f82419b = date;
        this.f82420c = i;
        this.d = amount;
        this.e = description;
        this.f = str;
        this.f82421g = str2;
        this.f82422h = str3;
        this.i = str4;
        this.f82423j = str5;
        this.k = str6;
        this.f82424l = state;
        this.f82425m = str7;
        this.f82426n = cobrandedCardsTransactionBadge;
        this.o = list;
        this.f82427p = cobrandedCardsUpsellBanner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsTransaction)) {
            return false;
        }
        CobrandedCardsTransaction cobrandedCardsTransaction = (CobrandedCardsTransaction) obj2;
        return Intrinsics.f(this.f82418a, cobrandedCardsTransaction.f82418a) && Intrinsics.f(this.f82419b, cobrandedCardsTransaction.f82419b) && this.f82420c == cobrandedCardsTransaction.f82420c && Intrinsics.f(this.d, cobrandedCardsTransaction.d) && Intrinsics.f(this.e, cobrandedCardsTransaction.e) && Intrinsics.f(this.f, cobrandedCardsTransaction.f) && Intrinsics.f(this.f82421g, cobrandedCardsTransaction.f82421g) && Intrinsics.f(this.f82422h, cobrandedCardsTransaction.f82422h) && Intrinsics.f(this.i, cobrandedCardsTransaction.i) && Intrinsics.f(this.f82423j, cobrandedCardsTransaction.f82423j) && Intrinsics.f(this.k, cobrandedCardsTransaction.k) && this.f82424l == cobrandedCardsTransaction.f82424l && Intrinsics.f(this.f82425m, cobrandedCardsTransaction.f82425m) && Intrinsics.f(this.f82426n, cobrandedCardsTransaction.f82426n) && Intrinsics.f(this.o, cobrandedCardsTransaction.o) && Intrinsics.f(this.f82427p, cobrandedCardsTransaction.f82427p);
    }

    public final int hashCode() {
        int iC = p.a.c(v7.c(j6.a.b(this.f82420c, b.c(this.f82418a.hashCode() * 31, 31, this.f82419b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82421g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82422h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82423j;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode6 = (this.f82424l.hashCode() + ((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31;
        String str7 = this.f82425m;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        CobrandedCardsTransactionBadge cobrandedCardsTransactionBadge = this.f82426n;
        int iHashCode8 = (iHashCode7 + (cobrandedCardsTransactionBadge == null ? 0 : cobrandedCardsTransactionBadge.hashCode())) * 31;
        List list = this.o;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        CobrandedCardsUpsellBanner cobrandedCardsUpsellBanner = this.f82427p;
        return iHashCode9 + (cobrandedCardsUpsellBanner != null ? cobrandedCardsUpsellBanner.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82418a);
        dest.writeSerializable(this.f82419b);
        dest.writeInt(this.f82420c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f82421g);
        dest.writeString(this.f82422h);
        dest.writeString(this.i);
        dest.writeString(this.f82423j);
        dest.writeString(this.k);
        dest.writeString(this.f82424l.name());
        dest.writeString(this.f82425m);
        CobrandedCardsTransactionBadge cobrandedCardsTransactionBadge = this.f82426n;
        if (cobrandedCardsTransactionBadge == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsTransactionBadge.writeToParcel(dest, i);
        }
        List list = this.o;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((CobrandedCardsTransactionPointsDetail) itQ.next()).writeToParcel(dest, i);
            }
        }
        CobrandedCardsUpsellBanner cobrandedCardsUpsellBanner = this.f82427p;
        if (cobrandedCardsUpsellBanner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsUpsellBanner.writeToParcel(dest, i);
        }
    }
}
