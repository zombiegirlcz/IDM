package qpb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.api.FreelancerApi$Toggles;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import et6.l0;
import et6.r1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rm2.s;
import rpb.a0;
import s65.r;
import s6e.z;
import vkm.q;
import vkm.v1;
import vkm.y;
import ypg.p;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f248330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nob.a f248331c;
    public final a0 d;

    public c(e widgetsInteractor, nob.a automationsContentMapper, a0 savingsWidgetsVisibilityInteractor) {
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(automationsContentMapper, "automationsContentMapper");
        Intrinsics.checkNotNullParameter(savingsWidgetsVisibilityInteractor, "savingsWidgetsVisibilityInteractor");
        this.f248330b = widgetsInteractor;
        this.f248331c = automationsContentMapper;
        this.d = savingsWidgetsVisibilityInteractor;
    }

    public static void j(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.r(str, " is not eligible for Automations Widget"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        throw illegalStateException;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (Intrinsics.f(str, "VaultAutomationsList")) {
            dsh.e.Companion.getClass();
            return dsh.d.a();
        }
        j(str);
        throw null;
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        if (Intrinsics.f(str, "VaultAutomationsList")) {
            return Boolean.TRUE;
        }
        j(str);
        throw null;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "VaultAutomationsList")) {
            return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.savings_widget_automations_title, null, null, 14), 0, null, 28);
        }
        j(widgetType);
        throw null;
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        VaultWidgetContext vaultWidgetContext = (VaultWidgetContext) widgetContext;
        if (!Intrinsics.f(str, "VaultAutomationsList")) {
            j(str);
            throw null;
        }
        VaultWidgetContext.Type type = vaultWidgetContext.f74721b;
        return this.d.a(type, type.getF74730a(), eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        VaultWidgetContext vaultWidgetContext = (VaultWidgetContext) widgetContext;
        if (Intrinsics.f(str2, "VaultAutomationsList")) {
            return q.x(i(vaultWidgetContext, str), fVar);
        }
        j(str2);
        throw null;
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        VaultWidgetContext widgetContext2 = (VaultWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.f(widgetType, "VaultAutomationsList")) {
            return i(widgetContext2, id10);
        }
        j(widgetType);
        throw null;
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((VaultWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final y i(VaultWidgetContext vaultWidgetContext, String str) {
        Flow flowB;
        Flow flowA;
        VaultWidgetContext.Type type = vaultWidgetContext.f74721b;
        n nVar = (n) this.f248330b;
        twg.c cVar = nVar.f248345a;
        xua.a aVar = (xua.a) cVar.f275019c;
        rnb.m mVar = nVar.d;
        s6e.b bVar = nVar.f;
        Intrinsics.checkNotNullParameter(type, "type");
        boolean z = type instanceof VaultWidgetContext.Type.Pockets;
        w4l.h hVar = w4l.h.f294642c;
        if (z || (type instanceof VaultWidgetContext.Type.JointPockets) || (type instanceof VaultWidgetContext.Type.ProRegularPockets) || (type instanceof VaultWidgetContext.Type.ProTaxPockets) || (type instanceof VaultWidgetContext.Type.JuniorPockets) || (type instanceof VaultWidgetContext.Type.TeenPockets)) {
            flowB = rd0.e.b(((p) nVar.f248346b).j(type.getF74730a(), hVar));
        } else {
            if (!(type instanceof VaultWidgetContext.Type.Savings) && !(type instanceof VaultWidgetContext.Type.JointSavings) && !(type instanceof VaultWidgetContext.Type.JuniorSavings)) {
                throw new NoWhenBranchMatchedException();
            }
            flowB = nVar.f248347c.c(type.getF74730a(), hVar);
        }
        Continuation continuation = null;
        if (z) {
            flowA = bVar.a(((VaultWidgetContext.Type.Pockets) type).f74726a);
        } else if (type instanceof VaultWidgetContext.Type.Savings) {
            flowA = mVar.a(((VaultWidgetContext.Type.Savings) type).f74729a);
        } else if (type instanceof VaultWidgetContext.Type.JointSavings) {
            String vaultId = ((VaultWidgetContext.Type.JointSavings) type).f74723a;
            Intrinsics.checkNotNullParameter(vaultId, "vaultId");
            flowA = nim.a.v(u0.m(q.Q(new v1(new rnb.k(mVar, continuation, 1)), new rnb.j(continuation, mVar, vaultId, 1)), q.Q(new v1(new rnb.k(mVar, continuation, 0)), new rnb.j(continuation, mVar, vaultId, 0))), new s(23));
        } else if (type instanceof VaultWidgetContext.Type.JointPockets) {
            String subaccountId = ((VaultWidgetContext.Type.JointPockets) type).f74722a;
            Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
            flowA = nim.a.v(u0.m(rd0.e.b(((yua.q) bVar.f260263b).q(subaccountId)), nim.a.v(xam.a.h(new s6e.a(bVar, continuation, 0), ((z) bVar.f260262a).u(subaccountId)), new r(9))), new r(10));
        } else if (type instanceof VaultWidgetContext.Type.ProRegularPockets) {
            String subaccountId2 = ((VaultWidgetContext.Type.ProRegularPockets) type).f74727a;
            Intrinsics.checkNotNullParameter(subaccountId2, "subaccountId");
            vkm.d dVarB = rd0.e.b(((yua.q) aVar).q(subaccountId2));
            l0 l0Var = (l0) ((gr6.e) cVar.f275017a);
            flowA = nim.a.v(u0.m(dVarB, (((jte.d) l0Var.f129264b).c(FreelancerApi$Toggles.ProPocketSpareChange.f73169c) && l0Var.b("FREELANCER_POCKETS.regular_pocket")) ? nim.a.v(rd0.e.b(((p) ((ppg.b) cVar.d)).k(subaccountId2)), new r1(6)) : new go.g(new Data(djb.s.f115286a, null, false, 6, null), 2)), new r1(4));
        } else if (type instanceof VaultWidgetContext.Type.ProTaxPockets) {
            String subaccountId3 = ((VaultWidgetContext.Type.ProTaxPockets) type).f74728a;
            Intrinsics.checkNotNullParameter(subaccountId3, "subaccountId");
            flowA = nim.a.v(u0.m(((zjh.i) cVar.f275018b).j(w4l.i.f294643c), rd0.e.b(((yua.q) aVar).q(subaccountId3))), new r1(5));
        } else if (type instanceof VaultWidgetContext.Type.JuniorPockets) {
            flowA = bVar.a(((VaultWidgetContext.Type.JuniorPockets) type).f74724a);
        } else if (type instanceof VaultWidgetContext.Type.TeenPockets) {
            flowA = nim.a.v(bVar.a(((VaultWidgetContext.Type.TeenPockets) type).f74730a), new qnd.c(29));
        } else {
            if (!(type instanceof VaultWidgetContext.Type.JuniorSavings)) {
                throw new NoWhenBranchMatchedException();
            }
            flowA = mVar.a(((VaultWidgetContext.Type.JuniorSavings) type).f74725a);
        }
        int i = 0;
        return rd0.e.e(mo3.a.g(nim.a.v(nim.a.v(u0.m(flowB, flowA), new i(i)), new a(this, str, i)), null, new qjj.g(20), 1), h0.f322473a, new b(this, str, null));
    }
}
