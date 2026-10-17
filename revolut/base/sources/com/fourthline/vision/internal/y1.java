package com.fourthline.vision.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class y1 {

    public static final class a implements x1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f37129a;

        public a(Function1<? super T, Unit> function1) {
            this.f37129a = function1;
        }

        @Override // com.fourthline.vision.internal.x1
        public Object consume(T t2, Continuation<? super Unit> continuation) {
            this.f37129a.invoke(t2);
            return Unit.f186387a;
        }
    }

    public static final class b implements qd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f37130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f37131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f37132c;

        public b(Function1<? super T, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
            this.f37130a = function1;
            this.f37131b = function0;
            this.f37132c = function02;
        }

        @Override // com.fourthline.vision.internal.qd, com.fourthline.vision.internal.x1
        public Object consume(T t2, Continuation<? super Unit> continuation) {
            this.f37130a.invoke(t2);
            return Unit.f186387a;
        }

        @Override // com.fourthline.vision.internal.qd, com.fourthline.vision.internal.pd
        public void start() {
            this.f37131b.invoke();
        }

        @Override // com.fourthline.vision.internal.qd, com.fourthline.vision.internal.pd
        public void stop() {
            this.f37132c.invoke();
        }
    }

    @NotNull
    public static final <T> x1 consumer(@NotNull Function1<? super T, Unit> onConsume) {
        Intrinsics.checkNotNullParameter(onConsume, "onConsume");
        return new a(onConsume);
    }

    public static /* synthetic */ x1 consumer$default(Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = new qh(4);
        }
        return consumer(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit consumer$lambda$0(Object obj2) {
        return Unit.f186387a;
    }

    @NotNull
    public static final <T> qd startableConsumer(@NotNull Function0<Unit> onStart, @NotNull Function0<Unit> onStop, @NotNull Function1<? super T, Unit> onConsume) {
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onStop, "onStop");
        Intrinsics.checkNotNullParameter(onConsume, "onConsume");
        return new b(onConsume, onStart, onStop);
    }

    public static /* synthetic */ qd startableConsumer$default(Function0 function0, Function0 function02, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function0 = new aem.v(16);
        }
        if ((i & 2) != 0) {
            function02 = new aem.v(17);
        }
        if ((i & 4) != 0) {
            function1 = new qh(3);
        }
        return startableConsumer(function0, function02, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startableConsumer$lambda$2(Object obj2) {
        return Unit.f186387a;
    }
}
