package com.fourthline.vision.internal;

import com.fourthline.vision.internal.ra;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class k6 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36443b;

    private final void throwError() throws ra.a {
        ra.a aVar = new ra.a(pa.d, null, 2, null);
        this.f36442a = true;
        throw aVar;
    }

    @Override // com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((List<? extends h6>) obj2, (Continuation<? super Unit>) continuation);
    }

    public Object consume(@NotNull List<? extends h6> list, @NotNull Continuation<? super Unit> continuation) throws ra.a {
        if (this.f36442a) {
            throwError();
        }
        if (this.f36443b && list.isEmpty()) {
            throwError();
        } else if (!list.isEmpty()) {
            this.f36443b = true;
        }
        return Unit.f186387a;
    }
}
