package mx0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f209766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f209767c;

    public j0(List chunks, int i, m0 animationMode) {
        Intrinsics.checkNotNullParameter(chunks, "chunks");
        Intrinsics.checkNotNullParameter(animationMode, "animationMode");
        this.f209765a = chunks;
        this.f209766b = i;
        this.f209767c = animationMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f209765a, j0Var.f209765a) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && this.f209766b == j0Var.f209766b && this.f209767c == j0Var.f209767c;
    }

    public final int hashCode() {
        return this.f209767c.hashCode() + j6.a.b(this.f209766b, m72.b.b(BitmapDescriptorFactory.HUE_RED, this.f209765a.hashCode() * 31, 31), 31);
    }
}
