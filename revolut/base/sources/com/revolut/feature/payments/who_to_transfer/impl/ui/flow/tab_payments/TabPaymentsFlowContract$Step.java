package com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Chats", "InitialScreen", "FindFriendsScreen", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$Step$Chats;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$Step$FindFriendsScreen;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$Step$InitialScreen;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TabPaymentsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$Step$Chats;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chats extends TabPaymentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Chats> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTransferScreenContract$InputData f80182a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chats(ChatTransferScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chats[i];
            }
        }

        public Chats(ChatTransferScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f80182a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chats) && Intrinsics.f(this.f80182a, ((Chats) obj2).f80182a);
        }

        public final int hashCode() {
            return this.f80182a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f80182a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$Step$FindFriendsScreen;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$Step;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FindFriendsScreen extends TabPaymentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FindFriendsScreen f80183a = new FindFriendsScreen();

        @NotNull
        public static final Parcelable.Creator<FindFriendsScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FindFriendsScreen.f80183a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FindFriendsScreen[i];
            }
        }

        private FindFriendsScreen() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$Step$InitialScreen;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitialScreen extends TabPaymentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InitialScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTransferScreenContract$InputData f80184a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitialScreen(ChatTransferScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InitialScreen[i];
            }
        }

        public InitialScreen(ChatTransferScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f80184a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InitialScreen) && Intrinsics.f(this.f80184a, ((InitialScreen) obj2).f80184a);
        }

        public final int hashCode() {
            return this.f80184a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f80184a.writeToParcel(dest, i);
        }
    }

    private TabPaymentsFlowContract$Step() {
    }
}
