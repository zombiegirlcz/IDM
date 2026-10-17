package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class m4 extends AtomicInteger implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4 f262998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f262999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f263000c;
    public volatile boolean d;

    public m4(q4 q4Var, fgm.l lVar) {
        this.f262998a = q4Var;
        this.f262999b = lVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f262998a.a(this);
        this.f263000c = null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }
}
