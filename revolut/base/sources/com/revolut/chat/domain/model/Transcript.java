package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import v30.x0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/Transcript;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Transcript implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Transcript> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f51073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f51074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f51075c;
    public final Instant d;
    public final Instant e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Transcript((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), x0.valueOf(parcel.readString()), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Transcript[i];
        }
    }

    public Transcript(UUID id10, UUID uuid, x0 state, Instant instant, Instant instant2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f51073a = id10;
        this.f51074b = uuid;
        this.f51075c = state;
        this.d = instant;
        this.e = instant2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final x0 getF51075c() {
        return this.f51075c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Transcript)) {
            return false;
        }
        Transcript transcript = (Transcript) obj2;
        return Intrinsics.f(this.f51073a, transcript.f51073a) && Intrinsics.f(this.f51074b, transcript.f51074b) && this.f51075c == transcript.f51075c && Intrinsics.f(this.d, transcript.d) && Intrinsics.f(this.e, transcript.e);
    }

    public final int hashCode() {
        int iHashCode = this.f51073a.hashCode() * 31;
        UUID uuid = this.f51074b;
        int iHashCode2 = (this.f51075c.hashCode() + ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31)) * 31;
        Instant instant = this.d;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.e;
        return iHashCode3 + (instant2 != null ? instant2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f51073a);
        dest.writeSerializable(this.f51074b);
        dest.writeString(this.f51075c.name());
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
