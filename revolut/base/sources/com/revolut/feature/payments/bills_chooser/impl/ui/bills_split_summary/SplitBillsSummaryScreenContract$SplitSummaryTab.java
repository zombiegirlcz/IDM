package com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$SplitSummaryTab", "Landroid/os/Parcelable;", "Companion", "Common", "Itemize", "a", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$SplitSummaryTab$Common;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$SplitSummaryTab$Itemize;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitBillsSummaryScreenContract$SplitSummaryTab extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f79243a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$SplitSummaryTab$Common;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$SplitSummaryTab;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Common implements SplitBillsSummaryScreenContract$SplitSummaryTab {

        @NotNull
        public static final Parcelable.Creator<Common> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final cp9.a f79241a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Common(cp9.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Common[i];
            }
        }

        public Common(cp9.a splitType) {
            Intrinsics.checkNotNullParameter(splitType, "splitType");
            this.f79241a = splitType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Common) && this.f79241a == ((Common) obj2).f79241a;
        }

        @Override // com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$SplitSummaryTab
        public final String getName() {
            return this.f79241a.name();
        }

        public final int hashCode() {
            return this.f79241a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79241a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$SplitSummaryTab$Itemize;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$SplitSummaryTab;", "<init>", "()V", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Itemize implements SplitBillsSummaryScreenContract$SplitSummaryTab {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Itemize f79242a = new Itemize();

        @NotNull
        public static final Parcelable.Creator<Itemize> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Itemize.f79242a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Itemize[i];
            }
        }

        private Itemize() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$SplitSummaryTab
        public final String getName() {
            return "ITEMIZE";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$SplitSummaryTab$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f79243a = new Companion();

        private Companion() {
        }
    }

    String getName();
}
