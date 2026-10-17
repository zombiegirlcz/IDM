package fcm;

import android.content.Context;
import ecm.b0;
import ecm.d1;
import ecm.e0;
import ecm.e1;
import hcm.m;
import hcm.n;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends b0 {
    public static final e1 f;
    public final m d;
    public Context e;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        e1 e1Var = null;
        try {
            try {
                e1 e1Var2 = (e1) n.class.asSubclass(e1.class).getConstructor(null).newInstance(null);
                e1Var2.getClass();
                e1Var = e1Var2;
            } catch (Exception e) {
            }
        } catch (ClassCastException e2) {
        }
        f = e1Var;
    }

    public d(String str) {
        if (f == null) {
            throw new UnsupportedOperationException("Unable to load OkHttpChannelProvider");
        }
        this.d = new m(str);
    }

    @Override // ecm.a0, ecm.e0
    public final d1 a() {
        return new c(this.d.a(), this.e);
    }

    @Override // ecm.a0
    public final e0 q() {
        return this.d;
    }
}
