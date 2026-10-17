package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/review/TaxHubTransactionExportReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Inbound", "Outbound", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/review/TaxHubTransactionExportReviewScreenContract$InputData$Inbound;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/review/TaxHubTransactionExportReviewScreenContract$InputData$Outbound;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxHubTransactionExportReviewScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/review/TaxHubTransactionExportReviewScreenContract$InputData$Inbound;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/review/TaxHubTransactionExportReviewScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Inbound implements TaxHubTransactionExportReviewScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Inbound> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f74424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f74425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f74426c;
        public final Set d;
        public final String e;
        public final int f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                int iD2 = 0;
                while (iD2 != i) {
                    iD2 = v7.d(parcel, linkedHashSet, iD2, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                while (iD != i2) {
                    iD = v7.d(parcel, linkedHashSet2, iD, 1);
                }
                return new Inbound(localDate, localDate2, linkedHashSet, linkedHashSet2, parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Inbound[i];
            }
        }

        public Inbound(LocalDate startDate, LocalDate endDate, Set selectedCategories, Set selectedCurrencies, String str, int i) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
            Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
            this.f74424a = startDate;
            this.f74425b = endDate;
            this.f74426c = selectedCategories;
            this.d = selectedCurrencies;
            this.e = str;
            this.f = i;
        }

        @Override // com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreenContract$InputData
        /* JADX INFO: renamed from: P3, reason: from getter */
        public final int getE() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Inbound)) {
                return false;
            }
            Inbound inbound = (Inbound) obj2;
            return Intrinsics.f(this.f74424a, inbound.f74424a) && Intrinsics.f(this.f74425b, inbound.f74425b) && Intrinsics.f(this.f74426c, inbound.f74426c) && Intrinsics.f(this.d, inbound.d) && Intrinsics.f(this.e, inbound.e) && this.f == inbound.f;
        }

        public final int hashCode() {
            int iF = p.a.f(p.a.f(y.a(this.f74424a.hashCode() * 31, 31, this.f74425b), 31, this.f74426c), 31, this.d);
            String str = this.e;
            return Integer.hashCode(this.f) + ((iF + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74424a);
            dest.writeSerializable(this.f74425b);
            Iterator itV = n.v(this.f74426c, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itV2 = n.v(this.d, dest);
            while (itV2.hasNext()) {
                dest.writeSerializable((Serializable) itV2.next());
            }
            dest.writeString(this.e);
            dest.writeInt(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/review/TaxHubTransactionExportReviewScreenContract$InputData$Outbound;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/review/TaxHubTransactionExportReviewScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Outbound implements TaxHubTransactionExportReviewScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Outbound> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f74427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f74428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f74429c;
        public final Set d;
        public final int e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                LocalDate localDate2 = (LocalDate) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                int iD2 = 0;
                while (iD2 != i) {
                    iD2 = v7.d(parcel, linkedHashSet, iD2, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                while (iD != i2) {
                    iD = v7.d(parcel, linkedHashSet2, iD, 1);
                }
                return new Outbound(localDate, localDate2, linkedHashSet, linkedHashSet2, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Outbound[i];
            }
        }

        public Outbound(LocalDate startDate, LocalDate endDate, Set selectedCategories, Set selectedCurrencies, int i) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
            Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
            this.f74427a = startDate;
            this.f74428b = endDate;
            this.f74429c = selectedCategories;
            this.d = selectedCurrencies;
            this.e = i;
        }

        @Override // com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreenContract$InputData
        /* JADX INFO: renamed from: P3, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Outbound)) {
                return false;
            }
            Outbound outbound = (Outbound) obj2;
            return Intrinsics.f(this.f74427a, outbound.f74427a) && Intrinsics.f(this.f74428b, outbound.f74428b) && Intrinsics.f(this.f74429c, outbound.f74429c) && Intrinsics.f(this.d, outbound.d) && this.e == outbound.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + p.a.f(p.a.f(y.a(this.f74427a.hashCode() * 31, 31, this.f74428b), 31, this.f74429c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74427a);
            dest.writeSerializable(this.f74428b);
            Iterator itV = n.v(this.f74429c, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itV2 = n.v(this.d, dest);
            while (itV2.hasNext()) {
                dest.writeSerializable((Serializable) itV2.next());
            }
            dest.writeInt(this.e);
        }
    }

    /* JADX INFO: renamed from: P3 */
    int getE();
}
