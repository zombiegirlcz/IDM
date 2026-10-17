package b9k;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.tc;
import com.revolut.core.ui_kit.delegates.uc;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.freelancer.impl.R$plurals;
import java.util.List;
import kkf.i6;
import kkf.m6;
import kkf.u4;
import kkf.x4;
import klf.j1;
import kotlin.jvm.internal.Intrinsics;
import lr6.w;
import lr6.x;
import tof.a3;
import tof.p5;
import tof.q5;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a extends kotlin.jvm.internal.a implements oim.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13805a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f13805a = i3;
    }

    private final Object a(Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        u4 u4Var = (u4) obj3;
        j1 j1Var = (j1) obj4;
        x4 x4Var = (x4) this.receiver;
        x4Var.getClass();
        aim.e eVarB = u.b();
        if (zBooleanValue && u4Var.f184966a && !j1Var.c()) {
            m35.e eVar = x4Var.f185014n;
            dj0.d maxLoanAmount = u4Var.f184967b;
            ((c55.l) eVar).getClass();
            Intrinsics.checkNotNullParameter(maxLoanAmount, "maxLoanAmount");
            BannerDelegate.Model model = new BannerDelegate.Model("LOAN_BANNER_ITEM_ID", new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D072", null, null, null, 30)), new TextLocalisedClause(R$string.credit_declined_transaction_loan_banner_title, null, null, 14), new TextLocalisedClause(R$string.credit_declined_transaction_loan_banner_subtitle, u.c(new MoneyClause(maxLoanAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), false, false, null, null, null, null, null, 65488);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        return u.a(eVarB);
    }

    private final Object b(Object obj2, Object obj3, Object obj4, Object obj5) {
        a3 a3Var = (a3) obj2;
        w wVar = (w) obj3;
        j1 j1Var = (j1) obj4;
        jr6.m mVar = ((m6) this.receiver).o;
        aim.e eVarB = u.b();
        if (wVar != null && !j1Var.c()) {
            p5 p5Var = a3Var.f272612s0;
            q5 q5Var = p5Var != null ? p5Var.f272990c : null;
            switch (q5Var == null ? -1 : i6.f184752a[q5Var.ordinal()]) {
                case 1:
                    x details = wVar.f199419b;
                    if (details != null) {
                        if (details.f199422c.compareTo(details.d) >= 0 && details.f199420a >= details.f199421b) {
                            details = null;
                        }
                        if (details != null) {
                            ((ct6.t) mVar).getClass();
                            Intrinsics.checkNotNullParameter(details, "details");
                            tc tcVar = new tc("ID_IN_PERSON_SETTLEMENT_BANNER", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_settlement_unlock_progress_banner_in_person_title, null, null, 14), new TextLocalisedQuantityClause(R$plurals.freelancer_settlement_unlock_progress_banner_common_subtitle, (Number) 2, v.k(2, Integer.valueOf(ct6.t.j(details))), (Style) null, 24), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D166", null, null, null, 30), new uc((ct6.t.j(details) * 100) / 2));
                            yp0.b.l(tcVar, 0, 0, 0, 0, null, false, 63);
                            eVarB.add(tcVar);
                        }
                    }
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    x details2 = wVar.f199418a;
                    if (details2.f199422c.compareTo(details2.d) >= 0 && details2.f199420a >= details2.f199421b) {
                        details2 = null;
                    }
                    if (details2 != null) {
                        ((ct6.t) mVar).getClass();
                        Intrinsics.checkNotNullParameter(details2, "details");
                        tc tcVar2 = new tc("ID_ONLINE_SETTLEMENT_BANNER", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_settlement_unlock_progress_banner_online_title, null, null, 14), new TextLocalisedQuantityClause(R$plurals.freelancer_settlement_unlock_progress_banner_common_subtitle, (Number) 2, v.k(2, Integer.valueOf(ct6.t.j(details2))), (Style) null, 24), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D098", null, null, null, 30), new uc((ct6.t.j(details2) * 100) / 2));
                        yp0.b.l(tcVar2, 0, 0, 0, 0, null, false, 63);
                        eVarB.add(tcVar2);
                    }
                    break;
            }
        }
        return u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0b83  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0bca  */
    @Override // oim.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r55, java.lang.Object r56, java.lang.Object r57, java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 3108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
