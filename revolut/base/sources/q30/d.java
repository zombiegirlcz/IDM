package q30;

import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import te0.w;
import v30.c0;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f241750w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241750w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f241750w, continuation, 0);
            default:
                return new d(this.f241750w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        boolean z = false;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                try {
                    if (i == 0) {
                        o.b(obj2);
                        h hVar = this.f241750w;
                        Map mapC = hVar.f241758b.c(c0.ASSISTANT);
                        String str = (String) mapC.get("lightUrl");
                        String str2 = (String) mapC.get("darkUrl");
                        String language = ((s80.b) ((qd0.b) hVar.e.get())).b().getLanguage();
                        String strE = ((ii0.b) ((ih0.b) hVar.d.get())).e("EID_ASSISTANT_INTRO");
                        String str3 = strE.length() > 0 ? strE : null;
                        if (str3 == null) {
                            str3 = "v1";
                        }
                        String str4 = str3;
                        Intrinsics.h(language);
                        String strA = h.a(hVar, str4, "light", language);
                        String strA2 = h.a(hVar, str4, "dark", language);
                        if (Intrinsics.f(str, strA) && Intrinsics.f(str2, strA2)) {
                            return Unit.f186387a;
                        }
                        Ref$IntRef ref$IntRef = new Ref$IntRef();
                        Object obj3 = hVar.f241760g.get();
                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                        noe.j jVar = new noe.j(ref$IntRef, hVar, strA, strA2, language, str4, str, str2, null);
                        this.v = 1;
                        if (w.m0((b80.c) obj3, jVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return Unit.f186387a;
                } catch (Exception e) {
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    return Unit.f186387a;
                }
            default:
                h hVar2 = this.f241750w;
                AtomicBoolean atomicBoolean = hVar2.k;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                int i3 = 0;
                try {
                    if (i2 == 0) {
                        o.b(obj2);
                        if (((rf3.d) hVar2.f241759c).a() == j30.a.VIDEO) {
                            this.v = 1;
                            p0 p0Var = p0.f264001a;
                            Object objJ = e0.J(elm.f.f127540b, new d(hVar2, z ? 1 : 0, i3), this);
                            if ((objJ == aVar2 ? objJ : Unit.f186387a) == aVar2) {
                                return aVar2;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    atomicBoolean.set(false);
                    return Unit.f186387a;
                } catch (Throwable th10) {
                    atomicBoolean.set(false);
                    throw th10;
                }
        }
    }
}
