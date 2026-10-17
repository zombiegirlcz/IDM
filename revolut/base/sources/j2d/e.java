package j2d;

import a08.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import i2i.d0;
import ipa.j;
import ipa.k;
import is6.t;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import te0.w;
import ufm.i;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efd.a f170838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfm.c f170839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f170840c;
    public final q06.d d;

    public e(efd.a interactor, lfm.c compositeDisposable, xoj.a featuresInteractor, q06.d deeplinkParser) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f170838a = interactor;
        this.f170839b = compositeDisposable;
        this.f170840c = featuresInteractor;
        this.d = deeplinkParser;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        jf0.c cVarD;
        Collection collectionB;
        Intrinsics.checkNotNullParameter(message, "message");
        String strE = k.e(message);
        if (strE != null && (cVarD = ((s06.c) this.d).d(strE)) != null) {
            String strA = cVarD.a();
            String strG = cVarD.g();
            if (Intrinsics.f(strA, "alerts")) {
                collectionB = b.a(cVarD);
            } else if (Intrinsics.f(strA, "rate-alerts")) {
                y1d.b.Companion.getClass();
                FavouritesAssetTypeKey[] elements = {y1d.a.f310358b, y1d.a.f310359c, y1d.a.d};
                Intrinsics.checkNotNullParameter(elements, "elements");
                collectionB = kotlin.collections.d.y0(elements);
            } else if (Intrinsics.f(strA, "trading") && Intrinsics.f(strG, "stocks")) {
                y1d.b.Companion.getClass();
                collectionB = y0.b(y1d.a.e);
            } else {
                collectionB = h0.f322473a;
            }
            if (!collectionB.isEmpty()) {
                i iVar = new i(((cpj.b) this.f170840c).e(yoj.c.FAVOURITES, yoj.d.DISABLED), new ivb.i(new j1.e(11), 19), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                pfm.a aVar = new pfm.a(iVar, new ivb.i(new t(this, collectionB, 25), 18), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                pfm.a aVar2 = new pfm.a(ue0.e.v(aVar), new f4h.a(new d0(new BreadcrumbException(), 28)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                h hVarW = aVar2.w(new s(19, d.f170837a), c.f170836a);
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                w.j0(this.f170839b, hVarW);
            }
        }
        return false;
    }
}
