package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import io3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/external_accounts/api/navigation/CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData", "Landroid/os/Parcelable;", "<init>", "()V", "Institution", "Branch", "Lcom/revolut/feature/external_accounts/api/navigation/CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData$Branch;", "Lcom/revolut/feature/external_accounts/api/navigation/CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData$Institution;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData$Branch;", "Lcom/revolut/feature/external_accounts/api/navigation/CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Branch extends CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData {

        @NotNull
        public static final Parcelable.Creator<Branch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io3.b f72254c;
        public final xi0.b d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f72255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f72256h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Branch(parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Branch[i];
            }
        }

        public Branch(String id10, String name, io3.b logo, xi0.b supportedCurrency, String institutionId, String coreInstitutionName, boolean z, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(logo, "logo");
            Intrinsics.checkNotNullParameter(supportedCurrency, "supportedCurrency");
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            this.f72252a = id10;
            this.f72253b = name;
            this.f72254c = logo;
            this.d = supportedCurrency;
            this.e = institutionId;
            this.f = coreInstitutionName;
            this.f72255g = z;
            this.f72256h = str;
        }

        @Override // com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData
        /* JADX INFO: renamed from: F, reason: from getter */
        public final io3.b getF72259c() {
            return this.f72254c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Branch)) {
                return false;
            }
            Branch branch = (Branch) obj2;
            return Intrinsics.f(this.f72252a, branch.f72252a) && Intrinsics.f(this.f72253b, branch.f72253b) && Intrinsics.f(this.f72254c, branch.f72254c) && Intrinsics.f(this.d, branch.d) && Intrinsics.f(this.e, branch.e) && Intrinsics.f(this.f, branch.f) && this.f72255g == branch.f72255g && Intrinsics.f(this.f72256h, branch.f72256h);
        }

        @Override // com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData
        /* JADX INFO: renamed from: f5, reason: from getter */
        public final xi0.b getD() {
            return this.d;
        }

        @Override // com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF72258b() {
            return this.f72253b;
        }

        public final int hashCode() {
            int iC = j6.a.c(p.a.c(p.a.c(l.j(this.d, (this.f72254c.hashCode() + p.a.c(this.f72252a.hashCode() * 31, 31, this.f72253b)) * 31, 31), 31, this.e), 31, this.f), 31, this.f72255g);
            String str = this.f72256h;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72252a);
            dest.writeString(this.f72253b);
            dest.writeSerializable(this.f72254c);
            dest.writeSerializable(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeInt(this.f72255g ? 1 : 0);
            dest.writeString(this.f72256h);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData$Institution;", "Lcom/revolut/feature/external_accounts/api/navigation/CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;", "", "toString", "()Ljava/lang/String;", "PaymentInfo", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Institution extends CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData {

        @NotNull
        public static final Parcelable.Creator<Institution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io3.b f72259c;
        public final xi0.b d;
        public final PaymentInfo e;
        public final String f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData$Institution$PaymentInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PaymentInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PaymentInfo> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f72260a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final n f72261b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f72262c;
            public final boolean d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PaymentInfo(parcel.readInt() != 0, n.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PaymentInfo[i];
                }
            }

            public PaymentInfo(boolean z, n topUpSystem, boolean z3, boolean z4) {
                Intrinsics.checkNotNullParameter(topUpSystem, "topUpSystem");
                this.f72260a = z;
                this.f72261b = topUpSystem;
                this.f72262c = z3;
                this.d = z4;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PaymentInfo)) {
                    return false;
                }
                PaymentInfo paymentInfo = (PaymentInfo) obj2;
                return this.f72260a == paymentInfo.f72260a && this.f72261b == paymentInfo.f72261b && this.f72262c == paymentInfo.f72262c && this.d == paymentInfo.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + j6.a.c((this.f72261b.hashCode() + (Boolean.hashCode(this.f72260a) * 31)) * 31, 31, this.f72262c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f72260a ? 1 : 0);
                dest.writeString(this.f72261b.name());
                dest.writeInt(this.f72262c ? 1 : 0);
                dest.writeInt(this.d ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Institution(parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), PaymentInfo.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Institution[i];
            }
        }

        public Institution(String id10, String name, io3.b logo, xi0.b supportedCurrency, PaymentInfo paymentInfo, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(logo, "logo");
            Intrinsics.checkNotNullParameter(supportedCurrency, "supportedCurrency");
            Intrinsics.checkNotNullParameter(paymentInfo, "paymentInfo");
            this.f72257a = id10;
            this.f72258b = name;
            this.f72259c = logo;
            this.d = supportedCurrency;
            this.e = paymentInfo;
            this.f = str;
        }

        @Override // com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData
        /* JADX INFO: renamed from: F, reason: from getter */
        public final io3.b getF72259c() {
            return this.f72259c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Institution)) {
                return false;
            }
            Institution institution = (Institution) obj2;
            return Intrinsics.f(this.f72257a, institution.f72257a) && Intrinsics.f(this.f72258b, institution.f72258b) && Intrinsics.f(this.f72259c, institution.f72259c) && Intrinsics.f(this.d, institution.d) && Intrinsics.f(this.e, institution.e) && Intrinsics.f(this.f, institution.f);
        }

        @Override // com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData
        /* JADX INFO: renamed from: f5, reason: from getter */
        public final xi0.b getD() {
            return this.d;
        }

        @Override // com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF72258b() {
            return this.f72258b;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + l.j(this.d, (this.f72259c.hashCode() + p.a.c(this.f72257a.hashCode() * 31, 31, this.f72258b)) * 31, 31)) * 31;
            String str = this.f;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72257a);
            dest.writeString(this.f72258b);
            dest.writeSerializable(this.f72259c);
            dest.writeSerializable(this.d);
            this.e.writeToParcel(dest, i);
            dest.writeString(this.f);
        }
    }

    private CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData() {
    }

    /* JADX INFO: renamed from: F */
    public abstract io3.b getF72259c();

    /* JADX INFO: renamed from: f5 */
    public abstract xi0.b getD();

    /* JADX INFO: renamed from: getName */
    public abstract String getF72258b();
}
