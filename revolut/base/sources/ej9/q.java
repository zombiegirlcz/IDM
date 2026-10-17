package ej9;

import com.revolut.feature.pay_later.api.models.PayLaterActivationError;
import dj9.u;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;
import zh9.i1;
import zh9.j1;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f126827b;

    public /* synthetic */ q(e0 e0Var, int i) {
        this.f126826a = i;
        this.f126827b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Response<?> response;
        ResponseBody responseBodyErrorBody;
        String strString;
        dj9.b bVar;
        jo3.a minPurchaseAmount;
        int i = this.f126826a;
        Throwable maxPurchaseAmountTooLow = null;
        int i2 = 1;
        e0 e0Var = this.f126827b;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "originalError");
                qh4.m mVar = e0Var.e;
                Intrinsics.checkNotNullParameter(error, "error");
                if ((error instanceof HttpException) && (response = ((HttpException) error).response()) != null && (responseBodyErrorBody = response.errorBody()) != null && (strString = responseBodyErrorBody.string()) != null) {
                    try {
                        bVar = (dj9.b) mVar.f246466a.c(strString, dj9.b.class);
                    } catch (Exception e) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                        bVar = null;
                    }
                    break;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    Integer code = bVar.getCode();
                    if (code != null && code.intValue() == 52001) {
                        maxPurchaseAmountTooLow = PayLaterActivationError.FacilityNotCreated.f78809a;
                    } else if (code != null && code.intValue() == 52004) {
                        maxPurchaseAmountTooLow = PayLaterActivationError.Cancelled.f78808a;
                    } else if (code != null && code.intValue() == 52008) {
                        maxPurchaseAmountTooLow = PayLaterActivationError.Terminated.f78814a;
                    } else if (code != null && code.intValue() == 52003) {
                        maxPurchaseAmountTooLow = PayLaterActivationError.Outstanding.f78812a;
                    } else if (code != null && code.intValue() == 52002) {
                        maxPurchaseAmountTooLow = PayLaterActivationError.Overdue.f78813a;
                    } else if (code != null && code.intValue() == 52000) {
                        maxPurchaseAmountTooLow = PayLaterActivationError.UnknownError.f78815a;
                    } else if (code != null && code.intValue() == 52005) {
                        maxPurchaseAmountTooLow = PayLaterActivationError.NoEligibleCards.f78811a;
                    } else if (code != null && code.intValue() == 52009 && (minPurchaseAmount = bVar.getMinPurchaseAmount()) != null) {
                        maxPurchaseAmountTooLow = new PayLaterActivationError.MaxPurchaseAmountTooLow(mo3.a.o(minPurchaseAmount));
                    }
                }
                if (maxPurchaseAmountTooLow != null) {
                    error = maxPurchaseAmountTooLow;
                }
                return efm.b.n(error);
            case 1:
                u.a aVar = (u.a) obj2;
                w4l.f fVar = e0Var.f126802g;
                Unit unit = Unit.f186387a;
                Intrinsics.h(aVar);
                fVar.j(unit, aVar);
                return unit;
            case 2:
                j1 state = (j1) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                efm.r rVarJust = efm.r.just(state);
                if (state instanceof i1) {
                    efm.d0 d0VarK = e0Var.f126806m.k(Unit.f186387a);
                    d0VarK.getClass();
                    rVarJust = rVarJust.mergeWith(new pfm.h(d0VarK, 4));
                }
                Intrinsics.checkNotNullExpressionValue(rVarJust, "runIf(...)");
                return rVarJust;
            case 3:
                e key = (e) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                rx4.b agreements = (rx4.b) e0Var.f126801c.T2(key.f126797b, key.f126798c);
                if (agreements == null) {
                    return null;
                }
                zjh.j jVar = e0Var.d;
                String facilityId = key.f126796a;
                Intrinsics.checkNotNullParameter(agreements, "agreements");
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return tx4.a.a(agreements, new c55.b(((ij0.a) jVar.f322839a).getBaseUrl(), facilityId, 1));
            case 4:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (dj9.d) e0Var.f126800b.get("FEE_SETTINGS");
            case 5:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (dj9.d) e0Var.f126801c.T2("FEE_SETTINGS", dj9.d.class);
            case 6:
                dj9.d0 params = (dj9.d0) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                ne0.n nVar = (ne0.n) e0Var.k.getValue();
                g.Companion.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                long j2 = params.f115167a;
                long j3 = params.f115168b;
                StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "PURCHASE_SIMULATION:", ":");
                sbV.append(j3);
                return (dj9.z) nVar.get(sbV.toString());
            case 7:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ufm.i iVar = new ufm.i(new ufm.f(mra.d.K(mra.d.H(te0.w.i0(e0Var.f126799a.getPayLaterState()), 10000L, new eed.a(29)), 10000L, new t(5)), new s(new q(e0Var, 11), i2), 3), new s(new ej6.x(14), 2), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 8:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (dj9.u) e0Var.f126800b.get("SWITCHER_STATUS");
            case 9:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (dj9.u) e0Var.f126801c.T2("SWITCHER_STATUS", dj9.u.class);
            case 10:
                e key2 = (e) obj2;
                Intrinsics.checkNotNullParameter(key2, "key");
                return (ux4.b) e0Var.f126800b.get(key2.f126797b);
            case 11:
                dj9.u uVar = (dj9.u) obj2;
                w4l.f fVar2 = e0Var.f126802g;
                Unit unit2 = Unit.f186387a;
                Intrinsics.h(uVar);
                fVar2.j(unit2, uVar);
                return unit2;
            default:
                u.b bVar2 = (u.b) obj2;
                w4l.f fVar3 = e0Var.f126802g;
                Unit unit3 = Unit.f186387a;
                Intrinsics.h(bVar2);
                fVar3.j(unit3, bVar2);
                return unit3;
        }
    }
}
