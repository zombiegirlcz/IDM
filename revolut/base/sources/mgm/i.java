package mgm;

import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends ngm.h implements BiConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f205326c;

    public i(fgm.l lVar, h hVar) {
        super(lVar);
        this.f205326c = hVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj2, Object obj3) {
        Throwable th10 = (Throwable) obj3;
        fgm.l lVar = this.f215244a;
        if (th10 != null) {
            lVar.onError(th10);
        } else if (obj2 != null) {
            a(obj2);
        } else {
            lVar.onError(new NullPointerException("The CompletionStage terminated with null."));
        }
    }

    @Override // ngm.h, io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        super.dispose();
        this.f205326c.set(null);
    }
}
