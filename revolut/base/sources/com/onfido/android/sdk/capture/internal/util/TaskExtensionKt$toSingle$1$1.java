package com.onfido.android.sdk.capture.internal.util;

import io.reactivex.rxjava3.core.SingleEmitter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "", "result", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class TaskExtensionKt$toSingle$1$1<T> extends u implements Function1<T, Unit> {
    final /* synthetic */ SingleEmitter $emitter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskExtensionKt$toSingle$1$1(SingleEmitter singleEmitter) {
        super(1);
        this.$emitter = singleEmitter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        m3707invoke(obj2);
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3707invoke(T t2) {
        if (this.$emitter.isDisposed()) {
            return;
        }
        this.$emitter.onSuccess(t2);
    }
}
