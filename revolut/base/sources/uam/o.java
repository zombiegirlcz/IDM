package uam;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f278703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f278704b;

    public o(int i, List zoomRatios) {
        Intrinsics.checkNotNullParameter(zoomRatios, "zoomRatios");
        this.f278703a = i;
        this.f278704b = zoomRatios;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f278703a == oVar.f278703a && Intrinsics.f(this.f278704b, oVar.f278704b);
    }

    public final int hashCode() {
        return this.f278704b.hashCode() + (Integer.hashCode(this.f278703a) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Zoom.VariableZoom(maxZoom=");
        sb6.append(this.f278703a);
        sb6.append(", zoomRatios=");
        return m72.b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f278704b, sb6);
    }
}
