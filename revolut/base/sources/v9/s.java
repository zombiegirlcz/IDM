package v9;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes16.dex */
public final class s extends p0 {
    public static final s e = new s(0);
    public static final s f = new s(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Class cls, int i) {
        super(cls, i);
        this.d = 1;
    }

    @Override // v9.p0, k9.k
    public boolean d(k9.v vVar, Object obj2) {
        switch (this.d) {
            case 0:
                return false;
            default:
                return super.d(vVar, obj2);
        }
    }

    @Override // v9.p0, k9.k
    public void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws JsonMappingException {
        String string;
        switch (this.d) {
            case 0:
                if (hVar.h(com.fasterxml.jackson.core.g.WRITE_BIGDECIMAL_AS_PLAIN)) {
                    BigDecimal bigDecimal = (BigDecimal) obj2;
                    int iScale = bigDecimal.scale();
                    if (iScale < -9999 || iScale > 9999) {
                        String str = String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999);
                        vVar.getClass();
                        throw new JsonMappingException(((t9.i) vVar).o, str, null);
                    }
                    string = bigDecimal.toPlainString();
                } else {
                    string = obj2.toString();
                }
                hVar.B(string);
                return;
            default:
                super.f(obj2, hVar, vVar);
                return;
        }
    }

    @Override // v9.p0
    public final String q(Object obj2) {
        switch (this.d) {
            case 0:
                throw new IllegalStateException();
            default:
                return obj2.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i) {
        super(BigDecimal.class, 0);
        this.d = i;
        switch (i) {
            case 1:
                super(Object.class, 0);
                break;
            default:
                break;
        }
    }
}
