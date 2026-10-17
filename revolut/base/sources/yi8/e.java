package yi8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_payment_links.impl.R$string;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlowContract$Input;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlowContract$Step;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import ht0.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mii.k;
import oki.h;
import te8.z;
import wsg.n;
import yhm.r;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a f314269b;

    public /* synthetic */ e(com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a aVar, int i) {
        this.f314268a = i;
        this.f314269b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f314268a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h.D2(this.f314269b.u);
                return Boolean.FALSE;
            case 1:
                bj8.e output = (bj8.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof bj8.d;
                com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a aVar = this.f314269b;
                if (z) {
                    h.t2(aVar, aVar.u, new JuniorCardProfileFlowContract$Step.CustomAmountSetup(((bj8.d) output).f15585a), true, null, false, 12);
                } else {
                    if (!Intrinsics.f(output, bj8.c.f15584a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.H2(aVar.v, new yi5.b(1));
                    aVar.f77089t.getClass();
                    aVar.X1(new k("DIALOG_ID_CUSTOM_LINK_CANCELED", new TextLocalisedClause(R$string.junior_payment_links_custom_amount_screen_shot_dialog_link_cancelled, null, null, 14), null, null, null, 28));
                }
                return Unit.f186387a;
            case 2:
                ti8.f output2 = (ti8.f) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                boolean zF = Intrinsics.f(output2, ti8.d.f271447a);
                com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a aVar2 = this.f314269b;
                if (zF) {
                    aVar2.X1(new k("DIALOG_ID_PAYMENT_LINKS_CONSENT_GIVEN", new TextLocalisedClause(R$string.junior_payment_links_qr_screen_toast_payment_links_turned_on, null, null, 14), null, null, null, 28));
                    h.t2(aVar2, aVar2.u, JuniorCardProfileFlowContract$Step.CardProfile.f77080a, true, null, false, 12);
                } else {
                    if (!Intrinsics.f(output2, ti8.e.f271448a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.D2(aVar2.u);
                }
                return Unit.f186387a;
            case 3:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a aVar3 = this.f314269b;
                if (zBooleanValue) {
                    return new go.g(zi0.c.P(new b0(0, aVar3, com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a.class, "navigateToCardProfile", "navigateToCardProfile()V", 0, 27), false, null, 3), 2);
                }
                n nVar = aVar3.f77086q;
                JuniorCardProfileFlowContract$Input juniorCardProfileFlowContract$Input = aVar3.o;
                String str = juniorCardProfileFlowContract$Input.f77079a;
                String str2 = juniorCardProfileFlowContract$Input.f77079a;
                return nim.a.v(u0.i(rd0.e.b(osg.b.a(nVar, str, false, 4)), rd0.e.b(z.b(aVar3.f77087r, str2, false, 6)), hj8.a.a(aVar3.f77088s, str2, w4l.h.f294642c)), new e(aVar3, 4));
            default:
                r rVar = (r) obj2;
                psg.a aVar4 = (psg.a) rVar.f314201a;
                of8.b bVar = (of8.b) rVar.f314202b;
                return new kul.b(this.f314269b, aVar4, bVar.f224756n.f235520a == of8.a.ENABLED, (JuniorBankingProfile) rVar.f314203c, 7);
        }
    }
}
