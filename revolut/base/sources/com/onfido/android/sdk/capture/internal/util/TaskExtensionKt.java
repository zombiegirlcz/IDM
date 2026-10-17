package com.onfido.android.sdk.capture.internal.util;

import a31.o;
import abf.c;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.b;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"toSingle", "Lio/reactivex/rxjava3/core/Single;", "T", "", "Lcom/google/android/gms/tasks/Task;", "executor", "Ljava/util/concurrent/Executor;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TaskExtensionKt {
    @NotNull
    public static final <T> Single<T> toSingle(@NotNull Task<T> task, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(task, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        b bVar = new b(new c(task, executor, 16), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toSingle$lambda$2(Task this_toSingle, Executor executor, SingleEmitter emitter) {
        Intrinsics.checkNotNullParameter(this_toSingle, "$this_toSingle");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this_toSingle.addOnSuccessListener(executor, new o(10, new TaskExtensionKt$toSingle$1$1(emitter)));
        this_toSingle.addOnFailureListener(executor, new com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.a(emitter, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toSingle$lambda$2$lambda$0(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toSingle$lambda$2$lambda$1(SingleEmitter emitter, Exception exception) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (emitter.isDisposed()) {
            return;
        }
        emitter.onError(exception);
    }
}
