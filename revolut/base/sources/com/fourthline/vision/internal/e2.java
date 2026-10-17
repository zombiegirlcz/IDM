package com.fourthline.vision.internal;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class e2 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f36123a = zhm.f0.f322471a;

    @Override // com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((List<fa>) obj2, (Continuation<? super Unit>) continuation);
    }

    @NotNull
    public final List<fa> getDetections$fourthline_vision_release() {
        return this.f36123a;
    }

    public final void setDetections$fourthline_vision_release(@NotNull List<fa> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f36123a = list;
    }

    public Object consume(@NotNull List<fa> list, @NotNull Continuation<? super Unit> continuation) {
        this.f36123a = list;
        return Unit.f186387a;
    }
}
