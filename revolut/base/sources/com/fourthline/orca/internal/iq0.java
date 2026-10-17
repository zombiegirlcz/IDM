package com.fourthline.orca.internal;

import com.fourthline.orca.internal.xp0;
import com.fourthline.orca.internal.yp0;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes23.dex */
public final class iq0 implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineScope f29672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Flow f29673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ukm.j0 f29674c;
    private final MutableStateFlow d;
    private final StateFlow e;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29675a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.iq0$a$a, reason: collision with other inner class name */
        public static final class C0219a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f29677a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29678b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iq0 f29679c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0219a(iq0 iq0Var, Continuation continuation) {
                super(2, continuation);
                this.f29679c = iq0Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(xp0 xp0Var, Continuation continuation) {
                return ((C0219a) create(xp0Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0219a c0219a = new C0219a(this.f29679c, continuation);
                c0219a.f29678b = obj2;
                return c0219a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                zp0 zp0VarA;
                xp0 xp0Var = (xp0) this.f29678b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f29677a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Objects.toString(xp0Var);
                MutableStateFlow mutableStateFlow = this.f29679c.d;
                if (xp0Var instanceof xp0.b) {
                    xp0.b bVar = (xp0.b) xp0Var;
                    if (Intrinsics.f(this.f29679c.d.getValue(), bVar.a())) {
                        this.f29679c.b().mo3647trySendJP2dKIU(yp0.e.f35411a);
                        zp0VarA = (zp0) this.f29679c.d.getValue();
                    } else {
                        zp0VarA = bVar.a();
                    }
                } else {
                    if (!(xp0Var instanceof xp0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zp0VarA = null;
                }
                mutableStateFlow.setValue(zp0VarA);
                return Unit.f186387a;
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return iq0.this.new a(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f29675a;
            if (i == 0) {
                yhm.o.b(obj2);
                Flow flowA = iq0.this.a();
                C0219a c0219a = new C0219a(iq0.this, null);
                this.f29675a = 1;
                if (wz.a(flowA, c0219a, this) == aVar) {
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

    public iq0(CoroutineScope coroutineScope, Flow inputEffects, ukm.j0 outputEvents) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(inputEffects, "inputEffects");
        Intrinsics.checkNotNullParameter(outputEvents, "outputEvents");
        this.f29672a = coroutineScope;
        this.f29673b = inputEffects;
        this.f29674c = outputEvents;
        vkm.j2 j2VarC = vkm.q.c(null);
        this.d = j2VarC;
        this.e = j2VarC;
        skm.e0.C(this, null, null, new a(null), 3);
    }

    public final ukm.j0 b() {
        return this.f29674c;
    }

    public final StateFlow c() {
        return this.e;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f29672a.getF74819h();
    }

    public final Flow a() {
        return this.f29673b;
    }
}
