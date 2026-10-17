package com.fourthline.vision.internal;

import com.fourthline.vision.internal.ra;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class n9 implements x1 {
    @Override // com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((List<? extends h6>) obj2, (Continuation<? super Unit>) continuation);
    }

    public Object consume(@NotNull List<? extends h6> list, @NotNull Continuation<? super Unit> continuation) throws ra.a {
        if (list.size() <= 1) {
            return Unit.f186387a;
        }
        throw new ra.a(pa.o, null, 2, null);
    }
}
