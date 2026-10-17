package pgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import sgm.e4;

/* JADX INFO: loaded from: classes14.dex */
public final class e1 extends AtomicReference implements Runnable, igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f236049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f236050c;
    public boolean d;
    public final Object e;

    public /* synthetic */ e1(Object obj2, int i) {
        this.f236048a = i;
        this.e = obj2;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        switch (this.f236048a) {
            case 0:
                jgm.b.c(this, (Disposable) obj2);
                synchronized (((d1) this.e)) {
                    try {
                        if (this.d) {
                            ((d1) ((d1) this.e).d).o();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                jgm.b.c(this, (Disposable) obj2);
                synchronized (((e4) this.e)) {
                    try {
                        if (this.d) {
                            ((e4) this.e).f262808a.d();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f236048a) {
            case 0:
                ((d1) this.e).q(this);
                break;
            default:
                ((e4) this.e).d(this);
                break;
        }
    }
}
