package sul;

import cli.n;
import kotlin.jvm.internal.Intrinsics;
import tnb.g0;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tul.b f265803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f265804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p56.a f265805c;

    public j(tul.b toolbarStateMapper, g0 contentListItemsStateMapper, p56.a nextButtonStateMapper, tul.a footerStateMapper) {
        Intrinsics.checkNotNullParameter(toolbarStateMapper, "toolbarStateMapper");
        Intrinsics.checkNotNullParameter(contentListItemsStateMapper, "contentListItemsStateMapper");
        Intrinsics.checkNotNullParameter(nextButtonStateMapper, "nextButtonStateMapper");
        Intrinsics.checkNotNullParameter(footerStateMapper, "footerStateMapper");
        this.f265803a = toolbarStateMapper;
        this.f265804b = contentListItemsStateMapper;
        this.f265805c = nextButtonStateMapper;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 sul.h, still in use, count: 2, list:
          (r3v0 sul.h) from 0x020c: MOVE (r35v0 sul.h) = (r3v0 sul.h)
          (r3v0 sul.h) from 0x0179: PHI (r3v57 sul.h) = (r3v0 sul.h), (r3v62 sul.h) binds: [B:66:0x0160, B:71:0x0187] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r65) {
        /*
            Method dump skipped, instruction units count: 2304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sul.j.c(cli.j):cli.o");
    }
}
