package svi;

import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesFooter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f265984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f265986c;
    public final SchemeAirportLoungesFooter d;

    public s1(v1 v1Var, String imageUrl, ArrayList cells, SchemeAirportLoungesFooter schemeAirportLoungesFooter) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.f265984a = v1Var;
        this.f265985b = imageUrl;
        this.f265986c = cells;
        this.d = schemeAirportLoungesFooter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Intrinsics.f(this.f265984a, s1Var.f265984a) && Intrinsics.f(this.f265985b, s1Var.f265985b) && this.f265986c.equals(s1Var.f265986c) && Intrinsics.f(this.d, s1Var.d);
    }

    public final int hashCode() {
        v1 v1Var = this.f265984a;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f265986c, p.a.c((v1Var == null ? 0 : v1Var.hashCode()) * 31, 31, this.f265985b), 31);
        SchemeAirportLoungesFooter schemeAirportLoungesFooter = this.d;
        return iB + (schemeAirportLoungesFooter != null ? schemeAirportLoungesFooter.hashCode() : 0);
    }
}
