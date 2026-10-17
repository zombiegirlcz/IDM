package e9;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.g;
import com.fasterxml.jackson.core.h;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a extends h {
    public static final int e = (g.WRITE_NUMBERS_AS_STRINGS.c() | g.ESCAPE_NON_ASCII.c()) | g.STRICT_DUPLICATE_DETECTION.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f123816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f123817c;
    public g9.b d;

    public final String D(BigDecimal bigDecimal) throws JsonGenerationException {
        if (!g.WRITE_BIGDECIMAL_AS_PLAIN.b(this.f123816b)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale >= -9999 && iScale <= 9999) {
            return bigDecimal.toPlainString();
        }
        d(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        throw null;
    }

    public abstract void E(String str);

    @Override // com.fasterxml.jackson.core.h
    public final boolean h(g gVar) {
        return (gVar.c() & this.f123816b) != 0;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void i(Object obj2) {
        g9.b bVar = this.d;
        if (bVar != null) {
            bVar.f141418h = obj2;
        }
    }
}
