package com.revolut.chat.ui.messageslist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatEntryPoint;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.kompot.common.IOData$Input;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v30.t;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/chat/ui/messageslist/MessagesContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MessagesContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MessagesContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatFeed f51174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f51175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChatEntryPoint f51176c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessagesContract$InputData((ChatFeed) parcel.readParcelable(MessagesContract$InputData.class.getClassLoader()), t.valueOf(parcel.readString()), (ChatEntryPoint) parcel.readParcelable(MessagesContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MessagesContract$InputData[i];
        }
    }

    public MessagesContract$InputData(ChatFeed feed, t chatSource, ChatEntryPoint chatEntryPoint) {
        Intrinsics.checkNotNullParameter(feed, "feed");
        Intrinsics.checkNotNullParameter(chatSource, "chatSource");
        this.f51174a = feed;
        this.f51175b = chatSource;
        this.f51176c = chatEntryPoint;
    }

    public final UUID a() {
        ChatFeed chatFeed = this.f51174a;
        if (chatFeed instanceof ChatFeed.Support) {
            return ((ChatFeed.Support) chatFeed).f51033a;
        }
        if ((chatFeed instanceof ChatFeed.Assistant) || (chatFeed instanceof ChatFeed.PrivateBanking)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MessagesContract$InputData)) {
            return false;
        }
        MessagesContract$InputData messagesContract$InputData = (MessagesContract$InputData) obj2;
        return Intrinsics.f(this.f51174a, messagesContract$InputData.f51174a) && this.f51175b == messagesContract$InputData.f51175b && Intrinsics.f(this.f51176c, messagesContract$InputData.f51176c);
    }

    public final int hashCode() {
        int iHashCode = (this.f51175b.hashCode() + (this.f51174a.hashCode() * 31)) * 31;
        ChatEntryPoint chatEntryPoint = this.f51176c;
        return iHashCode + (chatEntryPoint == null ? 0 : chatEntryPoint.f51028a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f51174a, i);
        dest.writeString(this.f51175b.name());
        dest.writeParcelable(this.f51176c, i);
    }
}
