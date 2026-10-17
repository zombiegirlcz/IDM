package com.revolut.retail.feature.airportlounges.impl.ui.flows.scheme;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/flows/scheme/SchemeLoungesFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "UnlockLounges", "Home", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/scheme/SchemeLoungesFlowContract$Step$Home;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/scheme/SchemeLoungesFlowContract$Step$UnlockLounges;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SchemeLoungesFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/scheme/SchemeLoungesFlowContract$Step$Home;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/scheme/SchemeLoungesFlowContract$Step;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Home extends SchemeLoungesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Home f99025a = new Home();

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Home.f99025a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        private Home() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/scheme/SchemeLoungesFlowContract$Step$UnlockLounges;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/flows/scheme/SchemeLoungesFlowContract$Step;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnlockLounges extends SchemeLoungesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnlockLounges f99026a = new UnlockLounges();

        @NotNull
        public static final Parcelable.Creator<UnlockLounges> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnlockLounges.f99026a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnlockLounges[i];
            }
        }

        private UnlockLounges() {
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

    private SchemeLoungesFlowContract$Step() {
    }
}
