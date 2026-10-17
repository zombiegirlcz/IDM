package xzd;

import com.google.android.gms.wallet.WalletConstants;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pzd.x;
import s7a.a0;
import s7a.c0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.custom_statement.screen.b f309939b;

    public /* synthetic */ o(com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar, int i) {
        this.f309938a = i;
        this.f309939b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f309938a) {
            case 0:
                gzd.f result = (gzd.f) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar = this.f309939b;
                bVar.J2(CustomisationSelection.copy$default(bVar.I2(), null, null, null, false, null, null, null, null, result.f148056a, 255, null));
                return Unit.f186387a;
            case 1:
                h1j.b result2 = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof h1j.c) {
                    com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar2 = this.f309939b;
                    CustomisationSelection customisationSelectionI2 = bVar2.I2();
                    xi0.a aVar = xi0.b.Companion;
                    String str = ((h1j.c) result2).f148579a;
                    aVar.getClass();
                    bVar2.J2(CustomisationSelection.copy$default(customisationSelectionI2, null, null, xi0.a.a(str), false, null, null, null, null, null, 507, null));
                }
                return Unit.f186387a;
            case 2:
                gzd.f result3 = (gzd.f) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar3 = this.f309939b;
                bVar3.J2(CustomisationSelection.copy$default(bVar3.I2(), null, null, null, false, null, null, null, result3.f148056a, null, 383, null));
                return Unit.f186387a;
            case 3:
                a0 output = (a0) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                c0 c0Var = output.f260599a;
                nzd.a aVar2 = c0Var instanceof nzd.a ? (nzd.a) c0Var : null;
                if (aVar2 != null) {
                    com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar4 = this.f309939b;
                    bVar4.J2(CustomisationSelection.copy$default(bVar4.I2(), null, aVar2.f221022a, null, false, null, null, null, null, null, 509, null));
                }
                return Unit.f186387a;
            case 4:
                izd.g result4 = (izd.g) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar5 = this.f309939b;
                bVar5.J2(CustomisationSelection.copy$default(bVar5.I2(), null, null, null, false, null, result4.f169874a, result4.f169875b, null, null, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, null));
                return Unit.f186387a;
            case 5:
                xxd.a result5 = (xxd.a) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar6 = this.f309939b;
                bVar6.J2(CustomisationSelection.copy$default(bVar6.I2(), result5.f309507a, null, null, false, null, null, null, null, null, 510, null));
                return Unit.f186387a;
            case 6:
                return this.f309939b.v.c((Throwable) obj2);
            default:
                vyd.a aVar3 = this.f309939b.v;
                x xVar = (x) obj2;
                if (xVar instanceof pzd.t) {
                    return aVar3.b(((pzd.t) xVar).f240978a);
                }
                if (xVar instanceof pzd.w) {
                    return aVar3.a();
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
