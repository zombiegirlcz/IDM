package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.account_linking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/flows/account_linking/CobrandedCardsAccountLinkingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AccountLinking", "AccountCreation", "PlanHub", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/account_linking/CobrandedCardsAccountLinkingFlowContract$Step$AccountCreation;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/account_linking/CobrandedCardsAccountLinkingFlowContract$Step$AccountLinking;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/account_linking/CobrandedCardsAccountLinkingFlowContract$Step$PlanHub;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CobrandedCardsAccountLinkingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/account_linking/CobrandedCardsAccountLinkingFlowContract$Step$AccountCreation;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/account_linking/CobrandedCardsAccountLinkingFlowContract$Step;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountCreation extends CobrandedCardsAccountLinkingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountCreation f82517a = new AccountCreation();

        @NotNull
        public static final Parcelable.Creator<AccountCreation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountCreation.f82517a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountCreation[i];
            }
        }

        private AccountCreation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/account_linking/CobrandedCardsAccountLinkingFlowContract$Step$AccountLinking;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/account_linking/CobrandedCardsAccountLinkingFlowContract$Step;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountLinking extends CobrandedCardsAccountLinkingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountLinking f82518a = new AccountLinking();

        @NotNull
        public static final Parcelable.Creator<AccountLinking> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountLinking.f82518a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountLinking[i];
            }
        }

        private AccountLinking() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/account_linking/CobrandedCardsAccountLinkingFlowContract$Step$PlanHub;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/account_linking/CobrandedCardsAccountLinkingFlowContract$Step;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanHub extends CobrandedCardsAccountLinkingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanHub f82519a = new PlanHub();

        @NotNull
        public static final Parcelable.Creator<PlanHub> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanHub.f82519a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanHub[i];
            }
        }

        private PlanHub() {
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

    private CobrandedCardsAccountLinkingFlowContract$Step() {
    }
}
