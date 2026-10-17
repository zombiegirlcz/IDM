package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;
import pwa.o;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/ReferralCampaignV4;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReferralCampaignV4 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReferralCampaignV4> CREATOR = new a();
    public final String A;
    public final List B;
    public final List C;
    public final boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActiveOrPastInvitesInfo f81752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActiveOrPastInvitesInfo f81753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActiveOrPastInvitesInfo f81754c;
    public final Integer d;
    public final Integer e;
    public final MultilevelDetails f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f81755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CashbackInfo f81756h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f81757j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f81758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Instant f81759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f81760n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f81761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f81762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f81763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f81764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f81765t;
    public final RewardInfo u;
    public final o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f81766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Map f81767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f81768y;
    public final List z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            RewardInfo rewardInfo;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<ActiveOrPastInvitesInfo> creator = ActiveOrPastInvitesInfo.CREATOR;
            ActiveOrPastInvitesInfo activeOrPastInvitesInfoCreateFromParcel = creator.createFromParcel(parcel);
            LinkedHashMap linkedHashMap = null;
            ActiveOrPastInvitesInfo activeOrPastInvitesInfoCreateFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            ActiveOrPastInvitesInfo activeOrPastInvitesInfoCreateFromParcel3 = creator.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MultilevelDetails multilevelDetailsCreateFromParcel = parcel.readInt() == 0 ? null : MultilevelDetails.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            CashbackInfo cashbackInfoCreateFromParcel = parcel.readInt() == 0 ? null : CashbackInfo.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            n nVarValueOf = parcel.readInt() == 0 ? null : n.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Instant instant = (Instant) parcel.readSerializable();
            boolean z = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string9 = parcel.readString();
            RewardInfo rewardInfoCreateFromParcel = parcel.readInt() == 0 ? null : RewardInfo.CREATOR.createFromParcel(parcel);
            o oVarValueOf = parcel.readInt() == 0 ? null : o.valueOf(parcel.readString());
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                rewardInfo = rewardInfoCreateFromParcel;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                rewardInfo = rewardInfoCreateFromParcel;
                int i2 = 0;
                while (i2 != i) {
                    linkedHashMap2.put(pwa.a.valueOf(parcel.readString()), parcel.readString());
                    i2++;
                    i = i;
                }
                linkedHashMap = linkedHashMap2;
            }
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            int iA = 0;
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Step.CREATOR, parcel, arrayList, iA, 1);
                i3 = i3;
                activeOrPastInvitesInfoCreateFromParcel = activeOrPastInvitesInfoCreateFromParcel;
            }
            ActiveOrPastInvitesInfo activeOrPastInvitesInfo = activeOrPastInvitesInfoCreateFromParcel;
            int i5 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i5);
            int iA2 = 0;
            while (iA2 != i5) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Upsell.CREATOR, parcel, arrayList2, iA2, 1);
                i5 = i5;
                arrayList = arrayList;
            }
            ArrayList arrayList3 = arrayList;
            String string11 = parcel.readString();
            int i6 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i6);
            int iA3 = 0;
            while (iA3 != i6) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(HowItWorks.CREATOR, parcel, arrayList4, iA3, 1);
                i6 = i6;
                arrayList2 = arrayList2;
            }
            ArrayList arrayList5 = arrayList2;
            int i21 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i21);
            int iA4 = 0;
            while (iA4 != i21) {
                iA4 = org.bouncycastle.jcajce.provider.digest.a.a(Condition.CREATOR, parcel, arrayList6, iA4, 1);
                i21 = i21;
                arrayList4 = arrayList4;
            }
            return new ReferralCampaignV4(activeOrPastInvitesInfo, activeOrPastInvitesInfoCreateFromParcel2, activeOrPastInvitesInfoCreateFromParcel3, numValueOf, numValueOf2, multilevelDetailsCreateFromParcel, string, cashbackInfoCreateFromParcel, string2, nVarValueOf, string3, string4, instant, z, string5, string6, string7, string8, numValueOf3, string9, rewardInfo, oVarValueOf, string10, linkedHashMap3, arrayList3, arrayList5, string11, arrayList4, arrayList6, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReferralCampaignV4[i];
        }
    }

    public ReferralCampaignV4(ActiveOrPastInvitesInfo activeInvites, ActiveOrPastInvitesInfo activeOrPastInvitesInfo, ActiveOrPastInvitesInfo pastInvites, Integer num, Integer num2, MultilevelDetails multilevelDetails, String str, CashbackInfo cashbackInfo, String str2, n nVar, String inviteLink, String title, Instant instant, boolean z, String description, String imageUrl, String inviteSuccessMessage, String inviteText, Integer num3, String str3, RewardInfo rewardInfo, o oVar, String str4, Map map, ArrayList steps, List upsells, String str5, List howItWorks, List conditions, boolean z3) {
        Intrinsics.checkNotNullParameter(activeInvites, "activeInvites");
        Intrinsics.checkNotNullParameter(pastInvites, "pastInvites");
        Intrinsics.checkNotNullParameter(inviteLink, "inviteLink");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(inviteSuccessMessage, "inviteSuccessMessage");
        Intrinsics.checkNotNullParameter(inviteText, "inviteText");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(upsells, "upsells");
        Intrinsics.checkNotNullParameter(howItWorks, "howItWorks");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        this.f81752a = activeInvites;
        this.f81753b = activeOrPastInvitesInfo;
        this.f81754c = pastInvites;
        this.d = num;
        this.e = num2;
        this.f = multilevelDetails;
        this.f81755g = str;
        this.f81756h = cashbackInfo;
        this.i = str2;
        this.f81757j = nVar;
        this.k = inviteLink;
        this.f81758l = title;
        this.f81759m = instant;
        this.f81760n = z;
        this.o = description;
        this.f81761p = imageUrl;
        this.f81762q = inviteSuccessMessage;
        this.f81763r = inviteText;
        this.f81764s = num3;
        this.f81765t = str3;
        this.u = rewardInfo;
        this.v = oVar;
        this.f81766w = str4;
        this.f81767x = map;
        this.f81768y = steps;
        this.z = upsells;
        this.A = str5;
        this.B = howItWorks;
        this.C = conditions;
        this.D = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReferralCampaignV4)) {
            return false;
        }
        ReferralCampaignV4 referralCampaignV4 = (ReferralCampaignV4) obj2;
        return Intrinsics.f(this.f81752a, referralCampaignV4.f81752a) && Intrinsics.f(this.f81753b, referralCampaignV4.f81753b) && Intrinsics.f(this.f81754c, referralCampaignV4.f81754c) && Intrinsics.f(this.d, referralCampaignV4.d) && Intrinsics.f(this.e, referralCampaignV4.e) && Intrinsics.f(this.f, referralCampaignV4.f) && Intrinsics.f(this.f81755g, referralCampaignV4.f81755g) && Intrinsics.f(this.f81756h, referralCampaignV4.f81756h) && Intrinsics.f(this.i, referralCampaignV4.i) && this.f81757j == referralCampaignV4.f81757j && Intrinsics.f(this.k, referralCampaignV4.k) && Intrinsics.f(this.f81758l, referralCampaignV4.f81758l) && Intrinsics.f(this.f81759m, referralCampaignV4.f81759m) && this.f81760n == referralCampaignV4.f81760n && Intrinsics.f(this.o, referralCampaignV4.o) && Intrinsics.f(this.f81761p, referralCampaignV4.f81761p) && Intrinsics.f(this.f81762q, referralCampaignV4.f81762q) && Intrinsics.f(this.f81763r, referralCampaignV4.f81763r) && Intrinsics.f(this.f81764s, referralCampaignV4.f81764s) && Intrinsics.f(this.f81765t, referralCampaignV4.f81765t) && Intrinsics.f(this.u, referralCampaignV4.u) && this.v == referralCampaignV4.v && Intrinsics.f(this.f81766w, referralCampaignV4.f81766w) && Intrinsics.f(this.f81767x, referralCampaignV4.f81767x) && this.f81768y.equals(referralCampaignV4.f81768y) && Intrinsics.f(this.z, referralCampaignV4.z) && Intrinsics.f(this.A, referralCampaignV4.A) && Intrinsics.f(this.B, referralCampaignV4.B) && Intrinsics.f(this.C, referralCampaignV4.C) && this.D == referralCampaignV4.D;
    }

    public final int hashCode() {
        int iHashCode = this.f81752a.hashCode() * 31;
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = this.f81753b;
        int iHashCode2 = (this.f81754c.hashCode() + ((iHashCode + (activeOrPastInvitesInfo == null ? 0 : activeOrPastInvitesInfo.hashCode())) * 31)) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        MultilevelDetails multilevelDetails = this.f;
        int iHashCode5 = (iHashCode4 + (multilevelDetails == null ? 0 : multilevelDetails.hashCode())) * 31;
        String str = this.f81755g;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        CashbackInfo cashbackInfo = this.f81756h;
        int iHashCode7 = (iHashCode6 + (cashbackInfo == null ? 0 : cashbackInfo.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        n nVar = this.f81757j;
        int iC = p.a.c(p.a.c((iHashCode8 + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.k), 31, this.f81758l);
        Instant instant = this.f81759m;
        int iC2 = p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c((iC + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.f81760n), 31, this.o), 31, this.f81761p), 31, this.f81762q), 31, this.f81763r);
        Integer num3 = this.f81764s;
        int iHashCode9 = (iC2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.f81765t;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RewardInfo rewardInfo = this.u;
        int iHashCode11 = (iHashCode10 + (rewardInfo == null ? 0 : rewardInfo.hashCode())) * 31;
        o oVar = this.v;
        int iHashCode12 = (iHashCode11 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str4 = this.f81766w;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map map = this.f81767x;
        int iD = p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f81768y, (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31, 31), 31, this.z);
        String str5 = this.A;
        return Boolean.hashCode(this.D) + p.a.d(p.a.d((iD + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.B), 31, this.C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f81752a.writeToParcel(dest, i);
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = this.f81753b;
        if (activeOrPastInvitesInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            activeOrPastInvitesInfo.writeToParcel(dest, i);
        }
        this.f81754c.writeToParcel(dest, i);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.e;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        MultilevelDetails multilevelDetails = this.f;
        if (multilevelDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            multilevelDetails.writeToParcel(dest, i);
        }
        dest.writeString(this.f81755g);
        CashbackInfo cashbackInfo = this.f81756h;
        if (cashbackInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cashbackInfo.writeToParcel(dest, i);
        }
        dest.writeString(this.i);
        n nVar = this.f81757j;
        if (nVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(nVar.name());
        }
        dest.writeString(this.k);
        dest.writeString(this.f81758l);
        dest.writeSerializable(this.f81759m);
        dest.writeInt(this.f81760n ? 1 : 0);
        dest.writeString(this.o);
        dest.writeString(this.f81761p);
        dest.writeString(this.f81762q);
        dest.writeString(this.f81763r);
        Integer num3 = this.f81764s;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
        dest.writeString(this.f81765t);
        RewardInfo rewardInfo = this.u;
        if (rewardInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardInfo.writeToParcel(dest, i);
        }
        o oVar = this.v;
        if (oVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(oVar.name());
        }
        dest.writeString(this.f81766w);
        Map map = this.f81767x;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator itV = l.v(dest, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                dest.writeString(((pwa.a) entry.getKey()).name());
                dest.writeString((String) entry.getValue());
            }
        }
        Iterator itY = j6.a.y(this.f81768y, dest);
        while (itY.hasNext()) {
            ((Step) itY.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.z, dest);
        while (itV2.hasNext()) {
            ((Upsell) itV2.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.A);
        Iterator itV3 = p.a.v(this.B, dest);
        while (itV3.hasNext()) {
            ((HowItWorks) itV3.next()).writeToParcel(dest, i);
        }
        Iterator itV4 = p.a.v(this.C, dest);
        while (itV4.hasNext()) {
            ((Condition) itV4.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.D ? 1 : 0);
    }
}
