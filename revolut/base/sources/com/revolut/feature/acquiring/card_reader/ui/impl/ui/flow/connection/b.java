package com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection;

import a08.r;
import androidx.core.content.ContextCompat;
import b79.g;
import b9i.h;
import bc1.c;
import bc1.i;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlowContract$Step;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.compatibility.CompatibilityCheckScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreenContract$InputData;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.introduction.CardReaderIntroductionScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.scanning.ScanningCardReadersScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating.CardReaderUpdatingScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating.CardReaderUpdatingScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import da1.d;
import ha1.f;
import java.util.List;
import jc1.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m78.e;
import ma1.j;
import ma1.p;
import ma1.q;
import ma1.t;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import te0.w;
import uc1.a;
import ufm.n;
import yhm.m;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends aji.a implements c {

    @NotNull
    public static final i Companion = new i();
    public final da1.b A;
    public final dfc.a B;
    public final j C;
    public final CardReaderConnectionFlowContract$Step.CompatibilityCheck D;
    public final CardReaderConnectionFlowContract$Empty E;
    public final ifm.b F;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CardReaderConnectionFlowContract$InputData f60626x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ca1.a f60627y;
    public final d z;

    public b(CardReaderConnectionFlowContract$InputData inputData, ca1.a cardReaderRepository, d connectionInteractor, da1.b settingsInteractor, dfc.a cardReaderUiRouter, j cardReaderPairingStateReceiver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardReaderRepository, "cardReaderRepository");
        Intrinsics.checkNotNullParameter(connectionInteractor, "connectionInteractor");
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        Intrinsics.checkNotNullParameter(cardReaderUiRouter, "cardReaderUiRouter");
        Intrinsics.checkNotNullParameter(cardReaderPairingStateReceiver, "cardReaderPairingStateReceiver");
        this.f60626x = inputData;
        this.f60627y = cardReaderRepository;
        this.z = connectionInteractor;
        this.A = settingsInteractor;
        this.B = cardReaderUiRouter;
        this.C = cardReaderPairingStateReceiver;
        this.D = CardReaderConnectionFlowContract$Step.CompatibilityCheck.f60617a;
        this.E = CardReaderConnectionFlowContract$Empty.f60615a;
        this.F = new ifm.b();
    }

    @Override // yji.l
    public final void I1() {
        j jVar = this.C;
        ContextCompat.registerReceiver(jVar.f203884a, jVar.f203885b, jVar.f203886c, 2);
    }

    @Override // dki.g, yji.l
    public final void K1() {
        super.K1();
        j jVar = this.C;
        jVar.getClass();
        try {
            m.Companion companion = m.INSTANCE;
            jVar.f203884a.unregisterReceiver(jVar.f203885b);
            Unit unit = Unit.f186387a;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            o.a(th10);
        }
    }

    @Override // aji.a, yji.l
    public final void O1() {
        super.O1();
        this.F.d();
    }

    public final void P2() {
        n nVarI = o70.a.i(((t) this.z).b());
        bc1.d dVar = new bc1.d(this, 2);
        bc1.d dVar2 = new bc1.d(this, 3);
        ufm.i iVar = new ufm.i(nVarI, new o7.b(new h(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new r(9, dVar), new r(9, dVar2), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        w.j0(this.F, iVar2);
    }

    public final void Q2() {
        PairingInfo pairingInfoC = ((f) this.f60627y).c();
        String locale = pairingInfoC != null ? pairingInfoC.k : null;
        if (locale == null) {
            throw new IllegalArgumentException("Card reader locale is required");
        }
        da1.a aVar = da1.b.Companion;
        q qVar = (q) this.A;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(locale, "locale");
        int i = 0;
        pfm.a aVar2 = new pfm.a(qVar.f203899a.i(locale), new e(new p(qVar, i), 17), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        y0(aVar2, false, new bc1.e(this, i), new bc1.d(this, 1));
    }

    public final void R2() {
        pfm.a aVar = new pfm.a(((t) this.z).b(), new g(new bc1.d(this, 9), 27), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        zii.i.G(this, aVar, new bc1.e(this, 1), null, 4);
    }

    public final void S2() {
        pfm.a aVar = new pfm.a(((t) this.z).b(), new g(new bc1.d(this, 4), 26), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        zii.i.G(this, aVar, null, null, 6);
    }

    public final void T2() {
        l.j2(this, new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("READER_SETUP_IS_ALMOST_DONE_PROMPT_ID", new TextLocalisedClause(R$string.merchant_card_reader_flow_connecting_setup_is_almost_done_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_flow_connecting_setup_is_almost_done_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D021", null, null, null, 30), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.merchant_card_reader_common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30)), null, new bc1.d(this, 10), 1);
    }

    public final void U2() {
        zii.i.E0(this, O2(new y0(null, new z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_flow_connecting_failure_description_secondary, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_common_action_done, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5)), new bc1.d(this, 6), null, 14);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        final CardReaderConnectionFlowContract$Step step = (CardReaderConnectionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CardReaderConnectionFlowContract$Step.CompatibilityCheck) {
            CompatibilityCheckScreen compatibilityCheckScreen = new CompatibilityCheckScreen();
            bc1.d dVar = new bc1.d(this, 0);
            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
            compatibilityCheckScreen.H = dVar;
            return compatibilityCheckScreen;
        }
        if (step instanceof CardReaderConnectionFlowContract$Step.Introduction) {
            CardReaderIntroductionScreen cardReaderIntroductionScreen = new CardReaderIntroductionScreen();
            bc1.d block = new bc1.d(this, 7);
            Intrinsics.checkNotNullParameter(block, "block");
            cardReaderIntroductionScreen.H = block;
            return cardReaderIntroductionScreen;
        }
        if (step instanceof CardReaderConnectionFlowContract$Step.Scanning) {
            ScanningCardReadersScreen scanningCardReadersScreen = new ScanningCardReadersScreen();
            bc1.d dVar2 = new bc1.d(this, 8);
            Intrinsics.checkNotNullParameter(dVar2, "<set-?>");
            scanningCardReadersScreen.H = dVar2;
            return scanningCardReadersScreen;
        }
        if (step instanceof CardReaderConnectionFlowContract$Step.Connecting) {
            CardReaderConnectingScreen cardReaderConnectingScreen = new CardReaderConnectingScreen(new CardReaderConnectingScreenContract$InputData(((CardReaderConnectionFlowContract$Step.Connecting) step).f60618a));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: bc1.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b f14371b;

                {
                    this.f14371b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            jc1.a connectionResult = (jc1.a) obj2;
                            Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
                            boolean z = connectionResult instanceof jc1.b;
                            com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b bVar = this.f14371b;
                            if (z) {
                                CardReaderDevice cardReaderDevice = ((CardReaderConnectionFlowContract$Step.Connecting) step).f60618a;
                                PairingInfo pairingInfo = ((jc1.b) connectionResult).f172690a;
                                if (pairingInfo.a()) {
                                    bVar.E2(new CardReaderConnectionFlowContract$Step.Updating(cardReaderDevice, pairingInfo), false, null, false);
                                } else {
                                    bVar.Q2();
                                }
                            } else if (connectionResult instanceof a.b) {
                                bVar.R2();
                            } else if (connectionResult instanceof a.C0982a) {
                                bVar.P2();
                            } else {
                                if (!Intrinsics.f(connectionResult, a.c.f172689a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.T2();
                            }
                            return Unit.f186387a;
                        default:
                            uc1.a updatingResult = (uc1.a) obj2;
                            Intrinsics.checkNotNullParameter(updatingResult, "updatingResult");
                            boolean z3 = updatingResult instanceof a.d;
                            com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b bVar2 = this.f14371b;
                            if (z3) {
                                bVar2.Q2();
                            } else if (updatingResult instanceof a.c) {
                                bVar2.E2(new CardReaderConnectionFlowContract$Step.Connecting(((CardReaderConnectionFlowContract$Step.Updating) step).f60622a), false, null, false);
                            } else if (updatingResult instanceof a.b) {
                                bVar2.R2();
                            } else {
                                if (!(updatingResult instanceof a.C1542a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.P2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            cardReaderConnectingScreen.H = function1;
            return cardReaderConnectingScreen;
        }
        if (!(step instanceof CardReaderConnectionFlowContract$Step.Updating)) {
            if (step instanceof CardReaderConnectionFlowContract$Step.RevolutShop) {
                return e1(h3c.a.f149111a);
            }
            throw new NoWhenBranchMatchedException();
        }
        CardReaderUpdatingScreen cardReaderUpdatingScreen = new CardReaderUpdatingScreen(new CardReaderUpdatingScreenContract$InputData(((CardReaderConnectionFlowContract$Step.Updating) step).f60623b));
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: bc1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b f14371b;

            {
                this.f14371b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        jc1.a connectionResult = (jc1.a) obj2;
                        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
                        boolean z = connectionResult instanceof jc1.b;
                        com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b bVar = this.f14371b;
                        if (z) {
                            CardReaderDevice cardReaderDevice = ((CardReaderConnectionFlowContract$Step.Connecting) step).f60618a;
                            PairingInfo pairingInfo = ((jc1.b) connectionResult).f172690a;
                            if (pairingInfo.a()) {
                                bVar.E2(new CardReaderConnectionFlowContract$Step.Updating(cardReaderDevice, pairingInfo), false, null, false);
                            } else {
                                bVar.Q2();
                            }
                        } else if (connectionResult instanceof a.b) {
                            bVar.R2();
                        } else if (connectionResult instanceof a.C0982a) {
                            bVar.P2();
                        } else {
                            if (!Intrinsics.f(connectionResult, a.c.f172689a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.T2();
                        }
                        return Unit.f186387a;
                    default:
                        uc1.a updatingResult = (uc1.a) obj2;
                        Intrinsics.checkNotNullParameter(updatingResult, "updatingResult");
                        boolean z3 = updatingResult instanceof a.d;
                        com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b bVar2 = this.f14371b;
                        if (z3) {
                            bVar2.Q2();
                        } else if (updatingResult instanceof a.c) {
                            bVar2.E2(new CardReaderConnectionFlowContract$Step.Connecting(((CardReaderConnectionFlowContract$Step.Updating) step).f60622a), false, null, false);
                        } else if (updatingResult instanceof a.b) {
                            bVar2.R2();
                        } else {
                            if (!(updatingResult instanceof a.C1542a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2.P2();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        cardReaderUpdatingScreen.H = function12;
        return cardReaderUpdatingScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.E;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.D;
    }
}
