package g9;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.g;
import com.fasterxml.jackson.core.q;
import f9.d;
import j9.f;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a extends e9.a {
    public static final int[] k = f9.b.d;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f141414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f141415h;
    public q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f141416j;

    public a(d dVar, int i) {
        this.f123816b = i;
        this.d = new b(0, null, g.STRICT_DUPLICATE_DETECTION.b(i) ? new twg.c(this) : null);
        this.f123817c = g.WRITE_NUMBERS_AS_STRINGS.b(i);
        this.f141414g = k;
        this.i = f.f172257h;
        this.f = dVar;
        if (g.ESCAPE_NON_ASCII.b(i)) {
            this.f141415h = CertificateBody.profileType;
        }
        this.f141416j = !g.QUOTE_FIELD_NAMES.b(i);
    }

    public final void F(String str) throws JsonGenerationException {
        d(j6.a.s("Can not ", str, ", expecting field name (context: ", this.d.d(), ")"));
        throw null;
    }

    @Override // com.fasterxml.jackson.core.h
    public final a g(g gVar) {
        int iC = gVar.c();
        this.f123816b &= ~iC;
        if ((iC & e9.a.e) != 0) {
            if (gVar == g.WRITE_NUMBERS_AS_STRINGS) {
                this.f123817c = false;
            } else if (gVar == g.ESCAPE_NON_ASCII) {
                this.f141415h = 0;
            } else if (gVar == g.STRICT_DUPLICATE_DETECTION) {
                b bVar = this.d;
                bVar.e = null;
                this.d = bVar;
            }
        }
        if (gVar == g.QUOTE_FIELD_NAMES) {
            this.f141416j = true;
        }
        return this;
    }
}
