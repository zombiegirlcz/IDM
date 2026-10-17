package kz1;

import a09.a0;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.payid.api.navigation.PayIdVerifyOwnerShipDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pfm.z;
import sri.m;
import wp5.y;
import xw1.l;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f191052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oz1.a f191053b;

    public i(m navigator, oz1.a aliasVerificationStateInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(aliasVerificationStateInteractor, "aliasVerificationStateInteractor");
        this.f191052a = navigator;
        this.f191053b = aliasVerificationStateInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "apm-verify-ownership");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        String str = (String) cVar.d.get("token");
        Alias alias = (Alias) this.f191053b.f231100a.get();
        if (str == null || d0.W(str) || alias == null) {
            return null;
        }
        return new q06.h(new PayIdVerifyOwnerShipDestination(alias, str), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.d.get("token");
        Alias alias = (Alias) this.f191053b.f231100a.get();
        if (str == null || d0.W(str) || alias == null) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        z zVarD = new pfm.h(new a0(str, 28, alias, this), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
