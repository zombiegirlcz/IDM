package wll;

import com.revolut.sso.api.models.Evidence;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f298529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f298530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Evidence f298531y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, String str, Evidence evidence, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f298529w = eVar;
        this.f298530x = str;
        this.f298531y = evidence;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f298529w, this.f298530x, this.f298531y, continuation, 0);
            default:
                return new d(this.f298529w, this.f298530x, this.f298531y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
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
                this.v = 1;
                Object objA = this.f298529w.a(this.f298530x, this.f298531y, this);
                return objA == aVar ? aVar : objA;
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
                this.v = 1;
                Object objA2 = this.f298529w.a(this.f298530x, this.f298531y, this);
                return objA2 == aVar2 ? aVar2 : objA2;
        }
    }
}
