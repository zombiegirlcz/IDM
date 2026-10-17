package kg;

import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 BIG_DECIMAL;
    public static final j0 DOUBLE;
    public static final j0 LAZILY_PARSED_NUMBER;
    public static final j0 LONG_OR_DOUBLE;

    static {
        j0 j0Var = new j0() { // from class: kg.f0
            @Override // kg.j0
            public final Number a(qg.a aVar) {
                return Double.valueOf(aVar.r());
            }
        };
        DOUBLE = j0Var;
        j0 j0Var2 = new j0() { // from class: kg.g0
            @Override // kg.j0
            public final Number a(qg.a aVar) {
                return new com.google.gson.internal.l(aVar.y());
            }
        };
        LAZILY_PARSED_NUMBER = j0Var2;
        j0 j0Var3 = new j0() { // from class: kg.h0
            public static Double b(String str, qg.a aVar) throws MalformedJsonException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!(aVar.f245600b == e0.LENIENT)) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.m());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e) {
                    StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Cannot parse ", str, "; at path ");
                    sbX.append(aVar.m());
                    throw new JsonParseException(sbX.toString(), e);
                }
            }

            @Override // kg.j0
            public final Number a(qg.a aVar) throws IOException {
                String strY = aVar.y();
                if (strY.indexOf(46) >= 0) {
                    return b(strY, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(strY));
                } catch (NumberFormatException unused) {
                    return b(strY, aVar);
                }
            }
        };
        LONG_OR_DOUBLE = j0Var3;
        j0 j0Var4 = new j0() { // from class: kg.i0
            @Override // kg.j0
            public final Number a(qg.a aVar) throws IOException {
                String strY = aVar.y();
                try {
                    return com.google.gson.internal.j.n(strY);
                } catch (NumberFormatException e) {
                    StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Cannot parse ", strY, "; at path ");
                    sbX.append(aVar.m());
                    throw new JsonParseException(sbX.toString(), e);
                }
            }
        };
        BIG_DECIMAL = j0Var4;
        $VALUES = new j0[]{j0Var, j0Var2, j0Var3, j0Var4};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }

    public abstract Number a(qg.a aVar);
}
