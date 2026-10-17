package com.revolut.feature.profile.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import hel.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kii.e;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage;", "Landroid/os/Parcelable;", "General", "Personal", "DocumentList", "Savings", "Pro", "IncomeTaxStatement", "Joint", "Teen", "FinancialSummary", "AnnualAverage", "GeneralInvestments", "SavingsDocumentsType", "Lcom/revolut/feature/profile/api/DocumentsPage$AnnualAverage;", "Lcom/revolut/feature/profile/api/DocumentsPage$DocumentList;", "Lcom/revolut/feature/profile/api/DocumentsPage$FinancialSummary;", "Lcom/revolut/feature/profile/api/DocumentsPage$General;", "Lcom/revolut/feature/profile/api/DocumentsPage$GeneralInvestments;", "Lcom/revolut/feature/profile/api/DocumentsPage$IncomeTaxStatement;", "Lcom/revolut/feature/profile/api/DocumentsPage$Joint;", "Lcom/revolut/feature/profile/api/DocumentsPage$Personal;", "Lcom/revolut/feature/profile/api/DocumentsPage$Pro;", "Lcom/revolut/feature/profile/api/DocumentsPage$Savings;", "Lcom/revolut/feature/profile/api/DocumentsPage$Teen;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DocumentsPage extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$AnnualAverage;", "Lcom/revolut/feature/profile/api/DocumentsPage;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnnualAverage implements DocumentsPage {

        @NotNull
        public static final Parcelable.Creator<AnnualAverage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81296a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WalletId walletId = (WalletId) parcel.readParcelable(AnnualAverage.class.getClassLoader());
                return new AnnualAverage(walletId != null ? walletId.f66106a : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnnualAverage[i];
            }
        }

        public AnnualAverage(String str) {
            this.f81296a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof com.revolut.feature.profile.api.DocumentsPage.AnnualAverage
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.revolut.feature.profile.api.DocumentsPage$AnnualAverage r4 = (com.revolut.feature.profile.api.DocumentsPage.AnnualAverage) r4
                java.lang.String r4 = r4.f81296a
                java.lang.String r1 = r3.f81296a
                if (r1 != 0) goto L18
                if (r4 != 0) goto L16
                r4 = r0
                goto L1f
            L16:
                r4 = r2
                goto L1f
            L18:
                if (r4 != 0) goto L1b
                goto L16
            L1b:
                boolean r4 = kotlin.jvm.internal.Intrinsics.f(r1, r4)
            L1f:
                if (r4 != 0) goto L22
                return r2
            L22:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.profile.api.DocumentsPage.AnnualAverage.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f81296a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            String str = this.f81296a;
            dest.writeParcelable(str != null ? new WalletId(str) : null, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$DocumentList;", "Lcom/revolut/feature/profile/api/DocumentsPage;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentList implements DocumentsPage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentList f81297a = new DocumentList();

        @NotNull
        public static final Parcelable.Creator<DocumentList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentList.f81297a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentList[i];
            }
        }

        private DocumentList() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$FinancialSummary;", "Lcom/revolut/feature/profile/api/DocumentsPage;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinancialSummary implements DocumentsPage {

        @NotNull
        public static final Parcelable.Creator<FinancialSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81298a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WalletId walletId = (WalletId) parcel.readParcelable(FinancialSummary.class.getClassLoader());
                return new FinancialSummary(walletId != null ? walletId.f66106a : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FinancialSummary[i];
            }
        }

        public FinancialSummary(String str) {
            this.f81298a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof com.revolut.feature.profile.api.DocumentsPage.FinancialSummary
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.revolut.feature.profile.api.DocumentsPage$FinancialSummary r4 = (com.revolut.feature.profile.api.DocumentsPage.FinancialSummary) r4
                java.lang.String r4 = r4.f81298a
                java.lang.String r1 = r3.f81298a
                if (r1 != 0) goto L18
                if (r4 != 0) goto L16
                r4 = r0
                goto L1f
            L16:
                r4 = r2
                goto L1f
            L18:
                if (r4 != 0) goto L1b
                goto L16
            L1b:
                boolean r4 = kotlin.jvm.internal.Intrinsics.f(r1, r4)
            L1f:
                if (r4 != 0) goto L22
                return r2
            L22:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.profile.api.DocumentsPage.FinancialSummary.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f81298a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            String str = this.f81298a;
            dest.writeParcelable(str != null ? new WalletId(str) : null, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$General;", "Lcom/revolut/feature/profile/api/DocumentsPage;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class General implements DocumentsPage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final General f81299a = new General();

        @NotNull
        public static final Parcelable.Creator<General> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return General.f81299a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new General[i];
            }
        }

        private General() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$GeneralInvestments;", "Lcom/revolut/feature/profile/api/DocumentsPage;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GeneralInvestments implements DocumentsPage {

        @NotNull
        public static final Parcelable.Creator<GeneralInvestments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f81300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f81301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f81302c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GeneralInvestments((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GeneralInvestments[i];
            }
        }

        public GeneralInvestments(UUID personalPortfolioId, UUID jointPortfolioId, b bVar) {
            Intrinsics.checkNotNullParameter(personalPortfolioId, "personalPortfolioId");
            Intrinsics.checkNotNullParameter(jointPortfolioId, "jointPortfolioId");
            this.f81300a = personalPortfolioId;
            this.f81301b = jointPortfolioId;
            this.f81302c = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GeneralInvestments)) {
                return false;
            }
            GeneralInvestments generalInvestments = (GeneralInvestments) obj2;
            return Intrinsics.f(this.f81300a, generalInvestments.f81300a) && Intrinsics.f(this.f81301b, generalInvestments.f81301b) && this.f81302c == generalInvestments.f81302c;
        }

        public final int hashCode() {
            int iF = t61.a.f(this.f81301b, this.f81300a.hashCode() * 31, 31);
            b bVar = this.f81302c;
            return iF + (bVar == null ? 0 : bVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f81300a);
            dest.writeSerializable(this.f81301b);
            b bVar = this.f81302c;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$IncomeTaxStatement;", "Lcom/revolut/feature/profile/api/DocumentsPage;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncomeTaxStatement implements DocumentsPage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IncomeTaxStatement f81303a = new IncomeTaxStatement();

        @NotNull
        public static final Parcelable.Creator<IncomeTaxStatement> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IncomeTaxStatement.f81303a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeTaxStatement[i];
            }
        }

        private IncomeTaxStatement() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$Joint;", "Lcom/revolut/feature/profile/api/DocumentsPage;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint implements DocumentsPage {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81304a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WalletId walletId = (WalletId) parcel.readParcelable(Joint.class.getClassLoader());
                return new Joint(walletId != null ? walletId.f66106a : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(String str) {
            this.f81304a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof com.revolut.feature.profile.api.DocumentsPage.Joint
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.revolut.feature.profile.api.DocumentsPage$Joint r4 = (com.revolut.feature.profile.api.DocumentsPage.Joint) r4
                java.lang.String r4 = r4.f81304a
                java.lang.String r1 = r3.f81304a
                if (r1 != 0) goto L18
                if (r4 != 0) goto L16
                r4 = r0
                goto L1f
            L16:
                r4 = r2
                goto L1f
            L18:
                if (r4 != 0) goto L1b
                goto L16
            L1b:
                boolean r4 = kotlin.jvm.internal.Intrinsics.f(r1, r4)
            L1f:
                if (r4 != 0) goto L22
                return r2
            L22:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.profile.api.DocumentsPage.Joint.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f81304a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            String str = this.f81304a;
            dest.writeParcelable(str != null ? new WalletId(str) : null, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$Personal;", "Lcom/revolut/feature/profile/api/DocumentsPage;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Personal implements DocumentsPage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Personal f81305a = new Personal();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Personal.f81305a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        private Personal() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$Pro;", "Lcom/revolut/feature/profile/api/DocumentsPage;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pro implements DocumentsPage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pro f81306a = new Pro();

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pro.f81306a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        private Pro() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$Savings;", "Lcom/revolut/feature/profile/api/DocumentsPage;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Savings implements DocumentsPage {

        @NotNull
        public static final Parcelable.Creator<Savings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f81307a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SavingsDocumentsType.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Savings(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Savings[i];
            }
        }

        public Savings(List savingsTypes) {
            Intrinsics.checkNotNullParameter(savingsTypes, "savingsTypes");
            this.f81307a = savingsTypes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Savings) && Intrinsics.f(this.f81307a, ((Savings) obj2).f81307a);
        }

        public final int hashCode() {
            return this.f81307a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f81307a, dest);
            while (itV.hasNext()) {
                ((SavingsDocumentsType) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$SavingsDocumentsType;", "Landroid/os/Parcelable;", "", "Personal", "Joint", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SavingsDocumentsType implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SavingsDocumentsType[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<SavingsDocumentsType> CREATOR;
        public static final SavingsDocumentsType Joint;
        public static final SavingsDocumentsType Personal;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return SavingsDocumentsType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsDocumentsType[i];
            }
        }

        static {
            SavingsDocumentsType savingsDocumentsType = new SavingsDocumentsType("Personal", 0);
            Personal = savingsDocumentsType;
            SavingsDocumentsType savingsDocumentsType2 = new SavingsDocumentsType("Joint", 1);
            Joint = savingsDocumentsType2;
            SavingsDocumentsType[] savingsDocumentsTypeArr = {savingsDocumentsType, savingsDocumentsType2};
            $VALUES = savingsDocumentsTypeArr;
            $ENTRIES = s.n(savingsDocumentsTypeArr);
            CREATOR = new a();
        }

        public static SavingsDocumentsType valueOf(String str) {
            return (SavingsDocumentsType) Enum.valueOf(SavingsDocumentsType.class, str);
        }

        public static SavingsDocumentsType[] values() {
            return (SavingsDocumentsType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/DocumentsPage$Teen;", "Lcom/revolut/feature/profile/api/DocumentsPage;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Teen implements DocumentsPage {

        @NotNull
        public static final Parcelable.Creator<Teen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81308a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Teen(((RegisteredIdentityId) parcel.readParcelable(Teen.class.getClassLoader())).f74764a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Teen[i];
            }
        }

        public Teen(String registeredIdentityId) {
            Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
            this.f81308a = registeredIdentityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Teen) && Intrinsics.f(this.f81308a, ((Teen) obj2).f81308a);
        }

        public final int hashCode() {
            return this.f81308a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            e.x(this.f81308a, dest, i);
        }
    }
}
