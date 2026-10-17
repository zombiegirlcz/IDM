package jb0;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.EntityType;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InfoMessageItem;
import com.revolut.feature.backend_flow.domain.models.LinkItem;
import com.revolut.feature.backend_flow.domain.models.SecondaryDescription;
import dn8.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lb0.g0;
import lb0.i0;
import lb0.l0;
import lb0.p0;
import rp0.y;
import yc0.c0;
import yc0.v;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements n, sa0.b, p0, v, c0, ad0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f172545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f172546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f172547c;
    public final /* synthetic */ ad0.a d;
    public final eb0.a e;
    public final l0 f;

    public j(eb0.a paginationMapper, l0 formScreenButtonsMapper, p0 navBarMapper, v infoMessageDialogMapper, c0 secondaryDescriptionDialogMapper, ad0.a actionsMapper) {
        Intrinsics.checkNotNullParameter(paginationMapper, "paginationMapper");
        Intrinsics.checkNotNullParameter(formScreenButtonsMapper, "formScreenButtonsMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(infoMessageDialogMapper, "infoMessageDialogMapper");
        Intrinsics.checkNotNullParameter(secondaryDescriptionDialogMapper, "secondaryDescriptionDialogMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        this.f172545a = navBarMapper;
        this.f172546b = infoMessageDialogMapper;
        this.f172547c = secondaryDescriptionDialogMapper;
        this.d = actionsMapper;
        this.e = paginationMapper;
        this.f = formScreenButtonsMapper;
    }

    @Override // yc0.c0
    public final y a(SecondaryDescription description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return this.f172547c.a(description);
    }

    @Override // lb0.p0
    public final Clause b(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f172545a.b(screen);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        FormScreen formScreen = domainState.f172537a;
        sa0.c cVarH = h(formScreen);
        boolean zF = Intrinsics.f(ue8.c.J(formScreen).f63424b, EntityType.Transaction.f63436a);
        Clause clause = cVarH.f261205a;
        Clause clause2 = cVarH.f261206b;
        Image image = cVarH.d;
        List menuItems = cVarH.e;
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        sa0.c cVar = new sa0.c(clause, clause2, zF, image, menuItems);
        lk0.g gVar = domainState.f172539c;
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
        aw0.i iVarI = this.f.i(domainState.f172537a, new i0(z), g0.f193538a);
        EntitiesSelectionItem item = ue8.c.J(formScreen);
        eb0.a aVar = this.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        return new sa0.d((List) iii.c.g(gVar, new a5g.i(5, 13), new e6e.a(14), new k(aVar, item, 14)), cVar, iVarI);
    }

    @Override // lb0.p0
    public final Clause e(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f172545a.e(screen);
    }

    @Override // yc0.v
    public final y f(InfoMessageItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f172546b.f(item);
    }

    @Override // lb0.p0
    public final LinkItem g(FormScreen screen, String listId) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(listId, "listId");
        return this.f172545a.g(screen, listId);
    }

    @Override // lb0.p0
    public final sa0.c h(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f172545a.h(screen);
    }

    @Override // ad0.a
    public final BackendScreen j(BackendScreen screen, Action.Submit submit) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.d.j(screen, submit);
    }
}
