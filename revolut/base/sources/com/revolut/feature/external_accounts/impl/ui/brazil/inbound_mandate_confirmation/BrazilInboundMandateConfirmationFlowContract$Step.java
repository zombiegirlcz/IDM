package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.ConsentLimitInputTrackableContext;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "MandatePreview", "InstitutionInfo", "LimitUpdate", "ExpiryDateUpdate", "SteeringInfoSheet", "SteeringChangeBank", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$ExpiryDateUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$InstitutionInfo;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$LimitUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$MandatePreview;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$SteeringChangeBank;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$SteeringInfoSheet;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BrazilInboundMandateConfirmationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$ExpiryDateUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpiryDateUpdate implements BrazilInboundMandateConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExpiryDateUpdate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f72571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f72572c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExpiryDateUpdate(parcel.readString(), (LocalDate) parcel.readSerializable(), (Clause) parcel.readParcelable(ExpiryDateUpdate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpiryDateUpdate[i];
            }
        }

        public ExpiryDateUpdate(String fieldId, LocalDate localDate, Clause title) {
            Intrinsics.checkNotNullParameter(fieldId, "fieldId");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f72570a = fieldId;
            this.f72571b = localDate;
            this.f72572c = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExpiryDateUpdate)) {
                return false;
            }
            ExpiryDateUpdate expiryDateUpdate = (ExpiryDateUpdate) obj2;
            return Intrinsics.f(this.f72570a, expiryDateUpdate.f72570a) && Intrinsics.f(this.f72571b, expiryDateUpdate.f72571b) && Intrinsics.f(this.f72572c, expiryDateUpdate.f72572c);
        }

        public final int hashCode() {
            int iHashCode = this.f72570a.hashCode() * 31;
            LocalDate localDate = this.f72571b;
            return this.f72572c.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72570a);
            dest.writeSerializable(this.f72571b);
            dest.writeParcelable(this.f72572c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$InstitutionInfo;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstitutionInfo implements BrazilInboundMandateConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstitutionInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72573a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstitutionInfo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionInfo[i];
            }
        }

        public InstitutionInfo(String institutionId) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            this.f72573a = institutionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstitutionInfo) && Intrinsics.f(this.f72573a, ((InstitutionInfo) obj2).f72573a);
        }

        public final int hashCode() {
            return this.f72573a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72573a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$LimitUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitUpdate implements BrazilInboundMandateConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LimitUpdate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LimitConfig f72575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConsentLimitInputTrackableContext f72576c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitUpdate(parcel.readString(), (LimitConfig) parcel.readParcelable(LimitUpdate.class.getClassLoader()), (ConsentLimitInputTrackableContext) parcel.readParcelable(LimitUpdate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitUpdate[i];
            }
        }

        public LimitUpdate(String fieldId, LimitConfig limitConfig, ConsentLimitInputTrackableContext trackableContext) {
            Intrinsics.checkNotNullParameter(fieldId, "fieldId");
            Intrinsics.checkNotNullParameter(limitConfig, "limitConfig");
            Intrinsics.checkNotNullParameter(trackableContext, "trackableContext");
            this.f72574a = fieldId;
            this.f72575b = limitConfig;
            this.f72576c = trackableContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitUpdate)) {
                return false;
            }
            LimitUpdate limitUpdate = (LimitUpdate) obj2;
            return Intrinsics.f(this.f72574a, limitUpdate.f72574a) && Intrinsics.f(this.f72575b, limitUpdate.f72575b) && Intrinsics.f(this.f72576c, limitUpdate.f72576c);
        }

        public final int hashCode() {
            return this.f72576c.hashCode() + ((this.f72575b.hashCode() + (this.f72574a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72574a);
            dest.writeParcelable(this.f72575b, i);
            dest.writeParcelable(this.f72576c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$MandatePreview;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MandatePreview implements BrazilInboundMandateConfirmationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MandatePreview f72577a = new MandatePreview();

        @NotNull
        public static final Parcelable.Creator<MandatePreview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MandatePreview.f72577a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MandatePreview[i];
            }
        }

        private MandatePreview() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$SteeringChangeBank;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SteeringChangeBank implements BrazilInboundMandateConfirmationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SteeringChangeBank f72578a = new SteeringChangeBank();

        @NotNull
        public static final Parcelable.Creator<SteeringChangeBank> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SteeringChangeBank.f72578a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SteeringChangeBank[i];
            }
        }

        private SteeringChangeBank() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step$SteeringInfoSheet;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_mandate_confirmation/BrazilInboundMandateConfirmationFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SteeringInfoSheet implements BrazilInboundMandateConfirmationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SteeringInfoSheet f72579a = new SteeringInfoSheet();

        @NotNull
        public static final Parcelable.Creator<SteeringInfoSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SteeringInfoSheet.f72579a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SteeringInfoSheet[i];
            }
        }

        private SteeringInfoSheet() {
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
