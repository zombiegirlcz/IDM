package q53;

import com.revolut.feature.card_reader.tips.impl.data.network.CardReaderTipsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import p24.q;
import pti.s;
import pu4.d;
import q03.h;
import q43.m;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements xz5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardReaderTipsService f242289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f242290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f242291c;
    public final x4l.c d;

    public c(CardReaderTipsService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f242289a = service;
        this.f242290b = memoryCache;
        this.f242291c = storage;
        Continuation continuation = null;
        int i = 28;
        this.d = new x4l.c(new s(this, continuation, 1), new h(this, i), new d(this, i), new m(this, continuation, 3), new q(this, continuation, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r6.d.d(r7, false, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(wz5.a r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof q53.b
            if (r0 == 0) goto L13
            r0 = r8
            q53.b r0 = (q53.b) r0
            int r1 = r0.f242288w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242288w = r1
            goto L18
        L13:
            q53.b r0 = new q53.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242288w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L5c
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L4e
        L36:
            yhm.o.b(r8)
            q03.m r8 = new q03.m
            r2 = 15
            r5 = 0
            r8.<init>(r6, r7, r5, r2)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            r0.f242288w = r4
            java.lang.Object r7 = skm.e0.J(r7, r8, r0)
            if (r7 != r1) goto L4e
            goto L5b
        L4e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            r0.f242288w = r3
            r8 = 0
            x4l.c r2 = r6.d
            java.lang.Object r7 = r2.d(r7, r8, r0)
            if (r7 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q53.c.a(wz5.a, gim.c):java.lang.Object");
    }
}
