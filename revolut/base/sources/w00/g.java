package w00;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f293603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f293604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f293605c;

    public g(Rect faceRect, Rect maskRect, a maskFit) {
        Intrinsics.checkNotNullParameter(faceRect, "faceRect");
        Intrinsics.checkNotNullParameter(maskRect, "maskRect");
        Intrinsics.checkNotNullParameter(maskFit, "maskFit");
        this.f293603a = faceRect;
        this.f293604b = maskRect;
        this.f293605c = maskFit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f293603a, gVar.f293603a) && Intrinsics.f(this.f293604b, gVar.f293604b) && this.f293605c == gVar.f293605c;
    }

    public final int hashCode() {
        return this.f293605c.hashCode() + ((this.f293604b.hashCode() + (this.f293603a.hashCode() * 31)) * 31);
    }
}
