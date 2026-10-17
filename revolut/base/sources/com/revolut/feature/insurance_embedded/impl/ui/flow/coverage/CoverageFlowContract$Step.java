package com.revolut.feature.insurance_embedded.impl.ui.flow.coverage;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/flow/coverage/CoverageFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CoverageList", "Detail", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/coverage/CoverageFlowContract$Step$CoverageList;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/coverage/CoverageFlowContract$Step$Detail;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CoverageFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/flow/coverage/CoverageFlowContract$Step$CoverageList;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/coverage/CoverageFlowContract$Step;", "<init>", "()V", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CoverageList extends CoverageFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CoverageList f76049a = new CoverageList();

        @NotNull
        public static final Parcelable.Creator<CoverageList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CoverageList.f76049a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoverageList[i];
            }
        }

        private CoverageList() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/flow/coverage/CoverageFlowContract$Step$Detail;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/coverage/CoverageFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Detail extends CoverageFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Detail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dl7.a f76051b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Detail(parcel.readString(), dl7.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Detail[i];
            }
        }

        public Detail(String insuranceId, dl7.a insuranceSubtype) {
            Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
            Intrinsics.checkNotNullParameter(insuranceSubtype, "insuranceSubtype");
            this.f76050a = insuranceId;
            this.f76051b = insuranceSubtype;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) obj2;
            return Intrinsics.f(this.f76050a, detail.f76050a) && this.f76051b == detail.f76051b;
        }

        public final int hashCode() {
            return this.f76051b.hashCode() + (this.f76050a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76050a);
            dest.writeString(this.f76051b.name());
        }
    }

    private CoverageFlowContract$Step() {
    }
}
