package wlm;

import java.io.IOException;
import kotlin.Unit;
import mmm.s0;
import mmm.v;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends v {
    public boolean d;
    public final /* synthetic */ o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f298541g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s0 s0Var, o oVar, j jVar) {
        super(s0Var);
        this.f = oVar;
        this.f298541g = jVar;
    }

    @Override // mmm.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.d) {
            return;
        }
        this.d = true;
        o oVar = this.f;
        j jVar = this.f298541g;
        synchronized (oVar) {
            try {
                int i = jVar.f298546h - 1;
                jVar.f298546h = i;
                if (i == 0 && jVar.f) {
                    oVar.p(jVar);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
