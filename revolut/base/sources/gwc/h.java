package gwc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_bills_taxes.impl.ui.errors.FormServerError;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListScreen;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import ga1.p;
import gyi.d0;
import h54.l;
import igk.a0;
import igk.b0;
import igk.c0;
import igk.y;
import igk.z;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import svi.m;
import svi.r;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v20 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = true;
        boolean z3 = true;
        z = true;
        int i = 0;
        switch (this.f) {
            case 0:
                fwc.q p0 = (fwc.q) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                i.I2((i) this.receiver, p0);
                return Unit.f186387a;
            case 1:
                fwc.q p03 = (fwc.q) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                i.I2((i) this.receiver, p03);
                return Unit.f186387a;
            case 2:
                gyi.g payload = (gyi.g) obj2;
                Intrinsics.checkNotNullParameter(payload, "p0");
                AirportLoungesPassListScreen airportLoungesPassListScreen = (AirportLoungesPassListScreen) this.receiver;
                KProperty[] kPropertyArr = AirportLoungesPassListScreen.X;
                d0 d0Var = (d0) airportLoungesPassListScreen.k3();
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                String str = payload.f147886a;
                Object obj3 = payload.f147887b;
                int iHashCode = str.hashCode();
                if (iHashCode != -934813832) {
                    if (iHashCode != -833225442) {
                        if (iHashCode == 3108362 && str.equals("edit")) {
                            r rVar = obj3 instanceof r ? (r) obj3 : null;
                            if (rVar != null) {
                                d0Var.C2(new gyi.c(rVar.f265969a, rVar.f265977n, rVar.o));
                            }
                        }
                    } else if (str.equals("gifted_info")) {
                        m mVar = obj3 instanceof m ? (m) obj3 : null;
                        if (mVar != null) {
                            d0Var.C2(new gyi.f(mVar));
                        }
                    }
                } else if (str.equals("refund")) {
                    rVar = obj3 instanceof r ? (r) obj3 : 0;
                    if (rVar != 0) {
                        String str2 = rVar.o;
                        String str3 = rVar.f265977n;
                        String str4 = rVar.f265969a;
                        if ((str3 == null || kotlin.text.d0.W(str3)) && (str2 == null || kotlin.text.d0.W(str2))) {
                            z = false;
                        }
                        d0Var.C2(new gyi.d(str4, str3, str2, z));
                    }
                }
                return Unit.f186387a;
            case 3:
                StatusViewConfiguration p010 = (StatusViewConfiguration) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                ((k3l.d) ((k3l.b) this.receiver)).O(p010);
                return Unit.f186387a;
            case 4:
                ((Function0) this.receiver).invoke();
                return Unit.f186387a;
            case 5:
                ((Function0) this.receiver).invoke();
                return Unit.f186387a;
            case 6:
                ((Function0) this.receiver).invoke();
                return Unit.f186387a;
            case 7:
                ((Function0) this.receiver).invoke();
                return Unit.f186387a;
            case 8:
                igk.d0 p011 = (igk.d0) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.receiver;
                dVar.getClass();
                if (p011 instanceof a0) {
                    a0 a0Var = (a0) p011;
                    hha.d dVar2 = a0Var.f161232a;
                    hha.i iVar = a0Var.f161233b;
                    PricingPlanOffer pricingPlanOffer = a0Var.f161234c;
                    dVar.S2(dVar2, iVar, pricingPlanOffer != null ? pricingPlanOffer.f81123a : null);
                } else if (p011 instanceof z) {
                    z zVar = (z) p011;
                    hha.d dVar3 = zVar.f161281a;
                    PricingPlanOffer pricingPlanOffer2 = zVar.f161282b;
                    dVar.S2(dVar3, null, pricingPlanOffer2 != null ? pricingPlanOffer2.f81123a : null);
                } else if (p011 instanceof c0) {
                    dVar.S2(((c0) p011).f161240a, null, null);
                } else if (p011 instanceof y) {
                    y yVar = (y) p011;
                    hha.d dVar4 = yVar.f161278a;
                    hha.i iVar2 = yVar.f161279b;
                    PricingPlanOffer pricingPlanOffer3 = yVar.f161280c;
                    dVar.S2(dVar4, iVar2, pricingPlanOffer3 != null ? pricingPlanOffer3.f81123a : null);
                } else {
                    if (!(p011 instanceof b0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "CreditApplicationFlowModel", "CC plan selection was skipped", null, h0Var);
                    dVar.n2(new l(dVar, rVar, 13), new whi.b(6));
                }
                return Unit.f186387a;
            case 9:
                ((Function0) this.receiver).invoke();
                return Unit.f186387a;
            case 10:
                ((Function0) this.receiver).invoke();
                return Unit.f186387a;
            case 11:
                String p012 = (String) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                return ((h8b.f) this.receiver).f2(p012);
            case 12:
                String p013 = (String) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                return ((h8b.f) this.receiver).f2(p013);
            case 13:
                String p014 = (String) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                return ((h8b.f) this.receiver).Y1(p014);
            case 14:
                iel.a p015 = (iel.a) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                return ((h8b.h) this.receiver).Z2(p015);
            case 15:
                String p016 = (String) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                return ((h8b.f) this.receiver).Y1(p016);
            case 16:
                String p017 = (String) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                return ((h8b.f) this.receiver).Y1(p017);
            case 17:
                Throwable p018 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                q7e.b.d((yji.l) this.receiver, p018);
                return Boolean.TRUE;
            case 18:
                q90.i p019 = (q90.i) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                return ((t90.g) this.receiver).a(p019);
            case 19:
                q90.i p020 = (q90.i) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                return ((t90.g) this.receiver).a(p020);
            case 20:
                p p021 = (p) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                return ((ia1.d) this.receiver).a(p021);
            case 21:
                p p022 = (p) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                return ((ia1.d) this.receiver).a(p022);
            case 22:
                p p023 = (p) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                return ((ia1.d) this.receiver).a(p023);
            case 23:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "p0");
                ((hba.h) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new nii.z(new TextLocalisedClause(R$string.pix_ownership_claim_accept_failure_title, null, null, 14), null, new TextLocalisedClause(R$string.pix_alias_registration_action_try_again, null, null, 14), new TextLocalisedClause(R$string.pix_alias_registration_action_got_it, null, null, 14), null, null, false, null, null, null, null, null, null, 32726);
            case 24:
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "p0");
                ((hba.h) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                return new nii.z(new TextLocalisedClause(R$string.pix_migration_details_accept_failure_title, null, null, 14), null, new TextLocalisedClause(R$string.pix_alias_registration_action_try_again, null, null, 14), new TextLocalisedClause(R$string.pix_alias_registration_action_got_it, null, null, 14), null, null, false, null, null, null, null, null, null, 32726);
            case 25:
                Throwable throwable3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable3, "p0");
                ((hba.h) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(throwable3, "throwable");
                return new nii.z(new TextLocalisedClause(R$string.pix_migration_details_cancel_failure_title, null, null, 14), null, new TextLocalisedClause(R$string.pix_alias_registration_action_try_again, null, null, 14), new TextLocalisedClause(R$string.pix_alias_registration_action_got_it, null, null, 14), null, null, false, null, null, null, null, null, null, 32726);
            case 26:
                Throwable throwable4 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable4, "p0");
                ((hba.h) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(throwable4, "throwable");
                return new nii.z(new TextLocalisedClause(R$string.pix_ownership_claim_cancel_failure_title, null, null, 14), null, new TextLocalisedClause(R$string.pix_alias_registration_action_try_again, null, null, 14), new TextLocalisedClause(R$string.pix_alias_registration_action_got_it, null, null, 14), null, null, false, null, null, null, null, null, null, 32726);
            case 27:
                je8.f p024 = (je8.f) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a aVar = (com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a) this.receiver;
                aVar.getClass();
                int i2 = 26;
                if (Intrinsics.f(p024, je8.d.f173237a)) {
                    aVar.l2(new he8.g(aVar, rVar, i), new yi5.b(i2));
                } else {
                    if (!Intrinsics.f(p024, je8.e.f173238a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.l2(new he8.g(aVar, rVar, z ? 1 : 0), new yi5.b(i2));
                }
                return Unit.f186387a;
            case 28:
                Throwable p025 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                hg9.m mVar2 = (hg9.m) this.receiver;
                FormServerError formServerErrorJ = mVar2.f152126p.j(p025);
                if (formServerErrorJ != null) {
                    mVar2.H2(mVar2.f152129s, new h8b.b(mVar2, formServerErrorJ, 18));
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                kkd.c p026 = (kkd.c) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                ((hie.a) this.receiver).getClass();
                return Boolean.valueOf(kotlin.text.d0.J(p026.a(), "revolut://app/joint-accounts/invitations/remind/", false));
        }
    }
}
