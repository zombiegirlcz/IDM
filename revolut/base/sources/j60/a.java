package j60;

import efm.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import rp0.y;

/* JADX INFO: loaded from: classes19.dex */
public interface a {
    static /* synthetic */ void v(a aVar, boolean z, Function0 function0, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            function0 = new k16.d(27);
        }
        aVar.l(z, function0);
    }

    void A(y yVar);

    r C();

    r E();

    r F();

    efm.b G(y yVar);

    void d(List list);

    void i(y yVar);

    boolean j();

    void l(boolean z, Function0 function0);

    r t();

    void x(y yVar);
}
