package up2;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a f281826b;

    public /* synthetic */ k(com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar, int i) {
        this.f281825a = i;
        this.f281826b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f281825a;
        Continuation continuation = null;
        com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar = this.f281826b;
        switch (i) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                ServerError serverErrorA = aVar.f64057r.a(throwable);
                Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
                if (numValueOf != null && numValueOf.intValue() == 110037) {
                    tji.f fVarX = aVar.X();
                    aVar.f64056q.getClass();
                    yji.l.b1(aVar, fVarX.d(new y0("ID_REQUEST_ALREADY_PROCESSED", new z(new TextLocalisedClause(R$string.account_switch_request_review_out_request_processed_error_title, null, null, 14), new TextLocalisedClause(R$string.account_switch_request_review_out_request_processed_error_description, null, null, 14), new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, new o(aVar, continuation, 0), 3);
                } else {
                    aVar.H2(aVar.f64058s, new nd8.l(throwable, 12));
                }
                return Boolean.TRUE;
            default:
                zp2.g dialogResult = (zp2.g) obj2;
                Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                if (Intrinsics.f(dialogResult, zp2.e.f324164a)) {
                    aVar.I2();
                } else {
                    if (!Intrinsics.f(dialogResult, zp2.f.f324165a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.l2(new n(aVar, continuation, 1), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
