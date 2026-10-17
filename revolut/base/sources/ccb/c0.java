package ccb;

import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$InputData;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$UiData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import retrofit2.HttpException;
import vkm.z1;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 extends jki.g implements p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MoneyBoxAmountInputScreenContract$InputData f22974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybb.d f22975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f22976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w80.b f22977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final acb.j f22978t;
    public final zbb.a u;
    public final z1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f22979w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(jki.p stateMapper, MoneyBoxAmountInputScreenContract$InputData inputData, ybb.d moneyBoxAmountInteractor, j modelExtension, w80.b amountFormatter, acb.j transferBreakdownInteractor, zbb.a balancePickerInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moneyBoxAmountInteractor, "moneyBoxAmountInteractor");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(transferBreakdownInteractor, "transferBreakdownInteractor");
        Intrinsics.checkNotNullParameter(balancePickerInteractor, "balancePickerInteractor");
        this.f22974p = inputData;
        this.f22975q = moneyBoxAmountInteractor;
        this.f22976r = modelExtension;
        this.f22977s = amountFormatter;
        this.f22978t = transferBreakdownInteractor;
        this.u = balancePickerInteractor;
        this.v = ta6.a.a(0);
        h hVar = i.Companion;
        String targetCurrency = inputData.f82767b;
        k moneyFlowType = inputData.d;
        MoneyBoxAmountInputScreenContract$UiData uiData = inputData.f82768c;
        TransferScheduleData transferScheduleData = inputData.e;
        Long l2 = inputData.f;
        String strD = l2 != null ? amountFormatter.d(l2.longValue(), inputData.f82767b) : null;
        List validationErrors = zhm.v.l((l2 == null || l2.longValue() == 0) ? urf.g.f282312a : null);
        hVar.getClass();
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        Intrinsics.checkNotNullParameter(moneyFlowType, "moneyFlowType");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        xi0.b.Companion.getClass();
        this.f22979w = new i(strD == null ? "0" : strD, xi0.a.a(targetCurrency), null, null, null, new dj0.d(0L, xi0.a.a(targetCurrency)), null, moneyFlowType, null, validationErrors, transferScheduleData, null, uiData);
    }

    public static y0 A2(int i) {
        return new y0(null, new nii.z(new TextLocalisedClause(i, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(ccb.c0 r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ccb.c0.y2(ccb.c0, gim.c):java.lang.Object");
    }

    public final boolean B2(Throwable th10, y0 y0Var) {
        if ((th10 instanceof ServerErrorException) || (th10 instanceof HandledNetworkException) || (th10 instanceof HttpException)) {
            return false;
        }
        yji.l.a1(this, X1(y0Var), null, null, new c65.i(this, null, 8), 3);
        return true;
    }

    @Override // yji.l
    public final void I1() {
        MoneyBoxAmountInputScreenContract$InputData moneyBoxAmountInputScreenContract$InputData = this.f22974p;
        String str = moneyBoxAmountInputScreenContract$InputData.f82766a;
        ybb.d dVar = this.f22975q;
        Continuation continuation = null;
        yji.l.a1(this, dVar.h(str), new aee.g(2, this, c0.class, "handleLoadError", "handleLoadError(Ljava/lang/Throwable;)Z", 4, 20), null, new x(0, this, continuation), 2);
        String str2 = moneyBoxAmountInputScreenContract$InputData.f82766a;
        yji.l.a1(this, new bbk.z(dVar.g(str2), 22), null, null, new x(1, this, continuation), 3);
        Flow flowC = dVar.c(str2);
        int i = 4;
        yji.l.a1(this, flowC, new aee.g(2, this, c0.class, "handleLoadError", "handleLoadError(Ljava/lang/Throwable;)Z", i, 21), null, new a2g.q(this, continuation, 5), 2);
        wkm.l lVarQ = vkm.q.Q(this.v, new u(3, this, continuation));
        int i2 = 2;
        yji.l.a1(this, lVarQ, new aee.g(i2, this, c0.class, "handleLoadError", "handleLoadError(Ljava/lang/Throwable;)Z", i, 22), null, new x(i2, this, continuation), 2);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f22979w;
    }

    public final long z2(i iVar) {
        return this.f22977s.b(iVar.f22990a, iVar.f22991b.f306286a);
    }
}
