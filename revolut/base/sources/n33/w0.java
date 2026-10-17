package n33;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_order_new.impl.newcard.OrderNewCardContract$Configuration;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class w0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f211847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e13.a f211848c;

    public /* synthetic */ w0(f2 f2Var, e13.a aVar, int i) {
        this.f211846a = i;
        this.f211847b = f2Var;
        this.f211848c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f211846a) {
            case 0:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                f2 f2Var = this.f211847b;
                OrderNewCardContract$Configuration orderNewCardContract$Configuration = f2Var.f211716s;
                u uVar = f2Var.f211713p;
                h93.l0 l0Var = orderNewCardContract$Configuration.f65214l;
                if (l0Var != null) {
                    return ((r2) uVar).l(l0Var);
                }
                boolean zW = f2Var.W(user);
                e13.a aVar = this.f211848c;
                if (zW) {
                    return f2Var.Y(aVar);
                }
                wi0.b.Companion.getClass();
                if (te0.w.S(user, wi0.b.O0) && ((t0) f2Var.o).g()) {
                    return f2Var.Z(aVar);
                }
                if (f2Var.T(user)) {
                    return ((r2) uVar).l(h93.l0.BRAZIL_LOCAL);
                }
                if (f2Var.U(user, false)) {
                    return ((r2) uVar).l(h93.l0.INDIA_LOCAL);
                }
                return ((r2) uVar).l(null);
            case 1:
                do3.n user2 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user2, "user");
                f2 f2Var2 = this.f211847b;
                OrderNewCardContract$Configuration orderNewCardContract$Configuration2 = f2Var2.f211716s;
                u uVar2 = f2Var2.f211713p;
                h93.l0 l0Var2 = orderNewCardContract$Configuration2.f65214l;
                if (l0Var2 != null) {
                    return ((r2) uVar2).m(l0Var2);
                }
                boolean zW2 = f2Var2.W(user2);
                e13.a aVar2 = this.f211848c;
                if (zW2) {
                    return f2Var2.Y(aVar2);
                }
                wi0.b.Companion.getClass();
                if (te0.w.S(user2, wi0.b.O0) && ((t0) f2Var2.o).g()) {
                    return f2Var2.Z(aVar2);
                }
                if (f2Var2.T(user2)) {
                    return ((r2) uVar2).m(h93.l0.BRAZIL_LOCAL);
                }
                if (f2Var2.U(user2, false)) {
                    return ((r2) uVar2).m(h93.l0.INDIA_LOCAL);
                }
                return ((r2) uVar2).m(null);
            case 2:
                do3.n user3 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user3, "user");
                f2 f2Var3 = this.f211847b;
                boolean zW3 = f2Var3.W(user3);
                u uVar3 = f2Var3.f211713p;
                if (zW3) {
                    return f2Var3.Y(this.f211848c);
                }
                if (f2Var3.T(user3)) {
                    return ((r2) uVar3).k(h93.l0.BRAZIL_LOCAL);
                }
                if (f2Var3.U(user3, true)) {
                    return ((r2) uVar3).k(h93.l0.INDIA_LOCAL);
                }
                return ((r2) uVar3).k(null);
            case 3:
                List designs = (List) obj2;
                Intrinsics.checkNotNullParameter(designs, "designs");
                ArrayList arrayListI = hx7.i.i(designs);
                ArrayList arrayListG = hx7.i.g(designs);
                boolean zIsEmpty = arrayListG.isEmpty();
                f2 f2Var4 = this.f211847b;
                e13.a flowType = this.f211848c;
                if (zIsEmpty) {
                    return f2Var4.R(flowType, h93.l0.INDIA_LOCAL);
                }
                Pair pair = flowType == e13.a.DISPOSABLE ? new Pair(Boolean.valueOf(hx7.i.e(arrayListI)), Boolean.valueOf(hx7.i.e(arrayListG))) : new Pair(Boolean.valueOf(hx7.i.y(arrayListI)), Boolean.valueOf(hx7.i.y(arrayListG)));
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pair.f186386b).booleanValue();
                d dVar = f2Var4.u;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(flowType, "flowType");
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.card_screen_india_picker_title, null, null, 14), null, null, 30);
                rp0.l lVar = rp0.l.WINDOW;
                f fVar = f.INDIA;
                List listK = zhm.v.k(dVar.b(flowType, zBooleanValue, fVar), dVar.a(flowType, zBooleanValue2, fVar));
                yp0.b.k(listK, 0, R$attr.uikit_dp24, 0, 0, 29);
                return ((opi.b) f2Var4.f211717t).a0(new rp0.y(listK, tVar, lVar, null, null, null, "ORDER_NEW_CARD_BOTTOM_DIALOG_RECYCLER", null, null, null, 3832));
            default:
                List designs2 = (List) obj2;
                Intrinsics.checkNotNullParameter(designs2, "designs");
                ArrayList arrayListH = hx7.i.h(designs2);
                ArrayList arrayListF = hx7.i.f(designs2);
                boolean zIsEmpty2 = arrayListF.isEmpty();
                f2 f2Var5 = this.f211847b;
                e13.a flowType2 = this.f211848c;
                if (zIsEmpty2) {
                    return f2Var5.R(flowType2, h93.l0.BRAZIL_LOCAL);
                }
                Pair pair2 = flowType2 == e13.a.DISPOSABLE ? new Pair(Boolean.valueOf(hx7.i.e(arrayListH)), Boolean.valueOf(hx7.i.e(arrayListF))) : new Pair(Boolean.valueOf(hx7.i.y(arrayListH)), Boolean.valueOf(hx7.i.y(arrayListF)));
                boolean zBooleanValue3 = ((Boolean) pair2.f186385a).booleanValue();
                boolean zBooleanValue4 = ((Boolean) pair2.f186386b).booleanValue();
                if (!((jte.d) f2Var5.f211718w).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c)) {
                    d dVar2 = f2Var5.u;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(flowType2, "flowType");
                    rp0.t tVar2 = new rp0.t(new TextLocalisedClause(R$string.card_screen_brazil_picker_title, null, null, 14), null, null, 30);
                    rp0.l lVar2 = rp0.l.WINDOW;
                    f fVar2 = f.BRAZIL;
                    List listK2 = zhm.v.k(dVar2.b(flowType2, zBooleanValue3, fVar2), dVar2.a(flowType2, zBooleanValue4, fVar2));
                    yp0.b.k(listK2, 0, R$attr.uikit_dp24, 0, 0, 29);
                    return ((opi.b) f2Var5.f211717t).a0(new rp0.y(listK2, tVar2, lVar2, null, null, null, "ORDER_NEW_CARD_BOTTOM_DIALOG_RECYCLER", null, null, null, 3832));
                }
                r2 r2Var = (r2) f2Var5.f211713p;
                r2Var.getClass();
                Intrinsics.checkNotNullParameter(flowType2, "flowType");
                int i = o2.f211777b[flowType2.ordinal()];
                if (i == 1) {
                    pfm.h hVar = new pfm.h(new ly2.d(r2Var, 10, flowType2, null), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    return hVar;
                }
                if (i == 2 || i == 3) {
                    return r2Var.b(((t0) r2Var.d).d() == zn3.a.ONBOARDING, flowType2 == e13.a.PHYSICAL, new k2(r2Var, flowType2));
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
