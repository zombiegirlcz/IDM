package aw0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o8 f10473c;
    public final Clause d;

    public p8(float f, float f4, o8 tooltipData, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(tooltipData, "tooltipData");
        this.f10471a = f;
        this.f10472b = f4;
        this.f10473c = tooltipData;
        this.d = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj2;
        return Float.compare(this.f10471a, p8Var.f10471a) == 0 && Float.compare(this.f10472b, p8Var.f10472b) == 0 && Intrinsics.f(this.f10473c, p8Var.f10473c) && Intrinsics.f(this.d, p8Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f10473c.hashCode() + m72.b.b(this.f10472b, Float.hashCode(this.f10471a) * 31, 31)) * 31;
        Clause clause = this.d;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    public p8(float f, o8 o8Var) {
        this(f, BitmapDescriptorFactory.HUE_RED, o8Var, null);
    }
}
