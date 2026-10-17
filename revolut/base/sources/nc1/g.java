package nc1;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ma1.x;
import nii.l1;
import nii.m1;
import nii.n1;
import rp0.k1;
import sa1.v;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f214129b;

    public /* synthetic */ g(m mVar, int i) {
        this.f214128a = i;
        this.f214129b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f214128a) {
            case 0:
                com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a it8 = (com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean zF = Intrinsics.f(it8, a.C0448a.f60624a);
                m mVar = this.f214129b;
                if (zF) {
                    mVar.u2();
                } else {
                    if (!Intrinsics.f(it8, a.b.f60625a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.C2();
                }
                return Unit.f186387a;
            case 1:
                n1 dialogResult = (n1) obj2;
                Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                if (dialogResult instanceof l1) {
                    m mVar2 = this.f214129b;
                    v vVar = (v) ((x) mVar2.u).f203913a;
                    vVar.getClass();
                    r rVarCreate = r.create(new s65.o(vVar, 27));
                    Intrinsics.checkNotNullExpressionValue(rVarCreate, "create(...)");
                    zii.i.E0(mVar2, rVarCreate, new g(mVar2, 4), null, 14);
                }
                return Unit.f186387a;
            case 2:
                n1 dialogResult2 = (n1) obj2;
                Intrinsics.checkNotNullParameter(dialogResult2, "dialogResult");
                m mVar3 = this.f214129b;
                mVar3.A.d.onNext(xc1.d.f);
                if (dialogResult2 instanceof l1) {
                    mVar3.C2();
                } else {
                    mVar3.u2();
                }
                return Unit.f186387a;
            case 3:
                n1 dialogResult3 = (n1) obj2;
                Intrinsics.checkNotNullParameter(dialogResult3, "dialogResult");
                m mVar4 = this.f214129b;
                mVar4.A.d.onNext(xc1.d.f);
                if (dialogResult3 instanceof m1) {
                    mVar4.u2();
                } else {
                    mVar4.B2();
                    mVar4.G2(d.AMOUNT);
                    mVar4.B.S(false);
                }
                return Unit.f186387a;
            case 4:
                if (!((Boolean) obj2).booleanValue()) {
                    ((k1) this.f214129b.C).d(new ShotDialogDisplayer$Configuration("cancel_failed", new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_cancelling_failed, null, null, 14), null, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
                }
                return Unit.f186387a;
            case 5:
                n1 dialogResult4 = (n1) obj2;
                Intrinsics.checkNotNullParameter(dialogResult4, "dialogResult");
                m mVar5 = this.f214129b;
                mVar5.A.d.onNext(xc1.d.f);
                if (dialogResult4 instanceof l1) {
                    mVar5.C2();
                } else if (dialogResult4 instanceof m1) {
                    mVar5.u2();
                } else {
                    mVar5.B2();
                    mVar5.G2(d.AMOUNT);
                    mVar5.B.S(false);
                }
                return Unit.f186387a;
            case 6:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                String str = (String) kVar.f288454a;
                xi0.b bVar = (xi0.b) kVar.f288455b;
                String str2 = (String) kVar.f288456c;
                boolean zBooleanValue = ((Boolean) kVar.d).booleanValue();
                d dVar = (d) kVar.e;
                Intrinsics.h(dVar);
                return new c(str, bVar, str2, zBooleanValue, dVar, this.f214129b.L);
            default:
                xi0.b currency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.f214129b.H.d(currency);
                return Unit.f186387a;
        }
    }
}
