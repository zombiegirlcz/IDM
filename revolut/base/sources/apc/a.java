package apc;

import android.os.Parcelable;
import bpc.i;
import bpc.j;
import bpc.p;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import dmc.r;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import qmc.h;
import vc.s;
import ybl.k;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8142c;

    public /* synthetic */ a(b bVar, int i, int i2) {
        this.f8140a = i2;
        this.f8141b = bVar;
        this.f8142c = i;
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f8140a;
        int i2 = this.f8142c;
        b bVar = this.f8141b;
        int i3 = 2;
        int i5 = 1;
        switch (i) {
            case 0:
                if (i2 == 0) {
                    he2.b componentFactory = new he2.b(2);
                    Intrinsics.checkNotNullParameter(componentFactory, "componentFactory");
                    return new c(bVar);
                }
                if (i2 == 1) {
                    p96.a componentFactory2 = new p96.a(2);
                    Intrinsics.checkNotNullParameter(componentFactory2, "componentFactory");
                    d dVar = new d();
                    dVar.f8154b = e4m.b.b(new a(bVar, 0, i5));
                    dVar.f8155c = e4m.b.b(new a(bVar, i5, i5));
                    dVar.d = e4m.b.b(new a(bVar, i3, i5));
                    return dVar;
                }
                if (i2 == 2) {
                    f.Companion.getClass();
                    k9 k9Var = k9.RoboAdvisor;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
                }
                if (i2 == 3) {
                    f.Companion.getClass();
                    return null;
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                f.Companion.getClass();
                return Boolean.TRUE;
            default:
                r rVar = (r) bVar.k;
                if (i2 == 0) {
                    zoc.f fVarH = bVar.h();
                    h hVarA = ((dmc.c) bVar.f8150m).a();
                    qmc.b bVarF = rVar.f();
                    k kVarD = bVar.f8145c.d();
                    s.j(kVarD);
                    return new p(fVarH, hVarA, bVarF, kVarD);
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new j(new i(), rVar.f());
                    }
                    throw new AssertionError(i2);
                }
                nmc.d dVarD = ((dmc.a) bVar.f8148j).d();
                gte.a aVarB = ((ite.a) bVar.f8151n).b();
                s.j(aVarB);
                return new bpc.k(dVarD, aVarB);
        }
    }
}
