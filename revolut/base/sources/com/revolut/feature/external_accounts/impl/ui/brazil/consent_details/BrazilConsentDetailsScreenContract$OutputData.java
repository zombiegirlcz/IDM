package com.revolut.feature.external_accounts.impl.ui.brazil.consent_details;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "Revoke", "LimitUpdate", "ExpiryDateUpdate", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreenContract$OutputData$ExpiryDateUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreenContract$OutputData$LimitUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreenContract$OutputData$Revoke;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrazilConsentDetailsScreenContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreenContract$OutputData$ExpiryDateUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpiryDateUpdate extends BrazilConsentDetailsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<ExpiryDateUpdate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OpenBankingBrazilPayment.EditableDateField f72543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f72544b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OpenBankingBrazilPayment.EditableDateField editableDateFieldCreateFromParcel = OpenBankingBrazilPayment.EditableDateField.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(OpenBankingBrazilPayment.EditableMoneyField.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ExpiryDateUpdate(editableDateFieldCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpiryDateUpdate[i];
            }
        }

        public ExpiryDateUpdate(OpenBankingBrazilPayment.EditableDateField editableDateField, ArrayList allMoneyFields) {
            Intrinsics.checkNotNullParameter(editableDateField, "editableDateField");
            Intrinsics.checkNotNullParameter(allMoneyFields, "allMoneyFields");
            this.f72543a = editableDateField;
            this.f72544b = allMoneyFields;
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
            return Intrinsics.f(this.f72543a, expiryDateUpdate.f72543a) && this.f72544b.equals(expiryDateUpdate.f72544b);
        }

        public final int hashCode() {
            return this.f72544b.hashCode() + (this.f72543a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f72543a.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.f72544b, dest);
            while (itY.hasNext()) {
                ((OpenBankingBrazilPayment.EditableMoneyField) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreenContract$OutputData$LimitUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitUpdate extends BrazilConsentDetailsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<LimitUpdate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LimitConfig f72546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f72547c;
        public final OpenBankingBrazilPayment.EditableDateField d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                LimitConfig limitConfig = (LimitConfig) parcel.readParcelable(LimitUpdate.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(OpenBankingBrazilPayment.EditableMoneyField.CREATOR, parcel, arrayList, iA, 1);
                }
                return new LimitUpdate(string, limitConfig, arrayList, parcel.readInt() == 0 ? null : OpenBankingBrazilPayment.EditableDateField.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitUpdate[i];
            }
        }

        public LimitUpdate(String fieldId, LimitConfig limitConfig, ArrayList allMoneyFields, OpenBankingBrazilPayment.EditableDateField editableDateField) {
            Intrinsics.checkNotNullParameter(fieldId, "fieldId");
            Intrinsics.checkNotNullParameter(limitConfig, "limitConfig");
            Intrinsics.checkNotNullParameter(allMoneyFields, "allMoneyFields");
            this.f72545a = fieldId;
            this.f72546b = limitConfig;
            this.f72547c = allMoneyFields;
            this.d = editableDateField;
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
            return Intrinsics.f(this.f72545a, limitUpdate.f72545a) && Intrinsics.f(this.f72546b, limitUpdate.f72546b) && this.f72547c.equals(limitUpdate.f72547c) && Intrinsics.f(this.d, limitUpdate.d);
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f72547c, (this.f72546b.hashCode() + (this.f72545a.hashCode() * 31)) * 31, 31);
            OpenBankingBrazilPayment.EditableDateField editableDateField = this.d;
            return iB + (editableDateField == null ? 0 : editableDateField.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72545a);
            dest.writeParcelable(this.f72546b, i);
            Iterator itY = j6.a.y(this.f72547c, dest);
            while (itY.hasNext()) {
                ((OpenBankingBrazilPayment.EditableMoneyField) itY.next()).writeToParcel(dest, i);
            }
            OpenBankingBrazilPayment.EditableDateField editableDateField = this.d;
            if (editableDateField == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                editableDateField.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreenContract$OutputData$Revoke;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consent_details/BrazilConsentDetailsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Revoke extends BrazilConsentDetailsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<Revoke> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72549b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Revoke(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Revoke[i];
            }
        }

        public Revoke(String consentId, String thirdPartyTitle) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            this.f72548a = consentId;
            this.f72549b = thirdPartyTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Revoke)) {
                return false;
            }
            Revoke revoke = (Revoke) obj2;
            return Intrinsics.f(this.f72548a, revoke.f72548a) && Intrinsics.f(this.f72549b, revoke.f72549b);
        }

        public final int hashCode() {
            return this.f72549b.hashCode() + (this.f72548a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72548a);
            dest.writeString(this.f72549b);
        }
    }

    private BrazilConsentDetailsScreenContract$OutputData() {
    }
}
