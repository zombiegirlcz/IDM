package lk9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f196341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f196342b;

    public z(uj9.a commonSectionItemFactory, c headerMapper, e contentItemsMapper) {
        Intrinsics.checkNotNullParameter(commonSectionItemFactory, "commonSectionItemFactory");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(contentItemsMapper, "contentItemsMapper");
        this.f196341a = headerMapper;
        this.f196342b = contentItemsMapper;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v0 lk9.q, still in use, count: 2, list:
          (r9v0 lk9.q) from 0x0390: MOVE (r16v2 lk9.q) = (r9v0 lk9.q)
          (r9v0 lk9.q) from 0x033a: MOVE (r16v6 lk9.q) = (r9v0 lk9.q)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // jki.p
    public final jki.m a(jki.i r58) {
        /*
            Method dump skipped, instruction units count: 1923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk9.z.a(jki.i):jki.m");
    }
}
