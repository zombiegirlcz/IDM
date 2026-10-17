package com.revolut.feature.kyc.impl.hyperverge.videoconference;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/kyc/impl/hyperverge/videoconference/HypervergeVideoKycFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Portal", "RequestPermission", "Lcom/revolut/feature/kyc/impl/hyperverge/videoconference/HypervergeVideoKycFlowContract$Step$Portal;", "Lcom/revolut/feature/kyc/impl/hyperverge/videoconference/HypervergeVideoKycFlowContract$Step$RequestPermission;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class HypervergeVideoKycFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/hyperverge/videoconference/HypervergeVideoKycFlowContract$Step$Portal;", "Lcom/revolut/feature/kyc/impl/hyperverge/videoconference/HypervergeVideoKycFlowContract$Step;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Portal extends HypervergeVideoKycFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Portal f77774a = new Portal();

        @NotNull
        public static final Parcelable.Creator<Portal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Portal.f77774a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Portal[i];
            }
        }

        private Portal() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/hyperverge/videoconference/HypervergeVideoKycFlowContract$Step$RequestPermission;", "Lcom/revolut/feature/kyc/impl/hyperverge/videoconference/HypervergeVideoKycFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestPermission extends HypervergeVideoKycFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RequestPermission> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f77775a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(RequestPermission.class, parcel, arrayList, iE, 1);
                }
                return new RequestPermission(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestPermission[i];
            }
        }

        public RequestPermission(List permissionsRequired) {
            Intrinsics.checkNotNullParameter(permissionsRequired, "permissionsRequired");
            this.f77775a = permissionsRequired;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RequestPermission) && Intrinsics.f(this.f77775a, ((RequestPermission) obj2).f77775a);
        }

        public final int hashCode() {
            return this.f77775a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f77775a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    private HypervergeVideoKycFlowContract$Step() {
    }
}
