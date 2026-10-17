package zej;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig;
import dej.m;
import dfj.z0;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import skm.p0;
import te0.w;
import zc0.b0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f321679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f321680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f321681c;
    public final z0 d;
    public final d4m.a e;
    public final d4m.a f;

    public c(gte.a featureToggleInteractor, d4m.a esimCoreInteractorLazy, d4m.a esimHomeFlowCommandProviderLazy, z0 internalDeepLinkInteractor, d4m.a esimFeatureAvailabilityInteractorLazy, d4m.a esimNotSupportedPromptCommandProviderLazy) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(esimCoreInteractorLazy, "esimCoreInteractorLazy");
        Intrinsics.checkNotNullParameter(esimHomeFlowCommandProviderLazy, "esimHomeFlowCommandProviderLazy");
        Intrinsics.checkNotNullParameter(internalDeepLinkInteractor, "internalDeepLinkInteractor");
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractorLazy, "esimFeatureAvailabilityInteractorLazy");
        Intrinsics.checkNotNullParameter(esimNotSupportedPromptCommandProviderLazy, "esimNotSupportedPromptCommandProviderLazy");
        this.f321679a = featureToggleInteractor;
        this.f321680b = esimCoreInteractorLazy;
        this.f321681c = esimHomeFlowCommandProviderLazy;
        this.d = internalDeepLinkInteractor;
        this.e = esimFeatureAvailabilityInteractorLazy;
        this.f = esimNotSupportedPromptCommandProviderLazy;
    }

    public static EsimFeatureConfig.GetPlanDestination c(c cVar, String str, String str2, EsimGetPlanLaunchMode esimGetPlanLaunchMode, int i) {
        m mVar;
        m mVar2;
        String str3 = null;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        EsimGetPlanLaunchMode esimGetPlanLaunchMode2 = (i & 4) != 0 ? null : esimGetPlanLaunchMode;
        if (Intrinsics.f(str2, "DATA_PLAN")) {
            mVar2 = m.DATA_PLAN;
        } else {
            if (!Intrinsics.f(str2, "MOBILE_PLAN")) {
                mVar = null;
                if (str != null && str.length() != 0) {
                    str3 = str;
                }
                return new EsimFeatureConfig.GetPlanDestination(str3, mVar, esimGetPlanLaunchMode2, null, 8);
            }
            mVar2 = m.MOBILE_PLAN;
        }
        mVar = mVar2;
        if (str != null) {
            str3 = str;
        }
        return new EsimFeatureConfig.GetPlanDestination(str3, mVar, esimGetPlanLaunchMode2, null, 8);
    }

    @Override // xii.b
    public final Set a() {
        String[] elements = {"esim", "esim/instructions/installation", "esim/instructions/activation", "esim/instructions/reset-network-selection", "esim/show-instructions", "esim/connectivity-troubleshooting", "esim/refund", "esim/gifting", "esim/gifting/sharing", "esim/getplan", "esim/getplan/{codeCoverage}", "esim/install", "esim/start-porting-in", "esim/confirm-transfer", "esim/plan-change", "esim/plan-upgrade", "esim/subscription", "esim/submit-portability-form", "esim/cancel-portability-form", "esim/portability-form/{formId}"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    public final ParcelableDestination b(ytb.b bVar) {
        boolean z = Boolean.parseBoolean(bVar.e("showArticle"));
        ZoomTransitionAnimation.Default defaultA = bVar.a();
        p0 p0Var = p0.f264001a;
        int i = 1;
        Object objE = new z(w.o0(elm.f.f127540b, new b(this, z, defaultA, null)).t(3L, TimeUnit.SECONDS), i, new b0(defaultA, 21), null).e();
        Intrinsics.checkNotNullExpressionValue(objE, "blockingGet(...)");
        return (ParcelableDestination) objE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0248, code lost:
    
        if (r1.equals("start-porting-in") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0255, code lost:
    
        if (((dfj.a1) r7).a() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025c, code lost:
    
        return b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c3, code lost:
    
        if (r1.equals("install") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        if (r1.equals("portability-form") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        if (r1.equals("cancel-portability-form") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        if (r1.equals("submit-portability-form") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        if (r1.equals("confirm-transfer") == false) goto L124;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xii.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.kompot.common.ParcelableDestination e(lg0.e r21) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zej.c.e(lg0.e):com.revolut.kompot.common.ParcelableDestination");
    }
}
