package com.revolut.chat.domain.model.call;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import org.joda.time.Period;
import w30.d;
import w30.e;
import w30.g;
import w30.h;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/call/Call;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Call implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Call> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f51082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f51084c;
    public final CallAgentInfo d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f51085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f51086h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f51087j;
    public final Period k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Call((UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CallAgentInfo.CREATOR.createFromParcel(parcel), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), g.valueOf(parcel.readString()), h.valueOf(parcel.readString()), parcel.readInt() != 0 ? d.valueOf(parcel.readString()) : null, (Period) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Call[i];
        }
    }

    public Call(UUID callId, String str, e eVar, CallAgentInfo callAgentInfo, Instant createdAt, Instant instant, Instant instant2, g state, h callType, d dVar, Period period) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callType, "callType");
        this.f51082a = callId;
        this.f51083b = str;
        this.f51084c = eVar;
        this.d = callAgentInfo;
        this.e = createdAt;
        this.f = instant;
        this.f51085g = instant2;
        this.f51086h = state;
        this.i = callType;
        this.f51087j = dVar;
        this.k = period;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final Period getK() {
        return this.k;
    }

    public final Instant T() {
        Instant[] elements = {this.e, this.f, this.f51085g};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it8 = kotlin.collections.d.L(elements).iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it8.next();
        if (it8.hasNext()) {
            long millis = ((Instant) next).getMillis();
            do {
                Object next2 = it8.next();
                long millis2 = ((Instant) next2).getMillis();
                if (millis < millis2) {
                    next = next2;
                    millis = millis2;
                }
            } while (it8.hasNext());
        }
        return (Instant) next;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final String getF51083b() {
        return this.f51083b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CallAgentInfo getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getF51087j() {
        return this.f51087j;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final UUID getF51082a() {
        return this.f51082a;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final Instant getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getI() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getF51085g() {
        return this.f51085g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Call)) {
            return false;
        }
        Call call = (Call) obj2;
        return Intrinsics.f(this.f51082a, call.f51082a) && Intrinsics.f(this.f51083b, call.f51083b) && this.f51084c == call.f51084c && Intrinsics.f(this.d, call.d) && Intrinsics.f(this.e, call.e) && Intrinsics.f(this.f, call.f) && Intrinsics.f(this.f51085g, call.f51085g) && this.f51086h == call.f51086h && this.i == call.i && this.f51087j == call.f51087j && Intrinsics.f(this.k, call.k);
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final g getF51086h() {
        return this.f51086h;
    }

    public final int hashCode() {
        int iHashCode = this.f51082a.hashCode() * 31;
        String str = this.f51083b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f51084c;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        CallAgentInfo callAgentInfo = this.d;
        int iG = t61.a.g(this.e, (iHashCode3 + (callAgentInfo == null ? 0 : callAgentInfo.hashCode())) * 31, 31);
        Instant instant = this.f;
        int iHashCode4 = (iG + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f51085g;
        int iHashCode5 = (this.i.hashCode() + ((this.f51086h.hashCode() + ((iHashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31)) * 31)) * 31;
        d dVar = this.f51087j;
        int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Period period = this.k;
        return iHashCode6 + (period != null ? period.hashCode() : 0);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Instant getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f51082a);
        dest.writeString(this.f51083b);
        e eVar = this.f51084c;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
        CallAgentInfo callAgentInfo = this.d;
        if (callAgentInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            callAgentInfo.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f51085g);
        dest.writeString(this.f51086h.name());
        dest.writeString(this.i.name());
        d dVar = this.f51087j;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
        dest.writeSerializable(this.k);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final e getF51084c() {
        return this.f51084c;
    }
}
