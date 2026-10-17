package skm;

import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes13.dex */
public abstract class u1 extends CoroutineDispatcher {
    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i, String str) {
        zkm.g.a(i);
        return str != null ? new zkm.p(this, str) : this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        tkm.e eVar;
        String str;
        p0 p0Var = p0.f264001a;
        tkm.e eVar2 = zkm.o.f323119a;
        if (this == eVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar2.e;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + e0.s(this);
    }
}
