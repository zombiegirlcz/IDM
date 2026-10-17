package bt0;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f18220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f18221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f18222c;

    public b(RectF popupBounds, c position, ArrayList textPositions) {
        Intrinsics.checkNotNullParameter(popupBounds, "popupBounds");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(textPositions, "textPositions");
        this.f18220a = popupBounds;
        this.f18221b = position;
        this.f18222c = textPositions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f18220a.equals(bVar.f18220a) && this.f18221b == bVar.f18221b && this.f18222c.equals(bVar.f18222c);
    }

    public final int hashCode() {
        return this.f18222c.hashCode() + ((this.f18221b.hashCode() + (this.f18220a.hashCode() * 31)) * 31);
    }
}
