package yed;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 implements jki.p {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f312896c = yhm.j.b(new y7k.h(25));
    public static final Lazy d = yhm.j.b(new y7k.h(26));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffd.a f312897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final afd.a f312898b;

    public r0(ffd.a alertsMapper, afd.a disclaimerMapper) {
        Intrinsics.checkNotNullParameter(alertsMapper, "alertsMapper");
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        this.f312897a = alertsMapper;
        this.f312898b = disclaimerMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12, types: [com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage] */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r18v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r47v0 */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r47v2 */
    /* JADX WARN: Type inference failed for: r56v0 */
    /* JADX WARN: Type inference failed for: r56v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r56v2 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, java.lang.Object[], koi.j[]] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model, still in use, count: 3, list:
          (r2v4 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model) from 0x01a4: MOVE (r25v0 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model) = (r2v4 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model)
          (r2v4 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model) from 0x00f2: MOVE (r25v2 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model) = (r2v4 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model)
          (r2v4 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model) from 0x0099: PHI (r2v13 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model) = 
          (r2v4 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model)
          (r2v15 com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model)
         binds: [B:24:0x007d, B:27:0x009f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // jki.p
    public final jki.m a(jki.i r89) {
        /*
            Method dump skipped, instruction units count: 1740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yed.r0.a(jki.i):jki.m");
    }
}
