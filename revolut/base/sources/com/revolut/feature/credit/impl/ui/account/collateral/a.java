package com.revolut.feature.credit.impl.ui.account.collateral;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.api.navigation.SecurityDepositInfoDestination;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.impl.ui.account.collateral.CollateralPocketMapperImpl;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import pfe.c;
import rd0.e;
import rp0.m;
import sfe.h;
import sfe.m;
import sfe.s;
import sx4.f;
import x6e.d;
import xi0.b;
import yji.n;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f70020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i25.c f70021n;
    public final d o;

    public a(j60.a bottomDialogDisplayer, i25.c collateralPocketMapper, d subaccountEventProvider) {
        Intrinsics.checkNotNullParameter(bottomDialogDisplayer, "bottomDialogDisplayer");
        Intrinsics.checkNotNullParameter(collateralPocketMapper, "collateralPocketMapper");
        Intrinsics.checkNotNullParameter(subaccountEventProvider, "subaccountEventProvider");
        this.f70020m = bottomDialogDisplayer;
        this.f70021n = collateralPocketMapper;
        this.o = subaccountEventProvider;
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, e.b(this.o.f303064a), null, new i25.a(this, null), 3);
    }

    @Override // pfe.c
    public final Object b3(s sVar, Continuation continuation) {
        if (sVar instanceof m) {
            m mVar = (m) sVar;
            Object obj2 = mVar.f262421c;
            String str = mVar.f262419a;
            int iHashCode = str.hashCode();
            if (iHashCode != 764107610) {
                if (iHashCode != 1676354578) {
                    if (iHashCode == 2009090486 && str.equals("COLLATERAL_INFO")) {
                        A2(new SecurityDepositInfoDestination(mVar.f262420b.f89729a));
                    }
                } else if (str.equals("COLLATERAL_WITHDRAW")) {
                    Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.credit.impl.ui.account.collateral.CollateralPocketMapperImpl.CollateralPocketParcel");
                    i25.d dVar = (i25.d) obj2;
                    A2(new CreditCardKompotFeatureConfig.CollateralMoveMoneyDestination(dVar.f157842a, dVar.f157843b, com.revolut.feature.credit.card.api.navigation.a.WITHDRAWAL));
                }
            } else if (str.equals("COLLATERAL_ADD_MONEY")) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.credit.impl.ui.account.collateral.CollateralPocketMapperImpl.CollateralPocketParcel");
                i25.d dVar2 = (i25.d) obj2;
                A2(new CreditCardKompotFeatureConfig.CollateralMoveMoneyDestination(dVar2.f157842a, dVar2.f157843b, com.revolut.feature.credit.card.api.navigation.a.ADD_MONEY));
            }
        } else if (sVar instanceof sfe.n) {
            Object obj3 = ((sfe.n) sVar).f262423b;
            if (obj3 instanceof t) {
                ActionWidgetDelegate.Model model = ((t) obj3).f54722b;
                if (Intrinsics.f(model.f51590a, "SECURITY_DEPOSIT_EMPTY_ACTION")) {
                    Object obj4 = model.f51596l;
                    Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.credit.impl.ui.account.collateral.CollateralPocketMapperImpl.CollateralPocketParcel");
                    i25.d dVar3 = (i25.d) obj4;
                    A2(new CreditCardKompotFeatureConfig.CollateralMoveMoneyDestination(dVar3.f157842a, dVar3.f157843b, com.revolut.feature.credit.card.api.navigation.a.ADD_MONEY));
                }
            }
        } else if (sVar instanceof h) {
            h hVar = (h) sVar;
            Object obj5 = hVar.f262411b;
            CollateralPocketMapperImpl.CollateralSubtitlePayload collateralSubtitlePayload = obj5 instanceof CollateralPocketMapperImpl.CollateralSubtitlePayload ? (CollateralPocketMapperImpl.CollateralSubtitlePayload) obj5 : null;
            if (collateralSubtitlePayload != null) {
                String facilityId = collateralSubtitlePayload.f70018a;
                CreditCardSecurityDeposit securityDeposit = collateralSubtitlePayload.f70019b;
                ((CollateralPocketMapperImpl) this.f70021n).getClass();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(securityDeposit, "securityDeposit");
                m.b bVar = rp0.m.Companion;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_collateral_account_subtitle_bottom_sheet_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_collateral_account_subtitle_bottom_sheet_subtitle, null, null, 14);
                aim.e eVarB = u.b();
                boolean z = false;
                RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6);
                int i = R$string.credit_collateral_account_subtitle_bottom_sheet_rows_add_money;
                long j2 = securityDeposit.e;
                b bVar2 = securityDeposit.f68756c;
                eVarB.add(new RowDelegate.Model("id_add_money", image24, new TextLocalisedClause(i, u.c(f.b(3, null, null, new dj0.d(j2, bVar2))), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                boolean z3 = false;
                eVarB.add(new RowDelegate.Model("id_move_money", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_shuffle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), new TextLocalisedClause(R$string.credit_collateral_account_subtitle_bottom_sheet_rows_move_money, u.c(f.b(3, null, null, new dj0.d(securityDeposit.d, bVar2))), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                int i2 = securityDeposit.f;
                boolean z4 = false;
                eVarB.add(new RowDelegate.Model("id_repayments", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_repayment, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, 6), new TextLocalisedClause(R$string.credit_collateral_account_subtitle_bottom_sheet_rows_repayments_template, u.c(new PeriodClause(new PeriodClause.PeriodComponents(0, i2 / 30, i2 % 30, 0, 0, 0, 57), null)), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                aim.e eVarA = u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                this.f70020m.x(dy4.b.a(bVar, textLocalisedClause, textLocalisedClause2, new p("SECURITY_DEPOSIT_GO_TO_CREDIT", new TextLocalisedClause(R$string.credit_collateral_account_subtitle_bottom_sheet_go_to_credit, null, null, 14), facilityId), null, eVarA, Constants.TAG_PCI_PED_CHECKSUM));
            } else {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar = rd0.c.ERROR;
                String simpleName = sVar.getClass().getSimpleName();
                String str2 = hVar.f262410a.f89729a;
                String name = obj5 != null ? obj5.getClass().getName() : null;
                StringBuilder sbM = v0.a.m("Cannot handle event, security deposit is null: eventType=", simpleName, ", accountId=", str2, ", payloadType=");
                sbM.append(name);
                rd0.d.a(cVar, "CollateralPocketEventHandler", sbM.toString(), null, h0Var);
            }
        } else {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "CollateralPocketEventHandler", "Cannot handle eventType=".concat(sVar.getClass().getSimpleName()), null, h0Var2);
        }
        return Unit.f186387a;
    }
}
