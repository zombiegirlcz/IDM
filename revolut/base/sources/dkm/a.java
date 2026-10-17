package dkm;

import ald.m;
import android.graphics.drawable.Drawable;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.internal.sticker.StickerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.CreditCardCancellationEntryFlowContract$Step;
import com.revolut.feature.credit.core.ui.progress.CreditProgressContract$Configuration;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.spinner.ForbearanceSpinnerContract$Configuration;
import com.revolut.feature.credit.loan.api.mapper.LoanStampDutyParcel;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputControllerContract$ModalStep;
import com.revolut.feature.junior_settings.impl.R$string;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.feature.subscriptions.impl.history.SubscriptionHistoryActivity;
import com.revolut.feature.vaults.common.SavingsDocumentToAccept;
import com.revolut.feature.wealth.api.domain.model.ExchangeLimitExceededError;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.retail.core.navigation.NaviCommand;
import ds4.y;
import e05.i;
import e85.g;
import e8e.w;
import ebi.j;
import efm.d0;
import eh9.z;
import ip0.um0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;
import nii.y0;
import oki.h;
import pcd.s;
import qv0.p;
import rd0.c;
import ro8.f;
import rp0.f1;
import v0d.b;
import vkm.j2;
import xu.e;
import yjh.b0;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LoanDetails loanDetails;
        int i = this.f;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i2 = 26;
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                String p0 = (String) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((BuiltInsResourceLoader) this.receiver).loadResource(p0);
            case 1:
                Throwable p03 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((com.revolut.feature.contacts.impl.ui.contact.screen.details.a) this.receiver).I2(p03);
                return Boolean.TRUE;
            case 2:
                Throwable p010 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                ((com.revolut.feature.contacts.impl.ui.contact.screen.details.a) this.receiver).I2(p010);
                return Boolean.TRUE;
            case 3:
                f p011 = (f) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                d dVar = (d) this.receiver;
                dVar.getClass();
                if (!Intrinsics.f(p011, f.f255939a)) {
                    throw new NoWhenBranchMatchedException();
                }
                l.a1(dVar, dVar.X1(new mii.f("ID_SHOT_PHONE_REMOVAL_SUCCESS", new TextLocalisedClause(R$string.junior_login_details_phone_remove_success_dialog_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), f1.BOTTOM, null, 76)), null, null, null, 7);
                return Unit.f186387a;
            case 4:
                Throwable p012 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.a aVar = (com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.a) this.receiver;
                aVar.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(c.ERROR, null, null, p012, h0Var);
                h.w2(aVar.u, CreditCardCancellationEntryFlowContract$Step.Error.f69142a, bottom_dialog);
                return Boolean.TRUE;
            case 5:
                e p013 = (e) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                ((ar2.c) this.receiver).a(p013);
                return Unit.f186387a;
            case 6:
                SavingsDocumentToAccept document = (SavingsDocumentToAccept) obj2;
                Intrinsics.checkNotNullParameter(document, "p0");
                drg.l lVar = (drg.l) ((drg.f) this.receiver);
                lVar.getClass();
                Intrinsics.checkNotNullParameter(document, "document");
                lVar.v2(new drg.c(document));
                return Unit.f186387a;
            case 7:
                um0 model = (um0) obj2;
                Intrinsics.checkNotNullParameter(model, "p0");
                drg.l lVar2 = (drg.l) ((drg.f) this.receiver);
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f166695a, "CONFIRMATION_DIALOG_TWIN_BUTTON_LIST_ID")) {
                    j60.a.v(lVar2.v, false, null, 3);
                }
                return Unit.f186387a;
            case 8:
                um0 model2 = (um0) obj2;
                Intrinsics.checkNotNullParameter(model2, "p0");
                drg.l lVar3 = (drg.l) ((drg.f) this.receiver);
                lVar3.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                if (Intrinsics.f(model2.f166695a, "CONFIRMATION_DIALOG_TWIN_BUTTON_LIST_ID")) {
                    j60.a.v(lVar3.v, false, null, 3);
                    lVar3.B2();
                }
                return Unit.f186387a;
            case 9:
                StickerView stickerView = (StickerView) this.receiver;
                int i5 = StickerView.f56067s;
                stickerView.f0((Drawable) obj2);
                return Unit.f186387a;
            case 10:
                Data p014 = (Data) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                CreditProgressContract$Configuration creditProgressContract$Configuration = ((i) this.receiver).f121418h;
                Intrinsics.i(creditProgressContract$Configuration, "null cannot be cast to non-null type com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.spinner.ForbearanceSpinnerContract.Configuration");
                ForbearanceSpinnerContract$Configuration forbearanceSpinnerContract$Configuration = (ForbearanceSpinnerContract$Configuration) creditProgressContract$Configuration;
                if (zi0.c.E(p014) && p014.getContent() != null) {
                    Object content = p014.getContent();
                    if (content == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (forbearanceSpinnerContract$Configuration.i.contains(((lz4.a) ((it3.e) content)).f200935b)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 11:
                NaviCommand p015 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                return ((ln.a) this.receiver).a(p015);
            case 12:
                List p016 = (List) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                ((BaseLayoutBuilderFragment) ((e0l.d) this.receiver)).setItems(p016);
                return Unit.f186387a;
            case 13:
                b p017 = (b) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                com.revolut.feature.semi_independent_onboarding.impl.ui.details.b bVar = (com.revolut.feature.semi_independent_onboarding.impl.ui.details.b) this.receiver;
                bVar.getClass();
                if (p017 instanceof v0d.c) {
                    bVar.l2(new y(bVar, objArr == true ? 1 : 0, 19), new yi5.b(i2));
                } else if (!Intrinsics.f(p017, b.a.f284791a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 14:
                ((e55.a) this.receiver).getClass();
                return e55.a.b((String) obj2);
            case 15:
                cy4.b p018 = (cy4.b) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a aVar2 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a) this.receiver;
                aVar2.getClass();
                String str = p018.f110041a;
                if (Intrinsics.f(str, "ID_CLICK_CONTACT_US") || Intrinsics.f(str, "ID_BUTTON_CONTACT_SUPPORT")) {
                    e85.f fVar = (e85.f) ((g) ((j2) aVar2.z.f22677a).getValue()).f123582b.getContent();
                    if (fVar != null && (loanDetails = fVar.f123579a) != null) {
                        aVar2.f70557w.O(aVar2.v.a(loanDetails));
                    }
                } else {
                    p pVar = p018.f110042b;
                    Object i6 = pVar != null ? pVar.getF55862c() : null;
                    if (i6 instanceof LoanStampDutyParcel) {
                        h.v2(aVar2.A, new AmountInputControllerContract$ModalStep.RepaymentStampDutyExplainer(((LoanStampDutyParcel) i6).f70073a), bottom_dialog);
                    }
                }
                return Unit.f186387a;
            case 16:
                Throwable p019 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                com.revolut.feature.wealth.impl.data.repositories.a aVar3 = (com.revolut.feature.wealth.impl.data.repositories.a) this.receiver;
                ServerError serverErrorA = aVar3.i.a(p019);
                if (serverErrorA == null) {
                    ufm.c cVarL = d0.l(p019);
                    Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                    return cVarL;
                }
                int i21 = serverErrorA.f51362a;
                v60.c cVarB = ((ao0.a) aVar3.f95515j).b(Integer.valueOf(i21));
                if (i21 == wd6.g.DAILY_EXCHANGE_LIMIT_EXCEEDED.a() && cVarB != null) {
                    p019 = new ExchangeLimitExceededError(ofm.q.O(cVarB));
                }
                ufm.c cVarL2 = d0.l(p019);
                Intrinsics.checkNotNullExpressionValue(cVarL2, "let(...)");
                return cVarL2;
            case 17:
                q90.i p020 = (q90.i) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                return ((t90.g) this.receiver).a(p020);
            case 18:
                q90.i p021 = (q90.i) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                return ((t90.g) this.receiver).a(p021);
            case 19:
                return Boolean.valueOf(e0m.g.a((String) obj2));
            case 20:
                ((ypi.i) this.receiver).setEnabled(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 21:
                List p022 = (List) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                ((SubscriptionHistoryActivity) ((eae.c) this.receiver)).setItems(p022);
                return Unit.f186387a;
            case 22:
                Throwable p023 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                j jVar = (j) this.receiver;
                jVar.getClass();
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(c.ERROR, null, null, p023, h0Var2);
                jVar.H2(jVar.f124376t, new ebi.i(i3));
                return Boolean.FALSE;
            case 23:
                ExchangeGlobalAccessOutput p024 = (ExchangeGlobalAccessOutput) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                com.revolut.feature.pockets.impl.details_v2.mcy.b bVar2 = (com.revolut.feature.pockets.impl.details_v2.mcy.b) this.receiver;
                bVar2.getClass();
                if (p024 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                    bVar2.l2(new eea.d(bVar2, objArr2 == true ? 1 : 0, i3), new yi5.b(i2));
                } else if (p024 instanceof ExchangeGlobalAccessOutput.FeatureNotAvailable) {
                    h.D2(bVar2.f80830r);
                }
                return Unit.f186387a;
            case 24:
                s vault = (s) obj2;
                Intrinsics.checkNotNullParameter(vault, "p0");
                ypg.g gVar = (ypg.g) this.receiver;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(vault, "vault");
                qq8.a aVar4 = gVar.f315871a;
                Intrinsics.checkNotNullParameter(vault, "vault");
                d0 d0VarFirstOrError = m70.a.e(rd0.e.c(rd0.e.b(nim.a.w(aVar4.f248500a.R(), new aed.c(aVar4, vault, 7))), kotlin.coroutines.g.f186406a), new yi3.d(vault, 10), new b0(29)).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return ue0.e.F(d0VarFirstOrError, vault);
            case 25:
                eg0.c p025 = (eg0.c) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                return (aj0.c) ((eg0.h) this.receiver).i.get(p025.a());
            case 26:
                zf0.c p026 = (zf0.c) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                return (List) ((eg0.h) this.receiver).f125520h.get(String.valueOf(p026.hashCode()));
            case 27:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "p0");
                z zVar = (z) this.receiver;
                nh9.f fVar2 = (nh9.f) zVar.f125811y;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                oi0.d.I(fVar2.q2(), false, false);
                nii.z zVarA = fVar2.f215389l.a(throwable);
                if (zVarA != null) {
                    l.a1(zVar, zVar.X1(new y0(null, zVarA, false, 5)), null, null, null, 7);
                }
                return Boolean.valueOf(zVarA != null);
            case 28:
                li8.i p027 = (li8.i) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e eVar = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e) this.receiver;
                eVar.getClass();
                int i22 = 6;
                Continuation continuation = null;
                if (p027 instanceof li8.f) {
                    eVar.n2(new m((Object) eVar, (Object) ((li8.f) p027).f195429a, true, continuation, 12), new whi.b(i22));
                } else if (p027 instanceof li8.g) {
                    eVar.n2(new w(eVar, ((li8.g) p027).f195430a, continuation, 25), new whi.b(i22));
                } else {
                    if (!(p027 instanceof li8.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.n2(new w(eVar, ((li8.h) p027).f195431a, continuation, i2), new whi.b(i22));
                }
                return Unit.f186387a;
            default:
                d0 p028 = (d0) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                eif.d dVar2 = (eif.d) this.receiver;
                ufm.i iVar = new ufm.i(te0.w.H0(p028, dVar2.f126601p.f(false)), new ed7.e(new eif.b(dVar2, 2), 20), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
        }
    }
}
