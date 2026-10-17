package zzd;

import aw0.n6;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DocumentsHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(DocumentsHubScreen documentsHubScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = documentsHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DocumentsHubScreen documentsHubScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.statements.impl.ui.documents_hub.a aVar2 = (com.revolut.feature.statements.impl.ui.documents_hub.a) documentsHubScreen.d();
                a0e.r rVar = ((q) ((j2) aVar2.A.f22677a).getValue()).e;
                if (rVar != null) {
                    aVar2.u.getClass();
                    String strA = a0e.y.a(rVar);
                    if (strA != null) {
                        wxd.n nVar = new wxd.n(aVar2.o.f88356a, strA);
                        aVar2.l2(new zr5.k(aVar2, nVar, null, 23), new zrd.q(aVar2, 29));
                    }
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.statements.impl.ui.documents_hub.a) documentsHubScreen.d()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
