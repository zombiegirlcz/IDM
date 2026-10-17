package tjj;

import aw0.n6;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimCompleteNumberTransferBottomSheetScreen f271796w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EsimCompleteNumberTransferBottomSheetScreen esimCompleteNumberTransferBottomSheetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f271796w = esimCompleteNumberTransferBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f271796w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f271796w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimCompleteNumberTransferBottomSheetScreen esimCompleteNumberTransferBottomSheetScreen = this.f271796w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) esimCompleteNumberTransferBottomSheetScreen.W.getValue();
                Object obj3 = n6Var.k;
                i iVar = (i) hVar;
                iVar.getClass();
                iVar.C2(new e(obj3));
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar2 = (h) esimCompleteNumberTransferBottomSheetScreen.W.getValue();
                Object obj4 = aVar2.d;
                i iVar2 = (i) hVar2;
                iVar2.getClass();
                EsimDescriptorValue.Link link = obj4 instanceof EsimDescriptorValue.Link ? (EsimDescriptorValue.Link) obj4 : null;
                if (link != null) {
                    iVar2.C2(new f(link));
                }
                break;
        }
        return Unit.f186387a;
    }
}
