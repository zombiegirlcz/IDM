package g62;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements y02.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType.Esim f140820b;

    public g(aim.e items, AnimatedBackgroundType.Esim esim) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140819a = items;
        this.f140820b = esim;
    }

    @Override // cli.p
    public final List c() {
        return this.f140819a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f140819a, gVar.f140819a) && Intrinsics.f(this.f140820b, gVar.f140820b);
    }

    public final int hashCode() {
        int iHashCode = this.f140819a.hashCode() * 31;
        AnimatedBackgroundType.Esim esim = this.f140820b;
        return iHashCode + (esim == null ? 0 : esim.hashCode());
    }

    @Override // y02.b
    public final AnimatedBackgroundType.Esim m() {
        return this.f140820b;
    }
}
