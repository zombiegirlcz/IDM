package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.internal.r5;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class z5 implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a6 f37180a;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37182b;
        final /* synthetic */ Pair d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Pair<? extends Try<? extends ud>, sd> pair, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = pair;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            a aVar = z5.this.new a(this.d, continuation);
            aVar.f37182b = obj2;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ud udVar, Continuation<? super r5> continuation) {
            return ((a) create(udVar, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            ud udVar = (ud) this.f37182b;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f37181a;
            if (i == 0) {
                yhm.o.b(obj2);
                a6 a6Var = z5.this.f37180a;
                sd sdVar = (sd) this.d.f186386b;
                this.f37182b = udVar;
                this.f37181a = 1;
                obj2 = a6Var.validate(udVar, sdVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            Set set = (Set) obj2;
            Intrinsics.i(udVar, "null cannot be cast to non-null type com.fourthline.vision.document.internal.domain.step.DocumentStepResult");
            r5 r5Var = (r5) udVar;
            if (r5Var instanceof r5.a) {
                return r5.a.copy$default((r5.a) r5Var, null, set, 1, null);
            }
            if (r5Var instanceof r5.b) {
                return r5.b.copy$default((r5.b) r5Var, null, null, set, 3, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public z5(@NotNull a6 documentValidator) {
        Intrinsics.checkNotNullParameter(documentValidator, "documentValidator");
        this.f37180a = documentValidator;
    }

    private final boolean isTryStepResultSupported(Try<? extends ud> r2) {
        if (r2 instanceof Try.Failure) {
            return false;
        }
        if (r2 instanceof Try.Success) {
            return ((Try.Success) r2).getValue() instanceof r5;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Pair<? extends Try<? extends ud>, sd>) obj2, (Continuation<? super Try<? extends ud>>) continuation);
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void start() {
        super.start();
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void stop() {
        super.stop();
    }

    public Object process(@NotNull Pair<? extends Try<? extends ud>, sd> pair, @NotNull Continuation<? super Try<? extends ud>> continuation) {
        Try<? extends ud> r06 = (Try) pair.f186385a;
        if (!isTryStepResultSupported(r06)) {
            return r06;
        }
        Object objHandleSuccessSuspended = TryKt.handleSuccessSuspended(r06, new a(pair, null), continuation);
        return objHandleSuccessSuspended == fim.a.COROUTINE_SUSPENDED ? objHandleSuccessSuspended : (Try) objHandleSuccessSuspended;
    }
}
