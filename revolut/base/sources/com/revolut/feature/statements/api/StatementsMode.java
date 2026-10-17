package com.revolut.feature.statements.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/statements/api/StatementsMode;", "Landroid/os/Parcelable;", "Consolidated", "TaxCertificate", "TaxFiling", "BankIDAnnualStatements", "Lcom/revolut/feature/statements/api/StatementsMode$BankIDAnnualStatements;", "Lcom/revolut/feature/statements/api/StatementsMode$Consolidated;", "Lcom/revolut/feature/statements/api/StatementsMode$TaxCertificate;", "Lcom/revolut/feature/statements/api/StatementsMode$TaxFiling;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StatementsMode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/api/StatementsMode$BankIDAnnualStatements;", "Lcom/revolut/feature/statements/api/StatementsMode;", "<init>", "()V", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BankIDAnnualStatements implements StatementsMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BankIDAnnualStatements f88212a = new BankIDAnnualStatements();

        @NotNull
        public static final Parcelable.Creator<BankIDAnnualStatements> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BankIDAnnualStatements.f88212a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankIDAnnualStatements[i];
            }
        }

        private BankIDAnnualStatements() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.statements.api.StatementsMode
        /* JADX INFO: renamed from: getCountryCode */
        public final b getF88215a() {
            b.Companion.getClass();
            return b.M0;
        }

        @Override // com.revolut.feature.statements.api.StatementsMode
        public final String getId() {
            return "IL_BANK_ID_ANNUAL_STATEMENTS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/StatementsMode$Consolidated;", "Lcom/revolut/feature/statements/api/StatementsMode;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Consolidated implements StatementsMode {

        @NotNull
        public static final Parcelable.Creator<Consolidated> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f88213a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Consolidated((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consolidated[i];
            }
        }

        public Consolidated(b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f88213a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Consolidated) && Intrinsics.f(this.f88213a, ((Consolidated) obj2).f88213a);
        }

        @Override // com.revolut.feature.statements.api.StatementsMode
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final b getF88215a() {
            return this.f88213a;
        }

        @Override // com.revolut.feature.statements.api.StatementsMode
        public final String getId() {
            return j6.a.q("CONSOLIDATED_", this.f88213a.f297794a);
        }

        public final int hashCode() {
            return this.f88213a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88213a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/StatementsMode$TaxCertificate;", "Lcom/revolut/feature/statements/api/StatementsMode;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxCertificate implements StatementsMode {

        @NotNull
        public static final Parcelable.Creator<TaxCertificate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f88214a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxCertificate((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxCertificate[i];
            }
        }

        public TaxCertificate(b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f88214a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxCertificate) && Intrinsics.f(this.f88214a, ((TaxCertificate) obj2).f88214a);
        }

        @Override // com.revolut.feature.statements.api.StatementsMode
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final b getF88215a() {
            return this.f88214a;
        }

        @Override // com.revolut.feature.statements.api.StatementsMode
        public final String getId() {
            return j6.a.q("TAX_CERTIFICATE_", this.f88214a.f297794a);
        }

        public final int hashCode() {
            return this.f88214a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88214a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/StatementsMode$TaxFiling;", "Lcom/revolut/feature/statements/api/StatementsMode;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxFiling implements StatementsMode {

        @NotNull
        public static final Parcelable.Creator<TaxFiling> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f88215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88216b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxFiling((b) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxFiling[i];
            }
        }

        public TaxFiling(b countryCode, String url2) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f88215a = countryCode;
            this.f88216b = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxFiling)) {
                return false;
            }
            TaxFiling taxFiling = (TaxFiling) obj2;
            return Intrinsics.f(this.f88215a, taxFiling.f88215a) && Intrinsics.f(this.f88216b, taxFiling.f88216b);
        }

        @Override // com.revolut.feature.statements.api.StatementsMode
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final b getF88215a() {
            return this.f88215a;
        }

        @Override // com.revolut.feature.statements.api.StatementsMode
        public final String getId() {
            return j6.a.q("TAX_FILING_", this.f88215a.f297794a);
        }

        public final int hashCode() {
            return this.f88216b.hashCode() + (this.f88215a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88215a);
            dest.writeString(this.f88216b);
        }
    }

    /* JADX INFO: renamed from: getCountryCode */
    b getF88215a();

    String getId();
}
