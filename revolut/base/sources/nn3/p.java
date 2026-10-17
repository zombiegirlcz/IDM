package nn3;

import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import njj.n0;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ContactsChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(ContactsChooserScreen contactsChooserScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = contactsChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.v, continuation, 0);
            case 1:
                return new p(this.v, continuation, 1);
            default:
                return new p(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Continuation continuation;
        Object next;
        int i = this.u;
        ContactsChooserScreen contactsChooserScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                contactsChooserScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.contacts_chooser.impl.ui.a aVar3 = (com.revolut.feature.contacts_chooser.impl.ui.a) contactsChooserScreen.R2();
                cli.y yVar = aVar3.A;
                Iterator it8 = ((c) ((j2) yVar.f22677a).getValue()).f217439b.iterator();
                while (true) {
                    continuation = null;
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((cn3.g) next) instanceof cn3.f) {
                        }
                    } else {
                        next = null;
                    }
                }
                cn3.f fVar = next instanceof cn3.f ? (cn3.f) next : null;
                List list = ((c) ((j2) yVar.f22677a).getValue()).f217439b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof cn3.e) {
                        arrayList.add(obj3);
                    }
                }
                List list2 = (List) ue0.e.M(arrayList);
                if (fVar != null) {
                    aVar3.C2(new cn3.d(fVar));
                } else {
                    if (list2 == null) {
                        throw new IllegalStateException("At least one recipient should be selected");
                    }
                    aVar3.l2(new n0(aVar3, list2, continuation, 8), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.contacts_chooser.impl.ui.a aVar5 = (com.revolut.feature.contacts_chooser.impl.ui.a) contactsChooserScreen.R2();
                List list3 = ((c) ((j2) aVar5.A.f22677a).getValue()).f217439b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list3) {
                    if (obj4 instanceof cn3.e) {
                        arrayList2.add(obj4);
                    }
                }
                aVar5.C2(new cn3.c(arrayList2, true));
                return Unit.f186387a;
        }
    }
}
