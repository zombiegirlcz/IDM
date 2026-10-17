package com.revolut.feature.shared.savings.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsDocument;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "Companion", "Scope", "Link", "DocumentType", "a", "Lcom/revolut/feature/shared/savings/models/product/SavingsDocument$Link;", "Lcom/revolut/feature/shared/savings/models/product/SavingsDocument$Scope;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SavingsDocument extends Parcelable, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f86613a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsDocument$DocumentType;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentType implements Parcelable, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final DocumentType f86606b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86607a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<DocumentType> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.shared.savings.models.product.SavingsDocument$DocumentType$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentType(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentType[i];
            }
        }

        static {
            new DocumentType("ABOUT");
            new DocumentType("DEPOSIT_INFORMATION");
            new DocumentType("PARTNER_TERMS");
            new DocumentType("PARTNER_TAX_RESIDENCY_DECLARATION");
            new DocumentType("FUND_ANNUAL_REPORT");
            new DocumentType("FUND_BEST_EXECUTION_POLICY");
            new DocumentType("FUND_PROSPECTUS");
            new DocumentType("FUND_SEMI_ANNUAL_REPORT");
            new DocumentType("FUND_RISK_DISCLOSURE");
            f86606b = new DocumentType("FUND_KEY_INFORMATION");
            new DocumentType("FUND_EX_ANTE_COST_AND_CHARGES");
            new DocumentType("FUND_HYS_T_AND_C");
            new DocumentType("FUND_T_AND_C");
            new DocumentType("FUND_PRIVACY_NOTICE");
            new DocumentType("PRODUCT_T_AND_C");
        }

        public DocumentType(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f86607a = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentType) && Intrinsics.f(this.f86607a, ((DocumentType) obj2).f86607a);
        }

        public final int hashCode() {
            return this.f86607a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86607a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsDocument$Link;", "Lcom/revolut/feature/shared/savings/models/product/SavingsDocument;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Link implements SavingsDocument {

        @NotNull
        public static final Parcelable.Creator<Link> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DocumentType f86609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86610c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Link(parcel.readString(), parcel.readInt() == 0 ? null : DocumentType.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Link[i];
            }
        }

        public Link(String title, DocumentType documentType, String url2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f86608a = title;
            this.f86609b = documentType;
            this.f86610c = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Link)) {
                return false;
            }
            Link link = (Link) obj2;
            return Intrinsics.f(this.f86608a, link.f86608a) && Intrinsics.f(this.f86609b, link.f86609b) && Intrinsics.f(this.f86610c, link.f86610c);
        }

        public final int hashCode() {
            int iHashCode = this.f86608a.hashCode() * 31;
            DocumentType documentType = this.f86609b;
            return this.f86610c.hashCode() + ((iHashCode + (documentType == null ? 0 : documentType.f86607a.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86608a);
            DocumentType documentType = this.f86609b;
            if (documentType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                documentType.writeToParcel(dest, i);
            }
            dest.writeString(this.f86610c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsDocument$Scope;", "Lcom/revolut/feature/shared/savings/models/product/SavingsDocument;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Scope implements SavingsDocument {

        @NotNull
        public static final Parcelable.Creator<Scope> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f86612b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Scope(string, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scope[i];
            }
        }

        public Scope(String scope, Boolean bool) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.f86611a = scope;
            this.f86612b = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Scope)) {
                return false;
            }
            Scope scope = (Scope) obj2;
            return Intrinsics.f(this.f86611a, scope.f86611a) && Intrinsics.f(this.f86612b, scope.f86612b);
        }

        public final int hashCode() {
            int iHashCode = this.f86611a.hashCode() * 31;
            Boolean bool = this.f86612b;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86611a);
            Boolean bool = this.f86612b;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.shared.savings.models.product.SavingsDocument$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f86613a = new Companion();

        private Companion() {
        }
    }
}
