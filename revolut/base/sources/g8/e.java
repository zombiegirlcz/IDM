package g8;

import com.google.firebase.perf.util.i;
import e8.e0;
import e8.s;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {
    public s d;

    @Override // com.google.firebase.perf.util.i
    public final int b(Object obj2) {
        e0 e0Var = (e0) obj2;
        if (e0Var == null) {
            return 1;
        }
        return e0Var.getSize();
    }

    @Override // com.google.firebase.perf.util.i
    public final void c(Object obj2, Object obj3) {
        e0 e0Var = (e0) obj3;
        s sVar = this.d;
        if (sVar == null || e0Var == null) {
            return;
        }
        sVar.e.a(e0Var, true);
    }
}
