package com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/screen/TransferOnlyChatScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferOnlyChatScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferOnlyChatScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatTransferRecipient f79801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainerBackground f79802b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferOnlyChatScreenContract$InputData((ChatTransferRecipient) parcel.readParcelable(TransferOnlyChatScreenContract$InputData.class.getClassLoader()), (NavBarWithContainerBackground) parcel.readParcelable(TransferOnlyChatScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferOnlyChatScreenContract$InputData[i];
        }
    }

    public TransferOnlyChatScreenContract$InputData(ChatTransferRecipient chatTransferRecipient, NavBarWithContainerBackground navBarWithContainerBackground) {
        Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
        this.f79801a = chatTransferRecipient;
        this.f79802b = navBarWithContainerBackground;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferOnlyChatScreenContract$InputData)) {
            return false;
        }
        TransferOnlyChatScreenContract$InputData transferOnlyChatScreenContract$InputData = (TransferOnlyChatScreenContract$InputData) obj2;
        return Intrinsics.f(this.f79801a, transferOnlyChatScreenContract$InputData.f79801a) && Intrinsics.f(this.f79802b, transferOnlyChatScreenContract$InputData.f79802b);
    }

    public final int hashCode() {
        int iHashCode = this.f79801a.hashCode() * 31;
        NavBarWithContainerBackground navBarWithContainerBackground = this.f79802b;
        return iHashCode + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79801a, i);
        dest.writeParcelable(this.f79802b, i);
    }
}
