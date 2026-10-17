package yg6;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.external_accounts.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import y20.a1;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements mf1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y91.b f313563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f313564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f313565c;
    public final gte.a d;

    public u(y91.b accountsProductFeatureChecker, wsg.n walletInteractor, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f313563a = accountsProductFeatureChecker;
        this.f313564b = walletInteractor;
        this.f313565c = externalPocketNavigationFactory;
        this.d = featureToggleInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        return new go.g(zi0.c.P(new qf1.m(new TextLocalisedClause(R$string.open_banking_add_new_widget_title, null, null, 14), new TextLocalisedClause(R$string.open_banking_add_new_widget_subtitle, null, null, 14), new TextLocalisedClause(R$string.open_banking_add_new_widget_action, null, null, 14), R$drawable.uikit_icn_24_link, null, new qf1.a(new ColorImage(new ColorImage.ColorInteger(-16777216), null)), null, SyslogConstants.LOG_LOCAL6), false, null, 3), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mf1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof yg6.s
            if (r0 == 0) goto L13
            r0 = r15
            yg6.s r0 = (yg6.s) r0
            int r1 = r0.f313561w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f313561w = r1
            goto L1a
        L13:
            yg6.s r0 = new yg6.s
            gim.c r15 = (gim.c) r15
            r0.<init>(r14, r15)
        L1a:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f313561w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r15)
            goto L62
        L29:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L31:
            yhm.o.b(r15)
            com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$TrueLayer r4 = new com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$TrueLayer
            r12 = 0
            r13 = 16381(0x3ffd, float:2.2955E-41)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$DirectLink r5 = new com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$DirectLink
            java.lang.Integer r6 = new java.lang.Integer
            r15 = 1337(0x539, float:1.874E-42)
            r6.<init>(r15)
            r11 = 126(0x7e, float:1.77E-43)
            r5.<init>(r6, r7, r8, r9, r10, r11)
            com.revolut.feature.external_accounts.api.navigation.a r15 = r14.f313565c
            ym6.d r15 = (ym6.d) r15
            ufm.i r15 = r15.b(r4, r5, r3)
            r0.f313561w = r3
            java.lang.Object r15 = nim.a.b(r15, r0)
            if (r15 != r1) goto L62
            return r1
        L62:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
            com.revolut.retail.core.navigation.NaviCommand r15 = (com.revolut.retail.core.navigation.NaviCommand) r15
            of1.e r0 = new of1.e
            r0.<init>(r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg6.u.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        return ((jte.d) this.d).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c) ? new go.g(Boolean.FALSE, 2) : new v1(new a1(this, null, 29));
    }
}
