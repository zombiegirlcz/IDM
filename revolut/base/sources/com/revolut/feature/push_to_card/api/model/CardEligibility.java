package com.revolut.feature.push_to_card.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/model/CardEligibility;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardEligibility implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardEligibility> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81511c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f81512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f81513h;
    public final CardIneligibleReason i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f81514j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iE = 0;
            boolean z = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            CardIneligibleReason cardIneligibleReasonCreateFromParcel = parcel.readInt() == 0 ? null : CardIneligibleReason.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iE != i) {
                iE = j6.a.e(CardEligibility.class, parcel, arrayList, iE, 1);
            }
            return new CardEligibility(z, z3, string, string2, string3, string4, string5, z4, cardIneligibleReasonCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardEligibility[i];
        }
    }

    public CardEligibility(boolean z, boolean z3, String issuerCountry, String billingCurrency, String scheme, String issuerName, String str, boolean z4, CardIneligibleReason cardIneligibleReason, List additionalFields) {
        Intrinsics.checkNotNullParameter(issuerCountry, "issuerCountry");
        Intrinsics.checkNotNullParameter(billingCurrency, "billingCurrency");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(issuerName, "issuerName");
        Intrinsics.checkNotNullParameter(additionalFields, "additionalFields");
        this.f81509a = z;
        this.f81510b = z3;
        this.f81511c = issuerCountry;
        this.d = billingCurrency;
        this.e = scheme;
        this.f = issuerName;
        this.f81512g = str;
        this.f81513h = z4;
        this.i = cardIneligibleReason;
        this.f81514j = additionalFields;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardEligibility)) {
            return false;
        }
        CardEligibility cardEligibility = (CardEligibility) obj2;
        return this.f81509a == cardEligibility.f81509a && this.f81510b == cardEligibility.f81510b && Intrinsics.f(this.f81511c, cardEligibility.f81511c) && Intrinsics.f(this.d, cardEligibility.d) && Intrinsics.f(this.e, cardEligibility.e) && Intrinsics.f(this.f, cardEligibility.f) && Intrinsics.f(this.f81512g, cardEligibility.f81512g) && this.f81513h == cardEligibility.f81513h && Intrinsics.f(this.i, cardEligibility.i) && Intrinsics.f(this.f81514j, cardEligibility.f81514j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c(Boolean.hashCode(this.f81509a) * 31, 31, this.f81510b), 31, this.f81511c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f81512g;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f81513h);
        CardIneligibleReason cardIneligibleReason = this.i;
        return this.f81514j.hashCode() + ((iC2 + (cardIneligibleReason != null ? Integer.hashCode(cardIneligibleReason.f81515a) : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f81509a ? 1 : 0);
        dest.writeInt(this.f81510b ? 1 : 0);
        dest.writeString(this.f81511c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f81512g);
        dest.writeInt(this.f81513h ? 1 : 0);
        CardIneligibleReason cardIneligibleReason = this.i;
        if (cardIneligibleReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardIneligibleReason.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.f81514j, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
