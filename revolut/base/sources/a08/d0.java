package a08;

import com.revolut.feature.insurance_pet.impl.ui.edit.PetEditFlowContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.confirmation.PetPlanConfirmPurchaseContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f178b;

    public /* synthetic */ d0(m0 m0Var, int i) {
        this.f177a = i;
        this.f178b = m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        switch (this.f177a) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return ((uz7.q) this.f178b.f199l).a();
            case 1:
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                m0 m0Var = this.f178b;
                uz7.b bVar = m0Var.f199l;
                String petId = ((uz7.p) m0Var.f200m).l3();
                uz7.q qVar = (uz7.q) bVar;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(petId, "petId");
                ln.a aVar = qVar.f284615a;
                ny7.h.Companion.getClass();
                return aVar.a(new ActivityNavigateCommand(ny7.d.f220691b, new PetEditFlowContract$Configuration.EditPet(petId), null, 200, 0, null, null, null, null, false, 1012));
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                m0 m0Var2 = this.f178b;
                return m0Var2.f202p.c0(new fy7.b((Date) ((uz7.r) ((uz7.p) m0Var2.f200m).e).f284618b.i0().get()));
            default:
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                m0 m0Var3 = this.f178b;
                uz7.p pVar = (uz7.p) m0Var3.f200m;
                String strL3 = pVar.l3();
                uz7.c cVar = pVar.e;
                zw7.c0 c0Var = (zw7.c0) ((uz7.r) cVar).z0().get();
                uz7.r rVar = (uz7.r) cVar;
                zw7.g0 g0Var = (zw7.g0) te0.w.O(rVar.C0());
                if (g0Var == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String strN3 = pVar.n3();
                if (strN3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Date date = (Date) ((uz7.r) cVar).f284618b.i0().get();
                pfm.a aVar2 = new pfm.a(te0.w.N(rVar.f284622j.getValue(rVar, uz7.r.f284617m[7])), new uz7.f(2, new uz7.e(pVar, 6)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                pfm.a aVarV = ue0.e.v(aVar2);
                uz7.b bVar2 = m0Var3.f199l;
                PetPlanConfirmPurchaseContract$Configuration config = new PetPlanConfirmPurchaseContract$Configuration(strL3, c0Var, date, g0Var, strN3);
                uz7.q qVar2 = (uz7.q) bVar2;
                qVar2.getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                ln.a aVar3 = qVar2.f284615a;
                xz7.d.Companion.getClass();
                pfm.a aVarE = aVarV.e(aVar3.a(new ActivityNavigateCommand(xz7.a.f309868b, config, null, null, 0, null, null, null, null, false, 1020)));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
        }
    }
}
