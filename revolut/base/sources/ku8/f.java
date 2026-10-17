package ku8;

import com.revolut.data.model.Data;
import com.revolut.feature.kyc.impl.choosedocument.kompot.ChooseDocumentController;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ChooseDocumentController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ChooseDocumentController chooseDocumentController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = chooseDocumentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            case 2:
                return new f(this.v, continuation, 2);
            default:
                return new f(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ChooseDocumentController chooseDocumentController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar = (h) chooseDocumentController.d();
                j jVar = (j) ((j2) hVar.f189738s.f22677a).getValue();
                Data data = jVar.f189740a;
                SelectedKycDocs selectedKycDocs = jVar.f189741b;
                my8.o oVar = (my8.o) data.getContent();
                if (oVar != null && com.revolut.feature.kyc.impl.choosedocument.model.a.a(selectedKycDocs) != null) {
                    hVar.C2(new m(selectedKycDocs, oVar));
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h) chooseDocumentController.d()).C2(l.f189743a);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h) chooseDocumentController.d()).B2();
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar2 = (h) chooseDocumentController.d();
                String str = hVar2.o.f77596j;
                if (str != null) {
                    hVar2.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) hVar2.f189736q).f(str), 0, null, 494));
                }
                break;
        }
        return Unit.f186387a;
    }
}
