package com.revolut.feature.wealth.impl.ui.screens.popularassets;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mzg.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/impl/ui/screens/popularassets/PopularAssetsControllerContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PopularAssetsControllerContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PopularAssetsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f95627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f95628b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVarValueOf = d.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new PopularAssetsControllerContract$InputData(dVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PopularAssetsControllerContract$InputData[i];
        }
    }

    public PopularAssetsControllerContract$InputData(d section, List assetTypesParameters) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(assetTypesParameters, "assetTypesParameters");
        this.f95627a = section;
        this.f95628b = assetTypesParameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PopularAssetsControllerContract$InputData)) {
            return false;
        }
        PopularAssetsControllerContract$InputData popularAssetsControllerContract$InputData = (PopularAssetsControllerContract$InputData) obj2;
        return this.f95627a == popularAssetsControllerContract$InputData.f95627a && Intrinsics.f(this.f95628b, popularAssetsControllerContract$InputData.f95628b);
    }

    public final int hashCode() {
        return this.f95628b.hashCode() + (this.f95627a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95627a.name());
        Iterator itV = p.a.v(this.f95628b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
