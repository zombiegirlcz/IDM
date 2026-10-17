package com.revolut.chat.domain.model.call;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/call/CallAgentInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CallAgentInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CallAgentInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f51088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51090c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CallAgentInfo(parcel.readString(), parcel.readString(), (UUID) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CallAgentInfo[i];
        }
    }

    public CallAgentInfo(String str, String str2, UUID agentId) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        this.f51088a = agentId;
        this.f51089b = str;
        this.f51090c = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getF51088a() {
        return this.f51088a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CallAgentInfo)) {
            return false;
        }
        CallAgentInfo callAgentInfo = (CallAgentInfo) obj2;
        return Intrinsics.f(this.f51088a, callAgentInfo.f51088a) && Intrinsics.f(this.f51089b, callAgentInfo.f51089b) && Intrinsics.f(this.f51090c, callAgentInfo.f51090c);
    }

    public final int hashCode() {
        int iHashCode = this.f51088a.hashCode() * 31;
        String str = this.f51089b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f51090c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f51088a);
        dest.writeString(this.f51089b);
        dest.writeString(this.f51090c);
    }
}
