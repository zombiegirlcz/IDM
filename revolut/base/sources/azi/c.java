package azi;

import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesFooter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SchemeAirportLoungesFooter f11463b;

    public c(ArrayList cells, SchemeAirportLoungesFooter footer) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f11462a = cells;
        this.f11463b = footer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f11462a.equals(cVar.f11462a) && Intrinsics.f(this.f11463b, cVar.f11463b);
    }

    public final int hashCode() {
        return this.f11463b.hashCode() + (this.f11462a.hashCode() * 31);
    }
}
