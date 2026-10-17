package vea;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value.Main f288240w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, ProductAccountDescriptor$Value.Main main, Continuation continuation) {
        super(2, continuation);
        this.v = xVar;
        this.f288240w = main;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.v, this.f288240w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            she.g gVar = this.v.f288246g;
            ProductAccountDescriptor$Value.Main main = this.f288240w;
            Intrinsics.h(main);
            this.u = 1;
            obj2 = gVar.c(main, null, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return new o97.d((aii.u) obj2);
    }
}
