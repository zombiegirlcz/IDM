package com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/edit_key_stats/EditKeyStatsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddStatsItem", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/edit_key_stats/EditKeyStatsScreenContract$ModalStep$AddStatsItem;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EditKeyStatsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/edit_key_stats/EditKeyStatsScreenContract$ModalStep$AddStatsItem;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/key_stats/edit_key_stats/EditKeyStatsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddStatsItem implements EditKeyStatsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddStatsItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f104028a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(AddStatsItem.class, parcel, linkedHashSet, iE, 1);
                }
                return new AddStatsItem(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddStatsItem[i];
            }
        }

        public AddStatsItem(Set assetStatsIds) {
            Intrinsics.checkNotNullParameter(assetStatsIds, "assetStatsIds");
            this.f104028a = assetStatsIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddStatsItem) && Intrinsics.f(this.f104028a, ((AddStatsItem) obj2).f104028a);
        }

        public final int hashCode() {
            return this.f104028a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f104028a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
