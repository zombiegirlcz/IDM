package vf0;

import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ofm.a {
    public final Function f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f288408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f288409h;

    public d(efm.y yVar, Function function, boolean z) {
        super(yVar);
        this.f = function;
        this.f288408g = z;
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        int i = this.e;
        efm.y yVar = this.f224907a;
        if (i != 0) {
            yVar.onNext(null);
            return;
        }
        try {
            Object objApply = this.f.apply(obj2);
            if (objApply != null) {
                if (!this.f288408g) {
                    yVar.onNext(objApply);
                } else {
                    if (objApply.equals(this.f288409h)) {
                        return;
                    }
                    this.f288409h = objApply;
                    yVar.onNext(objApply);
                }
            }
        } catch (Throwable th10) {
            c(th10);
        }
    }

    @Override // nfm.j
    public final Object poll() {
        Object objApply;
        while (true) {
            Object objPoll = this.f224909c.poll();
            if (objPoll == null) {
                return null;
            }
            objApply = this.f.apply(objPoll);
            if (objApply != null) {
                if (!this.f288408g) {
                    break;
                }
                if (!objApply.equals(this.f288409h)) {
                    this.f288409h = objApply;
                    break;
                }
            }
        }
        return objApply;
    }
}
