package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommodityOrderEditScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<CommodityOrderEditScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f99848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f99849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExchangeOrderDraft f99850c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            LinkedHashSet linkedHashSet2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(f8l.c.valueOf(parcel.readString()));
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashSet2 = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashSet2 = new LinkedHashSet(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    linkedHashSet2.add(h.valueOf(parcel.readString()));
                }
            }
            return new CommodityOrderEditScreenContract$RetainedState(linkedHashSet, linkedHashSet2, parcel.readInt() != 0 ? ExchangeOrderDraft.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommodityOrderEditScreenContract$RetainedState[i];
        }
    }

    public CommodityOrderEditScreenContract$RetainedState(Set set, Set set2, ExchangeOrderDraft exchangeOrderDraft) {
        this.f99848a = set;
        this.f99849b = set2;
        this.f99850c = exchangeOrderDraft;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CommodityOrderEditScreenContract$RetainedState)) {
            return false;
        }
        CommodityOrderEditScreenContract$RetainedState commodityOrderEditScreenContract$RetainedState = (CommodityOrderEditScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f99848a, commodityOrderEditScreenContract$RetainedState.f99848a) && Intrinsics.f(this.f99849b, commodityOrderEditScreenContract$RetainedState.f99849b) && Intrinsics.f(this.f99850c, commodityOrderEditScreenContract$RetainedState.f99850c);
    }

    public final int hashCode() {
        Set set = this.f99848a;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set set2 = this.f99849b;
        int iHashCode2 = (iHashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
        ExchangeOrderDraft exchangeOrderDraft = this.f99850c;
        return iHashCode2 + (exchangeOrderDraft != null ? exchangeOrderDraft.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Set set = this.f99848a;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = kii.e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString(((f8l.c) itQ.next()).name());
            }
        }
        Set set2 = this.f99849b;
        if (set2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = kii.e.q(dest, 1, set2);
            while (itQ2.hasNext()) {
                dest.writeString(((h) itQ2.next()).name());
            }
        }
        ExchangeOrderDraft exchangeOrderDraft = this.f99850c;
        if (exchangeOrderDraft == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            exchangeOrderDraft.writeToParcel(dest, i);
        }
    }
}
