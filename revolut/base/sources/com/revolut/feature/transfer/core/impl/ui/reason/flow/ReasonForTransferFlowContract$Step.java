package com.revolut.feature.transfer.core.impl.ui.reason.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import krf.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/transfer/core/impl/ui/reason/flow/ReasonForTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Summary", "Chooser", "Goods", "Lcom/revolut/feature/transfer/core/impl/ui/reason/flow/ReasonForTransferFlowContract$Step$Chooser;", "Lcom/revolut/feature/transfer/core/impl/ui/reason/flow/ReasonForTransferFlowContract$Step$Goods;", "Lcom/revolut/feature/transfer/core/impl/ui/reason/flow/ReasonForTransferFlowContract$Step$Summary;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReasonForTransferFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/reason/flow/ReasonForTransferFlowContract$Step$Chooser;", "Lcom/revolut/feature/transfer/core/impl/ui/reason/flow/ReasonForTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chooser implements ReasonForTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Chooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f92198a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chooser((c) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chooser[i];
            }
        }

        public Chooser(c cVar) {
            this.f92198a = cVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chooser) && Intrinsics.f(this.f92198a, ((Chooser) obj2).f92198a);
        }

        public final int hashCode() {
            c cVar = this.f92198a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92198a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/reason/flow/ReasonForTransferFlowContract$Step$Goods;", "Lcom/revolut/feature/transfer/core/impl/ui/reason/flow/ReasonForTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Goods implements ReasonForTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Goods> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f92199a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Goods((c) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Goods[i];
            }
        }

        public Goods(c transferReason) {
            Intrinsics.checkNotNullParameter(transferReason, "transferReason");
            this.f92199a = transferReason;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Goods) && Intrinsics.f(this.f92199a, ((Goods) obj2).f92199a);
        }

        public final int hashCode() {
            return this.f92199a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92199a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/reason/flow/ReasonForTransferFlowContract$Step$Summary;", "Lcom/revolut/feature/transfer/core/impl/ui/reason/flow/ReasonForTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Summary implements ReasonForTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Summary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f92200a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Summary((c) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Summary[i];
            }
        }

        public Summary(c cVar) {
            this.f92200a = cVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Summary) && Intrinsics.f(this.f92200a, ((Summary) obj2).f92200a);
        }

        public final int hashCode() {
            c cVar = this.f92200a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92200a);
        }
    }
}
