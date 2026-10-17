package xmd;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f307208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f307209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundType.Base f307210c;

    public v(g navBar, List items, AnimatedBackgroundType.Base background) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f307208a = navBar;
        this.f307209b = items;
        this.f307210c = background;
    }

    @Override // cli.p
    public final List c() {
        return this.f307209b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f307208a, vVar.f307208a) && Intrinsics.f(this.f307209b, vVar.f307209b) && this.f307210c == vVar.f307210c;
    }

    @Override // xmd.x
    public final g f() {
        return this.f307208a;
    }

    @Override // xmd.x
    public final AnimatedBackgroundType.Base getBackground() {
        return this.f307210c;
    }

    public final int hashCode() {
        return this.f307210c.hashCode() + p.a.d(this.f307208a.hashCode() * 31, 31, this.f307209b);
    }
}
