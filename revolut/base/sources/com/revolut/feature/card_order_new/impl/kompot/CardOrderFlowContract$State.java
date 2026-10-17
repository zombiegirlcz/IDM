package com.revolut.feature.card_order_new.impl.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import c93.j;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.cards.models.delivery.CardDeliveryRecipient;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import h30.l;
import i93.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import pi3.h;
import prk.o;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/CardOrderFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardOrderFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CardOrderFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c93.b f65050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65052c;
    public final Address d;
    public final h e;
    public final NaviCommand f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xfa.b f65053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f65054h;
    public final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AccountId f65055j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d93.b f65056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f65057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f65058n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f65059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f65060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f65061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AnalyticsProduct f65062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f65063t;
    public final Set u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CardDeliveryRecipient f65064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f65065x;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            xfa.b bVar;
            c93.b bVar2;
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            c93.b bVar3 = (c93.b) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Address address = (Address) parcel.readParcelable(CardOrderFlowContract$State.class.getClassLoader());
            h hVar = (h) parcel.readSerializable();
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(CardOrderFlowContract$State.class.getClassLoader());
            xfa.b bVarValueOf = parcel.readInt() == 0 ? null : xfa.b.valueOf(parcel.readString());
            j jVar = (j) parcel.readSerializable();
            j jVar2 = (j) parcel.readSerializable();
            AccountId accountId = (AccountId) parcel.readParcelable(CardOrderFlowContract$State.class.getClassLoader());
            String string3 = parcel.readString();
            d93.b bVar4 = (d93.b) parcel.readSerializable();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(CardOrderFlowContract$State.class.getClassLoader());
            d dVarValueOf = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                bVar = bVarValueOf;
                bVar2 = bVar3;
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                bVar = bVarValueOf;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                bVar2 = bVar3;
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet2, iA, 1);
                    i = i;
                }
                linkedHashSet = linkedHashSet2;
            }
            return new CardOrderFlowContract$State(bVar2, string, string2, address, hVar, naviCommand, bVar, jVar, jVar2, accountId, string3, bVar4, string4, string5, string6, arrayListCreateStringArrayList, boolValueOf, boolValueOf2, analyticsProduct, dVarValueOf, linkedHashSet, parcel.readString(), (CardDeliveryRecipient) parcel.readParcelable(CardOrderFlowContract$State.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardOrderFlowContract$State[i];
        }
    }

    public CardOrderFlowContract$State(c93.b bVar, String str, String str2, Address address, h hVar, NaviCommand naviCommand, xfa.b bVar2, j jVar, j jVar2, AccountId accountId, String str3, d93.b bVar3, String idempotencyKey, String str4, String str5, List list, Boolean bool, Boolean bool2, AnalyticsProduct automaticEventProduct, d dVar, Set set, String str6, CardDeliveryRecipient cardDeliveryRecipient, String str7) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f65050a = bVar;
        this.f65051b = str;
        this.f65052c = str2;
        this.d = address;
        this.e = hVar;
        this.f = naviCommand;
        this.f65053g = bVar2;
        this.f65054h = jVar;
        this.i = jVar2;
        this.f65055j = accountId;
        this.k = str3;
        this.f65056l = bVar3;
        this.f65057m = idempotencyKey;
        this.f65058n = str4;
        this.o = str5;
        this.f65059p = list;
        this.f65060q = bool;
        this.f65061r = bool2;
        this.f65062s = automaticEventProduct;
        this.f65063t = dVar;
        this.u = set;
        this.v = str6;
        this.f65064w = cardDeliveryRecipient;
        this.f65065x = str7;
    }

    public static CardOrderFlowContract$State a(CardOrderFlowContract$State cardOrderFlowContract$State, Address address, h hVar, j jVar, j jVar2, String str, d93.b bVar, Boolean bool, Boolean bool2, String str2, CardDeliveryRecipient cardDeliveryRecipient, int i) {
        List list;
        Boolean bool3;
        Set set;
        String str3;
        c93.b bVar2 = cardOrderFlowContract$State.f65050a;
        String str4 = cardOrderFlowContract$State.f65051b;
        String str5 = cardOrderFlowContract$State.f65052c;
        Address address2 = (i & 8) != 0 ? cardOrderFlowContract$State.d : address;
        h hVar2 = (i & 16) != 0 ? cardOrderFlowContract$State.e : hVar;
        NaviCommand naviCommand = cardOrderFlowContract$State.f;
        Address address3 = address2;
        h hVar3 = hVar2;
        xfa.b bVar3 = cardOrderFlowContract$State.f65053g;
        j jVar3 = (i & 128) != 0 ? cardOrderFlowContract$State.f65054h : jVar;
        j jVar4 = (i & 256) != 0 ? cardOrderFlowContract$State.i : jVar2;
        AccountId accountId = cardOrderFlowContract$State.f65055j;
        String str6 = (i & 1024) != 0 ? cardOrderFlowContract$State.k : str;
        d93.b bVar4 = (i & 2048) != 0 ? cardOrderFlowContract$State.f65056l : bVar;
        String idempotencyKey = cardOrderFlowContract$State.f65057m;
        String str7 = cardOrderFlowContract$State.f65058n;
        String str8 = cardOrderFlowContract$State.o;
        List list2 = cardOrderFlowContract$State.f65059p;
        if ((i & 65536) != 0) {
            list = list2;
            bool3 = cardOrderFlowContract$State.f65060q;
        } else {
            list = list2;
            bool3 = bool;
        }
        Boolean bool4 = bool3;
        Boolean bool5 = (i & 131072) != 0 ? cardOrderFlowContract$State.f65061r : bool2;
        AnalyticsProduct automaticEventProduct = cardOrderFlowContract$State.f65062s;
        d dVar = cardOrderFlowContract$State.f65063t;
        Set set2 = cardOrderFlowContract$State.u;
        if ((i & PKIFailureInfo.badSenderNonce) != 0) {
            set = set2;
            str3 = cardOrderFlowContract$State.v;
        } else {
            set = set2;
            str3 = str2;
        }
        CardDeliveryRecipient cardDeliveryRecipient2 = (i & 4194304) != 0 ? cardOrderFlowContract$State.f65064w : cardDeliveryRecipient;
        String str9 = cardOrderFlowContract$State.f65065x;
        cardOrderFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        return new CardOrderFlowContract$State(bVar2, str4, str5, address3, hVar3, naviCommand, bVar3, jVar3, jVar4, accountId, str6, bVar4, idempotencyKey, str7, str8, list, bool4, bool5, automaticEventProduct, dVar, set, str3, cardDeliveryRecipient2, str9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardOrderFlowContract$State)) {
            return false;
        }
        CardOrderFlowContract$State cardOrderFlowContract$State = (CardOrderFlowContract$State) obj2;
        return Intrinsics.f(this.f65050a, cardOrderFlowContract$State.f65050a) && Intrinsics.f(this.f65051b, cardOrderFlowContract$State.f65051b) && Intrinsics.f(this.f65052c, cardOrderFlowContract$State.f65052c) && Intrinsics.f(this.d, cardOrderFlowContract$State.d) && Intrinsics.f(this.e, cardOrderFlowContract$State.e) && Intrinsics.f(this.f, cardOrderFlowContract$State.f) && this.f65053g == cardOrderFlowContract$State.f65053g && Intrinsics.f(this.f65054h, cardOrderFlowContract$State.f65054h) && Intrinsics.f(this.i, cardOrderFlowContract$State.i) && Intrinsics.f(this.f65055j, cardOrderFlowContract$State.f65055j) && Intrinsics.f(this.k, cardOrderFlowContract$State.k) && Intrinsics.f(this.f65056l, cardOrderFlowContract$State.f65056l) && Intrinsics.f(this.f65057m, cardOrderFlowContract$State.f65057m) && Intrinsics.f(this.f65058n, cardOrderFlowContract$State.f65058n) && Intrinsics.f(this.o, cardOrderFlowContract$State.o) && Intrinsics.f(this.f65059p, cardOrderFlowContract$State.f65059p) && Intrinsics.f(this.f65060q, cardOrderFlowContract$State.f65060q) && Intrinsics.f(this.f65061r, cardOrderFlowContract$State.f65061r) && Intrinsics.f(this.f65062s, cardOrderFlowContract$State.f65062s) && this.f65063t == cardOrderFlowContract$State.f65063t && Intrinsics.f(this.u, cardOrderFlowContract$State.u) && Intrinsics.f(this.v, cardOrderFlowContract$State.v) && Intrinsics.f(this.f65064w, cardOrderFlowContract$State.f65064w) && Intrinsics.f(this.f65065x, cardOrderFlowContract$State.f65065x);
    }

    public final int hashCode() {
        c93.b bVar = this.f65050a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.f65051b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65052c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.d;
        int iHashCode4 = (iHashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        h hVar = this.e;
        int iHashCode5 = (iHashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        NaviCommand naviCommand = this.f;
        int iHashCode6 = (iHashCode5 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        xfa.b bVar2 = this.f65053g;
        int iHashCode7 = (iHashCode6 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        j jVar = this.f65054h;
        int iHashCode8 = (iHashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        j jVar2 = this.i;
        int iB = l.b(this.f65055j, (iHashCode8 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31, 31);
        String str3 = this.k;
        int iHashCode9 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        d93.b bVar3 = this.f65056l;
        int iC = p.a.c((iHashCode9 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31, 31, this.f65057m);
        String str4 = this.f65058n;
        int iHashCode10 = (iC + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f65059p;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f65060q;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f65061r;
        int iA = l.a((iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f65062s);
        d dVar = this.f65063t;
        int iHashCode14 = (iA + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Set set = this.u;
        int iHashCode15 = (iHashCode14 + (set == null ? 0 : set.hashCode())) * 31;
        String str6 = this.v;
        int iHashCode16 = (iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        CardDeliveryRecipient cardDeliveryRecipient = this.f65064w;
        int iHashCode17 = (iHashCode16 + (cardDeliveryRecipient == null ? 0 : cardDeliveryRecipient.hashCode())) * 31;
        String str7 = this.f65065x;
        return iHashCode17 + (str7 != null ? str7.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f65050a);
        dest.writeString(this.f65051b);
        dest.writeString(this.f65052c);
        dest.writeParcelable(this.d, i);
        dest.writeSerializable(this.e);
        dest.writeParcelable(this.f, i);
        xfa.b bVar = this.f65053g;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeSerializable(this.f65054h);
        dest.writeSerializable(this.i);
        dest.writeParcelable(this.f65055j, i);
        dest.writeString(this.k);
        dest.writeSerializable(this.f65056l);
        dest.writeString(this.f65057m);
        dest.writeString(this.f65058n);
        dest.writeString(this.o);
        dest.writeStringList(this.f65059p);
        Boolean bool = this.f65060q;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        Boolean bool2 = this.f65061r;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        dest.writeParcelable(this.f65062s, i);
        d dVar = this.f65063t;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
        Set set = this.u;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString((String) itQ.next());
            }
        }
        dest.writeString(this.v);
        dest.writeParcelable(this.f65064w, i);
        dest.writeString(this.f65065x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CardOrderFlowContract$State(c93.b bVar, String str, String str2, Address address, h hVar, NaviCommand naviCommand, xfa.b bVar2, j jVar, j jVar2, AccountId accountId, String str3, String str4, String str5, List list, AnalyticsProduct analyticsProduct, d dVar, Set set, String str6, int i) {
        AnalyticsProduct analyticsProductG;
        String str7 = (i & 2) != 0 ? null : str;
        String str8 = (i & 4) != 0 ? null : str2;
        h hVar2 = (i & 16) != 0 ? null : hVar;
        NaviCommand naviCommand2 = (i & 32) != 0 ? null : naviCommand;
        xfa.b bVar3 = (i & 64) != 0 ? null : bVar2;
        j jVar3 = (i & 128) != 0 ? null : jVar;
        j jVar4 = (i & 256) != 0 ? null : jVar2;
        String str9 = (i & 8192) != 0 ? null : str4;
        String str10 = (i & 16384) != 0 ? null : str5;
        List list2 = (32768 & i) != 0 ? null : list;
        if ((262144 & i) != 0) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.f137496c;
            analyticsProductG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        } else {
            analyticsProductG = analyticsProduct;
        }
        this(bVar, str7, str8, address, hVar2, naviCommand2, bVar3, jVar3, jVar4, accountId, null, null, str3, str9, str10, list2, null, null, analyticsProductG, (524288 & i) != 0 ? null : dVar, (1048576 & i) != 0 ? null : set, null, null, (i & 8388608) != 0 ? null : str6);
    }
}
