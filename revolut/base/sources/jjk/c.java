package jjk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.html_viewer.api.declaration.HtmlDocumentDescriptor;
import com.revolut.feature.html_viewer.api.declaration.HtmlViewerDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import hha.f;
import hha.g;
import hha.z;
import java.util.Iterator;
import jgk.v;
import kotlin.jvm.internal.Intrinsics;
import wik.q;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f175008a;

    public c(q pricingPlansTermsInteractor, d pricingPlanTermsWebViewTitleProvider) {
        Intrinsics.checkNotNullParameter(pricingPlansTermsInteractor, "pricingPlansTermsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanTermsWebViewTitleProvider, "pricingPlanTermsWebViewTitleProvider");
        this.f175008a = pricingPlansTermsInteractor;
    }

    public static FeatureCommand b(TextLocalisedClause textLocalisedClause, String str) {
        return u0.f(new HtmlViewerDestination(new HtmlViewerDestination.InputData(new HtmlDocumentDescriptor.TermsWebDocumentDescriptor(str, true), textLocalisedClause)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof jjk.a
            if (r0 == 0) goto L13
            r0 = r7
            jjk.a r0 = (jjk.a) r0
            int r1 = r0.f175005w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175005w = r1
            goto L18
        L13:
            jjk.a r0 = new jjk.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f175005w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            wik.q r7 = r6.f175008a
            ang.f r7 = r7.f297931b
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            wgk.f r2 = new wgk.f
            r4 = 16
            r2.<init>(r4)
            wf6.o r4 = new wf6.o
            r5 = 13
            r4.<init>(r5, r2)
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f175005w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            java.lang.String r7 = (java.lang.String) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_upgrade_info_terms_and_conditions_premium
            r2 = 14
            r3 = 0
            r0.<init>(r1, r3, r3, r2)
            com.revolut.retail.core.navigation.FeatureCommand r7 = b(r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jjk.c.a(gim.c):java.lang.Object");
    }

    public final FeatureCommand c(hha.d plan) {
        Object next;
        String str;
        f fVar;
        Intrinsics.checkNotNullParameter(plan, "plan");
        Iterator it8 = plan.f152291h.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((g) next).e != null) {
                break;
            }
        }
        g gVar = (g) next;
        if (gVar == null || (fVar = gVar.e) == null || (str = fVar.e) == null) {
            z zVarQ = cp5.c.q(plan);
            str = zVarQ != null ? zVarQ.f152377c : null;
        }
        if (str == null) {
            return null;
        }
        return b(d.a(plan), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(hha.d r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof jjk.b
            if (r0 == 0) goto L13
            r0 = r8
            jjk.b r0 = (jjk.b) r0
            int r1 = r0.f175007x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175007x = r1
            goto L18
        L13:
            jjk.b r0 = new jjk.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f175007x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            hha.d r7 = r0.u
            yhm.o.b(r8)
            goto L5e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            wik.q r8 = r6.f175008a
            pfm.z r8 = r8.a()
            wgk.f r2 = new wgk.f
            r4 = 14
            r2.<init>(r4)
            wf6.o r4 = new wf6.o
            r5 = 14
            r4.<init>(r5, r2)
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r8, r4, r5)
            java.lang.String r8 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
            r0.u = r7
            r0.f175007x = r3
            java.lang.Object r8 = nim.a.b(r2, r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            java.lang.String r8 = (java.lang.String) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = jjk.d.a(r7)
            com.revolut.retail.core.navigation.FeatureCommand r7 = b(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jjk.c.d(hha.d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
