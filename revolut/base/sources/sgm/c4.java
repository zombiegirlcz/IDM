package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class c4 extends Single {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Observable f262740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.c f262741c;
    public final Object d;

    public /* synthetic */ c4(Observable observable, Object obj2, igm.c cVar, int i) {
        this.f262739a = i;
        this.f262740b = observable;
        this.d = obj2;
        this.f262741c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(fgm.p pVar) {
        switch (this.f262739a) {
            case 0:
                this.f262740b.subscribe(new ngm.j(pVar, 2, this.f262741c, this.d));
                break;
            default:
                try {
                    Object obj2 = ((igm.q) this.d).get();
                    Objects.requireNonNull(obj2, "The seedSupplier returned a null value");
                    this.f262740b.subscribe(new ngm.j(pVar, 2, this.f262741c, obj2));
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    pVar.onSubscribe(jgm.c.INSTANCE);
                    pVar.onError(th10);
                    return;
                }
                break;
        }
    }
}
