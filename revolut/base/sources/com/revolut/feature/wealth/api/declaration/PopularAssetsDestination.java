package com.revolut.feature.wealth.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mzg.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/PopularAssetsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "mzg/d", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PopularAssetsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PopularAssetsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f95210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f95211b;

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
            return new PopularAssetsDestination(dVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PopularAssetsDestination[i];
        }
    }

    public PopularAssetsDestination(d section, List assetTypesParameters) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(assetTypesParameters, "assetTypesParameters");
        this.f95210a = section;
        this.f95211b = assetTypesParameters;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getF95211b() {
        return this.f95211b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getF95210a() {
        return this.f95210a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PopularAssetsDestination)) {
            return false;
        }
        PopularAssetsDestination popularAssetsDestination = (PopularAssetsDestination) obj2;
        return this.f95210a == popularAssetsDestination.f95210a && Intrinsics.f(this.f95211b, popularAssetsDestination.f95211b);
    }

    public final int hashCode() {
        return this.f95211b.hashCode() + (this.f95210a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95210a.name());
        Iterator itV = p.a.v(this.f95211b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
