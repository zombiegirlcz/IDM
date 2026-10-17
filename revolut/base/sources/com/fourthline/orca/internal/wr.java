package com.fourthline.orca.internal;

import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public class wr implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f34769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ukm.u f34770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Flow f34771c;
    private final String d;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34772a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ he1 f34774c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(he1 he1Var, Continuation continuation) {
            super(2, continuation);
            this.f34774c = he1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return wr.this.new a(this.f34774c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f34772a;
            if (i == 0) {
                yhm.o.b(obj2);
                ukm.u uVar = wr.this.f34770b;
                he1 he1Var = this.f34774c;
                this.f34772a = 1;
                if (uVar.send(he1Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }
    }

    public wr(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f34769a = coroutineScope;
        ukm.q qVarA = vc.s.a(0, null, null, 7);
        this.f34770b = qVarA;
        this.f34771c = vkm.q.K(qVarA);
        this.d = getClass().getSimpleName();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f34769a.getCoroutineContext();
    }

    public final Flow a() {
        return this.f34771c;
    }

    public void a(Function0 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        he1 he1Var = (he1) builder.invoke();
        Objects.toString(he1Var);
        skm.e0.C(this, null, null, new a(he1Var, null), 3);
    }
}
