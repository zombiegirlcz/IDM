package ecm;

import com.google.common.base.MoreObjects;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a0 extends e0 {
    @Override // ecm.e0
    public d1 a() {
        return q().a();
    }

    @Override // ecm.e0
    public e0 b(Map map) {
        q().b(map);
        return this;
    }

    @Override // ecm.e0
    public e0 c() {
        q().c();
        return this;
    }

    @Override // ecm.e0
    public e0 d() {
        q().d();
        return this;
    }

    @Override // ecm.e0
    public e0 n(a2 a2Var) {
        q().n(a2Var);
        return this;
    }

    @Override // ecm.e0
    public e0 o() {
        q().o();
        return this;
    }

    public abstract e0 q();

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", q()).toString();
    }
}
