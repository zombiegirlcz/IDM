package com.revolut.feature.workflow.engine.rfi.impl.ui.flow;

import a41.j1;
import ahd.c;
import aw0.o9;
import ble.c1;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.choice.ChoiceQuestionScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.documents.ChooseDocumentsScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.flow.ScreeningFlowContract$ModalStep;
import com.revolut.feature.workflow.engine.rfi.impl.ui.flow.ScreeningFlowContract$Step;
import com.revolut.feature.workflow.engine.rfi.impl.ui.multi_text.MultiTextQuestionScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.text.TextQuestionScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.TimelineQuestionScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.yes_no.YesNoQuestionScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.flows.income.IncomeFlowInputData;
import com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowInputData;
import com.revolut.shared.feature.user_declarations.api.navigation.IncomeFlowControllerDescriptor;
import com.revolut.shared.feature.user_declarations.api.navigation.PlaceOfBirthControllerDescriptor;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Dialog;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import hx7.e;
import ihm.f;
import iuh.f;
import iuh.l;
import iuh.m;
import iuh.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.b0;
import nii.c0;
import nii.y0;
import no.e0;
import nuh.d;
import nuh.g;
import nuh.k;
import oki.h;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import vkm.q;
import vkm.v1;
import vkm.y;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;
import zth.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements d {

    @NotNull
    private static final g Companion = new g();
    public final ScreeningFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f96556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nuh.a f96557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f96558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f96559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f96560t;
    public final f u;
    public final qki.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.a f96561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f96562x;

    public a(ScreeningFlowContract$InputData inputData, l buttonClauseFactory, nuh.a dialogMapper, m questionSubtitleMapper, b interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(buttonClauseFactory, "buttonClauseFactory");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(questionSubtitleMapper, "questionSubtitleMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = inputData;
        this.f96556p = buttonClauseFactory;
        this.f96557q = dialogMapper;
        this.f96558r = questionSubtitleMapper;
        this.f96559s = interactor;
        this.u = v0.a.d("create(...)");
        Question question = (Question) d0.b0(inputData.f96551b);
        f0 f0Var = f0.f322471a;
        this.v = e.b(this, new ScreeningFlowContract$State(question, f0Var));
        final int i = 0;
        this.f96561w = cp5.d.a(this, new ScreeningFlowContract$Step.Questionnaire((Question) d0.b0(inputData.f96551b)), f0Var, new Function2(this) { // from class: nuh.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a f219306b;

            {
                this.f219306b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                BaseQuestionScreen yesNoQuestionScreen;
                lw0.a aVar;
                switch (i) {
                    case 0:
                        yki.l FlowCoordinator = (yki.l) obj2;
                        ScreeningFlowContract$Step step = (ScreeningFlowContract$Step) obj3;
                        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!(step instanceof ScreeningFlowContract$Step.Questionnaire)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a aVar2 = this.f219306b;
                        iuh.l lVar = aVar2.f96556p;
                        m mVar = aVar2.f96558r;
                        Question question2 = ((ScreeningFlowContract$Step.Questionnaire) step).f96555a;
                        if (question2 instanceof Question.City) {
                            Question.City city = (Question.City) question2;
                            TextClause textClause = new TextClause(city.f105609b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            CompositeClause compositeClauseA = ((n) mVar).a(question2);
                            boolean zK2 = aVar2.K2(city);
                            lVar.getClass();
                            ViewController viewControllerE1 = aVar2.e1(new PlaceOfBirthControllerDescriptor(new PlaceOfBirthFlowInputData(textClause, compositeClauseA, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), iuh.l.a(zK2), 76)));
                            e0 block = new e0(aVar2, city, 18);
                            Intrinsics.checkNotNullParameter(block, "block");
                            viewControllerE1.H = block;
                            return viewControllerE1;
                        }
                        if (question2 instanceof Question.Income) {
                            Question.Income income = (Question.Income) question2;
                            TextClause textClause2 = new TextClause(income.f105616b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            CompositeClause compositeClauseA2 = ((n) mVar).a(question2);
                            Clause textClause3 = compositeClauseA2 == null ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : compositeClauseA2;
                            boolean zK22 = aVar2.K2(income);
                            lVar.getClass();
                            TextLocalisedClause textLocalisedClauseA = iuh.l.a(zK22);
                            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                            List list = income.e;
                            sil.b bVar = sil.c.Companion;
                            if (list.isEmpty()) {
                                bVar.getClass();
                                list = sil.c.JUST_ANNUAL_FREQUENCY;
                            }
                            ViewController viewControllerE12 = aVar2.e1(new IncomeFlowControllerDescriptor(new IncomeFlowInputData(textClause2, textClause3, (TextLocalisedClause) null, textLocalisedClauseA, resourceImage, (xi0.b) null, list, 4)));
                            e0 block2 = new e0(aVar2, income, 19);
                            Intrinsics.checkNotNullParameter(block2, "block");
                            viewControllerE12.H = block2;
                            return viewControllerE12;
                        }
                        if (question2 instanceof Question.Choice) {
                            yesNoQuestionScreen = new ChoiceQuestionScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i2 = 0;
                            Function1 block3 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i2) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block3, "block");
                            yesNoQuestionScreen.H = block3;
                        } else if (question2 instanceof Question.MultiText) {
                            yesNoQuestionScreen = new MultiTextQuestionScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i3 = 1;
                            Function1 block4 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i3) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block4, "block");
                            yesNoQuestionScreen.H = block4;
                        } else if (question2 instanceof Question.Timeline) {
                            yesNoQuestionScreen = new TimelineQuestionScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i5 = 2;
                            Function1 block5 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i5) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block5, "block");
                            yesNoQuestionScreen.H = block5;
                        } else if (question2 instanceof Question.Documents) {
                            yesNoQuestionScreen = new ChooseDocumentsScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i6 = 3;
                            Function1 block6 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i6) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block6, "block");
                            yesNoQuestionScreen.H = block6;
                        } else if (question2 instanceof Question.Text) {
                            yesNoQuestionScreen = new TextQuestionScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i21 = 4;
                            Function1 block7 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i21) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block7, "block");
                            yesNoQuestionScreen.H = block7;
                        } else {
                            if (!(question2 instanceof Question.YesNo)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            yesNoQuestionScreen = new YesNoQuestionScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i22 = 5;
                            Function1 block8 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i22) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block8, "block");
                            yesNoQuestionScreen.H = block8;
                        }
                        return yesNoQuestionScreen;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        ScreeningFlowContract$ModalStep step2 = (ScreeningFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step2, "step");
                        if (!(step2 instanceof ScreeningFlowContract$ModalStep.DescriptionDialog)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a aVar3 = this.f219306b.f96557q;
                        Dialog dialog = ((ScreeningFlowContract$ModalStep.DescriptionDialog) step2).f96552a;
                        AnalyticsProduct.Shared analyticsProduct = iuh.a.f168605a;
                        ((b) aVar3).getClass();
                        Intrinsics.checkNotNullParameter(dialog, "dialog");
                        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                        String str = dialog.f105586b;
                        if (str != null) {
                            TextClause textClause4 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            String str2 = dialog.f105587c;
                            aVar = new lw0.a(textClause4, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
                        } else {
                            aVar = null;
                        }
                        ArrayList arrayList = dialog.d;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        int i32 = 0;
                        for (Object obj4 : arrayList) {
                            int i33 = i32 + 1;
                            if (i32 < 0) {
                                v.s();
                                throw null;
                            }
                            Dialog.Item item = (Dialog.Item) obj4;
                            TextClause textClause5 = new TextClause(item.f105589b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            String str3 = item.f105590c;
                            TextClause textClause6 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                            arrayList2.add(new eii.l((Clause) textClause5, (Clause) textClause6, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(yxc.l.b(item.f105588a), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), false, false, (RowDelegate.Model.c) null, (Object) (i32 + "_" + item.f105589b), BERTags.FLAGS));
                            i32 = i33;
                        }
                        return new RowActionsBottomSheetController(new eii.c(aVar, null, arrayList2, analyticsProduct, null));
                }
            }
        });
        final int i2 = 1;
        this.f96562x = new com.revolut.kompot.navigable.vc.modal.a(this, new Function2(this) { // from class: nuh.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a f219306b;

            {
                this.f219306b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                BaseQuestionScreen yesNoQuestionScreen;
                lw0.a aVar;
                switch (i2) {
                    case 0:
                        yki.l FlowCoordinator = (yki.l) obj2;
                        ScreeningFlowContract$Step step = (ScreeningFlowContract$Step) obj3;
                        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!(step instanceof ScreeningFlowContract$Step.Questionnaire)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a aVar2 = this.f219306b;
                        iuh.l lVar = aVar2.f96556p;
                        m mVar = aVar2.f96558r;
                        Question question2 = ((ScreeningFlowContract$Step.Questionnaire) step).f96555a;
                        if (question2 instanceof Question.City) {
                            Question.City city = (Question.City) question2;
                            TextClause textClause = new TextClause(city.f105609b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            CompositeClause compositeClauseA = ((n) mVar).a(question2);
                            boolean zK2 = aVar2.K2(city);
                            lVar.getClass();
                            ViewController viewControllerE1 = aVar2.e1(new PlaceOfBirthControllerDescriptor(new PlaceOfBirthFlowInputData(textClause, compositeClauseA, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), iuh.l.a(zK2), 76)));
                            e0 block = new e0(aVar2, city, 18);
                            Intrinsics.checkNotNullParameter(block, "block");
                            viewControllerE1.H = block;
                            return viewControllerE1;
                        }
                        if (question2 instanceof Question.Income) {
                            Question.Income income = (Question.Income) question2;
                            TextClause textClause2 = new TextClause(income.f105616b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            CompositeClause compositeClauseA2 = ((n) mVar).a(question2);
                            Clause textClause3 = compositeClauseA2 == null ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : compositeClauseA2;
                            boolean zK22 = aVar2.K2(income);
                            lVar.getClass();
                            TextLocalisedClause textLocalisedClauseA = iuh.l.a(zK22);
                            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                            List list = income.e;
                            sil.b bVar = sil.c.Companion;
                            if (list.isEmpty()) {
                                bVar.getClass();
                                list = sil.c.JUST_ANNUAL_FREQUENCY;
                            }
                            ViewController viewControllerE12 = aVar2.e1(new IncomeFlowControllerDescriptor(new IncomeFlowInputData(textClause2, textClause3, (TextLocalisedClause) null, textLocalisedClauseA, resourceImage, (xi0.b) null, list, 4)));
                            e0 block2 = new e0(aVar2, income, 19);
                            Intrinsics.checkNotNullParameter(block2, "block");
                            viewControllerE12.H = block2;
                            return viewControllerE12;
                        }
                        if (question2 instanceof Question.Choice) {
                            yesNoQuestionScreen = new ChoiceQuestionScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i22 = 0;
                            Function1 block3 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i22) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block3, "block");
                            yesNoQuestionScreen.H = block3;
                        } else if (question2 instanceof Question.MultiText) {
                            yesNoQuestionScreen = new MultiTextQuestionScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i3 = 1;
                            Function1 block4 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i3) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block4, "block");
                            yesNoQuestionScreen.H = block4;
                        } else if (question2 instanceof Question.Timeline) {
                            yesNoQuestionScreen = new TimelineQuestionScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i5 = 2;
                            Function1 block5 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i5) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block5, "block");
                            yesNoQuestionScreen.H = block5;
                        } else if (question2 instanceof Question.Documents) {
                            yesNoQuestionScreen = new ChooseDocumentsScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i6 = 3;
                            Function1 block6 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i6) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block6, "block");
                            yesNoQuestionScreen.H = block6;
                        } else if (question2 instanceof Question.Text) {
                            yesNoQuestionScreen = new TextQuestionScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i21 = 4;
                            Function1 block7 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i21) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block7, "block");
                            yesNoQuestionScreen.H = block7;
                        } else {
                            if (!(question2 instanceof Question.YesNo)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            yesNoQuestionScreen = new YesNoQuestionScreen(new BaseQuestionScreenContract$InputData(aVar2.K2(question2), question2));
                            final int i222 = 5;
                            Function1 block8 = new Function1() { // from class: nuh.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    iuh.f it8 = (iuh.f) obj4;
                                    switch (i222) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 1:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 2:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 3:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        case 4:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                        default:
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar2.J2(it8);
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            };
                            Intrinsics.checkNotNullParameter(block8, "block");
                            yesNoQuestionScreen.H = block8;
                        }
                        return yesNoQuestionScreen;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        ScreeningFlowContract$ModalStep step2 = (ScreeningFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step2, "step");
                        if (!(step2 instanceof ScreeningFlowContract$ModalStep.DescriptionDialog)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a aVar3 = this.f219306b.f96557q;
                        Dialog dialog = ((ScreeningFlowContract$ModalStep.DescriptionDialog) step2).f96552a;
                        AnalyticsProduct.Shared analyticsProduct = iuh.a.f168605a;
                        ((b) aVar3).getClass();
                        Intrinsics.checkNotNullParameter(dialog, "dialog");
                        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                        String str = dialog.f105586b;
                        if (str != null) {
                            TextClause textClause4 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            String str2 = dialog.f105587c;
                            aVar = new lw0.a(textClause4, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
                        } else {
                            aVar = null;
                        }
                        ArrayList arrayList = dialog.d;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        int i32 = 0;
                        for (Object obj4 : arrayList) {
                            int i33 = i32 + 1;
                            if (i32 < 0) {
                                v.s();
                                throw null;
                            }
                            Dialog.Item item = (Dialog.Item) obj4;
                            TextClause textClause5 = new TextClause(item.f105589b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            String str3 = item.f105590c;
                            TextClause textClause6 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                            arrayList2.add(new eii.l((Clause) textClause5, (Clause) textClause6, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(yxc.l.b(item.f105588a), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), false, false, (RowDelegate.Model.c) null, (Object) (i32 + "_" + item.f105589b), BERTags.FLAGS));
                            i32 = i33;
                        }
                        return new RowActionsBottomSheetController(new eii.c(aVar, null, arrayList2, analyticsProduct, null));
                }
            }
        });
    }

    @Override // yji.l
    public final void I1() {
        List list = this.o.f96551b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String questionId = ((Question) it8.next()).getF105636a();
            huh.m mVar = (huh.m) this.f96559s;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            arrayList.add(q.q(new c(mVar.f155668c, questionId, 3)));
        }
        yji.l.a1(this, q.I(arrayList), null, null, new nuh.h(this, null), 3);
    }

    public final void I2(iuh.g gVar) {
        qki.d dVar = this.v;
        if (K2(((ScreeningFlowContract$State) ((j2) dVar.f22677a).getValue()).f96553a)) {
            H2(dVar, new nrd.g(gVar, 8));
            N2();
            return;
        }
        List list = this.o.f96551b;
        Question question = (Question) list.get(list.lastIndexOf(((ScreeningFlowContract$State) ((j2) dVar.f22677a).getValue()).f96553a) + 1);
        h.t2(this, this.f96561w, new ScreeningFlowContract$Step.Questionnaire(question), true, null, false, 12);
        H2(dVar, new e0(question, gVar, 17));
    }

    public final void J2(iuh.f fVar) {
        if (Intrinsics.f(fVar, f.a.f168609a)) {
            L2();
        } else {
            if (!(fVar instanceof iuh.g)) {
                throw new NoWhenBranchMatchedException();
            }
            I2((iuh.g) fVar);
        }
    }

    public final boolean K2(Question question) {
        return Intrinsics.f(d0.o0(this.o.f96551b), question);
    }

    public final void L2() {
        Dialog d = ((ScreeningFlowContract$State) ((j2) this.v.f22677a).getValue()).f96553a.getD();
        if (d == null) {
            return;
        }
        h.v2(this.f96562x, new ScreeningFlowContract$ModalStep.DescriptionDialog(d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void M2(boolean z, boolean z3) {
        X1(new y0(null, z ? new b0(new TextLocalisedClause(R$string.chooseDocuments_upload_title, null, null, 14), new TextLocalisedClause(R$string.chooseDocuments_upload_description, null, null, 14), null, null, this.u, 0, z3, false, null, 1836) : new c0(null, null, null, z3, null, false, false, null, 1903), false, 5));
    }

    public final void N2() {
        Continuation continuation;
        y yVarE;
        List answers = ((ScreeningFlowContract$State) ((j2) this.v.f22677a).getValue()).f96554b;
        a2 a2Var = this.f96560t;
        if (a2Var != null) {
            a2Var.f(null);
        }
        String stepId = this.o.f96550a;
        huh.m mVar = (huh.m) this.f96559s;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(answers, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : answers) {
            if (obj2 instanceof Answer.Documents) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            continuation = null;
            yVarE = rd0.e.e(new c1(new v1(new j1(mVar, (Object) null, answers, stepId, (Continuation) null, 11)), 11), h0.f322473a, new huh.h(3, null));
        } else {
            cuh.b bVar = mVar.f155667b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Flow flowQ = q.q(mo3.a.g(zi0.c.w(bVar.e.c(stepId, false)), null, new ht1.l(7), 1));
            huh.f fVar = new huh.f(mVar, arrayList, stepId, answers, null);
            answers = answers;
            yVarE = rd0.e.e(q.B(fVar, flowQ), h0.f322473a, new huh.g(3, null));
            continuation = null;
        }
        this.f96560t = yji.l.a1(this, new y(new nn7.d(this, answers, continuation, 23), yVarE), null, null, new k(this, continuation), 3);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.v;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f96561w;
    }
}
