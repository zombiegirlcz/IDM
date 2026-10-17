package z8k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import h1j.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1j.e;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b f320187b;

    public /* synthetic */ i0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, int i) {
        this.f320186a = i;
        this.f320187b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f320186a;
        Continuation continuation = null;
        boolean z = true;
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = this.f320187b;
        switch (i) {
            case 0:
                l1j.e output = (l1j.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof e.a)) {
                    if (!(output instanceof l1j.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l1j.f fVar = (l1j.f) output;
                    String str = fVar.e;
                    String str2 = fVar.f191552a;
                    com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar2 = this.f320187b;
                    bVar2.l2(new xkl.e((yji.l) bVar2, fVar.f191554c, str2, str, fVar.d, (Continuation) null, 8), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                int i2 = 0;
                if (it8 instanceof CancellationException) {
                    z = false;
                } else {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                    yji.l.b1(bVar, bVar.X().d(new nii.y0("ERROR_DIALOG_ID", new nii.z(new TextLocalisedClause(R$string.payments_peer_to_peer_transfer_initialisation_error, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, new o0(bVar, continuation, i2), 3);
                }
                return Boolean.valueOf(z);
            case 2:
                h1j.b output2 = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof b.a)) {
                    boolean z3 = output2 instanceof h1j.d;
                    com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar3 = this.f320187b;
                    if (z3) {
                        h1j.d dVar = (h1j.d) output2;
                        bVar3.l2(new xkl.e((yji.l) bVar3, dVar.f148582c, dVar.f148580a, dVar.f148581b.f306286a, dVar.d, (Continuation) null, 8), new yi5.b(26));
                    } else {
                        if (!(output2 instanceof h1j.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar3.l2(new yv1.k(bVar3, ((h1j.c) output2).f148579a, continuation, 23), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
            case 3:
                t updateState = (t) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return t.a(updateState, null, null, ((t) bVar.t2()).f + 1, null, false, false, 16351);
            case 4:
                PeerToPeerTransferData it9 = (PeerToPeerTransferData) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                bVar.v2(new a0(it9, bVar.f102333p.getF102321a()));
                return Unit.f186387a;
            default:
                bVar.v2(new b0((PeerToPeerTransferData) obj2, bVar.f102333p.getF102321a()));
                return Unit.f186387a;
        }
    }
}
