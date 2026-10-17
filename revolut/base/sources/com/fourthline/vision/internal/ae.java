package com.fourthline.vision.internal;

import com.fourthline.vision.internal.ra;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ae implements qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f35968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35969b;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35970a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return ae.this.new a(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f35970a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            ae.this.f35969b = true;
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((a) create(unit, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public ae(@NotNull d2 triggerDataSource) {
        Intrinsics.checkNotNullParameter(triggerDataSource, "triggerDataSource");
        this.f35968a = triggerDataSource;
    }

    @Override // com.fourthline.vision.internal.qd, com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((Unit) obj2, (Continuation<? super Unit>) continuation);
    }

    @Override // com.fourthline.vision.internal.qd, com.fourthline.vision.internal.pd
    public void start() {
        this.f35969b = false;
        this.f35968a.subscribe(new a(null));
    }

    @Override // com.fourthline.vision.internal.qd, com.fourthline.vision.internal.pd
    public void stop() {
        this.f35969b = false;
        this.f35968a.subscribe(null);
    }

    public Object consume(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) throws ra.f.a {
        if (this.f35969b) {
            return Unit.f186387a;
        }
        throw ra.f.a.f36780a;
    }
}
