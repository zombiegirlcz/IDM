package com.revolut.feature.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.checkout.models.PreorderCardResult;
import com.revolut.feature.checkout.models.PreorderPlanResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult;", "Lcom/revolut/feature/checkout/models/PreorderResult;", "<init>", "()V", "Preordered", "PlanError", "PlanSubscribedCardError", "PlanSubscribedCardPreorder", "PlanSubscribedCardIssued", "PlanPreorderedCardError", "PlanPreorderedCardIssued", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanError;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanPreorderedCardError;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanPreorderedCardIssued;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanSubscribedCardError;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanSubscribedCardIssued;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanSubscribedCardPreorder;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$Preordered;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PreorderPlanAndCardResult implements PreorderResult {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanError;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanError extends PreorderPlanAndCardResult {

        @NotNull
        public static final Parcelable.Creator<PlanError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreorderPlanResult.Error f65860a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanError(PreorderPlanResult.Error.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanError[i];
            }
        }

        public PlanError(PreorderPlanResult.Error planResult) {
            Intrinsics.checkNotNullParameter(planResult, "planResult");
            this.f65860a = planResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanError) && Intrinsics.f(this.f65860a, ((PlanError) obj2).f65860a);
        }

        public final int hashCode() {
            return this.f65860a.f65873a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65860a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanPreorderedCardError;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanPreorderedCardError extends PreorderPlanAndCardResult {

        @NotNull
        public static final Parcelable.Creator<PlanPreorderedCardError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreorderPlanResult.Preordered f65861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PreorderCardResult.Error f65862b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanPreorderedCardError(PreorderPlanResult.Preordered.CREATOR.createFromParcel(parcel), PreorderCardResult.Error.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanPreorderedCardError[i];
            }
        }

        public PlanPreorderedCardError(PreorderPlanResult.Preordered planResult, PreorderCardResult.Error cardResult) {
            Intrinsics.checkNotNullParameter(planResult, "planResult");
            Intrinsics.checkNotNullParameter(cardResult, "cardResult");
            this.f65861a = planResult;
            this.f65862b = cardResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanPreorderedCardError)) {
                return false;
            }
            PlanPreorderedCardError planPreorderedCardError = (PlanPreorderedCardError) obj2;
            return Intrinsics.f(this.f65861a, planPreorderedCardError.f65861a) && Intrinsics.f(this.f65862b, planPreorderedCardError.f65862b);
        }

        public final int hashCode() {
            return this.f65862b.f65856a.hashCode() + (this.f65861a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65861a.writeToParcel(dest, i);
            this.f65862b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanPreorderedCardIssued;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanPreorderedCardIssued extends PreorderPlanAndCardResult {

        @NotNull
        public static final Parcelable.Creator<PlanPreorderedCardIssued> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreorderPlanResult.Preordered f65863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PreorderCardResult.CardIssued f65864b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanPreorderedCardIssued(PreorderPlanResult.Preordered.CREATOR.createFromParcel(parcel), PreorderCardResult.CardIssued.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanPreorderedCardIssued[i];
            }
        }

        public PlanPreorderedCardIssued(PreorderPlanResult.Preordered planResult, PreorderCardResult.CardIssued cardResult) {
            Intrinsics.checkNotNullParameter(planResult, "planResult");
            Intrinsics.checkNotNullParameter(cardResult, "cardResult");
            this.f65863a = planResult;
            this.f65864b = cardResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanPreorderedCardIssued)) {
                return false;
            }
            PlanPreorderedCardIssued planPreorderedCardIssued = (PlanPreorderedCardIssued) obj2;
            return Intrinsics.f(this.f65863a, planPreorderedCardIssued.f65863a) && Intrinsics.f(this.f65864b, planPreorderedCardIssued.f65864b);
        }

        public final int hashCode() {
            return this.f65864b.hashCode() + (this.f65863a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65863a.writeToParcel(dest, i);
            this.f65864b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanSubscribedCardError;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSubscribedCardError extends PreorderPlanAndCardResult {

        @NotNull
        public static final Parcelable.Creator<PlanSubscribedCardError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreorderPlanResult.Subscribed f65865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PreorderCardResult.Error f65866b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSubscribedCardError(PreorderPlanResult.Subscribed.CREATOR.createFromParcel(parcel), PreorderCardResult.Error.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSubscribedCardError[i];
            }
        }

        public PlanSubscribedCardError(PreorderPlanResult.Subscribed planResult, PreorderCardResult.Error cardResult) {
            Intrinsics.checkNotNullParameter(planResult, "planResult");
            Intrinsics.checkNotNullParameter(cardResult, "cardResult");
            this.f65865a = planResult;
            this.f65866b = cardResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanSubscribedCardError)) {
                return false;
            }
            PlanSubscribedCardError planSubscribedCardError = (PlanSubscribedCardError) obj2;
            return Intrinsics.f(this.f65865a, planSubscribedCardError.f65865a) && Intrinsics.f(this.f65866b, planSubscribedCardError.f65866b);
        }

        public final int hashCode() {
            return this.f65866b.f65856a.hashCode() + (this.f65865a.f65877a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65865a.writeToParcel(dest, i);
            this.f65866b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanSubscribedCardIssued;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSubscribedCardIssued extends PreorderPlanAndCardResult {

        @NotNull
        public static final Parcelable.Creator<PlanSubscribedCardIssued> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreorderPlanResult.Subscribed f65867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PreorderCardResult.CardIssued f65868b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSubscribedCardIssued(PreorderPlanResult.Subscribed.CREATOR.createFromParcel(parcel), PreorderCardResult.CardIssued.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSubscribedCardIssued[i];
            }
        }

        public PlanSubscribedCardIssued(PreorderPlanResult.Subscribed planResult, PreorderCardResult.CardIssued cardResult) {
            Intrinsics.checkNotNullParameter(planResult, "planResult");
            Intrinsics.checkNotNullParameter(cardResult, "cardResult");
            this.f65867a = planResult;
            this.f65868b = cardResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanSubscribedCardIssued)) {
                return false;
            }
            PlanSubscribedCardIssued planSubscribedCardIssued = (PlanSubscribedCardIssued) obj2;
            return Intrinsics.f(this.f65867a, planSubscribedCardIssued.f65867a) && Intrinsics.f(this.f65868b, planSubscribedCardIssued.f65868b);
        }

        public final int hashCode() {
            return this.f65868b.hashCode() + (this.f65867a.f65877a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65867a.writeToParcel(dest, i);
            this.f65868b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$PlanSubscribedCardPreorder;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSubscribedCardPreorder extends PreorderPlanAndCardResult {

        @NotNull
        public static final Parcelable.Creator<PlanSubscribedCardPreorder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreorderPlanResult.Subscribed f65869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PreorderCardResult.Preordered f65870b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSubscribedCardPreorder(PreorderPlanResult.Subscribed.CREATOR.createFromParcel(parcel), PreorderCardResult.Preordered.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSubscribedCardPreorder[i];
            }
        }

        public PlanSubscribedCardPreorder(PreorderPlanResult.Subscribed planResult, PreorderCardResult.Preordered cardResult) {
            Intrinsics.checkNotNullParameter(planResult, "planResult");
            Intrinsics.checkNotNullParameter(cardResult, "cardResult");
            this.f65869a = planResult;
            this.f65870b = cardResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanSubscribedCardPreorder)) {
                return false;
            }
            PlanSubscribedCardPreorder planSubscribedCardPreorder = (PlanSubscribedCardPreorder) obj2;
            return Intrinsics.f(this.f65869a, planSubscribedCardPreorder.f65869a) && Intrinsics.f(this.f65870b, planSubscribedCardPreorder.f65870b);
        }

        public final int hashCode() {
            return this.f65870b.hashCode() + (this.f65869a.f65877a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65869a.writeToParcel(dest, i);
            this.f65870b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult$Preordered;", "Lcom/revolut/feature/checkout/models/PreorderPlanAndCardResult;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Preordered extends PreorderPlanAndCardResult {

        @NotNull
        public static final Parcelable.Creator<Preordered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PreorderPlanResult.Preordered f65871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PreorderCardResult.Preordered f65872b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Preordered(PreorderPlanResult.Preordered.CREATOR.createFromParcel(parcel), PreorderCardResult.Preordered.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Preordered[i];
            }
        }

        public Preordered(PreorderPlanResult.Preordered planResult, PreorderCardResult.Preordered cardResult) {
            Intrinsics.checkNotNullParameter(planResult, "planResult");
            Intrinsics.checkNotNullParameter(cardResult, "cardResult");
            this.f65871a = planResult;
            this.f65872b = cardResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Preordered)) {
                return false;
            }
            Preordered preordered = (Preordered) obj2;
            return Intrinsics.f(this.f65871a, preordered.f65871a) && Intrinsics.f(this.f65872b, preordered.f65872b);
        }

        public final int hashCode() {
            return this.f65872b.hashCode() + (this.f65871a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65871a.writeToParcel(dest, i);
            this.f65872b.writeToParcel(dest, i);
        }
    }

    private PreorderPlanAndCardResult() {
    }
}
