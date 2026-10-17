package com.revolut.feature.credit.card.impl.ui.instalment.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "InterestInfo", "AprInfo", "TotalToRepayInfo", "TransactionsOverview", "Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep$AprInfo;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep$InterestInfo;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep$TotalToRepayInfo;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep$TransactionsOverview;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstalmentConfirmationScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep$AprInfo;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AprInfo implements InstalmentConfirmationScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AprInfo f69302a = new AprInfo();

        @NotNull
        public static final Parcelable.Creator<AprInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AprInfo.f69302a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AprInfo[i];
            }
        }

        private AprInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep$InterestInfo;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InterestInfo implements InstalmentConfirmationScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InterestInfo f69303a = new InterestInfo();

        @NotNull
        public static final Parcelable.Creator<InterestInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InterestInfo.f69303a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InterestInfo[i];
            }
        }

        private InterestInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep$TotalToRepayInfo;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TotalToRepayInfo implements InstalmentConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TotalToRepayInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f69306c;
        public final d d;
        public final d e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TotalToRepayInfo((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalToRepayInfo[i];
            }
        }

        public TotalToRepayInfo(d totalToRepay, d financedAmount, d purchaseAmount, d dVar, d interests) {
            Intrinsics.checkNotNullParameter(totalToRepay, "totalToRepay");
            Intrinsics.checkNotNullParameter(financedAmount, "financedAmount");
            Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
            Intrinsics.checkNotNullParameter(interests, "interests");
            this.f69304a = totalToRepay;
            this.f69305b = financedAmount;
            this.f69306c = purchaseAmount;
            this.d = dVar;
            this.e = interests;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TotalToRepayInfo)) {
                return false;
            }
            TotalToRepayInfo totalToRepayInfo = (TotalToRepayInfo) obj2;
            return Intrinsics.f(this.f69304a, totalToRepayInfo.f69304a) && Intrinsics.f(this.f69305b, totalToRepayInfo.f69305b) && Intrinsics.f(this.f69306c, totalToRepayInfo.f69306c) && Intrinsics.f(this.d, totalToRepayInfo.d) && Intrinsics.f(this.e, totalToRepayInfo.e);
        }

        public final int hashCode() {
            int iC = v7.c(v7.c(this.f69304a.hashCode() * 31, 31, this.f69305b), 31, this.f69306c);
            d dVar = this.d;
            return this.e.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69304a);
            dest.writeSerializable(this.f69305b);
            dest.writeSerializable(this.f69306c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep$TransactionsOverview;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/confirmation/InstalmentConfirmationScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransactionsOverview implements InstalmentConfirmationScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransactionsOverview f69307a = new TransactionsOverview();

        @NotNull
        public static final Parcelable.Creator<TransactionsOverview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransactionsOverview.f69307a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionsOverview[i];
            }
        }

        private TransactionsOverview() {
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
}
