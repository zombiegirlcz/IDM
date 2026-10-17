package com.revolut.retail.feature.esim.impl.ui.flows.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/home/EsimHomeFlowContract$EmptyState", "Lcom/revolut/kompot/navigable/flow/FlowState;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimHomeFlowContract$EmptyState implements FlowState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EsimHomeFlowContract$EmptyState f100644a = new EsimHomeFlowContract$EmptyState();

    @NotNull
    public static final Parcelable.Creator<EsimHomeFlowContract$EmptyState> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return EsimHomeFlowContract$EmptyState.f100644a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimHomeFlowContract$EmptyState[i];
        }
    }

    private EsimHomeFlowContract$EmptyState() {
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
