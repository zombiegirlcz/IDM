package zwj;

import bjl.f;
import cjl.o;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.sso.api.email.change.RevolutSsoChangeEmailDeeplinkData;
import com.revolut.sso.api.email.change.RevolutSsoChangeEmailFlowDestination;
import com.revolut.sso.api.models.SsoChangeClaimMode;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import wkm.y;
import xil.i;
import xil.j;
import xil.k;
import xil.l;
import xil.m;
import xjl.h;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements xii.b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f325968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f325969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r10.a f325970c;
    public final Set d;

    public d(gte.a featureToggleInteractor, f otpContentInteractor, h revolutSsoClientDeeplinkRestoreManager, r10.a emailVerificationOtpDeeplinkResolver) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(otpContentInteractor, "otpContentInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoClientDeeplinkRestoreManager, "revolutSsoClientDeeplinkRestoreManager");
        Intrinsics.checkNotNullParameter(emailVerificationOtpDeeplinkResolver, "emailVerificationOtpDeeplinkResolver");
        this.f325968a = otpContentInteractor;
        this.f325969b = revolutSsoClientDeeplinkRestoreManager;
        this.f325970c = emailVerificationOtpDeeplinkResolver;
        this.d = y0.b("email-authenticate/{code}");
    }

    @Override // xii.b
    public final Set a() {
        return this.d;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        SsoChangeClaimMode multiple;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String code = (String) deeplink.f195040b.get("code");
        if (code == null) {
            String name = d.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, name, "Deeplink doesn't have required `code` path parameter", null, h0Var);
            return null;
        }
        if (Intrinsics.f(g.a("scope", deeplink.f195041c), "post-onboarding-email-verification")) {
            Intrinsics.checkNotNullParameter(code, "code");
            if (!d0.W(code)) {
                r10.a aVar = this.f325970c;
                if (((xai.a) aVar.f250811a).f303893c.get() <= 0) {
                    return ((dbi.d) aVar.f250812b).a(code);
                }
            }
        } else {
            m mVarA = this.f325969b.a();
            if (mVarA instanceof xil.a) {
                xil.a aVar2 = (xil.a) mVarA;
                if (((Number) ((y) ((xjl.e) this.f325968a).f306555b.f207511c.l()).getValue()).intValue() <= 0) {
                    xil.d mode = aVar2.getMode();
                    if (mode instanceof xil.b) {
                        multiple = SsoChangeClaimMode.Current.f105982a;
                    } else {
                        if (!(mode instanceof xil.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        multiple = new SsoChangeClaimMode.Multiple(((xil.c) mode).getAccountIdChangeInitiated());
                    }
                    return new RevolutSsoChangeEmailFlowDestination(new RevolutSsoChangeEmailFlowDestination.InputData(new RevolutSsoChangeEmailDeeplinkData(aVar2.getEmail(), code), multiple, o.SHOT));
                }
            } else if (!(mVarA instanceof xil.e) && !(mVarA instanceof xil.f) && !(mVarA instanceof xil.g) && !(mVarA instanceof xil.h) && !(mVarA instanceof i) && !(mVarA instanceof j) && !(mVarA instanceof k) && !(mVarA instanceof l) && mVarA != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
