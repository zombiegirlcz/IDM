package nv4;

import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.statement.export.b f219479w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.credit.card.impl.ui.statement.export.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f219479w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f219479w, continuation, 0);
            default:
                return new w(this.f219479w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.statement.export.b bVar = this.f219479w;
                v vVar = new v(bVar, null);
                this.v = 1;
                Object objP2 = bVar.p2(this, vVar);
                return objP2 == aVar ? aVar : objP2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.statement.export.b bVar2 = this.f219479w;
                LocalDate localDate = ((i) ((j2) bVar2.f69703t.f22677a).getValue()).f219464a;
                if (localDate == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                h hVar = h.PDF;
                this.v = 1;
                Object objI2 = com.revolut.feature.credit.card.impl.ui.statement.export.b.I2(bVar2, localDate, hVar, this);
                return objI2 == aVar2 ? aVar2 : objI2;
        }
    }
}
