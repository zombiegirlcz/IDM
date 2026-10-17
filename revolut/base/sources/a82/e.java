package a82;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements y02.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType.Esim f2003b;

    public e(aim.e items, AnimatedBackgroundType.Esim esim) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f2002a = items;
        this.f2003b = esim;
    }

    @Override // cli.p
    public final List c() {
        return this.f2002a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f2002a, eVar.f2002a) && Intrinsics.f(this.f2003b, eVar.f2003b);
    }

    public final int hashCode() {
        int iHashCode = this.f2002a.hashCode() * 31;
        AnimatedBackgroundType.Esim esim = this.f2003b;
        return iHashCode + (esim == null ? 0 : esim.hashCode());
    }

    @Override // y02.b
    public final AnimatedBackgroundType.Esim m() {
        return this.f2003b;
    }
}
