package s8h;

import com.revolut.feature.wealth.api.declaration.MostTradedAssetsFeatureConfig;
import com.revolut.feature.wealth_discovery.api.CollectionUIApi$Toggles$MostTradedKompotMigration;
import com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements jf0.d, q06.k {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f261038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f261039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f261040c;

    public t(sri.m navigator, xoj.a featuresInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f261038a = navigator;
        this.f261039b = featuresInteractor;
        this.f261040c = featureToggleInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "instruments") && Intrinsics.f(cVar.e(2), "most-traded") && Intrinsics.f(cVar.e(3), "crypto");
    }

    public final FeatureConfig b(jf0.c cVar) {
        f fVar;
        q qVar;
        e eVar = f.Companion;
        String str = (String) cVar.d.get("timeSpan");
        eVar.getClass();
        p pVar = null;
        Object obj2 = null;
        if (str != null) {
            f[] fVarArrValues = f.values();
            int length = fVarArrValues.length;
            for (int i = 0; i < length; i++) {
                fVar = fVarArrValues[i];
                if (Intrinsics.f(fVar.a(), str)) {
                    break;
                }
            }
            fVar = null;
        } else {
            fVar = null;
        }
        int i2 = fVar == null ? -1 : r.f261031a[fVar.ordinal()];
        if (i2 == -1) {
            qVar = null;
        } else if (i2 == 1) {
            qVar = q.ONE_DAY;
        } else if (i2 == 2) {
            qVar = q.ONE_WEEK;
        } else if (i2 == 3) {
            qVar = q.ONE_MONTH;
        } else if (i2 != 4) {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            qVar = null;
        } else {
            qVar = q.ONE_YEAR;
        }
        if (qVar == null) {
            qVar = q.ONE_WEEK;
        }
        o oVar = p.Companion;
        String str2 = (String) cVar.d.get("section");
        oVar.getClass();
        if (str2 != null) {
            Iterator<E> it8 = p.b().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((p) next).d(), str2)) {
                    obj2 = next;
                    break;
                }
            }
            pVar = (p) obj2;
        }
        if (pVar == null) {
            pVar = p.MOST_TRADED;
        }
        return ((jte.d) this.f261040c).c(CollectionUIApi$Toggles$MostTradedKompotMigration.f96090c) ? u0.d(new MostTradedAssetsDestination.Crypto(qVar.a(), pVar.a(), 4)) : new MostTradedAssetsFeatureConfig.Crypto(qVar.b(), pVar.c(), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s8h.s
            if (r0 == 0) goto L13
            r0 = r7
            s8h.s r0 = (s8h.s) r0
            int r1 = r0.f261036x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261036x = r1
            goto L1a
        L13:
            s8h.s r0 = new s8h.s
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261036x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            jf0.c r6 = r0.u
            yhm.o.b(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            yoj.c r7 = yoj.c.CRYPTO
            yoj.d r2 = yoj.d.DISABLED
            xoj.a r4 = r5.f261039b
            cpj.b r4 = (cpj.b) r4
            ufm.i r7 = r4.f(r7, r2)
            r0.u = r6
            r0.f261036x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0 = 0
            if (r7 != 0) goto L57
            return r0
        L57:
            com.revolut.retail.core.navigation.feature.FeatureConfig r6 = r5.b(r6)
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r2 = new com.revolut.retail.core.navigation.FeatureCommand
            r2.<init>(r6)
            r1.<init>(r2)
            q06.b r6 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.d
            r6.<init>(r2, r0)
            r7.<init>(r1, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s8h.t.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!a(deeplink)) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        ufm.i iVar = new ufm.i(((cpj.b) this.f261039b).f(yoj.c.CRYPTO, yoj.d.DISABLED), new s65.o(new pud.b((Object) this, deeplink, z, 12), 16), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }
}
