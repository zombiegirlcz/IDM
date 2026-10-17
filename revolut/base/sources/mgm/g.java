package mgm;

import ce9.m;
import igm.o;
import igm.q;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Objects;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Observable f205324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f205325c;

    public /* synthetic */ g(Observable observable, o oVar, int i) {
        this.f205323a = i;
        this.f205324b = observable;
        this.f205325c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        Stream stream;
        switch (this.f205323a) {
            case 0:
                ObservableSource observableSource = this.f205324b;
                boolean z = observableSource instanceof q;
                o oVar = this.f205325c;
                if (!z) {
                    observableSource.subscribe(new f(lVar, oVar));
                } else {
                    try {
                        Object obj2 = ((q) observableSource).get();
                        if (obj2 != null) {
                            Object objApply = oVar.apply(obj2);
                            Objects.requireNonNull(objApply, "The mapper returned a null Stream");
                            stream = (Stream) objApply;
                        } else {
                            stream = null;
                        }
                        if (stream == null) {
                            jgm.c.a(lVar);
                        } else {
                            j.c(lVar, stream);
                        }
                    } catch (Throwable th10) {
                        m.F(th10);
                        jgm.c.c(th10, lVar);
                        return;
                    }
                }
                break;
            default:
                this.f205324b.subscribe(new l(lVar, this.f205325c, 0));
                break;
        }
    }
}
