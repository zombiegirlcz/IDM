package com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import ds6.j;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Hub", "ProductArticle", "TaxAssessment", "TaxPayment", "TaxProfile", "TransactionExport", "TaxSettings", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$Hub;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$TaxAssessment;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$TaxPayment;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$TaxProfile;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$TaxSettings;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$TransactionExport;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxHubFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$Hub;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Hub implements TaxHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Hub f74266a = new Hub();

        @NotNull
        public static final Parcelable.Creator<Hub> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Hub.f74266a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Hub[i];
            }
        }

        private Hub() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements TaxHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f74267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f74268b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ProductArticleParams productArticleParams = (ProductArticleParams) j6.a.f(parcel, "parcel", ProductArticle.class);
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(j.valueOf(parcel.readString()));
                }
                return new ProductArticle(productArticleParams, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(ProductArticleParams params, Set allowedTaxTypes) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(allowedTaxTypes, "allowedTaxTypes");
            this.f74267a = params;
            this.f74268b = allowedTaxTypes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductArticle)) {
                return false;
            }
            ProductArticle productArticle = (ProductArticle) obj2;
            return Intrinsics.f(this.f74267a, productArticle.f74267a) && Intrinsics.f(this.f74268b, productArticle.f74268b);
        }

        public final int hashCode() {
            return this.f74268b.hashCode() + (this.f74267a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74267a, i);
            Iterator itV = n.v(this.f74268b, dest);
            while (itV.hasNext()) {
                dest.writeString(((j) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$TaxAssessment;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxAssessment implements TaxHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxAssessment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f74270b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxAssessment(j.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxAssessment[i];
            }
        }

        public TaxAssessment(j taxType, String taxCalendarEventId) {
            Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
            Intrinsics.checkNotNullParameter(taxType, "taxType");
            this.f74269a = taxCalendarEventId;
            this.f74270b = taxType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxAssessment)) {
                return false;
            }
            TaxAssessment taxAssessment = (TaxAssessment) obj2;
            return Intrinsics.f(this.f74269a, taxAssessment.f74269a) && this.f74270b == taxAssessment.f74270b;
        }

        public final int hashCode() {
            return this.f74270b.hashCode() + (this.f74269a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74269a);
            dest.writeString(this.f74270b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$TaxPayment;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxPayment implements TaxHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f74271a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxPayment((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxPayment[i];
            }
        }

        public TaxPayment(wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f74271a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxPayment) && Intrinsics.f(this.f74271a, ((TaxPayment) obj2).f74271a);
        }

        public final int hashCode() {
            return this.f74271a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74271a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$TaxProfile;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxProfile implements TaxHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxProfile> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f74272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f74273b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(j.valueOf(parcel.readString()));
                }
                return new TaxProfile(linkedHashSet, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxProfile[i];
            }
        }

        public /* synthetic */ TaxProfile(Set set) {
            this(set, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxProfile)) {
                return false;
            }
            TaxProfile taxProfile = (TaxProfile) obj2;
            return Intrinsics.f(this.f74272a, taxProfile.f74272a) && this.f74273b == taxProfile.f74273b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f74273b) + (this.f74272a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f74272a, dest);
            while (itV.hasNext()) {
                dest.writeString(((j) itV.next()).name());
            }
            dest.writeInt(this.f74273b ? 1 : 0);
        }

        public TaxProfile(Set allowedTaxTypes, boolean z) {
            Intrinsics.checkNotNullParameter(allowedTaxTypes, "allowedTaxTypes");
            this.f74272a = allowedTaxTypes;
            this.f74273b = z;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$TaxSettings;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxSettings implements TaxHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxSettings f74274a = new TaxSettings();

        @NotNull
        public static final Parcelable.Creator<TaxSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxSettings.f74274a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxSettings[i];
            }
        }

        private TaxSettings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step$TransactionExport;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/flow/TaxHubFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransactionExport implements TaxHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransactionExport f74275a = new TransactionExport();

        @NotNull
        public static final Parcelable.Creator<TransactionExport> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransactionExport.f74275a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionExport[i];
            }
        }

        private TransactionExport() {
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
}
