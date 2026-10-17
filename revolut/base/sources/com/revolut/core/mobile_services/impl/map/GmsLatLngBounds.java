package com.revolut.core.mobile_services.impl.map;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import jb3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/mobile_services/impl/map/GmsLatLngBounds;", "Lah0/b;", "Landroid/os/Parcelable;", "a", "mobile_services_google_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GmsLatLngBounds implements ah0.b, Parcelable {

    @NotNull
    public static final Parcelable.Creator<GmsLatLngBounds> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLngBounds f51395a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LatLngBounds.Builder f51396a = new LatLngBounds.Builder();
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GmsLatLngBounds((LatLngBounds) parcel.readParcelable(GmsLatLngBounds.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GmsLatLngBounds[i];
        }
    }

    public GmsLatLngBounds(LatLngBounds internal) {
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f51395a = internal;
    }

    public final ah0.a a() {
        LatLng center = this.f51395a.getCenter();
        Intrinsics.checkNotNullExpressionValue(center, "getCenter(...)");
        return l.L(center);
    }

    public final ah0.a b() {
        LatLng northeast = this.f51395a.northeast;
        Intrinsics.checkNotNullExpressionValue(northeast, "northeast");
        return l.L(northeast);
    }

    public final ah0.a c() {
        LatLng southwest = this.f51395a.southwest;
        Intrinsics.checkNotNullExpressionValue(southwest, "southwest");
        return l.L(southwest);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f51395a, i);
    }
}
