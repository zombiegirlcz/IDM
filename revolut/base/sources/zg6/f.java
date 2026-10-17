package zg6;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateLimitType;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetContract$ModalStep;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetController;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitConfig;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MandateSetupBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MandateSetupBottomSheetController mandateSetupBottomSheetController, Continuation continuation) {
        super(2, continuation);
        this.v = mandateSetupBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        MandateLimitType mandateLimitType;
        MandateSetupBottomSheetContract$ModalStep.LimitInputStep limitInputStep;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVarM3 = this.v.h3();
        String listId = model.f51781a;
        com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b bVar = (com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b) bVarM3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Object value = ((j2) bVar.u.f22677a).getValue();
        a aVar2 = value instanceof a ? (a) value : null;
        if (aVar2 != null) {
            dj0.d dVar = aVar2.f322075a;
            dj0.d dVar2 = aVar2.f322076b;
            if (Intrinsics.f(listId, "ITEM_ID_MAX_PER_TRANSFER")) {
                mandateLimitType = MandateLimitType.MAX_PER_TRANSFER;
            } else if (Intrinsics.f(listId, "ITEM_ID_MAX_PER_MONTH")) {
                mandateLimitType = MandateLimitType.MAX_PER_MONTH;
            }
            int i = g.f322081a[mandateLimitType.ordinal()];
            if (i == 1) {
                limitInputStep = new MandateSetupBottomSheetContract$ModalStep.LimitInputStep(mandateLimitType, new MandateLimitConfig.MaxPerTransfer(dVar, bVar.o.f72426b, dVar2));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                limitInputStep = new MandateSetupBottomSheetContract$ModalStep.LimitInputStep(mandateLimitType, new MandateLimitConfig.MaxPerMonth(dVar2, dVar, aVar2.f322077c));
            }
            oki.h.v2(bVar.v, limitInputStep, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        }
        return Unit.f186387a;
    }
}
