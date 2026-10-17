package q43;

import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        b0 b0Var = (b0) obj3;
        b0 b0Var2 = b0.CRYPTO;
        return cim.b.b(Boolean.valueOf(b0Var == b0Var2), Boolean.valueOf(((b0) obj2) == b0Var2));
    }
}
