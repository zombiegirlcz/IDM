package vf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f288407a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f288407a = cause;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f288407a;
    }
}
