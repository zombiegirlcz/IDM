package com.revolut.shared.feature.wealth.models.screener;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zel.g;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/screener/ScreenerInstrument;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerInstrument implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScreenerInstrument> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f105163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MetricValue f105164c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList arrayList = null;
            g gVarValueOf = parcel.readInt() == 0 ? null : g.valueOf(parcel.readString());
            MetricValue metricValue = (MetricValue) parcel.readParcelable(ScreenerInstrument.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ScreenerExtraMetric.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new ScreenerInstrument(string, gVarValueOf, metricValue, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerInstrument[i];
        }
    }

    public ScreenerInstrument(String ref2, g gVar, MetricValue metricValue, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f105162a = ref2;
        this.f105163b = gVar;
        this.f105164c = metricValue;
        this.d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerInstrument)) {
            return false;
        }
        ScreenerInstrument screenerInstrument = (ScreenerInstrument) obj2;
        return Intrinsics.f(this.f105162a, screenerInstrument.f105162a) && this.f105163b == screenerInstrument.f105163b && Intrinsics.f(this.f105164c, screenerInstrument.f105164c) && Intrinsics.f(this.d, screenerInstrument.d);
    }

    public final int hashCode() {
        int iHashCode = this.f105162a.hashCode() * 31;
        g gVar = this.f105163b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        MetricValue metricValue = this.f105164c;
        int iHashCode3 = (iHashCode2 + (metricValue == null ? 0 : metricValue.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105162a);
        g gVar = this.f105163b;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        dest.writeParcelable(this.f105164c, i);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((ScreenerExtraMetric) itQ.next()).writeToParcel(dest, i);
        }
    }
}
