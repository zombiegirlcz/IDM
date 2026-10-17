package yb5;

import akg.n;
import bk4.h;
import bk4.i;
import com.revolut.feature.credit.autopay.models.CreditAutopaySourceConfig;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardAutoPaymentHidden;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import go.g;
import hd.r;
import io3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m2j.j;
import skm.e0;
import w4l.k;
import y99.x;
import zhm.d0;
import zhm.h0;
import zhm.w;
import zhm.z0;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements lb5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f312201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij0.a f312202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f312203c;
    public final xua.a d;
    public final j e;

    public e(r autopayRepository, ij0.a networkConfiguration, gte.a featureToggleInteractor, xua.a recurringPaymentInteractor, j balancesInteractor) {
        Intrinsics.checkNotNullParameter(autopayRepository, "autopayRepository");
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        this.f312201a = autopayRepository;
        this.f312202b = networkConfiguration;
        this.f312203c = featureToggleInteractor;
        this.d = recurringPaymentInteractor;
        this.e = balancesInteractor;
    }

    public final vkm.d a(String facilityId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((x4l.c) this.f312201a.e).b(new bc5.a(facilityId), loadingStrategy);
    }

    public final vkm.d b(String facilityId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((x4l.c) this.f312201a.d).b(new bc5.c(facilityId), loadingStrategy);
    }

    public final CreditAutopaySourceConfig c(Set supportedCurrencies) {
        Intrinsics.checkNotNullParameter(supportedCurrencies, "supportedCurrencies");
        i iVar = i.RETAIL;
        l lVar = l.CURRENT;
        Set setI = z0.i(h.POCKET, h.JOINT_ACCOUNT);
        h0 h0Var = h0.f322473a;
        return new CreditAutopaySourceConfig(iVar, lVar, setI, supportedCurrencies, h0Var, h0Var);
    }

    public final n d(CreditAutopaySourceConfig config) {
        k1j.a aVar;
        Intrinsics.checkNotNullParameter(config, "config");
        if (a.f312192b[config.f68545a.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        k1j.d dVar = k1j.d.RETAIL;
        l lVar = config.f68546b;
        Set set = config.f68547c;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            int i = a.f312193c[((h) it8.next()).ordinal()];
            if (i == 1) {
                aVar = k1j.a.POCKETS;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = k1j.a.JOINT_ACCOUNT;
            }
            arrayList.add(aVar);
        }
        Set setI1 = d0.i1(arrayList);
        Set set2 = config.d;
        ArrayList arrayList2 = new ArrayList(w.t(set2, 10));
        Iterator it9 = set2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((xi0.b) it9.next()).f306286a);
        }
        return nim.a.v(rd0.e.b(this.e.e(new BalancesInteractor$InputData(dVar, lVar, setI1, d0.i1(arrayList2), config.e, config.f, null, null, 192), null)), new x(28));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (h(r12, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r12, com.revolut.feature.credit_card.autopay.api.models_v3.b r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof yb5.b
            if (r0 == 0) goto L13
            r0 = r14
            yb5.b r0 = (yb5.b) r0
            int r1 = r0.f312195x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312195x = r1
            goto L18
        L13:
            yb5.b r0 = new yb5.b
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f312195x
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L2b
            goto L6d
        L2b:
            r0 = move-exception
            r12 = r0
            goto L72
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            goto L5e
        L3c:
            yhm.o.b(r14)
            r0.u = r12
            r0.f312195x = r4
            b96.d r5 = new b96.d
            r10 = 4
            hd.r r6 = r11.f312201a
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L58
            goto L5a
        L58:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L5a:
            if (r12 != r1) goto L5d
            goto L6c
        L5d:
            r12 = r7
        L5e:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            r0.u = r9     // Catch: java.lang.Throwable -> L2b
            r0.f312195x = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r12 = r11.h(r12, r0)     // Catch: java.lang.Throwable -> L2b
            if (r12 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2b
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            goto L78
        L72:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r12)
        L78:
            java.lang.Throwable r12 = yhm.m.a(r12)
            if (r12 == 0) goto L87
            zhm.h0 r13 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            rd0.d.a(r14, r9, r9, r12, r13)
        L87:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yb5.e.e(java.lang.String, com.revolut.feature.credit_card.autopay.api.models_v3.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (h(r13, r0) != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r12, java.lang.String r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof yb5.c
            if (r0 == 0) goto L13
            r0 = r14
            yb5.c r0 = (yb5.c) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            yb5.c r0 = new yb5.c
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f312197x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            hd.r r4 = r11.f312201a
            r9 = 3
            r10 = 2
            r3 = 1
            r7 = 0
            if (r2 == 0) goto L4d
            if (r2 == r3) goto L45
            if (r2 == r10) goto L3d
            if (r2 != r9) goto L35
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L31
            goto La1
        L31:
            r0 = move-exception
            r12 = r0
            goto La6
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            int r12 = r0.f312196w
            java.lang.String r13 = r0.u
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L31
            goto L92
        L45:
            java.lang.String r13 = r0.v
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            goto L70
        L4d:
            yhm.o.b(r14)
            r0.u = r12
            r0.v = r13
            r0.z = r3
            b96.d r3 = new b96.d
            r8 = 6
            r5 = r12
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r3, r0)
            if (r12 != r1) goto L69
            goto L6b
        L69:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L6b:
            if (r12 != r1) goto L6e
            goto La0
        L6e:
            r12 = r5
            r13 = r6
        L70:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L31
            r0.u = r12     // Catch: java.lang.Throwable -> L31
            r0.v = r7     // Catch: java.lang.Throwable -> L31
            r2 = 0
            r0.f312196w = r2     // Catch: java.lang.Throwable -> L31
            r0.z = r10     // Catch: java.lang.Throwable -> L31
            java.lang.Object r3 = r4.f     // Catch: java.lang.Throwable -> L31
            x4l.c r3 = (x4l.c) r3     // Catch: java.lang.Throwable -> L31
            bc5.b r4 = new bc5.b     // Catch: java.lang.Throwable -> L31
            r4.<init>(r12, r13)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r13 = r3.d(r4, r2, r0)     // Catch: java.lang.Throwable -> L31
            if (r13 != r1) goto L8d
            r14 = r13
        L8d:
            if (r14 != r1) goto L90
            goto La0
        L90:
            r13 = r12
            r12 = r2
        L92:
            r0.u = r7     // Catch: java.lang.Throwable -> L31
            r0.v = r7     // Catch: java.lang.Throwable -> L31
            r0.f312196w = r12     // Catch: java.lang.Throwable -> L31
            r0.z = r9     // Catch: java.lang.Throwable -> L31
            java.lang.Object r12 = r11.h(r13, r0)     // Catch: java.lang.Throwable -> L31
            if (r12 != r1) goto La1
        La0:
            return r1
        La1:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L31
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L31
            goto Lac
        La6:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r12)
        Lac:
            java.lang.Throwable r12 = yhm.m.a(r12)
            if (r12 == 0) goto Lbb
            zhm.h0 r13 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            rd0.d.a(r14, r7, r7, r12, r13)
        Lbb:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yb5.e.f(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final Flow g(String facilityId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        boolean zC = ((jte.d) this.f312203c).c(CreditCardApi$Toggles$CreditCardAutoPaymentHidden.f68673c);
        if (zC) {
            return new g(Boolean.FALSE, 2);
        }
        if (zC) {
            throw new NoWhenBranchMatchedException();
        }
        return mo3.a.g(n14.k.p(nim.a.v(a(facilityId, loadingStrategy), new x(26)), new x(27)), null, new y65.n(15), 1);
    }

    public final Object h(String str, gim.c cVar) {
        Object objG = e0.G(new y65.l(this, str, null, 5), cVar);
        return objG == fim.a.COROUTINE_SUSPENDED ? objG : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (h(r12, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r12, com.revolut.feature.credit_card.autopay.api.models_v3.c r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof yb5.d
            if (r0 == 0) goto L13
            r0 = r14
            yb5.d r0 = (yb5.d) r0
            int r1 = r0.f312200x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312200x = r1
            goto L18
        L13:
            yb5.d r0 = new yb5.d
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f312200x
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L2b
            goto L6d
        L2b:
            r0 = move-exception
            r12 = r0
            goto L72
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            goto L5e
        L3c:
            yhm.o.b(r14)
            r0.u = r12
            r0.f312200x = r4
            b96.d r5 = new b96.d
            r10 = 7
            hd.r r6 = r11.f312201a
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L58
            goto L5a
        L58:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L5a:
            if (r12 != r1) goto L5d
            goto L6c
        L5d:
            r12 = r7
        L5e:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            r0.u = r9     // Catch: java.lang.Throwable -> L2b
            r0.f312200x = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r12 = r11.h(r12, r0)     // Catch: java.lang.Throwable -> L2b
            if (r12 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2b
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            goto L78
        L72:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r12)
        L78:
            java.lang.Throwable r12 = yhm.m.a(r12)
            if (r12 == 0) goto L87
            zhm.h0 r13 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            rd0.d.a(r14, r9, r9, r12, r13)
        L87:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yb5.e.i(java.lang.String, com.revolut.feature.credit_card.autopay.api.models_v3.c, gim.c):java.lang.Object");
    }
}
