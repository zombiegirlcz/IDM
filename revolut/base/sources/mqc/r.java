package mqc;

import com.revolut.feature.salary_switch.impl.models.v2.CounterpartiesResult;
import com.revolut.feature.salary_switch.impl.models.v2.SalarySwitchV2StatusDetails;
import com.revolut.feature.salary_switch.impl.network.PayrollServiceV2;
import ip0.v7;
import java.util.List;
import k7c.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayrollServiceV2 f207970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f207971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f207972c;
    public final x4l.c d;
    public final x4l.c e;

    public r(PayrollServiceV2 payrollServiceV2, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(payrollServiceV2, "payrollServiceV2");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f207970a = payrollServiceV2;
        this.f207971b = memoryCache;
        Continuation continuation = null;
        final int i = 0;
        int i2 = 2;
        int i3 = 3;
        this.f207972c = new x4l.c(new x(this, continuation, 28), new Function1(this) { // from class: mqc.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f207965b;

            {
                this.f207965b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (SalarySwitchV2StatusDetails) v7.r("PAYROLL_SWITCH_DETAILS_V2_", id10, this.f207965b.f207971b);
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f207965b.f207971b.get("PAYROLL_SWITCHES_V2_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (CounterpartiesResult) this.f207965b.f207971b.get("COUNTERPARTIES_V2_CACHE_KEY");
                }
            }
        }, new Function2(this) { // from class: mqc.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f207967b;

            {
                this.f207967b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String id10 = (String) obj2;
                        SalarySwitchV2StatusDetails domain = (SalarySwitchV2StatusDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f207967b.f207971b.f("PAYROLL_SWITCH_DETAILS_V2_" + id10, domain);
                        break;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f207967b.f207971b.f("PAYROLL_SWITCHES_V2_CACHE_KEY", domain2);
                        break;
                    default:
                        CounterpartiesResult domain3 = (CounterpartiesResult) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f207967b.f207971b.f("COUNTERPARTIES_V2_CACHE_KEY", domain3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new p(i2, 2, continuation), new k3c.l(i3, 22, continuation));
        final int i5 = 1;
        this.d = new x4l.c(new o(this, continuation, i5), new Function1(this) { // from class: mqc.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f207965b;

            {
                this.f207965b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (SalarySwitchV2StatusDetails) v7.r("PAYROLL_SWITCH_DETAILS_V2_", id10, this.f207965b.f207971b);
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f207965b.f207971b.get("PAYROLL_SWITCHES_V2_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (CounterpartiesResult) this.f207965b.f207971b.get("COUNTERPARTIES_V2_CACHE_KEY");
                }
            }
        }, new Function2(this) { // from class: mqc.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f207967b;

            {
                this.f207967b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        String id10 = (String) obj2;
                        SalarySwitchV2StatusDetails domain = (SalarySwitchV2StatusDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f207967b.f207971b.f("PAYROLL_SWITCH_DETAILS_V2_" + id10, domain);
                        break;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f207967b.f207971b.f("PAYROLL_SWITCHES_V2_CACHE_KEY", domain2);
                        break;
                    default:
                        CounterpartiesResult domain3 = (CounterpartiesResult) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f207967b.f207971b.f("COUNTERPARTIES_V2_CACHE_KEY", domain3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new p(i2, i5, continuation), new k3c.l(i3, 21, continuation));
        final int i6 = 2;
        this.e = new x4l.c(new o(this, continuation, 0), new Function1(this) { // from class: mqc.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f207965b;

            {
                this.f207965b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (SalarySwitchV2StatusDetails) v7.r("PAYROLL_SWITCH_DETAILS_V2_", id10, this.f207965b.f207971b);
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f207965b.f207971b.get("PAYROLL_SWITCHES_V2_CACHE_KEY");
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (CounterpartiesResult) this.f207965b.f207971b.get("COUNTERPARTIES_V2_CACHE_KEY");
                }
            }
        }, new Function2(this) { // from class: mqc.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f207967b;

            {
                this.f207967b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        String id10 = (String) obj2;
                        SalarySwitchV2StatusDetails domain = (SalarySwitchV2StatusDetails) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f207967b.f207971b.f("PAYROLL_SWITCH_DETAILS_V2_" + id10, domain);
                        break;
                    case 1:
                        List domain2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f207967b.f207971b.f("PAYROLL_SWITCHES_V2_CACHE_KEY", domain2);
                        break;
                    default:
                        CounterpartiesResult domain3 = (CounterpartiesResult) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f207967b.f207971b.f("COUNTERPARTIES_V2_CACHE_KEY", domain3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new p(i2, 0, continuation), new k3c.l(i3, 20, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof mqc.q
            if (r0 == 0) goto L13
            r0 = r8
            mqc.q r0 = (mqc.q) r0
            int r1 = r0.f207969w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207969w = r1
            goto L18
        L13:
            mqc.q r0 = new mqc.q
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207969w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L58
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            w4l.i r2 = w4l.i.f294643c
            x4l.c r4 = r7.d
            vkm.d r8 = r4.b(r8, r2)
            mlk.a0 r2 = new mlk.a0
            r4 = 25
            r2.<init>(r4)
            vkm.q0 r8 = c8g.c.c(r8, r2)
            m84.c r2 = new m84.c
            r4 = 2
            r5 = 3
            r6 = 0
            r2.<init>(r4, r5, r6)
            r0.f207969w = r3
            java.lang.Object r8 = vkm.q.y(r8, r2, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r8 = r8.getContent()
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L64
            zhm.f0 r8 = zhm.f0.f322471a
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mqc.r.a(gim.c):java.lang.Object");
    }
}
