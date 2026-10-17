package yb0;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InfoMessageItem;
import com.revolut.feature.backend_flow.domain.models.LinkItem;
import com.revolut.feature.backend_flow.domain.models.SecondaryDescription;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lb0.g0;
import lb0.h0;
import lb0.i0;
import lb0.k0;
import lb0.l0;
import lb0.p0;
import rp0.y;
import y66.q;
import y99.x;
import yc0.c0;
import yc0.v;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements n, sa0.b, p0, bd0.a, l0, v, c0, ad0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f312153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f312154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f312155c;
    public final /* synthetic */ ad0.a d;
    public final hbl.d e;
    public final bd0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0 f312156g;

    public j(hbl.d transactionsMapper, p0 navBarMapper, bd0.a itemsSearchFilter, l0 formScreenButtonsMapper, v infoMessageDialogMapper, c0 secondaryDescriptionDialogMapper, ad0.a actionsMapper) {
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(itemsSearchFilter, "itemsSearchFilter");
        Intrinsics.checkNotNullParameter(formScreenButtonsMapper, "formScreenButtonsMapper");
        Intrinsics.checkNotNullParameter(infoMessageDialogMapper, "infoMessageDialogMapper");
        Intrinsics.checkNotNullParameter(secondaryDescriptionDialogMapper, "secondaryDescriptionDialogMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        this.f312153a = navBarMapper;
        this.f312154b = infoMessageDialogMapper;
        this.f312155c = secondaryDescriptionDialogMapper;
        this.d = actionsMapper;
        this.e = transactionsMapper;
        this.f = itemsSearchFilter;
        this.f312156g = formScreenButtonsMapper;
    }

    @Override // yc0.c0
    public final y a(SecondaryDescription description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return this.f312155c.a(description);
    }

    @Override // lb0.p0
    public final Clause b(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f312153a.b(screen);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        sa0.c cVarH = h(domainState.f312143a);
        lk0.g gVar = domainState.d;
        boolean z = false;
        if (gVar != null && (list = gVar.f196174a) != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (!((lk0.e) it8.next()).f196171a.isEmpty()) {
                        z = true;
                        break;
                    }
                }
            }
        }
        aw0.i iVarI = i(domainState.f312143a, new i0(z), g0.f193538a);
        x xVar = new x(24);
        y65.n nVar = new y65.n(13);
        return new sa0.d((List) iii.c.f(domainState.f312145c, xVar, nVar, new ccg.b(domainState, xVar, nVar, new q(domainState, this, 3), 14)), cVarH, iVarI);
    }

    @Override // bd0.a
    public final List d(String searchQuery, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return this.f.d(searchQuery, items);
    }

    @Override // lb0.p0
    public final Clause e(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f312153a.e(screen);
    }

    @Override // yc0.v
    public final y f(InfoMessageItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f312154b.f(item);
    }

    @Override // lb0.p0
    public final LinkItem g(FormScreen screen, String listId) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(listId, "listId");
        return this.f312153a.g(screen, listId);
    }

    @Override // lb0.p0
    public final sa0.c h(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f312153a.h(screen);
    }

    @Override // lb0.l0
    public final aw0.i i(FormScreen screen, k0 primaryButtonEnabledStateStrategy, h0 fabStrategy) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(primaryButtonEnabledStateStrategy, "primaryButtonEnabledStateStrategy");
        Intrinsics.checkNotNullParameter(fabStrategy, "fabStrategy");
        return this.f312156g.i(screen, primaryButtonEnabledStateStrategy, fabStrategy);
    }

    @Override // ad0.a
    public final BackendScreen j(BackendScreen screen, Action.Submit submit) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.d.j(screen, submit);
    }
}
