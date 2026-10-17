package zej;

import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f321677w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TransitionAnimation.Custom f321678x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, boolean z, TransitionAnimation.Custom custom, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f321677w = z;
        this.f321678x = custom;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f321677w, this.f321678x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        Object obj3 = this.v.f321681c.get();
        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
        this.u = 1;
        Object objD = ((ifj.f) ((fej.b) obj3)).d(this.f321677w, this.f321678x, this);
        return objD == aVar ? aVar : objD;
    }
}
