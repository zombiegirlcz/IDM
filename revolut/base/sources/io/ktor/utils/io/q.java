package io.ktor.utils.io;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f163077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klm.b f163078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f163079c;
    public final long d;
    public final jlm.k e;
    public final int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jlm.a f163080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f163081h;
    public int i;

    public q(t channel, klm.b matchString, e0 writeChannel, long j2) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(matchString, "matchString");
        Intrinsics.checkNotNullParameter(writeChannel, "writeChannel");
        this.f163077a = channel;
        this.f163078b = matchString;
        this.f163079c = writeChannel;
        this.d = j2;
        if (matchString.f185655a.length <= 0) {
            throw new IllegalArgumentException("Empty match string not permitted for scanning");
        }
        this.e = channel.c();
        byte[] bArr = matchString.f185655a;
        int[] iArr = new int[bArr.length];
        int length = bArr.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2++) {
            while (i > 0 && matchString.a(i2) != matchString.a(i)) {
                i = iArr[i - 1];
            }
            if (matchString.a(i2) == matchString.a(i)) {
                i++;
            }
            iArr[i2] = i;
        }
        this.f = iArr;
        this.f163080g = new jlm.a();
    }

    /* JADX WARN: Path cross not found for [B:44:0x00c2, B:68:0x0121], limit reached: 112 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018e A[EDGE_INSN: B:109:0x018e->B:94:0x018e BREAK  A[LOOP:0: B:30:0x0078->B:90:0x0177], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0177 A[LOOP:0: B:30:0x0078->B:90:0x0177, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01b8 -> B:99:0x01bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:31:0x0081
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r24) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.q.a(gim.c):java.lang.Object");
    }

    public final void b(long j2) throws IOException {
        long j3 = this.f163081h + j2;
        long j5 = this.d;
        if (j3 <= j5) {
            return;
        }
        StringBuilder sb6 = new StringBuilder("Limit of ");
        sb6.append(j5);
        sb6.append(" bytes exceeded while searching for \"");
        klm.b bVar = this.f163078b;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        sb6.append(kotlin.text.a0.D(kotlin.text.a0.u(bVar.f185655a), "\n", "\\n", false));
        sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        throw new IOException(sb6.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r15 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r15 != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0040 -> B:27:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004c -> B:22:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.q.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r11.h(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
    
        if (r11 != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[PHI: r10
      0x00cb: PHI (r10v2 boolean) = (r10v3 boolean), (r10v6 boolean) binds: [B:27:0x0071, B:22:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00de -> B:43:0x00e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r10, gim.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.q.d(boolean, gim.c):java.lang.Object");
    }
}
