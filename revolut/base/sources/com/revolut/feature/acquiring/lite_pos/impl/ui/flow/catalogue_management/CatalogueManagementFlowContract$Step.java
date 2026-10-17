package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_management/CatalogueManagementFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CatalogueManagement", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_management/CatalogueManagementFlowContract$Step$CatalogueManagement;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CatalogueManagementFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_management/CatalogueManagementFlowContract$Step$CatalogueManagement;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/catalogue_management/CatalogueManagementFlowContract$Step;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CatalogueManagement extends CatalogueManagementFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CatalogueManagement f60718a = new CatalogueManagement();

        @NotNull
        public static final Parcelable.Creator<CatalogueManagement> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CatalogueManagement.f60718a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CatalogueManagement[i];
            }
        }

        private CatalogueManagement() {
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

    private CatalogueManagementFlowContract$Step() {
    }
}
