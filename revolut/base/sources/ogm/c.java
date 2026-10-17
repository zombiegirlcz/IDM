package ogm;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends Completable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompletableSource[] f225209b;

    public /* synthetic */ c(CompletableSource[] completableSourceArr, int i) {
        this.f225208a = i;
        this.f225209b = completableSourceArr;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        switch (this.f225208a) {
            case 0:
                b bVar2 = new b(bVar, this.f225209b);
                bVar.onSubscribe((ggm.b) bVar2.e);
                bVar2.a();
                break;
            default:
                CompositeDisposable compositeDisposable = new CompositeDisposable();
                f fVar = new f(bVar, new AtomicBoolean(), compositeDisposable, this.f225209b.length + 1);
                bVar.onSubscribe(fVar);
                for (CompletableSource completableSource : this.f225209b) {
                    if (!compositeDisposable.f163117b) {
                        if (completableSource == null) {
                            compositeDisposable.dispose();
                            fVar.onError(new NullPointerException("A completable source is null"));
                        } else {
                            completableSource.c(fVar);
                        }
                    }
                    break;
                }
                fVar.onComplete();
                break;
        }
    }
}
