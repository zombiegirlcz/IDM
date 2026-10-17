package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/chat/domain/model/MessageType;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "variant", "b", "getId", "id", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MessageType implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageType> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("variant")
    @NotNull
    private final String variant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("id")
    private final String id;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MessageType(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MessageType[i];
        }
    }

    public MessageType(String variant, String str) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.variant = variant;
        this.id = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MessageType)) {
            return false;
        }
        MessageType messageType = (MessageType) obj2;
        return Intrinsics.f(this.variant, messageType.variant) && Intrinsics.f(this.id, messageType.id);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = this.variant.hashCode() * 31;
        String str = this.id;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.variant);
        dest.writeString(this.id);
    }
}
