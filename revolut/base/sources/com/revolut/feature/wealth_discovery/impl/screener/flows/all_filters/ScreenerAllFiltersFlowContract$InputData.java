package com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xoh.k;
import zel.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/flows/all_filters/ScreenerAllFiltersFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "xoh/k", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerAllFiltersFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ScreenerAllFiltersFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f96162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f96163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f96164c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f fVarValueOf = parcel.readInt() == 0 ? null : f.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ScreenerAllFiltersFlowContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new ScreenerAllFiltersFlowContract$InputData(fVarValueOf, arrayList, k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerAllFiltersFlowContract$InputData[i];
        }
    }

    public ScreenerAllFiltersFlowContract$InputData(f fVar, List filters, k type) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f96162a = fVar;
        this.f96163b = filters;
        this.f96164c = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerAllFiltersFlowContract$InputData)) {
            return false;
        }
        ScreenerAllFiltersFlowContract$InputData screenerAllFiltersFlowContract$InputData = (ScreenerAllFiltersFlowContract$InputData) obj2;
        return this.f96162a == screenerAllFiltersFlowContract$InputData.f96162a && Intrinsics.f(this.f96163b, screenerAllFiltersFlowContract$InputData.f96163b) && this.f96164c == screenerAllFiltersFlowContract$InputData.f96164c;
    }

    public final int hashCode() {
        f fVar = this.f96162a;
        return this.f96164c.hashCode() + p.a.d((fVar == null ? 0 : fVar.hashCode()) * 31, 31, this.f96163b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        f fVar = this.f96162a;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        Iterator itV = p.a.v(this.f96163b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f96164c.name());
    }
}
