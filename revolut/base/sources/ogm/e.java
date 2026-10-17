package ogm;

import com.onfido.android.sdk.capture.token.TokenExpirationServiceConnector;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.Callable;
import pgm.i1;
import pgm.x;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends Completable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f225213b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f225212a = i;
        this.f225213b = obj2;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        switch (this.f225212a) {
            case 0:
                d dVar = new d(bVar);
                bVar.onSubscribe(dVar);
                try {
                    TokenExpirationServiceConnector.connect$lambda$0((TokenExpirationServiceConnector) ((cmc.d) this.f225213b).f25198b, dVar);
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    dVar.onError(th10);
                    return;
                }
                break;
            case 1:
                Throwable th11 = (Throwable) this.f225213b;
                bVar.onSubscribe(jgm.c.INSTANCE);
                bVar.onError(th11);
                break;
            case 2:
                Disposable bVar2 = new ggm.b(kgm.j.f184026b, 0);
                bVar.onSubscribe(bVar2);
                if (!bVar2.isDisposed()) {
                    try {
                        ((igm.a) this.f225213b).run();
                        if (!bVar2.isDisposed()) {
                            bVar.onComplete();
                        }
                        break;
                    } catch (Throwable th12) {
                        ce9.m.F(th12);
                        if (bVar2.isDisposed()) {
                            jb3.l.v(th12);
                            return;
                        } else {
                            bVar.onError(th12);
                            return;
                        }
                    }
                }
                break;
            case 3:
                Disposable bVar3 = new ggm.b(kgm.j.f184026b, 0);
                bVar.onSubscribe(bVar3);
                try {
                    ((Callable) this.f225213b).call();
                    if (!bVar3.isDisposed()) {
                        bVar.onComplete();
                    }
                    break;
                } catch (Throwable th13) {
                    ce9.m.F(th13);
                    if (bVar3.isDisposed()) {
                        jb3.l.v(th13);
                        return;
                    } else {
                        bVar.onError(th13);
                        return;
                    }
                }
                break;
            case 4:
                ((i1) this.f225213b).a(new h(bVar, 0));
                break;
            case 5:
                ((Single) this.f225213b).c(new i(bVar, 0));
                break;
            case 6:
                ((CompletableSource) this.f225213b).c(bVar);
                break;
            default:
                ((x) this.f225213b).c(new qgm.g(bVar));
                break;
        }
    }
}
