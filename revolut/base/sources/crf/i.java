package crf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import opf.l;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f108368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f108369x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f108368w = kVar;
        this.f108369x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f108368w, this.f108369x, continuation, 0);
            default:
                return new i(this.f108368w, this.f108369x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                l lVar = this.f108368w.f108373l;
                this.v = 1;
                Object objB = lVar.b(this.f108369x, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                l lVar2 = this.f108368w.f108373l;
                this.v = 1;
                Object objB2 = lVar2.b(this.f108369x, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
