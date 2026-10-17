package abf;

import aw0.n6;
import cli.y;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutInstrument;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutSelectedAsset;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreenContract$AssetDraft;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransferOutAssetSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TransferOutAssetSelectionScreen transferOutAssetSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transferOutAssetSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransferOutAssetSelectionScreen transferOutAssetSelectionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) transferOutAssetSelectionScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) transferOutAssetSelectionScreen.R2();
                y yVar = oVar.f2962r;
                Iterable<TransferOutInstrument> iterable = (List) ((i) ((j2) yVar.f22677a).getValue()).f2952a.getContent();
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Map map = ((i) ((j2) yVar.f22677a).getValue()).f2953b;
                ArrayList arrayList = new ArrayList();
                for (TransferOutInstrument transferOutInstrument : iterable) {
                    TransferOutAssetSelectionScreenContract$AssetDraft transferOutAssetSelectionScreenContract$AssetDraft = (TransferOutAssetSelectionScreenContract$AssetDraft) map.get(transferOutInstrument.f91514a);
                    TransferOutSelectedAsset transferOutSelectedAsset = null;
                    if (transferOutAssetSelectionScreenContract$AssetDraft != null) {
                        Integer num = transferOutAssetSelectionScreenContract$AssetDraft.f91637a;
                        int iIntValue = num != null ? num.intValue() : 0;
                        if (transferOutAssetSelectionScreenContract$AssetDraft.f91638b && iIntValue > 0) {
                            Intrinsics.checkNotNullParameter(transferOutInstrument, "<this>");
                            int iIntValue2 = transferOutInstrument.e.intValue();
                            if (iIntValue > iIntValue2) {
                                iIntValue = iIntValue2;
                            }
                            transferOutSelectedAsset = new TransferOutSelectedAsset(transferOutInstrument, iIntValue);
                        }
                    }
                    if (transferOutSelectedAsset != null) {
                        arrayList.add(transferOutSelectedAsset);
                    }
                }
                if (!arrayList.isEmpty()) {
                    oVar.C2(new j(arrayList));
                }
                break;
        }
        return Unit.f186387a;
    }
}
