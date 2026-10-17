package xmd;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.NumberClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f307214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NumberClause f307215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatedBackgroundType.Base f307216c;
    public final zhm.f0 d;

    public w(g navBar, NumberClause amount, AnimatedBackgroundType.Base background) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f307214a = navBar;
        this.f307215b = amount;
        this.f307216c = background;
        this.d = zhm.f0.f322471a;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f307214a.equals(wVar.f307214a) && this.f307215b.equals(wVar.f307215b) && this.f307216c == wVar.f307216c;
    }

    @Override // xmd.x
    public final g f() {
        return this.f307214a;
    }

    @Override // xmd.x
    public final AnimatedBackgroundType.Base getBackground() {
        return this.f307216c;
    }

    public final int hashCode() {
        return this.f307216c.hashCode() + ((this.f307215b.hashCode() + (this.f307214a.hashCode() * 31)) * 31);
    }
}
