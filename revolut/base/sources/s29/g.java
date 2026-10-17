package s29;

import efm.d0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import mic.a0;
import org.jetbrains.annotations.NotNull;
import q06.k;
import sri.m;
import ufm.i;
import wp5.y;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements jf0.d, k {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f259279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u29.g f259280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h4g.g f259281c;

    public g(m navigator, u29.g lifestyleTabAvailabilityInteractor, h4g.g shopsFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(lifestyleTabAvailabilityInteractor, "lifestyleTabAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        this.f259279a = navigator;
        this.f259280b = lifestyleTabAvailabilityInteractor;
        this.f259281c = shopsFeatureAvailabilityInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "lifestyle-prompts");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s29.g.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        rv6.e eVarB = this.f259280b.b();
        r map = this.f259281c.c().map(new a0(11, d.f259275a));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        d0 d0VarFirstOrError = rd0.e.c(nim.a.v(zi0.c.w(u0.m(eVarB, rd0.e.b(map))), new pud.b(deeplink, this, z, 11)), kotlin.coroutines.g.f186406a).firstOrError();
        s08.g gVar = new s08.g(17, new s1c.a(13));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
