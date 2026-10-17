package com.revolut.feature.apm.core.models.bizum;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus;", "Landroid/os/Parcelable;", "Active", "NotRegistered", "Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$Active;", "Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$NotRegistered;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BizumRegistrationStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$Active;", "Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Active implements BizumRegistrationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Active f61908a = new Active();

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Active.f61908a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        private Active() {
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$NotRegistered;", "Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus;", "Standard", "Portability", "Remediation", "Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$NotRegistered$Portability;", "Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$NotRegistered$Remediation;", "Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$NotRegistered$Standard;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface NotRegistered extends BizumRegistrationStatus {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$NotRegistered$Portability;", "Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$NotRegistered;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Portability implements NotRegistered {

            @NotNull
            public static final Parcelable.Creator<Portability> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f61909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f61910b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f61911c;
            public final String d;
            public final String e;
            public final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f61912g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Portability(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Portability[i];
                }
            }

            public Portability(String phone, String name, String accountNumber, String bic2, String termsUri, String termsId, boolean z) {
                Intrinsics.checkNotNullParameter(phone, "phone");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(bic2, "bic");
                Intrinsics.checkNotNullParameter(termsUri, "termsUri");
                Intrinsics.checkNotNullParameter(termsId, "termsId");
                this.f61909a = phone;
                this.f61910b = name;
                this.f61911c = accountNumber;
                this.d = bic2;
                this.e = termsUri;
                this.f = termsId;
                this.f61912g = z;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: E, reason: from getter */
            public final String getF61920c() {
                return this.f61911c;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: I3, reason: from getter */
            public final boolean getF61921g() {
                return this.f61912g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Portability)) {
                    return false;
                }
                Portability portability = (Portability) obj2;
                return Intrinsics.f(this.f61909a, portability.f61909a) && Intrinsics.f(this.f61910b, portability.f61910b) && Intrinsics.f(this.f61911c, portability.f61911c) && Intrinsics.f(this.d, portability.d) && Intrinsics.f(this.e, portability.e) && Intrinsics.f(this.f, portability.f) && this.f61912g == portability.f61912g;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: getName, reason: from getter */
            public final String getF61919b() {
                return this.f61910b;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: getPhone, reason: from getter */
            public final String getF61918a() {
                return this.f61909a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f61912g) + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f61909a.hashCode() * 31, 31, this.f61910b), 31, this.f61911c), 31, this.d), 31, this.e), 31, this.f);
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: q0, reason: from getter */
            public final String getF() {
                return this.f;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: t7, reason: from getter */
            public final String getE() {
                return this.e;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f61909a);
                dest.writeString(this.f61910b);
                dest.writeString(this.f61911c);
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeInt(this.f61912g ? 1 : 0);
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: x5, reason: from getter */
            public final String getD() {
                return this.d;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$NotRegistered$Remediation;", "Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$NotRegistered;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Remediation implements NotRegistered {

            @NotNull
            public static final Parcelable.Creator<Remediation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f61913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f61914b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f61915c;
            public final String d;
            public final String e;
            public final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f61916g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final String f61917h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Remediation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Remediation[i];
                }
            }

            public Remediation(String phone, String name, String accountNumber, String bic2, String termsUri, String termsId, boolean z, String workflowId) {
                Intrinsics.checkNotNullParameter(phone, "phone");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(bic2, "bic");
                Intrinsics.checkNotNullParameter(termsUri, "termsUri");
                Intrinsics.checkNotNullParameter(termsId, "termsId");
                Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                this.f61913a = phone;
                this.f61914b = name;
                this.f61915c = accountNumber;
                this.d = bic2;
                this.e = termsUri;
                this.f = termsId;
                this.f61916g = z;
                this.f61917h = workflowId;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: E, reason: from getter */
            public final String getF61920c() {
                return this.f61915c;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: I3, reason: from getter */
            public final boolean getF61921g() {
                return this.f61916g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Remediation)) {
                    return false;
                }
                Remediation remediation = (Remediation) obj2;
                return Intrinsics.f(this.f61913a, remediation.f61913a) && Intrinsics.f(this.f61914b, remediation.f61914b) && Intrinsics.f(this.f61915c, remediation.f61915c) && Intrinsics.f(this.d, remediation.d) && Intrinsics.f(this.e, remediation.e) && Intrinsics.f(this.f, remediation.f) && this.f61916g == remediation.f61916g && Intrinsics.f(this.f61917h, remediation.f61917h);
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: getName, reason: from getter */
            public final String getF61919b() {
                return this.f61914b;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: getPhone, reason: from getter */
            public final String getF61918a() {
                return this.f61913a;
            }

            public final int hashCode() {
                return this.f61917h.hashCode() + j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f61913a.hashCode() * 31, 31, this.f61914b), 31, this.f61915c), 31, this.d), 31, this.e), 31, this.f), 31, this.f61916g);
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: q0, reason: from getter */
            public final String getF() {
                return this.f;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: t7, reason: from getter */
            public final String getE() {
                return this.e;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f61913a);
                dest.writeString(this.f61914b);
                dest.writeString(this.f61915c);
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeInt(this.f61916g ? 1 : 0);
                dest.writeString(this.f61917h);
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: x5, reason: from getter */
            public final String getD() {
                return this.d;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$NotRegistered$Standard;", "Lcom/revolut/feature/apm/core/models/bizum/BizumRegistrationStatus$NotRegistered;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Standard implements NotRegistered {

            @NotNull
            public static final Parcelable.Creator<Standard> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f61918a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f61919b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f61920c;
            public final String d;
            public final String e;
            public final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f61921g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Standard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Standard[i];
                }
            }

            public Standard(String phone, String name, String accountNumber, String bic2, String termsUri, String termsId, boolean z) {
                Intrinsics.checkNotNullParameter(phone, "phone");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(bic2, "bic");
                Intrinsics.checkNotNullParameter(termsUri, "termsUri");
                Intrinsics.checkNotNullParameter(termsId, "termsId");
                this.f61918a = phone;
                this.f61919b = name;
                this.f61920c = accountNumber;
                this.d = bic2;
                this.e = termsUri;
                this.f = termsId;
                this.f61921g = z;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: E, reason: from getter */
            public final String getF61920c() {
                return this.f61920c;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: I3, reason: from getter */
            public final boolean getF61921g() {
                return this.f61921g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Standard)) {
                    return false;
                }
                Standard standard = (Standard) obj2;
                return Intrinsics.f(this.f61918a, standard.f61918a) && Intrinsics.f(this.f61919b, standard.f61919b) && Intrinsics.f(this.f61920c, standard.f61920c) && Intrinsics.f(this.d, standard.d) && Intrinsics.f(this.e, standard.e) && Intrinsics.f(this.f, standard.f) && this.f61921g == standard.f61921g;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: getName, reason: from getter */
            public final String getF61919b() {
                return this.f61919b;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: getPhone, reason: from getter */
            public final String getF61918a() {
                return this.f61918a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f61921g) + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f61918a.hashCode() * 31, 31, this.f61919b), 31, this.f61920c), 31, this.d), 31, this.e), 31, this.f);
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: q0, reason: from getter */
            public final String getF() {
                return this.f;
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: t7, reason: from getter */
            public final String getE() {
                return this.e;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f61918a);
                dest.writeString(this.f61919b);
                dest.writeString(this.f61920c);
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeInt(this.f61921g ? 1 : 0);
            }

            @Override // com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.NotRegistered
            /* JADX INFO: renamed from: x5, reason: from getter */
            public final String getD() {
                return this.d;
            }
        }

        /* JADX INFO: renamed from: E */
        String getF61920c();

        /* JADX INFO: renamed from: I3 */
        boolean getF61921g();

        /* JADX INFO: renamed from: getName */
        String getF61919b();

        /* JADX INFO: renamed from: getPhone */
        String getF61918a();

        /* JADX INFO: renamed from: q0 */
        String getF();

        /* JADX INFO: renamed from: t7 */
        String getE();

        /* JADX INFO: renamed from: x5 */
        String getD();
    }
}
