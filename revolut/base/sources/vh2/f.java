package vh2;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements y02.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f289276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType.Esim f289277b;

    public f(aim.e items, AnimatedBackgroundType.Esim esim) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f289276a = items;
        this.f289277b = esim;
    }

    @Override // cli.p
    public final List c() {
        return this.f289276a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f289276a, fVar.f289276a) && Intrinsics.f(this.f289277b, fVar.f289277b);
    }

    public final int hashCode() {
        int iHashCode = this.f289276a.hashCode() * 31;
        AnimatedBackgroundType.Esim esim = this.f289277b;
        return iHashCode + (esim == null ? 0 : esim.hashCode());
    }

    @Override // y02.b
    public final AnimatedBackgroundType.Esim m() {
        return this.f289277b;
    }
}
