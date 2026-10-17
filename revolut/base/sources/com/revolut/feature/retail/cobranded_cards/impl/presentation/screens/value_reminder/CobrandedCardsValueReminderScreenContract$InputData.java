package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "Downgrade", "Terminate", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$InputData$Downgrade;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$InputData$Terminate;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsValueReminderScreenContract$InputData extends IOData$Input, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$InputData$Downgrade;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Downgrade implements CobrandedCardsValueReminderScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Downgrade> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlan f82611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CobrandedCardsCardConfiguration f82612b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Downgrade((CobrandedCardsPlan) parcel.readParcelable(Downgrade.class.getClassLoader()), (CobrandedCardsCardConfiguration) parcel.readParcelable(Downgrade.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Downgrade[i];
            }
        }

        public Downgrade(CobrandedCardsPlan plan, CobrandedCardsCardConfiguration selectedCardConfiguration) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            Intrinsics.checkNotNullParameter(selectedCardConfiguration, "selectedCardConfiguration");
            this.f82611a = plan;
            this.f82612b = selectedCardConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Downgrade)) {
                return false;
            }
            Downgrade downgrade = (Downgrade) obj2;
            return Intrinsics.f(this.f82611a, downgrade.f82611a) && Intrinsics.f(this.f82612b, downgrade.f82612b);
        }

        public final int hashCode() {
            return this.f82612b.hashCode() + (this.f82611a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82611a, i);
            dest.writeParcelable(this.f82612b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$InputData$Terminate;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Terminate implements CobrandedCardsValueReminderScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Terminate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82613a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Terminate(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terminate[i];
            }
        }

        public Terminate(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f82613a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Terminate) && Intrinsics.f(this.f82613a, ((Terminate) obj2).f82613a);
        }

        public final int hashCode() {
            return this.f82613a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82613a);
        }
    }
}
