package com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.navigable.flow.FlowState;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/alerts/ui/flow/alerts/SharedAlertsFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedAlertsFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<SharedAlertsFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f86704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f86705b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = d.e(SharedAlertsFlowContract$State.class, parcel, linkedHashSet, iE2, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
            while (iE != i2) {
                iE = d.e(SharedAlertsFlowContract$State.class, parcel, linkedHashSet2, iE, 1);
            }
            return new SharedAlertsFlowContract$State(linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedAlertsFlowContract$State[i];
        }
    }

    public SharedAlertsFlowContract$State(Set allAssetTypeKeys, Set initialSelectedAssetTypeKeys) {
        Intrinsics.checkNotNullParameter(allAssetTypeKeys, "allAssetTypeKeys");
        Intrinsics.checkNotNullParameter(initialSelectedAssetTypeKeys, "initialSelectedAssetTypeKeys");
        this.f86704a = allAssetTypeKeys;
        this.f86705b = initialSelectedAssetTypeKeys;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedAlertsFlowContract$State)) {
            return false;
        }
        SharedAlertsFlowContract$State sharedAlertsFlowContract$State = (SharedAlertsFlowContract$State) obj2;
        return Intrinsics.f(this.f86704a, sharedAlertsFlowContract$State.f86704a) && Intrinsics.f(this.f86705b, sharedAlertsFlowContract$State.f86705b);
    }

    public final int hashCode() {
        return this.f86705b.hashCode() + (this.f86704a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f86704a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = n.v(this.f86705b, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }
}
