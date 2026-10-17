package arb;

import com.google.crypto.tink.shaded.protobuf.t1;
import g09.i;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.q0;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements bte.a, CoroutineScope {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f8630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ate.e f8631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final brb.e f8632c;

    public g(CoroutineScope scope, ate.e appTipsInteractor, brb.e repository, i lessonsInteractor) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(appTipsInteractor, "appTipsInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(lessonsInteractor, "lessonsInteractor");
        this.f8630a = scope;
        this.f8631b = appTipsInteractor;
        this.f8632c = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(arb.g r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof arb.b
            if (r0 == 0) goto L13
            r0 = r6
            arb.b r0 = (arb.b) r0
            int r1 = r0.f8620w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8620w = r1
            goto L18
        L13:
            arb.b r0 = new arb.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8620w
            if (r2 == 0) goto L43
            r5 = 1
            r3 = 2
            if (r2 == r5) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            brb.e r4 = r4.f8632c
            r0.f8620w = r3
            java.lang.Object r4 = r4.c(r0)
            if (r4 != r1) goto L40
            return r1
        L40:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L43:
            yhm.o.b(r6)
            ate.e r4 = r4.f8631b
            cte.a r4 = r4.a(r5)
            if (r4 == 0) goto L56
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Failed requirement."
            r4.<init>(r5)
            throw r4
        L56:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Required value was null."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: arb.g.a(arb.g, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f8630a.getCoroutineContext();
    }

    @Override // bte.a
    public final void start() {
        Continuation continuation = null;
        q.G(rd0.e.d(new q0(q.j(new y(new c(this, continuation, 2), new a3i.i(new q0(t1.g(new a3i.i(this.f8631b.f9039c, this, 21), 500L), new c(this, continuation, 1), 1), this, 22)), 0, 3), new c(this, continuation, 0), 1), h0.f322473a), this);
    }
}
