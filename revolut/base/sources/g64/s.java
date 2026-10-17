package g64;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.e f140861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q89.e f140862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nw3.d f140863c;
    public final ii4.o d;
    public final ffk.t e;
    public final d4m.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f140864g;

    public s(hw3.e creditApplicationConfigInteractor, q89.e onboardingInteractor, nw3.d cardOrderingInteractor, ii4.o spinnerInteractor, ffk.t pricingPlanInteractor, d4m.a creditApplicationRouter, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(cardOrderingInteractor, "cardOrderingInteractor");
        Intrinsics.checkNotNullParameter(spinnerInteractor, "spinnerInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationRouter, "creditApplicationRouter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f140861a = creditApplicationConfigInteractor;
        this.f140862b = onboardingInteractor;
        this.f140863c = cardOrderingInteractor;
        this.d = spinnerInteractor;
        this.e = pricingPlanInteractor;
        this.f = creditApplicationRouter;
        this.f140864g = featureToggleInteractor;
    }

    public static String d(PluginPayload pluginPayload) {
        Object obj2;
        String str;
        it3.d dVar = pluginPayload.f66247a;
        hs3.v vVar = dVar.e;
        if (!(vVar instanceof hs3.q)) {
            List list = dVar.f;
            obj2 = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (next instanceof hs3.q) {
                        obj2 = next;
                        break;
                    }
                }
                obj2 = (hs3.v) obj2;
            }
        } else {
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CardOrderingMetadata");
            }
            obj2 = (hs3.q) vVar;
        }
        hs3.q qVar = (hs3.q) obj2;
        return (qVar == null || (str = qVar.e) == null) ? pluginPayload.f66247a.f168330m : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.credit.application.models.plugins.PluginPayload r31, h93.j0 r32, h93.l0 r33, boolean r34, gim.c r35) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g64.s.a(com.revolut.feature.credit.application.models.plugins.PluginPayload, h93.j0, h93.l0, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
    
        if (r14 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.credit.application.models.plugins.PluginPayload r12, boolean r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g64.s.b(com.revolut.feature.credit.application.models.plugins.PluginPayload, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (r0 == r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0144, code lost:
    
        if (r0 == r7) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.credit.application.models.plugins.PluginPayload r14, h93.l0 r15, boolean r16, gim.c r17) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g64.s.c(com.revolut.feature.credit.application.models.plugins.PluginPayload, h93.l0, boolean, gim.c):java.lang.Object");
    }
}
