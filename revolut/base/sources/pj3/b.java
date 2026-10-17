package pj3;

import androidx.sqlite.SQLiteConnection;
import cfl.b0;
import cfl.e0;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.api.models.BiometricVerificationAcceptedDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.OverstapAccountSwitchingFlowContract$Step;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreen;
import com.revolut.feature.derivatives.models.DerivativesBalance;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.push_to_card.api.model.AdditionalFieldOption;
import com.revolut.feature.push_to_card.api.model.DropdownFieldContent;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreenContract$ModalStep;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.model.AdditionalFieldInput;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.tax_residency.impl.v2.models.Exemption;
import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import com.revolut.feature.tax_residency.impl.v2.models.UserSpecificRule;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$Step;
import com.revolut.feature.transactions.impl.ui.receipts.TransactionDetailsReceiptsActivity;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.event_appearance.impl.R$string;
import com.revolut.shared.feature.event_appearance.api.models.WelcomeAppearance;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import com.revolut.sso.impl.domain.models.Identifier;
import com.youTransactor.uCube.rpc.Constants;
import dej.q0;
import efm.d0;
import ip0.pb0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import jlc.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import ppc.g;
import ppc.i;
import ppc.j;
import ppc.k;
import ppc.l;
import ppc.n;
import ppc.q;
import pqg.i0;
import rp0.n0;
import s7a.a0;
import s7a.c0;
import te0.w;
import vkm.j2;
import yhm.m;
import zh9.u0;
import zhm.a1;
import zhm.f0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f236629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f236630c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f236628a = i;
        this.f236629b = obj2;
        this.f236630c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        o oVar;
        Object objA;
        Object objA2;
        akg.n nVarV;
        SavingsProduct savingsProduct;
        Object next;
        int i = this.f236628a;
        int i2 = 21;
        int i3 = 8;
        int i5 = 3;
        char c2 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        h hVar = null;
        Object obj3 = null;
        Object obj4 = null;
        boolValueOf = null;
        Boolean boolValueOf = null;
        hVar = null;
        hVar = null;
        Object obj5 = this.f236630c;
        Object obj6 = this.f236629b;
        switch (i) {
            case 0:
                yw0.f fVar = (yw0.f) obj5;
                CmsStoriesScreen.Companion aVar = CmsStoriesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                r rVar = (r) ((CmsStoriesScreen) obj6).R2();
                hj3.a aVar2 = (hj3.a) ((f) ((j2) rVar.v.f22677a).getValue()).f236634a.getContent();
                if (aVar2 != null) {
                    int i6 = p.d[aVar2.f152651b.ordinal()];
                    if (i6 == 1) {
                        int i21 = p.f236647c[aVar2.f152652c.ordinal()];
                        if (i21 == 1) {
                            oVar = o.DESTINATION;
                        } else {
                            if (i21 != 2 && i21 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oVar = o.LAST_PAGE;
                        }
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oVar = o.IGNORE;
                    }
                    int i22 = p.f236646b[oVar.ordinal()];
                    if (i22 != 1) {
                        if (i22 == 2) {
                            hVar = new h(v.j(aVar2.f));
                        } else {
                            if (i22 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            rVar.J2(aVar2.d);
                        }
                    }
                }
                if (hVar != null) {
                    fVar.setCurrentPageIndex(hVar.f236637a);
                }
                return Unit.f186387a;
            case 1:
                return f.a((f) obj2, (Data) obj6, null, (fj3.f) obj5, 2);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                ((pjh.k) obj6).getClass();
                return new pb0(j6.a.q("LOADING_COMBINED_BUYING_POWER_BALANCE_ID_", (String) obj5));
            case 3:
                com.revolut.feature.atm.impl.ui.redesign.limits_exception.a aVar3 = (com.revolut.feature.atm.impl.ui.redesign.limits_exception.a) obj6;
                til.m mVar = aVar3.o;
                yki.b bVar = (yki.b) obj5;
                qk2.e result = (qk2.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof qk2.d) {
                    oki.h.D2(bVar);
                    aVar3.C1(u0.b(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) til.m.c(mVar, new WorkflowConfiguration.Workflow(((qk2.d) result).f246953a, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126)), false, (Integer) null, 0, 61))));
                } else {
                    if (!(result instanceof qk2.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(bVar);
                    aVar3.C1(u0.b(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) til.m.c(mVar, new WorkflowConfiguration.CreateWorkflow(((qk2.c) result).f246952a, null, 62)), false, (Integer) null, 0, 61))));
                }
                return Unit.f186387a;
            case 4:
                q0 q0Var = (q0) obj6;
                pkj.e update = (pkj.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                boolean zK = ((pkj.k) obj5).f237207q.k(q0Var.f113622a, q0Var.f113624c.f297794a);
                update.getClass();
                return new pkj.e(q0Var, zK);
            case 5:
                pnf.h hVar2 = (pnf.h) obj5;
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                ((TransactionDetailsReceiptsActivity) ((pnf.c) obj6)).setItems(items);
                if (items.isEmpty()) {
                    com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, hVar2.f237757l);
                }
                return Unit.f186387a;
            case 6:
                po5.a aVar4 = (po5.a) obj6;
                Function1 function1 = (Function1) obj5;
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (!enabled.booleanValue()) {
                    return w.j(f0.f322471a);
                }
                d0 d0VarFirstOrError = zi0.c.J(aVar4.f237888a.a(false)).firstOrError();
                pjg.i iVar = new pjg.i(new js7.c(15, function1), 25);
                d0VarFirstOrError.getClass();
                ufm.i iVar2 = new ufm.i(d0VarFirstOrError, iVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return ue0.e.F(iVar2, f0.f322471a);
            case 7:
                poj.a aVar5 = (poj.a) obj5;
                Clause defaultMessage = (Clause) obj2;
                Intrinsics.checkNotNullParameter(defaultMessage, "defaultMessage");
                String str = ((p7l.a) obj6).f233790a;
                if (str != null) {
                    l80.e eVar = aVar5.d;
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = Boolean.valueOf(aVar5.f.a(eVar));
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    Throwable thA = yhm.m.a(objA);
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    Boolean bool = (Boolean) objA;
                    if (bool != null ? bool.booleanValue() : false) {
                        defaultMessage = new TextLocalisedClause(R$string.event_appearance_christmas_welcome_merry_christmas, zhm.u.c(str), null, 12);
                    } else {
                        try {
                            objA2 = Boolean.valueOf(aVar5.f238043g.a(eVar));
                        } catch (CancellationException e2) {
                            throw e2;
                        } catch (Throwable th11) {
                            m.Companion companion3 = yhm.m.INSTANCE;
                            objA2 = yhm.o.a(th11);
                        }
                        Throwable thA2 = yhm.m.a(objA2);
                        if (thA2 != null) {
                            hx7.e.n(thA2);
                        }
                        if (objA2 instanceof yhm.n) {
                            objA2 = null;
                        }
                        Boolean bool2 = (Boolean) objA2;
                        if (bool2 != null ? bool2.booleanValue() : false) {
                            defaultMessage = new TextLocalisedClause(R$string.event_appearance_christmas_welcome_happy_new_year, zhm.u.c(str), null, 12);
                        }
                    }
                    break;
                }
                return new WelcomeAppearance(defaultMessage, new CdnImage("frosted_revolut_icon", "mobile/easter_eggs/images", null, null, null, null, Constants.TAG_OS_VERSION), (UrlVideo) null);
            case 8:
                com.revolut.sso.impl.ui.phone.enter_phone.a aVar6 = (com.revolut.sso.impl.ui.phone.enter_phone.a) obj6;
                PhoneEditorDelegate.PhoneData phoneData = (PhoneEditorDelegate.PhoneData) obj5;
                pol.g update2 = (pol.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                y yVar = aVar6.u;
                Identifier.Phone phone = ((pol.g) ((j2) yVar.f22677a).getValue()).f238049a;
                String strG = aVar6.f106673r.g(phoneData.f52896b, ((pol.g) ((j2) yVar.f22677a).getValue()).f238049a.f106152c);
                if (strG == null) {
                    strG = phoneData.f52896b;
                }
                Identifier.Phone identifier = Identifier.Phone.a(phone, strG, 0, null, 6);
                update2.getClass();
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                return new pol.g(identifier);
            case 9:
                com.revolut.sso.impl.ui.phone.enter_phone.a aVar7 = (com.revolut.sso.impl.ui.phone.enter_phone.a) obj5;
                pol.g update3 = (pol.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                wi0.a aVar8 = wi0.b.Companion;
                c0 c0Var = ((a0) obj6).f260599a;
                Intrinsics.i(c0Var, "null cannot be cast to non-null type com.revolut.feature.picker.PickerControllerContract.ClauseClickResult");
                String str2 = ((s7a.q) c0Var).f260624a;
                aVar8.getClass();
                wi0.b bVarA = wi0.a.a(str2);
                fj0.a aVar9 = fj0.b.Companion;
                String strJ = aVar7.f106673r.j(bVarA);
                aVar9.getClass();
                Serializable serializableB = fj0.a.b(strJ);
                yhm.o.b(serializableB);
                Identifier.Phone identifier2 = Identifier.Phone.a(((pol.g) ((j2) aVar7.u.f22677a).getValue()).f238049a, null, ((fj0.b) serializableB).f135518a, bVarA, 1);
                update3.getClass();
                Intrinsics.checkNotNullParameter(identifier2, "identifier");
                return new pol.g(identifier2);
            case 10:
                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar2 = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b) obj6;
                do2.h outputData = (do2.h) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                oki.h.t2(bVar2, bVar2.f64043r, new OverstapAccountSwitchingFlowContract$Step.StartDateSelection(outputData.f116377a, ((OverstapAccountSwitchingFlowContract$Step.SourceAccountForm) obj5).f64037a), true, null, false, 12);
                return Unit.f186387a;
            case 11:
                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar3 = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b) obj6;
                OverstapAccountSwitchingFlowContract$Step.StartDateSelection startDateSelection = (OverstapAccountSwitchingFlowContract$Step.StartDateSelection) obj5;
                hp2.g outputData2 = (hp2.g) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                oki.h.t2(bVar3, bVar3.f64043r, new OverstapAccountSwitchingFlowContract$Step.Review(startDateSelection.f64038a, startDateSelection.f64039b, outputData2.f154389a), true, null, false, 12);
                return Unit.f186387a;
            case 12:
                ppc.u uVar = (ppc.u) obj6;
                a87.c cVar = uVar.f238339c;
                final jlc.t forScreen = (jlc.t) obj5;
                cfl.f0 it8 = (cfl.f0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof e0) {
                    rpc.f fVar2 = uVar.f238338b;
                    e0 roboUsTradingProduct = (e0) it8;
                    Intrinsics.checkNotNullParameter(forScreen, "forScreen");
                    Intrinsics.checkNotNullParameter(roboUsTradingProduct, "roboUsTradingProduct");
                    int i32 = rpc.d.f256361a[forScreen.ordinal()];
                    if (i32 == 1) {
                        nVarV = nim.a.v(fVar2.a(), new n0(27));
                    } else if (i32 == 2 || i32 == 3) {
                        nVarV = nim.a.v(fVar2.a(), new n0(26));
                    } else if (i32 == 4) {
                        nVarV = nim.a.v(fVar2.a(), new rlh.d0(roboUsTradingProduct.d.f23728a, i2));
                    } else {
                        if (i32 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVarV = nim.a.v(fVar2.a(), new n0(25));
                    }
                    return nim.a.v(nVarV, rpc.e.f);
                }
                if (it8 instanceof cfl.y) {
                    Intrinsics.checkNotNullParameter(forScreen, "forScreen");
                    vkm.d dVarB = rd0.e.b(ybl.l.c(cVar.f2117a, false, 3));
                    final Object[] objArr5 = objArr2 == true ? 1 : 0;
                    return nim.a.v(dVarB, new Function1() { // from class: rpc.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            List listK;
                            int i33 = objArr5;
                            t tVar = forScreen;
                            hel.a stocksConfig = (hel.a) obj7;
                            switch (i33) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(stocksConfig, "stocksConfig");
                                    int i43 = b.f256359a[tVar.ordinal()];
                                    ppc.a aVar10 = ppc.a.f238320a;
                                    if (i43 != 1) {
                                        ppc.e eVar2 = ppc.e.f238324a;
                                        if (i43 == 2) {
                                            listK = v.k(ppc.d.f238323a, eVar2, aVar10, new g(stocksConfig.e));
                                        } else if (i43 == 3) {
                                            listK = v.k(ppc.c.f238322a, eVar2, aVar10, new g(stocksConfig.e));
                                        } else if (i43 == 4) {
                                            listK = v.k(eVar2, aVar10, new g(stocksConfig.e));
                                        } else {
                                            if (i43 != 5) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            listK = v.k(aVar10, new g(stocksConfig.e), ppc.f.f238325a);
                                        }
                                    } else {
                                        listK = v.k(aVar10, new g(stocksConfig.e));
                                    }
                                    return new q(listK);
                                default:
                                    Intrinsics.checkNotNullParameter(stocksConfig, "stocksConfig");
                                    int i59 = c.f256360a[tVar.ordinal()];
                                    i iVar3 = i.f238328a;
                                    if (i59 == 1) {
                                        return v.k(iVar3, new n(stocksConfig.e.f105092g));
                                    }
                                    l lVar = l.f238331a;
                                    if (i59 == 2) {
                                        return v.k(k.f238330a, lVar, iVar3, new n(stocksConfig.e.f105092g));
                                    }
                                    if (i59 == 3) {
                                        return v.k(j.f238329a, lVar, iVar3, new n(stocksConfig.e.f105092g));
                                    }
                                    if (i59 == 4) {
                                        return v.k(lVar, iVar3, new n(stocksConfig.e.f105092g));
                                    }
                                    if (i59 == 5) {
                                        return v.k(ppc.m.f238332a, iVar3, new n(stocksConfig.e.f105092g));
                                    }
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                    });
                }
                if (it8 instanceof b0) {
                    Intrinsics.checkNotNullParameter(forScreen, "forScreen");
                    vkm.d dVarB2 = rd0.e.b(ybl.l.c(cVar.f2117a, false, 3));
                    final Object[] objArr6 = objArr == true ? 1 : 0;
                    return nim.a.v(dVarB2, new Function1() { // from class: rpc.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            List listK;
                            int i33 = objArr6;
                            t tVar = forScreen;
                            hel.a stocksConfig = (hel.a) obj7;
                            switch (i33) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(stocksConfig, "stocksConfig");
                                    int i43 = b.f256359a[tVar.ordinal()];
                                    ppc.a aVar10 = ppc.a.f238320a;
                                    if (i43 != 1) {
                                        ppc.e eVar2 = ppc.e.f238324a;
                                        if (i43 == 2) {
                                            listK = v.k(ppc.d.f238323a, eVar2, aVar10, new g(stocksConfig.e));
                                        } else if (i43 == 3) {
                                            listK = v.k(ppc.c.f238322a, eVar2, aVar10, new g(stocksConfig.e));
                                        } else if (i43 == 4) {
                                            listK = v.k(eVar2, aVar10, new g(stocksConfig.e));
                                        } else {
                                            if (i43 != 5) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            listK = v.k(aVar10, new g(stocksConfig.e), ppc.f.f238325a);
                                        }
                                    } else {
                                        listK = v.k(aVar10, new g(stocksConfig.e));
                                    }
                                    return new q(listK);
                                default:
                                    Intrinsics.checkNotNullParameter(stocksConfig, "stocksConfig");
                                    int i59 = c.f256360a[tVar.ordinal()];
                                    i iVar3 = i.f238328a;
                                    if (i59 == 1) {
                                        return v.k(iVar3, new n(stocksConfig.e.f105092g));
                                    }
                                    l lVar = l.f238331a;
                                    if (i59 == 2) {
                                        return v.k(k.f238330a, lVar, iVar3, new n(stocksConfig.e.f105092g));
                                    }
                                    if (i59 == 3) {
                                        return v.k(j.f238329a, lVar, iVar3, new n(stocksConfig.e.f105092g));
                                    }
                                    if (i59 == 4) {
                                        return v.k(lVar, iVar3, new n(stocksConfig.e.f105092g));
                                    }
                                    if (i59 == 5) {
                                        return v.k(ppc.m.f238332a, iVar3, new n(stocksConfig.e.f105092g));
                                    }
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                    });
                }
                if (!(it8 instanceof cfl.d0)) {
                    throw new IllegalStateException("ROBO trading account not created");
                }
                onh.b bVar4 = uVar.d;
                Intrinsics.checkNotNullParameter(forScreen, "forScreen");
                vkm.d dVarB3 = rd0.e.b(ybl.l.c((ybl.l) bVar4.f226950b, false, 3));
                final char c3 = c2 == true ? 1 : 0;
                return nim.a.v(nim.a.v(dVarB3, new Function1() { // from class: rpc.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        List listK;
                        int i33 = c3;
                        t tVar = forScreen;
                        hel.a stocksConfig = (hel.a) obj7;
                        switch (i33) {
                            case 0:
                                Intrinsics.checkNotNullParameter(stocksConfig, "stocksConfig");
                                int i43 = b.f256359a[tVar.ordinal()];
                                ppc.a aVar10 = ppc.a.f238320a;
                                if (i43 != 1) {
                                    ppc.e eVar2 = ppc.e.f238324a;
                                    if (i43 == 2) {
                                        listK = v.k(ppc.d.f238323a, eVar2, aVar10, new g(stocksConfig.e));
                                    } else if (i43 == 3) {
                                        listK = v.k(ppc.c.f238322a, eVar2, aVar10, new g(stocksConfig.e));
                                    } else if (i43 == 4) {
                                        listK = v.k(eVar2, aVar10, new g(stocksConfig.e));
                                    } else {
                                        if (i43 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        listK = v.k(aVar10, new g(stocksConfig.e), ppc.f.f238325a);
                                    }
                                } else {
                                    listK = v.k(aVar10, new g(stocksConfig.e));
                                }
                                return new q(listK);
                            default:
                                Intrinsics.checkNotNullParameter(stocksConfig, "stocksConfig");
                                int i59 = c.f256360a[tVar.ordinal()];
                                i iVar3 = i.f238328a;
                                if (i59 == 1) {
                                    return v.k(iVar3, new n(stocksConfig.e.f105092g));
                                }
                                l lVar = l.f238331a;
                                if (i59 == 2) {
                                    return v.k(k.f238330a, lVar, iVar3, new n(stocksConfig.e.f105092g));
                                }
                                if (i59 == 3) {
                                    return v.k(j.f238329a, lVar, iVar3, new n(stocksConfig.e.f105092g));
                                }
                                if (i59 == 4) {
                                    return v.k(lVar, iVar3, new n(stocksConfig.e.f105092g));
                                }
                                if (i59 == 5) {
                                    return v.k(ppc.m.f238332a, iVar3, new n(stocksConfig.e.f105092g));
                                }
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }), new n0(24));
            case 13:
                com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar10 = (com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a) obj5;
                rpe.d outputData3 = (rpe.d) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                for (Exemption exemption : (List) obj6) {
                    ExemptionReason exemptionReason = exemption.f90164a;
                    ExemptionReason exemptionReason2 = outputData3.f256378a;
                    if (exemptionReason == exemptionReason2) {
                        Intrinsics.checkNotNullParameter(exemptionReason2, "<this>");
                        aVar10.M2(exemption.f90165b, new et0.q0(aVar10, exemptionReason2 == ExemptionReason.TIN_PENDING, exemption, i3));
                        return Unit.f186387a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 14:
                com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar11 = (com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a) obj6;
                UserSpecificRule userSpecificRule = aVar11.u;
                TaxResidencyDeclarationFlowContract$Step.TinInput tinInput = (TaxResidencyDeclarationFlowContract$Step.TinInput) obj5;
                ype.g outputData4 = (ype.g) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                if (outputData4 instanceof ype.e) {
                    aVar11.M2(userSpecificRule.d, new ky4.f(aVar11, 28, tinInput, outputData4));
                } else {
                    if (!(outputData4 instanceof ype.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i33 = ppe.h.f238597a[((ype.f) outputData4).f315852a.ordinal()];
                    if (i33 == 1) {
                        aVar11.M2(userSpecificRule.f, new ppe.g(aVar11, i5));
                    } else if (i33 == 2) {
                        aVar11.M2(userSpecificRule.e, new ppe.g(aVar11, 4));
                    } else {
                        if (i33 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar11.M2(userSpecificRule.e, new ppe.g(aVar11, objArr3 == true ? 1 : 0));
                    }
                }
                return Unit.f186387a;
            case 15:
                Function0 function0 = (Function0) obj6;
                com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar12 = (com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a) obj5;
                dii.g result2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof dii.e) {
                    function0.invoke();
                } else if (!(result2 instanceof dii.f)) {
                    if (result2 instanceof dii.c) {
                        ExternalDestination.Browser browserA = hpe.a.a(((dii.c) result2).f115066a);
                        if (browserA != null) {
                            aVar12.C1(browserA);
                        }
                    } else {
                        if (!(result2 instanceof dii.b) && !(result2 instanceof dii.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hx7.e.n(new IllegalArgumentException("Unexpected dialog result " + result2));
                    }
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a aVar13 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a) obj6;
                AdditionalFieldsScreenContract$ModalStep additionalFieldsScreenContract$ModalStep = (AdditionalFieldsScreenContract$ModalStep) obj5;
                eii.k output = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof eii.i) {
                    qqa.a aVar14 = aVar13.f81556q;
                    AdditionalFieldsScreenContract$ModalStep.DropdownSelector dropdownSelector = (AdditionalFieldsScreenContract$ModalStep.DropdownSelector) additionalFieldsScreenContract$ModalStep;
                    List currentFields = dropdownSelector.f81553a;
                    AdditionalFieldInput.DropdownInput dropdownField = dropdownSelector.f81554b;
                    Object obj7 = ((eii.i) output).f126655a;
                    Intrinsics.i(obj7, "null cannot be cast to non-null type com.revolut.feature.push_to_card.api.model.AdditionalFieldOption");
                    AdditionalFieldOption selectedOption = (AdditionalFieldOption) obj7;
                    aVar14.getClass();
                    Intrinsics.checkNotNullParameter(currentFields, "currentFields");
                    Intrinsics.checkNotNullParameter(dropdownField, "dropdownField");
                    Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
                    String id10 = dropdownField.f81559a;
                    DropdownFieldContent content = dropdownField.f81560b;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(content, "content");
                    aVar13.H2(aVar13.f81557r, new jeg.i(i2, qqa.a.b(currentFields, new AdditionalFieldInput.DropdownInput(id10, content, selectedOption))));
                }
                return Unit.f186387a;
            case 17:
                i0 i0Var = (i0) obj5;
                pqg.o updateState = (pqg.o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                SavingsProductData savingsProductData = (SavingsProductData) ((od0.i) obj6).g();
                if (savingsProductData != null && (savingsProduct = savingsProductData.f86683a) != null) {
                    boolValueOf = Boolean.valueOf(x5d.b.l(savingsProduct));
                }
                return pqg.o.b(updateState, null, null, 0L, null, savingsProductData, null, null, null, pd.b.k(boolValueOf) && !((o8b.c) i0Var.J).g(), false, null, 57087);
            case 18:
                i0 i0Var2 = (i0) obj6;
                xi0.b bVar5 = (xi0.b) obj5;
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Iterator it9 = pockets.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next2 = it9.next();
                        io3.d dVar = (io3.d) next2;
                        if (Intrinsics.f(dVar.f163147c, bVar5.f306286a) && dVar.e == io3.l.CURRENT && dVar.f == io3.k.ACTIVE) {
                            obj4 = next2;
                        }
                    }
                }
                io3.d dVar2 = (io3.d) obj4;
                if (dVar2 == null) {
                    pqg.p pVar = pqg.q.Companion;
                    pqg.o domainState = (pqg.o) i0Var2.t2();
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(domainState, "domainState");
                    return new pqg.q(domainState.f, domainState.e, domainState.f238752g);
                }
                String str3 = dVar2.f163145a;
                long j2 = dVar2.i;
                xi0.a aVar15 = xi0.b.Companion;
                String str4 = dVar2.f163147c;
                aVar15.getClass();
                return new pqg.q(j2, str3, xi0.a.a(str4));
            case 19:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                pfm.c cVar2 = new pfm.c((efm.b) ((mzb.e) obj6).invoke());
                oma.r rVar2 = new oma.r((pri.g) obj5, i3);
                dfm.c cVar3 = mfm.f.d;
                en.a aVar16 = mfm.f.f205043c;
                return new pfm.t(cVar2, cVar3, cVar3, aVar16, rVar2, aVar16, aVar16);
            case 20:
                com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar3 = (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) obj6;
                ps9.p update4 = (ps9.p) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Map balancesExpandedMap = r0.q(dVar3.I2().d, new Pair(((ur9.b) obj5).f282258a, Boolean.valueOf(!r3.f282259b)));
                qs9.a aVarI2 = dVar3.I2();
                do3.n user = aVarI2.f248756a;
                List debts = aVarI2.f248757b;
                List debtsReminders = aVarI2.f248758c;
                List transactions = aVarI2.e;
                st9.f paymentGroupLink = aVarI2.f;
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(debts, "debts");
                Intrinsics.checkNotNullParameter(debtsReminders, "debtsReminders");
                Intrinsics.checkNotNullParameter(balancesExpandedMap, "balancesExpandedMap");
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
                return ps9.p.a(update4, null, zi0.c.P(new qs9.a(user, debts, debtsReminders, balancesExpandedMap, transactions, paymentGroupLink), false, null, 3), false, 13);
            case 21:
                psd.d dVar4 = (psd.d) obj6;
                xi0.b baseCurrency = (xi0.b) obj5;
                DerivativesBalance balance = (DerivativesBalance) obj2;
                Intrinsics.checkNotNullParameter(balance, "balance");
                psd.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                psd.c cVar4 = new psd.c(null, new dj0.d(0L, baseCurrency));
                String str5 = balance.f71899b;
                xi0.b bVar6 = balance.f71898a;
                if (str5 == null) {
                    efm.r rVarJust = efm.r.just(new Data(cVar4, null, false, 6, null));
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    return rVarJust;
                }
                if (balance.e.compareTo(BigDecimal.ZERO) == 0) {
                    efm.r rVarJust2 = efm.r.just(new Data(cVar4, null, false, 6, null));
                    Intrinsics.checkNotNullExpressionValue(rVarJust2, "just(...)");
                    return rVarJust2;
                }
                if (!Intrinsics.f(bVar6, baseCurrency)) {
                    return nim.a.w(cpk.a.a(dVar4.f239475c, v1.c.w(bVar6, baseCurrency)), new n68.w(cVar4, dVar4, balance, str5, baseCurrency));
                }
                efm.r rVarJust3 = efm.r.just(new Data(psd.d.a(balance, str5, balance.f71907p), null, false, 6, null));
                Intrinsics.h(rVarJust3);
                return rVarJust3;
            case 22:
                ((psj.a) obj6).f239490b.insert((SQLiteConnection) obj2, (Iterable) obj5);
                return null;
            case 23:
                ((psj.b) obj6).f239493b.insert((SQLiteConnection) obj2, (Iterable) obj5);
                return null;
            case 24:
                com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a aVar17 = (com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a) obj5;
                pt.f update5 = (pt.f) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                wi0.b bVarC = com.bumptech.glide.d.c(((c8a.a) ((c0) obj6)).f22154a);
                st.b bVar7 = aVar17.f50609s;
                y yVar2 = aVar17.u;
                BiometricVerificationDocumentType biometricVerificationDocumentType = ((pt.f) ((j2) yVar2.f22677a).getValue()).f239556b;
                ArrayList arrayList = ((pt.f) ((j2) yVar2.f22677a).getValue()).f239557c;
                bVar7.getClass();
                return pt.f.a(update5, bVarC, st.b.a(bVarC, biometricVerificationDocumentType, arrayList));
            case 25:
                com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a aVar18 = (com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a) obj6;
                BiometricVerificationDocumentType doc2 = (BiometricVerificationDocumentType) obj5;
                pt.f update6 = (pt.f) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                st.a aVar19 = aVar18.f50608r;
                y yVar3 = aVar18.u;
                wi0.b country = ((pt.f) ((j2) yVar3.f22677a).getValue()).f239555a;
                ArrayList availableDocuments = ((pt.f) ((j2) yVar3.f22677a).getValue()).f239557c;
                aVar19.getClass();
                Intrinsics.checkNotNullParameter(doc2, "doc");
                Intrinsics.checkNotNullParameter(country, "country");
                Intrinsics.checkNotNullParameter(availableDocuments, "availableDocuments");
                Iterator it10 = availableDocuments.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        BiometricVerificationAcceptedDocument biometricVerificationAcceptedDocument = (BiometricVerificationAcceptedDocument) next;
                        if (!Intrinsics.f(biometricVerificationAcceptedDocument.f50372a, doc2) || !biometricVerificationAcceptedDocument.f50373b.contains(country)) {
                        }
                    } else {
                        next = null;
                    }
                }
                if (((BiometricVerificationAcceptedDocument) next) == null) {
                    Iterator it11 = availableDocuments.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            Object next3 = it11.next();
                            if (Intrinsics.f(((BiometricVerificationAcceptedDocument) next3).f50372a, doc2)) {
                                obj3 = next3;
                            }
                        }
                    }
                    BiometricVerificationAcceptedDocument biometricVerificationAcceptedDocument2 = (BiometricVerificationAcceptedDocument) obj3;
                    if (biometricVerificationAcceptedDocument2 == null || (country = (wi0.b) zhm.d0.d0(biometricVerificationAcceptedDocument2.f50373b)) == null) {
                        throw new IllegalStateException(p.a.p("Document ", doc2.V3(), " not supported"));
                    }
                }
                return pt.f.a(update6, country, doc2);
            case 26:
                Data data = (Data) obj6;
                Intrinsics.h(data);
                return ptf.e.a((ptf.e) obj2, data, null, (String) ((ptf.l) obj5).f239670r.getValue(), 2);
            case 27:
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar20 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) obj6;
                til.r result3 = (til.r) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                aVar20.H2(aVar20.J, new pth.l(obj5, (int) (objArr4 == true ? 1 : 0)));
                if (result3 instanceof til.o) {
                    aVar20.V2(new od9.f(((til.o) result3).f271583b));
                } else {
                    if (!(result3 instanceof til.n) && !(result3 instanceof til.q) && !(result3 instanceof til.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar20.V2(new od9.h(false));
                }
                return Unit.f186387a;
            case 28:
                String str6 = ((SharedStep.Form) obj5).f105713c;
                WorkflowFlowContract$State update7 = (WorkflowFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return WorkflowFlowContract$State.a(update7, null, null, null, ((od9.h) obj6).f224336a ? a1.m(update7.e, str6) : a1.j(update7.e, str6), null, LDSFile.EF_DG15_TAG);
            default:
                com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar21 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) obj6;
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                aVar21.S2("Failed to refreshWorkflowIfStepExpired", it12);
                aVar21.O2(it12, new pt4.d(aVar21, (WorkflowConfiguration.Workflow) obj5, i5));
                return Boolean.TRUE;
        }
    }
}
