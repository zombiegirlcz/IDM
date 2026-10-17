package gem;

import com.fourthline.core.internal.k0;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jlm.l;
import kem.i;
import kem.t;
import kem.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.f0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes23.dex */
public final class f extends nem.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f143324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f143325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f143326c;
    public final int d;
    public final int e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f143327g;

    public f(List parts) throws EOFException {
        g gVar;
        byte[] bArr = b.f143315a;
        StringBuilder sb6 = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            tim.c.INSTANCE.getClass();
            String string = Integer.toString(tim.c.f271589b.c(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb6.append(string);
        }
        String boundary = f0.U0(70, sb6.toString());
        i contentType = kem.g.f183200a.b("boundary", boundary);
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f143324a = contentType;
        Charset charset = Charsets.UTF_8;
        byte[] bArrO = a1m.e.O("--" + boundary + "\r\n", charset);
        this.f143325b = bArrO;
        byte[] bArrO2 = a1m.e.O("--" + boundary + "--\r\n", charset);
        this.f143326c = bArrO2;
        this.d = bArrO2.length;
        this.e = (b.f143315a.length * 2) + bArrO.length;
        List list = parts;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                this.f = arrayList;
                Long lValueOf = 0L;
                Iterator it9 = arrayList.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        l = lValueOf;
                        break;
                    }
                    Long l2 = ((g) it9.next()).f143329b;
                    if (l2 == null) {
                        break;
                    } else {
                        lValueOf = lValueOf != null ? Long.valueOf(lValueOf.longValue() + l2.longValue()) : null;
                    }
                }
                this.f143327g = l != null ? Long.valueOf(l.longValue() + ((long) this.d)) : l;
                return;
            }
            nem.g gVar2 = (nem.g) it8.next();
            jlm.a aVar = new jlm.a();
            for (Map.Entry entry : gVar2.f214644b.entries()) {
                a1m.e.U(aVar, ((String) entry.getKey()) + ": " + d0.k0((List) entry.getValue(), "; ", null, null, 0, null, 62));
                a1m.e.T(aVar, b.f143315a);
            }
            t tVar = gVar2.f214644b;
            List list2 = u.f183239a;
            String str = tVar.get("Content-Length");
            Long lValueOf2 = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            if (gVar2 instanceof nem.e) {
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                byte[] bArrF = l.f(aVar, -1);
                gVar = new g(bArrF, ((nem.e) gVar2).e, lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + ((long) this.e) + ((long) bArrF.length)) : null);
            } else {
                if (!(gVar2 instanceof nem.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                jlm.a aVar2 = new jlm.a();
                a1m.e.U(aVar2, ((nem.f) gVar2).e);
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                byte[] bArrF2 = l.f(aVar2, -1);
                k0 k0Var = new k0(bArrF2, 5);
                if (lValueOf2 == null) {
                    a1m.e.U(aVar, "Content-Length: " + bArrF2.length);
                    a1m.e.T(aVar, b.f143315a);
                }
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                gVar = new g(l.f(aVar, -1), k0Var, Long.valueOf(bArrF2.length + this.e + r5.length));
            }
            arrayList.add(gVar);
        }
    }

    @Override // nem.c
    public final Long a() {
        return this.f143327g;
    }

    @Override // nem.c
    public final i b() {
        return this.f143324a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0184, code lost:
    
        if (((io.ktor.utils.io.m) r8).i(r0) != r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019c, code lost:
    
        if (((io.ktor.utils.io.m) r8).i(r0) != r1) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:45:0x00bd, B:47:0x00c3, B:50:0x00df, B:53:0x00f3, B:69:0x013d, B:79:0x0163, B:44:0x00b7), top: B:97:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3 A[Catch: all -> 0x0041, PHI: r2 r8 r9
      0x00f3: PHI (r2v19 gem.g) = (r2v7 gem.g), (r2v21 gem.g) binds: [B:39:0x009d, B:51:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r8v31 ??) = (r8v15 ??), (r8v51 ??) binds: [B:39:0x009d, B:51:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r9v23 java.util.Iterator) = (r9v11 java.util.Iterator), (r9v24 java.util.Iterator) binds: [B:39:0x009d, B:51:0x00ef] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:45:0x00bd, B:47:0x00c3, B:50:0x00df, B:53:0x00f3, B:69:0x013d, B:79:0x0163, B:44:0x00b7), top: B:97:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #5 {all -> 0x008a, blocks: (B:57:0x010c, B:59:0x0110, B:67:0x0139, B:77:0x015d, B:78:0x0162, B:75:0x0159, B:76:0x015c, B:33:0x0085, B:38:0x009a, B:41:0x00ad, B:60:0x0118, B:66:0x0137, B:63:0x0131, B:28:0x0071, B:73:0x0157), top: B:97:0x001f, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d A[Catch: all -> 0x008a, TryCatch #5 {all -> 0x008a, blocks: (B:57:0x010c, B:59:0x0110, B:67:0x0139, B:77:0x015d, B:78:0x0162, B:75:0x0159, B:76:0x015c, B:33:0x0085, B:38:0x009a, B:41:0x00ad, B:60:0x0118, B:66:0x0137, B:63:0x0131, B:28:0x0071, B:73:0x0157), top: B:97:0x001f, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0163 A[Catch: all -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:45:0x00bd, B:47:0x00c3, B:50:0x00df, B:53:0x00f3, B:69:0x013d, B:79:0x0163, B:44:0x00b7), top: B:97:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [io.ktor.utils.io.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v8, types: [io.ktor.utils.io.e0] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [io.ktor.utils.io.e0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23, types: [io.ktor.utils.io.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v3, types: [io.ktor.utils.io.e0] */
    /* JADX WARN: Type inference failed for: r8v31, types: [io.ktor.utils.io.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v33, types: [io.ktor.utils.io.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34, types: [io.ktor.utils.io.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0154 -> B:45:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(io.ktor.utils.io.e0 r8, gim.c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gem.f.d(io.ktor.utils.io.e0, gim.c):java.lang.Object");
    }
}
