package eh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gh9.b f125791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yof.d f125792b;

    public q(gh9.b amountItemsMapper, yof.d transferAmountMapper, gh9.d submitButtonClauseMapper) {
        Intrinsics.checkNotNullParameter(amountItemsMapper, "amountItemsMapper");
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(submitButtonClauseMapper, "submitButtonClauseMapper");
        this.f125791a = amountItemsMapper;
        this.f125792b = transferAmountMapper;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 eh9.h, still in use, count: 2, list:
          (r3v0 eh9.h) from 0x0047: MOVE (r35v0 eh9.h) = (r3v0 eh9.h)
          (r3v0 eh9.h) from 0x001d: MOVE (r35v2 eh9.h) = (r3v0 eh9.h)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r53) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eh9.q.c(cli.j):cli.o");
    }
}
