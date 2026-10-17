package z55;

import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        int i;
        ux4.h hVar = ((ux4.d) obj2).f;
        int[] iArr = b0.f319493b;
        int i2 = iArr[hVar.ordinal()];
        int i3 = 2;
        if (i2 == 1) {
            i = 1;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        Integer numValueOf = Integer.valueOf(i);
        int i5 = iArr[((ux4.d) obj3).f.ordinal()];
        if (i5 == 1) {
            i3 = 1;
        } else if (i5 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return cim.b.b(numValueOf, Integer.valueOf(i3));
    }
}
