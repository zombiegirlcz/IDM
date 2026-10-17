package okhttp3;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.d;
import emm.g;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.i;
import mmm.k0;
import mmm.l0;
import mmm.s0;
import org.jetbrains.annotations.NotNull;
import ulm.h;
import ulm.h1;
import ulm.p0;
import ulm.r0;
import ulm.u0;
import ulm.v;
import ulm.v1;
import ulm.w0;
import ulm.x0;
import vlm.j;
import zhm.f0;
import zlm.l;
import zlm.m;
import zsc.p;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    @NotNull
    public static final h Companion = new h();
    public static final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f226108l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f226109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f226110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f226111c;
    public final h1 d;
    public final int e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f226112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r0 f226113h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f226114j;

    static {
        g gVar = emm.h.Companion;
        gVar.getClass();
        emm.h.f127697a.getClass();
        k = "OkHttp-Sent-Millis";
        gVar.getClass();
        emm.h.f127697a.getClass();
        f226108l = "OkHttp-Received-Millis";
    }

    public a(s0 rawSource) throws IOException {
        v1 tlsVersion;
        Intrinsics.checkNotNullParameter(rawSource, "rawSource");
        try {
            l0 l0VarC = u1.c(rawSource);
            String strE = l0VarC.e(Long.MAX_VALUE);
            x0.Companion.getClass();
            x0 x0VarD = w0.d(strE);
            if (x0VarD == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strE));
                emm.h.Companion.getClass();
                emm.h.f127697a.j(5, "cache corruption", iOException);
                throw iOException;
            }
            this.f226109a = x0VarD;
            this.f226111c = l0VarC.e(Long.MAX_VALUE);
            ulm.s0 s0Var = new ulm.s0();
            Cache.Companion.getClass();
            int iB = ulm.g.b(l0VarC);
            int i = 0;
            for (int i2 = 0; i2 < iB; i2++) {
                s0Var.b(l0VarC.e(Long.MAX_VALUE));
            }
            this.f226110b = ue8.c.e(s0Var);
            l lVar = m.Companion;
            String strE2 = l0VarC.e(Long.MAX_VALUE);
            lVar.getClass();
            m mVarA = l.a(strE2);
            this.d = mVarA.f323315a;
            this.e = mVarA.f323316b;
            this.f = mVarA.f323317c;
            ulm.s0 s0Var2 = new ulm.s0();
            Cache.Companion.getClass();
            int iB2 = ulm.g.b(l0VarC);
            for (int i3 = 0; i3 < iB2; i3++) {
                s0Var2.b(l0VarC.e(Long.MAX_VALUE));
            }
            String name = k;
            Intrinsics.checkNotNullParameter(name, "name");
            String strG = ue8.c.g(s0Var2, name);
            String name2 = f226108l;
            Intrinsics.checkNotNullParameter(name2, "name");
            String strG2 = ue8.c.g(s0Var2, name2);
            Intrinsics.checkNotNullParameter(name, "name");
            ue8.c.n(s0Var2, name);
            Intrinsics.checkNotNullParameter(name2, "name");
            ue8.c.n(s0Var2, name2);
            this.i = strG != null ? Long.parseLong(strG) : 0L;
            this.f226114j = strG2 != null ? Long.parseLong(strG2) : 0L;
            this.f226112g = ue8.c.e(s0Var2);
            if (this.f226109a.f()) {
                String strE3 = l0VarC.e(Long.MAX_VALUE);
                if (strE3.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strE3 + CoreConstants.DOUBLE_QUOTE_CHAR);
                }
                v cipherSuite = v.Companion.b(l0VarC.e(Long.MAX_VALUE));
                List peerCertificates = a(l0VarC);
                List localCertificates = a(l0VarC);
                if (l0VarC.J()) {
                    tlsVersion = v1.SSL_3_0;
                } else {
                    ulm.u1 u1Var = v1.Companion;
                    String strE4 = l0VarC.e(Long.MAX_VALUE);
                    u1Var.getClass();
                    tlsVersion = ulm.u1.a(strE4);
                }
                r0.Companion.getClass();
                Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
                Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
                Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
                this.f226113h = new r0(tlsVersion, cipherSuite, j.q(localCertificates), new p0(j.q(peerCertificates), i));
            } else {
                this.f226113h = null;
            }
            Unit unit = Unit.f186387a;
            rawSource.close();
        } catch (Throwable th10) {
            try {
                throw th10;
            } catch (Throwable th11) {
                d.e(rawSource, th10);
                throw th11;
            }
        }
    }

    public static List a(l0 l0Var) throws IOException {
        Cache.Companion.getClass();
        int iB = ulm.g.b(l0Var);
        if (iB == -1) {
            return f0.f322471a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iB);
            for (int i = 0; i < iB; i++) {
                String strE = l0Var.e(Long.MAX_VALUE);
                mmm.h hVar = new mmm.h();
                mmm.m.Companion.getClass();
                mmm.m mVarA = mmm.l.a(strE);
                if (mVarA == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                hVar.v(mVarA);
                arrayList.add(certificateFactory.generateCertificate(new i(hVar, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static void b(k0 k0Var, List list) throws IOException {
        try {
            k0Var.l3(list.size());
            k0Var.writeByte(10);
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                byte[] encoded = ((Certificate) it8.next()).getEncoded();
                mmm.l lVar = mmm.m.Companion;
                Intrinsics.h(encoded);
                lVar.getClass();
                k0Var.p0(mmm.l.d(-1234567890, encoded).a());
                k0Var.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final void c(wlm.h editor) {
        x0 x0Var = this.f226109a;
        r0 r0Var = this.f226113h;
        u0 u0Var = this.f226112g;
        u0 u0Var2 = this.f226110b;
        Intrinsics.checkNotNullParameter(editor, "editor");
        k0 k0VarB = u1.b(editor.d(0));
        try {
            k0VarB.p0(x0Var.i);
            k0VarB.writeByte(10);
            k0VarB.p0(this.f226111c);
            k0VarB.writeByte(10);
            k0VarB.l3(u0Var2.size());
            k0VarB.writeByte(10);
            int size = u0Var2.size();
            for (int i = 0; i < size; i++) {
                k0VarB.p0(ue8.c.l(u0Var2, i));
                k0VarB.p0(": ");
                k0VarB.p0(ue8.c.q(u0Var2, i));
                k0VarB.writeByte(10);
            }
            h1 protocol = this.d;
            int i2 = this.e;
            String message = this.f;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(message, "message");
            StringBuilder sb6 = new StringBuilder();
            if (protocol == h1.HTTP_1_0) {
                sb6.append("HTTP/1.0");
            } else {
                sb6.append("HTTP/1.1");
            }
            sb6.append(p.SPACE_CHAR);
            sb6.append(i2);
            sb6.append(p.SPACE_CHAR);
            sb6.append(message);
            k0VarB.p0(sb6.toString());
            k0VarB.writeByte(10);
            k0VarB.l3(u0Var.size() + 2);
            k0VarB.writeByte(10);
            int size2 = u0Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                k0VarB.p0(ue8.c.l(u0Var, i3));
                k0VarB.p0(": ");
                k0VarB.p0(ue8.c.q(u0Var, i3));
                k0VarB.writeByte(10);
            }
            k0VarB.p0(k);
            k0VarB.p0(": ");
            k0VarB.l3(this.i);
            k0VarB.writeByte(10);
            k0VarB.p0(f226108l);
            k0VarB.p0(": ");
            k0VarB.l3(this.f226114j);
            k0VarB.writeByte(10);
            if (x0Var.f()) {
                k0VarB.writeByte(10);
                Intrinsics.h(r0Var);
                k0VarB.p0(r0Var.f281128b.f281155a);
                k0VarB.writeByte(10);
                b(k0VarB, r0Var.a());
                b(k0VarB, r0Var.f281129c);
                k0VarB.p0(r0Var.f281127a.a());
                k0VarB.writeByte(10);
            }
            Unit unit = Unit.f186387a;
            k0VarB.close();
        } finally {
        }
    }

    public a(Response response) {
        u0 u0VarE;
        Intrinsics.checkNotNullParameter(response, "response");
        this.f226109a = response.f226087a.f281095a;
        Cache.Companion.getClass();
        Intrinsics.checkNotNullParameter(response, "<this>");
        Response response2 = response.i;
        Intrinsics.h(response2);
        u0 u0Var = response2.f226087a.f281097c;
        u0 u0Var2 = response.f;
        Set setC = ulm.g.c(u0Var2);
        if (setC.isEmpty()) {
            u0VarE = u0.f281141b;
        } else {
            ulm.s0 s0Var = new ulm.s0();
            int size = u0Var.size();
            for (int i = 0; i < size; i++) {
                String strL = ue8.c.l(u0Var, i);
                if (setC.contains(strL)) {
                    s0Var.a(strL, ue8.c.q(u0Var, i));
                }
            }
            u0VarE = ue8.c.e(s0Var);
        }
        this.f226110b = u0VarE;
        this.f226111c = response.f226087a.f281096b;
        this.d = response.f226088b;
        this.e = response.d;
        this.f = response.f226089c;
        this.f226112g = u0Var2;
        this.f226113h = response.e;
        this.i = response.f226093l;
        this.f226114j = response.f226094m;
    }
}
