package b8k;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ang.f f13287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s99.i f13288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t99.k f13289n;

    public l(ang.f userInteractor, s99.i exchangeGlobalAccessInteractor, t99.k exchangeGlobalAccessFlowProvider) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessInteractor, "exchangeGlobalAccessInteractor");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessFlowProvider, "exchangeGlobalAccessFlowProvider");
        this.f13287l = userInteractor;
        this.f13288m = exchangeGlobalAccessInteractor;
        this.f13289n = exchangeGlobalAccessFlowProvider;
    }

    public static h c3(ExchangeGlobalAccessInteractor$Output exchangeGlobalAccessInteractor$Output, e eVar) {
        if (exchangeGlobalAccessInteractor$Output instanceof ExchangeGlobalAccessInteractor$Output.ShouldLaunch) {
            return new f(eVar, ((ExchangeGlobalAccessInteractor$Output.ShouldLaunch) exchangeGlobalAccessInteractor$Output).f78169a);
        }
        if (Intrinsics.f(exchangeGlobalAccessInteractor$Output, ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch.f78170a)) {
            return g.f13282a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // b8k.i
    public final ViewController Z2(e version, bla.c predefinedFeatureState) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(predefinedFeatureState, "predefinedFeatureState");
        int i = j.f13283a[version.ordinal()];
        if (i == 1) {
            k9 k9Var = frl.a.f137500l;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            return t99.k.b(this.f13289n, predefinedFeatureState, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 1);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        k9 value = frl.a.f137500l;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return o2(new l89.c(predefinedFeatureState, new AnalyticsProduct.Retail(value)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b8k.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(xi0.b r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof b8k.k
            if (r0 == 0) goto L13
            r0 = r9
            b8k.k r0 = (b8k.k) r0
            int r1 = r0.f13286y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13286y = r1
            goto L18
        L13:
            b8k.k r0 = new b8k.k
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f13284w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13286y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            b8k.l r8 = r0.v
            yhm.o.b(r9)
            goto Lb6
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            b8k.l r8 = r0.v
            yhm.o.b(r9)
            goto L89
        L3e:
            xi0.b r8 = r0.u
            yhm.o.b(r9)
            goto L59
        L44:
            yhm.o.b(r9)
            ang.f r9 = r7.f13287l
            r2 = 0
            efm.d0 r9 = r9.f(r2)
            r0.u = r8
            r0.f13286y = r5
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L59
            goto Lb4
        L59:
            do3.n r9 = (do3.n) r9
            kotlin.jvm.internal.Intrinsics.h(r9)
            wi0.a r2 = wi0.b.Companion
            r2.getClass()
            wi0.b r2 = wi0.b.O
            boolean r2 = te0.w.S(r9, r2)
            s99.i r5 = r7.f13288m
            r6 = 0
            if (r2 == 0) goto L95
            xi0.a r2 = xi0.b.Companion
            r2.getClass()
            xi0.b r2 = xi0.b.F
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r2 != 0) goto L95
            r0.u = r6
            r0.v = r7
            r0.f13286y = r4
            java.lang.Object r9 = r5.b(r0)
            if (r9 != r1) goto L88
            goto Lb4
        L88:
            r8 = r7
        L89:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output r9 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output) r9
            b8k.e r0 = b8k.e.V2
            r8.getClass()
            b8k.h r8 = c3(r9, r0)
            return r8
        L95:
            boolean r9 = te0.w.V(r9)
            if (r9 == 0) goto Lc2
            xi0.a r9 = xi0.b.Companion
            r9.getClass()
            xi0.b r9 = xi0.b.z
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r8 != 0) goto Lc2
            r0.u = r6
            r0.v = r7
            r0.f13286y = r3
            java.lang.Object r9 = r5.a(r0)
            if (r9 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            r8 = r7
        Lb6:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output r9 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output) r9
            b8k.e r0 = b8k.e.V1
            r8.getClass()
            b8k.h r8 = c3(r9, r0)
            return r8
        Lc2:
            b8k.g r8 = b8k.g.f13282a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b8k.l.b3(xi0.b, gim.c):java.lang.Object");
    }
}
