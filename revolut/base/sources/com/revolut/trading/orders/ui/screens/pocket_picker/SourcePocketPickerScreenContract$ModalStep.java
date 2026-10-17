package com.revolut.trading.orders.ui.screens.pocket_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CurrencyChooser", "MarginBorrowingLimitExplanation", "SectionExplanation", "Lcom/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerScreenContract$ModalStep$CurrencyChooser;", "Lcom/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerScreenContract$ModalStep$MarginBorrowingLimitExplanation;", "Lcom/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerScreenContract$ModalStep$SectionExplanation;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SourcePocketPickerScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerScreenContract$ModalStep$CurrencyChooser;", "Lcom/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyChooser implements SourcePocketPickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CurrencyChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f107045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f107046b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                while (iD != i) {
                    iD = v7.d(parcel, linkedHashSet, iD, 1);
                }
                return new CurrencyChooser(linkedHashSet, (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyChooser[i];
            }
        }

        public CurrencyChooser(Set currencies, xi0.b bVar) {
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            this.f107045a = currencies;
            this.f107046b = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyChooser)) {
                return false;
            }
            CurrencyChooser currencyChooser = (CurrencyChooser) obj2;
            return Intrinsics.f(this.f107045a, currencyChooser.f107045a) && Intrinsics.f(this.f107046b, currencyChooser.f107046b);
        }

        public final int hashCode() {
            int iHashCode = this.f107045a.hashCode() * 31;
            xi0.b bVar = this.f107046b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f107045a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeSerializable(this.f107046b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerScreenContract$ModalStep$MarginBorrowingLimitExplanation;", "Lcom/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerScreenContract$ModalStep;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MarginBorrowingLimitExplanation implements SourcePocketPickerScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MarginBorrowingLimitExplanation f107047a = new MarginBorrowingLimitExplanation();

        @NotNull
        public static final Parcelable.Creator<MarginBorrowingLimitExplanation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MarginBorrowingLimitExplanation.f107047a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarginBorrowingLimitExplanation[i];
            }
        }

        private MarginBorrowingLimitExplanation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerScreenContract$ModalStep$SectionExplanation;", "Lcom/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SectionExplanation implements SourcePocketPickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SectionExplanation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f107048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f107049b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SectionExplanation((Clause) parcel.readParcelable(SectionExplanation.class.getClassLoader()), (Clause) parcel.readParcelable(SectionExplanation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SectionExplanation[i];
            }
        }

        public SectionExplanation(Clause title, Clause explanation) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(explanation, "explanation");
            this.f107048a = title;
            this.f107049b = explanation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SectionExplanation)) {
                return false;
            }
            SectionExplanation sectionExplanation = (SectionExplanation) obj2;
            return Intrinsics.f(this.f107048a, sectionExplanation.f107048a) && Intrinsics.f(this.f107049b, sectionExplanation.f107049b);
        }

        public final int hashCode() {
            return this.f107049b.hashCode() + (this.f107048a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f107048a, i);
            dest.writeParcelable(this.f107049b, i);
        }
    }
}
