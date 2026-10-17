package io.ktor.utils.io;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final skm.l f163044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f163045b;

    public d(skm.l continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f163044a = continuation;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return;
        }
        StringBuilder sb6 = new StringBuilder("ReadTask 0x");
        String string = Integer.toString(continuation.hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb6.append(string);
        Throwable th10 = new Throwable(sb6.toString());
        yhm.f.b(th10);
        this.f163045b = th10;
    }

    @Override // io.ktor.utils.io.e
    public final void a(Throwable th10) {
        Object objA;
        Continuation continuationC = c();
        if (th10 != null) {
            m.Companion companion = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        } else {
            g.Companion.getClass();
            objA = b.f163036c;
        }
        ((skm.l) continuationC).resumeWith(objA);
    }

    @Override // io.ktor.utils.io.e
    public final Throwable b() {
        return this.f163045b;
    }

    public final Continuation c() {
        return this.f163044a;
    }

    @Override // io.ktor.utils.io.e
    public final void resume() {
        Continuation continuationC = c();
        g.Companion.getClass();
        ((skm.l) continuationC).resumeWith(b.f163036c);
    }
}
