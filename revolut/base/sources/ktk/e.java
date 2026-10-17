package ktk;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends jtk.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jtk.c f189565c;
    public final jtk.b d;

    public e(jtk.c delegates, jtk.b model) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f189565c = delegates;
        this.d = model;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        jtk.c cVar = this.f189565c;
        PlainTextWarningDelegate plainTextWarningDelegate = cVar.f178524a;
        ihm.f fVar = plainTextWarningDelegate.f52940c;
        ihm.f fVar2 = (ihm.f) plainTextWarningDelegate.f.getValue();
        BannerDelegate bannerDelegate = cVar.f178525b;
        r rVarMerge = r.merge(fVar, fVar2, bannerDelegate.f51699c);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        yji.d.H(this, new kge.b(rd0.e.b(rVarMerge), 21), new d(this, null, 0), 3);
        yji.d.H(this, new kge.b(rd0.e.b(bannerDelegate.f51699c), 22), new d(this, null, 1), 3);
        yji.d.H(this, new kge.b(rd0.e.b(bannerDelegate.e), 23), new d(this, null, 2), 3);
    }
}
