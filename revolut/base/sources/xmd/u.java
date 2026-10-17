package xmd;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f307203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f307204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eyl.a f307205c;
    public final s d;
    public final AnimatedBackgroundType.Base e;
    public final zhm.f0 f;

    public u(g navBar, e amount, eyl.a aVar, s sVar, AnimatedBackgroundType.Base background) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f307203a = navBar;
        this.f307204b = amount;
        this.f307205c = aVar;
        this.d = sVar;
        this.e = background;
        this.f = zhm.f0.f322471a;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f307203a, uVar.f307203a) && Intrinsics.f(this.f307204b, uVar.f307204b) && Intrinsics.f(this.f307205c, uVar.f307205c) && Intrinsics.f(this.d, uVar.d) && this.e == uVar.e;
    }

    @Override // xmd.x
    public final g f() {
        return this.f307203a;
    }

    @Override // xmd.x
    public final AnimatedBackgroundType.Base getBackground() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f307204b.hashCode() + (this.f307203a.hashCode() * 31)) * 31;
        eyl.a aVar = this.f307205c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        s sVar = this.d;
        return this.e.hashCode() + ((iHashCode2 + (sVar != null ? sVar.hashCode() : 0)) * 31);
    }
}
