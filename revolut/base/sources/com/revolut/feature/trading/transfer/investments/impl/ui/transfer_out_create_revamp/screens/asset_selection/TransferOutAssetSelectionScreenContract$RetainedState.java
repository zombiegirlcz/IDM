package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/screens/asset_selection/TransferOutAssetSelectionScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferOutAssetSelectionScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<TransferOutAssetSelectionScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f91640a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), TransferOutAssetSelectionScreenContract$AssetDraft.CREATOR.createFromParcel(parcel));
            }
            return new TransferOutAssetSelectionScreenContract$RetainedState(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferOutAssetSelectionScreenContract$RetainedState[i];
        }
    }

    public TransferOutAssetSelectionScreenContract$RetainedState(Map assetDrafts) {
        Intrinsics.checkNotNullParameter(assetDrafts, "assetDrafts");
        this.f91640a = assetDrafts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TransferOutAssetSelectionScreenContract$RetainedState) && Intrinsics.f(this.f91640a, ((TransferOutAssetSelectionScreenContract$RetainedState) obj2).f91640a);
    }

    public final int hashCode() {
        return this.f91640a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itZ = j6.a.z(this.f91640a, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            ((TransferOutAssetSelectionScreenContract$AssetDraft) entry.getValue()).writeToParcel(dest, i);
        }
    }
}
