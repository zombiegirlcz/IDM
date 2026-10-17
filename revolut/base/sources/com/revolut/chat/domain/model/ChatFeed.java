package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/chat/domain/model/ChatFeed;", "Landroid/os/Parcelable;", "Support", "Assistant", "PrivateBanking", "Lcom/revolut/chat/domain/model/ChatFeed$Assistant;", "Lcom/revolut/chat/domain/model/ChatFeed$PrivateBanking;", "Lcom/revolut/chat/domain/model/ChatFeed$Support;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChatFeed extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/ChatFeed$Assistant;", "Lcom/revolut/chat/domain/model/ChatFeed;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Assistant implements ChatFeed {

        @NotNull
        public static final Parcelable.Creator<Assistant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f51029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitialMessage f51030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f51031c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Assistant((UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : InitialMessage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Assistant[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Assistant() {
            this(null, 0 == true ? 1 : 0, false, 7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Assistant)) {
                return false;
            }
            Assistant assistant = (Assistant) obj2;
            return Intrinsics.f(this.f51029a, assistant.f51029a) && Intrinsics.f(this.f51030b, assistant.f51030b) && this.f51031c == assistant.f51031c;
        }

        public final int hashCode() {
            UUID uuid = this.f51029a;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            InitialMessage initialMessage = this.f51030b;
            return Boolean.hashCode(this.f51031c) + ((iHashCode + (initialMessage != null ? initialMessage.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.chat.domain.model.ChatFeed
        public final c0 s0() {
            return c0.ASSISTANT;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f51029a);
            InitialMessage initialMessage = this.f51030b;
            if (initialMessage == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                initialMessage.writeToParcel(dest, i);
            }
            dest.writeInt(this.f51031c ? 1 : 0);
        }

        public Assistant(UUID uuid, InitialMessage initialMessage, boolean z) {
            this.f51029a = uuid;
            this.f51030b = initialMessage;
            this.f51031c = z;
        }

        public /* synthetic */ Assistant(UUID uuid, InitialMessage initialMessage, boolean z, int i) {
            this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : initialMessage, (i & 4) != 0 ? false : z);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/ChatFeed$PrivateBanking;", "Lcom/revolut/chat/domain/model/ChatFeed;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrivateBanking implements ChatFeed {

        @NotNull
        public static final Parcelable.Creator<PrivateBanking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f51032a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrivateBanking((UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateBanking[i];
            }
        }

        public PrivateBanking(UUID feedId) {
            Intrinsics.checkNotNullParameter(feedId, "feedId");
            this.f51032a = feedId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PrivateBanking) && Intrinsics.f(this.f51032a, ((PrivateBanking) obj2).f51032a);
        }

        public final int hashCode() {
            return this.f51032a.hashCode();
        }

        @Override // com.revolut.chat.domain.model.ChatFeed
        public final c0 s0() {
            return c0.PRIVATE_BANKING;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f51032a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/ChatFeed$Support;", "Lcom/revolut/chat/domain/model/ChatFeed;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Support implements ChatFeed {

        @NotNull
        public static final Parcelable.Creator<Support> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f51033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f51034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TicketCreationContext f51035c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Support((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : TicketCreationContext.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Support[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Support() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Support)) {
                return false;
            }
            Support support = (Support) obj2;
            return Intrinsics.f(this.f51033a, support.f51033a) && Intrinsics.f(this.f51034b, support.f51034b) && Intrinsics.f(this.f51035c, support.f51035c);
        }

        public final int hashCode() {
            UUID uuid = this.f51033a;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            UUID uuid2 = this.f51034b;
            int iHashCode2 = (iHashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
            TicketCreationContext ticketCreationContext = this.f51035c;
            return iHashCode2 + (ticketCreationContext != null ? ticketCreationContext.hashCode() : 0);
        }

        @Override // com.revolut.chat.domain.model.ChatFeed
        public final c0 s0() {
            return c0.SUPPORT;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f51033a);
            dest.writeSerializable(this.f51034b);
            TicketCreationContext ticketCreationContext = this.f51035c;
            if (ticketCreationContext == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                ticketCreationContext.writeToParcel(dest, i);
            }
        }

        public Support(UUID uuid, UUID uuid2, TicketCreationContext ticketCreationContext) {
            this.f51033a = uuid;
            this.f51034b = uuid2;
            this.f51035c = ticketCreationContext;
        }

        public /* synthetic */ Support(UUID uuid, UUID uuid2, TicketCreationContext ticketCreationContext, int i) {
            this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : uuid2, (i & 4) != 0 ? null : ticketCreationContext);
        }
    }

    c0 s0();
}
