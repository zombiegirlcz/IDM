package com.revolut.feature.onboarding.api.exchange_global_access;

import android.os.Parcel;
import android.os.Parcelable;
import bla.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct f78166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f78167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78168c;
    public final NaviCommand d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination(parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination[i];
        }
    }

    public ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination(c cVar, AnalyticsProduct analyticsProduct, NaviCommand naviCommand, boolean z) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f78166a = analyticsProduct;
        this.f78167b = cVar;
        this.f78168c = z;
        this.d = naviCommand;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF78166a() {
        return this.f78166a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final NaviCommand getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getF78167b() {
        return this.f78167b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF78168c() {
        return this.f78168c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination)) {
            return false;
        }
        ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination = (ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination) obj2;
        return Intrinsics.f(this.f78166a, exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination.f78166a) && this.f78167b == exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination.f78167b && this.f78168c == exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination.f78168c && Intrinsics.f(this.d, exchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination.d);
    }

    public final int hashCode() {
        int iHashCode = this.f78166a.hashCode() * 31;
        c cVar = this.f78167b;
        int iC = j6.a.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f78168c);
        NaviCommand naviCommand = this.d;
        return iC + (naviCommand != null ? naviCommand.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78166a, i);
        c cVar = this.f78167b;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeInt(this.f78168c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }
}
