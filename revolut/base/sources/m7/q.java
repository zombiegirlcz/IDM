package m7;

import android.graphics.PointF;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f203255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f203256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f203257c;

    public q(PointF pointF, boolean z, List list) {
        this.f203256b = pointF;
        this.f203257c = z;
        this.f203255a = new ArrayList(list);
    }

    public final void a(float f, float f4) {
        if (this.f203256b == null) {
            this.f203256b = new PointF();
        }
        this.f203256b.set(f, f4);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ShapeData{numCurves=");
        sb6.append(this.f203255a.size());
        sb6.append("closed=");
        return j6.a.x(sb6, this.f203257c, CoreConstants.CURLY_RIGHT);
    }

    public q() {
        this.f203255a = new ArrayList();
    }
}
