package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/revolut/chat/domain/model/LastMessage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "b", "()Ljava/util/UUID;", "serverId", "Ljava/lang/String;", "getText", "text", "Lorg/joda/time/Instant;", "c", "Lorg/joda/time/Instant;", "()Lorg/joda/time/Instant;", "time", "d", "customInAppText", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LastMessage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LastMessage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("serverId")
    private final UUID serverId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("text")
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("time")
    @NotNull
    private final Instant time;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("customInAppText")
    private final String customInAppText;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LastMessage((UUID) parcel.readSerializable(), parcel.readString(), (Instant) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LastMessage[i];
        }
    }

    public LastMessage(UUID uuid, String text, Instant time, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(time, "time");
        this.serverId = uuid;
        this.text = text;
        this.time = time;
        this.customInAppText = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCustomInAppText() {
        return this.customInAppText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getServerId() {
        return this.serverId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Instant getTime() {
        return this.time;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LastMessage)) {
            return false;
        }
        LastMessage lastMessage = (LastMessage) obj2;
        return Intrinsics.f(this.serverId, lastMessage.serverId) && Intrinsics.f(this.text, lastMessage.text) && Intrinsics.f(this.time, lastMessage.time) && Intrinsics.f(this.customInAppText, lastMessage.customInAppText);
    }

    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        UUID uuid = this.serverId;
        int iG = t61.a.g(this.time, p.a.c((uuid == null ? 0 : uuid.hashCode()) * 31, 31, this.text), 31);
        String str = this.customInAppText;
        return iG + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.serverId);
        dest.writeString(this.text);
        dest.writeSerializable(this.time);
        dest.writeString(this.customInAppText);
    }

    public /* synthetic */ LastMessage(UUID uuid, String str, Instant instant) {
        this(uuid, str, instant, null);
    }
}
