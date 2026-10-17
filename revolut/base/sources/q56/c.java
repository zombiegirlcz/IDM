package q56;

import cli.y;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.d0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DeFiSendAddBeneficiaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DeFiSendAddBeneficiaryScreen deFiSendAddBeneficiaryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = deFiSendAddBeneficiaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DeFiSendAddBeneficiaryScreen deFiSendAddBeneficiaryScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) deFiSendAddBeneficiaryScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar3 = (com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) deFiSendAddBeneficiaryScreen.d();
                y yVar = aVar3.f71820t;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                j jVar = ((k) j2Var.getValue()).f242305c;
                i iVar = jVar instanceof i ? (i) jVar : null;
                if (iVar == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "DeFiSendAddBeneficiaryScreenModel", "Save beneficiary clicked without valid address validation: " + ((k) j2Var2.getValue()).f242305c, null, h0Var);
                } else {
                    String str = ((k) j2Var2.getValue()).f242303a;
                    if (d0.W(str)) {
                        str = null;
                    }
                    if (str == null) {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "DeFiSendAddBeneficiaryScreenModel", "Save beneficiary clicked without address value", null, h0Var2);
                    } else if (((k) j2Var2.getValue()).f242304b.length() > 25) {
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "DeFiSendAddBeneficiaryScreenModel", "Save beneficiary clicked with label exceeding 25 characters", null, h0Var3);
                    } else {
                        aVar3.l2(new of6.d(aVar3, iVar, str, ehe.n.u(((k) j2Var2.getValue()).f242304b), (Continuation) null), new yi5.b(26));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
