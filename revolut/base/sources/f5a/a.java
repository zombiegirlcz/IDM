package f5a;

import cnh.f;
import gim.i;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f132288w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ File f132289x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, File file, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f132288w = fVar;
        this.f132289x = file;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f132288w, this.f132289x, continuation, 0);
            default:
                return new a(this.f132288w, this.f132289x, continuation, 1);
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
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                cpa.a aVar2 = (cpa.a) this.f132288w.f25428n;
                String absolutePath = this.f132289x.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                ufm.c cVarA = aVar2.a(absolutePath);
                this.v = 1;
                Object objB = nim.a.b(cVarA, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f fVar = this.f132288w;
                eg4.b bVar = new eg4.b(fVar, this.f132289x, null, 19);
                this.v = 1;
                Object objB2 = pu7.a.B(fVar.e, "onImageSelected", bVar, this);
                return objB2 == aVar3 ? aVar3 : objB2;
        }
    }
}
