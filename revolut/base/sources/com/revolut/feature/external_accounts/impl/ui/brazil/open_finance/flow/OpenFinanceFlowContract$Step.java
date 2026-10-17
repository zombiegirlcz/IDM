package com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.ConsentLimitInputTrackableContext;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og6.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OpenFinance", "Consents", "LinkedAccounts", "ConsentDetails", "RevokeDialog", "LimitUpdate", "ExpiryDateUpdate", "InboundConsentDetails", "EditAlias", "InboundRevokeDialog", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$ConsentDetails;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$Consents;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$EditAlias;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$ExpiryDateUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$InboundConsentDetails;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$InboundRevokeDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$LimitUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$LinkedAccounts;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$OpenFinance;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$RevokeDialog;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OpenFinanceFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$ConsentDetails;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentDetails extends OpenFinanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConsentDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72661c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsentDetails(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentDetails[i];
            }
        }

        public ConsentDetails(String consentId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f72659a = consentId;
            this.f72660b = z;
            this.f72661c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConsentDetails)) {
                return false;
            }
            ConsentDetails consentDetails = (ConsentDetails) obj2;
            return Intrinsics.f(this.f72659a, consentDetails.f72659a) && this.f72660b == consentDetails.f72660b && this.f72661c == consentDetails.f72661c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72661c) + j6.a.c(this.f72659a.hashCode() * 31, 31, this.f72660b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72659a);
            dest.writeInt(this.f72660b ? 1 : 0);
            dest.writeInt(this.f72661c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$Consents;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Consents extends OpenFinanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Consents> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f72663b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Consents(parcel.readString(), i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consents[i];
            }
        }

        public Consents(String thirdPartyTitle, i consentType) {
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            Intrinsics.checkNotNullParameter(consentType, "consentType");
            this.f72662a = thirdPartyTitle;
            this.f72663b = consentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Consents)) {
                return false;
            }
            Consents consents = (Consents) obj2;
            return Intrinsics.f(this.f72662a, consents.f72662a) && this.f72663b == consents.f72663b;
        }

        public final int hashCode() {
            return this.f72663b.hashCode() + (this.f72662a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72662a);
            dest.writeString(this.f72663b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$EditAlias;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditAlias extends OpenFinanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditAlias> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72665b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditAlias(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditAlias[i];
            }
        }

        public EditAlias(String consentId, String alias) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            Intrinsics.checkNotNullParameter(alias, "alias");
            this.f72664a = consentId;
            this.f72665b = alias;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditAlias)) {
                return false;
            }
            EditAlias editAlias = (EditAlias) obj2;
            return Intrinsics.f(this.f72664a, editAlias.f72664a) && Intrinsics.f(this.f72665b, editAlias.f72665b);
        }

        public final int hashCode() {
            return this.f72665b.hashCode() + (this.f72664a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72664a);
            dest.writeString(this.f72665b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$ExpiryDateUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpiryDateUpdate extends OpenFinanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExpiryDateUpdate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OpenBankingBrazilPayment.EditableDateField f72668c;
        public final ArrayList d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int iA = 0;
                boolean z = parcel.readInt() != 0;
                OpenBankingBrazilPayment.EditableDateField editableDateFieldCreateFromParcel = OpenBankingBrazilPayment.EditableDateField.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(OpenBankingBrazilPayment.EditableMoneyField.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ExpiryDateUpdate(string, z, editableDateFieldCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpiryDateUpdate[i];
            }
        }

        public ExpiryDateUpdate(String consentId, boolean z, OpenBankingBrazilPayment.EditableDateField editableDateField, ArrayList allMoneyFields) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            Intrinsics.checkNotNullParameter(editableDateField, "editableDateField");
            Intrinsics.checkNotNullParameter(allMoneyFields, "allMoneyFields");
            this.f72666a = consentId;
            this.f72667b = z;
            this.f72668c = editableDateField;
            this.d = allMoneyFields;
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
            return Intrinsics.f(this.f72666a, expiryDateUpdate.f72666a) && this.f72667b == expiryDateUpdate.f72667b && Intrinsics.f(this.f72668c, expiryDateUpdate.f72668c) && this.d.equals(expiryDateUpdate.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f72668c.hashCode() + j6.a.c(this.f72666a.hashCode() * 31, 31, this.f72667b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72666a);
            dest.writeInt(this.f72667b ? 1 : 0);
            this.f72668c.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                ((OpenBankingBrazilPayment.EditableMoneyField) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$InboundConsentDetails;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InboundConsentDetails extends OpenFinanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InboundConsentDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72670b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InboundConsentDetails(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InboundConsentDetails[i];
            }
        }

        public InboundConsentDetails(String consentId, boolean z) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f72669a = consentId;
            this.f72670b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InboundConsentDetails)) {
                return false;
            }
            InboundConsentDetails inboundConsentDetails = (InboundConsentDetails) obj2;
            return Intrinsics.f(this.f72669a, inboundConsentDetails.f72669a) && this.f72670b == inboundConsentDetails.f72670b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72670b) + (this.f72669a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72669a);
            dest.writeInt(this.f72670b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$InboundRevokeDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InboundRevokeDialog extends OpenFinanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InboundRevokeDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72673c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InboundRevokeDialog(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InboundRevokeDialog[i];
            }
        }

        public InboundRevokeDialog(String thirdPartyTitle, String consentId, boolean z) {
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f72671a = thirdPartyTitle;
            this.f72672b = consentId;
            this.f72673c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InboundRevokeDialog)) {
                return false;
            }
            InboundRevokeDialog inboundRevokeDialog = (InboundRevokeDialog) obj2;
            return Intrinsics.f(this.f72671a, inboundRevokeDialog.f72671a) && Intrinsics.f(this.f72672b, inboundRevokeDialog.f72672b) && this.f72673c == inboundRevokeDialog.f72673c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72673c) + p.a.c(this.f72671a.hashCode() * 31, 31, this.f72672b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72671a);
            dest.writeString(this.f72672b);
            dest.writeInt(this.f72673c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$LimitUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitUpdate extends OpenFinanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LimitUpdate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LimitConfig f72676c;
        public final boolean d;
        public final ArrayList e;
        public final OpenBankingBrazilPayment.EditableDateField f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ConsentLimitInputTrackableContext f72677g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int iA;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                LimitConfig limitConfig = (LimitConfig) parcel.readParcelable(LimitUpdate.class.getClassLoader());
                boolean z = false;
                if (parcel.readInt() != 0) {
                    iA = 0;
                    z = true;
                } else {
                    iA = 0;
                }
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(OpenBankingBrazilPayment.EditableMoneyField.CREATOR, parcel, arrayList, iA, 1);
                }
                return new LimitUpdate(string, string2, limitConfig, z, arrayList, parcel.readInt() == 0 ? null : OpenBankingBrazilPayment.EditableDateField.CREATOR.createFromParcel(parcel), (ConsentLimitInputTrackableContext) parcel.readParcelable(LimitUpdate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitUpdate[i];
            }
        }

        public LimitUpdate(String consentId, String fieldId, LimitConfig limitConfig, boolean z, ArrayList allMoneyFields, OpenBankingBrazilPayment.EditableDateField editableDateField, ConsentLimitInputTrackableContext trackableContext) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            Intrinsics.checkNotNullParameter(fieldId, "fieldId");
            Intrinsics.checkNotNullParameter(limitConfig, "limitConfig");
            Intrinsics.checkNotNullParameter(allMoneyFields, "allMoneyFields");
            Intrinsics.checkNotNullParameter(trackableContext, "trackableContext");
            this.f72674a = consentId;
            this.f72675b = fieldId;
            this.f72676c = limitConfig;
            this.d = z;
            this.e = allMoneyFields;
            this.f = editableDateField;
            this.f72677g = trackableContext;
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
            return Intrinsics.f(this.f72674a, limitUpdate.f72674a) && Intrinsics.f(this.f72675b, limitUpdate.f72675b) && Intrinsics.f(this.f72676c, limitUpdate.f72676c) && this.d == limitUpdate.d && this.e.equals(limitUpdate.e) && Intrinsics.f(this.f, limitUpdate.f) && Intrinsics.f(this.f72677g, limitUpdate.f72677g);
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, j6.a.c((this.f72676c.hashCode() + p.a.c(this.f72674a.hashCode() * 31, 31, this.f72675b)) * 31, 31, this.d), 31);
            OpenBankingBrazilPayment.EditableDateField editableDateField = this.f;
            return this.f72677g.hashCode() + ((iB + (editableDateField == null ? 0 : editableDateField.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72674a);
            dest.writeString(this.f72675b);
            dest.writeParcelable(this.f72676c, i);
            dest.writeInt(this.d ? 1 : 0);
            Iterator itY = j6.a.y(this.e, dest);
            while (itY.hasNext()) {
                ((OpenBankingBrazilPayment.EditableMoneyField) itY.next()).writeToParcel(dest, i);
            }
            OpenBankingBrazilPayment.EditableDateField editableDateField = this.f;
            if (editableDateField == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                editableDateField.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f72677g, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$LinkedAccounts;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccounts extends OpenFinanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkedAccounts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72678a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccounts(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccounts[i];
            }
        }

        public LinkedAccounts(String thirdPartyTitle) {
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            this.f72678a = thirdPartyTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkedAccounts) && Intrinsics.f(this.f72678a, ((LinkedAccounts) obj2).f72678a);
        }

        public final int hashCode() {
            return this.f72678a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72678a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$OpenFinance;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OpenFinance extends OpenFinanceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenFinance f72679a = new OpenFinance();

        @NotNull
        public static final Parcelable.Creator<OpenFinance> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OpenFinance.f72679a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenFinance[i];
            }
        }

        private OpenFinance() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step$RevokeDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/flow/OpenFinanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevokeDialog extends OpenFinanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RevokeDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72682c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevokeDialog(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevokeDialog[i];
            }
        }

        public RevokeDialog(String thirdPartyTitle, String consentId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f72680a = thirdPartyTitle;
            this.f72681b = consentId;
            this.f72682c = z;
            this.d = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevokeDialog)) {
                return false;
            }
            RevokeDialog revokeDialog = (RevokeDialog) obj2;
            return Intrinsics.f(this.f72680a, revokeDialog.f72680a) && Intrinsics.f(this.f72681b, revokeDialog.f72681b) && this.f72682c == revokeDialog.f72682c && this.d == revokeDialog.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f72680a.hashCode() * 31, 31, this.f72681b), 31, this.f72682c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72680a);
            dest.writeString(this.f72681b);
            dest.writeInt(this.f72682c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    private OpenFinanceFlowContract$Step() {
    }
}
