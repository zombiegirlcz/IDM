package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class h2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t2 f288910w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f288911x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(t2 t2Var, ProductAccountDescriptor$Value productAccountDescriptor$Value, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f288910w = t2Var;
        this.f288911x = productAccountDescriptor$Value;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h2(this.f288910w, this.f288911x, continuation, 0);
            default:
                return new h2(this.f288910w, this.f288911x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    final t2 t2Var = this.f288910w;
                    mk0.a aVar2 = t2Var.f289011b;
                    t2Var.g();
                    final int i2 = 0;
                    final ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f288911x;
                    Function1 function1 = new Function1() { // from class: vge.g2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            Set set = (Set) obj3;
                            switch (i2) {
                                case 0:
                                    t2Var.getClass();
                                    set.add(t2.s(productAccountDescriptor$Value));
                                    break;
                                default:
                                    t2Var.getClass();
                                    set.remove(t2.s(productAccountDescriptor$Value));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    this.v = 1;
                    if (t2Var.p(aVar2, "ACCOUNT_SWITCHER_FAVOURITES", null, function1, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    final t2 t2Var2 = this.f288910w;
                    mk0.a aVar4 = t2Var2.f289011b;
                    t2Var2.g();
                    final int i5 = 1;
                    final ProductAccountDescriptor$Value productAccountDescriptor$Value2 = this.f288911x;
                    Function1 function12 = new Function1() { // from class: vge.g2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            Set set = (Set) obj3;
                            switch (i5) {
                                case 0:
                                    t2Var2.getClass();
                                    set.add(t2.s(productAccountDescriptor$Value2));
                                    break;
                                default:
                                    t2Var2.getClass();
                                    set.remove(t2.s(productAccountDescriptor$Value2));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    this.v = 1;
                    if (t2Var2.p(aVar4, "ACCOUNT_SWITCHER_FAVOURITES", null, function12, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
