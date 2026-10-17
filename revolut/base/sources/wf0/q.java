package wf0;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class q implements efm.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f296918b;

    public /* synthetic */ q(Object obj2, int i) {
        this.f296917a = i;
        this.f296918b = obj2;
    }

    @Override // efm.w
    public final void subscribe(efm.y observable) {
        switch (this.f296917a) {
            case 0:
                x xVar = (x) this.f296918b;
                Intrinsics.checkNotNullParameter(observable, "observable");
                observable.onNext(new Data(xVar.f.get("top_level"), null, true, 2, null));
                observable.onComplete();
                break;
            default:
                xra.j jVar = (xra.j) this.f296918b;
                Intrinsics.checkNotNullParameter(observable, "it");
                List list = (List) jVar.f308319c.get("RECENTS_MEMORY_CACHE_KEY");
                if (list != null) {
                    observable.onNext(list);
                }
                observable.onComplete();
                break;
        }
    }
}
