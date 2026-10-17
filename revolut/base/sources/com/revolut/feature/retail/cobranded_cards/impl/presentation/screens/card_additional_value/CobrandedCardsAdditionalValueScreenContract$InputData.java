package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "WithPlan", "CurrentPlan", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$InputData$CurrentPlan;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$InputData$WithPlan;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsAdditionalValueScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$InputData$CurrentPlan;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$InputData;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CurrentPlan implements CobrandedCardsAdditionalValueScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CurrentPlan f82550a = new CurrentPlan();

        @NotNull
        public static final Parcelable.Creator<CurrentPlan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CurrentPlan.f82550a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentPlan[i];
            }
        }

        private CurrentPlan() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$InputData$WithPlan;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithPlan implements CobrandedCardsAdditionalValueScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlan f82551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82552b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithPlan((CobrandedCardsPlan) parcel.readParcelable(WithPlan.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithPlan[i];
            }
        }

        public WithPlan(CobrandedCardsPlan plan, String str) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.f82551a = plan;
            this.f82552b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithPlan)) {
                return false;
            }
            WithPlan withPlan = (WithPlan) obj2;
            return Intrinsics.f(this.f82551a, withPlan.f82551a) && Intrinsics.f(this.f82552b, withPlan.f82552b);
        }

        public final int hashCode() {
            int iHashCode = this.f82551a.hashCode() * 31;
            String str = this.f82552b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82551a, i);
            dest.writeString(this.f82552b);
        }
    }
}
