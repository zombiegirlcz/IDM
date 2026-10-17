package aem;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3763x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        sem.f fVar = (sem.f) obj2;
        switch (this.u) {
            case 0:
                p pVar = new p(3, 0, (Continuation) obj4);
                pVar.f3762w = fVar;
                pVar.f3763x = obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            default:
                p pVar2 = new p(3, 1, (Continuation) obj4);
                pVar2.f3762w = fVar;
                pVar2.f3763x = (hem.d) obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        nem.c oVar;
        int i = 1;
        switch (this.u) {
            case 0:
                sem.f fVar = (sem.f) this.f3762w;
                Object body = this.f3763x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Object obj3 = fVar.f262233a;
                    kem.s sVar = ((fem.d) obj3).f134659c;
                    List list = kem.u.f183239a;
                    if (sVar.g("Accept") == null) {
                        ((fem.d) obj3).f134659c.d("Accept", "*/*");
                    }
                    kem.i iVarL = a1m.e.l((kem.w) obj3);
                    if (body instanceof String) {
                        String str = (String) body;
                        if (iVarL == null) {
                            iVarL = kem.h.f183201a;
                        }
                        oVar = new nem.h(str, iVarL);
                    } else if (body instanceof byte[]) {
                        oVar = new n(iVarL, body);
                    } else if (body instanceof io.ktor.utils.io.t) {
                        oVar = new o(fVar, iVarL, body);
                    } else if (body instanceof nem.c) {
                        oVar = (nem.c) body;
                    } else {
                        fem.d context = (fem.d) obj3;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(body, "body");
                        oVar = body instanceof InputStream ? new o(context, iVarL, body) : null;
                    }
                    if ((oVar != null ? oVar.b() : null) != null) {
                        fem.d dVar = (fem.d) obj3;
                        kem.s sVar2 = dVar.f134659c;
                        sVar2.getClass();
                        Intrinsics.checkNotNullParameter("Content-Type", "name");
                        ((Map) sVar2.f224673a).remove("Content-Type");
                        t.f3777a.trace("Transformed with default transformers request body for " + dVar.f134657a + " from " + kotlin.jvm.internal.o0.f186429a.b(body.getClass()));
                        this.f3762w = null;
                        this.f3763x = null;
                        this.v = 1;
                        if (fVar.d(oVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                sem.f fVar2 = (sem.f) this.f3762w;
                hem.d dVar2 = (hem.d) this.f3763x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    tem.a aVar3 = dVar2.f151727a;
                    Object obj4 = dVar2.f151728b;
                    if (!(obj4 instanceof io.ktor.utils.io.t)) {
                        return Unit.f186387a;
                    }
                    if (Intrinsics.f(aVar3.f270126a, kotlin.jvm.internal.o0.f186429a.b(InputStream.class))) {
                        io.ktor.utils.io.t tVar = (io.ktor.utils.io.t) obj4;
                        Intrinsics.checkNotNullParameter(tVar, "<this>");
                        hem.d dVar3 = new hem.d(aVar3, new u(new u(tVar, i), 0));
                        this.f3762w = null;
                        this.f3763x = null;
                        this.v = 1;
                        if (fVar2.d(dVar3, this) == aVar2) {
                            return aVar2;
                        }
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
