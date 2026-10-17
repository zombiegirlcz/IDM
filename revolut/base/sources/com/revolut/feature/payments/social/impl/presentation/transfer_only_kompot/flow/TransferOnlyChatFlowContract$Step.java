package com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/flow/TransferOnlyChatFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChatScreen", "Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/flow/TransferOnlyChatFlowContract$Step$ChatScreen;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferOnlyChatFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/flow/TransferOnlyChatFlowContract$Step$ChatScreen;", "Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/flow/TransferOnlyChatFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatScreen implements TransferOnlyChatFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChatScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTransferRecipient f79791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NavBarWithContainerBackground f79792b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatScreen((ChatTransferRecipient) parcel.readParcelable(ChatScreen.class.getClassLoader()), (NavBarWithContainerBackground) parcel.readParcelable(ChatScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatScreen[i];
            }
        }

        public ChatScreen(ChatTransferRecipient chatTransferRecipient, NavBarWithContainerBackground navBarWithContainerBackground) {
            Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
            this.f79791a = chatTransferRecipient;
            this.f79792b = navBarWithContainerBackground;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChatScreen)) {
                return false;
            }
            ChatScreen chatScreen = (ChatScreen) obj2;
            return Intrinsics.f(this.f79791a, chatScreen.f79791a) && Intrinsics.f(this.f79792b, chatScreen.f79792b);
        }

        public final int hashCode() {
            int iHashCode = this.f79791a.hashCode() * 31;
            NavBarWithContainerBackground navBarWithContainerBackground = this.f79792b;
            return iHashCode + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79791a, i);
            dest.writeParcelable(this.f79792b, i);
        }
    }
}
