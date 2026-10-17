package vha;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.pro.accounts.impl.R$string;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public final class y0 implements mf1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.a f289455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f289456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sha.c f289457c;
    public final gte.a d;

    public y0(gr6.a freelancerAccountDetailsInteractor, s proAccountsInteractor, sha.c proOnboardingCommandFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(proAccountsInteractor, "proAccountsInteractor");
        Intrinsics.checkNotNullParameter(proOnboardingCommandFactory, "proOnboardingCommandFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f289455a = freelancerAccountDetailsInteractor;
        this.f289456b = proAccountsInteractor;
        this.f289457c = proOnboardingCommandFactory;
        this.d = featureToggleInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        return new go.g(zi0.c.P(new qf1.m(new TextLocalisedClause(R$string.freelancer_add_new_widget_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_add_new_widget_subtitle, null, null, 14), new TextLocalisedClause(R$string.freelancer_add_new_widget_action, null, null, 14), R$drawable.uikit_icn_24_services, null, new qf1.a(new ColorImage(new ColorImage.ColorInteger(-16777216), null)), null, SyslogConstants.LOG_LOCAL6), false, null, 3), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mf1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof vha.w0
            if (r0 == 0) goto L13
            r0 = r5
            vha.w0 r0 = (vha.w0) r0
            int r1 = r0.f289451w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289451w = r1
            goto L1a
        L13:
            vha.w0 r0 = new vha.w0
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289451w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            r0.f289451w = r3
            sha.c r5 = r4.f289457c
            zha.d r5 = (zha.d) r5
            java.lang.Object r5 = r5.b(r3, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.util.Optional r5 = (java.util.Optional) r5
            boolean r0 = r5.isPresent()
            if (r0 == 0) goto L5a
            of1.e r0 = new of1.e
            java.lang.Object r5 = r5.get()
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            r0.<init>(r5)
            return r0
        L5a:
            of1.d r5 = new of1.d
            com.revolut.feature.pockets.api.ui.add_new.OpenNewPocketDestination r0 = new com.revolut.feature.pockets.api.ui.add_new.OpenNewPocketDestination
            io3.l r1 = io3.l.MERCHANT
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r0.<init>(r1, r2, r3)
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vha.y0.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        return ((jte.d) this.d).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c) ? new go.g(Boolean.FALSE, 2) : vkm.q.Q(((et6.l0) this.f289456b.f289427a).m(), new vdl.c1((Continuation) null, this, 7));
    }
}
