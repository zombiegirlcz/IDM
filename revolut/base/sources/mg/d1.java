package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class d1 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        BitSet bitSet = new BitSet();
        aVar.d();
        qg.b bVarA = aVar.A();
        int i = 0;
        while (bVarA != qg.b.END_ARRAY) {
            int i2 = f1.f205073a[bVarA.ordinal()];
            boolean zQ = true;
            if (i2 == 1 || i2 == 2) {
                int iS = aVar.s();
                if (iS == 0) {
                    zQ = false;
                } else if (iS != 1) {
                    StringBuilder sbW = a0.d.w(iS, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbW.append(aVar.m());
                    throw new JsonSyntaxException(sbW.toString());
                }
            } else {
                if (i2 != 3) {
                    throw new JsonSyntaxException("Invalid bitset value type: " + bVarA + "; at path " + aVar.getPath());
                }
                zQ = aVar.q();
            }
            if (zQ) {
                bitSet.set(i);
            }
            i++;
            bVarA = aVar.A();
        }
        aVar.i();
        return bitSet;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        BitSet bitSet = (BitSet) obj2;
        cVar.f();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            cVar.u(bitSet.get(i) ? 1L : 0L);
        }
        cVar.i();
    }
}
