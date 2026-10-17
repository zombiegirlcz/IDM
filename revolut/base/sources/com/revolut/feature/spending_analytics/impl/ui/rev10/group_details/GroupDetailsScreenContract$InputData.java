package com.revolut.feature.spending_analytics.impl.ui.rev10.group_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Group", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GroupDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Group f87687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CategorisationFilter f87688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsAccountsSelection f87689c;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group;", "Landroid/os/Parcelable;", "<init>", "()V", "CategoryGroup", "MerchantGroup", "CountryGroup", "CurrencyGroup", "CardholderGroup", "ParticipantGroup", "SavingsTransactionType", "SavingsOperationType", "SourceAccountGroup", "CardGroup", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$CardGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$CardholderGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$CategoryGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$CountryGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$CurrencyGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$MerchantGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$ParticipantGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$SavingsOperationType;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$SavingsTransactionType;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$SourceAccountGroup;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Group implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$CardGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CardGroup extends Group {

            @NotNull
            public static final Parcelable.Creator<CardGroup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87690a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final f0 f87691b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TerminatedCard f87692c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CardGroup(parcel.readString(), (f0) parcel.readSerializable(), (TerminatedCard) parcel.readParcelable(CardGroup.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CardGroup[i];
                }
            }

            public CardGroup(String cardId, f0 f0Var, TerminatedCard terminatedCard) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.f87690a = cardId;
                this.f87691b = f0Var;
                this.f87692c = terminatedCard;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CardGroup)) {
                    return false;
                }
                CardGroup cardGroup = (CardGroup) obj2;
                return Intrinsics.f(this.f87690a, cardGroup.f87690a) && Intrinsics.f(this.f87691b, cardGroup.f87691b) && Intrinsics.f(this.f87692c, cardGroup.f87692c);
            }

            public final int hashCode() {
                int iHashCode = this.f87690a.hashCode() * 31;
                f0 f0Var = this.f87691b;
                int iHashCode2 = (iHashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
                TerminatedCard terminatedCard = this.f87692c;
                return iHashCode2 + (terminatedCard != null ? terminatedCard.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87690a);
                dest.writeSerializable(this.f87691b);
                dest.writeParcelable(this.f87692c, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$CardholderGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CardholderGroup extends Group {

            @NotNull
            public static final Parcelable.Creator<CardholderGroup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87693a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f87694b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CardholderGroup(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CardholderGroup[i];
                }
            }

            public CardholderGroup(String cardholderId, String str) {
                Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
                this.f87693a = cardholderId;
                this.f87694b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CardholderGroup)) {
                    return false;
                }
                CardholderGroup cardholderGroup = (CardholderGroup) obj2;
                return Intrinsics.f(this.f87693a, cardholderGroup.f87693a) && Intrinsics.f(this.f87694b, cardholderGroup.f87694b);
            }

            public final int hashCode() {
                int iHashCode = this.f87693a.hashCode() * 31;
                String str = this.f87694b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87693a);
                dest.writeString(this.f87694b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$CategoryGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CategoryGroup extends Group {

            @NotNull
            public static final Parcelable.Creator<CategoryGroup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final i3 f87695a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CategoryGroup((i3) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CategoryGroup[i];
                }
            }

            public CategoryGroup(i3 category) {
                Intrinsics.checkNotNullParameter(category, "category");
                this.f87695a = category;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CategoryGroup) && Intrinsics.f(this.f87695a, ((CategoryGroup) obj2).f87695a);
            }

            public final int hashCode() {
                return this.f87695a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f87695a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$CountryGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CountryGroup extends Group {

            @NotNull
            public static final Parcelable.Creator<CountryGroup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87696a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CountryGroup(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CountryGroup[i];
                }
            }

            public CountryGroup(String countryId) {
                Intrinsics.checkNotNullParameter(countryId, "countryId");
                this.f87696a = countryId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CountryGroup) && Intrinsics.f(this.f87696a, ((CountryGroup) obj2).f87696a);
            }

            public final int hashCode() {
                return this.f87696a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87696a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$CurrencyGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CurrencyGroup extends Group {

            @NotNull
            public static final Parcelable.Creator<CurrencyGroup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87697a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CurrencyGroup(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CurrencyGroup[i];
                }
            }

            public CurrencyGroup(String currency) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.f87697a = currency;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CurrencyGroup) && Intrinsics.f(this.f87697a, ((CurrencyGroup) obj2).f87697a);
            }

            public final int hashCode() {
                return this.f87697a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87697a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$MerchantGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MerchantGroup extends Group {

            @NotNull
            public static final Parcelable.Creator<MerchantGroup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87698a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MerchantGroup(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MerchantGroup[i];
                }
            }

            public MerchantGroup(String merchantId) {
                Intrinsics.checkNotNullParameter(merchantId, "merchantId");
                this.f87698a = merchantId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof MerchantGroup) && Intrinsics.f(this.f87698a, ((MerchantGroup) obj2).f87698a);
            }

            public final int hashCode() {
                return this.f87698a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87698a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$ParticipantGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ParticipantGroup extends Group {

            @NotNull
            public static final Parcelable.Creator<ParticipantGroup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87699a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ParticipantGroup(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ParticipantGroup[i];
                }
            }

            public ParticipantGroup(String participantId) {
                Intrinsics.checkNotNullParameter(participantId, "participantId");
                this.f87699a = participantId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ParticipantGroup) && Intrinsics.f(this.f87699a, ((ParticipantGroup) obj2).f87699a);
            }

            public final int hashCode() {
                return this.f87699a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87699a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$SavingsOperationType;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SavingsOperationType extends Group {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SavingsOperationType f87700a = new SavingsOperationType();

            @NotNull
            public static final Parcelable.Creator<SavingsOperationType> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SavingsOperationType.f87700a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SavingsOperationType[i];
                }
            }

            private SavingsOperationType() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$SavingsTransactionType;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SavingsTransactionType extends Group {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SavingsTransactionType f87701a = new SavingsTransactionType();

            @NotNull
            public static final Parcelable.Creator<SavingsTransactionType> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SavingsTransactionType.f87701a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SavingsTransactionType[i];
                }
            }

            private SavingsTransactionType() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group$SourceAccountGroup;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$InputData$Group;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SourceAccountGroup extends Group {

            @NotNull
            public static final Parcelable.Creator<SourceAccountGroup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87702a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final GroupingExtraData.SourceAccount.AccountPocketSource f87703b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SourceAccountGroup(parcel.readString(), (GroupingExtraData.SourceAccount.AccountPocketSource) parcel.readParcelable(SourceAccountGroup.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SourceAccountGroup[i];
                }
            }

            public SourceAccountGroup(String pocketId, GroupingExtraData.SourceAccount.AccountPocketSource accountPocketSource) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f87702a = pocketId;
                this.f87703b = accountPocketSource;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SourceAccountGroup)) {
                    return false;
                }
                SourceAccountGroup sourceAccountGroup = (SourceAccountGroup) obj2;
                return Intrinsics.f(this.f87702a, sourceAccountGroup.f87702a) && Intrinsics.f(this.f87703b, sourceAccountGroup.f87703b);
            }

            public final int hashCode() {
                int iHashCode = this.f87702a.hashCode() * 31;
                GroupingExtraData.SourceAccount.AccountPocketSource accountPocketSource = this.f87703b;
                return iHashCode + (accountPocketSource == null ? 0 : accountPocketSource.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87702a);
                dest.writeParcelable(this.f87703b, i);
            }
        }

        private Group() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupDetailsScreenContract$InputData((Group) parcel.readParcelable(GroupDetailsScreenContract$InputData.class.getClassLoader()), (CategorisationFilter) parcel.readParcelable(GroupDetailsScreenContract$InputData.class.getClassLoader()), (AnalyticsAccountsSelection) parcel.readParcelable(GroupDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupDetailsScreenContract$InputData[i];
        }
    }

    public GroupDetailsScreenContract$InputData(Group group, CategorisationFilter categorisationFilter, AnalyticsAccountsSelection analyticsAccountsSelection) {
        Intrinsics.checkNotNullParameter(categorisationFilter, "categorisationFilter");
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "analyticsAccountsSelection");
        this.f87687a = group;
        this.f87688b = categorisationFilter;
        this.f87689c = analyticsAccountsSelection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GroupDetailsScreenContract$InputData)) {
            return false;
        }
        GroupDetailsScreenContract$InputData groupDetailsScreenContract$InputData = (GroupDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f87687a, groupDetailsScreenContract$InputData.f87687a) && Intrinsics.f(this.f87688b, groupDetailsScreenContract$InputData.f87688b) && Intrinsics.f(this.f87689c, groupDetailsScreenContract$InputData.f87689c);
    }

    public final int hashCode() {
        Group group = this.f87687a;
        return this.f87689c.hashCode() + ((this.f87688b.hashCode() + ((group == null ? 0 : group.hashCode()) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87687a, i);
        dest.writeParcelable(this.f87688b, i);
        dest.writeParcelable(this.f87689c, i);
    }
}
