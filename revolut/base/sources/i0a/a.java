package i0a;

import gim.i;
import hib.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pfm.r;
import qz9.g;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f157335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zm3.a f157336x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, zm3.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f157335w = bVar;
        this.f157336x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f157335w, this.f157336x, continuation, 0);
            default:
                return new a(this.f157335w, this.f157336x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    b bVar = this.f157335w;
                    n nVar = new n(bVar, this.f157336x, (Continuation) null, 20);
                    this.v = 1;
                    if (bVar.Y2(this, nVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    g gVar = this.f157335w.f157338m;
                    gVar.getClass();
                    zm3.a contact = this.f157336x;
                    Intrinsics.checkNotNullParameter(contact, "contact");
                    pfm.n nVar2 = new pfm.n(new pu9.a(gVar, contact, 12), 1);
                    Intrinsics.checkNotNullExpressionValue(nVar2, "fromCallable(...)");
                    r rVarG0 = w.g0(nVar2);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
