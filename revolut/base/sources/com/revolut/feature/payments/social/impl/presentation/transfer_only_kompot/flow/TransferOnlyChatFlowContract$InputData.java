package com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0a.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/flow/TransferOnlyChatFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferOnlyChatFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferOnlyChatFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatTransferRecipient f79789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f79790b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferOnlyChatFlowContract$InputData((ChatTransferRecipient) parcel.readParcelable(TransferOnlyChatFlowContract$InputData.class.getClassLoader()), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferOnlyChatFlowContract$InputData[i];
        }
    }

    public TransferOnlyChatFlowContract$InputData(ChatTransferRecipient chatTransferRecipient, c launchType) {
        Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        this.f79789a = chatTransferRecipient;
        this.f79790b = launchType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferOnlyChatFlowContract$InputData)) {
            return false;
        }
        TransferOnlyChatFlowContract$InputData transferOnlyChatFlowContract$InputData = (TransferOnlyChatFlowContract$InputData) obj2;
        return Intrinsics.f(this.f79789a, transferOnlyChatFlowContract$InputData.f79789a) && this.f79790b == transferOnlyChatFlowContract$InputData.f79790b;
    }

    public final int hashCode() {
        return this.f79790b.hashCode() + (this.f79789a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79789a, i);
        dest.writeString(this.f79790b.name());
    }

    public /* synthetic */ TransferOnlyChatFlowContract$InputData(ChatTransferRecipient chatTransferRecipient) {
        this(chatTransferRecipient, c.DESTINATION);
    }
}
