package skm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class f1 extends i1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(f1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final Function1 e;

    public f1(Function1 function1) {
        this.e = function1;
    }

    @Override // skm.i1
    public final boolean i() {
        return true;
    }

    @Override // skm.i1
    public final void j(Throwable th10) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th10);
        }
    }
}
