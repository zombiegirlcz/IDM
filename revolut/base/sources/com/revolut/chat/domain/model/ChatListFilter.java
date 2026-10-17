package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/chat/domain/model/ChatListFilter;", "Landroid/os/Parcelable;", "None", "Tickets", "PastRequests", "Lcom/revolut/chat/domain/model/ChatListFilter$None;", "Lcom/revolut/chat/domain/model/ChatListFilter$PastRequests;", "Lcom/revolut/chat/domain/model/ChatListFilter$Tickets;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChatListFilter extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/domain/model/ChatListFilter$None;", "Lcom/revolut/chat/domain/model/ChatListFilter;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None implements ChatListFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f51036a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f51036a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/domain/model/ChatListFilter$PastRequests;", "Lcom/revolut/chat/domain/model/ChatListFilter;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PastRequests implements ChatListFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PastRequests f51037a = new PastRequests();

        @NotNull
        public static final Parcelable.Creator<PastRequests> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PastRequests.f51037a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PastRequests[i];
            }
        }

        private PastRequests() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/ChatListFilter$Tickets;", "Lcom/revolut/chat/domain/model/ChatListFilter;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tickets implements ChatListFilter {

        @NotNull
        public static final Parcelable.Creator<Tickets> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f51038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f51039b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tickets(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tickets[i];
            }
        }

        public Tickets(boolean z, boolean z3) {
            this.f51038a = z;
            this.f51039b = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Tickets)) {
                return false;
            }
            Tickets tickets = (Tickets) obj2;
            return this.f51038a == tickets.f51038a && this.f51039b == tickets.f51039b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f51039b) + (Boolean.hashCode(this.f51038a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f51038a ? 1 : 0);
            dest.writeInt(this.f51039b ? 1 : 0);
        }

        public Tickets() {
            this(true, true);
        }
    }
}
