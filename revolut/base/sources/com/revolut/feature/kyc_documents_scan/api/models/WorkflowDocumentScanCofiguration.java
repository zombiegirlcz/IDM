package com.revolut.feature.kyc_documents_scan.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.b0;
import my8.k;
import my8.v;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Onfido", "Vision", "Incode", "OnfidoStudio", "Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration$Incode;", "Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration$Onfido;", "Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration$OnfidoStudio;", "Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration$Vision;", "feature_kyc_documents_scan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WorkflowDocumentScanCofiguration implements FeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration$Incode;", "Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Incode extends WorkflowDocumentScanCofiguration {

        @NotNull
        public static final Parcelable.Creator<Incode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f77927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f77929c;
        public final List d;
        public final String e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVar = (b) parcel.readSerializable();
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(b0.valueOf(parcel.readString()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iA != i3) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(WorkflowKycDocPage.CREATOR, parcel, arrayList2, iA, 1);
                }
                return new Incode(bVar, string, arrayList, arrayList2, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Incode[i];
            }
        }

        public Incode(b countryCode, String token, List steps, List docPages, String str, String str2) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(steps, "steps");
            Intrinsics.checkNotNullParameter(docPages, "docPages");
            this.f77927a = countryCode;
            this.f77928b = token;
            this.f77929c = steps;
            this.d = docPages;
            this.e = str;
            this.f = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF() {
            return this.f;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getF77929c() {
            return this.f77929c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getF77928b() {
            return this.f77928b;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Incode)) {
                return false;
            }
            Incode incode = (Incode) obj2;
            return Intrinsics.f(this.f77927a, incode.f77927a) && Intrinsics.f(this.f77928b, incode.f77928b) && Intrinsics.f(this.f77929c, incode.f77929c) && Intrinsics.f(this.d, incode.d) && Intrinsics.f(this.e, incode.e) && Intrinsics.f(this.f, incode.f);
        }

        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final b getF77927a() {
            return this.f77927a;
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.d(p.a.c(this.f77927a.f297794a.hashCode() * 31, 31, this.f77928b), 31, this.f77929c), 31, this.d);
            String str = this.e;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77927a);
            dest.writeString(this.f77928b);
            Iterator itV = p.a.v(this.f77929c, dest);
            while (itV.hasNext()) {
                dest.writeString(((b0) itV.next()).name());
            }
            Iterator itV2 = p.a.v(this.d, dest);
            while (itV2.hasNext()) {
                ((WorkflowKycDocPage) itV2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration$Onfido;", "Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onfido extends WorkflowDocumentScanCofiguration {

        @NotNull
        public static final Parcelable.Creator<Onfido> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f77931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DocType f77932c;
        public final List d;
        public final b e;
        public final v f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f77933g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f77934h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(b0.valueOf(parcel.readString()));
                }
                DocType docTypeCreateFromParcel = DocType.CREATOR.createFromParcel(parcel);
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iA = 0;
                while (iA != i3) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(WorkflowKycDocPage.CREATOR, parcel, arrayList2, iA, 1);
                }
                return new Onfido(docTypeCreateFromParcel, string, parcel.readString(), arrayList, arrayList2, v.valueOf(parcel.readString()), (b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onfido[i];
            }
        }

        public Onfido(DocType docType, String applicantId, String token, List steps, List docPages, v nfcType, b countryCode, boolean z) {
            Intrinsics.checkNotNullParameter(applicantId, "applicantId");
            Intrinsics.checkNotNullParameter(steps, "steps");
            Intrinsics.checkNotNullParameter(docType, "docType");
            Intrinsics.checkNotNullParameter(docPages, "docPages");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(nfcType, "nfcType");
            Intrinsics.checkNotNullParameter(token, "token");
            this.f77930a = applicantId;
            this.f77931b = steps;
            this.f77932c = docType;
            this.d = docPages;
            this.e = countryCode;
            this.f = nfcType;
            this.f77933g = token;
            this.f77934h = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Onfido)) {
                return false;
            }
            Onfido onfido = (Onfido) obj2;
            return Intrinsics.f(this.f77930a, onfido.f77930a) && Intrinsics.f(this.f77931b, onfido.f77931b) && Intrinsics.f(this.f77932c, onfido.f77932c) && Intrinsics.f(this.d, onfido.d) && Intrinsics.f(this.e, onfido.e) && this.f == onfido.f && Intrinsics.f(this.f77933g, onfido.f77933g) && this.f77934h == onfido.f77934h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f77934h) + p.a.c((this.f.hashCode() + p.a.c(p.a.d(p.a.c(p.a.d(this.f77930a.hashCode() * 31, 31, this.f77931b), 31, this.f77932c.f77926a), 31, this.d), 31, this.e.f297794a)) * 31, 31, this.f77933g);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77930a);
            Iterator itV = p.a.v(this.f77931b, dest);
            while (itV.hasNext()) {
                dest.writeString(((b0) itV.next()).name());
            }
            this.f77932c.writeToParcel(dest, i);
            Iterator itV2 = p.a.v(this.d, dest);
            while (itV2.hasNext()) {
                ((WorkflowKycDocPage) itV2.next()).writeToParcel(dest, i);
            }
            dest.writeSerializable(this.e);
            dest.writeString(this.f.name());
            dest.writeString(this.f77933g);
            dest.writeInt(this.f77934h ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration$OnfidoStudio;", "Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnfidoStudio extends WorkflowDocumentScanCofiguration {

        @NotNull
        public static final Parcelable.Creator<OnfidoStudio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77936b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OnfidoStudio(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnfidoStudio[i];
            }
        }

        public OnfidoStudio(String token, String workflowRunId) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(workflowRunId, "workflowRunId");
            this.f77935a = token;
            this.f77936b = workflowRunId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OnfidoStudio)) {
                return false;
            }
            OnfidoStudio onfidoStudio = (OnfidoStudio) obj2;
            return Intrinsics.f(this.f77935a, onfidoStudio.f77935a) && Intrinsics.f(this.f77936b, onfidoStudio.f77936b);
        }

        public final int hashCode() {
            return this.f77936b.hashCode() + (this.f77935a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77935a);
            dest.writeString(this.f77936b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration$Vision;", "Lcom/revolut/feature/kyc_documents_scan/api/models/WorkflowDocumentScanCofiguration;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Vision extends WorkflowDocumentScanCofiguration {

        @NotNull
        public static final Parcelable.Creator<Vision> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f77938b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet2.add(k.valueOf(parcel.readString()));
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new Vision(string, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Vision[i];
            }
        }

        public Vision(String verificationToken, Set set) {
            Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
            this.f77937a = verificationToken;
            this.f77938b = set;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Vision)) {
                return false;
            }
            Vision vision = (Vision) obj2;
            return Intrinsics.f(this.f77937a, vision.f77937a) && Intrinsics.f(this.f77938b, vision.f77938b);
        }

        public final int hashCode() {
            int iHashCode = this.f77937a.hashCode() * 31;
            Set set = this.f77938b;
            return iHashCode + (set == null ? 0 : set.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77937a);
            Set set = this.f77938b;
            if (set == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString(((k) itQ.next()).name());
            }
        }
    }

    private WorkflowDocumentScanCofiguration() {
    }
}
