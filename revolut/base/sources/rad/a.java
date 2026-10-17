package rad;

import com.revolut.feature.shared.network_authentication.impl.network.TokenService;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import pad.c;
import pad.d;
import r7i.r;
import te0.w;
import ufm.i;
import ufm.n;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements jmi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f252812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f252813b;

    public a(d4m.a retrofit, d4m.a service) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f252812a = retrofit;
        this.f252813b = service;
    }

    public final n a(String userId, String refreshCode) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(refreshCode, "refreshCode");
        d0<d> d0VarRefreshToken = ((TokenService) this.f252813b.get()).refreshToken(new c(userId, refreshCode));
        r83.d dVar = new r83.d(19, new r(17));
        d0VarRefreshToken.getClass();
        i iVar = new i(d0VarRefreshToken, dVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }
}
