package gic;

import igk.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f144115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f144116x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, h hVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = str;
        this.f144115w = hVar;
        this.f144116x = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f144115w, this.f144116x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            h hVar = this.f144115w;
            String str = this.v;
            if (str != null) {
                hVar.b3(str);
            }
            aii.o oVar = hVar.f144118m;
            ajk.b bVar = hVar.o;
            String str2 = this.f144116x;
            b bVar2 = new b(hVar, str2, 1);
            this.u = 1;
            if (k.a(oVar, bVar, str2, bVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
