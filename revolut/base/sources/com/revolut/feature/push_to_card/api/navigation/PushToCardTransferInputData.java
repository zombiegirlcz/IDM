package com.revolut.feature.push_to_card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.flow.FlowExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/push_to_card/api/navigation/PushToCardTransferInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Companion", "NewTransfer", "ReviewOnly", "a", "Lcom/revolut/feature/push_to_card/api/navigation/PushToCardTransferInputData$NewTransfer;", "Lcom/revolut/feature/push_to_card/api/navigation/PushToCardTransferInputData$ReviewOnly;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PushToCardTransferInputData implements IOData$Input {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/navigation/PushToCardTransferInputData$ReviewOnly;", "Lcom/revolut/feature/push_to_card/api/navigation/PushToCardTransferInputData;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewOnly extends PushToCardTransferInputData {

        @NotNull
        public static final Parcelable.Creator<ReviewOnly> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwner f81536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PushToCardTransferData f81537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferFlowType f81538c;
        public final FlowExtras d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewOnly((CardOwner) parcel.readParcelable(ReviewOnly.class.getClassLoader()), PushToCardTransferData.CREATOR.createFromParcel(parcel), (TransferFlowType) parcel.readParcelable(ReviewOnly.class.getClassLoader()), (FlowExtras) parcel.readParcelable(ReviewOnly.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewOnly[i];
            }
        }

        public ReviewOnly(CardOwner recipient, PushToCardTransferData transferData, TransferFlowType transferFlowType, FlowExtras flowExtras) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            Intrinsics.checkNotNullParameter(transferFlowType, "transferFlowType");
            this.f81536a = recipient;
            this.f81537b = transferData;
            this.f81538c = transferFlowType;
            this.d = flowExtras;
        }

        @Override // com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData
        /* JADX INFO: renamed from: R6, reason: from getter */
        public final CardOwner getF81536a() {
            return this.f81536a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReviewOnly)) {
                return false;
            }
            ReviewOnly reviewOnly = (ReviewOnly) obj2;
            return Intrinsics.f(this.f81536a, reviewOnly.f81536a) && Intrinsics.f(this.f81537b, reviewOnly.f81537b) && Intrinsics.f(this.f81538c, reviewOnly.f81538c) && Intrinsics.f(this.d, reviewOnly.d);
        }

        public final int hashCode() {
            int iC = d.c(this.f81538c, (this.f81537b.hashCode() + (this.f81536a.hashCode() * 31)) * 31, 31);
            FlowExtras flowExtras = this.d;
            return iC + (flowExtras == null ? 0 : flowExtras.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81536a, i);
            this.f81537b.writeToParcel(dest, i);
            dest.writeParcelable(this.f81538c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static NewTransfer a(Companion companion, CardOwner recipient, TransferMoneyPocket transferMoneyPocket, TransferFlowType transferFlowType, int i) {
            boolean z = (i & 16) == 0;
            companion.getClass();
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(transferMoneyPocket, "transferMoneyPocket");
            Intrinsics.checkNotNullParameter(transferFlowType, "transferFlowType");
            return new NewTransfer(recipient, transferMoneyPocket, transferFlowType, z, (TransferAppSource.AIR_WIDGET) null, 32);
        }
    }

    /* JADX INFO: renamed from: R6 */
    public abstract CardOwner getF81536a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/navigation/PushToCardTransferInputData$NewTransfer;", "Lcom/revolut/feature/push_to_card/api/navigation/PushToCardTransferInputData;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer extends PushToCardTransferInputData {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwner f81533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferMoneyPocket f81534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferFlowType f81535c;
        public final FlowExtras d;
        public final boolean e;
        public final TransferAppSource f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewTransfer((CardOwner) parcel.readParcelable(NewTransfer.class.getClassLoader()), (TransferMoneyPocket) parcel.readParcelable(NewTransfer.class.getClassLoader()), (TransferFlowType) parcel.readParcelable(NewTransfer.class.getClassLoader()), (FlowExtras) parcel.readParcelable(NewTransfer.class.getClassLoader()), parcel.readInt() != 0, (TransferAppSource) parcel.readParcelable(NewTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        public NewTransfer(CardOwner recipient, TransferMoneyPocket transferMoneyPocket, TransferFlowType transferFlowType, FlowExtras flowExtras, boolean z, TransferAppSource transferAppSource) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(transferMoneyPocket, "transferMoneyPocket");
            Intrinsics.checkNotNullParameter(transferFlowType, "transferFlowType");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            this.f81533a = recipient;
            this.f81534b = transferMoneyPocket;
            this.f81535c = transferFlowType;
            this.d = flowExtras;
            this.e = z;
            this.f = transferAppSource;
        }

        @Override // com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData
        /* JADX INFO: renamed from: R6, reason: from getter */
        public final CardOwner getF81536a() {
            return this.f81533a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewTransfer)) {
                return false;
            }
            NewTransfer newTransfer = (NewTransfer) obj2;
            return Intrinsics.f(this.f81533a, newTransfer.f81533a) && Intrinsics.f(this.f81534b, newTransfer.f81534b) && Intrinsics.f(this.f81535c, newTransfer.f81535c) && Intrinsics.f(this.d, newTransfer.d) && this.e == newTransfer.e && Intrinsics.f(this.f, newTransfer.f);
        }

        public final int hashCode() {
            int iC = d.c(this.f81535c, (this.f81534b.hashCode() + (this.f81533a.hashCode() * 31)) * 31, 31);
            FlowExtras flowExtras = this.d;
            return this.f.hashCode() + j6.a.c((iC + (flowExtras == null ? 0 : flowExtras.hashCode())) * 31, 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81533a, i);
            dest.writeParcelable(this.f81534b, i);
            dest.writeParcelable(this.f81535c, i);
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
        }

        public /* synthetic */ NewTransfer(CardOwner cardOwner, TransferMoneyPocket transferMoneyPocket, TransferFlowType transferFlowType, boolean z, TransferAppSource.AIR_WIDGET air_widget, int i) {
            this(cardOwner, transferMoneyPocket, transferFlowType, (FlowExtras) null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? TransferAppSource.DEFAULT.f92298a : air_widget);
        }
    }
}
