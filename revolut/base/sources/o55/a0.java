package o55;

import androidx.room.RxRoom;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n33.v0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f222316b;

    public /* synthetic */ a0(f0 f0Var, int i) {
        this.f222315a = i;
        this.f222316b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f222315a) {
            case 0:
                Map countryConfigs = (Map) obj2;
                Intrinsics.checkNotNullParameter(countryConfigs, "countryConfigs");
                f0 f0Var = this.f222316b;
                efm.d0<List<k55.r>> loansLegacy = f0Var.f222335b.getLoansLegacy();
                o4a.e eVar = new o4a.e(24, new b0(countryConfigs, f0Var, 0));
                loansLegacy.getClass();
                return new ufm.i(loansLegacy, eVar, 1);
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (Map) this.f222316b.f222336c.get("loan_country_configuration");
            case 2:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                ue0.c cVar = this.f222316b.e;
                Type type = g0.f222342c;
                Intrinsics.checkNotNullExpressionValue(type, "<get-LOAN_COUNTRY_CONFIGURATIONS_TYPE>(...)");
                Map map = (Map) cVar.T2("loan_country_configuration", type);
                if (map != null) {
                    return f55.a.a(map);
                }
                return null;
            case 3:
                i it9 = (i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return RxRoom.createObservable(this.f222316b.d.f212295a, false, new String[]{"loan_preferences"}, new v0(20));
            case 4:
                String loanDetailsId = (String) obj2;
                Intrinsics.checkNotNullParameter(loanDetailsId, "loanDetailsId");
                return (p35.e0) v7.r("loan_details", loanDetailsId, this.f222316b.f222336c);
            case 5:
                String loanDetailsId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(loanDetailsId2, "loanDetailsId");
                f0 f0Var2 = this.f222316b;
                ufm.i iVar = new ufm.i(f0Var2.a(), new o4a.e(28, new d0(f0Var2, loanDetailsId2, 1)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 6:
                String it10 = (String) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (List) this.f222316b.f222336c.get("loans-management");
            case 7:
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                f0 f0Var3 = this.f222316b;
                ufm.i iVar2 = new ufm.i(f0Var3.a(), new o4a.e(29, new a0(f0Var3, 8)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                return iVar2;
            default:
                Map countryConfigs2 = (Map) obj2;
                Intrinsics.checkNotNullParameter(countryConfigs2, "countryConfigs");
                return new ufm.c(new m1i.t(this.f222316b, countryConfigs2, 15), 2);
        }
    }
}
