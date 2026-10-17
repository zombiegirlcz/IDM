package com.revolut.chat.ui.ratechatexpression;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/chat/ui/ratechatexpression/ChatRatingShotDelegate$ChatRatingShotParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatRatingShotDelegate$ChatRatingShotParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChatRatingShotDelegate$ChatRatingShotParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f51196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51197b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChatRatingShotDelegate$ChatRatingShotParcel(parcel.readInt(), (UUID) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatRatingShotDelegate$ChatRatingShotParcel[i];
        }
    }

    public ChatRatingShotDelegate$ChatRatingShotParcel(int i, UUID chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f51196a = chatId;
        this.f51197b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChatRatingShotDelegate$ChatRatingShotParcel)) {
            return false;
        }
        ChatRatingShotDelegate$ChatRatingShotParcel chatRatingShotDelegate$ChatRatingShotParcel = (ChatRatingShotDelegate$ChatRatingShotParcel) obj2;
        return Intrinsics.f(this.f51196a, chatRatingShotDelegate$ChatRatingShotParcel.f51196a) && this.f51197b == chatRatingShotDelegate$ChatRatingShotParcel.f51197b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51197b) + (this.f51196a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f51196a);
        dest.writeInt(this.f51197b);
    }
}
