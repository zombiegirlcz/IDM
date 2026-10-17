package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.messaging.common.api.reactions.ReactionsAuthorsViewer$InputData;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zm3.l;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreenContract$ScreenModelApi$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Reactions", "ReactionsPicker", "UnblockUser", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreenContract$ScreenModelApi$ModalStep$Reactions;", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreenContract$ScreenModelApi$ModalStep$ReactionsPicker;", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreenContract$ScreenModelApi$ModalStep$UnblockUser;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PeerToPeerChatScreenContract$ScreenModelApi$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreenContract$ScreenModelApi$ModalStep$Reactions;", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreenContract$ScreenModelApi$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reactions implements PeerToPeerChatScreenContract$ScreenModelApi$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Reactions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReactionsAuthorsViewer$InputData f79771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ChatItem f79772b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Reactions((ReactionsAuthorsViewer$InputData) parcel.readParcelable(Reactions.class.getClassLoader()), (ChatItem) parcel.readParcelable(Reactions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reactions[i];
            }
        }

        public Reactions(ReactionsAuthorsViewer$InputData data, ChatItem chatItem) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(chatItem, "chatItem");
            this.f79771a = data;
            this.f79772b = chatItem;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Reactions)) {
                return false;
            }
            Reactions reactions = (Reactions) obj2;
            return Intrinsics.f(this.f79771a, reactions.f79771a) && Intrinsics.f(this.f79772b, reactions.f79772b);
        }

        public final int hashCode() {
            return this.f79772b.hashCode() + (this.f79771a.f79508a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79771a, i);
            dest.writeParcelable(this.f79772b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreenContract$ScreenModelApi$ModalStep$ReactionsPicker;", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreenContract$ScreenModelApi$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReactionsPicker implements PeerToPeerChatScreenContract$ScreenModelApi$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ReactionsPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatItem f79773a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReactionsPicker((ChatItem) parcel.readParcelable(ReactionsPicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReactionsPicker[i];
            }
        }

        public ReactionsPicker(ChatItem chatItem) {
            Intrinsics.checkNotNullParameter(chatItem, "chatItem");
            this.f79773a = chatItem;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReactionsPicker) && Intrinsics.f(this.f79773a, ((ReactionsPicker) obj2).f79773a);
        }

        public final int hashCode() {
            return this.f79773a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79773a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreenContract$ScreenModelApi$ModalStep$UnblockUser;", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreenContract$ScreenModelApi$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnblockUser implements PeerToPeerChatScreenContract$ScreenModelApi$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UnblockUser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f79774a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnblockUser((l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnblockUser[i];
            }
        }

        public UnblockUser(l contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f79774a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnblockUser) && Intrinsics.f(this.f79774a, ((UnblockUser) obj2).f79774a);
        }

        public final int hashCode() {
            return this.f79774a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79774a);
        }
    }
}
