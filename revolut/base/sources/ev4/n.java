package ev4;

import ch.qos.logback.core.CoreConstants;
import com.revolut.core.model.FileExtension;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import cp4.p0;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ll4.z;
import om4.x2;
import rp0.y;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f129723w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f129723w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f129723w, continuation, 0);
            case 1:
                return new n(this.f129723w, continuation, 1);
            case 2:
                return new n(this.f129723w, continuation, 2);
            case 3:
                return new n(this.f129723w, continuation, 3);
            case 4:
                return new n(this.f129723w, continuation, 4);
            case 5:
                return new n(this.f129723w, continuation, 5);
            default:
                return new n(this.f129723w, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FileExtension fileExtension;
        Object objB;
        Object objY2;
        Object objY22;
        CellDetailsDelegate.Model model;
        CellDetailsActionDelegate.Model model2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    q qVar = this.f129723w;
                    al4.n nVar = qVar.f129728r;
                    String str = qVar.f129726p.f69656a;
                    cl4.p pVar = ((g) qVar.t2()).f129709a;
                    this.v = 1;
                    Object objD = ((x2) nVar).f226745a.k.d(new p0(str, pVar.name()), false, this);
                    if (objD != aVar) {
                        objD = Unit.f186387a;
                    }
                    if (objD != aVar) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                q qVar2 = this.f129723w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    String strQ = ((x2) qVar2.f129728r).q(qVar2.A2().f129706a, qVar2.B2().f196509b);
                    hk0.a aVar3 = qVar2.v;
                    String lowerCase = d0.w0(CoreConstants.DOT, qVar2.B2().f196509b, "").toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.f(lowerCase, "xls")) {
                        fileExtension = FileExtension.Xls.f51411b;
                    } else {
                        if (!Intrinsics.f(lowerCase, "csv")) {
                            throw new IllegalStateException(h30.l.r("Invalid sheet extension = ", lowerCase));
                        }
                        fileExtension = FileExtension.Csv.f51401b;
                    }
                    ufm.n nVarB = aVar3.b(strQ, true, fileExtension);
                    this.v = 1;
                    objB = nim.a.b(nVarB, this);
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                File file = (File) objB;
                Intrinsics.h(file);
                an4.e eVar = qVar2.u;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(file, "file");
                qVar2.C1(new BridgeDestination(eVar.f6557a.a(file)));
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    q qVar3 = this.f129723w;
                    n nVar2 = new n(qVar3, null, 1);
                    this.v = 1;
                    if (qVar3.p2(this, nVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                q qVar4 = this.f129723w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objY2 = q.y2(qVar4, this);
                    if (objY2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objY2 = obj2;
                }
                qVar4.f129727q.l(false, new eq8.b(qVar4, (ll4.d0) objY2, 12));
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    q qVar5 = this.f129723w;
                    n nVar3 = new n(qVar5, null, 3);
                    this.v = 1;
                    if (qVar5.p2(this, nVar3) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                q qVar6 = this.f129723w;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objY22 = q.y2(qVar6, this);
                    if (objY22 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objY22 = obj2;
                }
                ll4.d0 breakdown = (ll4.d0) objY22;
                sv4.a aVar8 = qVar6.f129730t;
                long j2 = qVar6.B2().f196510c;
                xi0.b currency = qVar6.A2().f129707b;
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                Intrinsics.checkNotNullParameter(currency, "currency");
                CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("id_cell_starting_balance", new TextLocalisedClause(R$string.credit_statement_starting_balance, null, null, 14), new MoneyClause(new dj0.d(breakdown.f196512b, currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("id_cell_repayments", new TextLocalisedClause(R$string.credit_statement_repayments, null, null, 14), new MoneyClause(new dj0.d(breakdown.d, currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model("id_cell_transaction", new TextLocalisedClause(R$string.credit_statement_transactions, null, null, 14), new MoneyClause(new dj0.d(breakdown.f196513c, currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                z zVar = breakdown.e;
                CellDetailsActionDelegate.Model model6 = new CellDetailsActionDelegate.Model("id_cell_action_interest", new TextLocalisedClause(R$string.credit_statement_interest, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(new dj0.d(zVar.a(), currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), false, false, null, null, 0, 0, 32736);
                if (zVar.a() > 0) {
                    model = model4;
                    model2 = model6;
                } else {
                    model = model4;
                    model2 = null;
                }
                Object[] elements = {model3, model, model5, model2, new CellDetailsDelegate.Model("id_cell_fees", new TextLocalisedClause(R$string.credit_statement_fees, null, null, 14), new MoneyClause(new dj0.d(breakdown.f196511a, currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("id_cell_statement_balance", new TextLocalisedClause(R$string.credit_statement_statement_balance, null, null, 14), new MoneyClause(new dj0.d(j2, currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.credit_statement_statement_breakdown, null, null, 14), null, null, 30);
                yp0.b.k(listL, 0, R$attr.uikit_dp24, 0, 0, 29);
                qVar6.f129727q.x(new y(listL, tVar, rp0.l.WINDOW, null, null, null, 1016));
                return Unit.f186387a;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    q qVar7 = this.f129723w;
                    n nVar4 = new n(qVar7, null, 5);
                    this.v = 1;
                    if (qVar7.p2(this, nVar4) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
