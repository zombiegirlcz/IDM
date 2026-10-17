package com.revolut.chat.ui.messageslist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatMode;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/chat/ui/messageslist/MessagesContract$RetainedState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MessagesContract$RetainedState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessagesContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f51177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f51178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChatMode f51179c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessagesContract$RetainedState((UUID) parcel.readSerializable(), c0.valueOf(parcel.readString()), (ChatMode) parcel.readParcelable(MessagesContract$RetainedState.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MessagesContract$RetainedState[i];
        }
    }

    public MessagesContract$RetainedState(UUID uuid, c0 feedType, ChatMode chatMode, boolean z) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f51177a = uuid;
        this.f51178b = feedType;
        this.f51179c = chatMode;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MessagesContract$RetainedState)) {
            return false;
        }
        MessagesContract$RetainedState messagesContract$RetainedState = (MessagesContract$RetainedState) obj2;
        return Intrinsics.f(this.f51177a, messagesContract$RetainedState.f51177a) && this.f51178b == messagesContract$RetainedState.f51178b && Intrinsics.f(this.f51179c, messagesContract$RetainedState.f51179c) && this.d == messagesContract$RetainedState.d;
    }

    public final int hashCode() {
        UUID uuid = this.f51177a;
        int iHashCode = (this.f51178b.hashCode() + ((uuid == null ? 0 : uuid.hashCode()) * 31)) * 31;
        ChatMode chatMode = this.f51179c;
        return Boolean.hashCode(this.d) + ((iHashCode + (chatMode != null ? chatMode.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f51177a);
        dest.writeString(this.f51178b.name());
        dest.writeParcelable(this.f51179c, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
