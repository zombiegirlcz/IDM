package com.revolut.feature.card_payment_method.impl.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card_payment_method.api.declaration.LinkCardFlowInputData;
import com.revolut.feature.card_payment_method.api.declaration.PaymentMethodInfoInputData;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.kompot.FeatureFlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/declaration/CardPaymentMethodFeatureStep;", "Lcom/revolut/kompot/FeatureFlowStep;", "<init>", "()V", "LinkCardToPocket", "SelectPaymentMethod", "Info", "Lcom/revolut/feature/card_payment_method/impl/declaration/CardPaymentMethodFeatureStep$Info;", "Lcom/revolut/feature/card_payment_method/impl/declaration/CardPaymentMethodFeatureStep$LinkCardToPocket;", "Lcom/revolut/feature/card_payment_method/impl/declaration/CardPaymentMethodFeatureStep$SelectPaymentMethod;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardPaymentMethodFeatureStep implements FeatureFlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/declaration/CardPaymentMethodFeatureStep$Info;", "Lcom/revolut/feature/card_payment_method/impl/declaration/CardPaymentMethodFeatureStep;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info extends CardPaymentMethodFeatureStep {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentMethodInfoInputData f65253a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Info((PaymentMethodInfoInputData) parcel.readParcelable(Info.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(PaymentMethodInfoInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f65253a = inputData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentMethodInfoInputData getF65253a() {
            return this.f65253a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Info) && Intrinsics.f(this.f65253a, ((Info) obj2).f65253a);
        }

        public final int hashCode() {
            return this.f65253a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65253a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/declaration/CardPaymentMethodFeatureStep$LinkCardToPocket;", "Lcom/revolut/feature/card_payment_method/impl/declaration/CardPaymentMethodFeatureStep;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkCardToPocket extends CardPaymentMethodFeatureStep {

        @NotNull
        public static final Parcelable.Creator<LinkCardToPocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkCardFlowInputData f65254a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkCardToPocket((LinkCardFlowInputData) parcel.readParcelable(LinkCardToPocket.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkCardToPocket[i];
            }
        }

        public LinkCardToPocket(LinkCardFlowInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f65254a = inputData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LinkCardFlowInputData getF65254a() {
            return this.f65254a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkCardToPocket) && Intrinsics.f(this.f65254a, ((LinkCardToPocket) obj2).f65254a);
        }

        public final int hashCode() {
            return this.f65254a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65254a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/declaration/CardPaymentMethodFeatureStep$SelectPaymentMethod;", "Lcom/revolut/feature/card_payment_method/impl/declaration/CardPaymentMethodFeatureStep;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectPaymentMethod extends CardPaymentMethodFeatureStep {

        @NotNull
        public static final Parcelable.Creator<SelectPaymentMethod> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SelectPaymentMethodInputData f65255a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectPaymentMethod((SelectPaymentMethodInputData) parcel.readParcelable(SelectPaymentMethod.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPaymentMethod[i];
            }
        }

        public SelectPaymentMethod(SelectPaymentMethodInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f65255a = inputData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SelectPaymentMethodInputData getF65255a() {
            return this.f65255a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectPaymentMethod) && Intrinsics.f(this.f65255a, ((SelectPaymentMethod) obj2).f65255a);
        }

        public final int hashCode() {
            return this.f65255a.f65244a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65255a, i);
        }
    }

    private CardPaymentMethodFeatureStep() {
    }
}
