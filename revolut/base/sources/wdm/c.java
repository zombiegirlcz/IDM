package wdm;

import io.ktor.utils.io.t;
import kem.b0;
import kem.d0;
import kem.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c extends hem.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f296596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hem.c f296597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f296598c;
    public final r d;
    public final CoroutineContext e;

    public c(a call, hem.c origin, Function1 content, r headers) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f296596a = call;
        this.f296597b = origin;
        this.f296598c = content;
        this.d = headers;
        this.e = origin.getCoroutineContext();
    }

    @Override // hem.c
    public final f a() {
        return this.f296596a;
    }

    @Override // hem.c
    public final t b() {
        return (t) this.f296598c.invoke(this.f296597b);
    }

    @Override // hem.c
    public final qem.d c() {
        return this.f296597b.c();
    }

    @Override // hem.c
    public final qem.d d() {
        return this.f296597b.d();
    }

    @Override // hem.c
    public final d0 e() {
        return this.f296597b.e();
    }

    @Override // hem.c
    public final b0 f() {
        return this.f296597b.f();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.e;
    }

    @Override // kem.v
    public final r getHeaders() {
        return this.d;
    }
}
