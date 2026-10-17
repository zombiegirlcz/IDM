package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.flow.ReusableFlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/payments/social/impl/presentation/p2p_kompot/flow/PeerToPeerChatFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChatScreen", "Transfer", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/flow/PeerToPeerChatFlowContract$Step$ChatScreen;", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/flow/PeerToPeerChatFlowContract$Step$Transfer;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PeerToPeerChatFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/flow/PeerToPeerChatFlowContract$Step$ChatScreen;", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/flow/PeerToPeerChatFlowContract$Step;", "Lcom/revolut/kompot/navigable/flow/ReusableFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatScreen implements PeerToPeerChatFlowContract$Step, ReusableFlowStep {

        @NotNull
        public static final Parcelable.Creator<ChatScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zm3.a f79753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferMoneyPocket f79754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f79755c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatScreen((zm3.a) parcel.readSerializable(), (TransferMoneyPocket) parcel.readParcelable(ChatScreen.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatScreen[i];
            }
        }

        public ChatScreen(zm3.a contact, TransferMoneyPocket transferMoneyPocket, boolean z) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f79753a = contact;
            this.f79754b = transferMoneyPocket;
            this.f79755c = z;
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
            return Intrinsics.f(this.f79753a, chatScreen.f79753a) && Intrinsics.f(this.f79754b, chatScreen.f79754b) && this.f79755c == chatScreen.f79755c;
        }

        @Override // com.revolut.kompot.navigable.flow.ReusableFlowStep
        public final String getKey() {
            return "chat";
        }

        public final int hashCode() {
            int iHashCode = this.f79753a.hashCode() * 31;
            TransferMoneyPocket transferMoneyPocket = this.f79754b;
            return Boolean.hashCode(this.f79755c) + ((iHashCode + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79753a);
            dest.writeParcelable(this.f79754b, i);
            dest.writeInt(this.f79755c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/flow/PeerToPeerChatFlowContract$Step$Transfer;", "Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/flow/PeerToPeerChatFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer implements PeerToPeerChatFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zm3.a f79756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m1l.a f79757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferMoneyPocket f79758c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((zm3.a) parcel.readSerializable(), m1l.a.valueOf(parcel.readString()), (TransferMoneyPocket) parcel.readParcelable(Transfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(zm3.a contact, m1l.a transferScheduleMode, TransferMoneyPocket transferMoneyPocket) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            Intrinsics.checkNotNullParameter(transferScheduleMode, "transferScheduleMode");
            this.f79756a = contact;
            this.f79757b = transferScheduleMode;
            this.f79758c = transferMoneyPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) obj2;
            return Intrinsics.f(this.f79756a, transfer.f79756a) && this.f79757b == transfer.f79757b && Intrinsics.f(this.f79758c, transfer.f79758c);
        }

        public final int hashCode() {
            int iHashCode = (this.f79757b.hashCode() + (this.f79756a.hashCode() * 31)) * 31;
            TransferMoneyPocket transferMoneyPocket = this.f79758c;
            return iHashCode + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79756a);
            dest.writeString(this.f79757b.name());
            dest.writeParcelable(this.f79758c, i);
        }
    }
}
