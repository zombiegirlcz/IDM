package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class i0 extends Single implements lgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f262893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.q f262894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.b f262895c;

    public i0(Observable observable, igm.q qVar, igm.b bVar) {
        this.f262893a = observable;
        this.f262894b = qVar;
        this.f262895c = bVar;
    }

    @Override // lgm.d
    public final Observable a() {
        return new y(this.f262893a, this.f262894b, this.f262895c, 1, false);
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(fgm.p pVar) {
        try {
            Object obj2 = this.f262894b.get();
            Objects.requireNonNull(obj2, "The initialSupplier returned a null value");
            this.f262893a.subscribe(new h0(pVar, obj2, this.f262895c, 1));
        } catch (Throwable th10) {
            ce9.m.F(th10);
            pVar.onSubscribe(jgm.c.INSTANCE);
            pVar.onError(th10);
        }
    }
}
