package qz0;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends v8.c {
    public final CompletableFuture d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CompletableFuture completableFuture, Integer num, Integer num2) {
        super(num != null ? num.intValue() : Integer.MIN_VALUE, num2 != null ? num2.intValue() : Integer.MIN_VALUE);
        Intrinsics.checkNotNullParameter(completableFuture, "completableFuture");
        this.d = completableFuture;
    }

    @Override // v8.l
    public final void b(Drawable drawable) {
        this.d.cancel(true);
    }

    @Override // v8.l
    public final void d(Object resource, w8.d dVar) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.d.complete(resource);
    }

    @Override // v8.c, v8.l
    public final void g(Drawable drawable) {
        this.d.completeExceptionally(new Exception("load failed"));
    }

    @Override // v8.c, r8.j
    public final void onDestroy() {
        this.d.cancel(true);
    }
}
