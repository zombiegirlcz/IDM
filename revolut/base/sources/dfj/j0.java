package dfj;

import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Integer num;
        Integer num2 = 4;
        dej.o0 o0Var = (dej.o0) obj3;
        if (o0Var instanceof dej.i0) {
            num = 0;
        } else if (o0Var instanceof dej.h0) {
            num = 1;
        } else if (o0Var instanceof dej.l0) {
            num = 2;
        } else if (o0Var instanceof dej.n0) {
            num = 3;
        } else {
            if (!(o0Var instanceof dej.j0) && !(o0Var instanceof dej.k0)) {
                throw new NoWhenBranchMatchedException();
            }
            num = num2;
        }
        dej.o0 o0Var2 = (dej.o0) obj2;
        if (o0Var2 instanceof dej.i0) {
            num2 = 0;
        } else if (o0Var2 instanceof dej.h0) {
            num2 = 1;
        } else if (o0Var2 instanceof dej.l0) {
            num2 = 2;
        } else if (o0Var2 instanceof dej.n0) {
            num2 = 3;
        } else if (!(o0Var2 instanceof dej.j0) && !(o0Var2 instanceof dej.k0)) {
            throw new NoWhenBranchMatchedException();
        }
        return cim.b.b(num, num2);
    }
}
