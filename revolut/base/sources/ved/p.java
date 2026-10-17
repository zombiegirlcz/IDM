package ved;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffd.a f288288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sfd.e f288289b;

    public p(ffd.a alertsMapper, sfd.e currencyChartMapper) {
        Intrinsics.checkNotNullParameter(alertsMapper, "alertsMapper");
        Intrinsics.checkNotNullParameter(currencyChartMapper, "currencyChartMapper");
        this.f288288a = alertsMapper;
        this.f288289b = currencyChartMapper;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 ved.i, still in use, count: 9, list:
          (r3v0 ved.i) from 0x0232: MOVE (r23v12 ved.i) = (r3v0 ved.i)
          (r3v0 ved.i) from 0x01ca: MOVE (r23v18 ved.i) = (r3v0 ved.i)
          (r3v0 ved.i) from 0x03ca: MOVE (r23v2 ved.i) = (r3v0 ved.i)
          (r3v0 ved.i) from 0x03b4: MOVE (r23v5 ved.i) = (r3v0 ved.i)
          (r3v0 ved.i) from 0x03a1: MOVE (r23v6 ved.i) = (r3v0 ved.i)
          (r3v0 ved.i) from 0x038e: MOVE (r23v7 ved.i) = (r3v0 ved.i)
          (r3v0 ved.i) from 0x037b: MOVE (r23v8 ved.i) = (r3v0 ved.i)
          (r3v0 ved.i) from 0x0368: MOVE (r23v9 ved.i) = (r3v0 ved.i)
          (r3v0 ved.i) from 0x0359: MOVE (r23v10 ved.i) = (r3v0 ved.i)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // jki.p
    public final jki.m a(jki.i r59) {
        /*
            Method dump skipped, instruction units count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ved.p.a(jki.i):jki.m");
    }
}
