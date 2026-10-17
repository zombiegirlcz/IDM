package com.revolut.feature.payments.messaging.data.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/MessageAuthor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MessageAuthor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageAuthor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79530b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessageAuthor(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MessageAuthor[i];
        }
    }

    public MessageAuthor(String senderId, String str) {
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        this.f79529a = senderId;
        this.f79530b = str;
    }

    public static MessageAuthor a(MessageAuthor messageAuthor, String str) {
        String senderId = messageAuthor.f79529a;
        messageAuthor.getClass();
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        return new MessageAuthor(senderId, str);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF79529a() {
        return this.f79529a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MessageAuthor)) {
            return false;
        }
        MessageAuthor messageAuthor = (MessageAuthor) obj2;
        return Intrinsics.f(this.f79529a, messageAuthor.f79529a) && Intrinsics.f(this.f79530b, messageAuthor.f79530b);
    }

    public final int hashCode() {
        int iHashCode = this.f79529a.hashCode() * 31;
        String str = this.f79530b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79529a);
        dest.writeString(this.f79530b);
    }

    public /* synthetic */ MessageAuthor(String str) {
        this(str, null);
    }
}
