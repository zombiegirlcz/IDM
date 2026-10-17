package com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.how_to_access;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesFooter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/scheme/how_to_access/SchemeLoungesHowToAccessScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemeLoungesHowToAccessScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SchemeLoungesHowToAccessScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f99158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchemeAirportLoungesFooter f99159c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SchemeLoungesHowToAccessScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new SchemeLoungesHowToAccessScreenContract$InputData(string, arrayList, (SchemeAirportLoungesFooter) parcel.readParcelable(SchemeLoungesHowToAccessScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SchemeLoungesHowToAccessScreenContract$InputData[i];
        }
    }

    public SchemeLoungesHowToAccessScreenContract$InputData(String title, ArrayList cells, SchemeAirportLoungesFooter footer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f99157a = title;
        this.f99158b = cells;
        this.f99159c = footer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SchemeLoungesHowToAccessScreenContract$InputData)) {
            return false;
        }
        SchemeLoungesHowToAccessScreenContract$InputData schemeLoungesHowToAccessScreenContract$InputData = (SchemeLoungesHowToAccessScreenContract$InputData) obj2;
        return Intrinsics.f(this.f99157a, schemeLoungesHowToAccessScreenContract$InputData.f99157a) && this.f99158b.equals(schemeLoungesHowToAccessScreenContract$InputData.f99158b) && Intrinsics.f(this.f99159c, schemeLoungesHowToAccessScreenContract$InputData.f99159c);
    }

    public final int hashCode() {
        return this.f99159c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f99158b, this.f99157a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99157a);
        Iterator itY = j6.a.y(this.f99158b, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeParcelable(this.f99159c, i);
    }
}
