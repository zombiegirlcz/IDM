package com.revolut.feature.apm.multibanco.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoFlowInputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultibancoFlowDestination extends InternalDestination<MultibancoFlowInputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<MultibancoFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultibancoFlowInputData.StartType f62545b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultibancoFlowDestination((MultibancoFlowInputData.StartType) parcel.readParcelable(MultibancoFlowDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultibancoFlowDestination[i];
        }
    }

    public MultibancoFlowDestination() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof MultibancoFlowDestination) && Intrinsics.f(this.f62545b, ((MultibancoFlowDestination) obj2).f62545b);
    }

    public final int hashCode() {
        return this.f62545b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62545b, i);
    }

    public /* synthetic */ MultibancoFlowDestination(int i) {
        this(MultibancoFlowInputData.StartType.Area.f62547a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultibancoFlowDestination(MultibancoFlowInputData.StartType startType) {
        super(new MultibancoFlowInputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f62545b = startType;
    }
}
