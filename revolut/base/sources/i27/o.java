package i27;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.pb0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u17.k f157887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x17.f f157888b;

    public o(u17.k filterChipsProvider, x17.f filtersDelegate) {
        Intrinsics.checkNotNullParameter(filterChipsProvider, "filterChipsProvider");
        Intrinsics.checkNotNullParameter(filtersDelegate, "filtersDelegate");
        this.f157887a = filterChipsProvider;
        this.f157888b = filtersDelegate;
    }

    public static aim.e a(Throwable th10, boolean z) {
        aim.e eVarB = u.b();
        if (th10 != null) {
            a0.x(tj0.a.a(th10) ? iii.c.e(6, null, true) : iii.c.b(null, null, 6, true), eVarB);
        } else if (z) {
            eVarB.add(new pb0("LOADING_INDICATOR_ITEM_ID"));
        }
        return u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a domainState = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listC = (!domainState.d ? domainState : null) != null ? u.c(new ActionNavBarMenuItem("SEARCH_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))) : null;
        if (listC == null) {
            listC = f0.f322471a;
        }
        return new i(new h(listC, domainState.d), (List) iii.c.f(domainState.f74190a.f269307c, new i0k.f(26), new hy2.b(26), new hb4.n(this, domainState, 20)));
    }
}
