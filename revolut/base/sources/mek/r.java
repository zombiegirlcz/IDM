package mek;

import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pod_nominees.impl.edit.d f204719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f204720x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.retail.feature.pod_nominees.impl.edit.d dVar, g gVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f204719w = dVar;
        this.f204720x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f204719w, this.f204720x, continuation, 0);
            default:
                return new r(this.f204719w, this.f204720x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pod_nominees.impl.edit.d dVar = this.f204719w;
                    lek.b bVar = dVar.f102604m;
                    g gVar = this.f204720x;
                    String str = gVar.f204704h;
                    String str2 = gVar.f204700a;
                    String str3 = gVar.f204701b;
                    LocalDate localDate = gVar.e;
                    if (localDate == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String strF3 = com.revolut.retail.feature.pod_nominees.impl.edit.d.f3(dVar, gVar);
                    this.v = 1;
                    if (((lek.m) bVar).a(str, str2, str3, localDate, strF3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pod_nominees.impl.edit.d dVar2 = this.f204719w;
                    boolean z = dVar2.f102603l.f102591c;
                    g gVar2 = this.f204720x;
                    if (z) {
                        lek.b bVar2 = dVar2.f102604m;
                        String str4 = gVar2.f204700a;
                        String str5 = gVar2.f204701b;
                        LocalDate localDate2 = gVar2.e;
                        if (localDate2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        String strF32 = com.revolut.retail.feature.pod_nominees.impl.edit.d.f3(dVar2, gVar2);
                        this.v = 1;
                        if (((lek.m) bVar2).b(str4, str5, localDate2, strF32, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        r rVar = new r(dVar2, gVar2, null, 0);
                        this.v = 2;
                        if (do3.q.u(dVar2, rVar, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
