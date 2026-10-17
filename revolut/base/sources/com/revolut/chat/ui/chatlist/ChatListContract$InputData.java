package com.revolut.chat.ui.chatlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.kompot.common.IOData$Input;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v30.t;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/chat/ui/chatlist/ChatListContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatListContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChatListContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f51140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51142c;
    public final ChatListFilter d;
    public final t e;
    public final TicketCreationContext f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChatListContract$InputData((UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0, (ChatListFilter) parcel.readParcelable(ChatListContract$InputData.class.getClassLoader()), t.valueOf(parcel.readString()), (TicketCreationContext) parcel.readParcelable(ChatListContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatListContract$InputData[i];
        }
    }

    public ChatListContract$InputData() {
        this((String) null, false, (ChatListFilter) null, (t) null, (TicketCreationContext) null, 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChatListContract$InputData)) {
            return false;
        }
        ChatListContract$InputData chatListContract$InputData = (ChatListContract$InputData) obj2;
        return Intrinsics.f(this.f51140a, chatListContract$InputData.f51140a) && Intrinsics.f(this.f51141b, chatListContract$InputData.f51141b) && this.f51142c == chatListContract$InputData.f51142c && Intrinsics.f(this.d, chatListContract$InputData.d) && this.e == chatListContract$InputData.e && Intrinsics.f(this.f, chatListContract$InputData.f);
    }

    public final int hashCode() {
        UUID uuid = this.f51140a;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.f51141b;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f51142c)) * 31)) * 31;
        TicketCreationContext ticketCreationContext = this.f;
        return iHashCode2 + (ticketCreationContext != null ? ticketCreationContext.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f51140a);
        dest.writeString(this.f51141b);
        dest.writeInt(this.f51142c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
        dest.writeParcelable(this.f, i);
    }

    public ChatListContract$InputData(UUID uuid, String str, boolean z, ChatListFilter filter, t chatSource, TicketCreationContext ticketCreationContext) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(chatSource, "chatSource");
        this.f51140a = uuid;
        this.f51141b = str;
        this.f51142c = z;
        this.d = filter;
        this.e = chatSource;
        this.f = ticketCreationContext;
    }

    public /* synthetic */ ChatListContract$InputData(String str, boolean z, ChatListFilter chatListFilter, t tVar, TicketCreationContext ticketCreationContext, int i) {
        this((UUID) null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ChatListFilter.None.f51036a : chatListFilter, (i & 16) != 0 ? t.DEFAULT : tVar, (i & 32) != 0 ? null : ticketCreationContext);
    }
}
