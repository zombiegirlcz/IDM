package okhttp3;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mmm.h;
import mmm.j;
import mmm.m;
import org.jetbrains.annotations.NotNull;
import ulm.a1;
import ulm.b1;
import ulm.d1;
import ulm.u0;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends RequestBody {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b1 f226116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b1 f226117n;
    public static final byte[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f226118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f226119q;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f226120j;
    public final b1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f226121l;

    static {
        b1.Companion.getClass();
        f226116m = a1.a("multipart/mixed");
        a1.a("multipart/alternative");
        a1.a("multipart/digest");
        a1.a("multipart/parallel");
        f226117n = a1.a("multipart/form-data");
        o = new byte[]{58, 32};
        f226118p = new byte[]{13, 10};
        f226119q = new byte[]{45, 45};
    }

    public c(m boundaryByteString, b1 type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.i = boundaryByteString;
        this.f226120j = parts;
        a1 a1Var = b1.Companion;
        String str = type + "; boundary=" + boundaryByteString.v();
        a1Var.getClass();
        this.k = a1.a(str);
        this.f226121l = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(j jVar, boolean z) throws IOException {
        h hVar;
        j hVar2;
        if (z) {
            hVar2 = new h();
            hVar = hVar2;
        } else {
            hVar = 0;
            hVar2 = jVar;
        }
        List list = this.f226120j;
        int size = list.size();
        long j2 = 0;
        int i = 0;
        while (true) {
            m mVar = this.i;
            byte[] bArr = f226119q;
            byte[] bArr2 = f226118p;
            if (i >= size) {
                Intrinsics.h(hVar2);
                hVar2.write(bArr);
                hVar2.I8(mVar);
                hVar2.write(bArr);
                hVar2.write(bArr2);
                if (!z) {
                    return j2;
                }
                Intrinsics.h(hVar);
                long j3 = j2 + hVar.f207266b;
                hVar.f();
                return j3;
            }
            MultipartBody$Part multipartBody$Part = (MultipartBody$Part) list.get(i);
            u0 u0Var = multipartBody$Part.f226051a;
            RequestBody requestBody = multipartBody$Part.f226052b;
            Intrinsics.h(hVar2);
            hVar2.write(bArr);
            hVar2.I8(mVar);
            hVar2.write(bArr2);
            if (u0Var != null) {
                int size2 = u0Var.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    hVar2.p0(ue8.c.l(u0Var, i2)).write(o).p0(ue8.c.q(u0Var, i2)).write(bArr2);
                }
            }
            b1 b1VarContentType = requestBody.contentType();
            if (b1VarContentType != null) {
                hVar2.p0("Content-Type: ").p0(b1VarContentType.f281065a).write(bArr2);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength == -1 && z) {
                Intrinsics.h(hVar);
                hVar.f();
                return -1L;
            }
            hVar2.write(bArr2);
            if (z) {
                j2 += jContentLength;
            } else {
                requestBody.writeTo(hVar2);
            }
            hVar2.write(bArr2);
            i++;
        }
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws IOException {
        long j2 = this.f226121l;
        if (j2 != -1) {
            return j2;
        }
        long jA = a(null, true);
        this.f226121l = jA;
        return jA;
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return this.k;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        List list = this.f226120j;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((MultipartBody$Part) it8.next()).f226052b.isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(j sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
