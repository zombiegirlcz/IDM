package ku2;

import gim.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import klf.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import vkm.q;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f189637w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f189637w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f189637w, continuation, 0);
            default:
                return new f(this.f189637w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        iu2.b bVar;
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Continuation continuation = null;
                try {
                    if (i == 0) {
                        o.b(obj2);
                        if (this.f189637w.f189644g) {
                            IllegalStateException illegalStateException = new IllegalStateException("Verification didn't finished, but was requested another one");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "CaptchaError", null, illegalStateException, h0Var);
                        }
                        Object obj4 = hu2.c.f155546a;
                        int i2 = 5;
                        if (obj4.equals(hu2.b.f155545a)) {
                            od0.a aVar = od0.a.f224253a;
                            if (!od0.a.g()) {
                                throw new IllegalStateException("Captcha resolution request is unexpected for disabled resolution strategy");
                            }
                            h hVar = this.f189637w;
                            this.v = 1;
                            obj2 = q.x(q.Q(hVar.f189645h, new a3(continuation, hVar, i2)), this);
                            if (obj2 == obj3) {
                            }
                            bVar = (iu2.b) obj2;
                        } else {
                            if (!obj4.equals(obj4)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            h hVar2 = this.f189637w;
                            this.v = 2;
                            obj2 = q.x(q.Q(hVar2.f189645h, new a3(continuation, hVar2, i2)), this);
                            if (obj2 == obj3) {
                            }
                            bVar = (iu2.b) obj2;
                        }
                        return obj3;
                    }
                    if (i == 1) {
                        o.b(obj2);
                        bVar = (iu2.b) obj2;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        bVar = (iu2.b) obj2;
                    }
                    obj3 = bVar;
                    h hVar3 = this.f189637w;
                    hVar3.f189644g = false;
                    j2 j2Var = hVar3.f189645h;
                    Boolean bool = Boolean.TRUE;
                    j2Var.getClass();
                    j2Var.g(null, bool);
                    hVar3.i = null;
                    return obj3;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var2);
                    h hVar4 = this.f189637w;
                    hVar4.f189644g = false;
                    j2 j2Var2 = hVar4.f189645h;
                    Boolean bool2 = Boolean.TRUE;
                    j2Var2.getClass();
                    j2Var2.g(null, bool2);
                    hVar4.i = null;
                    throw th10;
                }
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                h hVar5 = this.f189637w;
                this.v = 1;
                Object objA = h.a(hVar5, this);
                return objA == aVar2 ? aVar2 : objA;
        }
    }
}
