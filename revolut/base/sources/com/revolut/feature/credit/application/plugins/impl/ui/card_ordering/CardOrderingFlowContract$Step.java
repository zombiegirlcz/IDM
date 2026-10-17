package com.revolut.feature.credit.application.plugins.impl.ui.card_ordering;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingLoadingScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OrderCardIntro", "VirtualCardOrdering", "Ordered", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$Step$OrderCardIntro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$Step$Ordered;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$Step$VirtualCardOrdering;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardOrderingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$Step$OrderCardIntro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderCardIntro extends CardOrderingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OrderCardIntro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOrderingIntroScreenConfig f67200a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderCardIntro((CardOrderingIntroScreenConfig) parcel.readParcelable(OrderCardIntro.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderCardIntro[i];
            }
        }

        public OrderCardIntro(CardOrderingIntroScreenConfig screenConfig) {
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f67200a = screenConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderCardIntro) && Intrinsics.f(this.f67200a, ((OrderCardIntro) obj2).f67200a);
        }

        public final int hashCode() {
            return this.f67200a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67200a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$Step$Ordered;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Ordered extends CardOrderingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Ordered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOrderingLoadingScreenConfig f67201a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ordered((CardOrderingLoadingScreenConfig) parcel.readParcelable(Ordered.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ordered[i];
            }
        }

        public Ordered(CardOrderingLoadingScreenConfig screenConfig) {
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f67201a = screenConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Ordered) && Intrinsics.f(this.f67201a, ((Ordered) obj2).f67201a);
        }

        public final int hashCode() {
            return this.f67201a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67201a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$Step$VirtualCardOrdering;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VirtualCardOrdering extends CardOrderingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VirtualCardOrdering> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOrderingLoadingScreenConfig f67202a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VirtualCardOrdering((CardOrderingLoadingScreenConfig) parcel.readParcelable(VirtualCardOrdering.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VirtualCardOrdering[i];
            }
        }

        public VirtualCardOrdering(CardOrderingLoadingScreenConfig screenConfig) {
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f67202a = screenConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VirtualCardOrdering) && Intrinsics.f(this.f67202a, ((VirtualCardOrdering) obj2).f67202a);
        }

        public final int hashCode() {
            return this.f67202a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67202a, i);
        }
    }

    private CardOrderingFlowContract$Step() {
    }
}
