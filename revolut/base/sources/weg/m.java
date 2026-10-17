package weg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f296787a;

    public m(Json json, p8g.c travelHotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        this.f296787a = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r6, java.util.List r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof weg.k
            if (r0 == 0) goto L13
            r0 = r8
            weg.k r0 = (weg.k) r0
            int r1 = r0.f296785w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296785w = r1
            goto L18
        L13:
            weg.k r0 = new weg.k
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296785w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L28
            goto L45
        L28:
            r6 = move-exception
            goto L48
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            r0.f296785w = r3     // Catch: java.lang.Throwable -> L28
            elm.g r8 = skm.p0.f264002b     // Catch: java.lang.Throwable -> L28
            weg.l r2 = new weg.l     // Catch: java.lang.Throwable -> L28
            r2.<init>(r7, r6, r5, r4)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r8 != r1) goto L45
            return r1
        L45:
            com.revolut.analytics.tracking.v3.AnalyticsContext r8 = (com.revolut.analytics.tracking.v3.AnalyticsContext) r8     // Catch: java.lang.Throwable -> L28
            return r8
        L48:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r8 = rd0.c.ERROR
            rd0.d.a(r8, r4, r4, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: weg.m.a(int, java.util.List, gim.c):java.lang.Object");
    }
}
