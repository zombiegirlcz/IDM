package dbi;

import efm.d0;
import jma.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;
import wp5.y;
import zt4.l;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements jf0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112755a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112756b;

    public c(f closeAccountNavigationHandler) {
        Intrinsics.checkNotNullParameter(closeAccountNavigationHandler, "closeAccountNavigationHandler");
        this.f112756b = closeAccountNavigationHandler;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        switch (this.f112755a) {
            case 0:
                return y.D(cVar, "deeplink", 1, "email-authenticate") && Intrinsics.f(cVar.d.get("scope"), "post-onboarding-email-verification");
            case 1:
                return y.D(cVar, "deeplink", 1, "account-terminate");
            default:
                return y.D(cVar, "deeplink", 1, "sso") && Intrinsics.f(cVar.e(2), "uae-pass");
        }
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        switch (this.f112755a) {
            case 0:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                String otp = deeplink.e(2);
                if (kotlin.text.d0.W(otp)) {
                    otp = null;
                }
                if (otp == null) {
                    ufm.b bVarM = d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                xai.a aVar = (xai.a) this.f112756b;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(otp, "otp");
                aVar.f303892b.mo3647trySendJP2dKIU(otp);
                aVar.f303891a.k(Unit.f186387a);
                ufm.b bVarM2 = d0.m(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarM2;
            case 1:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return w.o0(g.f186406a, new af3.f(this, z, (Continuation) null, 25));
            default:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return w.o0(p0.f264003c, new l(this, deeplink, null, 11));
        }
    }

    public c(xai.a emailVerificationEventEmitter) {
        Intrinsics.checkNotNullParameter(emailVerificationEventEmitter, "emailVerificationEventEmitter");
        this.f112756b = emailVerificationEventEmitter;
    }

    public c(wx8.a pendingDeeplinkInteractor) {
        Intrinsics.checkNotNullParameter(pendingDeeplinkInteractor, "pendingDeeplinkInteractor");
        this.f112756b = pendingDeeplinkInteractor;
    }
}
