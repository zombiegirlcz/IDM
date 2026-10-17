package koe;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.screens.list.a f186332w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.tax_residency.impl.screens.list.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f186332w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f186332w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f186332w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            default:
                u uVar3 = new u(this.f186332w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((kii.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        zme.g gVar;
        int i = this.u;
        com.revolut.feature.tax_residency.impl.screens.list.a aVar = this.f186332w;
        switch (i) {
            case 0:
                kii.d dVar = (kii.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (dVar.d) {
                    Object obj3 = dVar.f184246b;
                    Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Pair<com.revolut.feature.tax_residency.api.models.TaxResidency, com.revolut.feature.tax_residency.api.models.TaxResidencyRule>");
                    aVar.H2(aVar.f90097w, new cd4.l(1, (Pair) obj3));
                }
                return Unit.f186387a;
            case 1:
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f90097w, new k37.t(list, 10));
                return Unit.f186387a;
            default:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(popupMenuItem);
                Object obj4 = ((PopupMenuItem.Cell) popupMenuItem).i;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreenContract.TaxResidencyPopupMenuParcel");
                p pVar = (p) obj4;
                zme.f fVar = pVar.f186323a;
                int i2 = t.f186331a[pVar.f186325c.ordinal()];
                com.revolut.feature.tax_residency.impl.screens.list.a aVar5 = this.f186332w;
                if (i2 == 1) {
                    zme.l lVar = pVar.f186324b;
                    cli.y yVar = aVar5.f90097w;
                    if (!fVar.d && aVar5.o.f90087l && ((gVar = lVar.d) == null || gVar.f323493n)) {
                        com.revolut.kompot.navigable.vc.modal.a aVar6 = aVar5.f90098x;
                        j2 j2Var = (j2) yVar.f22677a;
                        j2 j2Var2 = (j2) yVar.f22677a;
                        oki.h.v2(aVar6, new TaxResidencyListScreenContract$ModalStep.RationaleFlow((List) zi0.c.I(((h) j2Var2.getValue()).f186315b), (List) zi0.c.I(((h) j2Var2.getValue()).f186316c), (wi0.b) zi0.c.I(((h) j2Var.getValue()).f186314a), lVar), ModalDestination.Style.POPUP.f98311a);
                    } else {
                        yji.l.a1(aVar5, aVar5.X1(new kii.c("REMOVE_TIN_CONFIRMATION_DIALOG", new TextLocalisedClause(R$string.profile_tax_residency_list_remove_alert_title, null, null, 14), new TextLocalisedClause(R$string.profile_tax_residency_list_remove_alert_message, null, null, 14), new TextLocalisedClause(R.string.common_action_remove, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), new Pair(fVar, lVar), false, 912)), null, null, new u(aVar5, null, 0), 3);
                    }
                } else {
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar5.C2(new l(fVar));
                }
                return Unit.f186387a;
        }
    }
}
