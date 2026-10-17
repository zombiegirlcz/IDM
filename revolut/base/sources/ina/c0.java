package ina;

import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f162706w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.v = e0Var;
        this.f162706w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c0 c0Var = new c0(this.v, this.f162706w, continuation);
        c0Var.u = obj2;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e0 e0Var = this.v;
        DocumentsPage documentsPage = e0Var.f162710m.f81412a;
        Intrinsics.i(documentsPage, "null cannot be cast to non-null type com.revolut.feature.profile.api.DocumentsPage.Teen");
        AccountStatementProduct.Teen teen = new AccountStatementProduct.Teen(((DocumentsPage.Teen) documentsPage).f81308a, this.f162706w);
        if (list.size() > 1) {
            e0Var.d3(list, new ijg.c(e0Var, teen, 20));
        } else {
            List list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((io3.g) it8.next()).f163163a);
            }
            e0Var.f3(teen, arrayList);
        }
        return Unit.f186387a;
    }
}
