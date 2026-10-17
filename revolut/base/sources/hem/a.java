package hem;

import io.ktor.utils.io.s;
import io.ktor.utils.io.s0;
import io.ktor.utils.io.t;
import kem.b0;
import kem.d0;
import kem.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import wdm.i;

/* JADX INFO: loaded from: classes23.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151720a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f151721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f151722c;
    public final qem.d d;
    public final qem.d e;
    public final CoroutineContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wdm.f f151723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f151724h;
    public final r i;

    public a(wdm.f call, fem.h responseData) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        this.f151723g = call;
        this.f = responseData.f;
        this.f151721b = responseData.f134668a;
        this.f151722c = responseData.d;
        this.d = responseData.f134669b;
        this.e = responseData.f134671g;
        Object obj2 = responseData.e;
        t tVar = obj2 instanceof t ? (t) obj2 : null;
        if (tVar == null) {
            t.Companion.getClass();
            tVar = s.f163086b;
        }
        this.f151724h = tVar;
        this.i = responseData.f134670c;
    }

    @Override // hem.c
    public final wdm.f a() {
        switch (this.f151720a) {
            case 0:
                return this.f151723g;
            default:
                return (i) this.f151723g;
        }
    }

    @Override // hem.c
    public final t b() {
        switch (this.f151720a) {
            case 0:
                return (t) this.f151724h;
            default:
                byte[] content = (byte[]) this.f151724h;
                int length = content.length;
                Intrinsics.checkNotNullParameter(content, "content");
                jlm.a source = new jlm.a();
                source.k(length, content);
                Intrinsics.checkNotNullParameter(source, "source");
                return new s0(source);
        }
    }

    @Override // hem.c
    public final qem.d c() {
        switch (this.f151720a) {
        }
        return this.d;
    }

    @Override // hem.c
    public final qem.d d() {
        switch (this.f151720a) {
        }
        return this.e;
    }

    @Override // hem.c
    public final d0 e() {
        switch (this.f151720a) {
        }
        return this.f151721b;
    }

    @Override // hem.c
    public final b0 f() {
        switch (this.f151720a) {
        }
        return this.f151722c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF74819h() {
        switch (this.f151720a) {
        }
        return this.f;
    }

    @Override // kem.v
    public final r getHeaders() {
        switch (this.f151720a) {
            case 0:
                return (zdm.h) this.i;
            default:
                return this.i;
        }
    }

    public a(i call, byte[] body, c origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f151723g = call;
        this.f151724h = body;
        this.f151721b = origin.e();
        this.f151722c = origin.f();
        this.d = origin.c();
        this.e = origin.d();
        this.i = origin.getHeaders();
        this.f = origin.getF74819h();
    }
}
