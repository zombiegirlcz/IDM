package com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.CardTopUpThreeDsUiModel;
import com.revolut.kompot.navigable.flow.FlowStep;
import cue.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/topup_flows/card_deferred_cvv/CardDeferredCvvFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Cvv", "ThreeDs", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_deferred_cvv/CardDeferredCvvFlowContract$Step$Cvv;", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_deferred_cvv/CardDeferredCvvFlowContract$Step$ThreeDs;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardDeferredCvvFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_deferred_cvv/CardDeferredCvvFlowContract$Step$Cvv;", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_deferred_cvv/CardDeferredCvvFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cvv extends CardDeferredCvvFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Cvv> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f90977a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cvv((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cvv[i];
            }
        }

        public Cvv(d dVar) {
            this.f90977a = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cvv) && Intrinsics.f(this.f90977a, ((Cvv) obj2).f90977a);
        }

        public final int hashCode() {
            d dVar = this.f90977a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90977a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_deferred_cvv/CardDeferredCvvFlowContract$Step$ThreeDs;", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_deferred_cvv/CardDeferredCvvFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ThreeDs extends CardDeferredCvvFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ThreeDs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardTopUpThreeDsUiModel f90978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f90979b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ThreeDs(parcel.readInt() == 0 ? null : CardTopUpThreeDsUiModel.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThreeDs[i];
            }
        }

        public ThreeDs(CardTopUpThreeDsUiModel cardTopUpThreeDsUiModel, d dVar) {
            this.f90978a = cardTopUpThreeDsUiModel;
            this.f90979b = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ThreeDs)) {
                return false;
            }
            ThreeDs threeDs = (ThreeDs) obj2;
            return Intrinsics.f(this.f90978a, threeDs.f90978a) && Intrinsics.f(this.f90979b, threeDs.f90979b);
        }

        public final int hashCode() {
            CardTopUpThreeDsUiModel cardTopUpThreeDsUiModel = this.f90978a;
            int iHashCode = (cardTopUpThreeDsUiModel == null ? 0 : cardTopUpThreeDsUiModel.hashCode()) * 31;
            d dVar = this.f90979b;
            return iHashCode + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            CardTopUpThreeDsUiModel cardTopUpThreeDsUiModel = this.f90978a;
            if (cardTopUpThreeDsUiModel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cardTopUpThreeDsUiModel.writeToParcel(dest, i);
            }
            dest.writeSerializable(this.f90979b);
        }
    }

    private CardDeferredCvvFlowContract$Step() {
    }
}
