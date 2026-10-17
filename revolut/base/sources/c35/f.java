package c35;

import a35.i;
import bzg.t;
import e2j.j;
import k25.u;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import xq3.w;
import y25.h;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends b35.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20890a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f20891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f20892c;

    public f(w entryPointsInteractor, k25.a productContract) {
        Intrinsics.checkNotNullParameter(entryPointsInteractor, "entryPointsInteractor");
        Intrinsics.checkNotNullParameter(productContract, "productContract");
        this.f20891b = entryPointsInteractor;
        this.f20892c = productContract;
    }

    @Override // mf1.a
    public final Flow a() {
        switch (this.f20890a) {
            case 0:
                return b35.d.d(boh.f.e(((u) ((k25.a) this.f20892c)).s(), new t(this, 17)));
            case 1:
                return b35.d.d(boh.f.e(((x25.c) ((x25.a) this.f20892c)).o(), new j(this, 4)));
            default:
                return b35.d.d(boh.f.e(((h) ((y25.a) this.f20892c)).k(w4l.h.f294642c), new f0m.c(this, 5)));
        }
    }

    @Override // b35.d
    public final fs3.b c() {
        switch (this.f20890a) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    public f(w entryPointsInteractor, x25.a productContract) {
        Intrinsics.checkNotNullParameter(entryPointsInteractor, "entryPointsInteractor");
        Intrinsics.checkNotNullParameter(productContract, "productContract");
        this.f20891b = entryPointsInteractor;
        this.f20892c = productContract;
    }

    public f(w entryPointsInteractor, y25.a productContract) {
        Intrinsics.checkNotNullParameter(entryPointsInteractor, "entryPointsInteractor");
        Intrinsics.checkNotNullParameter(productContract, "productContract");
        this.f20891b = entryPointsInteractor;
        this.f20892c = productContract;
    }
}
