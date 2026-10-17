package com.revolut.chat.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/chat/ui/flow/ChatFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "IntroVideo", "AirIntroStories", "AirMandatoryIntroStories", "Chat", "ChatList", "Lcom/revolut/chat/ui/flow/ChatFlowContract$Step$AirIntroStories;", "Lcom/revolut/chat/ui/flow/ChatFlowContract$Step$AirMandatoryIntroStories;", "Lcom/revolut/chat/ui/flow/ChatFlowContract$Step$Chat;", "Lcom/revolut/chat/ui/flow/ChatFlowContract$Step$ChatList;", "Lcom/revolut/chat/ui/flow/ChatFlowContract$Step$IntroVideo;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChatFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/flow/ChatFlowContract$Step$AirIntroStories;", "Lcom/revolut/chat/ui/flow/ChatFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AirIntroStories extends ChatFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AirIntroStories> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f51150a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AirIntroStories(c0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirIntroStories[i];
            }
        }

        public AirIntroStories(c0 feedType) {
            Intrinsics.checkNotNullParameter(feedType, "feedType");
            this.f51150a = feedType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AirIntroStories) && this.f51150a == ((AirIntroStories) obj2).f51150a;
        }

        public final int hashCode() {
            return this.f51150a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51150a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/flow/ChatFlowContract$Step$AirMandatoryIntroStories;", "Lcom/revolut/chat/ui/flow/ChatFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AirMandatoryIntroStories extends ChatFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AirMandatoryIntroStories> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTarget.Messages f51151a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AirMandatoryIntroStories((ChatTarget.Messages) parcel.readParcelable(AirMandatoryIntroStories.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirMandatoryIntroStories[i];
            }
        }

        public AirMandatoryIntroStories(ChatTarget.Messages target) {
            Intrinsics.checkNotNullParameter(target, "target");
            this.f51151a = target;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AirMandatoryIntroStories) && Intrinsics.f(this.f51151a, ((AirMandatoryIntroStories) obj2).f51151a);
        }

        public final int hashCode() {
            return this.f51151a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51151a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/flow/ChatFlowContract$Step$Chat;", "Lcom/revolut/chat/ui/flow/ChatFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chat extends ChatFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Chat> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTarget.Messages f51152a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chat((ChatTarget.Messages) parcel.readParcelable(Chat.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chat[i];
            }
        }

        public Chat(ChatTarget.Messages target) {
            Intrinsics.checkNotNullParameter(target, "target");
            this.f51152a = target;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chat) && Intrinsics.f(this.f51152a, ((Chat) obj2).f51152a);
        }

        public final int hashCode() {
            return this.f51152a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51152a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/flow/ChatFlowContract$Step$ChatList;", "Lcom/revolut/chat/ui/flow/ChatFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatList extends ChatFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChatList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTarget.ChatList f51153a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatList((ChatTarget.ChatList) parcel.readParcelable(ChatList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatList[i];
            }
        }

        public ChatList(ChatTarget.ChatList target) {
            Intrinsics.checkNotNullParameter(target, "target");
            this.f51153a = target;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChatList) && Intrinsics.f(this.f51153a, ((ChatList) obj2).f51153a);
        }

        public final int hashCode() {
            return this.f51153a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51153a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/flow/ChatFlowContract$Step$IntroVideo;", "Lcom/revolut/chat/ui/flow/ChatFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IntroVideo extends ChatFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IntroVideo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f51154a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntroVideo(c0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IntroVideo[i];
            }
        }

        public IntroVideo(c0 feedType) {
            Intrinsics.checkNotNullParameter(feedType, "feedType");
            this.f51154a = feedType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IntroVideo) && this.f51154a == ((IntroVideo) obj2).f51154a;
        }

        public final int hashCode() {
            return this.f51154a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51154a.name());
        }
    }

    private ChatFlowContract$Step() {
    }
}
