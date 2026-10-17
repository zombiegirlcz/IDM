package v6g;

import cli.n;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsPriceBreakdownScreenContract$InputData f286388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6g.a f286389b;

    public g(TravelFlightsPriceBreakdownScreenContract$InputData inputData, x6g.a itemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f286388a = inputData;
        this.f286389b = itemMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.lang.Object[], qv0.i[]] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [dj0.d] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 cii.b, still in use, count: 3, list:
          (r2v1 cii.b) from 0x0215: MOVE (r27v0 cii.b) = (r2v1 cii.b)
          (r2v1 cii.b) from 0x0203: PHI (r2v13 cii.b) = (r2v1 cii.b), (r2v14 cii.b) binds: [B:5:0x0053, B:136:0x0203] A[DONT_GENERATE, DONT_INLINE]
          (r2v1 cii.b) from 0x005a: PHI (r2v14 cii.b) = (r2v1 cii.b), (r2v21 cii.b) binds: [B:6:0x0055, B:55:0x01e7] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r36) {
        /*
            Method dump skipped, instruction units count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6g.g.c(cli.j):cli.o");
    }
}
