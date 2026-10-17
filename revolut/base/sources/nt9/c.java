package nt9;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.payments.groups.impl.ui_new.group_creation.GroupCreationScreen;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import no.e0;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupCreationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GroupCreationScreen groupCreationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupCreationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.R2();
        String name = textData.f52598b.toString();
        com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar = (com.revolut.feature.payments.groups.impl.ui_new.group_creation.b) iVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        y yVar = bVar.f79487w;
        Iterator it8 = ((g) ((j2) yVar.f22677a).getValue()).d.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(bVar.f79484r.b(((h) next).b()).toString(), name)) {
                break;
            }
        }
        bVar.H2(yVar, new e0(name, (h) next, 13));
        return Unit.f186387a;
    }
}
