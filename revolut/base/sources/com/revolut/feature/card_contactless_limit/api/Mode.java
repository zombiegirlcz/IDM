package com.revolut.feature.card_contactless_limit.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card_contactless_limit/api/Mode;", "Landroid/os/Parcelable;", "<init>", "()V", "SingleCard", "AllCardsLimitWarning", "Lcom/revolut/feature/card_contactless_limit/api/Mode$AllCardsLimitWarning;", "Lcom/revolut/feature/card_contactless_limit/api/Mode$SingleCard;", "feature_card_contactless_limit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Mode implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_contactless_limit/api/Mode$AllCardsLimitWarning;", "Lcom/revolut/feature/card_contactless_limit/api/Mode;", "", "toString", "()Ljava/lang/String;", "feature_card_contactless_limit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllCardsLimitWarning extends Mode {

        @NotNull
        public static final Parcelable.Creator<AllCardsLimitWarning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f64512c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllCardsLimitWarning(parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllCardsLimitWarning[i];
            }
        }

        public AllCardsLimitWarning(String str, int i, int i2) {
            this.f64510a = str;
            this.f64511b = i;
            this.f64512c = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AllCardsLimitWarning)) {
                return false;
            }
            AllCardsLimitWarning allCardsLimitWarning = (AllCardsLimitWarning) obj2;
            return Intrinsics.f(this.f64510a, allCardsLimitWarning.f64510a) && this.f64511b == allCardsLimitWarning.f64511b && this.f64512c == allCardsLimitWarning.f64512c;
        }

        public final int hashCode() {
            String str = this.f64510a;
            return Integer.hashCode(this.f64512c) + j6.a.b(this.f64511b, (str == null ? 0 : str.hashCode()) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64510a);
            dest.writeInt(this.f64511b);
            dest.writeInt(this.f64512c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_contactless_limit/api/Mode$SingleCard;", "Lcom/revolut/feature/card_contactless_limit/api/Mode;", "", "toString", "()Ljava/lang/String;", "feature_card_contactless_limit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleCard extends Mode {

        @NotNull
        public static final Parcelable.Creator<SingleCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64514b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleCard(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleCard[i];
            }
        }

        public SingleCard(String cardId, int i) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64513a = cardId;
            this.f64514b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SingleCard)) {
                return false;
            }
            SingleCard singleCard = (SingleCard) obj2;
            return Intrinsics.f(this.f64513a, singleCard.f64513a) && this.f64514b == singleCard.f64514b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f64514b) + (this.f64513a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64513a);
            dest.writeInt(this.f64514b);
        }
    }

    private Mode() {
    }
}
