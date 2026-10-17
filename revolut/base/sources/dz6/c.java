package dz6;

import com.revolut.feature.freelancer.impl.ui.invoice.templates.list.InvoiceTemplatesListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InvoiceTemplatesListScreen f121240w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(InvoiceTemplatesListScreen invoiceTemplatesListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121240w = invoiceTemplatesListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f121240w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f121240w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvoiceTemplatesListScreen invoiceTemplatesListScreen = this.f121240w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE3 = invoiceTemplatesListScreen.e3();
                String id10 = aVar.f275445a;
                qVarE3.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "CLAUSE_ID_TEMPLATE_SETTINGS")) {
                    qVarE3.C2(h.f121244a);
                }
                break;
            default:
                String listId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE32 = invoiceTemplatesListScreen.e3();
                Intrinsics.h(listId);
                qVarE32.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "MENU_ITEM_ID_NEW_TEMPLATE")) {
                    qVarE32.C2(g.f121243a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
