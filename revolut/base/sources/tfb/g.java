package tfb;

import ahe.l;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountAvailability;
import com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase3;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import qf1.m;
import tcg.a0;
import vkm.q;
import xfb.p;
import xfb.s;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements mf1.c {

    @NotNull
    public static final b Companion = new b();
    public static final qf1.a f = new qf1.a(new CdnImage("salary", "mobile/cross_sell/products_for_you", null, null, null, null, Constants.TAG_FC_SPEED_MODE));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f270287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f270288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f270289c;
    public final Lazy d;
    public final Lazy e;

    public g(s salaryHubInteractor, gte.a featureToggleInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(salaryHubInteractor, "salaryHubInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f270287a = salaryHubInteractor;
        this.f270288b = featureToggleInteractor;
        this.f270289c = userInteractor;
        final int i = 0;
        this.d = yhm.j.b(new Function0(this) { // from class: tfb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f270282b;

            {
                this.f270282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(((jte.d) this.f270282b.f270288b).c(SalaryAccountApi$Toggles$SalaryAccountAvailability.f82945c));
                    default:
                        return ((jte.d) this.f270282b.f270288b).c(SalaryAccountApi$Toggles$SalaryAccountPhase3.f82947c) ? p.V3 : p.V2;
                }
            }
        });
        final int i2 = 1;
        this.e = yhm.j.b(new Function0(this) { // from class: tfb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f270282b;

            {
                this.f270282b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(((jte.d) this.f270282b.f270288b).c(SalaryAccountApi$Toggles$SalaryAccountAvailability.f82945c));
                    default:
                        return ((jte.d) this.f270282b.f270288b).c(SalaryAccountApi$Toggles$SalaryAccountPhase3.f82947c) ? p.V3 : p.V2;
                }
            }
        });
    }

    public static m b() {
        return new m(new TextLocalisedClause(R$string.p4u_product_salary_no_draw_title, null, null, 14), new TextLocalisedClause(R$string.p4u_product_salary_no_draw_description, null, null, 14), new TextLocalisedClause(R$string.p4u_product_salary_no_draw_cta, null, null, 14), R$drawable.uikit_icn_24_salary, null, f, null, SyslogConstants.LOG_LOCAL6);
    }

    public static m d(dj0.d dVar) {
        return new m(new TextLocalisedClause(R$string.p4u_product_salary_draw_title, u.c(new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 63), null, null, 12)), null, 12), new TextLocalisedClause(R$string.p4u_product_salary_draw_description, null, null, 14), new TextLocalisedClause(R$string.p4u_product_salary_draw_cta, null, null, 14), R$drawable.uikit_icn_24_salary, null, f, null, SyslogConstants.LOG_LOCAL6);
    }

    @Override // mf1.c
    public final Flow a() {
        boolean zBooleanValue = ((Boolean) this.d.getValue()).booleanValue();
        s sVar = this.f270287a;
        return zBooleanValue ? q.q(nim.a.v(zi0.c.w(sVar.b((p) this.e.getValue())), new a0(this, 27))) : q.q(nim.a.v(new qij.s(sVar.a(w4l.h.f294642c), 27), new a0(this, 28)));
    }

    @Override // mf1.c
    public final Object c(Continuation continuation) {
        return ((Boolean) this.d.getValue()).booleanValue() ? f((gim.c) continuation) : e((gim.c) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof tfb.c
            if (r0 == 0) goto L13
            r0 = r7
            tfb.c r0 = (tfb.c) r0
            int r1 = r0.f270283w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f270283w = r1
            goto L18
        L13:
            tfb.c r0 = new tfb.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f270283w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L4f
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            xfb.s r7 = r6.f270287a
            w4l.h r2 = w4l.h.f294642c
            vkm.d r7 = r7.a(r2)
            tc6.b r2 = new tc6.b
            r5 = 19
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            r0.f270283w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            mgb.n r7 = (mgb.n) r7
            boolean r0 = r7 instanceof mgb.l
            if (r0 == 0) goto L58
            mgb.l r7 = (mgb.l) r7
            goto L59
        L58:
            r7 = r4
        L59:
            if (r7 == 0) goto L63
            mgb.k r7 = r7.f205252a
            mgb.f r7 = r7.d
            if (r7 == 0) goto L63
            java.lang.String r4 = r7.f205236a
        L63:
            if (r4 == 0) goto L6b
            of1.c r7 = new of1.c
            r7.<init>(r4)
            return r7
        L6b:
            of1.d r7 = new of1.d
            com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub r0 = com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub.f82951a
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tfb.g.e(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof tfb.d
            if (r0 == 0) goto L13
            r0 = r7
            tfb.d r0 = (tfb.d) r0
            int r1 = r0.f270284w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f270284w = r1
            goto L18
        L13:
            tfb.d r0 = new tfb.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f270284w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L59
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            kotlin.Lazy r7 = r6.e
            java.lang.Object r7 = r7.getValue()
            xfb.p r7 = (xfb.p) r7
            xfb.s r2 = r6.f270287a
            akg.n r7 = r2.b(r7)
            zfd.e r7 = zi0.c.w(r7)
            tc6.b r2 = new tc6.b
            r5 = 20
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r3, r2, r4)
            r0.f270284w = r4
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            xfb.o r7 = (xfb.o) r7
            xfb.n r7 = r7.d
            if (r7 == 0) goto L61
            java.lang.String r3 = r7.f305221a
        L61:
            if (r3 == 0) goto L69
            of1.c r7 = new of1.c
            r7.<init>(r3)
            return r7
        L69:
            of1.d r7 = new of1.d
            com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub r0 = com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub.f82951a
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tfb.g.f(gim.c):java.lang.Object");
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        if (!((jte.d) this.f270288b).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c)) {
            return new go.g(Boolean.FALSE, 2);
        }
        boolean zBooleanValue = ((Boolean) this.d.getValue()).booleanValue();
        s sVar = this.f270287a;
        return zBooleanValue ? q.q(new hy9.b(zi0.c.w(sVar.b((p) this.e.getValue())), 3)) : q.q(new l(u0.m(q.q(nim.a.v(new qij.s(this.f270289c.j(w4l.j.f294644c), 27), new a0(29))), new qij.s(sVar.a(w4l.h.f294642c), 27)), 18));
    }
}
