package ldb;

import com.revolut.feature.retail.reauth.impl.network.service.ReauthService;
import kotlin.jvm.internal.Intrinsics;
import kye.e;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f194053a;

    public a(nj0.a aVar) {
        this.f194053a = aVar;
    }

    public final kgm.c a() {
        nj0.d dVar = (nj0.d) this.f194053a;
        ik0.b retrofitFactory = dVar.m();
        s.j(retrofitFactory);
        ek.a converterFactory = dVar.d();
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(ReauthService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ReauthService reauthService = (ReauthService) objCreate;
        s.k(reauthService);
        return new kgm.c(new e(reauthService));
    }
}
