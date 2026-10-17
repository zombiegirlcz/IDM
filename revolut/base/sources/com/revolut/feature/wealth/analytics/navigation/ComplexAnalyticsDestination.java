package com.revolut.feature.wealth.analytics.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import eel.c;
import h30.l;
import ixg.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/navigation/ComplexAnalyticsDestination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ComplexAnalyticsDestination implements StackDestination {

    @NotNull
    public static final Parcelable.Creator<ComplexAnalyticsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f95032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ixg.a f95033c;
    public final c d;
    public final AnalyticsProduct e;
    public final TransitionAnimation f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComplexAnalyticsDestination(parcel.readString(), b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ixg.a.valueOf(parcel.readString()), parcel.readInt() != 0 ? c.valueOf(parcel.readString()) : null, (AnalyticsProduct) parcel.readParcelable(ComplexAnalyticsDestination.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(ComplexAnalyticsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ComplexAnalyticsDestination[i];
        }
    }

    public ComplexAnalyticsDestination(String str, b analyticsType, ixg.a aVar, c cVar, AnalyticsProduct analyticsProduct, TransitionAnimation transitionAnimation) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f95031a = str;
        this.f95032b = analyticsType;
        this.f95033c = aVar;
        this.d = cVar;
        this.e = analyticsProduct;
        this.f = transitionAnimation;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getE() {
        return this.e;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getF95032b() {
        return this.f95032b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ComplexAnalyticsDestination)) {
            return false;
        }
        ComplexAnalyticsDestination complexAnalyticsDestination = (ComplexAnalyticsDestination) obj2;
        return Intrinsics.f(this.f95031a, complexAnalyticsDestination.f95031a) && this.f95032b == complexAnalyticsDestination.f95032b && this.f95033c == complexAnalyticsDestination.f95033c && this.d == complexAnalyticsDestination.d && Intrinsics.f(this.e, complexAnalyticsDestination.e) && Intrinsics.f(this.f, complexAnalyticsDestination.f);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF95031a() {
        return this.f95031a;
    }

    public final int hashCode() {
        String str = this.f95031a;
        int iHashCode = (this.f95032b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        ixg.a aVar = this.f95033c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.d;
        int iA = l.a((iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.e);
        TransitionAnimation transitionAnimation = this.f;
        return iA + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95031a);
        dest.writeString(this.f95032b.name());
        ixg.a aVar = this.f95033c;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        c cVar = this.d;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ ComplexAnalyticsDestination(String str, b bVar, ixg.a aVar, c cVar, AnalyticsProduct.Retail retail, ZoomTransitionAnimation zoomTransitionAnimation, int i) {
        this((i & 1) != 0 ? null : str, bVar, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : cVar, retail, (i & 32) != 0 ? null : zoomTransitionAnimation);
    }
}
