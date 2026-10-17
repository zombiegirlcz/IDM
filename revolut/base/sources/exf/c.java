package exf;

import au6.z0;
import ayf.q;
import ayf.r;
import efm.d0;
import fxf.d;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import te0.w;
import ue0.e;
import ufm.i;
import ufm.p;

/* JADX INFO: loaded from: classes9.dex */
public interface c {

    @NotNull
    public static final b Companion = b.f130426a;

    static z a(c cVar, fxf.a requiredPermission, int i) {
        d0 d0VarI0;
        if ((i & 1) != 0) {
            requiredPermission = fxf.a.ANY;
        }
        r rVar = (r) cVar;
        w39.b bVar = rVar.f11181b;
        y80.a aVar = rVar.f11180a;
        Intrinsics.checkNotNullParameter(requiredPermission, "requiredPermission");
        int i2 = q.f11179a[requiredPermission.ordinal()];
        if (i2 == 1) {
            ufm.c cVarE = aVar.e("android.permission.ACCESS_FINE_LOCATION");
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            d0VarI0 = w.I0(cVarE, bVarM, ((z39.b) bVar).f319221b.f());
        } else if (i2 == 2) {
            ufm.b bVarM2 = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            d0VarI0 = w.I0(bVarM2, aVar.e("android.permission.ACCESS_COARSE_LOCATION"), ((z39.b) bVar).f319221b.f());
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d0VarI0 = w.I0(aVar.e("android.permission.ACCESS_FINE_LOCATION"), aVar.e("android.permission.ACCESS_COARSE_LOCATION"), ((z39.b) bVar).f319221b.f());
        }
        p pVarT = new i(d0VarI0, new z0(new as9.a(rVar, requiredPermission, 14), 23), 0).t(5000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
        return e.F(pVarT, d.b.f138818a);
    }
}
