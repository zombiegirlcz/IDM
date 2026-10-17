package rve;

import com.revolut.feature.topup_screen.common.CardDetails;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import r10.q;
import skm.e0;
import skm.p0;
import t61.k;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f257762c;
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f257763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f257764b;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        pkm.e eVar = pkm.e.SECONDS;
        f257762c = kotlin.time.c.g(2, eVar);
        d = kotlin.time.c.g(2, eVar);
    }

    public d(q cardTopUpRepository, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(cardTopUpRepository, "cardTopUpRepository");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f257763a = cardTopUpRepository;
        this.f257764b = serverErrorParser;
    }

    public final Object a(k kVar, CardDetails cardDetails, String str, gim.i iVar) {
        ave.b bVar = new ave.b(this.f257763a, kVar, cardDetails, str, null);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, bVar, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00d3 -> B:45:0x00d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00dd -> B:47:0x00e0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r24, java.lang.String r25, gim.c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rve.d.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:73)|29|30|67|31|(3:34|35|(6:(1:39)|42|43|61|27|(2:65|66)(0))(1:37))|57) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (skm.k0.c(r10, r2) == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        r2 = r7;
        r15 = r8;
        r4 = r13;
        r14 = r19;
        r8 = r20;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
    
        r7 = r23.f257764b.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ff, code lost:
    
        if (r7 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0107, code lost:
    
        if (r13 < 4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0109, code lost:
    
        r2.u = r8;
        r2.v = r14;
        r2.f257759w = r15;
        r2.f257760x = r4;
        r2.f257761y = r13;
        r2.z = r6;
        r2.C = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011c, code lost:
    
        if (skm.k0.c(r10, r2) != r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011f, code lost:
    
        r13 = r15;
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
    
        r7 = r14;
        r14 = r4;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
    
        return new zve.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0139, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012d, code lost:
    
        r7 = r2;
        r2 = r8;
        r8 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x011f -> B:59:0x0121). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r24, java.lang.String r25, gim.c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rve.d.c(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
