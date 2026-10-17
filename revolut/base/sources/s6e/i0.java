package s6e;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import skm.p0;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f260287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfm.c f260288b;

    public i0(g6e.d subaccountInteractor, lfm.c appDisposable) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(appDisposable, "appDisposable");
        this.f260287a = subaccountInteractor;
        this.f260288b = appDisposable;
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i = c0.f260269a[ipa.k.l(message).ordinal()];
        lfm.c cVar = this.f260288b;
        if (i == 1) {
            pfm.a aVar = new pfm.a(((z) this.f260287a).y(SubaccountType.Personal.f88963a), new n1i.b(16, new ry7.j(new BreadcrumbException(), 14)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
            ofm.h hVarW = aVar.w(new o0(15, e0.f260275a), d0.f260271a);
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
            te0.w.j0(cVar, hVarW);
            return true;
        }
        if (i != 2) {
            return false;
        }
        pfm.a aVar2 = new pfm.a(pd.b.n(p0.f264002b, new h0(this, null)), new n1i.b(16, new ry7.j(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar2.w(new o0(15, g0.f260280a), f0.f260278a);
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(cVar, hVarW2);
        return false;
    }
}
