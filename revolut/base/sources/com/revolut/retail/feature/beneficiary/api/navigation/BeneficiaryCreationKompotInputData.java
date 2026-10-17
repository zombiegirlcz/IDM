package com.revolut.retail.feature.beneficiary.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.shared.beneficiary.api.navigation.BeneficiaryCreationKompotFinishMode;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType;
import ehe.n;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import u2j.d;
import wi0.b;
import zhm.a1;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "CreationConfiguration", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryCreationKompotInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BeneficiaryCreationKompotInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryCreationKompotFinishMode f99624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreationConfiguration f99625b;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration;", "Landroid/os/Parcelable;", "DefaultCreation", "LockedCountryCurrency", "MobileWallet", "PaymentVendor", "Edit", "QrScan", "CreditCardBene", "AdditionalConfig", "SuggestionBannerContext", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$CreditCardBene;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$DefaultCreation;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$Edit;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$LockedCountryCurrency;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$MobileWallet;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$PaymentVendor;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$QrScan;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class CreationConfiguration implements Parcelable {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig;", "Landroid/os/Parcelable;", "StraightToCardTransferDisabled", "HideEmail", "HideAccountTypeSelector", "HideNavBarMenu", "AttachExtractionTaskId", "AttachPaymentWidgetId", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$AttachExtractionTaskId;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$AttachPaymentWidgetId;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$HideAccountTypeSelector;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$HideEmail;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$HideNavBarMenu;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$StraightToCardTransferDisabled;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$SuggestionBannerContext;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface AdditionalConfig extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$AttachExtractionTaskId;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AttachExtractionTaskId implements AdditionalConfig {

                @NotNull
                public static final Parcelable.Creator<AttachExtractionTaskId> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f99626a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AttachExtractionTaskId(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AttachExtractionTaskId[i];
                    }
                }

                public AttachExtractionTaskId(String extractionTaskId) {
                    Intrinsics.checkNotNullParameter(extractionTaskId, "extractionTaskId");
                    this.f99626a = extractionTaskId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof AttachExtractionTaskId) && Intrinsics.f(this.f99626a, ((AttachExtractionTaskId) obj2).f99626a);
                }

                public final int hashCode() {
                    return this.f99626a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f99626a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$AttachPaymentWidgetId;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AttachPaymentWidgetId implements AdditionalConfig {

                @NotNull
                public static final Parcelable.Creator<AttachPaymentWidgetId> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f99627a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AttachPaymentWidgetId(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AttachPaymentWidgetId[i];
                    }
                }

                public AttachPaymentWidgetId(String paymentWidgetId) {
                    Intrinsics.checkNotNullParameter(paymentWidgetId, "paymentWidgetId");
                    this.f99627a = paymentWidgetId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof AttachPaymentWidgetId) && Intrinsics.f(this.f99627a, ((AttachPaymentWidgetId) obj2).f99627a);
                }

                public final int hashCode() {
                    return this.f99627a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f99627a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$HideAccountTypeSelector;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig;", "<init>", "()V", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class HideAccountTypeSelector implements AdditionalConfig {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final HideAccountTypeSelector f99628a = new HideAccountTypeSelector();

                @NotNull
                public static final Parcelable.Creator<HideAccountTypeSelector> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return HideAccountTypeSelector.f99628a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new HideAccountTypeSelector[i];
                    }
                }

                private HideAccountTypeSelector() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$HideEmail;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig;", "<init>", "()V", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class HideEmail implements AdditionalConfig {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final HideEmail f99629a = new HideEmail();

                @NotNull
                public static final Parcelable.Creator<HideEmail> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return HideEmail.f99629a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new HideEmail[i];
                    }
                }

                private HideEmail() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$HideNavBarMenu;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig;", "<init>", "()V", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class HideNavBarMenu implements AdditionalConfig {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final HideNavBarMenu f99630a = new HideNavBarMenu();

                @NotNull
                public static final Parcelable.Creator<HideNavBarMenu> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return HideNavBarMenu.f99630a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new HideNavBarMenu[i];
                    }
                }

                private HideNavBarMenu() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig$StraightToCardTransferDisabled;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig;", "<init>", "()V", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class StraightToCardTransferDisabled implements AdditionalConfig {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final StraightToCardTransferDisabled f99631a = new StraightToCardTransferDisabled();

                @NotNull
                public static final Parcelable.Creator<StraightToCardTransferDisabled> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return StraightToCardTransferDisabled.f99631a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new StraightToCardTransferDisabled[i];
                    }
                }

                private StraightToCardTransferDisabled() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$DefaultCreation;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DefaultCreation extends CreationConfiguration {

            @NotNull
            public static final Parcelable.Creator<DefaultCreation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99633a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f99634b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b f99635c;
            public final xi0.b d;
            public final Map e;
            public final d f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Set f99636g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    b bVar = (b) parcel.readSerializable();
                    xi0.b bVar2 = (xi0.b) parcel.readSerializable();
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    int iE = 0;
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(AccountFieldType.valueOf(parcel.readString()), parcel.readString());
                    }
                    d dVarValueOf = d.valueOf(parcel.readString());
                    int i3 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                    while (iE != i3) {
                        iE = com.revolut.data.database.models.openbanking.d.e(DefaultCreation.class, parcel, linkedHashSet, iE, 1);
                    }
                    return new DefaultCreation(string, string2, bVar, bVar2, linkedHashMap, dVarValueOf, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DefaultCreation[i];
                }
            }

            public DefaultCreation() {
                this(null, null, null, null, null, null, null, CertificateBody.profileType);
            }

            @Override // com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData.CreationConfiguration
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Set getF99649b() {
                return this.f99636g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DefaultCreation)) {
                    return false;
                }
                DefaultCreation defaultCreation = (DefaultCreation) obj2;
                return Intrinsics.f(this.f99633a, defaultCreation.f99633a) && Intrinsics.f(this.f99634b, defaultCreation.f99634b) && Intrinsics.f(this.f99635c, defaultCreation.f99635c) && Intrinsics.f(this.d, defaultCreation.d) && Intrinsics.f(this.e, defaultCreation.e) && this.f == defaultCreation.f && Intrinsics.f(this.f99636g, defaultCreation.f99636g);
            }

            public final int hashCode() {
                String str = this.f99633a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f99634b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                b bVar = this.f99635c;
                int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
                xi0.b bVar2 = this.d;
                return this.f99636g.hashCode() + ((this.f.hashCode() + p.a.e((iHashCode3 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31, 31, this.e)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99633a);
                dest.writeString(this.f99634b);
                dest.writeSerializable(this.f99635c);
                dest.writeSerializable(this.d);
                Iterator itZ = j6.a.z(this.e, dest);
                while (itZ.hasNext()) {
                    Map.Entry entry = (Map.Entry) itZ.next();
                    dest.writeString(((AccountFieldType) entry.getKey()).name());
                    dest.writeString((String) entry.getValue());
                }
                dest.writeString(this.f.name());
                Iterator itV = n.v(this.f99636g, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }

            public DefaultCreation(String str, String str2, b bVar, xi0.b bVar2, Map accountFieldsValues, d type, Set additionalConfiguration) {
                Intrinsics.checkNotNullParameter(accountFieldsValues, "accountFieldsValues");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
                this.f99633a = str;
                this.f99634b = str2;
                this.f99635c = bVar;
                this.d = bVar2;
                this.e = accountFieldsValues;
                this.f = type;
                this.f99636g = additionalConfiguration;
            }

            public DefaultCreation(String str, String str2, b bVar, xi0.b bVar2, Map map, d dVar, Set set, int i) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : bVar2, (i & 16) != 0 ? r0.g() : map, (i & 32) != 0 ? d.PERSONAL : dVar, (i & 64) != 0 ? h0.f322473a : set);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$Edit;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Edit extends CreationConfiguration {

            @NotNull
            public static final Parcelable.Creator<Edit> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f5j.a f99637a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Set f99638b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    f5j.a aVar = (f5j.a) parcel.readSerializable();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = com.revolut.data.database.models.openbanking.d.e(Edit.class, parcel, linkedHashSet, iE, 1);
                    }
                    return new Edit(aVar, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Edit[i];
                }
            }

            public Edit(f5j.a beneficiary, Set additionalConfiguration) {
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
                this.f99637a = beneficiary;
                this.f99638b = additionalConfiguration;
            }

            @Override // com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData.CreationConfiguration
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Set getF99649b() {
                return this.f99638b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Edit)) {
                    return false;
                }
                Edit edit = (Edit) obj2;
                return Intrinsics.f(this.f99637a, edit.f99637a) && Intrinsics.f(this.f99638b, edit.f99638b);
            }

            public final int hashCode() {
                return this.f99638b.hashCode() + (this.f99637a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f99637a);
                Iterator itV = n.v(this.f99638b, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$LockedCountryCurrency;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LockedCountryCurrency extends CreationConfiguration {

            @NotNull
            public static final Parcelable.Creator<LockedCountryCurrency> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f99639a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final xi0.b f99640b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final u2j.b f99641c;
            public final Set d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    b bVar = (b) parcel.readSerializable();
                    xi0.b bVar2 = (xi0.b) parcel.readSerializable();
                    u2j.b bVarValueOf = parcel.readInt() == 0 ? null : u2j.b.valueOf(parcel.readString());
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = com.revolut.data.database.models.openbanking.d.e(LockedCountryCurrency.class, parcel, linkedHashSet, iE, 1);
                    }
                    return new LockedCountryCurrency(bVar, bVar2, bVarValueOf, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LockedCountryCurrency[i];
                }
            }

            public LockedCountryCurrency(b country, xi0.b currency, u2j.b bVar, Set additionalConfiguration) {
                Intrinsics.checkNotNullParameter(country, "country");
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
                this.f99639a = country;
                this.f99640b = currency;
                this.f99641c = bVar;
                this.d = additionalConfiguration;
            }

            @Override // com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData.CreationConfiguration
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Set getF99649b() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof LockedCountryCurrency)) {
                    return false;
                }
                LockedCountryCurrency lockedCountryCurrency = (LockedCountryCurrency) obj2;
                return Intrinsics.f(this.f99639a, lockedCountryCurrency.f99639a) && Intrinsics.f(this.f99640b, lockedCountryCurrency.f99640b) && this.f99641c == lockedCountryCurrency.f99641c && Intrinsics.f(this.d, lockedCountryCurrency.d);
            }

            public final int hashCode() {
                int iJ = l.j(this.f99640b, this.f99639a.f297794a.hashCode() * 31, 31);
                u2j.b bVar = this.f99641c;
                return this.d.hashCode() + ((iJ + (bVar == null ? 0 : bVar.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f99639a);
                dest.writeSerializable(this.f99640b);
                u2j.b bVar = this.f99641c;
                if (bVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(bVar.name());
                }
                Iterator itV = n.v(this.d, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$MobileWallet;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MobileWallet extends CreationConfiguration {

            @NotNull
            public static final Parcelable.Creator<MobileWallet> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f99642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final xi0.b f99643b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BeneficiaryRouteType.MobileWallet f99644c;
            public final Set d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    b bVar = (b) parcel.readSerializable();
                    xi0.b bVar2 = (xi0.b) parcel.readSerializable();
                    BeneficiaryRouteType.MobileWallet mobileWalletCreateFromParcel = BeneficiaryRouteType.MobileWallet.CREATOR.createFromParcel(parcel);
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = com.revolut.data.database.models.openbanking.d.e(MobileWallet.class, parcel, linkedHashSet, iE, 1);
                    }
                    return new MobileWallet(bVar, bVar2, mobileWalletCreateFromParcel, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MobileWallet[i];
                }
            }

            public MobileWallet(b country, xi0.b currency, BeneficiaryRouteType.MobileWallet routeType, Set additionalConfiguration) {
                Intrinsics.checkNotNullParameter(country, "country");
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(routeType, "routeType");
                Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
                this.f99642a = country;
                this.f99643b = currency;
                this.f99644c = routeType;
                this.d = additionalConfiguration;
            }

            @Override // com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData.CreationConfiguration
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Set getF99649b() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof MobileWallet)) {
                    return false;
                }
                MobileWallet mobileWallet = (MobileWallet) obj2;
                return Intrinsics.f(this.f99642a, mobileWallet.f99642a) && Intrinsics.f(this.f99643b, mobileWallet.f99643b) && Intrinsics.f(this.f99644c, mobileWallet.f99644c) && Intrinsics.f(this.d, mobileWallet.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + p.a.c(l.j(this.f99643b, this.f99642a.f297794a.hashCode() * 31, 31), 31, this.f99644c.f99588a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f99642a);
                dest.writeSerializable(this.f99643b);
                this.f99644c.writeToParcel(dest, i);
                Iterator itV = n.v(this.d, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$PaymentVendor;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PaymentVendor extends CreationConfiguration {

            @NotNull
            public static final Parcelable.Creator<PaymentVendor> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f99645a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final xi0.b f99646b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BeneficiaryRouteType.PaymentVendorType f99647c;
            public final Set d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    b bVar = (b) parcel.readSerializable();
                    xi0.b bVar2 = (xi0.b) parcel.readSerializable();
                    BeneficiaryRouteType.PaymentVendorType paymentVendorTypeCreateFromParcel = BeneficiaryRouteType.PaymentVendorType.CREATOR.createFromParcel(parcel);
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = com.revolut.data.database.models.openbanking.d.e(PaymentVendor.class, parcel, linkedHashSet, iE, 1);
                    }
                    return new PaymentVendor(bVar, bVar2, paymentVendorTypeCreateFromParcel, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PaymentVendor[i];
                }
            }

            public PaymentVendor(b country, xi0.b currency, BeneficiaryRouteType.PaymentVendorType routeType, Set additionalConfiguration) {
                Intrinsics.checkNotNullParameter(country, "country");
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(routeType, "routeType");
                Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
                this.f99645a = country;
                this.f99646b = currency;
                this.f99647c = routeType;
                this.d = additionalConfiguration;
            }

            @Override // com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData.CreationConfiguration
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Set getF99649b() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PaymentVendor)) {
                    return false;
                }
                PaymentVendor paymentVendor = (PaymentVendor) obj2;
                return Intrinsics.f(this.f99645a, paymentVendor.f99645a) && Intrinsics.f(this.f99646b, paymentVendor.f99646b) && Intrinsics.f(this.f99647c, paymentVendor.f99647c) && Intrinsics.f(this.d, paymentVendor.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.f99647c.f99589a.hashCode() + l.j(this.f99646b, this.f99645a.f297794a.hashCode() * 31, 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f99645a);
                dest.writeSerializable(this.f99646b);
                this.f99647c.writeToParcel(dest, i);
                Iterator itV = n.v(this.d, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$QrScan;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class QrScan extends CreationConfiguration {

            @NotNull
            public static final Parcelable.Creator<QrScan> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f5j.a f99648a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Set f99649b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    f5j.a aVar = (f5j.a) parcel.readSerializable();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = com.revolut.data.database.models.openbanking.d.e(QrScan.class, parcel, linkedHashSet, iE, 1);
                    }
                    return new QrScan(aVar, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new QrScan[i];
                }
            }

            public QrScan(f5j.a beneficiary, Set additionalConfiguration) {
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
                this.f99648a = beneficiary;
                this.f99649b = additionalConfiguration;
            }

            @Override // com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData.CreationConfiguration
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Set getF99649b() {
                return this.f99649b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof QrScan)) {
                    return false;
                }
                QrScan qrScan = (QrScan) obj2;
                return Intrinsics.f(this.f99648a, qrScan.f99648a) && Intrinsics.f(this.f99649b, qrScan.f99649b);
            }

            public final int hashCode() {
                return this.f99649b.hashCode() + (this.f99648a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f99648a);
                Iterator itV = n.v(this.f99649b, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$SuggestionBannerContext;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$AdditionalConfig;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SuggestionBannerContext implements AdditionalConfig {

            @NotNull
            public static final Parcelable.Creator<SuggestionBannerContext> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f5j.l f99650a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SuggestionBannerContext(f5j.l.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SuggestionBannerContext[i];
                }
            }

            public SuggestionBannerContext(f5j.l context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.f99650a = context;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SuggestionBannerContext) && this.f99650a == ((SuggestionBannerContext) obj2).f99650a;
            }

            public final int hashCode() {
                return this.f99650a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99650a.name());
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract Set getF99649b();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration$CreditCardBene;", "Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationKompotInputData$CreationConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreditCardBene extends CreationConfiguration {

            @NotNull
            public static final Parcelable.Creator<CreditCardBene> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f99632a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = com.revolut.data.database.models.openbanking.d.e(CreditCardBene.class, parcel, linkedHashSet, iE, 1);
                    }
                    return new CreditCardBene(linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CreditCardBene[i];
                }
            }

            public CreditCardBene() {
                this(h0.f322473a);
            }

            @Override // com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData.CreationConfiguration
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Set getF99649b() {
                return this.f99632a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CreditCardBene) && Intrinsics.f(this.f99632a, ((CreditCardBene) obj2).f99632a);
            }

            public final int hashCode() {
                return this.f99632a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = n.v(this.f99632a, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }

            public CreditCardBene(Set additionalConfiguration) {
                Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
                a1.m(additionalConfiguration, AdditionalConfig.HideEmail.f99629a);
                this.f99632a = additionalConfiguration;
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BeneficiaryCreationKompotInputData((BeneficiaryCreationKompotFinishMode) parcel.readParcelable(BeneficiaryCreationKompotInputData.class.getClassLoader()), (CreationConfiguration) parcel.readParcelable(BeneficiaryCreationKompotInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BeneficiaryCreationKompotInputData[i];
        }
    }

    public BeneficiaryCreationKompotInputData(BeneficiaryCreationKompotFinishMode finishMode, CreationConfiguration creationConfig) {
        Intrinsics.checkNotNullParameter(finishMode, "finishMode");
        Intrinsics.checkNotNullParameter(creationConfig, "creationConfig");
        this.f99624a = finishMode;
        this.f99625b = creationConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BeneficiaryCreationKompotInputData)) {
            return false;
        }
        BeneficiaryCreationKompotInputData beneficiaryCreationKompotInputData = (BeneficiaryCreationKompotInputData) obj2;
        return Intrinsics.f(this.f99624a, beneficiaryCreationKompotInputData.f99624a) && Intrinsics.f(this.f99625b, beneficiaryCreationKompotInputData.f99625b);
    }

    public final int hashCode() {
        return this.f99625b.hashCode() + (this.f99624a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f99624a, i);
        dest.writeParcelable(this.f99625b, i);
    }
}
