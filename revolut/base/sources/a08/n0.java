package a08;

import com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackScreenContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.action.PetRenewalActionContract$RenewalOptInAction;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import ip0.um0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zx7.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f205b;

    public /* synthetic */ n0(v0 v0Var, int i) {
        this.f204a = i;
        this.f205b = v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f204a) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return this.f205b.o.c0(j.b.f326079a);
            case 1:
                um0 it8 = (um0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (Intrinsics.f(it8.f166695a, "REJECT_RENEWAL_DIALOG_TWIN_BUTTON_ID")) {
                    return this.f205b.o.c0(j.a.f326078a);
                }
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                um0 um0Var = (um0) pair.f186385a;
                zw7.d0 d0Var = (zw7.d0) pair.f186386b;
                if (!Intrinsics.f(um0Var.f166695a, "REJECT_RENEWAL_DIALOG_TWIN_BUTTON_ID")) {
                    pfm.m mVar2 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                    return mVar2;
                }
                v0 v0Var = this.f205b;
                efm.b bVarC0 = v0Var.o.c0(j.a.f326078a);
                uz7.b bVar = v0Var.f230l;
                String str = d0Var.f325764a;
                String str2 = d0Var.d;
                zw7.s0 s0Var = d0Var.o;
                Intrinsics.checkNotNullParameter(s0Var, "<this>");
                CancellationFeedbackScreenContract$Configuration.RejectRenewal config = new CancellationFeedbackScreenContract$Configuration.RejectRenewal(str, str2, ((zw7.r0) s0Var).f325839a);
                uz7.q qVar = (uz7.q) bVar;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                ln.a aVar = qVar.f284615a;
                by7.k.Companion.getClass();
                pfm.a aVarE = bVarC0.e(aVar.a(new ActivityNavigateCommand(by7.g.f19774b, config, null, null, 0, null, null, null, null, false, 1020)));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 3:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return ((uz7.q) this.f205b.f230l).a();
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                v0 v0Var2 = this.f205b;
                mm.d dVar = v0Var2.o;
                uz7.p pVar = (uz7.p) v0Var2.f231m;
                String strL3 = pVar.l3();
                String strN3 = pVar.n3();
                uz7.r rVar = (uz7.r) pVar.e;
                return dVar.c0(new PetRenewalActionContract$RenewalOptInAction(strL3, strN3, false, !((Boolean) rVar.f284623l.getValue(rVar, uz7.r.f284617m[9]).get()).booleanValue(), new FinishCommand(null, null, null, 7)));
        }
    }
}
