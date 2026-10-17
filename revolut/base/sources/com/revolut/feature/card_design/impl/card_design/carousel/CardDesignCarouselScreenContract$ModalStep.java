package com.revolut.feature.card_design.impl.card_design.carousel;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.navigable.flow.FlowStep;
import e93.j0;
import hx2.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CardLimits", "CardCustomisation", "LocalGlobalCardInfo", "RevPointsPriceBreakdown", "Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep$CardCustomisation;", "Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep$CardLimits;", "Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep$LocalGlobalCardInfo;", "Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep$RevPointsPriceBreakdown;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardDesignCarouselScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep$CardCustomisation;", "Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardCustomisation implements CardDesignCarouselScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CardCustomisation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e93.f f64695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hha.d f64696b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardCustomisation((e93.f) parcel.readSerializable(), (hha.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardCustomisation[i];
            }
        }

        public CardCustomisation(e93.f cardDesign, hha.d dVar) {
            Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
            this.f64695a = cardDesign;
            this.f64696b = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardCustomisation)) {
                return false;
            }
            CardCustomisation cardCustomisation = (CardCustomisation) obj2;
            return Intrinsics.f(this.f64695a, cardCustomisation.f64695a) && Intrinsics.f(this.f64696b, cardCustomisation.f64696b);
        }

        public final int hashCode() {
            int iHashCode = this.f64695a.hashCode() * 31;
            hha.d dVar = this.f64696b;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64695a);
            dest.writeSerializable(this.f64696b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep$CardLimits;", "Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardLimits implements CardDesignCarouselScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CardLimits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e93.f f64697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JuniorBankingProfile f64698b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardLimits((e93.f) parcel.readSerializable(), (JuniorBankingProfile) parcel.readParcelable(CardLimits.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardLimits[i];
            }
        }

        public CardLimits(e93.f cardDesign, JuniorBankingProfile juniorBankingProfile) {
            Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
            this.f64697a = cardDesign;
            this.f64698b = juniorBankingProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardLimits)) {
                return false;
            }
            CardLimits cardLimits = (CardLimits) obj2;
            return Intrinsics.f(this.f64697a, cardLimits.f64697a) && Intrinsics.f(this.f64698b, cardLimits.f64698b);
        }

        public final int hashCode() {
            int iHashCode = this.f64697a.hashCode() * 31;
            JuniorBankingProfile juniorBankingProfile = this.f64698b;
            return iHashCode + (juniorBankingProfile == null ? 0 : juniorBankingProfile.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64697a);
            dest.writeParcelable(this.f64698b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep$LocalGlobalCardInfo;", "Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocalGlobalCardInfo implements CardDesignCarouselScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LocalGlobalCardInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c93.e f64699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f64700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f64701c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LocalGlobalCardInfo(c93.e.valueOf(parcel.readString()), h.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocalGlobalCardInfo[i];
            }
        }

        public LocalGlobalCardInfo(c93.e cardType, h infoVariant, boolean z, String str) {
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            Intrinsics.checkNotNullParameter(infoVariant, "infoVariant");
            this.f64699a = cardType;
            this.f64700b = infoVariant;
            this.f64701c = z;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LocalGlobalCardInfo)) {
                return false;
            }
            LocalGlobalCardInfo localGlobalCardInfo = (LocalGlobalCardInfo) obj2;
            return this.f64699a == localGlobalCardInfo.f64699a && this.f64700b == localGlobalCardInfo.f64700b && this.f64701c == localGlobalCardInfo.f64701c && Intrinsics.f(this.d, localGlobalCardInfo.d);
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f64700b.hashCode() + (this.f64699a.hashCode() * 31)) * 31, 31, this.f64701c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64699a.name());
            dest.writeString(this.f64700b.name());
            dest.writeInt(this.f64701c ? 1 : 0);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep$RevPointsPriceBreakdown;", "Lcom/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsPriceBreakdown implements CardDesignCarouselScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPointsPriceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f64702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j0 f64703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f64704c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                j0 j0Var = (j0) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new RevPointsPriceBreakdown(dVar, j0Var, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsPriceBreakdown[i];
            }
        }

        public RevPointsPriceBreakdown(dj0.d originalPrice, j0 loyaltyQuote, List taxes) {
            Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
            Intrinsics.checkNotNullParameter(loyaltyQuote, "loyaltyQuote");
            Intrinsics.checkNotNullParameter(taxes, "taxes");
            this.f64702a = originalPrice;
            this.f64703b = loyaltyQuote;
            this.f64704c = taxes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevPointsPriceBreakdown)) {
                return false;
            }
            RevPointsPriceBreakdown revPointsPriceBreakdown = (RevPointsPriceBreakdown) obj2;
            return Intrinsics.f(this.f64702a, revPointsPriceBreakdown.f64702a) && Intrinsics.f(this.f64703b, revPointsPriceBreakdown.f64703b) && Intrinsics.f(this.f64704c, revPointsPriceBreakdown.f64704c);
        }

        public final int hashCode() {
            return this.f64704c.hashCode() + ((this.f64703b.hashCode() + (this.f64702a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64702a);
            dest.writeSerializable(this.f64703b);
            Iterator itV = p.a.v(this.f64704c, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }
}
