package com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_facade;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_facade/FacadeOpenBankingConsentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BrazilConsents", "DefaultConsents", "LinkedAccountsConsent", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_facade/FacadeOpenBankingConsentsFlowContract$Step$BrazilConsents;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_facade/FacadeOpenBankingConsentsFlowContract$Step$DefaultConsents;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_facade/FacadeOpenBankingConsentsFlowContract$Step$LinkedAccountsConsent;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FacadeOpenBankingConsentsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_facade/FacadeOpenBankingConsentsFlowContract$Step$BrazilConsents;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_facade/FacadeOpenBankingConsentsFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BrazilConsents extends FacadeOpenBankingConsentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BrazilConsents f72778a = new BrazilConsents();

        @NotNull
        public static final Parcelable.Creator<BrazilConsents> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BrazilConsents.f72778a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BrazilConsents[i];
            }
        }

        private BrazilConsents() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_facade/FacadeOpenBankingConsentsFlowContract$Step$DefaultConsents;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_facade/FacadeOpenBankingConsentsFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultConsents extends FacadeOpenBankingConsentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DefaultConsents f72779a = new DefaultConsents();

        @NotNull
        public static final Parcelable.Creator<DefaultConsents> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DefaultConsents.f72779a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DefaultConsents[i];
            }
        }

        private DefaultConsents() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_facade/FacadeOpenBankingConsentsFlowContract$Step$LinkedAccountsConsent;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/consents_facade/FacadeOpenBankingConsentsFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LinkedAccountsConsent extends FacadeOpenBankingConsentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LinkedAccountsConsent f72780a = new LinkedAccountsConsent();

        @NotNull
        public static final Parcelable.Creator<LinkedAccountsConsent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LinkedAccountsConsent.f72780a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountsConsent[i];
            }
        }

        private LinkedAccountsConsent() {
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

    private FacadeOpenBankingConsentsFlowContract$Step() {
    }
}
