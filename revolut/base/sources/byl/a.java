package byl;

import android.graphics.PointF;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f19850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f19851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f19852c;
    public final float d;
    public final float e;
    public final float f;

    public a(View tileView, PointF pivot, PointF windowCenter, float f, float f4, float f5) {
        Intrinsics.checkNotNullParameter(tileView, "tileView");
        Intrinsics.checkNotNullParameter(pivot, "pivot");
        Intrinsics.checkNotNullParameter(windowCenter, "windowCenter");
        this.f19850a = tileView;
        this.f19851b = pivot;
        this.f19852c = windowCenter;
        this.d = f;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f19850a, aVar.f19850a) && Intrinsics.f(this.f19851b, aVar.f19851b) && Intrinsics.f(this.f19852c, aVar.f19852c) && Float.compare(this.d, aVar.d) == 0 && Float.compare(this.e, aVar.e) == 0 && Float.compare(this.f, aVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + m72.b.b(this.e, m72.b.b(this.d, (this.f19852c.hashCode() + ((this.f19851b.hashCode() + (this.f19850a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }
}
