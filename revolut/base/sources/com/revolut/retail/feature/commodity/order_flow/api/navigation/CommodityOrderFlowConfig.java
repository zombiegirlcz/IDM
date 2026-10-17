package com.revolut.retail.feature.commodity.order_flow.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l6j.c;
import m6j.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/api/navigation/CommodityOrderFlowConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "m6j/a", "m6j/b", "feature_commodity_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommodityOrderFlowConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CommodityOrderFlowConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m6j.a f99805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f99806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PocketDescriptor.FullPocketDescriptor f99807c;
    public final PocketDescriptor d;
    public final Set e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            m6j.a aVarValueOf = m6j.a.valueOf(parcel.readString());
            b bVarValueOf = b.valueOf(parcel.readString());
            PocketDescriptor.FullPocketDescriptor fullPocketDescriptorCreateFromParcel = PocketDescriptor.FullPocketDescriptor.CREATOR.createFromParcel(parcel);
            PocketDescriptor pocketDescriptor = (PocketDescriptor) parcel.readParcelable(CommodityOrderFlowConfig.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(c.valueOf(parcel.readString()));
            }
            return new CommodityOrderFlowConfig(aVarValueOf, bVarValueOf, fullPocketDescriptorCreateFromParcel, pocketDescriptor, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommodityOrderFlowConfig[i];
        }
    }

    public CommodityOrderFlowConfig(m6j.a side, b type, PocketDescriptor.FullPocketDescriptor basePocket, PocketDescriptor pocketDescriptor, Set allowedCounterPocketTypes) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(basePocket, "basePocket");
        Intrinsics.checkNotNullParameter(allowedCounterPocketTypes, "allowedCounterPocketTypes");
        this.f99805a = side;
        this.f99806b = type;
        this.f99807c = basePocket;
        this.d = pocketDescriptor;
        this.e = allowedCounterPocketTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CommodityOrderFlowConfig)) {
            return false;
        }
        CommodityOrderFlowConfig commodityOrderFlowConfig = (CommodityOrderFlowConfig) obj2;
        return this.f99805a == commodityOrderFlowConfig.f99805a && this.f99806b == commodityOrderFlowConfig.f99806b && Intrinsics.f(this.f99807c, commodityOrderFlowConfig.f99807c) && Intrinsics.f(this.d, commodityOrderFlowConfig.d) && Intrinsics.f(this.e, commodityOrderFlowConfig.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f99807c.hashCode() + ((this.f99806b.hashCode() + (this.f99805a.hashCode() * 31)) * 31)) * 31;
        PocketDescriptor pocketDescriptor = this.d;
        return this.e.hashCode() + ((iHashCode + (pocketDescriptor == null ? 0 : pocketDescriptor.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99805a.name());
        dest.writeString(this.f99806b.name());
        this.f99807c.writeToParcel(dest, i);
        dest.writeParcelable(this.d, i);
        Iterator itV = n.v(this.e, dest);
        while (itV.hasNext()) {
            dest.writeString(((c) itV.next()).name());
        }
    }
}
