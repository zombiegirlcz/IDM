package an9;

import com.revolut.feature.payees.impl.ui.payees_select.PayeesSelectScreen;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PayeesSelectScreen f6589w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(PayeesSelectScreen payeesSelectScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6589w = payeesSelectScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f6589w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f6589w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j(this.f6589w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            case 3:
                j jVar4 = new j(this.f6589w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
            default:
                j jVar5 = new j(this.f6589w, continuation, 4);
                jVar5.v = obj2;
                return jVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((jq9.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j) create((im9.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((jq9.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PayeesSelectScreen payeesSelectScreen = this.f6589w;
        switch (i) {
            case 0:
                jq9.t recipient = (jq9.t) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payees.impl.ui.payees_select.b bVar = (com.revolut.feature.payees.impl.ui.payees_select.b) payeesSelectScreen.d();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(recipient, "recipient");
                cli.y yVar = bVar.f79036t;
                Set setH1 = d0.h1(((n) ((j2) yVar.f22677a).getValue()).f6595c);
                setH1.remove(recipient);
                bVar.H2(yVar, new a83.d0(3, setH1));
                return Unit.f186387a;
            case 1:
                String listId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = payeesSelectScreen.d();
                Intrinsics.h(listId);
                com.revolut.feature.payees.impl.ui.payees_select.b bVar2 = (com.revolut.feature.payees.impl.ui.payees_select.b) rVarE3;
                cli.y yVar2 = bVar2.f79036t;
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("LIST_ID_MENU_ITEM_SELECT_ALL")) {
                    m mVar = (m) ((n) ((j2) yVar2.f22677a).getValue()).d.getContent();
                    List list = mVar != null ? mVar.f6590a : null;
                    if (list == null) {
                        throw new IllegalArgumentException(" Select all button not shown unless payees are loaded");
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        linkedHashSet.add((jq9.t) it8.next());
                    }
                    bVar2.H2(yVar2, new t(linkedHashSet, 0));
                } else if (listId.equals("LIST_ID_MENU_ITEM_DESELECT")) {
                    bVar2.H2(yVar2, new amf.i(10));
                }
                return Unit.f186387a;
            case 2:
                String query = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE32 = payeesSelectScreen.d();
                Intrinsics.h(query);
                com.revolut.feature.payees.impl.ui.payees_select.b bVar3 = (com.revolut.feature.payees.impl.ui.payees_select.b) rVarE32;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                bVar3.H2(bVar3.f79036t, new ak7.g(query, 7));
                z1 z1Var = bVar3.u;
                Unit unit = Unit.f186387a;
                z1Var.k(unit);
                return unit;
            case 3:
                im9.c filter = (im9.c) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payees.impl.ui.payees_select.b bVar4 = (com.revolut.feature.payees.impl.ui.payees_select.b) payeesSelectScreen.d();
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(filter, "filter");
                cli.y yVar3 = bVar4.f79036t;
                if (((n) ((j2) yVar3.f22677a).getValue()).f6593a == filter) {
                    filter = im9.c.NONE;
                }
                bVar4.H2(yVar3, new an4.f(filter, 3));
                z1 z1Var2 = bVar4.u;
                Unit unit2 = Unit.f186387a;
                z1Var2.k(unit2);
                return unit2;
            default:
                jq9.t recipient2 = (jq9.t) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payees.impl.ui.payees_select.b bVar5 = (com.revolut.feature.payees.impl.ui.payees_select.b) payeesSelectScreen.d();
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(recipient2, "recipient");
                cli.y yVar4 = bVar5.f79036t;
                Set setH12 = d0.h1(((n) ((j2) yVar4.f22677a).getValue()).f6595c);
                if (setH12.contains(recipient2)) {
                    setH12.remove(recipient2);
                } else {
                    setH12.add(recipient2);
                }
                bVar5.H2(yVar4, new a83.d0(4, setH12));
                return Unit.f186387a;
        }
    }
}
