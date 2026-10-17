package ba4;

import e60.l;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a f13919w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f13919w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(this.f13919w, continuation, 0);
                yVar.v = obj2;
                return yVar;
            default:
                y yVar2 = new y(this.f13919w, continuation, 1);
                yVar2.v = obj2;
                return yVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((y) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((y) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 25;
        com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a aVar = this.f13919w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.u, new a26.j(list, i2));
                return Unit.f186387a;
            default:
                e60.l lVar = (e60.l) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Continuation continuation = null;
                if (lVar instanceof e60.m) {
                    aVar.n2(new av7.l(aVar, ((e60.m) lVar).b(), continuation, i2), new whi.b(6));
                } else if (lVar instanceof e60.j) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "UploadScreenModel", "File selection failed: " + ((e60.j) lVar).f122857a, null, h0Var);
                } else {
                    if (!(lVar instanceof e60.k) && !(lVar instanceof l.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.INFO, "UploadScreenModel", lVar + " is not supported.", null, null, 16);
                }
                return Unit.f186387a;
        }
    }
}
