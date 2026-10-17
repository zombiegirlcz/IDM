package cu8;

import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.retail.core.navigation.CollapseApplicationCommand;
import com.revolut.retail.core.navigation.FinishCommand;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s0 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.f f108895b;

    public /* synthetic */ s0(com.revolut.feature.kyc.impl.f fVar, int i) {
        this.f108894a = i;
        this.f108895b = fVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f108894a) {
            case 0:
                com.revolut.feature.kyc.impl.f fVar = this.f108895b;
                ihm.j jVar = fVar.k;
                n1 n1Var = (n1) fVar.f77668b;
                jVar.onNext(new FinishCommand(-1, a0.d.x(((KycContract$Requirement) n1Var.u.getValue(n1Var, n1.f108861y[20]).get()).f77468b, "Skipped"), null, 4));
                break;
            case 1:
                this.f108895b.k.onNext(new FinishCommand(null, null, null, 7));
                break;
            case 2:
                this.f108895b.k.onNext(CollapseApplicationCommand.f98628a);
                break;
            case 3:
                this.f108895b.k.onNext(new FinishCommand(null, null, null, 7));
                break;
            default:
                this.f108895b.k.onNext(new FinishCommand(null, null, null, 7));
                break;
        }
    }
}
