package com.fourthline.vision.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class a9 implements d2, x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f35951a = Collections.synchronizedList(new ArrayList());

    @Override // com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((z8) obj2, (Continuation<? super Unit>) continuation);
    }

    @Override // com.fourthline.vision.internal.d2
    public /* bridge */ void subscribe(Function2<? super List<? extends z8>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super.subscribe(function2);
    }

    public Object consume(@NotNull z8 z8Var, @NotNull Continuation<? super Unit> continuation) {
        this.f35951a.add(z8Var);
        return Unit.f186387a;
    }

    @Override // com.fourthline.vision.internal.d2
    @NotNull
    public List<z8> get() {
        List metadatas = this.f35951a;
        Intrinsics.checkNotNullExpressionValue(metadatas, "metadatas");
        return zhm.d0.d1(metadatas);
    }
}
