package com.revolut.chat.data.repository.chat;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.domain.model.AgentPresenceState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import org.joda.time.Period;
import r6.b;
import v30.c;
import v30.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/chat/data/repository/chat/AgentInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Compliment", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AgentInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AgentInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f50997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50999c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f51000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f51001h;
    public final Float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f51002j;
    public final Instant k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Period f51003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Period f51004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f51005n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Period f51006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f51007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f51008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AgentPresenceState f51009s;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/data/repository/chat/AgentInfo$Compliment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Compliment implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Compliment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51012c;
        public final Integer d;
        public final Boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Boolean boolValueOf = null;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Compliment(string, string2, string3, numValueOf, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Compliment[i];
            }
        }

        public Compliment(String label, String iconUrl, String str, Integer num, Boolean bool) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            this.f51010a = label;
            this.f51011b = iconUrl;
            this.f51012c = str;
            this.d = num;
            this.e = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Compliment)) {
                return false;
            }
            Compliment compliment = (Compliment) obj2;
            return Intrinsics.f(this.f51010a, compliment.f51010a) && Intrinsics.f(this.f51011b, compliment.f51011b) && Intrinsics.f(this.f51012c, compliment.f51012c) && Intrinsics.f(this.d, compliment.d) && Intrinsics.f(this.e, compliment.e);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f51010a.hashCode() * 31, 31, this.f51011b);
            String str = this.f51012c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.d;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.e;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51010a);
            dest.writeString(this.f51011b);
            dest.writeString(this.f51012c);
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            Boolean bool = this.e;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Instant instant = (Instant) parcel.readSerializable();
            Period period = (Period) parcel.readSerializable();
            Period period2 = (Period) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Period period3 = (Period) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (true) {
                    z = z3;
                    if (iA == i) {
                        break;
                    }
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Compliment.CREATOR, parcel, arrayList, iA, 1);
                    z3 = z;
                    i = i;
                }
            } else {
                arrayList = null;
                z = z3;
            }
            return new AgentInfo(uuid, string, string2, z, string3, string4, string5, string6, fValueOf, lValueOf, instant, period, period2, numValueOf, numValueOf2, period3, arrayList, parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AgentPresenceState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AgentInfo[i];
        }
    }

    public AgentInfo(UUID id10, String str, String str2, boolean z, String str3, String str4, String str5, String str6, Float f, Long l2, Instant instant, Period period, Period period2, Integer num, Integer num2, Period period3, ArrayList arrayList, c cVar, AgentPresenceState agentPresenceState) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f50997a = id10;
        this.f50998b = str;
        this.f50999c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.f51000g = str5;
        this.f51001h = str6;
        this.i = f;
        this.f51002j = l2;
        this.k = instant;
        this.f51003l = period;
        this.f51004m = period2;
        this.f51005n = num;
        this.o = num2;
        this.f51006p = period3;
        this.f51007q = arrayList;
        this.f51008r = cVar;
        this.f51009s = agentPresenceState;
    }

    public final ChatAgent a() {
        if (this.d) {
            return new ChatAgent.Bot(this.f50997a);
        }
        return new ChatAgent.Live(this.f50997a, this.f50998b, this.e, this.f, this.f51000g);
    }

    public final v30.a b() {
        AgentPresenceState agentPresenceState = this.f51009s;
        if (agentPresenceState == null) {
            c cVar = this.f51008r;
            return cVar != null ? cVar != c.TERMINATED ? v30.a.ONLINE : v30.a.OFFLINE : v30.a.UNKNOWN;
        }
        switch (f.f285772a[agentPresenceState.f51026a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return v30.a.ONLINE;
            case 5:
                return v30.a.OFFLINE;
            case 6:
                return v30.a.OUT_OF_OFFICE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UUID getF50997a() {
        return this.f50997a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AgentInfo)) {
            return false;
        }
        AgentInfo agentInfo = (AgentInfo) obj2;
        return Intrinsics.f(this.f50997a, agentInfo.f50997a) && Intrinsics.f(this.f50998b, agentInfo.f50998b) && Intrinsics.f(this.f50999c, agentInfo.f50999c) && this.d == agentInfo.d && Intrinsics.f(this.e, agentInfo.e) && Intrinsics.f(this.f, agentInfo.f) && Intrinsics.f(this.f51000g, agentInfo.f51000g) && Intrinsics.f(this.f51001h, agentInfo.f51001h) && Intrinsics.f(this.i, agentInfo.i) && Intrinsics.f(this.f51002j, agentInfo.f51002j) && Intrinsics.f(this.k, agentInfo.k) && Intrinsics.f(this.f51003l, agentInfo.f51003l) && Intrinsics.f(this.f51004m, agentInfo.f51004m) && Intrinsics.f(this.f51005n, agentInfo.f51005n) && Intrinsics.f(this.o, agentInfo.o) && Intrinsics.f(this.f51006p, agentInfo.f51006p) && Intrinsics.f(this.f51007q, agentInfo.f51007q) && this.f51008r == agentInfo.f51008r && Intrinsics.f(this.f51009s, agentInfo.f51009s);
    }

    /* JADX INFO: renamed from: getEmail, reason: from getter */
    public final String getF51000g() {
        return this.f51000g;
    }

    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF50998b() {
        return this.f50998b;
    }

    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getF() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.f50997a.hashCode() * 31;
        String str = this.f50998b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50999c;
        int iC = j6.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f51000g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f51001h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f = this.i;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Long l2 = this.f51002j;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Instant instant = this.k;
        int iHashCode9 = (iHashCode8 + (instant == null ? 0 : instant.hashCode())) * 31;
        Period period = this.f51003l;
        int iHashCode10 = (iHashCode9 + (period == null ? 0 : period.hashCode())) * 31;
        Period period2 = this.f51004m;
        int iHashCode11 = (iHashCode10 + (period2 == null ? 0 : period2.hashCode())) * 31;
        Integer num = this.f51005n;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.o;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Period period3 = this.f51006p;
        int iHashCode14 = (iHashCode13 + (period3 == null ? 0 : period3.hashCode())) * 31;
        List list = this.f51007q;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        c cVar = this.f51008r;
        int iHashCode16 = (iHashCode15 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        AgentPresenceState agentPresenceState = this.f51009s;
        return iHashCode16 + (agentPresenceState != null ? agentPresenceState.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f50997a);
        dest.writeString(this.f50998b);
        dest.writeString(this.f50999c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f51000g);
        dest.writeString(this.f51001h);
        Float f = this.i;
        if (f == null) {
            dest.writeInt(0);
        } else {
            b.p(dest, 1, f);
        }
        Long l2 = this.f51002j;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f51003l);
        dest.writeSerializable(this.f51004m);
        Integer num = this.f51005n;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.o;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeSerializable(this.f51006p);
        List list = this.f51007q;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Compliment) itQ.next()).writeToParcel(dest, i);
            }
        }
        c cVar = this.f51008r;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        AgentPresenceState agentPresenceState = this.f51009s;
        if (agentPresenceState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            agentPresenceState.writeToParcel(dest, i);
        }
    }
}
