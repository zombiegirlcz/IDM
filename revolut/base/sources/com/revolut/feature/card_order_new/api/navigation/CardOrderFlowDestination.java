package com.revolut.feature.card_order_new.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import c93.b;
import c93.j;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import e93.n;
import grl.k9;
import h30.l;
import h93.f0;
import i93.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;
import prk.o;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/card_order_new/api/navigation/CardOrderFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "CardDelivery", "ChangeDeliveryAddress", "CardPersonalisation", "Lcom/revolut/feature/card_order_new/api/navigation/CardOrderFlowDestination$CardDelivery;", "Lcom/revolut/feature/card_order_new/api/navigation/CardOrderFlowDestination$CardPersonalisation;", "Lcom/revolut/feature/card_order_new/api/navigation/CardOrderFlowDestination$ChangeDeliveryAddress;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardOrderFlowDestination implements KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/navigation/CardOrderFlowDestination$ChangeDeliveryAddress;", "Lcom/revolut/feature/card_order_new/api/navigation/CardOrderFlowDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeDeliveryAddress extends CardOrderFlowDestination {

        @NotNull
        public static final Parcelable.Creator<ChangeDeliveryAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f64994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Address f64995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AccountId f64996c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeDeliveryAddress((f0) parcel.readSerializable(), (Address) parcel.readParcelable(ChangeDeliveryAddress.class.getClassLoader()), (AccountId) parcel.readParcelable(ChangeDeliveryAddress.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeDeliveryAddress[i];
            }
        }

        public ChangeDeliveryAddress(f0 card, Address address, AccountId accountId) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f64994a = card;
            this.f64995b = address;
            this.f64996c = accountId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Address getF64995b() {
            return this.f64995b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final f0 getF64994a() {
            return this.f64994a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChangeDeliveryAddress)) {
                return false;
            }
            ChangeDeliveryAddress changeDeliveryAddress = (ChangeDeliveryAddress) obj2;
            return Intrinsics.f(this.f64994a, changeDeliveryAddress.f64994a) && Intrinsics.f(this.f64995b, changeDeliveryAddress.f64995b) && Intrinsics.f(this.f64996c, changeDeliveryAddress.f64996c);
        }

        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF64996c() {
            return this.f64996c;
        }

        public final int hashCode() {
            return this.f64996c.hashCode() + ((this.f64995b.hashCode() + (this.f64994a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64994a);
            dest.writeParcelable(this.f64995b, i);
            dest.writeParcelable(this.f64996c, i);
        }
    }

    private CardOrderFlowDestination() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/navigation/CardOrderFlowDestination$CardPersonalisation;", "Lcom/revolut/feature/card_order_new/api/navigation/CardOrderFlowDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardPersonalisation extends CardOrderFlowDestination {

        @NotNull
        public static final Parcelable.Creator<CardPersonalisation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f64985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f64987c;
        public final b d;
        public final String e;
        public final h f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final NaviCommand f64988g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final xfa.b f64989h;
        public final j i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AccountId f64990j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f64991l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AnalyticsProduct f64992m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f64993n;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                n nVar = (n) parcel.readSerializable();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new CardPersonalisation(nVar, z3, parcel.readInt() == 0 ? z : true, (b) parcel.readSerializable(), parcel.readString(), (h) parcel.readSerializable(), (NaviCommand) parcel.readParcelable(CardPersonalisation.class.getClassLoader()), parcel.readInt() == 0 ? null : xfa.b.valueOf(parcel.readString()), (j) parcel.readSerializable(), (AccountId) parcel.readParcelable(CardPersonalisation.class.getClassLoader()), parcel.readString(), parcel.readString(), (AnalyticsProduct) parcel.readParcelable(CardPersonalisation.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardPersonalisation[i];
            }
        }

        public CardPersonalisation(n customisation, boolean z, boolean z3, b card, String str, h hVar, NaviCommand naviCommand, xfa.b bVar, j jVar, AccountId accountId, String str2, String str3, AnalyticsProduct automaticEventProduct, String str4) {
            Intrinsics.checkNotNullParameter(customisation, "customisation");
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            this.f64985a = customisation;
            this.f64986b = z;
            this.f64987c = z3;
            this.d = card;
            this.e = str;
            this.f = hVar;
            this.f64988g = naviCommand;
            this.f64989h = bVar;
            this.i = jVar;
            this.f64990j = accountId;
            this.k = str2;
            this.f64991l = str3;
            this.f64992m = automaticEventProduct;
            this.f64993n = str4;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final NaviCommand getF64988g() {
            return this.f64988g;
        }

        /* JADX INFO: renamed from: T, reason: from getter */
        public final String getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: W, reason: from getter */
        public final xfa.b getF64989h() {
            return this.f64989h;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF64993n() {
            return this.f64993n;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final h getF() {
            return this.f;
        }

        /* JADX INFO: renamed from: c0, reason: from getter */
        public final String getK() {
            return this.k;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final n getF64985a() {
            return this.f64985a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final j getI() {
            return this.i;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardPersonalisation)) {
                return false;
            }
            CardPersonalisation cardPersonalisation = (CardPersonalisation) obj2;
            return Intrinsics.f(this.f64985a, cardPersonalisation.f64985a) && this.f64986b == cardPersonalisation.f64986b && this.f64987c == cardPersonalisation.f64987c && Intrinsics.f(this.d, cardPersonalisation.d) && Intrinsics.f(this.e, cardPersonalisation.e) && Intrinsics.f(this.f, cardPersonalisation.f) && Intrinsics.f(this.f64988g, cardPersonalisation.f64988g) && this.f64989h == cardPersonalisation.f64989h && Intrinsics.f(this.i, cardPersonalisation.i) && Intrinsics.f(this.f64990j, cardPersonalisation.f64990j) && Intrinsics.f(this.k, cardPersonalisation.k) && Intrinsics.f(this.f64991l, cardPersonalisation.f64991l) && Intrinsics.f(this.f64992m, cardPersonalisation.f64992m) && Intrinsics.f(this.f64993n, cardPersonalisation.f64993n);
        }

        /* JADX INFO: renamed from: f0, reason: from getter */
        public final boolean getF64986b() {
            return this.f64986b;
        }

        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF64990j() {
            return this.f64990j;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + j6.a.c(j6.a.c(this.f64985a.hashCode() * 31, 31, this.f64986b), 31, this.f64987c)) * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            h hVar = this.f;
            int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            NaviCommand naviCommand = this.f64988g;
            int iHashCode4 = (iHashCode3 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            xfa.b bVar = this.f64989h;
            int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            j jVar = this.i;
            int iB = l.b(this.f64990j, (iHashCode5 + (jVar == null ? 0 : jVar.hashCode())) * 31, 31);
            String str2 = this.k;
            int iHashCode6 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f64991l;
            int iA = l.a((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f64992m);
            String str4 = this.f64993n;
            return iA + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getF64992m() {
            return this.f64992m;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getF64987c() {
            return this.f64987c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64985a);
            dest.writeInt(this.f64986b ? 1 : 0);
            dest.writeInt(this.f64987c ? 1 : 0);
            dest.writeSerializable(this.d);
            dest.writeString(this.e);
            dest.writeSerializable(this.f);
            dest.writeParcelable(this.f64988g, i);
            xfa.b bVar = this.f64989h;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeSerializable(this.i);
            dest.writeParcelable(this.f64990j, i);
            dest.writeString(this.k);
            dest.writeString(this.f64991l);
            dest.writeParcelable(this.f64992m, i);
            dest.writeString(this.f64993n);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getF64991l() {
            return this.f64991l;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CardPersonalisation(n nVar, boolean z, b bVar, String str, h hVar, NaviCommand naviCommand, xfa.b bVar2, j jVar, AccountId accountId, String str2, AnalyticsProduct analyticsProduct, String str3, int i) {
            AnalyticsProduct analyticsProductG;
            boolean z3 = (i & 2) == 0;
            boolean z4 = (i & 4) != 0 ? true : z;
            String str4 = (i & 16) != 0 ? null : str;
            NaviCommand naviCommand2 = (i & 64) != 0 ? null : naviCommand;
            xfa.b bVar3 = (i & 128) != 0 ? null : bVar2;
            String str5 = (i & 1024) != 0 ? null : str2;
            if ((i & 4096) != 0) {
                AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                k9 k9Var = frl.a.f137496c;
                analyticsProductG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
            } else {
                analyticsProductG = analyticsProduct;
            }
            this(nVar, z3, z4, bVar, str4, hVar, naviCommand2, bVar3, jVar, accountId, str5, null, analyticsProductG, (i & 8192) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/navigation/CardOrderFlowDestination$CardDelivery;", "Lcom/revolut/feature/card_order_new/api/navigation/CardOrderFlowDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardDelivery extends CardOrderFlowDestination {

        @NotNull
        public static final Parcelable.Creator<CardDelivery> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f64974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64976c;
        public final Address d;
        public final h e;
        public final NaviCommand f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final xfa.b f64977g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final j f64978h;
        public final j i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AccountId f64979j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f64980l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List f64981m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AnalyticsProduct f64982n;
        public final d o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Set f64983p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f64984q;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                xfa.b bVar;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVar2 = (b) parcel.readSerializable();
                String string = parcel.readString();
                String string2 = parcel.readString();
                Address address = (Address) parcel.readParcelable(CardDelivery.class.getClassLoader());
                h hVar = (h) parcel.readSerializable();
                NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(CardDelivery.class.getClassLoader());
                LinkedHashSet linkedHashSet = null;
                xfa.b bVarValueOf = parcel.readInt() == 0 ? null : xfa.b.valueOf(parcel.readString());
                j jVar = (j) parcel.readSerializable();
                j jVar2 = (j) parcel.readSerializable();
                AccountId accountId = (AccountId) parcel.readParcelable(CardDelivery.class.getClassLoader());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(CardDelivery.class.getClassLoader());
                d dVarValueOf = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    bVar = bVarValueOf;
                } else {
                    int i = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i);
                    bVar = bVarValueOf;
                    int iA = 0;
                    while (iA != i) {
                        iA = o.a(parcel, linkedHashSet, iA, 1);
                        i = i;
                    }
                }
                return new CardDelivery(bVar2, string, string2, address, hVar, naviCommand, bVar, jVar, jVar2, accountId, string3, string4, arrayListCreateStringArrayList, analyticsProduct, dVarValueOf, linkedHashSet, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardDelivery[i];
            }
        }

        public CardDelivery(b card, String str, String str2, Address address, h hVar, NaviCommand naviCommand, xfa.b bVar, j jVar, j jVar2, AccountId accountId, String str3, String str4, List list, AnalyticsProduct automaticEventProduct, d dVar, Set set, String str5) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            this.f64974a = card;
            this.f64975b = str;
            this.f64976c = str2;
            this.d = address;
            this.e = hVar;
            this.f = naviCommand;
            this.f64977g = bVar;
            this.f64978h = jVar;
            this.i = jVar2;
            this.f64979j = accountId;
            this.k = str3;
            this.f64980l = str4;
            this.f64981m = list;
            this.f64982n = automaticEventProduct;
            this.o = dVar;
            this.f64983p = set;
            this.f64984q = str5;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final j getI() {
            return this.i;
        }

        /* JADX INFO: renamed from: T, reason: from getter */
        public final String getF64980l() {
            return this.f64980l;
        }

        /* JADX INFO: renamed from: W, reason: from getter */
        public final String getF64975b() {
            return this.f64975b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Address getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final d getO() {
            return this.o;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Set getF64983p() {
            return this.f64983p;
        }

        /* JADX INFO: renamed from: c0, reason: from getter */
        public final NaviCommand getF() {
            return this.f;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getF64974a() {
            return this.f64974a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getF64984q() {
            return this.f64984q;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardDelivery)) {
                return false;
            }
            CardDelivery cardDelivery = (CardDelivery) obj2;
            return Intrinsics.f(this.f64974a, cardDelivery.f64974a) && Intrinsics.f(this.f64975b, cardDelivery.f64975b) && Intrinsics.f(this.f64976c, cardDelivery.f64976c) && Intrinsics.f(this.d, cardDelivery.d) && Intrinsics.f(this.e, cardDelivery.e) && Intrinsics.f(this.f, cardDelivery.f) && this.f64977g == cardDelivery.f64977g && Intrinsics.f(this.f64978h, cardDelivery.f64978h) && Intrinsics.f(this.i, cardDelivery.i) && Intrinsics.f(this.f64979j, cardDelivery.f64979j) && Intrinsics.f(this.k, cardDelivery.k) && Intrinsics.f(this.f64980l, cardDelivery.f64980l) && Intrinsics.f(this.f64981m, cardDelivery.f64981m) && Intrinsics.f(this.f64982n, cardDelivery.f64982n) && this.o == cardDelivery.o && Intrinsics.f(this.f64983p, cardDelivery.f64983p) && Intrinsics.f(this.f64984q, cardDelivery.f64984q);
        }

        /* JADX INFO: renamed from: f0, reason: from getter */
        public final String getF64976c() {
            return this.f64976c;
        }

        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF64979j() {
            return this.f64979j;
        }

        public final int hashCode() {
            int iHashCode = this.f64974a.hashCode() * 31;
            String str = this.f64975b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f64976c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Address address = this.d;
            int iHashCode4 = (iHashCode3 + (address == null ? 0 : address.hashCode())) * 31;
            h hVar = this.e;
            int iHashCode5 = (iHashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            NaviCommand naviCommand = this.f;
            int iHashCode6 = (iHashCode5 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            xfa.b bVar = this.f64977g;
            int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            j jVar = this.f64978h;
            int iHashCode8 = (iHashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
            j jVar2 = this.i;
            int iB = l.b(this.f64979j, (iHashCode8 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31, 31);
            String str3 = this.k;
            int iHashCode9 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f64980l;
            int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List list = this.f64981m;
            int iA = l.a((iHashCode10 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f64982n);
            d dVar = this.o;
            int iHashCode11 = (iA + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Set set = this.f64983p;
            int iHashCode12 = (iHashCode11 + (set == null ? 0 : set.hashCode())) * 31;
            String str5 = this.f64984q;
            return iHashCode12 + (str5 != null ? str5.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getF64982n() {
            return this.f64982n;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final h getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: k0, reason: from getter */
        public final xfa.b getF64977g() {
            return this.f64977g;
        }

        /* JADX INFO: renamed from: p0, reason: from getter */
        public final String getK() {
            return this.k;
        }

        /* JADX INFO: renamed from: w2, reason: from getter */
        public final List getF64981m() {
            return this.f64981m;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64974a);
            dest.writeString(this.f64975b);
            dest.writeString(this.f64976c);
            dest.writeParcelable(this.d, i);
            dest.writeSerializable(this.e);
            dest.writeParcelable(this.f, i);
            xfa.b bVar = this.f64977g;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeSerializable(this.f64978h);
            dest.writeSerializable(this.i);
            dest.writeParcelable(this.f64979j, i);
            dest.writeString(this.k);
            dest.writeString(this.f64980l);
            dest.writeStringList(this.f64981m);
            dest.writeParcelable(this.f64982n, i);
            d dVar = this.o;
            if (dVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dVar.name());
            }
            Set set = this.f64983p;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeString((String) itQ.next());
                }
            }
            dest.writeString(this.f64984q);
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final j getF64978h() {
            return this.f64978h;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CardDelivery(b bVar, String str, Address address, h hVar, NaviCommand naviCommand, xfa.b bVar2, j jVar, j jVar2, AccountId accountId, String str2, String str3, List list, AnalyticsProduct analyticsProduct, d dVar, Set set, String str4, int i) {
            AnalyticsProduct analyticsProductG;
            String str5 = (i & 4) != 0 ? null : str;
            Address address2 = (i & 8) != 0 ? null : address;
            h hVar2 = (i & 16) != 0 ? null : hVar;
            NaviCommand naviCommand2 = (i & 32) != 0 ? null : naviCommand;
            xfa.b bVar3 = (i & 64) != 0 ? null : bVar2;
            j jVar3 = (i & 128) != 0 ? null : jVar;
            j jVar4 = (i & 256) != 0 ? null : jVar2;
            AccountId accountId2 = (i & 512) != 0 ? AccountId.Personal.f51414a : accountId;
            String str6 = (i & 1024) != 0 ? null : str2;
            String str7 = (i & 2048) != 0 ? null : str3;
            List list2 = (i & 4096) != 0 ? null : list;
            if ((i & 8192) != 0) {
                AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                k9 k9Var = frl.a.f137496c;
                analyticsProductG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
            } else {
                analyticsProductG = analyticsProduct;
            }
            this(bVar, (String) null, str5, address2, hVar2, naviCommand2, bVar3, jVar3, jVar4, accountId2, str6, str7, list2, analyticsProductG, (i & 16384) != 0 ? null : dVar, (32768 & i) != 0 ? null : set, (i & 65536) != 0 ? null : str4);
        }
    }
}
