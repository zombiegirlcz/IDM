package oul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qul.m f229899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qul.b f229900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jid.z f229901c;

    public g0(qul.m toolbarStateMapper, qul.b inputAmountStateMapper, jid.z nextButtonStateMapper) {
        Intrinsics.checkNotNullParameter(toolbarStateMapper, "toolbarStateMapper");
        Intrinsics.checkNotNullParameter(inputAmountStateMapper, "inputAmountStateMapper");
        Intrinsics.checkNotNullParameter(nextButtonStateMapper, "nextButtonStateMapper");
        this.f229899a = toolbarStateMapper;
        this.f229900b = inputAmountStateMapper;
        this.f229901c = nextButtonStateMapper;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 oul.q, still in use, count: 2, list:
          (r3v0 oul.q) from 0x00f3: MOVE (r27v0 oul.q) = (r3v0 oul.q)
          (r3v0 oul.q) from 0x00e5: MOVE (r27v2 oul.q) = (r3v0 oul.q)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r29) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oul.g0.c(cli.j):cli.o");
    }
}
