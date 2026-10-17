package com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/japan/easy_bank_transfer/JapanEasyBankTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Consent", "JapanEasyBankAuthorization", "Lcom/revolut/feature/external_accounts/impl/ui/japan/easy_bank_transfer/JapanEasyBankTransferFlowContract$Step$Consent;", "Lcom/revolut/feature/external_accounts/impl/ui/japan/easy_bank_transfer/JapanEasyBankTransferFlowContract$Step$JapanEasyBankAuthorization;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JapanEasyBankTransferFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/japan/easy_bank_transfer/JapanEasyBankTransferFlowContract$Step$Consent;", "Lcom/revolut/feature/external_accounts/impl/ui/japan/easy_bank_transfer/JapanEasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Consent extends JapanEasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Consent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data f72953a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Consent((EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data) parcel.readParcelable(Consent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consent[i];
            }
        }

        public Consent(EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data preselectedInstitutionInfo) {
            Intrinsics.checkNotNullParameter(preselectedInstitutionInfo, "preselectedInstitutionInfo");
            this.f72953a = preselectedInstitutionInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Consent) && Intrinsics.f(this.f72953a, ((Consent) obj2).f72953a);
        }

        public final int hashCode() {
            return this.f72953a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72953a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/japan/easy_bank_transfer/JapanEasyBankTransferFlowContract$Step$JapanEasyBankAuthorization;", "Lcom/revolut/feature/external_accounts/impl/ui/japan/easy_bank_transfer/JapanEasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JapanEasyBankAuthorization extends JapanEasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<JapanEasyBankAuthorization> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f72956c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JapanEasyBankAuthorization(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JapanEasyBankAuthorization[i];
            }
        }

        public JapanEasyBankAuthorization(String institutionId, String str, String institutionName) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f72954a = institutionId;
            this.f72955b = str;
            this.f72956c = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JapanEasyBankAuthorization)) {
                return false;
            }
            JapanEasyBankAuthorization japanEasyBankAuthorization = (JapanEasyBankAuthorization) obj2;
            return Intrinsics.f(this.f72954a, japanEasyBankAuthorization.f72954a) && Intrinsics.f(this.f72955b, japanEasyBankAuthorization.f72955b) && Intrinsics.f(this.f72956c, japanEasyBankAuthorization.f72956c);
        }

        public final int hashCode() {
            int iHashCode = this.f72954a.hashCode() * 31;
            String str = this.f72955b;
            return this.f72956c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72954a);
            dest.writeString(this.f72955b);
            dest.writeString(this.f72956c);
        }
    }

    private JapanEasyBankTransferFlowContract$Step() {
    }
}
