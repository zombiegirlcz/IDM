package xmd;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f307200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f307201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f307202c;
    public final aw0.e d;
    public final AnimatedBackgroundType.Base e;

    public t(g navBar, List items, r rVar, aw0.e footer, AnimatedBackgroundType.Base background) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f307200a = navBar;
        this.f307201b = items;
        this.f307202c = rVar;
        this.d = footer;
        this.e = background;
    }

    @Override // cli.p
    public final List c() {
        return this.f307201b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f307200a.equals(tVar.f307200a) && Intrinsics.f(this.f307201b, tVar.f307201b) && Intrinsics.f(this.f307202c, tVar.f307202c) && this.d.equals(tVar.d) && this.e == tVar.e;
    }

    @Override // xmd.x
    public final g f() {
        return this.f307200a;
    }

    @Override // xmd.x
    public final AnimatedBackgroundType.Base getBackground() {
        return this.e;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f307200a.hashCode() * 31, 31, this.f307201b);
        r rVar = this.f307202c;
        return this.e.hashCode() + ehe.n.c(this.d, (iD + (rVar == null ? 0 : rVar.hashCode())) * 31, 31);
    }
}
