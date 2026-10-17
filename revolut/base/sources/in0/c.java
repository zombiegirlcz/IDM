package in0;

import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.h2;
import skm.p0;
import vkm.q;
import w4l.j;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f162572w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f162572w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f162572w, continuation, 0);
            case 1:
                return new c(this.f162572w, continuation, 1);
            case 2:
                return new c(this.f162572w, continuation, 2);
            default:
                return new c(this.f162572w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        boolean zBooleanValue = false;
        Continuation continuation = null;
        d dVar = this.f162572w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    jhi.b bVarG = mo3.a.g(dVar.e.a(Unit.f186387a, j.f294644c), null, null, 3);
                    this.v = 1;
                    obj2 = q.z(bVarG, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Boolean bool = (Boolean) obj2;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                p0 p0Var = p0.f264001a;
                elm.f fVar = elm.f.f127540b;
                c cVar = new c(dVar, continuation, z ? 1 : 0);
                this.v = 1;
                Object objJ = e0.J(fVar, cVar, this);
                return objJ == aVar2 ? aVar2 : objJ;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                try {
                    if (i6 == 0) {
                        o.b(obj2);
                        d.Companion.getClass();
                        long j2 = d.f162573g;
                        c cVar2 = new c(dVar, continuation, i2);
                        this.v = 1;
                        obj2 = h2.c(j2, cVar2, this);
                        if (obj2 == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                    break;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "AccessibilityServicesTrustManager", "Error while obtaining security verdict. Returning default.", e, h0Var);
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    vkm.d dVarA = dVar.e.a(Unit.f186387a, w4l.h.f294642c);
                    this.v = 1;
                    if (q.n(dVarA, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
