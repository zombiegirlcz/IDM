package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/payments/social/impl/presentation/p2p_kompot/chat_only_flow/PeerToPeerChatOnlyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChatScreen", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/chat_only_flow/PeerToPeerChatOnlyFlowContract$Step$ChatScreen;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PeerToPeerChatOnlyFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/chat_only_flow/PeerToPeerChatOnlyFlowContract$Step$ChatScreen;", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/chat_only_flow/PeerToPeerChatOnlyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatScreen implements PeerToPeerChatOnlyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChatScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zm3.a f79741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferMoneyPocket f79742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f79743c;
        public final NavBarWithContainerBackground d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatScreen((zm3.a) parcel.readSerializable(), (TransferMoneyPocket) parcel.readParcelable(ChatScreen.class.getClassLoader()), parcel.readInt() != 0, (NavBarWithContainerBackground) parcel.readParcelable(ChatScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatScreen[i];
            }
        }

        public ChatScreen(zm3.a contact, TransferMoneyPocket transferMoneyPocket, boolean z, NavBarWithContainerBackground navBarWithContainerBackground) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f79741a = contact;
            this.f79742b = transferMoneyPocket;
            this.f79743c = z;
            this.d = navBarWithContainerBackground;
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
            return Intrinsics.f(this.f79741a, chatScreen.f79741a) && Intrinsics.f(this.f79742b, chatScreen.f79742b) && this.f79743c == chatScreen.f79743c && Intrinsics.f(this.d, chatScreen.d);
        }

        public final int hashCode() {
            int iHashCode = this.f79741a.hashCode() * 31;
            TransferMoneyPocket transferMoneyPocket = this.f79742b;
            int iC = j6.a.c((iHashCode + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode())) * 31, 31, this.f79743c);
            NavBarWithContainerBackground navBarWithContainerBackground = this.d;
            return iC + (navBarWithContainerBackground != null ? navBarWithContainerBackground.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79741a);
            dest.writeParcelable(this.f79742b, i);
            dest.writeInt(this.f79743c ? 1 : 0);
            dest.writeParcelable(this.d, i);
        }
    }
}
