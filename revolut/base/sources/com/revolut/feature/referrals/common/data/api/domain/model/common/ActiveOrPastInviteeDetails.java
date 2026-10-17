package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.b;
import pwa.o;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/ActiveOrPastInviteeDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActiveOrPastInviteeDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActiveOrPastInviteeDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81690c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f81691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f81692h;
    public final ActiveOrPastInvitesRewardInfo i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ActiveOrPastInvitesRewardInfo f81693j;
    public final o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f81694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f81695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Instant f81696n;
    public final Instant o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f81697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Instant f81698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f81699r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f81700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ActiveOrPastInvitesRewardInfo f81701t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f81702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f81703x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f81704y;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String str;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfoCreateFromParcel = parcel.readInt() == 0 ? null : ActiveOrPastInvitesRewardInfo.CREATOR.createFromParcel(parcel);
            ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfoCreateFromParcel2 = parcel.readInt() == 0 ? null : ActiveOrPastInvitesRewardInfo.CREATOR.createFromParcel(parcel);
            o oVarValueOf = parcel.readInt() == 0 ? null : o.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(InviteStepInfo.CREATOR, parcel, arrayList, iA, 1);
                i = i;
            }
            b bVarValueOf = b.valueOf(parcel.readString());
            Instant instant = (Instant) parcel.readSerializable();
            Instant instant2 = (Instant) parcel.readSerializable();
            String string9 = parcel.readString();
            Instant instant3 = (Instant) parcel.readSerializable();
            boolean z = false;
            String string10 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA2 = 0;
            while (true) {
                str = string;
                if (iA2 == i2) {
                    break;
                }
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(InviteeTip.CREATOR, parcel, arrayList2, iA2, 1);
                string = str;
                string2 = string2;
            }
            String str2 = string2;
            ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfoCreateFromParcel3 = parcel.readInt() == 0 ? null : ActiveOrPastInvitesRewardInfo.CREATOR.createFromParcel(parcel);
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new ActiveOrPastInviteeDetails(str, str2, string3, string4, string5, string6, string7, string8, activeOrPastInvitesRewardInfoCreateFromParcel, activeOrPastInvitesRewardInfoCreateFromParcel2, oVarValueOf, arrayList, bVarValueOf, instant, instant2, string9, instant3, string10, arrayList2, activeOrPastInvitesRewardInfoCreateFromParcel3, string11, string12, string13, string14, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActiveOrPastInviteeDetails[i];
        }
    }

    public ActiveOrPastInviteeDetails(String str, String str2, String firstName, String str3, String inviteId, String lastName, String str4, String str5, ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo, ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo2, o oVar, ArrayList steps, b status, Instant deadline, Instant instant, String str6, Instant createdDate, String str7, List tips, ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo3, String str8, String str9, String str10, String str11, Boolean bool) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(deadline, "deadline");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.f81688a = str;
        this.f81689b = str2;
        this.f81690c = firstName;
        this.d = str3;
        this.e = inviteId;
        this.f = lastName;
        this.f81691g = str4;
        this.f81692h = str5;
        this.i = activeOrPastInvitesRewardInfo;
        this.f81693j = activeOrPastInvitesRewardInfo2;
        this.k = oVar;
        this.f81694l = steps;
        this.f81695m = status;
        this.f81696n = deadline;
        this.o = instant;
        this.f81697p = str6;
        this.f81698q = createdDate;
        this.f81699r = str7;
        this.f81700s = tips;
        this.f81701t = activeOrPastInvitesRewardInfo3;
        this.u = str8;
        this.v = str9;
        this.f81702w = str10;
        this.f81703x = str11;
        this.f81704y = bool;
    }

    public static ActiveOrPastInviteeDetails a(ActiveOrPastInviteeDetails activeOrPastInviteeDetails) {
        Boolean bool = Boolean.TRUE;
        String str = activeOrPastInviteeDetails.f81688a;
        String str2 = activeOrPastInviteeDetails.f81689b;
        String firstName = activeOrPastInviteeDetails.f81690c;
        String str3 = activeOrPastInviteeDetails.d;
        String inviteId = activeOrPastInviteeDetails.e;
        String lastName = activeOrPastInviteeDetails.f;
        String str4 = activeOrPastInviteeDetails.f81691g;
        String str5 = activeOrPastInviteeDetails.f81692h;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = activeOrPastInviteeDetails.i;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo2 = activeOrPastInviteeDetails.f81693j;
        o oVar = activeOrPastInviteeDetails.k;
        ArrayList steps = activeOrPastInviteeDetails.f81694l;
        b status = activeOrPastInviteeDetails.f81695m;
        Instant deadline = activeOrPastInviteeDetails.f81696n;
        Instant instant = activeOrPastInviteeDetails.o;
        String str6 = activeOrPastInviteeDetails.f81697p;
        Instant createdDate = activeOrPastInviteeDetails.f81698q;
        String str7 = activeOrPastInviteeDetails.f81699r;
        List tips = activeOrPastInviteeDetails.f81700s;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo3 = activeOrPastInviteeDetails.f81701t;
        String str8 = activeOrPastInviteeDetails.u;
        String str9 = activeOrPastInviteeDetails.v;
        String str10 = activeOrPastInviteeDetails.f81702w;
        String str11 = activeOrPastInviteeDetails.f81703x;
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(deadline, "deadline");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(tips, "tips");
        return new ActiveOrPastInviteeDetails(str, str2, firstName, str3, inviteId, lastName, str4, str5, activeOrPastInvitesRewardInfo, activeOrPastInvitesRewardInfo2, oVar, steps, status, deadline, instant, str6, createdDate, str7, tips, activeOrPastInvitesRewardInfo3, str8, str9, str10, str11, bool);
    }

    public final String b() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.f81690c, " ", this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActiveOrPastInviteeDetails)) {
            return false;
        }
        ActiveOrPastInviteeDetails activeOrPastInviteeDetails = (ActiveOrPastInviteeDetails) obj2;
        return Intrinsics.f(this.f81688a, activeOrPastInviteeDetails.f81688a) && Intrinsics.f(this.f81689b, activeOrPastInviteeDetails.f81689b) && Intrinsics.f(this.f81690c, activeOrPastInviteeDetails.f81690c) && Intrinsics.f(this.d, activeOrPastInviteeDetails.d) && Intrinsics.f(this.e, activeOrPastInviteeDetails.e) && Intrinsics.f(this.f, activeOrPastInviteeDetails.f) && Intrinsics.f(this.f81691g, activeOrPastInviteeDetails.f81691g) && Intrinsics.f(this.f81692h, activeOrPastInviteeDetails.f81692h) && Intrinsics.f(this.i, activeOrPastInviteeDetails.i) && Intrinsics.f(this.f81693j, activeOrPastInviteeDetails.f81693j) && this.k == activeOrPastInviteeDetails.k && this.f81694l.equals(activeOrPastInviteeDetails.f81694l) && this.f81695m == activeOrPastInviteeDetails.f81695m && Intrinsics.f(this.f81696n, activeOrPastInviteeDetails.f81696n) && Intrinsics.f(this.o, activeOrPastInviteeDetails.o) && Intrinsics.f(this.f81697p, activeOrPastInviteeDetails.f81697p) && Intrinsics.f(this.f81698q, activeOrPastInviteeDetails.f81698q) && Intrinsics.f(this.f81699r, activeOrPastInviteeDetails.f81699r) && Intrinsics.f(this.f81700s, activeOrPastInviteeDetails.f81700s) && Intrinsics.f(this.f81701t, activeOrPastInviteeDetails.f81701t) && Intrinsics.f(this.u, activeOrPastInviteeDetails.u) && Intrinsics.f(this.v, activeOrPastInviteeDetails.v) && Intrinsics.f(this.f81702w, activeOrPastInviteeDetails.f81702w) && Intrinsics.f(this.f81703x, activeOrPastInviteeDetails.f81703x) && Intrinsics.f(this.f81704y, activeOrPastInviteeDetails.f81704y);
    }

    public final int hashCode() {
        String str = this.f81688a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81689b;
        int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f81690c);
        String str3 = this.d;
        int iC2 = p.a.c(p.a.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e), 31, this.f);
        String str4 = this.f81691g;
        int iHashCode2 = (iC2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f81692h;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = this.i;
        int iHashCode4 = (iHashCode3 + (activeOrPastInvitesRewardInfo == null ? 0 : activeOrPastInvitesRewardInfo.hashCode())) * 31;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo2 = this.f81693j;
        int iHashCode5 = (iHashCode4 + (activeOrPastInvitesRewardInfo2 == null ? 0 : activeOrPastInvitesRewardInfo2.hashCode())) * 31;
        o oVar = this.k;
        int iC3 = r6.b.c((this.f81695m.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f81694l, (iHashCode5 + (oVar == null ? 0 : oVar.hashCode())) * 31, 31)) * 31, 31, this.f81696n);
        Instant instant = this.o;
        int iHashCode6 = (iC3 + (instant == null ? 0 : instant.hashCode())) * 31;
        String str6 = this.f81697p;
        int iC4 = r6.b.c((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f81698q);
        String str7 = this.f81699r;
        int iD = p.a.d((iC4 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.f81700s);
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo3 = this.f81701t;
        int iHashCode7 = (iD + (activeOrPastInvitesRewardInfo3 == null ? 0 : activeOrPastInvitesRewardInfo3.hashCode())) * 31;
        String str8 = this.u;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.v;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f81702w;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f81703x;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.f81704y;
        return iHashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81688a);
        dest.writeString(this.f81689b);
        dest.writeString(this.f81690c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f81691g);
        dest.writeString(this.f81692h);
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = this.i;
        if (activeOrPastInvitesRewardInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            activeOrPastInvitesRewardInfo.writeToParcel(dest, i);
        }
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo2 = this.f81693j;
        if (activeOrPastInvitesRewardInfo2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            activeOrPastInvitesRewardInfo2.writeToParcel(dest, i);
        }
        o oVar = this.k;
        if (oVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(oVar.name());
        }
        Iterator itY = j6.a.y(this.f81694l, dest);
        while (itY.hasNext()) {
            ((InviteStepInfo) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f81695m.name());
        dest.writeSerializable(this.f81696n);
        dest.writeSerializable(this.o);
        dest.writeString(this.f81697p);
        dest.writeSerializable(this.f81698q);
        dest.writeString(this.f81699r);
        Iterator itV = p.a.v(this.f81700s, dest);
        while (itV.hasNext()) {
            ((InviteeTip) itV.next()).writeToParcel(dest, i);
        }
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo3 = this.f81701t;
        if (activeOrPastInvitesRewardInfo3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            activeOrPastInvitesRewardInfo3.writeToParcel(dest, i);
        }
        dest.writeString(this.u);
        dest.writeString(this.v);
        dest.writeString(this.f81702w);
        dest.writeString(this.f81703x);
        Boolean bool = this.f81704y;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
