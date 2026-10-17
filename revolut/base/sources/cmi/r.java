package cmi;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f25300w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25300w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f25300w, continuation, 0);
            default:
                return new r(this.f25300w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        String str;
        int i = this.u;
        u uVar = this.f25300w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (uVar.c(this) == aVar) {
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
                z zVar = uVar.f25304a;
                this.v = 2;
                if (zVar.a(this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    z zVar2 = uVar.f25304a;
                    this.v = 1;
                    zVar2.getClass();
                    c84.y yVar = new c84.y(zVar2, null, 28);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, yVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                e eVar = (e) obj2;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar = rd0.c.INFO;
                uVar.getClass();
                if (Intrinsics.f(eVar, c.f25270a)) {
                    str = "NotStarted";
                } else {
                    if (!(eVar instanceof d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "Processing";
                }
                rd0.d.b(cVar, "DeeplinkCoordinator", "Restored ".concat(str), null, null, 16);
                return obj2;
        }
    }
}
