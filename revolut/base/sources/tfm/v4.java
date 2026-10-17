package tfm;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class v4 extends AtomicInteger implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4 f270891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.y f270892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f270893c;
    public volatile boolean d;

    public v4(z4 z4Var, efm.y yVar) {
        this.f270891a = z4Var;
        this.f270892b = yVar;
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f270891a.a(this);
        this.f270893c = null;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d;
    }
}
