package svi;

import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesFooter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f265996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchemeAirportLoungesFooter f265997c;

    public t1(String title, ArrayList cells, SchemeAirportLoungesFooter footer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f265995a = title;
        this.f265996b = cells;
        this.f265997c = footer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f265995a, t1Var.f265995a) && this.f265996b.equals(t1Var.f265996b) && this.f265997c.equals(t1Var.f265997c);
    }

    public final int hashCode() {
        return this.f265997c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f265996b, this.f265995a.hashCode() * 31, 31);
    }
}
