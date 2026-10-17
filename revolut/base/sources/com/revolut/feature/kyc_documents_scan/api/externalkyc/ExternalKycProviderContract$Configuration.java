package com.revolut.feature.kyc_documents_scan.api.externalkyc;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowKycDocPage;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.b0;
import my8.v;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/kyc_documents_scan/api/externalkyc/ExternalKycProviderContract$Configuration", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "Onfido", "OnfidoStudio", "Lcom/revolut/feature/kyc_documents_scan/api/externalkyc/ExternalKycProviderContract$Configuration$Onfido;", "Lcom/revolut/feature/kyc_documents_scan/api/externalkyc/ExternalKycProviderContract$Configuration$OnfidoStudio;", "feature_kyc_documents_scan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExternalKycProviderContract$Configuration extends FeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/api/externalkyc/ExternalKycProviderContract$Configuration$Onfido;", "Lcom/revolut/feature/kyc_documents_scan/api/externalkyc/ExternalKycProviderContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onfido implements ExternalKycProviderContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Onfido> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f77917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DocType f77918c;
        public final List d;
        public final b e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final v f77919g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f77920h;

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
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(nfcType, "nfcType");
            this.f77916a = applicantId;
            this.f77917b = steps;
            this.f77918c = docType;
            this.d = docPages;
            this.e = countryCode;
            this.f = token;
            this.f77919g = nfcType;
            this.f77920h = z;
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
            return Intrinsics.f(this.f77916a, onfido.f77916a) && Intrinsics.f(this.f77917b, onfido.f77917b) && Intrinsics.f(this.f77918c, onfido.f77918c) && Intrinsics.f(this.d, onfido.d) && Intrinsics.f(this.e, onfido.e) && Intrinsics.f(this.f, onfido.f) && this.f77919g == onfido.f77919g && this.f77920h == onfido.f77920h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f77920h) + ((this.f77919g.hashCode() + p.a.c(p.a.c(p.a.d(p.a.c(p.a.d(this.f77916a.hashCode() * 31, 31, this.f77917b), 31, this.f77918c.f77926a), 31, this.d), 31, this.e.f297794a), 31, this.f)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77916a);
            Iterator itV = p.a.v(this.f77917b, dest);
            while (itV.hasNext()) {
                dest.writeString(((b0) itV.next()).name());
            }
            this.f77918c.writeToParcel(dest, i);
            Iterator itV2 = p.a.v(this.d, dest);
            while (itV2.hasNext()) {
                ((WorkflowKycDocPage) itV2.next()).writeToParcel(dest, i);
            }
            dest.writeSerializable(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f77919g.name());
            dest.writeInt(this.f77920h ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/api/externalkyc/ExternalKycProviderContract$Configuration$OnfidoStudio;", "Lcom/revolut/feature/kyc_documents_scan/api/externalkyc/ExternalKycProviderContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnfidoStudio implements ExternalKycProviderContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<OnfidoStudio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77922b;

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
            this.f77921a = token;
            this.f77922b = workflowRunId;
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
            return Intrinsics.f(this.f77921a, onfidoStudio.f77921a) && Intrinsics.f(this.f77922b, onfidoStudio.f77922b);
        }

        public final int hashCode() {
            return this.f77922b.hashCode() + (this.f77921a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77921a);
            dest.writeString(this.f77922b);
        }
    }
}
