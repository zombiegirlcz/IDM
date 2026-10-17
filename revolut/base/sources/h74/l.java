package h74;

import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.DocumentsContentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DocumentsContentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(DocumentsContentScreen documentsContentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = documentsContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.v, continuation, 0);
            default:
                return new l(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        lu3.b bVar;
        int i = this.u;
        DocumentsContentScreen documentsContentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b) documentsContentScreen.e3()).C2(c.f149844a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b) documentsContentScreen.e3();
                lu3.c cVar = (lu3.c) ((a) ((j2) bVar2.f67312t.f22677a).getValue()).f149842b.getContent();
                if (cVar == null || (bVar = cVar.f200019g) == null) {
                    new IllegalArgumentException("The document pdfUrl is null");
                } else {
                    bVar2.f67311s.Z2(bVar.f200015b, bVar.f200014a);
                    Unit unit = Unit.f186387a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
