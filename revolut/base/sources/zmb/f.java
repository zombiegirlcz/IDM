package zmb;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.retail.savings.api.core.info_sheets.navigation.InfoSheetDestination;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$Destination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$ProductMigration$Destination;
import com.revolut.feature.shared.savings.models.info_sheets.InfoSheetParams;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import lcd.n;
import org.jetbrains.annotations.NotNull;
import rnb.w;
import sri.m;
import ufm.i;
import w4l.h;
import yui.v;
import zhm.h0;
import zk1.p;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements kjb.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f323441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ijb.a f323442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f323443c;
    public final slb.a d;
    public final mjb.a e;
    public final ugc.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FeatureCommand f323444g;

    public f(m navigator, ijb.a savingsProductInteractor, w savingsVaultsInteractor, slb.a savingsCreationAvailabilityInteractor, mjb.a savingsNavigationProvider, ugc.a savingsChallengeInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultsInteractor, "savingsVaultsInteractor");
        Intrinsics.checkNotNullParameter(savingsCreationAvailabilityInteractor, "savingsCreationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(savingsNavigationProvider, "savingsNavigationProvider");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        this.f323441a = navigator;
        this.f323442b = savingsProductInteractor;
        this.f323443c = savingsVaultsInteractor;
        this.d = savingsCreationAvailabilityInteractor;
        this.e = savingsNavigationProvider;
        this.f = savingsChallengeInteractor;
        this.f323444g = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)));
    }

    public static d0 g(jf0.c cVar) {
        String strE = cVar.e(3);
        HashMap map = cVar.d;
        if (kotlin.text.d0.W(strE)) {
            return new ufm.c(new fg8.b(cVar, 7), 1);
        }
        ufm.b bVarM = d0.m(vhi.c.c(new InfoSheetDestination(new InfoSheetParams(strE, (String) map.get("productId"), (String) map.get("accountType"), (String) map.get("variation")), Boolean.parseBoolean((String) map.get("forceReload"))), yhi.b.SOLID, null, false, 12));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(1);
        if (Intrinsics.f(strE, "savings")) {
            String strE2 = deeplink.e(2);
            switch (strE2.hashCode()) {
                case -1352294148:
                    if (strE2.equals("create")) {
                        return false;
                    }
                    break;
                case -1045061314:
                    if (strE2.equals("open-document")) {
                        return false;
                    }
                    break;
                case 77854074:
                    if (strE2.equals("explanations")) {
                        return false;
                    }
                    break;
                case 1402633315:
                    if (strE2.equals("challenge")) {
                        return Intrinsics.f(deeplink.e(3), "catch-up");
                    }
                    break;
            }
        } else if (!Intrinsics.f(strE, "create-savings-vault")) {
            return false;
        }
        return true;
    }

    public final i b(jf0.c cVar) {
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(this.f323443c.a(new pcd.e(0), h.f294642c), g.f186406a), null, new p(16), 1).firstOrError();
        zii.e eVar = new zii.e(new b(cVar, this, 0), 23);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final i c(SavingsAccountCreationFlow$Filter savingsAccountCreationFlow$Filter) {
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(this.d.c(n.f193865a, h.f294642c), g.f186406a), null, new p(18), 1).firstOrError();
        zii.e eVar = new zii.e(new zf5.n(savingsAccountCreationFlow$Filter, this, 19), 26);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final i d(jf0.c cVar) {
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(this.f323443c.a(new pcd.e(0), h.f294642c), g.f186406a), null, new p(17), 1).firstOrError();
        zii.e eVar = new zii.e(new b(cVar, this, 1), 25);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
    
        if (r9 == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ab, code lost:
    
        if (r9 == r1) goto L91;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zmb.f.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f A[ADDED_TO_REGION, REMOVE] */
    @Override // jf0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.d0 f(jf0.c r4, boolean r5) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zmb.f.f(jf0.c, boolean):efm.d0");
    }

    public final ufm.b h(jf0.c cVar) {
        String strE = cVar.e(3);
        return te0.w.j(!kotlin.text.d0.W(strE) ? vhi.c.c(new SavingsKompotFeatureConfig$ProductMigration$Destination(strE), yhi.b.SOLID, null, false, 12) : this.f323444g);
    }

    public final d0 i(jf0.c cVar) {
        String strE = cVar.e(3);
        if (!kotlin.text.d0.W(strE)) {
            d0 d0VarFirstOrError = m70.a.e(rd0.e.c(this.f323443c.c(strE, h.f294642c), g.f186406a), new p(20), new p(21)).firstOrError();
            zii.e eVar = new zii.e(new b(this, cVar), 29);
            d0VarFirstOrError.getClass();
            return new i(d0VarFirstOrError, eVar, 0);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Add recurring transfer Deeplink do not has ID");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return d0.l(illegalStateException);
    }

    public final d0 j(jf0.c cVar) {
        String strE = cVar.e(3);
        boolean zW = kotlin.text.d0.W(strE);
        FeatureCommand featureCommand = this.f323444g;
        if (zW) {
            return te0.w.j(featureCommand);
        }
        if (!kotlin.text.d0.W(cVar.e(4))) {
            if (!Intrinsics.f(cVar.e(4), "minimum-earning-balance")) {
                return te0.w.j(featureCommand);
            }
            ufm.b bVarM = d0.m(vhi.c.c(new SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$Destination(new SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData.AmountForDailyInterestPayment(strE, null, null, null)), yhi.b.BOTTOM_DIALOG, null, false, 12));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(this.f323443c.c(strE, h.f294642c), g.f186406a), null, new p(22), 1).firstOrError();
        zii.e eVar = new zii.e(new c(1), 21);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, featureCommand);
    }

    public final d0 k(jf0.c cVar) {
        String strE = cVar.e(4);
        if (strE.length() == 0) {
            IllegalStateException illegalStateException = new IllegalStateException("Savings challenge catch up deeplink missing account ID");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return d0.l(illegalStateException);
        }
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(boh.f.e(this.f323443c.c(strE, h.f294642c), new a(this, 1)), g.f186406a), null, new p(15), 1).firstOrError();
        zii.e eVar = new zii.e(new v(strE, 20), 22);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, this.f323444g);
    }

    public final i l(jf0.c cVar) {
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(this.f323443c.a(new pcd.e(0), h.f294642c), g.f186406a), null, new p(19), 1).firstOrError();
        zii.e eVar = new zii.e(new b(cVar, this, 2), 27);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
