package k9;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import d9.m0;
import d9.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.eac.CertificateBody;
import p9.h0;
import p9.k0;
import p9.y;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends com.fasterxml.jackson.core.o implements Serializable {
    public static final m9.a f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f182185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f182186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9.i f182187c;
    public final t9.f d;
    public final e e;

    static {
        y yVar = new y();
        yVar.f234252a = new x9.i(48, 48);
        yVar.f234253b = true;
        f = new m9.a(null, yVar, w9.f.f295677c, x9.q.f303524m, Locale.getDefault(), com.fasterxml.jackson.core.c.f26164a, new dl.a());
    }

    public n() {
        new ConcurrentHashMap(64, 0.6f, 2);
        this.f182185a = new m(this);
        s9.g gVar = new s9.g();
        x9.o oVar = new x9.o();
        oVar.f303517a = new x9.i(20, 200);
        JavaType[] javaTypeArr = w9.f.f295676b;
        h0 h0Var = new h0();
        p9.s sVar = new p9.s();
        m9.a aVar = f;
        m9.a aVar2 = aVar.f203591b == sVar ? aVar : new m9.a(sVar, aVar.f203592c, aVar.f203590a, aVar.e, aVar.f, aVar.f203593g, aVar.d);
        z zVar = z.e;
        m0 m0Var = m0.f112307c;
        k0 k0Var = k0.f;
        cnm.c cVar = new cnm.c();
        cVar.f25476b = zVar;
        m9.b[] bVarArr = new m9.b[m9.j.f203603a];
        m9.c cVar2 = new m9.c();
        this.f182186b = new t(aVar2, gVar, h0Var, oVar, cVar);
        this.e = new e(aVar2, gVar, h0Var, oVar, cVar, cVar2);
        t tVar = this.f182186b;
        l lVar = l.SORT_PROPERTIES_ALPHABETICALLY;
        if (lVar.c(tVar.f203598a)) {
            this.f182186b = (t) this.f182186b.l(lVar);
            this.e = (e) this.e.l(lVar);
        }
        this.f182187c = new t9.i();
        int i = n9.a.f213521a;
        new HashMap(8);
        new ConcurrentHashMap(Math.min(64, 500), 0.8f, 4);
        this.d = t9.f.f268928c;
    }

    public final void a(com.fasterxml.jackson.core.h hVar, Serializable serializable) throws IOException {
        u uVar = u.CLOSE_CLOSEABLE;
        t tVar = this.f182186b;
        boolean zN = tVar.n(uVar);
        t9.f fVar = this.d;
        t9.i iVar = this.f182187c;
        if (!zN || !(serializable instanceof Closeable)) {
            try {
                iVar.getClass();
                new t9.i(iVar, tVar, fVar).F(hVar, serializable);
                hVar.close();
                return;
            } catch (Exception e) {
                Annotation[] annotationArr = x9.f.f303505a;
                hVar.g(com.fasterxml.jackson.core.g.AUTO_CLOSE_JSON_CONTENT);
                try {
                    hVar.close();
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                x9.f.u(e);
                throw new RuntimeException(e);
            }
        }
        Closeable closeable = (Closeable) serializable;
        try {
            iVar.getClass();
            new t9.i(iVar, tVar, fVar).F(hVar, serializable);
        } catch (Exception e4) {
            e = e4;
        }
        try {
            closeable.close();
            hVar.close();
        } catch (Exception e5) {
            e = e5;
            closeable = null;
            Annotation[] annotationArr2 = x9.f.f303505a;
            if (hVar != null) {
                hVar.g(com.fasterxml.jackson.core.g.AUTO_CLOSE_JSON_CONTENT);
                try {
                    hVar.close();
                } catch (Exception e6) {
                    e.addSuppressed(e6);
                }
            }
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e22) {
                    e.addSuppressed(e22);
                }
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            x9.f.u(e);
            throw new RuntimeException(e);
        }
    }

    public final com.fasterxml.jackson.core.h b(f9.h hVar) {
        m mVar = this.f182185a;
        mVar.getClass();
        g9.c cVar = new g9.c(mVar.c(new f9.c(-1, -1, hVar, !false), false), mVar.d, hVar, mVar.f);
        f9.i iVar = mVar.e;
        if (iVar != com.fasterxml.jackson.core.e.f26167j) {
            cVar.i = iVar;
        }
        t tVar = this.f182186b;
        tVar.getClass();
        u uVar = u.INDENT_OUTPUT;
        int i = tVar.k;
        if (uVar.b(i) && cVar.f26174a == null) {
            com.fasterxml.jackson.core.p fVar = tVar.f182199j;
            if (fVar instanceof j9.g) {
                j9.f fVar2 = (j9.f) ((j9.g) fVar);
                fVar2.getClass();
                fVar = new j9.f(fVar2);
            }
            if (fVar != null) {
                cVar.f26174a = fVar;
            }
        }
        boolean zB = u.WRITE_BIGDECIMAL_AS_PLAIN.b(i);
        if (zB) {
            int iC = zB ? com.fasterxml.jackson.core.g.WRITE_BIGDECIMAL_AS_PLAIN.c() : 0;
            int i2 = iC;
            int i3 = cVar.f123816b;
            int i5 = (iC & i2) | ((~i2) & i3);
            int i6 = i3 ^ i5;
            if (i6 != 0) {
                cVar.f123816b = i5;
                if ((e9.a.e & i6) != 0) {
                    cVar.f123817c = com.fasterxml.jackson.core.g.WRITE_NUMBERS_AS_STRINGS.b(i5);
                    com.fasterxml.jackson.core.g gVar = com.fasterxml.jackson.core.g.ESCAPE_NON_ASCII;
                    if (gVar.b(i6)) {
                        if (gVar.b(i5)) {
                            cVar.f141415h = CertificateBody.profileType;
                        } else {
                            cVar.f141415h = 0;
                        }
                    }
                    com.fasterxml.jackson.core.g gVar2 = com.fasterxml.jackson.core.g.STRICT_DUPLICATE_DETECTION;
                    if (gVar2.b(i6)) {
                        if (gVar2.b(i5)) {
                            g9.b bVar = cVar.d;
                            if (bVar.e == null) {
                                bVar.e = new twg.c(cVar);
                                cVar.d = bVar;
                            }
                        } else {
                            g9.b bVar2 = cVar.d;
                            bVar2.e = null;
                            cVar.d = bVar2;
                        }
                    }
                }
                cVar.f141416j = !com.fasterxml.jackson.core.g.QUOTE_FIELD_NAMES.b(i5);
            }
        }
        return cVar;
    }

    public final String c(Serializable serializable) throws JsonProcessingException {
        f9.h hVar = new f9.h(this.f182185a.d());
        try {
            a(b(hVar), serializable);
            j9.j jVar = hVar.f132805a;
            String strC = jVar.c();
            jVar.g();
            return strC;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw new JsonMappingException(null, a0.d.s("Unexpected IOException (of type ", e2.getClass().getName(), "): ", x9.f.g(e2)));
        }
    }
}
