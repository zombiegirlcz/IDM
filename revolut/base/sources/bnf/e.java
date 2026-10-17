package bnf;

import aw0.k7;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transactions.api.TransactionApi$Toggles$AmountWithChargesMigration;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.o3;
import tof.v6;
import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements thf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.m f17141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f17142b;

    public e(gte.a featureToggleInteractor, thf.m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f17141a = transactionTextResourcesMapper;
        this.f17142b = featureToggleInteractor;
    }

    public static MoneyClause b(a3 a3Var, Integer num) {
        if (a3Var.f == v6.COMPLETED) {
            return new MoneyClause(k71.k.b(a3Var), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(num, false, null, false, null, 254), null, 8);
        }
        return null;
    }

    public static MoneyClause c(a3 a3Var, Integer num) {
        dj0.d dVar;
        o3 o3Var = a3Var.J;
        if (o3Var == null || (dVar = o3Var.f272965a) == null) {
            return null;
        }
        return new MoneyClause(dVar.a().l(), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(num, k71.k.m0(a3Var), null, false, null, Constants.TAG_FC_SPEED_MODE), null, 8);
    }

    public static MoneyClause d(a3 a3Var) {
        return new MoneyClause(pyd.c.i0(pyd.c.O(a3Var.k.a(), a3Var.f272599l.a())), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(null, k71.k.m0(a3Var), null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, 8);
    }

    public static MoneyClause g(a3 a3Var, dj0.d dVar, int i, ScaleMode scaleMode, boolean z) {
        k7 k7Var = ((!k71.k.p1(a3Var) || k71.k.o1(a3Var)) && !k71.k.m0(a3Var)) ? k7.ALWAYS : k7.NEVER;
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7Var, scaleMode, false, false, 12), new Custom(Integer.valueOf(i), z, null, false, null, Constants.TAG_FC_SPEED_MODE), null, 8);
    }

    public static MoneyClause h(a3 a3Var, dj0.d dVar, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = R$attr.uikit_colorGreyTone50;
        }
        int i3 = i2 & 4;
        ScaleMode.CryptoHoldingFormat cryptoHoldingFormat = ScaleMode.CryptoHoldingFormat.f51439a;
        if (i3 != 0 && !cp5.d.z(dVar.f115083b)) {
            cryptoHoldingFormat = null;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        return g(a3Var, dVar, i, cryptoHoldingFormat, z);
    }

    public final int a(a3 a3Var) {
        dj0.d dVarT;
        y6 y6Var;
        dj0.d dVarB = ((jte.d) this.f17142b).c(TransactionApi$Toggles$AmountWithChargesMigration.f91951c) ? a3Var.N1 : k71.k.b(a3Var);
        if (a3Var.f == v6.PENDING && (y6Var = a3Var.e) != y6.CARD_PAYMENT && y6Var != y6.ATM && !k71.k.y0(a3Var)) {
            return R$attr.uikit_colorGreyTone50;
        }
        if (!k71.k.m0(a3Var)) {
            boolean zF = (!pyd.c.C(a3Var) || (dVarT = pyd.c.t(a3Var)) == null) ? dVarB.f(dj0.d.e) : dVarT.f(dj0.d.e);
            if (zF) {
                if (!(k71.k.p1(a3Var) && !k71.k.o1(a3Var))) {
                    return R$attr.uikit_colorStatusSuccess;
                }
            }
        }
        return R$attr.uikit_colorForeground;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.MoneyClause e(tof.a3 r14, boolean r15, int r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bnf.e.e(tof.a3, boolean, int, boolean, boolean):com.revolut.core.ui_kit.models.MoneyClause");
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.Clause f(tof.a3 r28, v61.h r29, boolean r30, boolean r31, boolean r32, wi0.b r33) {
        /*
            Method dump skipped, instruction units count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bnf.e.f(tof.a3, v61.h, boolean, boolean, boolean, wi0.b):com.revolut.core.ui_kit.models.Clause");
    }
}
