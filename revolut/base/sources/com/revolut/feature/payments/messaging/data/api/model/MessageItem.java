package com.revolut.feature.payments.messaging.data.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.messaging.data.api.model.GroupMessageAuthor;
import dv9.f;
import dv9.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageItem;", "Lcom/revolut/feature/payments/messaging/data/api/model/P2PChatItem;", "Lcom/revolut/feature/payments/messaging/data/api/model/GroupChatItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MessageItem implements P2PChatItem, GroupChatItem {

    @NotNull
    public static final Parcelable.Creator<MessageItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f79532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f79533c;
    public final DateTime d;
    public final MessageAuthor e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f79534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MessageType f79535h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dv9.d f79536j;
    public final f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MessageMetadata f79537l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessageItem(parcel.readString(), (DateTime) parcel.readSerializable(), n.valueOf(parcel.readString()), (DateTime) parcel.readSerializable(), MessageAuthor.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, (MessageType) parcel.readParcelable(MessageItem.class.getClassLoader()), parcel.readString(), dv9.d.valueOf(parcel.readString()), f.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : MessageMetadata.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MessageItem[i];
        }
    }

    public MessageItem(String id10, DateTime date, n direction, DateTime updatedDate, MessageAuthor sender, String recipientId, boolean z, MessageType type, String str, dv9.d status, f state, MessageMetadata messageMetadata) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f79531a = id10;
        this.f79532b = date;
        this.f79533c = direction;
        this.d = updatedDate;
        this.e = sender;
        this.f = recipientId;
        this.f79534g = z;
        this.f79535h = type;
        this.i = str;
        this.f79536j = status;
        this.k = state;
        this.f79537l = messageMetadata;
    }

    public static MessageItem a(MessageItem messageItem, MessageAuthor messageAuthor, MessageType messageType, dv9.d dVar, int i) {
        String id10 = messageItem.f79531a;
        DateTime date = messageItem.f79532b;
        n direction = messageItem.f79533c;
        DateTime updatedDate = messageItem.d;
        if ((i & 16) != 0) {
            messageAuthor = messageItem.e;
        }
        MessageAuthor sender = messageAuthor;
        String recipientId = messageItem.f;
        boolean z = messageItem.f79534g;
        MessageType type = (i & 128) != 0 ? messageItem.f79535h : messageType;
        String str = messageItem.i;
        dv9.d status = (i & 512) != 0 ? messageItem.f79536j : dVar;
        f state = messageItem.k;
        MessageMetadata messageMetadata = messageItem.f79537l;
        messageItem.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(state, "state");
        return new MessageItem(id10, date, direction, updatedDate, sender, recipientId, z, type, str, status, state, messageMetadata);
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getF79534g() {
        return this.f79534g;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.GroupChatItem
    public final GroupMessageAuthor a0() {
        return this.f79533c == n.OUTGOING ? GroupMessageAuthor.CurrentUser.f79520a : new GroupMessageAuthor.Person(this.e.f79529a);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final MessageAuthor getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getK() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final dv9.d getF79536j() {
        return this.f79536j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MessageItem)) {
            return false;
        }
        MessageItem messageItem = (MessageItem) obj2;
        return Intrinsics.f(this.f79531a, messageItem.f79531a) && Intrinsics.f(this.f79532b, messageItem.f79532b) && this.f79533c == messageItem.f79533c && Intrinsics.f(this.d, messageItem.d) && Intrinsics.f(this.e, messageItem.e) && Intrinsics.f(this.f, messageItem.f) && this.f79534g == messageItem.f79534g && Intrinsics.f(this.f79535h, messageItem.f79535h) && Intrinsics.f(this.i, messageItem.i) && this.f79536j == messageItem.f79536j && this.k == messageItem.k && Intrinsics.f(this.f79537l, messageItem.f79537l);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getDate, reason: from getter */
    public final DateTime getF79532b() {
        return this.f79532b;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF79531a() {
        return this.f79531a;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.GroupChatItem
    public final String h9() {
        if (this.f79533c == n.OUTGOING) {
            return null;
        }
        return this.e.f79530b;
    }

    public final int hashCode() {
        int iHashCode = (this.f79535h.hashCode() + j6.a.c(p.a.c((this.e.hashCode() + m72.b.f(this.d, (this.f79533c.hashCode() + m72.b.f(this.f79532b, this.f79531a.hashCode() * 31, 31)) * 31, 31)) * 31, 31, this.f), 31, this.f79534g)) * 31;
        String str = this.i;
        int iHashCode2 = (this.k.hashCode() + ((this.f79536j.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        MessageMetadata messageMetadata = this.f79537l;
        return iHashCode2 + (messageMetadata != null ? messageMetadata.hashCode() : 0);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final MessageType getF79535h() {
        return this.f79535h;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: k, reason: from getter */
    public final n getF79533c() {
        return this.f79533c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79531a);
        dest.writeSerializable(this.f79532b);
        dest.writeString(this.f79533c.name());
        dest.writeSerializable(this.d);
        this.e.writeToParcel(dest, i);
        dest.writeString(this.f);
        dest.writeInt(this.f79534g ? 1 : 0);
        dest.writeParcelable(this.f79535h, i);
        dest.writeString(this.i);
        dest.writeString(this.f79536j.name());
        dest.writeString(this.k.name());
        MessageMetadata messageMetadata = this.f79537l;
        if (messageMetadata == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            messageMetadata.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final DateTime getD() {
        return this.d;
    }

    public /* synthetic */ MessageItem(String str, DateTime dateTime, n nVar, DateTime dateTime2, MessageAuthor messageAuthor, String str2, boolean z, MessageType messageType, dv9.d dVar, f fVar) {
        this(str, dateTime, nVar, dateTime2, messageAuthor, str2, z, messageType, null, dVar, fVar, null);
    }
}
