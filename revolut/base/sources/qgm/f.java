package qgm;

import ce9.m;
import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel;
import igm.q;
import io.reactivex.rxjava3.core.Maybe;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends Maybe implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a31.l f246374a;

    public f(a31.l lVar) {
        this.f246374a = lVar;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void e(fgm.e eVar) {
        ggm.b bVar = new ggm.b(kgm.j.f184026b, 0);
        eVar.onSubscribe(bVar);
        if (bVar.isDisposed()) {
            return;
        }
        try {
            List listCacheAllDocuments$lambda$0 = DocumentSelectionHostViewModel.cacheAllDocuments$lambda$0((DocumentSelectionHostViewModel) this.f246374a.f978b);
            if (bVar.isDisposed()) {
                return;
            }
            if (listCacheAllDocuments$lambda$0 == null) {
                eVar.onComplete();
            } else {
                eVar.onSuccess(listCacheAllDocuments$lambda$0);
            }
        } catch (Throwable th10) {
            m.F(th10);
            if (bVar.isDisposed()) {
                jb3.l.v(th10);
            } else {
                eVar.onError(th10);
            }
        }
    }

    @Override // igm.q
    public final Object get() {
        return DocumentSelectionHostViewModel.cacheAllDocuments$lambda$0((DocumentSelectionHostViewModel) this.f246374a.f978b);
    }
}
