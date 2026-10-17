package abf;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutInstrument;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreenContract$InputData;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends oki.h implements l {
    public final TransferOutAssetSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o9f.c f2960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f2961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f2962r;

    public o(TransferOutAssetSelectionScreenContract$InputData inputData, o9f.c transferInteractor, p stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f2960p = transferInteractor;
        this.f2961q = new vii.b(w4l.i.f294643c);
        this.f2962r = mra.d.b(this, new i(new Data(null, null, true, 3, null), r0.g()), stateMapper, new a(), false, 8);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, prk.o.w("TransferOutAssetSelectionScreenModel", "observeTransferOutInstrumentList", q.Q(this.f2961q, new a0e.m(continuation, this, 11))), null, null, new a0l.k(this, continuation, 23), 3);
    }

    public final TransferOutInstrument I2(String str) {
        List list = (List) ((i) ((j2) this.f2962r.f22677a).getValue()).f2952a.getContent();
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((TransferOutInstrument) next).f91514a, str)) {
                obj2 = next;
                break;
            }
        }
        return (TransferOutInstrument) obj2;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f2962r;
    }
}
