package com.revolut.feature.payments.social.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.api.model.StartAction;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/payments/social/api/navigation/SocialPaymentsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Companion", "PaymentsProfileChat", "TransferOnlyChat", "a", "Lcom/revolut/feature/payments/social/api/navigation/SocialPaymentsFeatureConfig$PaymentsProfileChat;", "Lcom/revolut/feature/payments/social/api/navigation/SocialPaymentsFeatureConfig$TransferOnlyChat;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SocialPaymentsFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/navigation/SocialPaymentsFeatureConfig$TransferOnlyChat;", "Lcom/revolut/feature/payments/social/api/navigation/SocialPaymentsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferOnlyChat extends SocialPaymentsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<TransferOnlyChat> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTransferRecipient f79736a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferOnlyChat((ChatTransferRecipient) parcel.readParcelable(TransferOnlyChat.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferOnlyChat[i];
            }
        }

        public TransferOnlyChat(ChatTransferRecipient chatTransferItem) {
            Intrinsics.checkNotNullParameter(chatTransferItem, "chatTransferItem");
            this.f79736a = chatTransferItem;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransferOnlyChat) && Intrinsics.f(this.f79736a, ((TransferOnlyChat) obj2).f79736a);
        }

        public final int hashCode() {
            return this.f79736a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79736a, i);
        }
    }

    private SocialPaymentsFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/navigation/SocialPaymentsFeatureConfig$PaymentsProfileChat;", "Lcom/revolut/feature/payments/social/api/navigation/SocialPaymentsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentsProfileChat extends SocialPaymentsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PaymentsProfileChat> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zm3.a f79733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferMoneyPocket f79734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StartAction f79735c;
        public final boolean d;
        public final int e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentsProfileChat((zm3.a) parcel.readSerializable(), (TransferMoneyPocket) parcel.readParcelable(PaymentsProfileChat.class.getClassLoader()), (StartAction) parcel.readParcelable(PaymentsProfileChat.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentsProfileChat[i];
            }
        }

        public PaymentsProfileChat(zm3.a contact, TransferMoneyPocket transferMoneyPocket, StartAction startAction, boolean z, int i) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f79733a = contact;
            this.f79734b = transferMoneyPocket;
            this.f79735c = startAction;
            this.d = z;
            this.e = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentsProfileChat)) {
                return false;
            }
            PaymentsProfileChat paymentsProfileChat = (PaymentsProfileChat) obj2;
            return Intrinsics.f(this.f79733a, paymentsProfileChat.f79733a) && Intrinsics.f(this.f79734b, paymentsProfileChat.f79734b) && Intrinsics.f(this.f79735c, paymentsProfileChat.f79735c) && this.d == paymentsProfileChat.d && this.e == paymentsProfileChat.e;
        }

        public final int hashCode() {
            int iHashCode = this.f79733a.hashCode() * 31;
            TransferMoneyPocket transferMoneyPocket = this.f79734b;
            int iHashCode2 = (iHashCode + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode())) * 31;
            StartAction startAction = this.f79735c;
            return Integer.hashCode(this.e) + j6.a.c((iHashCode2 + (startAction != null ? startAction.hashCode() : 0)) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79733a);
            dest.writeParcelable(this.f79734b, i);
            dest.writeParcelable(this.f79735c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e);
        }

        public /* synthetic */ PaymentsProfileChat(zm3.a aVar, TransferMoneyPocket transferMoneyPocket, StartAction.ShowBottomDialog showBottomDialog, boolean z, int i) {
            this(aVar, (i & 2) != 0 ? null : transferMoneyPocket, (StartAction) ((i & 4) != 0 ? null : showBottomDialog), (i & 8) != 0 ? false : z, (i & 16) == 0 ? 603979776 : 0);
        }
    }
}
