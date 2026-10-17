package qdk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f244981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType f244982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f244983c;
    public final aw0.i d;
    public final List e;

    public r0(b0 header, AnimatedBackgroundType animatedBackgroundType, List menuItems, aw0.e eVar, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f244981a = header;
        this.f244982b = animatedBackgroundType;
        this.f244983c = menuItems;
        this.d = eVar;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f244981a, r0Var.f244981a) && Intrinsics.f(this.f244982b, r0Var.f244982b) && Intrinsics.f(this.f244983c, r0Var.f244983c) && Intrinsics.f(this.d, r0Var.d) && Intrinsics.f(this.e, r0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f244981a.hashCode() * 31;
        AnimatedBackgroundType animatedBackgroundType = this.f244982b;
        int iD = p.a.d((iHashCode + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode())) * 31, 31, this.f244983c);
        aw0.i iVar = this.d;
        return this.e.hashCode() + ((iD + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
