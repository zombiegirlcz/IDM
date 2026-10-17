package io.ktor.utils.io;

import d9.e1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f163067a;

    public m0(Throwable th10) {
        this.f163067a = th10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable a(Function1 wrap) {
        Intrinsics.checkNotNullParameter(wrap, "wrap");
        Throwable th10 = this.f163067a;
        if (th10 == 0) {
            return null;
        }
        return th10 instanceof skm.w ? ((skm.w) th10).a() : th10 instanceof CancellationException ? e1.a(((CancellationException) th10).getMessage(), th10) : (Throwable) wrap.invoke(th10);
    }
}
