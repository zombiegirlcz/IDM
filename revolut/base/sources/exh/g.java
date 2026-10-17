package exh;

import h30.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f130444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f130445b;

    public g(q cardPaymentsGatewayRepository, j cpgStatePoller) {
        Intrinsics.checkNotNullParameter(cardPaymentsGatewayRepository, "cardPaymentsGatewayRepository");
        Intrinsics.checkNotNullParameter(cpgStatePoller, "cpgStatePoller");
        this.f130444a = cardPaymentsGatewayRepository;
        this.f130445b = cpgStatePoller;
    }

    public static String c(cue.d dVar) {
        String str = dVar.f108993c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("externalPaymentId must be present");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        if (r0 != r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b7 -> B:29:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(cue.d r17, int r18, long r19, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: exh.g.a(cue.d, int, long, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        if (r0 != r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ab -> B:29:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(cue.d r17, int r18, long r19, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: exh.g.b(cue.d, int, long, gim.c):java.lang.Object");
    }
}
