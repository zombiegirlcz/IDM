package iqf;

import aw0.n6;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.ReasonForTransferChooserScreen;
import ip0.w10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ReasonForTransferChooserScreen f167833w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(ReasonForTransferChooserScreen reasonForTransferChooserScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f167833w = reasonForTransferChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f167833w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f167833w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f167833w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((krf.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ReasonForTransferChooserScreen reasonForTransferChooserScreen = this.f167833w;
        switch (i) {
            case 0:
                n6 model = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarE3 = reasonForTransferChooserScreen.e3();
                Intrinsics.h(model);
                lVarE3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                krf.c cVar = ((a) ((j2) lVarE3.f167835p.f22677a).getValue()).f167826c;
                if (cVar != null) {
                    lVarE3.C2(new c(cVar));
                }
                break;
            case 1:
                String query = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarE32 = reasonForTransferChooserScreen.e3();
                Intrinsics.h(query);
                lVarE32.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                lVarE32.H2(lVarE32.f167835p, new ik3.a(query, 2));
                break;
            default:
                krf.c data = (krf.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarE33 = reasonForTransferChooserScreen.e3();
                Intrinsics.h(data);
                lVarE33.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                lVarE33.H2(lVarE33.f167835p, new w10(data, 25));
                break;
        }
        return Unit.f186387a;
    }
}
