package wll;

import a5k.n;
import akl.l;
import bjl.o0;
import cjl.s;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.api.models.SimBindingEvidence;
import com.revolut.sso.impl.domain.models.Claim;
import d9.e1;
import gkl.m;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kql.g;
import kql.h;
import uv1.c0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends hd.e {
    public final rql.a d;
    public final o0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(gu2.e captchaViewControllerExtension, l claimsRepository, rql.a reauthenticationRepository, o0 revolutSsoAuthErrorHandler, mni.a otpDispatcher) {
        super(captchaViewControllerExtension, claimsRepository, otpDispatcher);
        Intrinsics.checkNotNullParameter(captchaViewControllerExtension, "captchaViewControllerExtension");
        Intrinsics.checkNotNullParameter(claimsRepository, "claimsRepository");
        Intrinsics.checkNotNullParameter(reauthenticationRepository, "reauthenticationRepository");
        Intrinsics.checkNotNullParameter(revolutSsoAuthErrorHandler, "revolutSsoAuthErrorHandler");
        Intrinsics.checkNotNullParameter(otpDispatcher, "otpDispatcher");
        this.d = reauthenticationRepository;
        this.e = revolutSsoAuthErrorHandler;
    }

    @Override // hd.e
    public final Object h(h hVar, String str, SimBindingEvidence simBindingEvidence, g gVar) {
        return ue8.c.g0(hVar, new d(this, str, simBindingEvidence, null, 1), gVar);
    }

    public final Object k(oki.h hVar, String str, Evidence evidence, gim.c cVar) {
        return ue8.c.f0(hVar, new d(this, str, evidence, null, 0), cVar);
    }

    public final Object l(oki.h hVar, String str, Claim claim, Set set, gim.c cVar) {
        return ue8.c.f0(hVar, new n(hVar, this, str, claim, set, (Continuation) null, 16), cVar);
    }

    public final Object m(oki.h hVar, String str, m mVar, Set set, Function0 function0, Function0 function02, Continuation continuation) {
        this.d.clear();
        Object objF0 = e1.f0(hVar, s.GLOBAL, this.e, new c0(12, this, str, mVar, set, (Continuation) null), function02, function0, (gim.c) continuation);
        return objF0 == fim.a.COROUTINE_SUSPENDED ? objF0 : Unit.f186387a;
    }
}
