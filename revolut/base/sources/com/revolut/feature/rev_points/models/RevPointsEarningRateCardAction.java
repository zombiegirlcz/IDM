package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsEarningRateCardAction;", "Landroid/os/Parcelable;", "<init>", "()V", "NoAction", "OrderCard", "ActivateCard", "Lcom/revolut/feature/rev_points/models/RevPointsEarningRateCardAction$ActivateCard;", "Lcom/revolut/feature/rev_points/models/RevPointsEarningRateCardAction$NoAction;", "Lcom/revolut/feature/rev_points/models/RevPointsEarningRateCardAction$OrderCard;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsEarningRateCardAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsEarningRateCardAction$ActivateCard;", "Lcom/revolut/feature/rev_points/models/RevPointsEarningRateCardAction;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActivateCard extends RevPointsEarningRateCardAction {

        @NotNull
        public static final Parcelable.Creator<ActivateCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83978a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActivateCard(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActivateCard[i];
            }
        }

        public ActivateCard(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f83978a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ActivateCard) && Intrinsics.f(this.f83978a, ((ActivateCard) obj2).f83978a);
        }

        public final int hashCode() {
            return this.f83978a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83978a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsEarningRateCardAction$NoAction;", "Lcom/revolut/feature/rev_points/models/RevPointsEarningRateCardAction;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoAction extends RevPointsEarningRateCardAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoAction f83979a = new NoAction();

        @NotNull
        public static final Parcelable.Creator<NoAction> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoAction.f83979a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoAction[i];
            }
        }

        private NoAction() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsEarningRateCardAction$OrderCard;", "Lcom/revolut/feature/rev_points/models/RevPointsEarningRateCardAction;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OrderCard extends RevPointsEarningRateCardAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderCard f83980a = new OrderCard();

        @NotNull
        public static final Parcelable.Creator<OrderCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OrderCard.f83980a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderCard[i];
            }
        }

        private OrderCard() {
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

    private RevPointsEarningRateCardAction() {
    }
}
