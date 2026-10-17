package hwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;
import retrofit2.HttpException;
import retrofit2.Response;
import svi.k;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f156267b;

    public /* synthetic */ x(a0 a0Var, int i) {
        this.f156266a = i;
        this.f156267b = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f156266a;
        ?? arrayList = 0;
        svi.t tVar = null;
        a0 a0Var = this.f156267b;
        switch (i) {
            case 0:
                Response response = (Response) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                a0Var.getClass();
                int iCode = response.code();
                gwi.p0 p0Var = (gwi.p0) response.body();
                if (iCode == 204) {
                    return k.a.f265929a;
                }
                if (iCode != 200 || p0Var == null) {
                    throw new HttpException(response);
                }
                return jwi.c.c(p0Var);
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (svi.c0) a0Var.f156190c.get("KEY_PASSES_LIMITS");
            case 2:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                iwi.h hVar = (iwi.h) a0Var.f156189b.T2("KEY_PASSES_LIMITS", iwi.h.class);
                if (hVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                return new svi.c0(hVar.getMaxEntries());
            case 3:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (svi.b0) a0Var.f156190c.get("KEY_PASSES_PRICING");
            case 4:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                iwi.j jVar = (iwi.j) a0Var.f156189b.T2("KEY_PASSES_PRICING", iwi.j.class);
                if (jVar == null) {
                    return null;
                }
                Object obj3 = jwi.d.f179013a;
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                dj0.d dVarV = hx7.a.v(jVar.getPassPrice());
                List passPricePerPlan = jVar.getPassPricePerPlan();
                if (passPricePerPlan != null) {
                    Intrinsics.checkNotNullParameter(passPricePerPlan, "<this>");
                    List<iwi.i> list = passPricePerPlan;
                    arrayList = new ArrayList(zhm.w.t(list, 10));
                    for (iwi.i iVar : list) {
                        arrayList.add(new svi.h0(iVar.getPlanId(), (svi.y) u1.t(iVar.getPassType(), svi.y.UNKNOWN, jwi.d.f179013a), hx7.a.v(iVar.getPassPrice())));
                    }
                }
                if (arrayList == 0) {
                    arrayList = zhm.f0.f322471a;
                }
                return new svi.b0(dVarV, arrayList);
            case 5:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (svi.k) a0Var.f156190c.get("KEY_MEMBERSHIP");
            case 6:
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (svi.w) a0Var.f156190c.get("KEY_PASSES_REFUND_INFO");
            case 7:
                Unit it14 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                efm.d0<gwi.p0> d0VarRegisterMembership = a0Var.f156188a.registerMembership();
                int i2 = 8;
                hw3.d dVar = new hw3.d(i2, new hwf.b(i2));
                d0VarRegisterMembership.getClass();
                ufm.f fVar = new ufm.f(new ufm.i(d0VarRegisterMembership, dVar, 1), new hw3.d(9, new x(a0Var, 11)), 3);
                Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                return te0.w.i0(fVar);
            case 8:
                Unit it15 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                iwi.f fVar2 = (iwi.f) a0Var.f156189b.T2("KEY_MEMBERSHIP", iwi.f.class);
                if (fVar2 != null) {
                    return jwi.c.d(fVar2);
                }
                return null;
            case 9:
                Unit it16 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (svi.t) a0Var.f156190c.get("KEY_LOUNGE_PASS_QR_CODE");
            case 10:
                Unit it17 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                iwi.g gVar = (iwi.g) a0Var.f156189b.T2("KEY_LOUNGE_PASS_QR_CODE", iwi.g.class);
                if (gVar != null) {
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    String value = gVar.getValue();
                    DateTime dateTime = new DateTime(gVar.getValidUntil());
                    Long validForSeconds = gVar.getValidForSeconds();
                    tVar = new svi.t(value, dateTime, validForSeconds != null ? validForSeconds.longValue() : 0L);
                }
                return tVar;
            default:
                svi.k kVar = (svi.k) obj2;
                w4l.f fVar3 = a0Var.e;
                Unit unit = Unit.f186387a;
                Intrinsics.h(kVar);
                fVar3.j(unit, kVar);
                return unit;
        }
    }
}
