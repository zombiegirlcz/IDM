package com.revolut.feature.card_input.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card_input/api/CardInputFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "CardActivation", "LinkCard", "Lcom/revolut/feature/card_input/api/CardInputFeatureConfig$CardActivation;", "Lcom/revolut/feature/card_input/api/CardInputFeatureConfig$LinkCard;", "feature_card_input_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardInputFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_input/api/CardInputFeatureConfig$LinkCard;", "Lcom/revolut/feature/card_input/api/CardInputFeatureConfig;", "<init>", "()V", "feature_card_input_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LinkCard extends CardInputFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LinkCard f64743a = new LinkCard();

        @NotNull
        public static final Parcelable.Creator<LinkCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LinkCard.f64743a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkCard[i];
            }
        }

        private LinkCard() {
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

    private CardInputFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_input/api/CardInputFeatureConfig$CardActivation;", "Lcom/revolut/feature/card_input/api/CardInputFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_input_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardActivation extends CardInputFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CardActivation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64742c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardActivation(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardActivation[i];
            }
        }

        public CardActivation(String str, String str2, boolean z) {
            this.f64740a = str;
            this.f64741b = z;
            this.f64742c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardActivation)) {
                return false;
            }
            CardActivation cardActivation = (CardActivation) obj2;
            return Intrinsics.f(this.f64740a, cardActivation.f64740a) && this.f64741b == cardActivation.f64741b && Intrinsics.f(this.f64742c, cardActivation.f64742c);
        }

        public final int hashCode() {
            String str = this.f64740a;
            int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f64741b);
            String str2 = this.f64742c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64740a);
            dest.writeInt(this.f64741b ? 1 : 0);
            dest.writeString(this.f64742c);
        }

        public /* synthetic */ CardActivation(String str) {
            this(str, null, false);
        }
    }
}
