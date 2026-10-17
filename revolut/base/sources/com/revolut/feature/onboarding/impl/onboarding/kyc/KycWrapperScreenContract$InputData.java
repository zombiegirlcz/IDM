package com.revolut.feature.onboarding.impl.onboarding.kyc;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.k;
import org.jetbrains.annotations.NotNull;
import yt8.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/kyc/KycWrapperScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "DocumentKyc", "DocumentId", "Lcom/revolut/feature/onboarding/impl/onboarding/kyc/KycWrapperScreenContract$InputData$DocumentId;", "Lcom/revolut/feature/onboarding/impl/onboarding/kyc/KycWrapperScreenContract$InputData$DocumentKyc;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface KycWrapperScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/kyc/KycWrapperScreenContract$InputData$DocumentId;", "Lcom/revolut/feature/onboarding/impl/onboarding/kyc/KycWrapperScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentId implements KycWrapperScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DocumentId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KycContract$Requirement f78449b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentId((KycContract$Requirement) parcel.readParcelable(DocumentId.class.getClassLoader()), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentId[i];
            }
        }

        public DocumentId(KycContract$Requirement requirement, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(requirement, "requirement");
            this.f78448a = countryCode;
            this.f78449b = requirement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentId)) {
                return false;
            }
            DocumentId documentId = (DocumentId) obj2;
            return Intrinsics.f(this.f78448a, documentId.f78448a) && Intrinsics.f(this.f78449b, documentId.f78449b);
        }

        public final int hashCode() {
            return this.f78449b.hashCode() + (this.f78448a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78448a);
            dest.writeParcelable(this.f78449b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/kyc/KycWrapperScreenContract$InputData$DocumentKyc;", "Lcom/revolut/feature/onboarding/impl/onboarding/kyc/KycWrapperScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentKyc implements KycWrapperScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DocumentKyc> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KycContract$Requirement f78451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f78452c;
        public final e d;
        public final Set e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                KycContract$Requirement kycContract$Requirement = (KycContract$Requirement) parcel.readParcelable(DocumentKyc.class.getClassLoader());
                String string = parcel.readString();
                e eVarValueOf = parcel.readInt() == 0 ? null : e.valueOf(parcel.readString());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(k.valueOf(parcel.readString()));
                }
                return new DocumentKyc(bVar, kycContract$Requirement, string, eVarValueOf, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentKyc[i];
            }
        }

        public DocumentKyc(wi0.b countryCode, KycContract$Requirement requirement, String deeplink, e eVar, Set acceptedKycConsents) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(requirement, "requirement");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(acceptedKycConsents, "acceptedKycConsents");
            this.f78450a = countryCode;
            this.f78451b = requirement;
            this.f78452c = deeplink;
            this.d = eVar;
            this.e = acceptedKycConsents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentKyc)) {
                return false;
            }
            DocumentKyc documentKyc = (DocumentKyc) obj2;
            return Intrinsics.f(this.f78450a, documentKyc.f78450a) && Intrinsics.f(this.f78451b, documentKyc.f78451b) && Intrinsics.f(this.f78452c, documentKyc.f78452c) && this.d == documentKyc.d && Intrinsics.f(this.e, documentKyc.e);
        }

        public final int hashCode() {
            int iC = p.a.c((this.f78451b.hashCode() + (this.f78450a.f297794a.hashCode() * 31)) * 31, 31, this.f78452c);
            e eVar = this.d;
            return this.e.hashCode() + ((iC + (eVar == null ? 0 : eVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78450a);
            dest.writeParcelable(this.f78451b, i);
            dest.writeString(this.f78452c);
            e eVar = this.d;
            if (eVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(eVar.name());
            }
            Iterator itV = n.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeString(((k) itV.next()).name());
            }
        }
    }
}
