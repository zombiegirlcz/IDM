package com.revolut.feature.credit.application.plugins.impl.ui.valuators.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import iy3.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/valuators/flow/RecommendedValuatorsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "List", "Details", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/flow/RecommendedValuatorsFlowContract$Step$Details;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/flow/RecommendedValuatorsFlowContract$Step$List;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RecommendedValuatorsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/flow/RecommendedValuatorsFlowContract$Step$Details;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/flow/RecommendedValuatorsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements RecommendedValuatorsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f68508a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(b valuator) {
            Intrinsics.checkNotNullParameter(valuator, "valuator");
            this.f68508a = valuator;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f68508a, ((Details) obj2).f68508a);
        }

        public final int hashCode() {
            return this.f68508a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68508a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/flow/RecommendedValuatorsFlowContract$Step$List;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/flow/RecommendedValuatorsFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class List implements RecommendedValuatorsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List f68509a = new List();

        @NotNull
        public static final Parcelable.Creator<List> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return List.f68509a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new List[i];
            }
        }

        private List() {
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
