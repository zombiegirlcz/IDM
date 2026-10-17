package pza;

import aa0.a1;
import aa0.b1;
import aa0.e0;
import aa0.f1;
import aa0.h1;
import aa0.q0;
import aa0.t;
import aa0.u0;
import aa0.w0;
import android.content.Context;
import androidx.camera.core.CameraX;
import androidx.camera.lifecycle.LifecycleCameraProviderImpl;
import aw0.o9;
import b9.w2;
import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.core.android.model.country.CountryInfo;
import com.revolut.core.backend_flow.ui.BackendFlowChooserConfigurationType;
import com.revolut.core.ui_kit.delegates.widgets.TravelModeWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.v4;
import com.revolut.core.ui_kit.delegates.widgets.w4;
import com.revolut.core.ui_kit.delegates.widgets.x4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.backend_flow.domain.models.BackendFlowBinary;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadResult;
import com.revolut.feature.backend_flow.domain.models.CheckboxTextInputItem;
import com.revolut.feature.backend_flow.domain.models.ChipsSelectionItem;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionOption;
import com.revolut.feature.backend_flow.domain.models.FiltersInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.MoneyInputItem;
import com.revolut.feature.backend_flow.domain.models.MultiSelectionItem;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonTextInputItem;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import com.revolut.feature.backend_flow.domain.models.SignatureInputItem;
import com.revolut.feature.backend_flow.domain.models.SingleSelectionItem;
import com.revolut.feature.backend_flow.domain.models.TextInputItem;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.derivatives.models.BalanceWithPnl;
import com.revolut.feature.derivatives.models.DerivativesBalance;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.BrazilInboundOpenbankingFlowContract$Step;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.RevPointsGiftcardsFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$State;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$State;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.sso.impl.domain.models.Identifier;
import do3.n;
import efm.d0;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import q2j.q;
import q2j.s;
import q2j.x;
import q97.p1;
import qc0.j0;
import qwf.z;
import r40.n0;
import skm.a2;
import te0.w;
import tof.i7;
import vkm.j2;
import xl2.h0;
import xl2.r;
import yhm.o;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f240920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f240921c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj2, int i, Object obj3, Object obj4) {
        this.f240919a = i;
        this.f240920b = obj2;
        this.f240921c = obj3;
        this.d = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set setA;
        x4 x4Var;
        int i = 4;
        int i2 = 2;
        switch (this.f240919a) {
            case 0:
                g gVar = (g) this.f240920b;
                mza.c params = (mza.c) this.f240921c;
                h hVar = (h) this.d;
                l lVar = gVar.f240925c;
                long j2 = hVar.f240926a;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, lVar.f240931b, j6.a.q("remoteStoriesMetadata", mo3.a.l(params)), Long.valueOf(j2));
                return Unit.f186387a;
            case 1:
                return LifecycleCameraProviderImpl.initAsync$lambda$0$3((LifecycleCameraProviderImpl) this.f240920b, (CameraX) this.f240921c, (Context) this.d, (Void) obj2);
            case 2:
                io3.l lVar2 = (io3.l) this.f240920b;
                x xVar = (x) this.f240921c;
                xi0.b bVar = (xi0.b) this.d;
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                if (!w.V(user) || lVar2 != io3.l.CURRENT) {
                    d0 d0VarR = xVar.R(bVar, lVar2);
                    s sVar = s.f;
                    return new ufm.i(d0VarR, new q2j.k(0), 1);
                }
                d0 d0VarR2 = osg.b.r(xVar.k, bVar, lVar2, io3.i.INTERNAL, xVar.i.f99584s, 20);
                q09.c cVar = new q09.c(18, new q2a.a(20));
                d0VarR2.getClass();
                ufm.i iVar = new ufm.i(d0VarR2, cVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return ue0.e.F(iVar, q.f241693a);
            case 3:
                xi0.b bVar2 = (xi0.b) this.f240920b;
                k18.c cVar2 = (k18.c) this.f240921c;
                BalanceWithPnl balanceWithPnl = (BalanceWithPnl) this.d;
                DerivativesBalance balance = (DerivativesBalance) obj2;
                Intrinsics.checkNotNullParameter(balance, "balance");
                return Intrinsics.f(balance.f71898a, bVar2) ? new go.g(new Data(new BalanceWithPnl(balance.f71907p, balance.f71908q, balance.f71909r), null, false, 6, null), 2) : nim.a.v(rd0.e.b(ue0.e.E(((ppk.f) cVar2.f180141c).e(v1.c.w(balance.f71898a, bVar2), n9l.b.SEC_3), new Data(f0.f322471a, null, false, 6, null))), new d(balance, i, bVar2, balanceWithPnl));
            case 4:
                DerivativesBalance derivativesBalance = (DerivativesBalance) this.f240920b;
                xi0.b bVar3 = (xi0.b) this.f240921c;
                BalanceWithPnl balanceWithPnl2 = (BalanceWithPnl) this.d;
                List midRates = (List) obj2;
                Intrinsics.checkNotNullParameter(midRates, "midRates");
                qta.c cVar3 = (qta.c) zhm.d0.d0(midRates);
                if (cVar3 == null) {
                    return balanceWithPnl2;
                }
                BigDecimal bigDecimal = cVar3.f249048c;
                return new BalanceWithPnl(pyd.c.L(derivativesBalance.f71907p, bigDecimal, bVar3), pyd.c.L(derivativesBalance.f71908q, bigDecimal, bVar3), pyd.c.L(derivativesBalance.f71909r, bigDecimal, bVar3));
            case 5:
                wi0.b bVar4 = (wi0.b) this.f240920b;
                com.revolut.feature.onboarding.impl.onboarding.country.screen.a aVar = (com.revolut.feature.onboarding.impl.onboarding.country.screen.a) this.f240921c;
                e7l.f fVar = (e7l.f) this.d;
                qa9.k kVar = (qa9.k) obj2;
                boolean z = aVar.f78430p.e.contains(bVar4) || kVar.f243987b.f268862a;
                boolean zContains = fVar.k.contains(bVar4);
                hb9.a aVar2 = aVar.f78434t;
                List list = aVar.o.f78426c;
                aVar2.getClass();
                return qa9.k.a(kVar, bVar4, z, false, zContains, hb9.a.a(list, bVar4), 106);
            case 6:
                j0 j0Var = (j0) this.f240920b;
                String str = (String) this.f240921c;
                CurrencySelectionOption currencySelectionOption = (CurrencySelectionOption) this.d;
                FormScreen screen = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                return j0Var.H.c(screen, str, currencySelectionOption);
            case 7:
                j0 j0Var2 = (j0) this.f240920b;
                File file = (File) this.f240921c;
                od0.i iVar2 = (od0.i) this.d;
                FormScreen it8 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                t tVar = j0Var2.z;
                List list2 = it8.f63468b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof BackendFlowUploadItem) {
                        arrayList.add(obj3);
                    }
                }
                return tVar.c(it8, ((BackendFlowUploadItem) ((InputItem) zhm.d0.b0(arrayList))).getId(), new q0(BackendFlowBinary.Companion.a(BackendFlowBinary.INSTANCE, file, null, (String) iVar2.g(), 2)));
            case 8:
                j0 j0Var3 = (j0) this.f240920b;
                String str2 = (String) this.f240921c;
                CountryInfo countryInfo = (CountryInfo) this.d;
                FormScreen it9 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                e0 e0Var = j0Var3.f244453w;
                wi0.b bVarC = com.bumptech.glide.d.c(countryInfo.f51204a);
                fj0.a aVar3 = fj0.b.Companion;
                String str3 = countryInfo.f51206c;
                aVar3.getClass();
                Serializable serializableB = fj0.a.b(str3);
                o.b(serializableB);
                return e0Var.c(it9, str2, new w0(((fj0.b) serializableB).f135518a, bVarC));
            case 9:
                j0 j0Var4 = (j0) this.f240920b;
                String str4 = (String) this.f240921c;
                h1 h1Var = (h1) this.d;
                FormScreen it10 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return j0Var4.v.c(it10, str4, h1Var);
            case 10:
                h0 h0Var = (h0) this.f240920b;
                j0 j0Var5 = (j0) this.f240921c;
                ValidationResult validationResult = (ValidationResult) this.d;
                FormScreen screen2 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(screen2, "screen");
                if (h0Var instanceof TextInputItem) {
                    return j0Var5.k.c(screen2, ((TextInputItem) h0Var).f63678a, new f1(validationResult));
                }
                if (h0Var instanceof SignatureInputItem) {
                    return j0Var5.f244445l.c(screen2, ((SignatureInputItem) h0Var).f63627a, new f1(validationResult));
                }
                if (h0Var instanceof CheckboxTextInputItem) {
                    return j0Var5.i.c(screen2, ((CheckboxTextInputItem) h0Var).f63352a, new b1(validationResult));
                }
                if (h0Var instanceof RadioButtonTextInputItem) {
                    return j0Var5.f244442g.c(screen2, ((RadioButtonTextInputItem) h0Var).f63593a, new b1(validationResult));
                }
                if ((h0Var instanceof MultiSelectionItem) || (h0Var instanceof SingleSelectionItem)) {
                    return j0Var5.E.c(screen2, ((SelectionItem) h0Var).getId(), new b1(validationResult));
                }
                if (h0Var instanceof MoneyInputItem) {
                    return j0Var5.f244443h.c(screen2, ((MoneyInputItem) h0Var).f63529a, new u0(validationResult));
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                j0 j0Var6 = (j0) this.f240920b;
                String str5 = (String) this.f240921c;
                BackendFlowUploadResult backendFlowUploadResult = (BackendFlowUploadResult) this.d;
                FormScreen screen3 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(screen3, "screen");
                return j0Var6.z.c(screen3, str5, new q0(BackendFlowBinary.Companion.a(BackendFlowBinary.INSTANCE, new File(backendFlowUploadResult.f63288a), null, backendFlowUploadResult.f63289b, 2)));
            case 12:
                j0 j0Var7 = (j0) this.f240920b;
                String str6 = (String) this.f240921c;
                ChipsSelectionItem.Chip chip = (ChipsSelectionItem.Chip) this.d;
                FormScreen screen4 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(screen4, "screen");
                return j0Var7.C.c(screen4, str6, chip);
            case 13:
                j0 j0Var8 = (j0) this.f240920b;
                String str7 = (String) this.f240921c;
                FiltersInputItem.Option option = (FiltersInputItem.Option) this.d;
                FormScreen screen5 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(screen5, "screen");
                return j0Var8.D.c(screen5, str7, option);
            case 14:
                j0 j0Var9 = (j0) this.f240920b;
                String str8 = (String) this.f240921c;
                r rVar = (r) this.d;
                FormScreen it11 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return j0Var9.G.c(it11, str8, rVar.getId());
            case 15:
                j0 j0Var10 = (j0) this.f240920b;
                String str9 = (String) this.f240921c;
                ba0.j jVar = (ba0.j) this.d;
                FormScreen screen6 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(screen6, "screen");
                return j0Var10.u.c(screen6, str9, jVar);
            case 16:
                j0 j0Var11 = (j0) this.f240920b;
                SelectionItem selectionItem = (SelectionItem) this.f240921c;
                String str10 = (String) this.d;
                FormScreen screen7 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(screen7, "screen");
                return j0Var11.E.c(screen7, selectionItem.getId(), new a1(str10));
            case 17:
                qc0.f1 f1Var = (qc0.f1) this.f240920b;
                PhoneInputItem phoneInputItem = (PhoneInputItem) this.f240921c;
                String str11 = (String) this.d;
                List countries = (List) obj2;
                Intrinsics.checkNotNullParameter(countries, "allowedCountries");
                qi3.t.Companion.getClass();
                ExplicitActivityDestination explicitActivityDestination = com.revolut.feature.chooser.b.f65915b;
                wi0.b selectedCountry = phoneInputItem.f63573h;
                Intrinsics.checkNotNullParameter(countries, "countries");
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                f0 appPopularInCountryCodes = f0.f322471a;
                String str12 = selectedCountry.f297794a;
                Intrinsics.checkNotNullParameter(countries, "countries");
                Intrinsics.checkNotNullParameter(appPopularInCountryCodes, "appPopularInCountryCodes");
                int i3 = 11;
                return new ActivityNavigateCommand(explicitActivityDestination, new ChooserConfiguration(y.K(y.E(y.x(zhm.d0.Q(appPopularInCountryCodes), new n0(str12, i3)), y.x(y.n(zhm.d0.Q(countries), new q2j.j(appPopularInCountryCodes, 24)), new n0(str12, i3)))), new BackendFlowChooserConfigurationType(str11), f1Var.e, false, null, phoneInputItem.d, false, 0, null, f1Var.o(), 7088), null, null, 0, null, null, null, null, false, 1020);
            case 18:
                String rawValue = (String) this.f240920b;
                PixIdentifiedType pixIdentifiedType = (PixIdentifiedType) this.f240921c;
                qca.q qVar = (qca.q) this.d;
                qca.g update = (qca.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                PixIdentifiedType.Valid valid = pixIdentifiedType instanceof PixIdentifiedType.Valid ? (PixIdentifiedType.Valid) pixIdentifiedType : null;
                ApmDescriptor apmDescriptorB = valid != null ? ((vca.g) qVar.f244683q).b(valid) : null;
                update.getClass();
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                return new qca.g(rawValue, apmDescriptorB);
            case 19:
                qe0.o oVar = (qe0.o) this.f240920b;
                qe0.k kVar2 = (qe0.k) this.f240921c;
                a2 a2Var = (a2) this.d;
                synchronized (oVar.f245041c) {
                    try {
                        if (Intrinsics.f(oVar.f245041c.get(kVar2), a2Var)) {
                            oVar.f245041c.remove(kVar2);
                        }
                        oVar.d.remove(a2Var);
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return Unit.f186387a;
            case 20:
                AssetIdWithSymbol assetIdWithSymbol = (AssetIdWithSymbol) this.f240920b;
                FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) this.f240921c;
                AssetIdWithSymbol assetIdWithSymbol2 = (AssetIdWithSymbol) this.d;
                SharedAddAlertFlowContract$State update2 = (SharedAddAlertFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                String str13 = assetIdWithSymbol.f86861a;
                String str14 = assetIdWithSymbol.f86862b;
                return SharedAddAlertFlowContract$State.a(update2, null, new FavouritesAssetDetails(str13, str14, str14, favouritesAssetTypeKey, false), assetIdWithSymbol2 != null ? assetIdWithSymbol2.f86861a : null, 9);
            case 21:
                com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b bVar5 = (com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.b) this.f240920b;
                BrazilInboundOpenbankingFlowContract$Step brazilInboundOpenbankingFlowContract$Step = (BrazilInboundOpenbankingFlowContract$Step) this.f240921c;
                yki.b bVar6 = (yki.b) this.d;
                pk6.h result = (pk6.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof pk6.g) {
                    BrazilInboundOpenbankingFlowContract$Step.BranchSelection branchSelection = (BrazilInboundOpenbankingFlowContract$Step.BranchSelection) brazilInboundOpenbankingFlowContract$Step;
                    bVar5.C2(new we6.f(branchSelection.f72593c, branchSelection.f72591a, branchSelection.f72592b, ((pk6.g) result).f236930a.f154218a));
                    oki.h.D2(bVar6);
                } else {
                    if (!Intrinsics.f(result, pk6.f.f236929a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.w2(bVar6, BrazilInboundOpenbankingFlowContract$Step.BranchNotListedDialog.f72590a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 22:
                com.revolut.sso.impl.ui.combined_authentication.unified.a aVar4 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) this.f240920b;
                Identifier.Email email = (Identifier.Email) this.f240921c;
                String str15 = (String) this.d;
                qll.q update3 = (qll.q) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                qll.k kVar3 = new qll.k(((tll.d) aVar4.v).a(email));
                ((qll.q) ((j2) aVar4.D.f22677a).getValue()).f247597c.getClass();
                return qll.q.a(update3, kVar3, null, Identifier.Email.a(str15), null, 26);
            case 23:
                jul.o oVar2 = (jul.o) this.f240920b;
                zel.f fVar2 = (zel.f) this.f240921c;
                w4l.k kVar4 = (w4l.k) this.d;
                List metrics = (List) obj2;
                Intrinsics.checkNotNullParameter(metrics, "metrics");
                return ((w2) oVar2.f178696c).P(metrics, fVar2, kVar4);
            case 24:
                ou5.b bVar7 = (ou5.b) this.f240920b;
                String juniorId = (String) this.f240921c;
                w4l.k loadingStrategy = (w4l.k) this.d;
                i7 txFilter = (i7) obj2;
                Intrinsics.checkNotNullParameter(txFilter, "txFilter");
                vkm.d dVarB = rd0.e.b(com.revolut.domain.interactors.transactions.a.d((com.revolut.domain.interactors.transactions.a) bVar7.d, txFilter, null, null, null, null, 30));
                vkm.d dVarB2 = rd0.e.b(((ao.h) bVar7.f229821c).m(juniorId, loadingStrategy instanceof w4l.i));
                wq8.c cVar4 = (wq8.c) bVar7.f229820b;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(zh9.u0.i(dVarB, dVarB2, cVar4.d.b(juniorId, loadingStrategy)), new qc0.w(juniorId, 17));
            case 25:
                TransferReasonCategory transferReasonCategory = (TransferReasonCategory) this.f240920b;
                com.revolut.feature.transfer_reasons.impl.flow.a aVar5 = (com.revolut.feature.transfer_reasons.impl.flow.a) this.f240921c;
                TransferReasonNode transferReasonNode = (TransferReasonNode) this.d;
                TransferReasonsFlowContract$State update4 = (TransferReasonsFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                TransferReasonCategory transferReasonCategory2 = update4.f92332a;
                Set set = update4.f92333b;
                aVar5.getClass();
                if (Intrinsics.f(transferReasonCategory2 != null ? transferReasonCategory2.f92435a : null, transferReasonCategory.f92435a)) {
                    int i5 = qsf.h.f248828a[transferReasonCategory.e.ordinal()];
                    if (i5 == 1) {
                        setA = gc0.c.A(set, transferReasonNode);
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        setA = set.contains(transferReasonNode) ? zhm.h0.f322473a : y0.b(transferReasonNode);
                    }
                } else {
                    setA = y0.b(transferReasonNode);
                }
                Set set2 = setA;
                f0 f0Var = f0.f322471a;
                return TransferReasonsFlowContract$State.a(update4, transferReasonCategory, set2, f0Var, f0Var, false, null, 32);
            case 26:
                qtd.b bVar8 = (qtd.b) this.f240920b;
                String listId = (String) this.f240921c;
                g0j.a travelDestination = (g0j.a) this.d;
                List tools = (List) obj2;
                qtd.d dVar = bVar8.f249093c;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(travelDestination, "travelDestination");
                Intrinsics.checkNotNullParameter(tools, "tools");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.analytics_travel_mode_widget_title, null, null, 14);
                String strB = ((o8b.c) dVar.f249094a).b(travelDestination.f139496b.f297794a);
                List list3 = tools;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list3) {
                    if (obj4 instanceof jtd.q) {
                        arrayList2.add(obj4);
                    }
                }
                jtd.q qVar2 = (jtd.q) zhm.d0.d0(arrayList2);
                if (qVar2 != null) {
                    dj0.d dVar2 = qVar2.f178489c;
                    MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                    o9 o9Var = o9.NON_SENSITIVE;
                    x4Var = new x4(new CompositeClause(v.k(new MoneyClause(dVar2, defaults, null, o9Var, 4), new MoneyClause(qVar2.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4)), new TextClause(" = ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), qVar2);
                } else {
                    x4Var = null;
                }
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_travel_mode_widget_country, u.c(strB), null, 12);
                UrlImage urlImage = new UrlImage(travelDestination.f139497c, (String) null, (UrlImageDrawable) null, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524282);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list3) {
                    if (!(((jtd.u) obj5) instanceof jtd.q)) {
                        arrayList3.add(obj5);
                    }
                }
                Integer numValueOf = arrayList3.size() <= 4 ? null : Integer.valueOf(arrayList3.size() - 3);
                v4 v4Var = new v4("MORE_ID", R$drawable.uikit_icn_24_more_android, numValueOf != null ? new TextLocalisedClause(R$string.analytics_travel_mode_widget_more, u.c(String.valueOf(numValueOf.intValue())), null, 12) : new TextLocalisedClause(R$string.analytics_travel_mode_widget_countless_more, null, null, 14), null);
                v4 v4VarA = qtd.d.a((jtd.u) arrayList3.get(0));
                jtd.u uVar = (jtd.u) zhm.d0.e0(1, arrayList3);
                v4 v4VarA2 = uVar != null ? qtd.d.a(uVar) : null;
                jtd.u uVar2 = (jtd.u) zhm.d0.e0(2, arrayList3);
                v4[] elements = {v4VarA, v4VarA2, uVar2 != null ? qtd.d.a(uVar2) : null, v4Var};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                ArrayList arrayList4 = (ArrayList) listL;
                return new TravelModeWidgetDelegate.Model(listId, textLocalisedClause, textLocalisedClause2, urlImage, new w4((v4) arrayList4.get(0), (v4) arrayList4.get(1), (v4) zhm.d0.e0(2, listL), (v4) zhm.d0.e0(3, listL)), x4Var);
            case 27:
                qu5.b bVar9 = (qu5.b) this.f240920b;
                n9l.b bVar10 = (n9l.b) this.f240921c;
                xi0.b bVar11 = (xi0.b) this.d;
                CryptoCommodityPositions positions = (CryptoCommodityPositions) obj2;
                Intrinsics.checkNotNullParameter(positions, "positions");
                ArrayList arrayList5 = positions.f71383b;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                Iterator it12 = arrayList5.iterator();
                while (it12.hasNext()) {
                    v1.c.A(arrayList6, ((CryptoCommodityPosition) it12.next()).f71379a, bVar11);
                }
                return bVar9.f249257r.c(arrayList6, bVar10);
            case 28:
                com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a aVar6 = (com.revolut.feature.rev_points.giftcards.impl.ui.flow.root.a) this.f240920b;
                yki.b bVar12 = (yki.b) this.f240921c;
                RevPointsGiftcardsFlowContract$Step revPointsGiftcardsFlowContract$Step = (RevPointsGiftcardsFlowContract$Step) this.d;
                uvb.h result2 = (uvb.h) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof uvb.g) {
                    uvb.g gVar2 = (uvb.g) result2;
                    oki.h.t2(aVar6, bVar12, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardTermsAndConditions(gVar2.f283350a, gVar2.f283351b), true, null, false, 12);
                } else {
                    if (!(result2 instanceof uvb.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i6 = qwb.d.f249848a[((RevPointsGiftcardsFlowContract$Step.OpenGiftcardDetails) revPointsGiftcardsFlowContract$Step).d.ordinal()];
                    if (i6 == 1) {
                        aVar6.B2();
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.r2(bVar12);
                        oki.h.t2(aVar6, bVar12, new RevPointsGiftcardsFlowContract$Step.OpenGiftcardsHome(RevPointsGiftcardsDestination.GiftcardsHomePagerItem.MyCards.f83658a), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                    }
                }
                return Unit.f186387a;
            default:
                z zVar = (z) this.f240920b;
                jvf.c cVar5 = zVar.u;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f240921c;
                bxf.e eVar = (bxf.e) this.d;
                wwf.d result3 = (wwf.d) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof wwf.b) {
                    cVar5.c3();
                } else if (result3 instanceof wwf.c) {
                    cVar5.c3();
                    if (atomicBoolean.compareAndSet(false, true)) {
                        zVar.y2(eVar, atomicBoolean);
                    }
                } else {
                    if (!(result3 instanceof wwf.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar5.b3(((wwf.a) result3).f300651a, new p1(zVar, 25), new qwf.s(zVar, i2));
                }
                return Unit.f186387a;
        }
    }
}
