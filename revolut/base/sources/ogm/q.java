package ogm;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Objects;
import org.reactivestreams.Publisher;
import pgm.k0;
import pgm.l0;
import pgm.m0;

/* JADX INFO: loaded from: classes14.dex */
public final class q extends Flowable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f225242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f225243c;

    public /* synthetic */ q(Object obj2, int i) {
        this.f225242b = i;
        this.f225243c = obj2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        switch (this.f225242b) {
            case 0:
                ((Completable) this.f225243c).c(new l0(aVar, 0));
                break;
            case 1:
                try {
                    Object obj2 = ((igm.q) this.f225243c).get();
                    Objects.requireNonNull(obj2, "The publisher supplied is null");
                    ((Publisher) obj2).a(aVar);
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    xgm.c.c(th10, aVar);
                    return;
                }
                break;
            case 2:
                Object[] objArr = (Object[]) this.f225243c;
                if (!(aVar instanceof bhm.a)) {
                    aVar.e(new k0(aVar, objArr, 1));
                } else {
                    aVar.e(new k0((bhm.a) aVar, objArr, 0));
                }
                break;
            case 3:
                ((Observable) this.f225243c).subscribe(new m0(aVar));
                break;
            case 4:
                ((Publisher) this.f225243c).a(aVar);
                break;
            default:
                ((Single) this.f225243c).c(new tgm.i(aVar));
                break;
        }
    }
}
