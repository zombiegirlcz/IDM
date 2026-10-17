package ulm;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends mmm.v {
    public final /* synthetic */ f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(mmm.s0 s0Var, f fVar) {
        super(s0Var);
        this.d = fVar;
    }

    @Override // mmm.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.f.close();
        super.close();
    }
}
