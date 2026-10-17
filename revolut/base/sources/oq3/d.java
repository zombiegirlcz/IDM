package oq3;

import efm.d0;
import ft3.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ood.o0;
import op0.o3;
import skm.p0;
import te0.w;
import xq3.t;
import xr3.u;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f227707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f227708c;
    public final /* synthetic */ i d;

    public /* synthetic */ d(i iVar, m mVar, boolean z) {
        this.f227706a = 0;
        this.d = iVar;
        this.f227707b = mVar;
        this.f227708c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227706a) {
            case 0:
                Boolean hasActiveCreditCardLimitIncreaseApplication = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(hasActiveCreditCardLimitIncreaseApplication, "hasActiveCreditCardLimitIncreaseApplication");
                i iVar = this.d;
                boolean zF = Intrinsics.f(iVar.f227716c.d, t0.f137874a);
                m mVar = this.f227707b;
                boolean z = this.f227708c;
                if (zF) {
                    return new pfm.a(mVar.c(), new o3(29, new d(mVar, z, iVar, 1)), 4).D(Boolean.TRUE);
                }
                pfm.h hVarD = mVar.d(new ft3.n(null, 3), z, iVar);
                t tVar = mVar.f227724c;
                if (hasActiveCreditCardLimitIncreaseApplication.booleanValue()) {
                    return hVarD.D(Boolean.TRUE);
                }
                sfm.b bVarG = ((u) tVar.f308097a).e.g(Unit.f186387a, true).g(tVar.b());
                Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                return m70.a.g(ue0.e.p(bVarG, h0.f322473a), null, new e(1), 1).map(new f(0, new o0(22))).switchMapSingle(new f(1, new ood.k(mVar, hVarD, 17))).firstOrError();
            case 1:
                String facilityId = (String) obj2;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return this.f227707b.d(new ft3.n(facilityId, 2), this.f227708c, this.d);
            case 2:
                Boolean isCreditCardLimitIncreaseEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isCreditCardLimitIncreaseEnabled, "isCreditCardLimitIncreaseEnabled");
                if (!isCreditCardLimitIncreaseEnabled.booleanValue()) {
                    return d0.m(Boolean.FALSE);
                }
                kotlinx.coroutines.d dVar = p0.f264003c;
                m mVar2 = this.f227707b;
                return new ufm.i(w.o0(dVar, new omg.e(mVar2, null, 7)), new o3(27, new d(this.d, mVar2, this.f227708c)), 0);
            default:
                ft3.t product = (ft3.t) obj2;
                Intrinsics.checkNotNullParameter(product, "product");
                return this.f227707b.d(product, this.f227708c, this.d);
        }
    }

    public /* synthetic */ d(m mVar, i iVar, boolean z) {
        this.f227706a = 2;
        this.f227707b = mVar;
        this.d = iVar;
        this.f227708c = z;
    }

    public /* synthetic */ d(m mVar, boolean z, i iVar, int i) {
        this.f227706a = i;
        this.f227707b = mVar;
        this.f227708c = z;
        this.d = iVar;
    }
}
