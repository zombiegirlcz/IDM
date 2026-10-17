package com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature_retail_user_declarations/transaction_countries/countries_selection/CountriesSelectionScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ExpectedAmount", "Lcom/revolut/feature_retail_user_declarations/transaction_countries/countries_selection/CountriesSelectionScreenContract$ModalStep$ExpectedAmount;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CountriesSelectionScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/transaction_countries/countries_selection/CountriesSelectionScreenContract$ModalStep$ExpectedAmount;", "Lcom/revolut/feature_retail_user_declarations/transaction_countries/countries_selection/CountriesSelectionScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpectedAmount extends CountriesSelectionScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExpectedAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f97761a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExpectedAmount((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpectedAmount[i];
            }
        }

        public ExpectedAmount(b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f97761a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExpectedAmount) && Intrinsics.f(this.f97761a, ((ExpectedAmount) obj2).f97761a);
        }

        public final int hashCode() {
            return this.f97761a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97761a);
        }
    }

    private CountriesSelectionScreenContract$ModalStep() {
    }
}
