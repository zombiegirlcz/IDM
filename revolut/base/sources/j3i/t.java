package j3i;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nwh.b f171214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f171215b;

    public t(nwh.b dataMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dataMapper, "dataMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f171214a = dataMapper;
        this.f171215b = dateProvider;
    }

    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.revolut.analytics.tracking.v3.AnalyticsContext, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v0 j3i.m, still in use, count: 3, list:
          (r7v0 j3i.m) from 0x0031: MOVE (r23v0 j3i.m) = (r7v0 j3i.m)
          (r7v0 j3i.m) from 0x00a2: MOVE (r23v2 j3i.m) = (r7v0 j3i.m)
          (r7v0 j3i.m) from 0x0070: MOVE (r23v4 j3i.m) = (r7v0 j3i.m)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r69) {
        /*
            Method dump skipped, instruction units count: 1454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3i.t.c(cli.j):cli.o");
    }
}
