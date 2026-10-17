package com.revolut.core.backend_flow.impl.ui.form_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.backend_flow.domain.models.DropDownItem;
import com.revolut.feature.backend_flow.domain.models.MoneyInputItem;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CurrencySelection", "CountrySelection", "PhoneCodeSelection", "DropDownOptionSelection", "CardPhoto", "Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep$CardPhoto;", "Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep$CountrySelection;", "Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep$CurrencySelection;", "Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep$DropDownOptionSelection;", "Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep$PhoneCodeSelection;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FormControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep$CardPhoto;", "Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardPhoto implements FormControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CardPhoto> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51278a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardPhoto(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardPhoto[i];
            }
        }

        public CardPhoto(String itemId) {
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            this.f51278a = itemId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardPhoto) && Intrinsics.f(this.f51278a, ((CardPhoto) obj2).f51278a);
        }

        public final int hashCode() {
            return this.f51278a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51278a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep$CountrySelection;", "Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountrySelection implements FormControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CountrySelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountrySelectionItem f51279a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountrySelection((CountrySelectionItem) parcel.readParcelable(CountrySelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountrySelection[i];
            }
        }

        public CountrySelection(CountrySelectionItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f51279a = item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CountrySelection) && Intrinsics.f(this.f51279a, ((CountrySelection) obj2).f51279a);
        }

        public final int hashCode() {
            return this.f51279a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51279a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep$CurrencySelection;", "Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencySelection implements FormControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CurrencySelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoneyInputItem f51280a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencySelection((MoneyInputItem) parcel.readParcelable(CurrencySelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencySelection[i];
            }
        }

        public CurrencySelection(MoneyInputItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f51280a = item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CurrencySelection) && Intrinsics.f(this.f51280a, ((CurrencySelection) obj2).f51280a);
        }

        public final int hashCode() {
            return this.f51280a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51280a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep$DropDownOptionSelection;", "Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DropDownOptionSelection implements FormControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DropDownOptionSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DropDownItem f51281a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DropDownOptionSelection((DropDownItem) parcel.readParcelable(DropDownOptionSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DropDownOptionSelection[i];
            }
        }

        public DropDownOptionSelection(DropDownItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f51281a = item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DropDownOptionSelection) && Intrinsics.f(this.f51281a, ((DropDownOptionSelection) obj2).f51281a);
        }

        public final int hashCode() {
            return this.f51281a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51281a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep$PhoneCodeSelection;", "Lcom/revolut/core/backend_flow/impl/ui/form_screen/FormControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneCodeSelection implements FormControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PhoneCodeSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PhoneInputItem f51282a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneCodeSelection((PhoneInputItem) parcel.readParcelable(PhoneCodeSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneCodeSelection[i];
            }
        }

        public PhoneCodeSelection(PhoneInputItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f51282a = item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PhoneCodeSelection) && Intrinsics.f(this.f51282a, ((PhoneCodeSelection) obj2).f51282a);
        }

        public final int hashCode() {
            return this.f51282a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51282a, i);
        }
    }
}
