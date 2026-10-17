package lca;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature.pix.impl.flow.transfer.apm.recipient_warning.PixApmRecipientWarningContract$InputData;
import com.revolut.feature.pix.impl.flow.transfer.apm.recipient_warning.PixApmRecipientWarningController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ku1.v;
import nii.c0;
import nii.m0;
import nii.y0;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PixTransferNavigation$InputData.ApmTransfer f193813w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f193814x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, PixTransferNavigation$InputData.ApmTransfer apmTransfer, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
        this.f193813w = apmTransfer;
        this.f193814x = function1;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f193813w, this.f193814x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP;
        m0 m0VarB;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        l lVar = this.v;
        PixTransferNavigation$InputData.ApmTransfer apmTransfer = this.f193813w;
        if (i == 0) {
            o.b(obj2);
            c0 c0Var = new c0(null, null, null, false, null, false, false, null, 1919);
            v vVar = new v(2);
            i iVar = new i(lVar, apmTransfer, 0);
            j jVar = new j(lVar, apmTransfer, null);
            this.u = 1;
            objP = n14.k.P(lVar.q2(), c0Var, iVar, vVar, jVar, this);
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objP = obj2;
        }
        nii.e eVar = (nii.e) objP;
        boolean z = eVar instanceof nii.c;
        Function1 function1 = this.f193814x;
        if (z) {
            l.b3(lVar, ((nii.c) eVar).f216124b, apmTransfer, function1);
        } else {
            if (!(eVar instanceof nii.d)) {
                throw new NoWhenBranchMatchedException();
            }
            nx1.d dVar = (nx1.d) ((nii.d) eVar).f216133a;
            i8a.a aVar2 = lVar.f193816m;
            if (dVar instanceof nx1.c) {
                ApmContact apmContact = ((nx1.c) dVar).f220055a;
                if (apmContact instanceof PixContact) {
                    PixContact pixContact = (PixContact) apmContact;
                    if (pixContact.f62146l) {
                        lVar.N2(new PixApmRecipientWarningController(new PixApmRecipientWarningContract$InputData(pixContact, !Intrinsics.f(apmTransfer.f80526a.i, pixContact.i) ? mca.l.BANK_CHANGED : mca.l.OWNER_CHANGED)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new l9k.v(function1, pixContact, 10));
                    } else {
                        function1.invoke(new b(pixContact));
                    }
                } else {
                    ((uca.c) aVar2).getClass();
                    n.j2(lVar, lVar.L2(new y0("ERROR_DIALOG_ID", uca.c.b(), false, 4)), null, new h(function1, null), 3);
                }
            } else if (dVar instanceof nx1.a) {
                Integer num = ((nx1.a) dVar).f220053a;
                PixIdentifiedType.Valid validA = ((vca.g) lVar.f193817n).a(apmTransfer.f80526a.f62141b);
                uca.c cVar = (uca.c) aVar2;
                if (validA != null) {
                    cVar.getClass();
                    m0VarB = uca.c.a(num, validA);
                } else {
                    cVar.getClass();
                    m0VarB = uca.c.b();
                }
                n.j2(lVar, lVar.L2(new y0("ERROR_DIALOG_ID", m0VarB, false, 4)), null, new g(lVar, apmTransfer, function1, null), 3);
            } else {
                if (!(dVar instanceof nx1.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((uca.c) aVar2).getClass();
                n.j2(lVar, lVar.L2(new y0("ERROR_DIALOG_ID", uca.c.b(), false, 4)), null, new at1.i(3, null, function1), 3);
            }
        }
        return Unit.f186387a;
    }
}
