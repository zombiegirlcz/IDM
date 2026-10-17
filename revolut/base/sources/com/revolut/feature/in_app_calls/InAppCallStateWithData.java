package com.revolut.feature.in_app_calls;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/in_app_calls/InAppCallStateWithData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_in_app_calls_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InAppCallStateWithData implements Parcelable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final InAppCallStateWithData f74784j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be7.a f74785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f74786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f74787c;
    public final UUID d;
    public final CallInviteData e;
    public final ActiveCallData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DisconnectedCallData f74788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f74789h;
    public final Instant i;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<InAppCallStateWithData> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.in_app_calls.InAppCallStateWithData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InAppCallStateWithData(be7.a.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : CallInviteData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ActiveCallData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DisconnectedCallData.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InAppCallStateWithData[i];
        }
    }

    static {
        be7.a aVar = be7.a.IDLE;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(0L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        f74784j = new InAppCallStateWithData(aVar, null, null, null, null, null, null, false, instantOfEpochMilli);
    }

    public InAppCallStateWithData(be7.a state, UUID uuid, UUID uuid2, UUID uuid3, CallInviteData callInviteData, ActiveCallData activeCallData, DisconnectedCallData disconnectedCallData, boolean z, Instant updatedAt) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f74785a = state;
        this.f74786b = uuid;
        this.f74787c = uuid2;
        this.d = uuid3;
        this.e = callInviteData;
        this.f = activeCallData;
        this.f74788g = disconnectedCallData;
        this.f74789h = z;
        this.i = updatedAt;
    }

    public static InAppCallStateWithData a(InAppCallStateWithData inAppCallStateWithData, be7.a aVar, UUID uuid, UUID uuid2, UUID uuid3, CallInviteData callInviteData, ActiveCallData activeCallData, DisconnectedCallData disconnectedCallData, Instant instant, int i) {
        if ((i & 1) != 0) {
            aVar = inAppCallStateWithData.f74785a;
        }
        be7.a state = aVar;
        if ((i & 2) != 0) {
            uuid = inAppCallStateWithData.f74786b;
        }
        UUID uuid4 = uuid;
        if ((i & 4) != 0) {
            uuid2 = inAppCallStateWithData.f74787c;
        }
        UUID uuid5 = uuid2;
        if ((i & 8) != 0) {
            uuid3 = inAppCallStateWithData.d;
        }
        UUID uuid6 = uuid3;
        if ((i & 16) != 0) {
            callInviteData = inAppCallStateWithData.e;
        }
        CallInviteData callInviteData2 = callInviteData;
        ActiveCallData activeCallData2 = (i & 32) != 0 ? inAppCallStateWithData.f : activeCallData;
        DisconnectedCallData disconnectedCallData2 = (i & 64) != 0 ? inAppCallStateWithData.f74788g : disconnectedCallData;
        boolean z = (i & 128) != 0 ? inAppCallStateWithData.f74789h : true;
        Instant updatedAt = (i & 256) != 0 ? inAppCallStateWithData.i : instant;
        inAppCallStateWithData.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new InAppCallStateWithData(state, uuid4, uuid5, uuid6, callInviteData2, activeCallData2, disconnectedCallData2, z, updatedAt);
    }

    /* JADX INFO: renamed from: J9, reason: from getter */
    public final UUID getF74786b() {
        return this.f74786b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ActiveCallData getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final be7.a getF74785a() {
        return this.f74785a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InAppCallStateWithData)) {
            return false;
        }
        InAppCallStateWithData inAppCallStateWithData = (InAppCallStateWithData) obj2;
        return this.f74785a == inAppCallStateWithData.f74785a && Intrinsics.f(this.f74786b, inAppCallStateWithData.f74786b) && Intrinsics.f(this.f74787c, inAppCallStateWithData.f74787c) && Intrinsics.f(this.d, inAppCallStateWithData.d) && Intrinsics.f(this.e, inAppCallStateWithData.e) && Intrinsics.f(this.f, inAppCallStateWithData.f) && Intrinsics.f(this.f74788g, inAppCallStateWithData.f74788g) && this.f74789h == inAppCallStateWithData.f74789h && Intrinsics.f(this.i, inAppCallStateWithData.i);
    }

    public final int hashCode() {
        int iHashCode = this.f74785a.hashCode() * 31;
        UUID uuid = this.f74786b;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.f74787c;
        int iHashCode3 = (iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        UUID uuid3 = this.d;
        int iHashCode4 = (iHashCode3 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
        CallInviteData callInviteData = this.e;
        int iHashCode5 = (iHashCode4 + (callInviteData == null ? 0 : callInviteData.hashCode())) * 31;
        ActiveCallData activeCallData = this.f;
        int iHashCode6 = (iHashCode5 + (activeCallData == null ? 0 : activeCallData.hashCode())) * 31;
        DisconnectedCallData disconnectedCallData = this.f74788g;
        return this.i.hashCode() + j6.a.c((iHashCode6 + (disconnectedCallData != null ? disconnectedCallData.hashCode() : 0)) * 31, 31, this.f74789h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74785a.name());
        dest.writeSerializable(this.f74786b);
        dest.writeSerializable(this.f74787c);
        dest.writeSerializable(this.d);
        CallInviteData callInviteData = this.e;
        if (callInviteData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            callInviteData.writeToParcel(dest, i);
        }
        ActiveCallData activeCallData = this.f;
        if (activeCallData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            activeCallData.writeToParcel(dest, i);
        }
        DisconnectedCallData disconnectedCallData = this.f74788g;
        if (disconnectedCallData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            disconnectedCallData.writeToParcel(dest, i);
        }
        dest.writeInt(this.f74789h ? 1 : 0);
        dest.writeSerializable(this.i);
    }
}
