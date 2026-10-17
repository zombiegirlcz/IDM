package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.bottom_sheet.new_watchlist.NewWatchlistController;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlowContract$ModalStep;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlowContract$PagerItem;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsController;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsControllerContract$InputData;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreenContract$InputData;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l3d.r;
import mra.d;
import oki.h;
import qgd.g;
import w4l.i;
import wgd.f;
import xgd.n;
import xgd.s;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements f {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f86915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final MultipleWatchlistsFlowContract$InputData f86916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f86917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f86918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ali.b f86919t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(a stateMapper, g newWatchlistDialogMapper, s editWatchlistsDialogMapper, MultipleWatchlistsFlowContract$InputData inputData, r multipleWatchlistInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(newWatchlistDialogMapper, "newWatchlistDialogMapper");
        Intrinsics.checkNotNullParameter(editWatchlistsDialogMapper, "editWatchlistsDialogMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(multipleWatchlistInteractor, "multipleWatchlistInteractor");
        this.o = newWatchlistDialogMapper;
        this.f86915p = editWatchlistsDialogMapper;
        this.f86916q = inputData;
        this.f86917r = multipleWatchlistInteractor;
        this.f86918s = d.b(this, new wgd.g(new Data(null, null, true, 3, null), inputData.f86908b), stateMapper, null, false, 12);
        final int i = 0;
        this.f86919t = md6.s.b(this, new Function2(this) { // from class: wgd.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b f297317b;

            {
                this.f297317b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        MultipleWatchlistsFlowContract$PagerItem pageItem = (MultipleWatchlistsFlowContract$PagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(pageItem, "pageItem");
                        MultipleWatchlistsFlowContract$PagerItem.Content content = pageItem instanceof MultipleWatchlistsFlowContract$PagerItem.Content ? (MultipleWatchlistsFlowContract$PagerItem.Content) pageItem : null;
                        return new WatchlistAssetsScreen(new WatchlistAssetsScreenContract$InputData(this.f297317b.f86916q.f86907a, content != null ? content.f86911a : null));
                    default:
                        final com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b bVar = this.f297317b;
                        MultipleWatchlistsFlowContract$InputData multipleWatchlistsFlowContract$InputData = bVar.f86916q;
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        MultipleWatchlistsFlowContract$ModalStep step = (MultipleWatchlistsFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (Intrinsics.f(step, MultipleWatchlistsFlowContract$ModalStep.AddWatchlistModal.f86909a)) {
                            NewWatchlistController newWatchlistController = new NewWatchlistController(new qgd.d(multipleWatchlistsFlowContract$InputData.f86907a.f86890b));
                            final int i2 = 0;
                            Function1 block = new Function1() { // from class: wgd.j
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i2) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter((qgd.e) obj4, "it");
                                            com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b bVar2 = bVar;
                                            bVar2.o.getClass();
                                            bVar2.X1(new mii.e("new-watchlist-created-message", new TextLocalisedClause(R$string.watchlists_new_watchlist_success_message, null, null, 14), null, 28));
                                            break;
                                        default:
                                            n it8 = (n) obj4;
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            if (it8.f305686a) {
                                                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b bVar3 = bVar;
                                                bVar3.f86915p.getClass();
                                                bVar3.X1(new mii.e("watchlists-changes-saved-dialog", new TextLocalisedClause(R$string.watchlists_edit_watchlists_confirmation_message, null, null, 14), null, 28));
                                            }
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block, "block");
                            newWatchlistController.H = block;
                            return newWatchlistController;
                        }
                        if (!Intrinsics.f(step, MultipleWatchlistsFlowContract$ModalStep.EditWatchlists.f86910a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EditWatchlistsController editWatchlistsController = new EditWatchlistsController(new EditWatchlistsControllerContract$InputData(multipleWatchlistsFlowContract$InputData.f86907a));
                        final int i3 = 1;
                        Function1 block2 = new Function1() { // from class: wgd.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i3) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter((qgd.e) obj4, "it");
                                        com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b bVar2 = bVar;
                                        bVar2.o.getClass();
                                        bVar2.X1(new mii.e("new-watchlist-created-message", new TextLocalisedClause(R$string.watchlists_new_watchlist_success_message, null, null, 14), null, 28));
                                        break;
                                    default:
                                        n it8 = (n) obj4;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        if (it8.f305686a) {
                                            com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b bVar3 = bVar;
                                            bVar3.f86915p.getClass();
                                            bVar3.X1(new mii.e("watchlists-changes-saved-dialog", new TextLocalisedClause(R$string.watchlists_edit_watchlists_confirmation_message, null, null, 14), null, 28));
                                        }
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        Intrinsics.checkNotNullParameter(block2, "block");
                        editWatchlistsController.H = block2;
                        return editWatchlistsController;
                }
            }
        });
        final int i2 = 1;
        this.u = e.a(this, new Function2(this) { // from class: wgd.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b f297317b;

            {
                this.f297317b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        MultipleWatchlistsFlowContract$PagerItem pageItem = (MultipleWatchlistsFlowContract$PagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(pageItem, "pageItem");
                        MultipleWatchlistsFlowContract$PagerItem.Content content = pageItem instanceof MultipleWatchlistsFlowContract$PagerItem.Content ? (MultipleWatchlistsFlowContract$PagerItem.Content) pageItem : null;
                        return new WatchlistAssetsScreen(new WatchlistAssetsScreenContract$InputData(this.f297317b.f86916q.f86907a, content != null ? content.f86911a : null));
                    default:
                        final com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b bVar = this.f297317b;
                        MultipleWatchlistsFlowContract$InputData multipleWatchlistsFlowContract$InputData = bVar.f86916q;
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        MultipleWatchlistsFlowContract$ModalStep step = (MultipleWatchlistsFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (Intrinsics.f(step, MultipleWatchlistsFlowContract$ModalStep.AddWatchlistModal.f86909a)) {
                            NewWatchlistController newWatchlistController = new NewWatchlistController(new qgd.d(multipleWatchlistsFlowContract$InputData.f86907a.f86890b));
                            final int i22 = 0;
                            Function1 block = new Function1() { // from class: wgd.j
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i22) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter((qgd.e) obj4, "it");
                                            com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b bVar2 = bVar;
                                            bVar2.o.getClass();
                                            bVar2.X1(new mii.e("new-watchlist-created-message", new TextLocalisedClause(R$string.watchlists_new_watchlist_success_message, null, null, 14), null, 28));
                                            break;
                                        default:
                                            n it8 = (n) obj4;
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            if (it8.f305686a) {
                                                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b bVar3 = bVar;
                                                bVar3.f86915p.getClass();
                                                bVar3.X1(new mii.e("watchlists-changes-saved-dialog", new TextLocalisedClause(R$string.watchlists_edit_watchlists_confirmation_message, null, null, 14), null, 28));
                                            }
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block, "block");
                            newWatchlistController.H = block;
                            return newWatchlistController;
                        }
                        if (!Intrinsics.f(step, MultipleWatchlistsFlowContract$ModalStep.EditWatchlists.f86910a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EditWatchlistsController editWatchlistsController = new EditWatchlistsController(new EditWatchlistsControllerContract$InputData(multipleWatchlistsFlowContract$InputData.f86907a));
                        final int i3 = 1;
                        Function1 block2 = new Function1() { // from class: wgd.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i3) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter((qgd.e) obj4, "it");
                                        com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b bVar2 = bVar;
                                        bVar2.o.getClass();
                                        bVar2.X1(new mii.e("new-watchlist-created-message", new TextLocalisedClause(R$string.watchlists_new_watchlist_success_message, null, null, 14), null, 28));
                                        break;
                                    default:
                                        n it8 = (n) obj4;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        if (it8.f305686a) {
                                            com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b bVar3 = bVar;
                                            bVar3.f86915p.getClass();
                                            bVar3.X1(new mii.e("watchlists-changes-saved-dialog", new TextLocalisedClause(R$string.watchlists_edit_watchlists_confirmation_message, null, null, 14), null, 28));
                                        }
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        Intrinsics.checkNotNullParameter(block2, "block");
                        editWatchlistsController.H = block2;
                        return editWatchlistsController;
                }
            }
        });
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f86919t;
    }

    @Override // yji.l
    public final void I1() {
        CombinedWatchlistContext combinedWatchlistContext = this.f86916q.f86907a;
        l.a1(this, this.f86917r.d(combinedWatchlistContext.f86890b, combinedWatchlistContext.f86889a, i.f294643c), null, null, new w50.g(this, (Continuation) null, 21), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f86918s;
    }
}
