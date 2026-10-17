package y69;

import b79.k;
import b79.m;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f311233w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s69.d f311234x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, s69.d dVar2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311233w = dVar;
        this.f311234x = dVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f311233w, this.f311234x, continuation, 0);
            default:
                return new c(this.f311233w, this.f311234x, continuation, 1);
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
        d dVar = this.f311233w;
        s69.d dVar2 = this.f311234x;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    b79.c cVar = dVar.f311235a;
                    String str = dVar2.f260158a;
                    String strA = dVar.a(dVar2, "message_id");
                    String strA2 = dVar.a(dVar2, "campaign_id");
                    this.v = 1;
                    m mVar = (m) cVar;
                    mVar.getClass();
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, new k(mVar, str, strA, strA2, null, 0), this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    b79.c cVar2 = dVar.f311235a;
                    String str2 = dVar2.f260158a;
                    String strA3 = dVar.a(dVar2, "message_id");
                    String strA4 = dVar.a(dVar2, "campaign_id");
                    this.v = 1;
                    m mVar2 = (m) cVar2;
                    mVar2.getClass();
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, new k(mVar2, str2, strA3, strA4, null, 1), this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
