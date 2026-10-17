package com.revolut.feature.wealth_discovery.impl.screener.screens.filter_calibrator;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zel.f;
import zel.g;
import zel.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/screens/filter_calibrator/ScreenerFilterCalibratorScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerFilterCalibratorScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ScreenerFilterCalibratorScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f96241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f96242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f96243c;
    public final g d;
    public final i e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            f fVarValueOf = f.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ScreenerFilterCalibratorScreenContract$Input.class, parcel, arrayList, iE, 1);
            }
            return new ScreenerFilterCalibratorScreenContract$Input(gVarValueOf, fVarValueOf, arrayList, parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()), parcel.readInt() != 0 ? i.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerFilterCalibratorScreenContract$Input[i];
        }
    }

    public ScreenerFilterCalibratorScreenContract$Input(g metricToCalibrate, f instrumentGroup, List filters, g gVar, i iVar) {
        Intrinsics.checkNotNullParameter(metricToCalibrate, "metricToCalibrate");
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f96241a = metricToCalibrate;
        this.f96242b = instrumentGroup;
        this.f96243c = filters;
        this.d = gVar;
        this.e = iVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerFilterCalibratorScreenContract$Input)) {
            return false;
        }
        ScreenerFilterCalibratorScreenContract$Input screenerFilterCalibratorScreenContract$Input = (ScreenerFilterCalibratorScreenContract$Input) obj2;
        return this.f96241a == screenerFilterCalibratorScreenContract$Input.f96241a && this.f96242b == screenerFilterCalibratorScreenContract$Input.f96242b && Intrinsics.f(this.f96243c, screenerFilterCalibratorScreenContract$Input.f96243c) && this.d == screenerFilterCalibratorScreenContract$Input.d && this.e == screenerFilterCalibratorScreenContract$Input.e;
    }

    public final int hashCode() {
        int iD = p.a.d((this.f96242b.hashCode() + (this.f96241a.hashCode() * 31)) * 31, 31, this.f96243c);
        g gVar = this.d;
        int iHashCode = (iD + (gVar == null ? 0 : gVar.hashCode())) * 31;
        i iVar = this.e;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96241a.name());
        dest.writeString(this.f96242b.name());
        Iterator itV = p.a.v(this.f96243c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        g gVar = this.d;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        i iVar = this.e;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iVar.name());
        }
    }
}
