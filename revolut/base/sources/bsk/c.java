package bsk;

import a09.z;
import br4.e;
import bs9.i0;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$FinancialsStatementsKompotMigration;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.StockFinancialsStatementsDestination;
import csk.h;
import efm.d0;
import java.util.Locale;
import jf0.d;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import sri.m;
import ufm.i;
import uqk.l;
import wp5.y;
import yhm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f18215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4f.b f18216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f18217c;
    public final Lazy d;

    public c(m navigator, b4f.b refProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(refProvider, "refProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f18215a = navigator;
        this.f18216b = refProvider;
        this.f18217c = featureToggleInteractor;
        this.d = j.b(new e(16));
    }

    public static FeatureCommand b(String str) {
        return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AssetDetailsDestination(str, vqk.c.FINANCIALS, false, "AssetDetailsDeeplink", null, null, 52), false, (Integer) null, 0, 61));
    }

    public static l d(jf0.c cVar) {
        String lowerCase;
        String str = (String) cVar.d.get("statementType");
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase != null) {
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != 29006396) {
                if (iHashCode != 344360537) {
                    if (iHashCode == 1978700025 && lowerCase.equals("cash_flows")) {
                        return l.CASH_FLOWS;
                    }
                } else if (lowerCase.equals("income_statement")) {
                    return l.INCOME_STATEMENT;
                }
            } else if (lowerCase.equals("balance_sheet")) {
                return l.BALANCE_SHEET;
            }
        }
        return l.INCOME_STATEMENT;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "stocks") && Intrinsics.f(cVar.e(4), "financials") && Intrinsics.f(cVar.e(5), "statements");
    }

    public final ufm.b c(String str, l lVar) {
        Object objA;
        if (((jte.d) this.f18217c).c(StockDetailsApi$Toggles$FinancialsStatementsKompotMigration.f103733c)) {
            objA = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new StockFinancialsStatementsDestination(str, lVar), false, (Integer) null, 0, 61));
        } else {
            h.Companion.getClass();
            objA = csk.c.a(str, lVar);
        }
        ufm.b bVarM = d0.m(objA);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof bsk.b
            if (r0 == 0) goto L13
            r0 = r9
            bsk.b r0 = (bsk.b) r0
            int r1 = r0.f18214y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18214y = r1
            goto L1a
        L13:
            bsk.b r0 = new bsk.b
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.f18212w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18214y
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L37
            if (r2 != r4) goto L2f
            com.revolut.retail.core.navigation.FeatureCommand r8 = r0.v
            yhm.o.b(r9)
            goto L7f
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            uqk.l r8 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L97
            goto L64
        L3d:
            yhm.o.b(r9)
            r9 = 3
            java.lang.String r9 = r8.e(r9)
            java.util.HashMap r2 = r8.d
            java.lang.String r6 = "ref"
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            uqk.l r8 = d(r8)
            b4f.b r6 = r7.f18216b     // Catch: java.lang.Exception -> L97
            efm.d0 r9 = r6.a(r9, r2)     // Catch: java.lang.Exception -> L97
            r0.u = r8     // Catch: java.lang.Exception -> L97
            r0.f18214y = r3     // Catch: java.lang.Exception -> L97
            java.lang.Object r9 = nim.a.b(r9, r0)     // Catch: java.lang.Exception -> L97
            if (r9 != r1) goto L64
            goto L7d
        L64:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L97
            kotlin.jvm.internal.Intrinsics.h(r9)
            com.revolut.retail.core.navigation.FeatureCommand r2 = b(r9)
            ufm.b r8 = r7.c(r9, r8)
            r0.u = r5
            r0.v = r2
            r0.f18214y = r4
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r8 = r2
        L7f:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            com.revolut.retail.core.navigation.CompositeCommand r8 = com.revolut.retail.core.navigation.a.c(r8, r9)
            q06.h r9 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r8)
            q06.b r8 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r8.<init>(r1, r5)
            r9.<init>(r0, r8)
            return r9
        L97:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bsk.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(3);
        String str = (String) deeplink.d.get("ref");
        l lVarD = d(deeplink);
        d0 d0VarA = this.f18216b.a(strE, str);
        i0 i0Var = new i0(1, new z(this, z, lVarD, 11));
        d0VarA.getClass();
        i iVar = new i(new i(d0VarA, i0Var, 0), new i0(2, new a(this, 0)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.I(iVar, h0.f322473a, new a(this, 1));
    }
}
