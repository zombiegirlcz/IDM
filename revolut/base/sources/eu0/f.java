package eu0;

import android.graphics.PointF;
import aw0.o8;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f129457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f129458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o8 f129459c;
    public final PointF d;
    public final Clause e;

    public f(float f, g type, o8 tooltipData, PointF indicatorPoint, Clause clause) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tooltipData, "tooltipData");
        Intrinsics.checkNotNullParameter(indicatorPoint, "indicatorPoint");
        this.f129457a = f;
        this.f129458b = type;
        this.f129459c = tooltipData;
        this.d = indicatorPoint;
        this.e = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Float.compare(this.f129457a, fVar.f129457a) == 0 && this.f129458b == fVar.f129458b && Intrinsics.f(this.f129459c, fVar.f129459c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f129459c.hashCode() + ((this.f129458b.hashCode() + (Float.hashCode(this.f129457a) * 31)) * 31)) * 31)) * 31;
        Clause clause = this.e;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
