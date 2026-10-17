package com.revolut.feature.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import b93.f;
import com.revolut.core.model.account.AccountId;
import hha.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/checkout/models/CheckoutParams;", "Landroid/os/Parcelable;", "<init>", "()V", "CardOrder", "Plan", "Lcom/revolut/feature/checkout/models/CheckoutParams$CardOrder;", "Lcom/revolut/feature/checkout/models/CheckoutParams$Plan;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CheckoutParams implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/CheckoutParams$CardOrder;", "Lcom/revolut/feature/checkout/models/CheckoutParams;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardOrder extends CheckoutParams {

        @NotNull
        public static final Parcelable.Creator<CardOrder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f65850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f65851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AccountId f65852c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardOrder((f) parcel.readSerializable(), (h) parcel.readSerializable(), (AccountId) parcel.readParcelable(CardOrder.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardOrder[i];
            }
        }

        public CardOrder(f card, h hVar, AccountId accountId) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f65850a = card;
            this.f65851b = hVar;
            this.f65852c = accountId;
        }

        @Override // com.revolut.feature.checkout.models.CheckoutParams
        public final String a() {
            d dVar;
            h hVar = this.f65851b;
            if (hVar == null || (dVar = hVar.f236404a) == null) {
                return null;
            }
            return dVar.f152287a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardOrder)) {
                return false;
            }
            CardOrder cardOrder = (CardOrder) obj2;
            return Intrinsics.f(this.f65850a, cardOrder.f65850a) && Intrinsics.f(this.f65851b, cardOrder.f65851b) && Intrinsics.f(this.f65852c, cardOrder.f65852c);
        }

        @Override // com.revolut.feature.checkout.models.CheckoutParams
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF65852c() {
            return this.f65852c;
        }

        public final int hashCode() {
            int iHashCode = this.f65850a.hashCode() * 31;
            h hVar = this.f65851b;
            return this.f65852c.hashCode() + ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65850a);
            dest.writeSerializable(this.f65851b);
            dest.writeParcelable(this.f65852c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/CheckoutParams$Plan;", "Lcom/revolut/feature/checkout/models/CheckoutParams;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Plan extends CheckoutParams {

        @NotNull
        public static final Parcelable.Creator<Plan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f65853a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Plan((h) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Plan[i];
            }
        }

        public Plan(h plan) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.f65853a = plan;
        }

        @Override // com.revolut.feature.checkout.models.CheckoutParams
        public final String a() {
            return this.f65853a.f236404a.f152287a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Plan) && Intrinsics.f(this.f65853a, ((Plan) obj2).f65853a);
        }

        @Override // com.revolut.feature.checkout.models.CheckoutParams
        /* JADX INFO: renamed from: getAccountId */
        public final AccountId getF65852c() {
            return AccountId.Personal.f51414a;
        }

        public final int hashCode() {
            return this.f65853a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65853a);
        }
    }

    private CheckoutParams() {
    }

    public abstract String a();

    /* JADX INFO: renamed from: getAccountId */
    public abstract AccountId getF65852c();
}
