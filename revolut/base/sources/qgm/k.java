package qgm;

import fgm.p;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends ngm.h implements fgm.e, p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f246383c;
    public Disposable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(fgm.l lVar, int i) {
        super(lVar);
        this.f246383c = i;
    }

    @Override // ngm.h, io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f246383c) {
            case 0:
                super.dispose();
                this.d.dispose();
                break;
            default:
                super.dispose();
                this.d.dispose();
                break;
        }
    }

    @Override // fgm.e
    public void onComplete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f215244a.onComplete();
    }

    @Override // fgm.e
    public final void onError(Throwable th10) {
        switch (this.f246383c) {
            case 0:
                if ((get() & 54) == 0) {
                    lazySet(2);
                    this.f215244a.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            default:
                if ((get() & 54) == 0) {
                    lazySet(2);
                    this.f215244a.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
        }
    }

    @Override // fgm.e
    public final void onSubscribe(Disposable disposable) {
        switch (this.f246383c) {
            case 0:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    this.f215244a.onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    this.f215244a.onSubscribe(this);
                }
                break;
        }
    }
}
