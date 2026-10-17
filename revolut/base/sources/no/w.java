package no;

import grl.b4;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f217855w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ fo.i f217856x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(z zVar, fo.i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217855w = zVar;
        this.f217856x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f217855w, this.f217856x, continuation, 0);
            default:
                return new w(this.f217855w, this.f217856x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        fo.i iVar = this.f217856x;
        z zVar = this.f217855w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                } catch (Throwable th10) {
                    this.v = 2;
                    r rVar = z.Companion;
                    if (zVar.c(th10, this) == aVar) {
                        return aVar;
                    }
                }
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    to.h hVar = zVar.k;
                    this.v = 1;
                    obj2 = hVar.a(iVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "AqueductRepository", "Response to event " + iVar.a() + " from " + iVar.f136730a + ": " + ((b4) obj2), null, null, 16);
                Iterator it8 = zVar.f217891p.iterator();
                while (it8.hasNext()) {
                    ((com.revolut.analytics.tracking.v3.l) ((o) it8.next())).j3(iVar.f136731b);
                    break;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (z.a(zVar, iVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
