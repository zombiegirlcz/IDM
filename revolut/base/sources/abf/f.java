package abf;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutInstrument;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferOutAssetSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TransferOutAssetSelectionScreen transferOutAssetSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferOutAssetSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TransferOutInstrument transferOutInstrumentI2;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        o oVar = (o) lVarE3;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        if ((obj3 instanceof h) && (transferOutInstrumentI2 = oVar.I2(((h) obj3).f2951a)) != null) {
            Intrinsics.checkNotNullParameter(transferOutInstrumentI2, "<this>");
            int iIntValue = transferOutInstrumentI2.e.intValue();
            if (iIntValue > 0) {
                oVar.H2(oVar.f2962r, new n(transferOutInstrumentI2, iIntValue, 0));
            }
        }
        return Unit.f186387a;
    }
}
