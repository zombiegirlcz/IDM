package lb0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.DateInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InfoMessageItem;
import com.revolut.feature.backend_flow.domain.models.LinkItem;
import com.revolut.feature.backend_flow.domain.models.SecondaryDescription;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r0 implements cli.n, yc0.k, sa0.b, p0, yc0.c0, yc0.v, ad0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yc0.m f193554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f193555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yc0.c0 f193556c;
    public final /* synthetic */ yc0.v d;
    public final /* synthetic */ ad0.a e;
    public final zc0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bd0.a f193557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0 f193558h;

    public r0(zc0.c itemsMapper, p0 navBarMapper, yc0.m datePickerDialogMapper, bd0.a itemsSearchFilter, yc0.c0 secondaryDescriptionDialogMapper, yc0.v infoMessageDialogMapper, l0 formScreenButtonsMapper, ad0.a actionsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(datePickerDialogMapper, "datePickerDialogMapper");
        Intrinsics.checkNotNullParameter(itemsSearchFilter, "itemsSearchFilter");
        Intrinsics.checkNotNullParameter(secondaryDescriptionDialogMapper, "secondaryDescriptionDialogMapper");
        Intrinsics.checkNotNullParameter(infoMessageDialogMapper, "infoMessageDialogMapper");
        Intrinsics.checkNotNullParameter(formScreenButtonsMapper, "formScreenButtonsMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        this.f193554a = datePickerDialogMapper;
        this.f193555b = navBarMapper;
        this.f193556c = secondaryDescriptionDialogMapper;
        this.d = infoMessageDialogMapper;
        this.e = actionsMapper;
        this.f = itemsMapper;
        this.f193557g = itemsSearchFilter;
        this.f193558h = formScreenButtonsMapper;
    }

    @Override // yc0.c0
    public final rp0.y a(SecondaryDescription description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return this.f193556c.a(description);
    }

    @Override // lb0.p0
    public final Clause b(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f193555b.b(screen);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        p domainState = (p) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        FormScreen formScreen = domainState.f193546a;
        return new sa0.d((List) iii.c.f(domainState.f193548c, new l9j.k(28), new l9j.j(7), new a0i.a(this, 29, formScreen, domainState)), h(formScreen), this.f193558h.i(formScreen, j0.f193540a, f0.f193537a));
    }

    @Override // yc0.k
    public final rp0.y d(FormScreen screen, DateInputItem item, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f193554a.d(screen, item, localDate);
    }

    @Override // lb0.p0
    public final Clause e(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f193555b.e(screen);
    }

    @Override // yc0.v
    public final rp0.y f(InfoMessageItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.d.f(item);
    }

    @Override // lb0.p0
    public final LinkItem g(FormScreen screen, String listId) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(listId, "listId");
        return this.f193555b.g(screen, listId);
    }

    @Override // lb0.p0
    public final sa0.c h(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f193555b.h(screen);
    }

    @Override // ad0.a
    public final BackendScreen j(BackendScreen screen, Action.Submit submit) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.e.j(screen, submit);
    }
}
