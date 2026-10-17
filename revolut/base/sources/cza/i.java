package cza;

import cli.n;
import kotlin.jvm.internal.Intrinsics;
import mya.l;
import mya.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f110178a;

    public i(l stepsOrBenefitsSectionProvider, o tncItemProvider) {
        Intrinsics.checkNotNullParameter(stepsOrBenefitsSectionProvider, "stepsOrBenefitsSectionProvider");
        Intrinsics.checkNotNullParameter(tncItemProvider, "tncItemProvider");
        this.f110178a = stepsOrBenefitsSectionProvider;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 cza.e, still in use, count: 2, list:
          (r1v1 cza.e) from 0x0089: MOVE (r29v1 cza.e) = (r1v1 cza.e)
          (r1v1 cza.e) from 0x006d: MOVE (r29v3 cza.e) = (r1v1 cza.e)
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
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cza.i.c(cli.j):cli.o");
    }
}
