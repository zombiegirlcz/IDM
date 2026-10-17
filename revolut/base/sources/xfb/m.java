package xfb;

import ahe.m0;
import com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase2;
import com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase3;
import com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalarySwitchBot;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements rfb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f305218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f305219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f305220c;

    public m(gte.a featureToggleInteractor, jla.h productCatalogueInteractor, s salaryHubInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(salaryHubInteractor, "salaryHubInteractor");
        this.f305218a = featureToggleInteractor;
        this.f305219b = productCatalogueInteractor;
        this.f305220c = salaryHubInteractor;
    }

    @Override // rfb.b
    public final Object a(rfb.e eVar, Continuation continuation) {
        return vkm.q.x(h(eVar), continuation);
    }

    @Override // rfb.b
    public final Flow b(rfb.e origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return new m0(h(origin), 23);
    }

    @Override // rfb.b
    public final Enum c(Continuation continuation) {
        if (g(SalaryAccountApi$Toggles$SalaryAccountPhase3.f82947c)) {
            return f(p.V3, (gim.c) continuation);
        }
        if (g(SalaryAccountApi$Toggles$SalaryAccountPhase2.f82946c)) {
            return f(p.V2, (gim.c) continuation);
        }
        return this.f305219b.d(qfb.b.f245285a.a(), null).a() ? e((gim.c) continuation) : rfb.f.UNAVAILABLE;
    }

    @Override // rfb.b
    public final boolean d() {
        return g(SalaryAccountApi$Toggles$SalarySwitchBot.f82948c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum e(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xfb.h
            if (r0 == 0) goto L13
            r0 = r5
            xfb.h r0 = (xfb.h) r0
            int r1 = r0.f305212w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305212w = r1
            goto L18
        L13:
            xfb.h r0 = new xfb.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305212w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            xfb.p r5 = xfb.p.V2
            xfb.s r2 = r4.f305220c
            akg.n r5 = r2.b(r5)
            zfd.e r5 = zi0.c.w(r5)
            r0.f305212w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r5 = r5.getContent()
            xfb.o r5 = (xfb.o) r5
            if (r5 == 0) goto L61
            do3.g r5 = r5.f305223a
            boolean r5 = v04.b.i(r5)
            if (r5 != 0) goto L5c
            rfb.f r5 = rfb.f.V1
            goto L5e
        L5c:
            rfb.f r5 = rfb.f.UNAVAILABLE
        L5e:
            if (r5 == 0) goto L61
            return r5
        L61:
            rfb.f r5 = rfb.f.UNAVAILABLE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xfb.m.e(gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum f(xfb.p r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xfb.i
            if (r0 == 0) goto L13
            r0 = r6
            xfb.i r0 = (xfb.i) r0
            int r1 = r0.f305214x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305214x = r1
            goto L18
        L13:
            xfb.i r0 = new xfb.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305214x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xfb.p r5 = r0.u
            yhm.o.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            xfb.s r6 = r4.f305220c
            akg.n r6 = r6.b(r5)
            zfd.e r6 = zi0.c.w(r6)
            r0.u = r5
            r0.f305214x = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r6 = r6.getContent()
            xfb.o r6 = (xfb.o) r6
            if (r6 != 0) goto L56
            rfb.f r5 = rfb.f.UNAVAILABLE
            return r5
        L56:
            boolean r0 = r6.f305224b
            if (r0 == 0) goto L73
            int[] r6 = xfb.g.f305211a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r3) goto L70
            r6 = 2
            if (r5 != r6) goto L6a
            rfb.f r5 = rfb.f.V3
            return r5
        L6a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L70:
            rfb.f r5 = rfb.f.V2
            return r5
        L73:
            do3.g r5 = r6.f305223a
            boolean r5 = v04.b.i(r5)
            if (r5 != 0) goto L7e
            rfb.f r5 = rfb.f.V1
            return r5
        L7e:
            rfb.f r5 = rfb.f.UNAVAILABLE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xfb.m.f(xfb.p, gim.c):java.lang.Enum");
    }

    public final boolean g(RemoteFeatureDefinition remoteFeatureDefinition) {
        return ((jte.d) this.f305218a).c(remoteFeatureDefinition);
    }

    public final y h(rfb.e eVar) {
        boolean zG = g(SalaryAccountApi$Toggles$SalaryAccountPhase3.f82947c);
        s sVar = this.f305220c;
        return rd0.e.e(zG ? new wc7.e(zi0.c.w(sVar.b(p.V3)), 6, this, eVar) : g(SalaryAccountApi$Toggles$SalaryAccountPhase2.f82946c) ? new wc7.e(zi0.c.w(sVar.b(p.V2)), 6, this, eVar) : this.f305219b.d(qfb.b.f245285a.a(), null).a() ? new wyd.f(zi0.c.w(sVar.b(p.V2)), this, 3) : new go.g(new rfb.a(0), 2), h0.f322473a, new x18.c(3, 8, null));
    }
}
