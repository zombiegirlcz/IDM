package com.revolut.feature.credit.card.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import com.revolut.feature.credit.card.models.creditcard.CreditCardCancellation;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import yw4.f;
import yw4.h;
import yw4.l;
import yw4.o;
import yw4.q;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/models/CreditCard;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "xw4/a", "feature_credit_card_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCard implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCard> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f69794c;
    public final d d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f69795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f69796h;
    public final xw4.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Image f69797j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f69798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f69799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f69800n;
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f69801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f69802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yw4.a f69803r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f69804s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f69805t;
    public final l u;
    public final AdditionalCardholdersState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f69806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f69807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CreditCardCancellation f69808y;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            d dVar4 = (d) parcel.readSerializable();
            d dVar5 = (d) parcel.readSerializable();
            q qVarValueOf = q.valueOf(parcel.readString());
            xw4.a aVarValueOf = xw4.a.valueOf(parcel.readString());
            Image image = (Image) parcel.readParcelable(CreditCard.class.getClassLoader());
            boolean z = false;
            if (parcel.readInt() != 0) {
                z = true;
            }
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            h hVarValueOf = h.valueOf(parcel.readString());
            o oVarValueOf = parcel.readInt() == 0 ? null : o.valueOf(parcel.readString());
            d dVar6 = (d) parcel.readSerializable();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                arrayList.add(f.valueOf(parcel.readString()));
                i3++;
                i2 = i2;
            }
            return new CreditCard(string, string2, dVar, dVar2, dVar3, dVar4, dVar5, qVarValueOf, aVarValueOf, image, z, bVar, i, hVarValueOf, oVarValueOf, dVar6, arrayList, yw4.a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), l.valueOf(parcel.readString()), (AdditionalCardholdersState) parcel.readParcelable(CreditCard.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0 ? CreditCardCancellation.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCard[i];
        }
    }

    public CreditCard(String facilityId, String pocketId, d spentMoney, d availableMoney, d overLimitMoney, d limitMoney, d overdueMoney, q facilityState, xw4.a paymentState, Image icon, boolean z, b currency, int i, h creditCardType, o oVar, d ongoingStatementBalance, List availableFeatures, yw4.a balanceDisplaySetting, boolean z3, String str, l accessLevel, AdditionalCardholdersState additionalCardholdersState, long j2, long j3, CreditCardCancellation creditCardCancellation) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(spentMoney, "spentMoney");
        Intrinsics.checkNotNullParameter(availableMoney, "availableMoney");
        Intrinsics.checkNotNullParameter(overLimitMoney, "overLimitMoney");
        Intrinsics.checkNotNullParameter(limitMoney, "limitMoney");
        Intrinsics.checkNotNullParameter(overdueMoney, "overdueMoney");
        Intrinsics.checkNotNullParameter(facilityState, "facilityState");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(creditCardType, "creditCardType");
        Intrinsics.checkNotNullParameter(ongoingStatementBalance, "ongoingStatementBalance");
        Intrinsics.checkNotNullParameter(availableFeatures, "availableFeatures");
        Intrinsics.checkNotNullParameter(balanceDisplaySetting, "balanceDisplaySetting");
        Intrinsics.checkNotNullParameter(accessLevel, "accessLevel");
        Intrinsics.checkNotNullParameter(additionalCardholdersState, "additionalCardholdersState");
        this.f69792a = facilityId;
        this.f69793b = pocketId;
        this.f69794c = spentMoney;
        this.d = availableMoney;
        this.e = overLimitMoney;
        this.f = limitMoney;
        this.f69795g = overdueMoney;
        this.f69796h = facilityState;
        this.i = paymentState;
        this.f69797j = icon;
        this.k = z;
        this.f69798l = currency;
        this.f69799m = i;
        this.f69800n = creditCardType;
        this.o = oVar;
        this.f69801p = ongoingStatementBalance;
        this.f69802q = availableFeatures;
        this.f69803r = balanceDisplaySetting;
        this.f69804s = z3;
        this.f69805t = str;
        this.u = accessLevel;
        this.v = additionalCardholdersState;
        this.f69806w = j2;
        this.f69807x = j3;
        this.f69808y = creditCardCancellation;
    }

    public final yw4.a a() {
        return b() ? yw4.a.SPENT : this.f69802q.contains(f.MAIN_SCREEN_ONGOING_BALANCE) ? yw4.a.STATEMENT : this.f69803r;
    }

    public final boolean b() {
        return this.f69796h == q.DEACTIVATING;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCard)) {
            return false;
        }
        CreditCard creditCard = (CreditCard) obj2;
        return Intrinsics.f(this.f69792a, creditCard.f69792a) && Intrinsics.f(this.f69793b, creditCard.f69793b) && Intrinsics.f(this.f69794c, creditCard.f69794c) && Intrinsics.f(this.d, creditCard.d) && Intrinsics.f(this.e, creditCard.e) && Intrinsics.f(this.f, creditCard.f) && Intrinsics.f(this.f69795g, creditCard.f69795g) && this.f69796h == creditCard.f69796h && this.i == creditCard.i && Intrinsics.f(this.f69797j, creditCard.f69797j) && this.k == creditCard.k && Intrinsics.f(this.f69798l, creditCard.f69798l) && this.f69799m == creditCard.f69799m && this.f69800n == creditCard.f69800n && this.o == creditCard.o && Intrinsics.f(this.f69801p, creditCard.f69801p) && Intrinsics.f(this.f69802q, creditCard.f69802q) && this.f69803r == creditCard.f69803r && this.f69804s == creditCard.f69804s && Intrinsics.f(this.f69805t, creditCard.f69805t) && this.u == creditCard.u && Intrinsics.f(this.v, creditCard.v) && this.f69806w == creditCard.f69806w && this.f69807x == creditCard.f69807x && Intrinsics.f(this.f69808y, creditCard.f69808y);
    }

    public final int hashCode() {
        int iHashCode = (this.f69800n.hashCode() + j6.a.b(this.f69799m, h30.l.j(this.f69798l, j6.a.c(a10.b.c(this.f69797j, (this.i.hashCode() + ((this.f69796h.hashCode() + v7.c(v7.c(v7.c(v7.c(v7.c(p.a.c(this.f69792a.hashCode() * 31, 31, this.f69793b), 31, this.f69794c), 31, this.d), 31, this.e), 31, this.f), 31, this.f69795g)) * 31)) * 31, 31), 31, this.k), 31), 31)) * 31;
        o oVar = this.o;
        int iC = j6.a.c((this.f69803r.hashCode() + p.a.d(v7.c((iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31, 31, this.f69801p), 31, this.f69802q)) * 31, 31, this.f69804s);
        String str = this.f69805t;
        int iC2 = a0.d.c(a0.d.c((this.v.hashCode() + ((this.u.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f69806w), 31, this.f69807x);
        CreditCardCancellation creditCardCancellation = this.f69808y;
        return iC2 + (creditCardCancellation != null ? creditCardCancellation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69792a);
        dest.writeString(this.f69793b);
        dest.writeSerializable(this.f69794c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f69795g);
        dest.writeString(this.f69796h.name());
        dest.writeString(this.i.name());
        dest.writeParcelable(this.f69797j, i);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeSerializable(this.f69798l);
        dest.writeInt(this.f69799m);
        dest.writeString(this.f69800n.name());
        o oVar = this.o;
        if (oVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(oVar.name());
        }
        dest.writeSerializable(this.f69801p);
        Iterator itV = p.a.v(this.f69802q, dest);
        while (itV.hasNext()) {
            dest.writeString(((f) itV.next()).name());
        }
        dest.writeString(this.f69803r.name());
        dest.writeInt(this.f69804s ? 1 : 0);
        dest.writeString(this.f69805t);
        dest.writeString(this.u.name());
        dest.writeParcelable(this.v, i);
        dest.writeLong(this.f69806w);
        dest.writeLong(this.f69807x);
        CreditCardCancellation creditCardCancellation = this.f69808y;
        if (creditCardCancellation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardCancellation.writeToParcel(dest, i);
        }
    }
}
