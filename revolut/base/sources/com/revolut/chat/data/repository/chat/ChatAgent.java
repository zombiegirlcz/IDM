package com.revolut.chat.data.repository.chat;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/chat/data/repository/chat/ChatAgent;", "Lcom/revolut/chat/data/repository/chat/MessageAuthor;", "<init>", "()V", "Bot", "Live", "Lcom/revolut/chat/data/repository/chat/ChatAgent$Bot;", "Lcom/revolut/chat/data/repository/chat/ChatAgent$Live;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChatAgent extends MessageAuthor {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lcom/revolut/chat/data/repository/chat/ChatAgent$Bot;", "Lcom/revolut/chat/data/repository/chat/ChatAgent;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bot extends ChatAgent {

        @NotNull
        public static final Parcelable.Creator<Bot> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("id")
        @NotNull
        private final UUID id;

        /* JADX INFO: loaded from: classes19.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bot((UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bot[i];
            }
        }

        public Bot(UUID id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.id = id10;
        }

        @Override // com.revolut.chat.data.repository.chat.ChatAgent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Bot) && Intrinsics.f(this.id, ((Bot) obj2).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/revolut/chat/data/repository/chat/ChatAgent$Live;", "Lcom/revolut/chat/data/repository/chat/ChatAgent;", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "id", "b", "Ljava/lang/String;", "getName", "name", "c", "avatarUrl", "d", "getTitle", "title", "e", "getEmail", "email", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Live extends ChatAgent {

        @NotNull
        public static final Parcelable.Creator<Live> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("id")
        @NotNull
        private final UUID id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("name")
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @b("avatarUrl")
        private final String avatarUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @b("title")
        private final String title;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @b("email")
        private final String email;

        /* JADX INFO: loaded from: classes19.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Live((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Live[i];
            }
        }

        public Live(UUID id10, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.id = id10;
            this.name = str;
            this.avatarUrl = str2;
            this.title = str3;
            this.email = str4;
        }

        @Override // com.revolut.chat.data.repository.chat.ChatAgent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Live)) {
                return false;
            }
            Live live = (Live) obj2;
            return Intrinsics.f(this.id, live.id) && Intrinsics.f(this.name, live.name) && Intrinsics.f(this.avatarUrl, live.avatarUrl) && Intrinsics.f(this.title, live.title) && Intrinsics.f(this.email, live.email);
        }

        public final String getName() {
            return this.name;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.avatarUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.email;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeString(this.name);
            dest.writeString(this.avatarUrl);
            dest.writeString(this.title);
            dest.writeString(this.email);
        }
    }

    private ChatAgent() {
    }

    /* JADX INFO: renamed from: a */
    public abstract UUID getId();
}
