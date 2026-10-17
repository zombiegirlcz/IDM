package pc1;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ma1.x;
import nii.l1;
import nii.n1;
import rp0.k1;
import sa1.v;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f234786w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f234786w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f234786w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f234786w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            default:
                h hVar3 = new h(this.f234786w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 2;
        q qVar = this.f234786w;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p0 p0Var = p0.f264001a;
                break;
            case 1:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    q qVar2 = this.f234786w;
                    v vVar = (v) ((x) qVar2.f234797q).f203913a;
                    vVar.getClass();
                    efm.r rVarCreate = efm.r.create(new s65.o(vVar, 27));
                    Intrinsics.checkNotNullExpressionValue(rVarCreate, "create(...)");
                    yji.l.a1(qVar2, rd0.e.b(rVarCreate), null, null, new h(qVar2, continuation, i2), 3);
                }
                break;
            default:
                Boolean bool = (Boolean) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!bool.booleanValue()) {
                    ((k1) qVar.f234800t).d(new ShotDialogDisplayer$Configuration("cancel_failed", new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_cancelling_failed, null, null, 14), null, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
                }
                break;
        }
        return Unit.f186387a;
    }
}
