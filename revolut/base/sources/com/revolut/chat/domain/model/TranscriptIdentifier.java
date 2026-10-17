package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/chat/domain/model/TranscriptIdentifier;", "Landroid/os/Parcelable;", "Companion", "ChatId", "FeedId", "AllChats", "a", "Lcom/revolut/chat/domain/model/TranscriptIdentifier$AllChats;", "Lcom/revolut/chat/domain/model/TranscriptIdentifier$ChatId;", "Lcom/revolut/chat/domain/model/TranscriptIdentifier$FeedId;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TranscriptIdentifier extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f51081a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/domain/model/TranscriptIdentifier$AllChats;", "Lcom/revolut/chat/domain/model/TranscriptIdentifier;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AllChats implements TranscriptIdentifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllChats f51078a = new AllChats();

        @NotNull
        public static final Parcelable.Creator<AllChats> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllChats.f51078a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllChats[i];
            }
        }

        private AllChats() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/TranscriptIdentifier$ChatId;", "Lcom/revolut/chat/domain/model/TranscriptIdentifier;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatId implements TranscriptIdentifier {

        @NotNull
        public static final Parcelable.Creator<ChatId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f51079a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatId((UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatId[i];
            }
        }

        public ChatId(UUID chatId) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.f51079a = chatId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChatId) && Intrinsics.f(this.f51079a, ((ChatId) obj2).f51079a);
        }

        public final int hashCode() {
            return this.f51079a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f51079a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/TranscriptIdentifier$FeedId;", "Lcom/revolut/chat/domain/model/TranscriptIdentifier;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeedId implements TranscriptIdentifier {

        @NotNull
        public static final Parcelable.Creator<FeedId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f51080a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeedId((UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeedId[i];
            }
        }

        public FeedId(UUID feedId) {
            Intrinsics.checkNotNullParameter(feedId, "feedId");
            this.f51080a = feedId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FeedId) && Intrinsics.f(this.f51080a, ((FeedId) obj2).f51080a);
        }

        public final int hashCode() {
            return this.f51080a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f51080a);
        }
    }

    /* JADX INFO: renamed from: com.revolut.chat.domain.model.TranscriptIdentifier$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f51081a = new Companion();

        private Companion() {
        }
    }
}
