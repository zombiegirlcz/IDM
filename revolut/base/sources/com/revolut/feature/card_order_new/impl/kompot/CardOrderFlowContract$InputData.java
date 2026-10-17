package com.revolut.feature.card_order_new.impl.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import c93.j;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.common.IOData$Input;
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
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "CardDelivery", "ChangeDeliveryAddress", "CardPersonalisation", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$InputData$CardDelivery;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$InputData$CardPersonalisation;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$InputData$ChangeDeliveryAddress;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardOrderFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$InputData$CardDelivery;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardDelivery extends CardOrderFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CardDelivery> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c93.b f65027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f65029c;
        public final Address d;
        public final h e;
        public final NaviCommand f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final xfa.b f65030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final j f65031h;
        public final j i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AccountId f65032j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f65033l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List f65034m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AnalyticsProduct f65035n;
        public final d o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Set f65036p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f65037q;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                xfa.b bVar;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                c93.b bVar2 = (c93.b) parcel.readSerializable();
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

        public CardDelivery(c93.b card, String str, String str2, Address address, h hVar, NaviCommand naviCommand, xfa.b bVar, j jVar, j jVar2, AccountId accountId, String str3, String str4, List list, AnalyticsProduct automaticEventProduct, d dVar, Set set, String str5) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            this.f65027a = card;
            this.f65028b = str;
            this.f65029c = str2;
            this.d = address;
            this.e = hVar;
            this.f = naviCommand;
            this.f65030g = bVar;
            this.f65031h = jVar;
            this.i = jVar2;
            this.f65032j = accountId;
            this.k = str3;
            this.f65033l = str4;
            this.f65034m = list;
            this.f65035n = automaticEventProduct;
            this.o = dVar;
            this.f65036p = set;
            this.f65037q = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardDelivery)) {
                return false;
            }
            CardDelivery cardDelivery = (CardDelivery) obj2;
            return Intrinsics.f(this.f65027a, cardDelivery.f65027a) && Intrinsics.f(this.f65028b, cardDelivery.f65028b) && Intrinsics.f(this.f65029c, cardDelivery.f65029c) && Intrinsics.f(this.d, cardDelivery.d) && Intrinsics.f(this.e, cardDelivery.e) && Intrinsics.f(this.f, cardDelivery.f) && this.f65030g == cardDelivery.f65030g && Intrinsics.f(this.f65031h, cardDelivery.f65031h) && Intrinsics.f(this.i, cardDelivery.i) && Intrinsics.f(this.f65032j, cardDelivery.f65032j) && Intrinsics.f(this.k, cardDelivery.k) && Intrinsics.f(this.f65033l, cardDelivery.f65033l) && Intrinsics.f(this.f65034m, cardDelivery.f65034m) && Intrinsics.f(this.f65035n, cardDelivery.f65035n) && this.o == cardDelivery.o && Intrinsics.f(this.f65036p, cardDelivery.f65036p) && Intrinsics.f(this.f65037q, cardDelivery.f65037q);
        }

        public final int hashCode() {
            int iHashCode = this.f65027a.hashCode() * 31;
            String str = this.f65028b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f65029c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Address address = this.d;
            int iHashCode4 = (iHashCode3 + (address == null ? 0 : address.hashCode())) * 31;
            h hVar = this.e;
            int iHashCode5 = (iHashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            NaviCommand naviCommand = this.f;
            int iHashCode6 = (iHashCode5 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            xfa.b bVar = this.f65030g;
            int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            j jVar = this.f65031h;
            int iHashCode8 = (iHashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
            j jVar2 = this.i;
            int iB = l.b(this.f65032j, (iHashCode8 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31, 31);
            String str3 = this.k;
            int iHashCode9 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f65033l;
            int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List list = this.f65034m;
            int iA = l.a((iHashCode10 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f65035n);
            d dVar = this.o;
            int iHashCode11 = (iA + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Set set = this.f65036p;
            int iHashCode12 = (iHashCode11 + (set == null ? 0 : set.hashCode())) * 31;
            String str5 = this.f65037q;
            return iHashCode12 + (str5 != null ? str5.hashCode() : 0);
        }

        @Override // com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$InputData
        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getD() {
            return this.f65035n;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65027a);
            dest.writeString(this.f65028b);
            dest.writeString(this.f65029c);
            dest.writeParcelable(this.d, i);
            dest.writeSerializable(this.e);
            dest.writeParcelable(this.f, i);
            xfa.b bVar = this.f65030g;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeSerializable(this.f65031h);
            dest.writeSerializable(this.i);
            dest.writeParcelable(this.f65032j, i);
            dest.writeString(this.k);
            dest.writeString(this.f65033l);
            dest.writeStringList(this.f65034m);
            dest.writeParcelable(this.f65035n, i);
            d dVar = this.o;
            if (dVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dVar.name());
            }
            Set set = this.f65036p;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeString((String) itQ.next());
                }
            }
            dest.writeString(this.f65037q);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$InputData$CardPersonalisation;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardPersonalisation extends CardOrderFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CardPersonalisation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f65038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f65039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f65040c;
        public final c93.b d;
        public final String e;
        public final h f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final NaviCommand f65041g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final xfa.b f65042h;
        public final j i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AccountId f65043j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f65044l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AnalyticsProduct f65045m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f65046n;

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
                return new CardPersonalisation(nVar, z3, parcel.readInt() == 0 ? z : true, (c93.b) parcel.readSerializable(), parcel.readString(), (h) parcel.readSerializable(), (NaviCommand) parcel.readParcelable(CardPersonalisation.class.getClassLoader()), parcel.readInt() == 0 ? null : xfa.b.valueOf(parcel.readString()), (j) parcel.readSerializable(), (AccountId) parcel.readParcelable(CardPersonalisation.class.getClassLoader()), parcel.readString(), parcel.readString(), (AnalyticsProduct) parcel.readParcelable(CardPersonalisation.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardPersonalisation[i];
            }
        }

        public CardPersonalisation(n customisation, boolean z, boolean z3, c93.b card, String str, h hVar, NaviCommand naviCommand, xfa.b bVar, j jVar, AccountId accountId, String str2, String str3, AnalyticsProduct automaticEventProduct, String str4) {
            Intrinsics.checkNotNullParameter(customisation, "customisation");
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            this.f65038a = customisation;
            this.f65039b = z;
            this.f65040c = z3;
            this.d = card;
            this.e = str;
            this.f = hVar;
            this.f65041g = naviCommand;
            this.f65042h = bVar;
            this.i = jVar;
            this.f65043j = accountId;
            this.k = str2;
            this.f65044l = str3;
            this.f65045m = automaticEventProduct;
            this.f65046n = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardPersonalisation)) {
                return false;
            }
            CardPersonalisation cardPersonalisation = (CardPersonalisation) obj2;
            return Intrinsics.f(this.f65038a, cardPersonalisation.f65038a) && this.f65039b == cardPersonalisation.f65039b && this.f65040c == cardPersonalisation.f65040c && Intrinsics.f(this.d, cardPersonalisation.d) && Intrinsics.f(this.e, cardPersonalisation.e) && Intrinsics.f(this.f, cardPersonalisation.f) && Intrinsics.f(this.f65041g, cardPersonalisation.f65041g) && this.f65042h == cardPersonalisation.f65042h && Intrinsics.f(this.i, cardPersonalisation.i) && Intrinsics.f(this.f65043j, cardPersonalisation.f65043j) && Intrinsics.f(this.k, cardPersonalisation.k) && Intrinsics.f(this.f65044l, cardPersonalisation.f65044l) && Intrinsics.f(this.f65045m, cardPersonalisation.f65045m) && Intrinsics.f(this.f65046n, cardPersonalisation.f65046n);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + j6.a.c(j6.a.c(this.f65038a.hashCode() * 31, 31, this.f65039b), 31, this.f65040c)) * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            h hVar = this.f;
            int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            NaviCommand naviCommand = this.f65041g;
            int iHashCode4 = (iHashCode3 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            xfa.b bVar = this.f65042h;
            int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            j jVar = this.i;
            int iB = l.b(this.f65043j, (iHashCode5 + (jVar == null ? 0 : jVar.hashCode())) * 31, 31);
            String str2 = this.k;
            int iHashCode6 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f65044l;
            int iA = l.a((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f65045m);
            String str4 = this.f65046n;
            return iA + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$InputData
        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getD() {
            return this.f65045m;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65038a);
            dest.writeInt(this.f65039b ? 1 : 0);
            dest.writeInt(this.f65040c ? 1 : 0);
            dest.writeSerializable(this.d);
            dest.writeString(this.e);
            dest.writeSerializable(this.f);
            dest.writeParcelable(this.f65041g, i);
            xfa.b bVar = this.f65042h;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeSerializable(this.i);
            dest.writeParcelable(this.f65043j, i);
            dest.writeString(this.k);
            dest.writeString(this.f65044l);
            dest.writeParcelable(this.f65045m, i);
            dest.writeString(this.f65046n);
        }
    }

    /* JADX INFO: renamed from: i6 */
    public abstract AnalyticsProduct getD();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$InputData$ChangeDeliveryAddress;", "Lcom/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeDeliveryAddress extends CardOrderFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ChangeDeliveryAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f65047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Address f65048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AccountId f65049c;
        public final AnalyticsProduct d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeDeliveryAddress((f0) parcel.readSerializable(), (Address) parcel.readParcelable(ChangeDeliveryAddress.class.getClassLoader()), (AccountId) parcel.readParcelable(ChangeDeliveryAddress.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(ChangeDeliveryAddress.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeDeliveryAddress[i];
            }
        }

        public ChangeDeliveryAddress(f0 card, Address address, AccountId accountId, AnalyticsProduct automaticEventProduct) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            this.f65047a = card;
            this.f65048b = address;
            this.f65049c = accountId;
            this.d = automaticEventProduct;
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
            return Intrinsics.f(this.f65047a, changeDeliveryAddress.f65047a) && Intrinsics.f(this.f65048b, changeDeliveryAddress.f65048b) && Intrinsics.f(this.f65049c, changeDeliveryAddress.f65049c) && Intrinsics.f(this.d, changeDeliveryAddress.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + l.b(this.f65049c, (this.f65048b.hashCode() + (this.f65047a.hashCode() * 31)) * 31, 31);
        }

        @Override // com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$InputData
        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65047a);
            dest.writeParcelable(this.f65048b, i);
            dest.writeParcelable(this.f65049c, i);
            dest.writeParcelable(this.d, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ChangeDeliveryAddress(f0 f0Var, Address address, AccountId accountId) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.f137496c;
            this(f0Var, address, accountId, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var));
        }
    }
}
