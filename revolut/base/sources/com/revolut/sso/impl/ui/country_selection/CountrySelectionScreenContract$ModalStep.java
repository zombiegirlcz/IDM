package com.revolut.sso.impl.ui.country_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/country_selection/CountrySelectionScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CountryPicker", "Terms", "Lcom/revolut/sso/impl/ui/country_selection/CountrySelectionScreenContract$ModalStep$CountryPicker;", "Lcom/revolut/sso/impl/ui/country_selection/CountrySelectionScreenContract$ModalStep$Terms;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CountrySelectionScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/country_selection/CountrySelectionScreenContract$ModalStep$CountryPicker;", "Lcom/revolut/sso/impl/ui/country_selection/CountrySelectionScreenContract$ModalStep;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountryPicker implements CountrySelectionScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountryPicker f106501a = new CountryPicker();

        @NotNull
        public static final Parcelable.Creator<CountryPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountryPicker.f106501a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryPicker[i];
            }
        }

        private CountryPicker() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/country_selection/CountrySelectionScreenContract$ModalStep$Terms;", "Lcom/revolut/sso/impl/ui/country_selection/CountrySelectionScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Terms implements CountrySelectionScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Terms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f106503b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Terms(parcel.readString(), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terms[i];
            }
        }

        public Terms(String listId, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f106502a = listId;
            this.f106503b = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Terms)) {
                return false;
            }
            Terms terms = (Terms) obj2;
            return Intrinsics.f(this.f106502a, terms.f106502a) && Intrinsics.f(this.f106503b, terms.f106503b);
        }

        public final int hashCode() {
            return this.f106503b.f297794a.hashCode() + (this.f106502a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106502a);
            dest.writeSerializable(this.f106503b);
        }
    }
}
