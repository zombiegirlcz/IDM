package l25;

import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.CoroutineScope;
import kye.l0;
import om4.x2;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f191636w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
        this.f191636w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f191636w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f191636w;
        u uVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jhi.b bVarG = mo3.a.g(u0.m(nim.a.v(((x2) uVar.f191654t).h(str, w4l.h.f294642c), new h0() { // from class: l25.j
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj3) {
                    return ((CreditCard) obj3).f69794c;
                }
            }), nim.a.v(uVar.f191656x.j(w4l.j.f294644c), k.f)), null, new l0(20), 1);
            this.u = 1;
            obj2 = vkm.q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Pair pair = (Pair) obj2;
        ActionsBottomSheetController actionsBottomSheetControllerF = uVar.f191651q.f((dj0.d) pair.f186385a, (wi0.b) pair.f186386b);
        a block = new a(uVar, str, 3);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetControllerF.H = block;
        yji.n.P2(uVar, actionsBottomSheetControllerF, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }
}
