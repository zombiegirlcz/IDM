package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/chat/domain/model/ChatMode;", "Landroid/os/Parcelable;", "Default", "SingleFeed", "Feed", "Lcom/revolut/chat/domain/model/ChatMode$Default;", "Lcom/revolut/chat/domain/model/ChatMode$Feed;", "Lcom/revolut/chat/domain/model/ChatMode$SingleFeed;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChatMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/ChatMode$Feed;", "Lcom/revolut/chat/domain/model/ChatMode;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Feed implements ChatMode {

        @NotNull
        public static final Parcelable.Creator<Feed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f51044a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Feed((UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Feed[i];
            }
        }

        public Feed(UUID feedId) {
            Intrinsics.checkNotNullParameter(feedId, "feedId");
            this.f51044a = feedId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Feed) && Intrinsics.f(this.f51044a, ((Feed) obj2).f51044a);
        }

        public final int hashCode() {
            return this.f51044a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f51044a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/domain/model/ChatMode$SingleFeed;", "Lcom/revolut/chat/domain/model/ChatMode;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SingleFeed implements ChatMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SingleFeed f51045a = new SingleFeed();

        @NotNull
        public static final Parcelable.Creator<SingleFeed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SingleFeed.f51045a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleFeed[i];
            }
        }

        private SingleFeed() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/ChatMode$Default;", "Lcom/revolut/chat/domain/model/ChatMode;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default implements ChatMode {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f51043a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default((UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(UUID uuid) {
            this.f51043a = uuid;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Default) && Intrinsics.f(this.f51043a, ((Default) obj2).f51043a);
        }

        public final int hashCode() {
            UUID uuid = this.f51043a;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f51043a);
        }

        public Default() {
            this(null);
        }
    }
}
