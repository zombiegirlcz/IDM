package or9;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import mq9.f;
import oqk.c;
import or4.h;
import ue0.e;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c61.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f228079a;

    public a(f interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f228079a = interactor;
    }

    @Override // c61.a
    public final r a() {
        r rVarDistinctUntilChanged = e.H(m70.a.g(((mr9.a) this.f228079a).i(false), null, null, 3), h0.f322473a, new h(2)).switchMap(new or2.e(new c(this, 4), 4)).startWith(r0.g()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
