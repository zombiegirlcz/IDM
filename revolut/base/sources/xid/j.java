package xid;

import java.util.concurrent.CancellationException;
import jid.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import xid.d;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f306333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ double f306334x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, CoroutineScope coroutineScope, double d, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
        this.f306333w = coroutineScope;
        this.f306334x = d;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f306333w, this.f306334x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        double d = this.f306334x;
        l lVar = this.v;
        try {
            if (i == 0) {
                o.b(obj2);
                String str = lVar.o.f87145a;
                m.Companion companion = yhm.m.INSTANCE;
                p pVar = lVar.f306337p;
                this.u = 1;
                obj2 = pVar.a(str, d, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = (jid.j) obj2;
            m.Companion companion2 = yhm.m.INSTANCE;
        } catch (Throwable th10) {
            m.Companion companion3 = yhm.m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null && (thA instanceof CancellationException)) {
            throw thA;
        }
        boolean z = objA instanceof yhm.n;
        d.a aVar2 = d.a.f306325a;
        if (!z) {
            if (Intrinsics.f((jid.j) objA, jid.g.f174435a)) {
                lVar.C2(new e(d));
            } else {
                lVar.C2(aVar2);
            }
        }
        if (yhm.m.a(objA) != null) {
            lVar.C2(aVar2);
        }
        return new yhm.m(objA);
    }
}
