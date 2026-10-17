package com.revolut.shared.feature.workflow.engine.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Redirect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ril.e;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0014\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Landroid/os/Parcelable;", "ril/e", "Mobywatel", "WebId", "Diia", "MyInfo", "Cmd", "IdnowVideoIdent", "IdnowEid", "HypervergeGovAuth", "HypervergeVideoConference", "Dap", "DapQes", "EgovKyc", "TrustdockSdk", "Itsme", "IdAustria", "BankId", "TrustdockWeb", "Idura", "Fourthline", "UaePass", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$BankId;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Cmd;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Dap;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$DapQes;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Diia;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$EgovKyc;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Fourthline;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$HypervergeGovAuth;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$HypervergeVideoConference;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$IdAustria;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$IdnowEid;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$IdnowVideoIdent;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Idura;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Itsme;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Mobywatel;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$MyInfo;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$TrustdockSdk;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$TrustdockWeb;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$UaePass;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$WebId;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SdkVendorInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$BankId;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankId implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<BankId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105463b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankId(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankId[i];
            }
        }

        public BankId(String checkId, String portalUrl) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            this.f105462a = checkId;
            this.f105463b = portalUrl;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105462a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BankId)) {
                return false;
            }
            BankId bankId = (BankId) obj2;
            return Intrinsics.f(this.f105462a, bankId.f105462a) && Intrinsics.f(this.f105463b, bankId.f105463b);
        }

        public final int hashCode() {
            return this.f105463b.hashCode() + (this.f105462a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105462a);
            dest.writeString(this.f105463b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Cmd;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cmd implements SdkVendorInfo {

        @NotNull
        public static final Parcelable.Creator<Cmd> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105464a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cmd(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cmd[i];
            }
        }

        public Cmd(String portalUrl) {
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            this.f105464a = portalUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cmd) && Intrinsics.f(this.f105464a, ((Cmd) obj2).f105464a);
        }

        public final int hashCode() {
            return this.f105464a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105464a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Dap;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dap implements SdkVendorInfo {

        @NotNull
        public static final Parcelable.Creator<Dap> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105465a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dap(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dap[i];
            }
        }

        public Dap(String dapAppUri) {
            Intrinsics.checkNotNullParameter(dapAppUri, "dapAppUri");
            this.f105465a = dapAppUri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Dap) && Intrinsics.f(this.f105465a, ((Dap) obj2).f105465a);
        }

        public final int hashCode() {
            return this.f105465a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105465a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$DapQes;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DapQes implements SdkVendorInfo {

        @NotNull
        public static final Parcelable.Creator<DapQes> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105466a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DapQes(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DapQes[i];
            }
        }

        public DapQes(String dapAppUri) {
            Intrinsics.checkNotNullParameter(dapAppUri, "dapAppUri");
            this.f105466a = dapAppUri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DapQes) && Intrinsics.f(this.f105466a, ((DapQes) obj2).f105466a);
        }

        public final int hashCode() {
            return this.f105466a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105466a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Diia;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Diia implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<Diia> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105469c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Diia(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Diia[i];
            }
        }

        public Diia(String checkId, String portalUrl, String str) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            this.f105467a = checkId;
            this.f105468b = portalUrl;
            this.f105469c = str;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105467a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Diia)) {
                return false;
            }
            Diia diia = (Diia) obj2;
            return Intrinsics.f(this.f105467a, diia.f105467a) && Intrinsics.f(this.f105468b, diia.f105468b) && Intrinsics.f(this.f105469c, diia.f105469c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f105467a.hashCode() * 31, 31, this.f105468b);
            String str = this.f105469c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105467a);
            dest.writeString(this.f105468b);
            dest.writeString(this.f105469c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$EgovKyc;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EgovKyc implements SdkVendorInfo {

        @NotNull
        public static final Parcelable.Creator<EgovKyc> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f105471b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Redirect.CREATOR, parcel, arrayList, iA, 1);
                }
                return new EgovKyc(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EgovKyc[i];
            }
        }

        public EgovKyc(String portalUrl, List redirects) {
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            Intrinsics.checkNotNullParameter(redirects, "redirects");
            this.f105470a = portalUrl;
            this.f105471b = redirects;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EgovKyc)) {
                return false;
            }
            EgovKyc egovKyc = (EgovKyc) obj2;
            return Intrinsics.f(this.f105470a, egovKyc.f105470a) && Intrinsics.f(this.f105471b, egovKyc.f105471b);
        }

        public final int hashCode() {
            return this.f105471b.hashCode() + (this.f105470a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105470a);
            Iterator itV = p.a.v(this.f105471b, dest);
            while (itV.hasNext()) {
                ((Redirect) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Fourthline;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Fourthline implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<Fourthline> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DocType f105474c;
        public final b d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fourthline((DocType) parcel.readParcelable(Fourthline.class.getClassLoader()), parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fourthline[i];
            }
        }

        public Fourthline(DocType documentType, String checkId, String validationCode, b issuingCountry) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(validationCode, "validationCode");
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
            this.f105472a = checkId;
            this.f105473b = validationCode;
            this.f105474c = documentType;
            this.d = issuingCountry;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105472a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Fourthline)) {
                return false;
            }
            Fourthline fourthline = (Fourthline) obj2;
            return Intrinsics.f(this.f105472a, fourthline.f105472a) && Intrinsics.f(this.f105473b, fourthline.f105473b) && Intrinsics.f(this.f105474c, fourthline.f105474c) && Intrinsics.f(this.d, fourthline.d);
        }

        public final int hashCode() {
            return this.d.f297794a.hashCode() + p.a.c(p.a.c(this.f105472a.hashCode() * 31, 31, this.f105473b), 31, this.f105474c.f77926a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105472a);
            dest.writeString(this.f105473b);
            dest.writeParcelable(this.f105474c, i);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$HypervergeGovAuth;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HypervergeGovAuth implements SdkVendorInfo, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f105477c;

        @NotNull
        public static final Parcelable.Creator<HypervergeGovAuth> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Redirect.CREATOR, parcel, arrayList, iA, 1);
                }
                return new HypervergeGovAuth(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HypervergeGovAuth[i];
            }
        }

        public HypervergeGovAuth(String checkId, String portalUrl, List redirects) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            Intrinsics.checkNotNullParameter(redirects, "redirects");
            this.f105475a = checkId;
            this.f105476b = portalUrl;
            this.f105477c = redirects;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105475a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HypervergeGovAuth)) {
                return false;
            }
            HypervergeGovAuth hypervergeGovAuth = (HypervergeGovAuth) obj2;
            return Intrinsics.f(this.f105475a, hypervergeGovAuth.f105475a) && Intrinsics.f(this.f105476b, hypervergeGovAuth.f105476b) && Intrinsics.f(this.f105477c, hypervergeGovAuth.f105477c);
        }

        public final int hashCode() {
            return this.f105477c.hashCode() + p.a.c(this.f105475a.hashCode() * 31, 31, this.f105476b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105475a);
            dest.writeString(this.f105476b);
            Iterator itV = p.a.v(this.f105477c, dest);
            while (itV.hasNext()) {
                ((Redirect) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$HypervergeVideoConference;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HypervergeVideoConference implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<HypervergeVideoConference> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f105480c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Redirect.CREATOR, parcel, arrayList, iA, 1);
                }
                return new HypervergeVideoConference(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HypervergeVideoConference[i];
            }
        }

        public HypervergeVideoConference(String checkId, String portalUrl, List redirects) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            Intrinsics.checkNotNullParameter(redirects, "redirects");
            this.f105478a = checkId;
            this.f105479b = portalUrl;
            this.f105480c = redirects;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105478a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HypervergeVideoConference)) {
                return false;
            }
            HypervergeVideoConference hypervergeVideoConference = (HypervergeVideoConference) obj2;
            return Intrinsics.f(this.f105478a, hypervergeVideoConference.f105478a) && Intrinsics.f(this.f105479b, hypervergeVideoConference.f105479b) && Intrinsics.f(this.f105480c, hypervergeVideoConference.f105480c);
        }

        public final int hashCode() {
            return this.f105480c.hashCode() + p.a.c(this.f105478a.hashCode() * 31, 31, this.f105479b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105478a);
            dest.writeString(this.f105479b);
            Iterator itV = p.a.v(this.f105480c, dest);
            while (itV.hasNext()) {
                ((Redirect) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$IdAustria;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdAustria implements SdkVendorInfo {

        @NotNull
        public static final Parcelable.Creator<IdAustria> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105481a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdAustria(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdAustria[i];
            }
        }

        public IdAustria(String portalUrl) {
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            this.f105481a = portalUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IdAustria) && Intrinsics.f(this.f105481a, ((IdAustria) obj2).f105481a);
        }

        public final int hashCode() {
            return this.f105481a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105481a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$IdnowEid;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdnowEid implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<IdnowEid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105483b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdnowEid(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdnowEid[i];
            }
        }

        public IdnowEid(String checkId, String token) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(token, "token");
            this.f105482a = checkId;
            this.f105483b = token;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105482a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IdnowEid)) {
                return false;
            }
            IdnowEid idnowEid = (IdnowEid) obj2;
            return Intrinsics.f(this.f105482a, idnowEid.f105482a) && Intrinsics.f(this.f105483b, idnowEid.f105483b);
        }

        public final int hashCode() {
            return this.f105483b.hashCode() + (this.f105482a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105482a);
            dest.writeString(this.f105483b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$IdnowVideoIdent;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdnowVideoIdent implements SdkVendorInfo, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f105486c;

        @NotNull
        public static final Parcelable.Creator<IdnowVideoIdent> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Redirect.CREATOR, parcel, arrayList, iA, 1);
                }
                return new IdnowVideoIdent(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdnowVideoIdent[i];
            }
        }

        public IdnowVideoIdent(String checkId, String portalUrl, List redirects) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            Intrinsics.checkNotNullParameter(redirects, "redirects");
            this.f105484a = checkId;
            this.f105485b = portalUrl;
            this.f105486c = redirects;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105484a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IdnowVideoIdent)) {
                return false;
            }
            IdnowVideoIdent idnowVideoIdent = (IdnowVideoIdent) obj2;
            return Intrinsics.f(this.f105484a, idnowVideoIdent.f105484a) && Intrinsics.f(this.f105485b, idnowVideoIdent.f105485b) && Intrinsics.f(this.f105486c, idnowVideoIdent.f105486c);
        }

        public final int hashCode() {
            return this.f105486c.hashCode() + p.a.c(this.f105484a.hashCode() * 31, 31, this.f105485b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105484a);
            dest.writeString(this.f105485b);
            Iterator itV = p.a.v(this.f105486c, dest);
            while (itV.hasNext()) {
                ((Redirect) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Idura;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Idura implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<Idura> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105488b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Idura(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Idura[i];
            }
        }

        public Idura(String checkId, String portalUrl) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            this.f105487a = checkId;
            this.f105488b = portalUrl;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105487a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Idura)) {
                return false;
            }
            Idura idura = (Idura) obj2;
            return Intrinsics.f(this.f105487a, idura.f105487a) && Intrinsics.f(this.f105488b, idura.f105488b);
        }

        public final int hashCode() {
            return this.f105488b.hashCode() + (this.f105487a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105487a);
            dest.writeString(this.f105488b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Itsme;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Itsme implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<Itsme> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105490b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Itsme(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Itsme[i];
            }
        }

        public Itsme(String checkId, String portalUrl) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            this.f105489a = checkId;
            this.f105490b = portalUrl;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105489a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Itsme)) {
                return false;
            }
            Itsme itsme = (Itsme) obj2;
            return Intrinsics.f(this.f105489a, itsme.f105489a) && Intrinsics.f(this.f105490b, itsme.f105490b);
        }

        public final int hashCode() {
            return this.f105490b.hashCode() + (this.f105489a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105489a);
            dest.writeString(this.f105490b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$Mobywatel;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Mobywatel implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<Mobywatel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105492b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Mobywatel(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Mobywatel[i];
            }
        }

        public Mobywatel(String checkId, String redirectUrl) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            this.f105491a = checkId;
            this.f105492b = redirectUrl;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105491a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Mobywatel)) {
                return false;
            }
            Mobywatel mobywatel = (Mobywatel) obj2;
            return Intrinsics.f(this.f105491a, mobywatel.f105491a) && Intrinsics.f(this.f105492b, mobywatel.f105492b);
        }

        public final int hashCode() {
            return this.f105492b.hashCode() + (this.f105491a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105491a);
            dest.writeString(this.f105492b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$MyInfo;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MyInfo implements SdkVendorInfo, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105494b;

        @NotNull
        public static final Parcelable.Creator<MyInfo> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MyInfo(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MyInfo[i];
            }
        }

        public MyInfo(String checkId, String portalUrl) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            this.f105493a = checkId;
            this.f105494b = portalUrl;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105493a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MyInfo)) {
                return false;
            }
            MyInfo myInfo = (MyInfo) obj2;
            return Intrinsics.f(this.f105493a, myInfo.f105493a) && Intrinsics.f(this.f105494b, myInfo.f105494b);
        }

        public final int hashCode() {
            return this.f105494b.hashCode() + (this.f105493a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105493a);
            dest.writeString(this.f105494b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$TrustdockSdk;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrustdockSdk implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<TrustdockSdk> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105497c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TrustdockSdk(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrustdockSdk[i];
            }
        }

        public TrustdockSdk(String checkId, String packageId, String projectId) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(packageId, "packageId");
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f105495a = checkId;
            this.f105496b = packageId;
            this.f105497c = projectId;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105495a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TrustdockSdk)) {
                return false;
            }
            TrustdockSdk trustdockSdk = (TrustdockSdk) obj2;
            return Intrinsics.f(this.f105495a, trustdockSdk.f105495a) && Intrinsics.f(this.f105496b, trustdockSdk.f105496b) && Intrinsics.f(this.f105497c, trustdockSdk.f105497c);
        }

        public final int hashCode() {
            return this.f105497c.hashCode() + p.a.c(this.f105495a.hashCode() * 31, 31, this.f105496b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105495a);
            dest.writeString(this.f105496b);
            dest.writeString(this.f105497c);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$TrustdockWeb;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrustdockWeb implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<TrustdockWeb> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105499b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TrustdockWeb(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrustdockWeb[i];
            }
        }

        public TrustdockWeb(String checkId, String portalUrl) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
            this.f105498a = checkId;
            this.f105499b = portalUrl;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105498a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TrustdockWeb)) {
                return false;
            }
            TrustdockWeb trustdockWeb = (TrustdockWeb) obj2;
            return Intrinsics.f(this.f105498a, trustdockWeb.f105498a) && Intrinsics.f(this.f105499b, trustdockWeb.f105499b);
        }

        public final int hashCode() {
            return this.f105499b.hashCode() + (this.f105498a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105498a);
            dest.writeString(this.f105499b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$UaePass;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UaePass implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<UaePass> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f105502c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Redirect.CREATOR, parcel, arrayList, iA, 1);
                }
                return new UaePass(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UaePass[i];
            }
        }

        public UaePass(String checkId, String authUrl, List redirects) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(authUrl, "authUrl");
            Intrinsics.checkNotNullParameter(redirects, "redirects");
            this.f105500a = checkId;
            this.f105501b = authUrl;
            this.f105502c = redirects;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105500a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UaePass)) {
                return false;
            }
            UaePass uaePass = (UaePass) obj2;
            return Intrinsics.f(this.f105500a, uaePass.f105500a) && Intrinsics.f(this.f105501b, uaePass.f105501b) && Intrinsics.f(this.f105502c, uaePass.f105502c);
        }

        public final int hashCode() {
            return this.f105502c.hashCode() + p.a.c(this.f105500a.hashCode() * 31, 31, this.f105501b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105500a);
            dest.writeString(this.f105501b);
            Iterator itV = p.a.v(this.f105502c, dest);
            while (itV.hasNext()) {
                ((Redirect) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo$WebId;", "Lcom/revolut/shared/feature/workflow/engine/api/models/SdkVendorInfo;", "Lril/e;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WebId implements SdkVendorInfo, e {

        @NotNull
        public static final Parcelable.Creator<WebId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105504b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WebId(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WebId[i];
            }
        }

        public WebId(String checkId, String webPortalUrl) {
            Intrinsics.checkNotNullParameter(checkId, "checkId");
            Intrinsics.checkNotNullParameter(webPortalUrl, "webPortalUrl");
            this.f105503a = checkId;
            this.f105504b = webPortalUrl;
        }

        @Override // ril.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105503a() {
            return this.f105503a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WebId)) {
                return false;
            }
            WebId webId = (WebId) obj2;
            return Intrinsics.f(this.f105503a, webId.f105503a) && Intrinsics.f(this.f105504b, webId.f105504b);
        }

        public final int hashCode() {
            return this.f105504b.hashCode() + (this.f105503a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105503a);
            dest.writeString(this.f105504b);
        }
    }
}
