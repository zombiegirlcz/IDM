package com.revolut.feature.shops.impl.ui.map_view;

import cli.j;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.data.model.Data;
import com.revolut.feature.shops.api.model.ShopsOutlet;
import com.revolut.feature.shops.impl.ui.map_view.a;
import jid.t;
import kjd.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f87226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f87227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f87228c;
    public final float d;
    public final ah0.b e;
    public final ah0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f87229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f87230h;
    public final ShopsOutlet i;

    public b() {
        this(0);
    }

    public static b a(b bVar, t tVar, boolean z, g gVar, float f, GmsLatLngBounds gmsLatLngBounds, GmsLatLngBounds gmsLatLngBounds2, a aVar, Data data, ShopsOutlet shopsOutlet, int i) {
        if ((i & 1) != 0) {
            tVar = bVar.f87226a;
        }
        t userLocation = tVar;
        if ((i & 2) != 0) {
            z = bVar.f87227b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            gVar = bVar.f87228c;
        }
        g gVar2 = gVar;
        if ((i & 8) != 0) {
            f = bVar.d;
        }
        float f4 = f;
        ah0.b bVar2 = gmsLatLngBounds;
        if ((i & 16) != 0) {
            bVar2 = bVar.e;
        }
        ah0.b bVar3 = bVar2;
        ah0.b bVar4 = (i & 32) != 0 ? bVar.f : gmsLatLngBounds2;
        a bottomSheetState = (i & 64) != 0 ? bVar.f87229g : aVar;
        Data outletsResponse = (i & 128) != 0 ? bVar.f87230h : data;
        ShopsOutlet shopsOutlet2 = (i & 256) != 0 ? bVar.i : shopsOutlet;
        bVar.getClass();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(outletsResponse, "outletsResponse");
        return new b(userLocation, z3, gVar2, f4, bVar3, bVar4, bottomSheetState, outletsResponse, shopsOutlet2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f87226a, bVar.f87226a) && this.f87227b == bVar.f87227b && Intrinsics.f(this.f87228c, bVar.f87228c) && Float.compare(this.d, bVar.d) == 0 && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f87229g, bVar.f87229g) && Intrinsics.f(this.f87230h, bVar.f87230h) && Intrinsics.f(this.i, bVar.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f87226a.hashCode() * 31, 31, this.f87227b);
        g gVar = this.f87228c;
        int iB = m72.b.b(this.d, (iC + (gVar == null ? 0 : gVar.hashCode())) * 31, 31);
        ah0.b bVar = this.e;
        int iHashCode = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ah0.b bVar2 = this.f;
        int iC2 = kii.e.c(this.f87230h, (this.f87229g.hashCode() + ((iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31)) * 31, 31);
        ShopsOutlet shopsOutlet = this.i;
        return (iC2 + (shopsOutlet != null ? shopsOutlet.hashCode() : 0)) * 31;
    }

    public b(t userLocation, boolean z, g gVar, float f, ah0.b bVar, ah0.b bVar2, a bottomSheetState, Data outletsResponse, ShopsOutlet shopsOutlet) {
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(outletsResponse, "outletsResponse");
        this.f87226a = userLocation;
        this.f87227b = z;
        this.f87228c = gVar;
        this.d = f;
        this.e = bVar;
        this.f = bVar2;
        this.f87229g = bottomSheetState;
        this.f87230h = outletsResponse;
        this.i = shopsOutlet;
    }

    public /* synthetic */ b(int i) {
        this(t.a.f174453a, false, null, 12.0f, null, null, a.C0547a.f87222a, new Data(null, null, true, 3, null), null);
    }
}
