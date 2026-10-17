package e8h;

import d8h.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f123705b;

    public /* synthetic */ k0(n0 n0Var, int i) {
        this.f123704a = i;
        this.f123705b = n0Var;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        pdh.e eVar;
        switch (this.f123704a) {
            case 0:
                d8h.b traderProfileDto = (d8h.b) obj2;
                Intrinsics.checkNotNullParameter(traderProfileDto, "dto");
                d8h.a aVar = this.f123705b.f123715c;
                Intrinsics.checkNotNullParameter(traderProfileDto, "traderProfileDto");
                pdh.g gVar = (pdh.g) u1.t(traderProfileDto.getCurrentOnboardingStatus(), pdh.g.UNKNOWN, aVar.f112266a);
                pdh.f fVarA = d8h.a.a(traderProfileDto.getNationality());
                b.a accountPurpose = traderProfileDto.getAccountPurpose();
                String label = accountPurpose.getLabel();
                String value = accountPurpose.getValue();
                if (value == null || (eVar = (pdh.e) u1.v(value, aVar.f112267b)) == null) {
                    eVar = pdh.e.UNKNOWN;
                }
                return new pdh.h(gVar, fVarA, new pdh.d(label, eVar, accountPurpose.getValueLabel()), d8h.a.a(traderProfileDto.getOccupation()), d8h.a.a(traderProfileDto.getNetIncome()), d8h.a.a(traderProfileDto.getNetWorth()), d8h.a.a(traderProfileDto.getEmploymentStatus()), d8h.a.a(traderProfileDto.getEmployer()), d8h.a.a(traderProfileDto.getEmployerIndustry()), d8h.a.a(traderProfileDto.getAffiliated()));
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (d8h.b) this.f123705b.f123714b.get("CACHE_TRADER_PROFILE");
            default:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (d8h.b) j6.a.k(d8h.b.class, this.f123705b.d, "CACHE_TRADER_PROFILE");
        }
    }
}
