package jld;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements f {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp6.a f175726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final skd.i f175727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f175728c;

    public k(dp6.a feedbackRepository, skd.i slotManagerInteractor) {
        Intrinsics.checkNotNullParameter(feedbackRepository, "feedbackRepository");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        this.f175726a = feedbackRepository;
        this.f175727b = slotManagerInteractor;
        this.f175728c = ta6.a.a(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(jld.k r10, fkd.x r11, com.revolut.feature.slot_manager.api.model.SlotContext r12, yo6.e r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jld.k.a(jld.k, fkd.x, com.revolut.feature.slot_manager.api.model.SlotContext, yo6.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(fkd.x r11, yo6.e r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof jld.i
            if (r0 == 0) goto L14
            r0 = r13
            jld.i r0 = (jld.i) r0
            int r1 = r0.f175722w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f175722w = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            jld.i r0 = new jld.i
            r0.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f175722w
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            yhm.o.b(r13)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            goto L55
        L2a:
            r0 = move-exception
            r11 = r0
            goto L5a
        L2d:
            r0 = move-exception
            r11 = r0
            goto L7a
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            yhm.o.b(r13)
            dp6.a r1 = r10.f175726a     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            r13 = r2
            yo6.d r2 = yo6.d.WORKFLOW_STEP     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            fkd.w r11 = r11.f135803b     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            java.lang.String r3 = r11.f135801b     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            int r4 = r12.b()     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            r7.f175722w = r13     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            r5 = 0
            r6 = 0
            r8 = 96
            java.lang.Object r13 = dp6.a.b(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            if (r13 != r0) goto L55
            return r0
        L55:
            com.revolut.feature.feedback.api.domain.Feedback r13 = (com.revolut.feature.feedback.api.domain.Feedback) r13     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            java.lang.String r11 = r13.f73125a     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            goto L64
        L5a:
            zhm.h0 r12 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r13 = rd0.c.ERROR
            rd0.d.a(r13, r9, r9, r11, r12)
            r11 = r9
        L64:
            if (r11 != 0) goto L79
            jld.b r12 = new jld.b
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.slot_manager.impl.R$string.cx_feedback_feedback_error_nps
            r1 = 14
            r13.<init>(r0, r9, r9, r1)
            r12.<init>(r13)
            vkm.z1 r13 = r10.f175728c
            r13.k(r12)
        L79:
            return r11
        L7a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: jld.k.b(fkd.x, yo6.e, gim.c):java.lang.Object");
    }
}
