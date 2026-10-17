package zzb;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements cli.n {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0c.e f326669a;

    public v(b0c.e itemsMapper, b0c.c headerStateMapper, b0c.b footerMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(headerStateMapper, "headerStateMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f326669a = itemsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data preferences = domainState.f326651a;
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        b0c.e eVar = this.f326669a;
        List list = (List) iii.c.f(preferences, new b0a.j(eVar, 3), new axd.e(10), new a2f.q(eVar, 23));
        Data preferences2 = domainState.f326651a;
        Intrinsics.checkNotNullParameter(preferences2, "preferences");
        o oVar = (o) iii.c.f(preferences2, new b0a.j(2), new axd.e(9), new b0c.a(1));
        Intrinsics.checkNotNullParameter(preferences2, "preferences");
        return new p(list, oVar, (aw0.i) iii.c.f(preferences2, new b0a.j(1), new axd.e(8), new b0c.a(0)), zhm.u.c(new TextNavBarMenuItem("MENU_ITEM_SKIP_ID", new TextLocalisedClause(R$string.rev_points_personalisation_action_skip, null, new Click(30, (Integer) null, (Object) null, "MENU_ITEM_SKIP_ID", false), 10), null, null, 12)));
    }
}
