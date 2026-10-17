package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/ChatMessageToPass;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatMessageToPass implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChatMessageToPass> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f51041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51042c;
    public final UUID d;
    public final ReplyToDetails e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChatMessageToPass(parcel.readString(), (UUID) parcel.readSerializable(), parcel.readInt() != 0, (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : ReplyToDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatMessageToPass[i];
        }
    }

    public ChatMessageToPass(String text, UUID id10, boolean z, UUID uuid, ReplyToDetails replyToDetails) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f51040a = text;
        this.f51041b = id10;
        this.f51042c = z;
        this.d = uuid;
        this.e = replyToDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChatMessageToPass)) {
            return false;
        }
        ChatMessageToPass chatMessageToPass = (ChatMessageToPass) obj2;
        return Intrinsics.f(this.f51040a, chatMessageToPass.f51040a) && Intrinsics.f(this.f51041b, chatMessageToPass.f51041b) && this.f51042c == chatMessageToPass.f51042c && Intrinsics.f(this.d, chatMessageToPass.d) && Intrinsics.f(this.e, chatMessageToPass.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(t61.a.f(this.f51041b, this.f51040a.hashCode() * 31, 31), 31, this.f51042c);
        UUID uuid = this.d;
        int iHashCode = (iC + (uuid == null ? 0 : uuid.hashCode())) * 31;
        ReplyToDetails replyToDetails = this.e;
        return iHashCode + (replyToDetails != null ? replyToDetails.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51040a);
        dest.writeSerializable(this.f51041b);
        dest.writeInt(this.f51042c ? 1 : 0);
        dest.writeSerializable(this.d);
        ReplyToDetails replyToDetails = this.e;
        if (replyToDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            replyToDetails.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ ChatMessageToPass(UUID uuid, String str) {
        this(str, uuid, false, null, null);
    }
}
