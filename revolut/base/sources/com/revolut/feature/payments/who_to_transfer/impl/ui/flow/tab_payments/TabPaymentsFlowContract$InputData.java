package com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$InputData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "ChatInputData", "FindFriendsInputData", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$InputData$ChatInputData;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$InputData$FindFriendsInputData;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TabPaymentsFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$InputData$ChatInputData;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatInputData extends TabPaymentsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ChatInputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTransferScreenContract$InputData f80180a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatInputData(ChatTransferScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatInputData[i];
            }
        }

        public ChatInputData(ChatTransferScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f80180a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChatInputData) && Intrinsics.f(this.f80180a, ((ChatInputData) obj2).f80180a);
        }

        public final int hashCode() {
            return this.f80180a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f80180a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$InputData$FindFriendsInputData;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/TabPaymentsFlowContract$InputData;", "<init>", "()V", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FindFriendsInputData extends TabPaymentsFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FindFriendsInputData f80181a = new FindFriendsInputData();

        @NotNull
        public static final Parcelable.Creator<FindFriendsInputData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FindFriendsInputData.f80181a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FindFriendsInputData[i];
            }
        }

        private FindFriendsInputData() {
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

    private TabPaymentsFlowContract$InputData() {
    }
}
