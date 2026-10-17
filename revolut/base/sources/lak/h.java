package lak;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.retail.feature.pda.impl.R$string;
import com.revolut.retail.feature.pda.impl.ui.SetUpPdaActivityContract$Step;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.d0;
import i9g.f0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pda.impl.ui.a f193416b;

    public /* synthetic */ h(com.revolut.retail.feature.pda.impl.ui.a aVar, int i) {
        this.f193415a = i;
        this.f193416b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193415a) {
            case 0:
                iak.d dVar = (iak.d) this.f193416b.f102386n;
                efm.k kVarFirstElement = dVar.f160049a.a().firstElement();
                f0 f0Var = new f0(18, new iak.c(dVar, 0));
                kVarFirstElement.getClass();
                pfm.a aVar = new pfm.a(new rfm.l(kVarFirstElement, f0Var, 0), new f0(19, new i4g.g(1, dVar.f160049a, iak.b.class, "updateCurrentStep", "updateCurrentStep(Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivityContract$Step;)Lio/reactivex/Completable;", 0, 9)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 1:
                com.revolut.retail.feature.pda.impl.ui.a aVar2 = this.f193416b;
                iak.b bVar = aVar2.o;
                c cVar = aVar2.f102386n;
                SetUpPdaActivityContract$Step step = (SetUpPdaActivityContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, SetUpPdaActivityContract$Step.Intro.f102381a)) {
                    return Intrinsics.f(step, SetUpPdaActivityContract$Step.Confirmation.f102379a) ? bVar.d.a(null) : ((iak.d) cVar).a();
                }
                efm.b bVarA = ((iak.d) cVar).a();
                d0 d0VarFirstOrError = m70.a.g(zi0.c.J(((r21.h) bVar.f160045b.f182495a).f251040g.f(Unit.f186387a, true)), null, null, 3).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                pfm.a aVar3 = new pfm.a(ue0.e.t(d0VarFirstOrError, h0.f322473a), new i(new h(aVar2, 10), 6), 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return bVarA.e(aVar3);
            case 2:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((k3l.d) this.f193416b.f102387p).O(new StatusViewConfiguration.Success("ITEM_ID_SUCCESS_STATUS_DIALOG", new TextLocalisedClause(R$string.beneficiary_pda_activation_success_title, null, null, 14), null, null, null, 2044));
                return Unit.f186387a;
            case 3:
                f5j.a beneficiary = (f5j.a) obj2;
                Intrinsics.checkNotNullParameter(beneficiary, "it");
                com.revolut.retail.feature.pda.impl.ui.a aVar4 = this.f193416b;
                iak.b bVar2 = aVar4.o;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                return w.z0(((iak.a) bVar2.f160044a).w0(), beneficiary).e(((iak.d) aVar4.f102386n).f160049a.b(SetUpPdaActivityContract$Step.Confirmation.f102379a));
            case 4:
                Clause clause = (Clause) obj2;
                xpi.g gVar = this.f193416b.f102383j;
                Intrinsics.h(clause);
                ((xpi.c) gVar).n0(clause);
                return Unit.f186387a;
            case 5:
                Boolean bool = (Boolean) obj2;
                ypi.i iVar = this.f193416b.k;
                Intrinsics.h(bool);
                iVar.setVisible(bool.booleanValue());
                return Unit.f186387a;
            case 6:
                Clause nextButtonLabel = (Clause) obj2;
                Intrinsics.checkNotNullParameter(nextButtonLabel, "nextButtonLabel");
                this.f193416b.k.f(nextButtonLabel);
                return Unit.f186387a;
            case 7:
                xpi.g gVar2 = this.f193416b.f102383j;
                if (((Boolean) obj2).booleanValue()) {
                    NavBarWithToolbar navBarWithToolbar = ((xpi.c) gVar2).f307974j;
                    if (navBarWithToolbar == null) {
                        Intrinsics.r("navBarWithToolbarView");
                        throw null;
                    }
                    navBarWithToolbar.j0(false);
                } else {
                    NavBarWithToolbar navBarWithToolbar2 = ((xpi.c) gVar2).f307974j;
                    if (navBarWithToolbar2 == null) {
                        Intrinsics.r("navBarWithToolbarView");
                        throw null;
                    }
                    navBarWithToolbar2.H0(false);
                }
                return Unit.f186387a;
            case 8:
                return ((iak.d) this.f193416b.f102386n).f160049a.b(new SetUpPdaActivityContract$Step.Eof(true));
            case 9:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f193416b.o.a().firstElement();
            default:
                List beneficiaries = (List) obj2;
                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                return beneficiaries.isEmpty() ? ((iak.d) this.f193416b.f102386n).b() : pfm.m.f235744a;
        }
    }
}
