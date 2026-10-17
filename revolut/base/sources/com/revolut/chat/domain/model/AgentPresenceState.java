package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import v30.e;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/chat/domain/model/AgentPresenceState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "v30/e", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AgentPresenceState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AgentPresenceState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f51026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f51027b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AgentPresenceState(e.valueOf(parcel.readString()), (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AgentPresenceState[i];
        }
    }

    public AgentPresenceState(e value, Instant instant) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f51026a = value;
        this.f51027b = instant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AgentPresenceState)) {
            return false;
        }
        AgentPresenceState agentPresenceState = (AgentPresenceState) obj2;
        return this.f51026a == agentPresenceState.f51026a && Intrinsics.f(this.f51027b, agentPresenceState.f51027b);
    }

    public final int hashCode() {
        int iHashCode = this.f51026a.hashCode() * 31;
        Instant instant = this.f51027b;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51026a.name());
        dest.writeSerializable(this.f51027b);
    }
}
