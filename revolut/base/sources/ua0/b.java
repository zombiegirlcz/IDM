package ua0;

import com.revolut.core.backend_flow.impl.ui.entities_list.EntitiesListController;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.EntityType;
import com.revolut.feature.backend_flow.domain.models.InfoListItemSubitem;
import com.revolut.feature.backend_flow.domain.models.TransactionCellItem;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import com.revolut.kompot.common.ModalDestination;
import f01.c;
import hb0.h;
import ip0.az;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.d;
import t38.e;
import xl2.v;
import yji.n;
import zc0.n3;
import zc0.o3;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qa0.b f278512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wa0.b f278513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f278514n;

    public b(qa0.b externalNavigationExtension, wa0.b preloaderInteractor, c uiKitResources) {
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        Intrinsics.checkNotNullParameter(preloaderInteractor, "preloaderInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f278512l = externalNavigationExtension;
        this.f278513m = preloaderInteractor;
        this.f278514n = uiKitResources;
    }

    @Override // ua0.a
    public final void F0(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (clickData.d instanceof n3) {
            S0(clickData.f275445a);
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, "DefaultItemsScreenModelDelegate", "Unsupported NotificationCentreItemDelegate ClickData parcel", null, h0Var);
    }

    @Override // ua0.a
    public final void N0(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.d;
        if (obj2 instanceof InfoListItemSubitem.Link) {
            S0(((InfoListItemSubitem.Link) obj2).d);
        } else {
            if (obj2 instanceof n3) {
                S0(clickData.f275445a);
                return;
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, "DefaultItemsScreenModelDelegate", "Unsupported RowDelegate ClickData parcel", null, h0Var);
        }
    }

    @Override // ua0.a
    public final void S0(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f278512l.Z2(link);
    }

    @Override // ua0.a
    public final void U0(BackendScreen screen, LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.i;
        if (obj2 instanceof EntitiesListItem) {
            n.P2(this, new EntitiesListController(new h(screen, (EntitiesListItem) obj2, false, 5)), null, null, 3);
        }
    }

    @Override // ua0.a
    public final void V0(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        if (obj2 instanceof TransactionCellItem) {
            String link = ((TransactionCellItem) obj2).f63703c;
            if (link != null) {
                Intrinsics.checkNotNullParameter(link, "link");
                this.f278512l.Z2(link);
                return;
            }
            return;
        }
        if (obj2 instanceof o3) {
            S0(((o3) obj2).f321099b);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Model doesn't contain supported items ", model.f53228a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, "DefaultItemsScreenModelDelegate", null, illegalArgumentException, h0Var);
    }

    @Override // ua0.a
    public final Flow X0(v screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        wa0.b bVar = this.f278513m;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        List<BackendItem> f = screen.getF();
        ArrayList arrayList = new ArrayList();
        for (BackendItem backendItem : f) {
            pb0.a aVar = (pb0.a) bVar.f295791a.get(backendItem.getClass());
            Flow flowA = aVar != null ? aVar.a(backendItem) : null;
            if (flowA != null) {
                arrayList.add(flowA);
            }
        }
        return new e(new uf0.b((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 11), 28, bVar, screen);
    }

    public final void Z2(Object obj2) {
        if (!(obj2 instanceof FincrimeHomeScreenAction.Deeplink)) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, "DefaultItemsScreenModelDelegate", "Unsupported ProgressStepVertical ClickData parcel", null, h0Var);
        } else {
            String str = ((FincrimeHomeScreenAction.Deeplink) obj2).f64132a;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.f278512l.Z2(str);
        }
    }

    @Override // ua0.a
    public final void j1(ProgressStepVerticalV2Delegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Z2(model.f53016n);
    }

    @Override // ua0.a
    public final void r1(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Z2(clickData.d);
    }

    @Override // ua0.a
    public final void v0(BackendScreen screen, String summaryId, EntityType type) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(summaryId, "summaryId");
        Intrinsics.checkNotNullParameter(type, "type");
        TextLocalisedClause textLocalisedClauseB = uc0.b.B(type);
        n.P2(this, new EntitiesListController(new h(screen, new EntitiesListItem(summaryId, type, textLocalisedClauseB != null ? this.f278514n.b(textLocalisedClauseB).toString() : null, null, null), true, 1)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }

    @Override // ua0.a
    public final void w1(az clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.f163509c;
        if (obj2 instanceof InfoListItemSubitem.Link) {
            this.f278512l.Z2(((InfoListItemSubitem.Link) obj2).d);
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, "DefaultItemsScreenModelDelegate", a0.d.m(obj2, "Unsupported NotificationCentreItemDelegate ClickData parcel = "), null, h0Var);
        }
    }
}
