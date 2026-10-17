package bn2;

import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends yji.d implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ekg.g f17043c;
    public final p d;
    public final r10.d e;

    public u(ekg.g uiPersonalisationInteractor, p backgroundsInteractor, r10.d availableBackgroundsInteractor) {
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(availableBackgroundsInteractor, "availableBackgroundsInteractor");
        this.f17043c = uiPersonalisationInteractor;
        this.d = backgroundsInteractor;
        this.e = availableBackgroundsInteractor;
    }

    @Override // bn2.c
    public final Flow a(BackgroundKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return nim.a.v(this.d.g(key), new blh.y(16));
    }

    @Override // bn2.c
    public final wkm.l c(List availableScopes) {
        Intrinsics.checkNotNullParameter(availableScopes, "availableScopes");
        return vkm.q.Q(mo3.a.g(this.f17043c.c(), null, new bk6.n(17), 1), new a32.b((Continuation) null, this, availableScopes, 11));
    }

    @Override // bn2.c
    public final Object f(BackgroundKey backgroundKey, String str, qg7.p pVar) throws Throwable {
        Object objF = this.d.f(backgroundKey, str, pVar);
        return objF == fim.a.COROUTINE_SUSPENDED ? objF : Unit.f186387a;
    }
}
