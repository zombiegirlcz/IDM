package sp5;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogDestination;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogInput;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import sl3.r;
import te0.s;
import te0.w;
import up5.a0;
import up5.g0;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f264885b;

    public /* synthetic */ d(f fVar, int i) {
        this.f264884a = i;
        this.f264885b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f264884a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                CryptoWithdrawFeesBreakdown feeBreakdown = (CryptoWithdrawFeesBreakdown) pair.f186385a;
                Data data = (Data) pair.f186386b;
                qp5.h hVar = this.f264885b.i;
                List list = (List) data.getContent();
                n9l.a aVar = list != null ? (n9l.a) d0.d0(list) : null;
                g0 g0Var = (g0) hVar;
                g0Var.getClass();
                Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
                return g0Var.f281893b.a(new FeatureCommand(new KompotOverlayFeatureConfig(new CryptoFeeBreakdownDialogDestination(new CryptoFeeBreakdownDialogInput.WithBreakdown(feeBreakdown, aVar)), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
            default:
                f fVar = this.f264885b;
                up5.b bVar = fVar.f264887h;
                CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                if (!Intrinsics.f(model.f51781a, "FEE_BREAKDOWN_ITEM_LIST_ID")) {
                    m mVar = m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                efm.d0 d0VarFirstOrError = w.l(((up5.e) ((a0) bVar).f281852b).y0().c(s.f270018a), ((a0) bVar).o3()).firstOrError();
                r rVar = new r(new d(fVar, 0), 27);
                d0VarFirstOrError.getClass();
                pfm.a aVar2 = new pfm.a(d0VarFirstOrError, rVar, 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
        }
    }
}
