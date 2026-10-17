package uej;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.retail.feature.esim.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import go.g;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import pkm.e;
import qf1.m;
import vkm.q;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements mf1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efj.a f279458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gfj.a f279459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fej.b f279460c;
    public final gte.a d;

    public c(efj.a esimAvailabilityResolver, gfj.a esimActiveSubscriptionsInteractor, fej.b esimHomeFlowCommandProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(esimAvailabilityResolver, "esimAvailabilityResolver");
        Intrinsics.checkNotNullParameter(esimActiveSubscriptionsInteractor, "esimActiveSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimHomeFlowCommandProvider, "esimHomeFlowCommandProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f279458a = esimAvailabilityResolver;
        this.f279459b = esimActiveSubscriptionsInteractor;
        this.f279460c = esimHomeFlowCommandProvider;
        this.d = featureToggleInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        return new g(zi0.c.P(new m(new TextLocalisedClause(R$string.p4u_product_esim_title, null, null, 14), new TextLocalisedClause(R$string.p4u_product_esim_description, null, null, 14), new TextLocalisedClause(R$string.p4u_product_esim_cta, null, null, 14), R$drawable.uikit_icn_24_sim_card, null, new qf1.a(new CdnImage("esim", "mobile/cross_sell/products_for_you", null, null, null, null, Constants.TAG_FC_SPEED_MODE)), null, SyslogConstants.LOG_LOCAL6), false, null, 3), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mf1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof uej.a
            if (r0 == 0) goto L13
            r0 = r5
            uej.a r0 = (uej.a) r0
            int r1 = r0.f279456w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f279456w = r1
            goto L1a
        L13:
            uej.a r0 = new uej.a
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f279456w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            r0.f279456w = r3
            fej.b r5 = r4.f279460c
            ifj.f r5 = (ifj.f) r5
            r2 = 0
            java.lang.Object r5 = r5.d(r3, r2, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            aii.u r5 = (aii.u) r5
            of1.d r0 = new of1.d
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uej.c.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        if (((d) this.d).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c) && this.f279458a.a()) {
            hy9.b bVar = new hy9.b(zi0.c.w(gfj.a.a(this.f279459b, null, 3)), 4);
            Boolean bool = Boolean.FALSE;
            b.Companion companion = kotlin.time.b.INSTANCE;
            return q.q(zi0.c.M(bVar, bool, kotlin.time.c.g(5, e.SECONDS), "P4U:EsimAvailability"));
        }
        return new g(Boolean.FALSE, 2);
    }
}
