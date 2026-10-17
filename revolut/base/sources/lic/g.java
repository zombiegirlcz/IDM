package lic;

import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends yji.n implements mm.b {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PerkDetailsFlowContract$InputData f195451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bgc.e f195452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final aii.o f195453n;
    public final sf0.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jx0.a f195454p;

    public g(PerkDetailsFlowContract$InputData inputData, bgc.e rewardsInteractor, aii.o eventsDispatcher, sf0.h serverErrorParser, jx0.a perkReloadController) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(perkReloadController, "perkReloadController");
        this.f195451l = inputData;
        this.f195452m = rewardsInteractor;
        this.f195453n = eventsDispatcher;
        this.o = serverErrorParser;
        this.f195454p = perkReloadController;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00ef -> B:16:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0110 -> B:45:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0112 -> B:45:0x00f3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(lic.g r23, kic.f r24, gim.c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lic.g.Z2(lic.g, kic.f, gim.c):java.lang.Object");
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        kic.f action = (kic.f) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return pd.b.n(p0.f264003c, new l34.a(this, action, null, 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lic.f
            if (r0 == 0) goto L13
            r0 = r5
            lic.f r0 = (lic.f) r0
            int r1 = r0.f195450w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195450w = r1
            goto L18
        L13:
            lic.f r0 = new lic.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195450w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L51
        L27:
            r5 = move-exception
            goto L41
        L29:
            r5 = move-exception
            goto L54
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            jx0.a r5 = r4.f195454p     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f195450w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r5.x(r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L51
            return r1
        L41:
            java.lang.String r0 = "ExternalRegistrationActionHandler"
            java.lang.String r1 = "reloadPerkDetails"
            java.util.Set r0 = m72.b.w(r0, r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
        L51:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L54:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lic.g.b3(gim.c):java.lang.Object");
    }
}
