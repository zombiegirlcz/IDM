package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatListFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v30.t;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/chat/domain/model/ChatTarget;", "Landroid/os/Parcelable;", "<init>", "()V", "ChatList", "Messages", "Lcom/revolut/chat/domain/model/ChatTarget$ChatList;", "Lcom/revolut/chat/domain/model/ChatTarget$Messages;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChatTarget implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/ChatTarget$ChatList;", "Lcom/revolut/chat/domain/model/ChatTarget;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatList extends ChatTarget {

        @NotNull
        public static final Parcelable.Creator<ChatList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatListFilter f51046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f51047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TicketCreationContext f51048c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatList((ChatListFilter) parcel.readParcelable(ChatList.class.getClassLoader()), parcel.readInt() != 0, TicketCreationContext.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatList[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ChatList() {
            this((ChatListFilter) null, (TicketCreationContext) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 15);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChatList)) {
                return false;
            }
            ChatList chatList = (ChatList) obj2;
            return Intrinsics.f(this.f51046a, chatList.f51046a) && this.f51047b == chatList.f51047b && Intrinsics.f(this.f51048c, chatList.f51048c) && Intrinsics.f(this.d, chatList.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f51048c.hashCode() + j6.a.c(this.f51046a.hashCode() * 31, 31, this.f51047b)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51046a, i);
            dest.writeInt(this.f51047b ? 1 : 0);
            this.f51048c.writeToParcel(dest, i);
            dest.writeString(this.d);
        }

        public ChatList(ChatListFilter filter, boolean z, TicketCreationContext ticketCreationContext, String str) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(ticketCreationContext, "ticketCreationContext");
            this.f51046a = filter;
            this.f51047b = z;
            this.f51048c = ticketCreationContext;
            this.d = str;
        }

        public /* synthetic */ ChatList(ChatListFilter chatListFilter, TicketCreationContext ticketCreationContext, String str, int i) {
            this((i & 1) != 0 ? ChatListFilter.None.f51036a : chatListFilter, (i & 2) == 0, (i & 4) != 0 ? new TicketCreationContext((String) null, (List) null, (List) null, (NewTicketContext) null, 31) : ticketCreationContext, (i & 8) != 0 ? null : str);
        }
    }

    private ChatTarget() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/ChatTarget$Messages;", "Lcom/revolut/chat/domain/model/ChatTarget;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Messages extends ChatTarget {

        @NotNull
        public static final Parcelable.Creator<Messages> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatFeed f51049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f51050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ChatEntryPoint f51051c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Messages((ChatFeed) parcel.readParcelable(Messages.class.getClassLoader()), t.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ChatEntryPoint.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Messages[i];
            }
        }

        public Messages(ChatFeed feed, t chatSource, ChatEntryPoint chatEntryPoint) {
            Intrinsics.checkNotNullParameter(feed, "feed");
            Intrinsics.checkNotNullParameter(chatSource, "chatSource");
            this.f51049a = feed;
            this.f51050b = chatSource;
            this.f51051c = chatEntryPoint;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Messages)) {
                return false;
            }
            Messages messages = (Messages) obj2;
            return Intrinsics.f(this.f51049a, messages.f51049a) && this.f51050b == messages.f51050b && Intrinsics.f(this.f51051c, messages.f51051c);
        }

        public final int hashCode() {
            int iHashCode = (this.f51050b.hashCode() + (this.f51049a.hashCode() * 31)) * 31;
            ChatEntryPoint chatEntryPoint = this.f51051c;
            return iHashCode + (chatEntryPoint == null ? 0 : chatEntryPoint.f51028a.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51049a, i);
            dest.writeString(this.f51050b.name());
            ChatEntryPoint chatEntryPoint = this.f51051c;
            if (chatEntryPoint == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                chatEntryPoint.writeToParcel(dest, i);
            }
        }

        public /* synthetic */ Messages(ChatFeed chatFeed, t tVar, ChatEntryPoint chatEntryPoint, int i) {
            this(chatFeed, (i & 2) != 0 ? t.DEFAULT : tVar, (i & 4) != 0 ? null : chatEntryPoint);
        }
    }
}
