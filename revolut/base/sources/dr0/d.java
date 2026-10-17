package dr0;

import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color.Solid f117048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f117049b;

    public d(float f, Color.Solid color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f117048a = color;
        this.f117049b = f;
    }

    @Override // dr0.e
    public final float a() {
        return 2.0f;
    }

    @Override // dr0.e
    public final float b() {
        return this.f117049b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f117048a.equals(dVar.f117048a) && Float.compare(this.f117049b, dVar.f117049b) == 0 && Float.compare(2.0f, 2.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(2.0f) + m72.b.b(this.f117049b, Integer.hashCode(this.f117048a.f51464b) * 31, 31);
    }
}
