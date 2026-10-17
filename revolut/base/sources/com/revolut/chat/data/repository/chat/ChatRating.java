package com.revolut.chat.data.repository.chat;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/chat/data/repository/chat/ChatRating;", "Landroid/os/Parcelable;", "Postponed", "NotRated", "Rated", "Experience", "Lcom/revolut/chat/data/repository/chat/ChatRating$Experience;", "Lcom/revolut/chat/data/repository/chat/ChatRating$NotRated;", "Lcom/revolut/chat/data/repository/chat/ChatRating$Postponed;", "Lcom/revolut/chat/data/repository/chat/ChatRating$Rated;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChatRating extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/data/repository/chat/ChatRating$Experience;", "Lcom/revolut/chat/data/repository/chat/ChatRating;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class Experience implements ChatRating {

        @NotNull
        public static final Parcelable.Creator<Experience> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51017a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Experience(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Experience[i];
            }
        }

        public Experience(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f51017a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Experience) && Intrinsics.f(this.f51017a, ((Experience) obj2).f51017a);
        }

        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF51017a() {
            return this.f51017a;
        }

        public final int hashCode() {
            return this.f51017a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51017a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/data/repository/chat/ChatRating$NotRated;", "Lcom/revolut/chat/data/repository/chat/ChatRating;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotRated implements ChatRating {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotRated f51018a = new NotRated();

        @NotNull
        public static final Parcelable.Creator<NotRated> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotRated.f51018a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotRated[i];
            }
        }

        private NotRated() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/data/repository/chat/ChatRating$Postponed;", "Lcom/revolut/chat/data/repository/chat/ChatRating;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Postponed implements ChatRating {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Postponed f51019a = new Postponed();

        @NotNull
        public static final Parcelable.Creator<Postponed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Postponed.f51019a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Postponed[i];
            }
        }

        private Postponed() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/data/repository/chat/ChatRating$Rated;", "Lcom/revolut/chat/data/repository/chat/ChatRating;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rated implements ChatRating {

        @NotNull
        public static final Parcelable.Creator<Rated> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51022c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Rated(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rated[i];
            }
        }

        public Rated(String value, String title, String asset) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.f51020a = value;
            this.f51021b = title;
            this.f51022c = asset;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF51022c() {
            return this.f51022c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Rated)) {
                return false;
            }
            Rated rated = (Rated) obj2;
            return Intrinsics.f(this.f51020a, rated.f51020a) && Intrinsics.f(this.f51021b, rated.f51021b) && Intrinsics.f(this.f51022c, rated.f51022c);
        }

        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF51021b() {
            return this.f51021b;
        }

        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF51020a() {
            return this.f51020a;
        }

        public final int hashCode() {
            return this.f51022c.hashCode() + p.a.c(this.f51020a.hashCode() * 31, 31, this.f51021b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51020a);
            dest.writeString(this.f51021b);
            dest.writeString(this.f51022c);
        }
    }
}
