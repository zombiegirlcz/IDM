package nt9;

import e60.l;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_new.group_creation.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e60.l lVar = (e60.l) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (lVar instanceof e60.m) {
            com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar = this.v;
            bVar.H2(bVar.f79487w, new br7.k(lVar, 1));
        } else {
            if (!(lVar instanceof l.a) && !(lVar instanceof e60.j) && !(lVar instanceof e60.k)) {
                throw new NoWhenBranchMatchedException();
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "GroupCreationScreenModel", "MediaPicker.observeMediaPickerResult() returned unsupported result: " + lVar, null, h0Var);
        }
        return Unit.f186387a;
    }
}
