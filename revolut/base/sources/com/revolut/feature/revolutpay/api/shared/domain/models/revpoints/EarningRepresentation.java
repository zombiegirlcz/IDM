package com.revolut.feature.revolutpay.api.shared.domain.models.revpoints;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation;", "Landroid/os/Parcelable;", "Empty", "CardRule", "BoostedRule", "BusinessRule", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation$BoostedRule;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation$BusinessRule;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation$CardRule;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation$Empty;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EarningRepresentation extends Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation$BoostedRule;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/RevPointsEarningRuleApplied;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BoostedRule implements EarningRepresentation, RevPointsEarningRuleApplied {

        @NotNull
        public static final Parcelable.Creator<BoostedRule> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsEarningRule f84418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RevPointsEarningRule f84419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigDecimal f84420c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable.Creator<RevPointsEarningRule> creator = RevPointsEarningRule.CREATOR;
                return new BoostedRule(creator.createFromParcel(parcel), creator.createFromParcel(parcel), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BoostedRule[i];
            }
        }

        public BoostedRule(RevPointsEarningRule cardEarningRule, RevPointsEarningRule multipliedEarningRule, BigDecimal multiplier) {
            Intrinsics.checkNotNullParameter(cardEarningRule, "cardEarningRule");
            Intrinsics.checkNotNullParameter(multipliedEarningRule, "multipliedEarningRule");
            Intrinsics.checkNotNullParameter(multiplier, "multiplier");
            this.f84418a = cardEarningRule;
            this.f84419b = multipliedEarningRule;
            this.f84420c = multiplier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BoostedRule)) {
                return false;
            }
            BoostedRule boostedRule = (BoostedRule) obj2;
            return Intrinsics.f(this.f84418a, boostedRule.f84418a) && Intrinsics.f(this.f84419b, boostedRule.f84419b) && Intrinsics.f(this.f84420c, boostedRule.f84420c);
        }

        public final int hashCode() {
            return this.f84420c.hashCode() + ((this.f84419b.hashCode() + (this.f84418a.hashCode() * 31)) * 31);
        }

        @Override // com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPointsEarningRuleApplied
        /* JADX INFO: renamed from: k9, reason: from getter */
        public final RevPointsEarningRule getF84422a() {
            return this.f84419b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f84418a.writeToParcel(dest, i);
            this.f84419b.writeToParcel(dest, i);
            dest.writeSerializable(this.f84420c);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation$BusinessRule;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/RevPointsEarningRuleApplied;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BusinessRule implements EarningRepresentation, RevPointsEarningRuleApplied {

        @NotNull
        public static final Parcelable.Creator<BusinessRule> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsEarningRule f84421a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BusinessRule(RevPointsEarningRule.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BusinessRule[i];
            }
        }

        public BusinessRule(RevPointsEarningRule earningRule) {
            Intrinsics.checkNotNullParameter(earningRule, "earningRule");
            this.f84421a = earningRule;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BusinessRule) && Intrinsics.f(this.f84421a, ((BusinessRule) obj2).f84421a);
        }

        public final int hashCode() {
            return this.f84421a.hashCode();
        }

        @Override // com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPointsEarningRuleApplied
        /* JADX INFO: renamed from: k9, reason: from getter */
        public final RevPointsEarningRule getF84422a() {
            return this.f84421a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f84421a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation$CardRule;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/RevPointsEarningRuleApplied;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardRule implements EarningRepresentation, RevPointsEarningRuleApplied {

        @NotNull
        public static final Parcelable.Creator<CardRule> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsEarningRule f84422a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardRule(RevPointsEarningRule.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardRule[i];
            }
        }

        public CardRule(RevPointsEarningRule cardEarningRule) {
            Intrinsics.checkNotNullParameter(cardEarningRule, "cardEarningRule");
            this.f84422a = cardEarningRule;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardRule) && Intrinsics.f(this.f84422a, ((CardRule) obj2).f84422a);
        }

        public final int hashCode() {
            return this.f84422a.hashCode();
        }

        @Override // com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPointsEarningRuleApplied
        /* JADX INFO: renamed from: k9, reason: from getter */
        public final RevPointsEarningRule getF84422a() {
            return this.f84422a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f84422a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation$Empty;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/revpoints/EarningRepresentation;", "<init>", "()V", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Empty implements EarningRepresentation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Empty f84423a = new Empty();

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Empty.f84423a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Empty[i];
            }
        }

        private Empty() {
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
}
