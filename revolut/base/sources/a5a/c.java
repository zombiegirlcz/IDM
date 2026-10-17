package a5a;

import bge.e;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import dy0.c0;
import dy0.m0;
import dy0.n0;
import dy0.o;
import j30.f;
import jji.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1329b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f1328a = i;
        this.f1329b = obj2;
    }

    @Override // dy0.n0
    public final m0 a(o direction, boolean z) {
        String id10;
        switch (this.f1328a) {
            case 0:
                d dVar = (d) this.f1329b;
                Intrinsics.checkNotNullParameter(direction, "direction");
                int i = b.f1327a[direction.ordinal()];
                if (i == 1) {
                    return xqi.b.b(m0.Companion);
                }
                if (i == 2) {
                    if (z) {
                        return ((f) dVar.f1331b).b();
                    }
                    return null;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                NavBarMenuItem navBarMenuItemA = dVar.d.a();
                if (!Intrinsics.f(navBarMenuItemA != null ? navBarMenuItemA.getF53150a() : null, "ID_MENU_ITEM_NEW")) {
                    return null;
                }
                c0 c0Var = m0.Companion;
                Intrinsics.checkNotNullParameter("ID_MENU_ITEM_NEW", "id");
                return xqi.b.c(c0Var, new ListIdTarget("ID_MENU_ITEM_NEW"));
            case 1:
                e eVar = (e) this.f1329b;
                Intrinsics.checkNotNullParameter(direction, "direction");
                int i2 = bge.d.f15185a[direction.ordinal()];
                if (i2 == 1) {
                    x xVarB = z ? ((f) eVar.f15188c).b() : null;
                    return xVarB == null ? xqi.b.a(m0.Companion, eVar.e) : xVarB;
                }
                if (i2 == 2) {
                    return xqi.b.b(m0.Companion);
                }
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c0 c0Var2 = m0.Companion;
                Intrinsics.checkNotNullParameter("cards_menu_item", "id");
                return xqi.b.c(c0Var2, new ListIdTarget("cards_menu_item"));
            case 2:
                Intrinsics.checkNotNullParameter(direction, "direction");
                if (direction == o.BOTTOM) {
                    return new x((ZoomableFullScreenVideoView) this.f1329b);
                }
                return null;
            case 3:
                eje.c cVar = (eje.c) this.f1329b;
                Intrinsics.checkNotNullParameter(direction, "direction");
                int i3 = eje.b.f126870a[direction.ordinal()];
                if (i3 == 1) {
                    return xqi.b.b(m0.Companion);
                }
                if (i3 != 2) {
                    if (i3 == 3 && z) {
                        return ((f) cVar.f126873c).b();
                    }
                    return null;
                }
                NavBarMenuItem navBarMenuItemA2 = cVar.e.a();
                if (!Intrinsics.f(navBarMenuItemA2 != null ? navBarMenuItemA2.getF53150a() : null, "CARDS_MENU_ITEM_ID")) {
                    return null;
                }
                c0 c0Var3 = m0.Companion;
                Intrinsics.checkNotNullParameter("CARDS_MENU_ITEM_ID", "id");
                return xqi.b.c(c0Var3, new ListIdTarget("CARDS_MENU_ITEM_ID"));
            case 4:
                Intrinsics.checkNotNullParameter(direction, "direction");
                if (direction == o.BOTTOM) {
                    return new x((Class) this.f1329b);
                }
                return null;
            case 5:
                kke.c cVar2 = (kke.c) this.f1329b;
                Intrinsics.checkNotNullParameter(direction, "direction");
                int i5 = kke.b.f184579a[direction.ordinal()];
                if (i5 == 1) {
                    return xqi.b.b(m0.Companion);
                }
                if (i5 != 2) {
                    if (i5 == 3) {
                        NavBarMenuItem navBarMenuItemA3 = cVar2.d.a();
                        if (navBarMenuItemA3 == null || (id10 = navBarMenuItemA3.getF53150a()) == null) {
                            id10 = "INVEST_HEADER_GLOBAL_MARKETS_MENU_ITEM_ID";
                        }
                        c0 c0Var4 = m0.Companion;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return xqi.b.c(c0Var4, new ListIdTarget(id10));
                    }
                } else if (z) {
                    return ((f) cVar2.f184582c).b();
                }
                return null;
            case 6:
                Intrinsics.checkNotNullParameter(direction, "direction");
                int i6 = sie.b.f263625a[direction.ordinal()];
                if (i6 == 1) {
                    return xqi.b.a(m0.Companion, ((sie.c) this.f1329b).f263628c);
                }
                if (i6 == 2) {
                    return xqi.b.b(m0.Companion);
                }
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c0 c0Var5 = m0.Companion;
                Intrinsics.checkNotNullParameter("cards_menu_item", "id");
                return xqi.b.c(c0Var5, new ListIdTarget("cards_menu_item"));
            default:
                sle.c cVar3 = (sle.c) this.f1329b;
                Intrinsics.checkNotNullParameter(direction, "direction");
                int i21 = sle.b.f264195a[direction.ordinal()];
                if (i21 == 1) {
                    return xqi.b.b(m0.Companion);
                }
                if (i21 != 2) {
                    if (i21 == 3 && z) {
                        return ((f) cVar3.f264198c).b();
                    }
                    return null;
                }
                NavBarMenuItem navBarMenuItemA4 = cVar3.d.a();
                if (!Intrinsics.f(navBarMenuItemA4 != null ? navBarMenuItemA4.getF53150a() : null, "CARDS_MENU_ITEM_ID")) {
                    return null;
                }
                c0 c0Var6 = m0.Companion;
                Intrinsics.checkNotNullParameter("CARDS_MENU_ITEM_ID", "id");
                return xqi.b.c(c0Var6, new ListIdTarget("CARDS_MENU_ITEM_ID"));
        }
    }

    public c(Class ownerClass) {
        this.f1328a = 4;
        Intrinsics.checkNotNullParameter(ownerClass, "ownerClass");
        this.f1329b = ownerClass;
    }
}
