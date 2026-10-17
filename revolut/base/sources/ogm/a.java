package ogm;

import et0.w;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends Completable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f225203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f225204c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f225202a = i;
        this.f225203b = obj2;
        this.f225204c = obj3;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        switch (this.f225202a) {
            case 0:
                ((Completable) this.f225203b).c(new ngm.g(bVar, (CompletableSource) this.f225204c, 2));
                break;
            case 1:
                ((a) this.f225203b).c(new f(bVar, (com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b) this.f225204c, 0));
                break;
            case 2:
                ((Completable) this.f225203b).c(new jul.o(bVar, (igm.p) this.f225204c, 18));
                break;
            case 3:
                n nVar = new n(bVar, (igm.o) this.f225204c);
                bVar.onSubscribe(nVar);
                ((Completable) this.f225203b).c(nVar);
                break;
            case 4:
                CompositeDisposable compositeDisposable = new CompositeDisposable();
                bVar.onSubscribe(compositeDisposable);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                compositeDisposable.a(((Scheduler) this.f225204c).d(new w(this, atomicBoolean, compositeDisposable, bVar, 7), 10L, TimeUnit.SECONDS));
                ((e) this.f225203b).c(new k18.c(compositeDisposable, 13, atomicBoolean, bVar));
                break;
            case 5:
                qgm.e eVar = new qgm.e(bVar, (igm.o) this.f225204c, 0);
                bVar.onSubscribe(eVar);
                ((qgm.d) this.f225203b).c(eVar);
                break;
            default:
                qgm.e eVar2 = new qgm.e(bVar, (igm.o) this.f225204c, 1);
                bVar.onSubscribe(eVar2);
                ((Single) this.f225203b).c(eVar2);
                break;
        }
    }

    public a(e eVar, Scheduler scheduler) {
        this.f225202a = 4;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f225203b = eVar;
        this.f225204c = scheduler;
    }
}
