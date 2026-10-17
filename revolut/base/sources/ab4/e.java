package ab4;

import aw0.n6;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.ESignDocumentsScreen;
import dx4.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ESignDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ESignDocumentsScreen eSignDocumentsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = eSignDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? arrayList;
        List list;
        int i = this.u;
        ESignDocumentsScreen eSignDocumentsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eSignDocumentsScreen.e3().C2(i.f2874a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE3 = eSignDocumentsScreen.e3();
                wu3.h hVar = (wu3.h) ((h) ((j2) sVarE3.f2889r.f22677a).getValue()).f2873a.getContent();
                if (hVar == null || (list = hVar.e) == null) {
                    arrayList = 0;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (((t0) obj3).d) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList = new ArrayList(w.t(arrayList2, 10));
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((t0) it8.next()).f120770a);
                    }
                }
                if (arrayList == 0) {
                    arrayList = f0.f322471a;
                }
                sVarE3.C2(new m(arrayList));
                break;
        }
        return Unit.f186387a;
    }
}
