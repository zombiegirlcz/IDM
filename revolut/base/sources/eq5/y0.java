package eq5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.sca_prompt.impl.R$string;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j f128354b;

    public /* synthetic */ y0(com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar, int i) {
        this.f128353a = i;
        this.f128354b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b bVar;
        FundingSource fundingSource;
        xi0.b bVar2;
        int i = this.f128353a;
        int i2 = 6;
        Continuation continuation = null;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = this.f128354b;
        switch (i) {
            case 0:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return jVar.f71278q.c((xi0.b) rVar.f314201a, (CryptoWithdrawLimits) rVar.f314202b, (List) rVar.f314203c);
            case 1:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                return jVar.f71278q.e(((FundingSource) rVar2.f314202b).getF92243g(), (List) rVar2.f314203c, (xi0.b) rVar2.f314201a);
            case 2:
                l1j.e output = (l1j.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof l1j.f) {
                    xi0.a aVar = xi0.b.Companion;
                    String str = ((l1j.f) output).e;
                    aVar.getClass();
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar2 = this.f128354b;
                    jVar2.n2(new e38.c(jVar2, xi0.a.a(str), output, null, 18), new whi.b(i2));
                } else {
                    int i3 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 3:
                jq5.c output2 = (jq5.c) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                jVar.H2(jVar.F, new eq4.c(jVar, output2, 5));
                return Unit.f186387a;
            case 4:
                dii.g output3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof dii.c) {
                    jVar.C1(zh9.u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("question.what-s-the-travel-rule", 2))));
                }
                return Unit.f186387a;
            case 5:
                vrc.j output4 = (vrc.j) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                if (output4.f291576a) {
                    jVar.z.getClass();
                    jVar.X1(new mii.k("SCA_PROMPT_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.crypto_sca_prompt_success, null, null, 14), null, null, null, 28));
                }
                jVar.M2();
                return Unit.f186387a;
            case 6:
                eii.k output5 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output5, "output");
                if (output5 instanceof eii.i) {
                    Object obj3 = ((eii.i) output5).f126655a;
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.crypto.remittance.models.Blockchain");
                    wk5.a aVar2 = (wk5.a) obj3;
                    cli.y yVar = jVar.F;
                    if (((r) ((j2) yVar.f22677a).getValue()).f128309c != aVar2 && (bVar = ((r) ((j2) yVar.f22677a).getValue()).f128308b) != null) {
                        jVar.n2(new com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.e(jVar, bVar, aVar2, null), new whi.b(i2));
                    }
                } else if (output5 instanceof eii.e) {
                    jVar.C1(zh9.u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("question.what-is-the-cryptocurrency-network", 2))));
                } else {
                    int i5 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 7:
                km5.e output6 = (km5.e) obj2;
                Intrinsics.checkNotNullParameter(output6, "output");
                if (Intrinsics.f(output6, km5.d.f185720a) && (fundingSource = ((r) ((j2) jVar.F.f22677a).getValue()).i) != null && (bVar2 = fundingSource.f92241b) != null) {
                    jVar.n2(new eif.j(jVar, bVar2, continuation, 21), new whi.b(i2));
                }
                return Unit.f186387a;
            case 8:
                h1j.b output7 = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(output7, "output");
                if (output7 instanceof h1j.d) {
                    jVar.n2(new eif.j(jVar, output7, continuation, 23), new whi.b(i2));
                } else {
                    int i6 = jli.h.f175850a;
                }
                return Unit.f186387a;
            default:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                return jVar.f71278q.d(((nqi.c) hVar.f288434b).f218471a, (List) hVar.d, (xi0.b) hVar.f288433a, ((FundingSource) hVar.f288435c).f92241b);
        }
    }
}
