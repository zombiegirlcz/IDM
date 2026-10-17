package dlm;

import fgm.l;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f115802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f115803c;

    public /* synthetic */ c(Object obj2, AtomicReference atomicReference, int i) {
        this.f115801a = i;
        this.f115802b = obj2;
        this.f115803c = atomicReference;
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f115801a) {
            case 0:
                ((ProducerScope) this.f115802b).close(null);
                break;
            case 1:
                ((PublishSubject) this.f115802b).onComplete();
                break;
            default:
                ((l) this.f115802b).onComplete();
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f115801a) {
            case 0:
                ((ProducerScope) this.f115802b).close(th10);
                break;
            case 1:
                ((PublishSubject) this.f115802b).onError(th10);
                break;
            default:
                ((l) this.f115802b).onError(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f115801a) {
            case 0:
                try {
                    com.bumptech.glide.c.E((ProducerScope) this.f115802b, obj2);
                } catch (InterruptedException unused) {
                    return;
                }
                break;
            case 1:
                ((PublishSubject) this.f115802b).onNext(obj2);
                break;
            default:
                ((l) this.f115802b).onNext(obj2);
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        AtomicReference atomicReference;
        switch (this.f115801a) {
            case 0:
                break;
            case 1:
                jgm.b.e((rgm.a) this.f115803c, disposable);
                return;
            default:
                jgm.b.c(this.f115803c, disposable);
                return;
        }
        do {
            atomicReference = this.f115803c;
            if (atomicReference.compareAndSet(null, disposable)) {
                return;
            }
        } while (atomicReference.get() == null);
        disposable.dispose();
    }
}
