package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo", "Landroid/os/Parcelable;", "Data", "Id", "Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo$Data;", "Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo$Id;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EasyBankTransferDescriptor$PreselectedInstitutionInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo$Data;", "Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo;", "Institution", "Branch", "Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo$Data$Branch;", "Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo$Data$Institution;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Data extends EasyBankTransferDescriptor$PreselectedInstitutionInfo {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo$Data$Branch;", "Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo$Data;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Branch implements Data {

            @NotNull
            public static final Parcelable.Creator<Branch> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f72263a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f72264b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final io3.b f72265c;
            public final xi0.b d;
            public final String e;
            public final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f72266g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Branch(parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Branch[i];
                }
            }

            public Branch(String id10, String name, io3.b logo, xi0.b supportedCurrency, String institutionId, String coreInstitutionName, boolean z) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(logo, "logo");
                Intrinsics.checkNotNullParameter(supportedCurrency, "supportedCurrency");
                Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
                this.f72263a = id10;
                this.f72264b = name;
                this.f72265c = logo;
                this.d = supportedCurrency;
                this.e = institutionId;
                this.f = coreInstitutionName;
                this.f72266g = z;
            }

            @Override // com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getF72269c() {
                return this.f72265c;
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
                return Intrinsics.f(this.f72263a, branch.f72263a) && Intrinsics.f(this.f72264b, branch.f72264b) && Intrinsics.f(this.f72265c, branch.f72265c) && Intrinsics.f(this.d, branch.d) && Intrinsics.f(this.e, branch.e) && Intrinsics.f(this.f, branch.f) && this.f72266g == branch.f72266g;
            }

            @Override // com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data
            /* JADX INFO: renamed from: f5, reason: from getter */
            public final xi0.b getD() {
                return this.d;
            }

            @Override // com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF72267a() {
                return this.f72263a;
            }

            @Override // com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data
            /* JADX INFO: renamed from: getName, reason: from getter */
            public final String getF72268b() {
                return this.f72264b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f72266g) + p.a.c(p.a.c(l.j(this.d, (this.f72265c.hashCode() + p.a.c(this.f72263a.hashCode() * 31, 31, this.f72264b)) * 31, 31), 31, this.e), 31, this.f);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f72263a);
                dest.writeString(this.f72264b);
                dest.writeSerializable(this.f72265c);
                dest.writeSerializable(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeInt(this.f72266g ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo$Data$Institution;", "Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo$Data;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Institution implements Data {

            @NotNull
            public static final Parcelable.Creator<Institution> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f72267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f72268b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final io3.b f72269c;
            public final xi0.b d;
            public final boolean e;
            public final boolean f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    io3.b bVar = (io3.b) parcel.readSerializable();
                    xi0.b bVar2 = (xi0.b) parcel.readSerializable();
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    return new Institution(string, string2, bVar, bVar2, z3, parcel.readInt() == 0 ? z : true);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Institution[i];
                }
            }

            public Institution(String id10, String name, io3.b logo, xi0.b supportedCurrency, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(logo, "logo");
                Intrinsics.checkNotNullParameter(supportedCurrency, "supportedCurrency");
                this.f72267a = id10;
                this.f72268b = name;
                this.f72269c = logo;
                this.d = supportedCurrency;
                this.e = z;
                this.f = z3;
            }

            @Override // com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data
            /* JADX INFO: renamed from: F, reason: from getter */
            public final io3.b getF72269c() {
                return this.f72269c;
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
                return Intrinsics.f(this.f72267a, institution.f72267a) && Intrinsics.f(this.f72268b, institution.f72268b) && Intrinsics.f(this.f72269c, institution.f72269c) && Intrinsics.f(this.d, institution.d) && this.e == institution.e && this.f == institution.f;
            }

            @Override // com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data
            /* JADX INFO: renamed from: f5, reason: from getter */
            public final xi0.b getD() {
                return this.d;
            }

            @Override // com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF72267a() {
                return this.f72267a;
            }

            @Override // com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data
            /* JADX INFO: renamed from: getName, reason: from getter */
            public final String getF72268b() {
                return this.f72268b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f) + j6.a.c(l.j(this.d, (this.f72269c.hashCode() + p.a.c(this.f72267a.hashCode() * 31, 31, this.f72268b)) * 31, 31), 31, this.e);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f72267a);
                dest.writeString(this.f72268b);
                dest.writeSerializable(this.f72269c);
                dest.writeSerializable(this.d);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
            }
        }

        /* JADX INFO: renamed from: F */
        io3.b getF72269c();

        /* JADX INFO: renamed from: f5 */
        xi0.b getD();

        /* JADX INFO: renamed from: getName */
        String getF72268b();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo$Id;", "Lcom/revolut/feature/external_accounts/api/navigation/EasyBankTransferDescriptor$PreselectedInstitutionInfo;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Id implements EasyBankTransferDescriptor$PreselectedInstitutionInfo {

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72270a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Id(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Id[i];
            }
        }

        public Id(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f72270a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Id) && Intrinsics.f(this.f72270a, ((Id) obj2).f72270a);
        }

        @Override // com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo
        /* JADX INFO: renamed from: getId */
        public final String getF72267a() {
            throw null;
        }

        public final int hashCode() {
            return this.f72270a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72270a);
        }
    }

    /* JADX INFO: renamed from: getId */
    String getF72267a();
}
