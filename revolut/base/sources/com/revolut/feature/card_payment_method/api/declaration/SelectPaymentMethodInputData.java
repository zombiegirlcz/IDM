package com.revolut.feature.card_payment_method.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_payment_method/api/declaration/SelectPaymentMethodInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "UseCase", "feature_card_payment_method_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectPaymentMethodInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectPaymentMethodInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UseCase f65244a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card_payment_method/api/declaration/SelectPaymentMethodInputData$UseCase;", "Landroid/os/Parcelable;", "<init>", "()V", "OrderNewCard", "UpdateExistingCardSettings", "Lcom/revolut/feature/card_payment_method/api/declaration/SelectPaymentMethodInputData$UseCase$OrderNewCard;", "Lcom/revolut/feature/card_payment_method/api/declaration/SelectPaymentMethodInputData$UseCase$UpdateExistingCardSettings;", "feature_card_payment_method_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class UseCase implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_payment_method/api/declaration/SelectPaymentMethodInputData$UseCase$OrderNewCard;", "Lcom/revolut/feature/card_payment_method/api/declaration/SelectPaymentMethodInputData$UseCase;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/card_payment_method/api/declaration/a", "feature_card_payment_method_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OrderNewCard extends UseCase {

            @NotNull
            public static final Parcelable.Creator<OrderNewCard> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AccountId f65245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.revolut.feature.card_payment_method.api.declaration.a f65246b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f65247c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OrderNewCard((AccountId) parcel.readParcelable(OrderNewCard.class.getClassLoader()), com.revolut.feature.card_payment_method.api.declaration.a.valueOf(parcel.readString()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OrderNewCard[i];
                }
            }

            public OrderNewCard() {
                this((com.revolut.feature.card_payment_method.api.declaration.a) null, false, 7);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OrderNewCard)) {
                    return false;
                }
                OrderNewCard orderNewCard = (OrderNewCard) obj2;
                return Intrinsics.f(this.f65245a, orderNewCard.f65245a) && this.f65246b == orderNewCard.f65246b && this.f65247c == orderNewCard.f65247c;
            }

            @Override // com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData.UseCase
            /* JADX INFO: renamed from: getAccountId, reason: from getter */
            public final AccountId getF65249b() {
                return this.f65245a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f65247c) + ((this.f65246b.hashCode() + (this.f65245a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f65245a, i);
                dest.writeString(this.f65246b.name());
                dest.writeInt(this.f65247c ? 1 : 0);
            }

            public OrderNewCard(AccountId accountId, com.revolut.feature.card_payment_method.api.declaration.a cardType, boolean z) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(cardType, "cardType");
                this.f65245a = accountId;
                this.f65246b = cardType;
                this.f65247c = z;
            }

            public /* synthetic */ OrderNewCard(com.revolut.feature.card_payment_method.api.declaration.a aVar, boolean z, int i) {
                this(AccountId.Personal.f51414a, (i & 2) != 0 ? com.revolut.feature.card_payment_method.api.declaration.a.FIAT : aVar, (i & 4) != 0 ? false : z);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/api/declaration/SelectPaymentMethodInputData$UseCase$UpdateExistingCardSettings;", "Lcom/revolut/feature/card_payment_method/api/declaration/SelectPaymentMethodInputData$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UpdateExistingCardSettings extends UseCase {

            @NotNull
            public static final Parcelable.Creator<UpdateExistingCardSettings> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f0 f65248a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AccountId f65249b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UpdateExistingCardSettings((f0) parcel.readSerializable(), (AccountId) parcel.readParcelable(UpdateExistingCardSettings.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UpdateExistingCardSettings[i];
                }
            }

            public UpdateExistingCardSettings(f0 card, AccountId accountId) {
                Intrinsics.checkNotNullParameter(card, "card");
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f65248a = card;
                this.f65249b = accountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof UpdateExistingCardSettings)) {
                    return false;
                }
                UpdateExistingCardSettings updateExistingCardSettings = (UpdateExistingCardSettings) obj2;
                return Intrinsics.f(this.f65248a, updateExistingCardSettings.f65248a) && Intrinsics.f(this.f65249b, updateExistingCardSettings.f65249b);
            }

            @Override // com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData.UseCase
            /* JADX INFO: renamed from: getAccountId, reason: from getter */
            public final AccountId getF65249b() {
                return this.f65249b;
            }

            public final int hashCode() {
                return this.f65249b.hashCode() + (this.f65248a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f65248a);
                dest.writeParcelable(this.f65249b, i);
            }
        }

        private UseCase() {
        }

        public final boolean a() {
            return (this instanceof OrderNewCard) && ((OrderNewCard) this).f65246b == com.revolut.feature.card_payment_method.api.declaration.a.CRYPTO;
        }

        /* JADX INFO: renamed from: getAccountId */
        public abstract AccountId getF65249b();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectPaymentMethodInputData((UseCase) parcel.readParcelable(SelectPaymentMethodInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectPaymentMethodInputData[i];
        }
    }

    public SelectPaymentMethodInputData(UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.f65244a = useCase;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SelectPaymentMethodInputData) && Intrinsics.f(this.f65244a, ((SelectPaymentMethodInputData) obj2).f65244a);
    }

    public final int hashCode() {
        return this.f65244a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65244a, i);
    }
}
