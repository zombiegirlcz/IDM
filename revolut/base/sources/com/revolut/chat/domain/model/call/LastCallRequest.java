package com.revolut.chat.domain.model.call;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import w30.h;
import w30.l;
import w30.u;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/call/LastCallRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LastCallRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LastCallRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f51091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f51092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f51093c;
    public final Instant d;
    public final Instant e;
    public final CallAgentInfo f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f51094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f51095h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f51096j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LastCallRequest((UUID) parcel.readSerializable(), u.valueOf(parcel.readString()), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readInt() == 0 ? null : CallAgentInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), h.valueOf(parcel.readString()), l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LastCallRequest[i];
        }
    }

    public LastCallRequest(UUID uuid, u state, Instant instant, Instant instant2, Instant instant3, CallAgentInfo callAgentInfo, String str, String str2, h callType, l canceledBy) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callType, "callType");
        Intrinsics.checkNotNullParameter(canceledBy, "canceledBy");
        this.f51091a = uuid;
        this.f51092b = state;
        this.f51093c = instant;
        this.d = instant2;
        this.e = instant3;
        this.f = callAgentInfo;
        this.f51094g = str;
        this.f51095h = str2;
        this.i = callType;
        this.f51096j = canceledBy;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final u getF51092b() {
        return this.f51092b;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final Instant getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getF51096j() {
        return this.f51096j;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF51094g() {
        return this.f51094g;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UUID getF51091a() {
        return this.f51091a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF51095h() {
        return this.f51095h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LastCallRequest)) {
            return false;
        }
        LastCallRequest lastCallRequest = (LastCallRequest) obj2;
        return Intrinsics.f(this.f51091a, lastCallRequest.f51091a) && this.f51092b == lastCallRequest.f51092b && Intrinsics.f(this.f51093c, lastCallRequest.f51093c) && Intrinsics.f(this.d, lastCallRequest.d) && Intrinsics.f(this.e, lastCallRequest.e) && Intrinsics.f(this.f, lastCallRequest.f) && Intrinsics.f(this.f51094g, lastCallRequest.f51094g) && Intrinsics.f(this.f51095h, lastCallRequest.f51095h) && this.i == lastCallRequest.i && this.f51096j == lastCallRequest.f51096j;
    }

    public final int hashCode() {
        UUID uuid = this.f51091a;
        int iHashCode = (this.f51092b.hashCode() + ((uuid == null ? 0 : uuid.hashCode()) * 31)) * 31;
        Instant instant = this.f51093c;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.d;
        int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.e;
        int iHashCode4 = (iHashCode3 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        CallAgentInfo callAgentInfo = this.f;
        int iHashCode5 = (iHashCode4 + (callAgentInfo == null ? 0 : callAgentInfo.hashCode())) * 31;
        String str = this.f51094g;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51095h;
        return this.f51096j.hashCode() + ((this.i.hashCode() + ((iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final CallAgentInfo getF() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f51091a);
        dest.writeString(this.f51092b.name());
        dest.writeSerializable(this.f51093c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        CallAgentInfo callAgentInfo = this.f;
        if (callAgentInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            callAgentInfo.writeToParcel(dest, i);
        }
        dest.writeString(this.f51094g);
        dest.writeString(this.f51095h);
        dest.writeString(this.i.name());
        dest.writeString(this.f51096j.name());
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Instant getD() {
        return this.d;
    }
}
