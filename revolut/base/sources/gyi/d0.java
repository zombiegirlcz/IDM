package gyi;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListContract$InputData;
import dwi.i0;
import hwi.x0;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends oki.h implements h {
    public final u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ffk.t f147875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qvi.d f147876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dwi.a0 f147877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x0 f147878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wli.x f147879t;
    public final svi.q u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f147880w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f147881x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cli.y f147882y;

    public d0(AirportLoungesPassListContract$InputData inputData, cli.n stateMapper, u pollingHelper, ffk.t pricingPlanInteractor, qvi.d termsAndConditionsInteractor, dwi.a0 disclaimerInteractor, x0 userCapabilitiesRepository, wli.x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pollingHelper, "pollingHelper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(termsAndConditionsInteractor, "termsAndConditionsInteractor");
        Intrinsics.checkNotNullParameter(disclaimerInteractor, "disclaimerInteractor");
        Intrinsics.checkNotNullParameter(userCapabilitiesRepository, "userCapabilitiesRepository");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = pollingHelper;
        this.f147875p = pricingPlanInteractor;
        this.f147876q = termsAndConditionsInteractor;
        this.f147877r = disclaimerInteractor;
        this.f147878s = userCapabilitiesRepository;
        this.f147879t = deeplinkHandler;
        this.u = inputData.f99132b;
        this.v = new vii.b();
        this.f147880w = inputData.f99131a;
        this.f147882y = mra.d.b(this, new a(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f99131a, null, null, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(gyi.d0 r4, svi.r r5, com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof gyi.c0
            if (r0 == 0) goto L13
            r0 = r7
            gyi.c0 r0 = (gyi.c0) r0
            int r1 = r0.f147871w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147871w = r1
            goto L18
        L13:
            gyi.c0 r0 = new gyi.c0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f147871w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5e
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r7)
            svi.q r5 = r5.f265970b
            svi.q r7 = svi.q.UNLIMITED
            if (r5 != r7) goto L67
            svi.s0 r5 = r6.d
            svi.s0 r7 = svi.s0.STRICT
            if (r5 != r7) goto L67
            boolean r5 = r6.f98914c
            if (r5 != 0) goto L67
            dwi.a0 r4 = r4.f147877r
            java.lang.String r5 = r6.f98912a
            r0.f147871w = r3
            hwi.d0 r4 = r4.f120406a
            r4.getClass()
            hwi.c0 r6 = new hwi.c0
            r7 = 0
            r6.<init>(r4, r5, r7, r3)
            skm.p0 r4 = skm.p0.f264001a
            elm.f r4 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r4, r6, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r4 = r7.booleanValue()
            if (r4 != 0) goto L67
            goto L68
        L67:
            r3 = 0
        L68:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gyi.d0.I2(gyi.d0, svi.r, com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer, gim.c):java.lang.Object");
    }

    public static svi.r J2(a aVar) {
        List list = (List) aVar.f147862a.getContent();
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((svi.r) next).f265969a, aVar.f147864c)) {
                obj2 = next;
                break;
            }
        }
        svi.r rVar = (svi.r) obj2;
        return rVar == null ? (svi.r) zhm.d0.d0(list) : rVar;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(this.f147875p.q()), null, null, new a0(this, continuation, 0), 3);
        i0 i0Var = (i0) this.f147876q;
        yji.l.a1(this, yh5.b.d(vkm.q.Q(vkm.q.q(x0.a(i0Var.f120428a)), new cvi.i(continuation, i0Var, 29)), x0.a(this.f147878s)), null, null, new a0(this, continuation, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.v, new g6f.l(continuation, this, 20)), null, new a0(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f147882y;
    }
}
