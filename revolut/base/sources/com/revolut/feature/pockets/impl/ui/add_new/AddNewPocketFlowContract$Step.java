package com.revolut.feature.pockets.impl.ui.add_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/pockets/impl/ui/add_new/AddNewPocketFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ChooseCurrency", "McyFlowStep", "Lcom/revolut/feature/pockets/impl/ui/add_new/AddNewPocketFlowContract$Step$ChooseCurrency;", "Lcom/revolut/feature/pockets/impl/ui/add_new/AddNewPocketFlowContract$Step$McyFlowStep;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddNewPocketFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/ui/add_new/AddNewPocketFlowContract$Step$ChooseCurrency;", "Lcom/revolut/feature/pockets/impl/ui/add_new/AddNewPocketFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseCurrency extends AddNewPocketFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChooseCurrency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f80884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f80885b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChooseCurrency((Clause) parcel.readParcelable(ChooseCurrency.class.getClassLoader()), (Clause) parcel.readParcelable(ChooseCurrency.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseCurrency[i];
            }
        }

        public ChooseCurrency(Clause title, Clause clause) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f80884a = title;
            this.f80885b = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChooseCurrency)) {
                return false;
            }
            ChooseCurrency chooseCurrency = (ChooseCurrency) obj2;
            return Intrinsics.f(this.f80884a, chooseCurrency.f80884a) && Intrinsics.f(this.f80885b, chooseCurrency.f80885b);
        }

        public final int hashCode() {
            int iHashCode = this.f80884a.hashCode() * 31;
            Clause clause = this.f80885b;
            return iHashCode + (clause == null ? 0 : clause.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80884a, i);
            dest.writeParcelable(this.f80885b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/ui/add_new/AddNewPocketFlowContract$Step$McyFlowStep;", "Lcom/revolut/feature/pockets/impl/ui/add_new/AddNewPocketFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class McyFlowStep extends AddNewPocketFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<McyFlowStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f80886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bla.c f80887b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new McyFlowStep((xi0.b) parcel.readSerializable(), bla.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new McyFlowStep[i];
            }
        }

        public McyFlowStep(xi0.b targetCurrency, bla.c mcyState) {
            Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
            Intrinsics.checkNotNullParameter(mcyState, "mcyState");
            this.f80886a = targetCurrency;
            this.f80887b = mcyState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof McyFlowStep)) {
                return false;
            }
            McyFlowStep mcyFlowStep = (McyFlowStep) obj2;
            return Intrinsics.f(this.f80886a, mcyFlowStep.f80886a) && this.f80887b == mcyFlowStep.f80887b;
        }

        public final int hashCode() {
            return this.f80887b.hashCode() + (this.f80886a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80886a);
            dest.writeString(this.f80887b.name());
        }
    }

    private AddNewPocketFlowContract$Step() {
    }
}
