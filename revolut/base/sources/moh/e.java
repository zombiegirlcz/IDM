package moh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.c f207657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ugl.c f207658b;

    public e(zzl.c regexMatcher, ugl.c screenerInteractor) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        this.f207657a = regexMatcher;
        this.f207658b = screenerInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof moh.c
            if (r0 == 0) goto L13
            r0 = r7
            moh.c r0 = (moh.c) r0
            int r1 = r0.f207655x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207655x = r1
            goto L18
        L13:
            moh.c r0 = new moh.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207655x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L55
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            w4l.h r7 = w4l.h.f294642c
            ugl.c r2 = r5.f207658b
            yhl.f r2 = (yhl.f) r2
            vkm.d r7 = r2.c(r7)
            mh1.e r2 = new mh1.e
            r4 = 25
            r2.<init>(r4)
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            r0.u = r6
            r0.f207655x = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L62:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r7.next()
            r2 = r1
            com.revolut.shared.feature.wealth.models.screener.ScreenerCollection r2 = (com.revolut.shared.feature.wealth.models.screener.ScreenerCollection) r2
            zel.d r2 = r2.f105158h
            zel.d r4 = zel.d.USER
            if (r2 != r4) goto L62
            r0.add(r1)
            goto L62
        L79:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L80
            goto L99
        L80:
            java.util.Iterator r7 = r0.iterator()
        L84:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r7.next()
            com.revolut.shared.feature.wealth.models.screener.ScreenerCollection r0 = (com.revolut.shared.feature.wealth.models.screener.ScreenerCollection) r0
            java.lang.String r0 = r0.f105156c
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r6)
            if (r0 == 0) goto L84
            r3 = 0
        L99:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: moh.e.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum b(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof moh.d
            if (r0 == 0) goto L13
            r0 = r7
            moh.d r0 = (moh.d) r0
            int r1 = r0.f207656w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207656w = r1
            goto L18
        L13:
            moh.d r0 = new moh.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207656w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L66
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r6 == 0) goto L3b
            moh.a r5 = moh.a.INITIAL
            return r5
        L3b:
            int r6 = r5.length()
            r7 = 3
            if (r6 >= r7) goto L45
            moh.a r5 = moh.a.TOO_SHORT
            return r5
        L45:
            int r6 = r5.length()
            r7 = 40
            if (r6 <= r7) goto L50
            moh.a r5 = moh.a.TOO_LONG
            return r5
        L50:
            zzl.c r6 = r4.f207657a
            java.lang.String r7 = "[\\p{L}0-9 -]+"
            boolean r6 = r6.a(r7, r5)
            if (r6 != 0) goto L5d
            moh.a r5 = moh.a.HAS_INVALID_CHARS
            return r5
        L5d:
            r0.f207656w = r3
            java.lang.Object r7 = r4.a(r5, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            if (r5 != 0) goto L71
            moh.a r5 = moh.a.DUPLICATE
            return r5
        L71:
            moh.a r5 = moh.a.VALID
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: moh.e.b(java.lang.String, java.lang.String, gim.c):java.lang.Enum");
    }
}
