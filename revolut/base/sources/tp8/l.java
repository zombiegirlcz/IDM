package tp8;

import a2l.y;
import aii.r;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import c5j.k;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.beneficiary.ConfirmationResult;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.ui.impl.ui.qr.permissions.QrWrapperPermissionsFlowModel$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering.ComboCardOrderingFlowContract$Step;
import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.CeFiToDeFiAssetPickerContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$SingleChoiceItem;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreen;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.BeneficiaryCreationType;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.ConfirmationOfPayeeScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$InputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.common.mapper.backend_fields.input.LocaleExtraData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary.DuplicateBeneficiaryDialogScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary.DuplicateBeneficiaryDialogScreenContract$InputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CreationProcessState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$Step;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreenContract$InputData;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import d27.f0;
import grl.k9;
import ip0.v7;
import ip0.zj;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import r7a.e;
import r7a.f;
import r7a.g;
import r7a.h;
import r7a.i;
import s70.b;
import twb.h0;
import tx0.p4;
import u37.p;
import u37.q;
import u37.v;
import vkm.j2;
import yhm.m;
import yhm.o;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f273321b;

    public /* synthetic */ l(Object obj2, int i) {
        this.f273320a = i;
        this.f273321b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        List listC;
        u0d.b bVar = (u0d.b) this.f273321b;
        Throwable th10 = (Throwable) obj2;
        Function1 defaultErrorProvider = (Function1) obj3;
        Intrinsics.checkNotNullParameter(defaultErrorProvider, "defaultErrorProvider");
        if (th10 != null) {
            listC = u.c(new FullScreenStateDelegate.Model("LIST_ID_ERROR_RETRY", hf8.b.a(bVar.f276164a, th10), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        } else {
            listC = (List) defaultErrorProvider.invoke(new iii.d(10, null, true, false, "LIST_ID_ERROR_RETRY"));
        }
        return new s0d.l(null, null, listC);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    private final Object b(Object obj2, Object obj3) {
        PaymentOptionsVaultWithdrawalScreen paymentOptionsVaultWithdrawalScreen = (PaymentOptionsVaultWithdrawalScreen) this.f273321b;
        AmountEditDelegate.Model data = (AmountEditDelegate.Model) obj2;
        AmountEditView field = (AmountEditView) obj3;
        KProperty[] kPropertyArr = PaymentOptionsVaultWithdrawalScreen.f101889e0;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        xi0.a aVar = xi0.b.Companion;
        Object obj4 = data.f51629j;
        Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.String");
        aVar.getClass();
        return new zp0.d(editText, xi0.a.a((String) obj4), new u80.d(((s80.b) ((qd0.b) paymentOptionsVaultWithdrawalScreen.V.getValue())).b()), null, new u1k.c(paymentOptionsVaultWithdrawalScreen, data), false, false, 0, false, null, 1928);
    }

    private final Object c(Object obj2, Object obj3) {
        u1l.e eVar = (u1l.e) this.f273321b;
        String partnerId = (String) obj2;
        y domain = (y) obj3;
        Intrinsics.checkNotNullParameter(partnerId, "params");
        Intrinsics.checkNotNullParameter(domain, "domain");
        ne0.d dVar = eVar.f276439c;
        u1l.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        dVar.f("KEY_TRAVEL_STATUS_PARTNER_LAYOUT_" + partnerId, domain);
        return Unit.f186387a;
    }

    private final Object d(Object obj2, Object obj3) {
        final com.revolut.feature.apm.core.ui.impl.ui.qr.permissions.a aVar = (com.revolut.feature.apm.core.ui.impl.ui.qr.permissions.a) this.f273321b;
        yki.l FlowCoordinator = (yki.l) obj2;
        QrWrapperPermissionsFlowModel$Step step = (QrWrapperPermissionsFlowModel$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof QrWrapperPermissionsFlowModel$Step.PermissionsGranted) {
            ViewController viewController = aVar.o;
            final int i = 0;
            Function1 block = new Function1() { // from class: u32.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) throws Throwable {
                    switch (i) {
                        case 0:
                            r it8 = (r) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            aVar.C2(it8);
                            return Unit.f186387a;
                        default:
                            i permissionFlowOutput = (i) obj4;
                            Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                            boolean z = permissionFlowOutput instanceof e;
                            com.revolut.feature.apm.core.ui.impl.ui.qr.permissions.a aVar2 = aVar;
                            if (z || (permissionFlowOutput instanceof f)) {
                                aVar2.C1(new ExternalDestination.ByIntent(((b) aVar2.f62380q).b(), null));
                                aVar2.C2(aVar2.f62379p);
                            } else if (permissionFlowOutput instanceof h) {
                                oki.h.t2(aVar2, aVar2.f62381r, QrWrapperPermissionsFlowModel$Step.PermissionsGranted.f62378a, false, null, false, 12);
                            } else {
                                if (!(permissionFlowOutput instanceof g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                try {
                                    m.Companion companion = m.INSTANCE;
                                    throw new IllegalStateException("Unhandled secondary click");
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable th10) {
                                    m.Companion companion2 = m.INSTANCE;
                                    Throwable thA = m.a(o.a(th10));
                                    if (thA != null) {
                                        hx7.e.n(thA);
                                    }
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            viewController.getClass();
            Intrinsics.checkNotNullParameter(block, "block");
            viewController.H = block;
            return viewController;
        }
        if (!(step instanceof QrWrapperPermissionsFlowModel$Step.Permissions)) {
            throw new NoWhenBranchMatchedException();
        }
        PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(u.c(new PermissionsControllerContract$Permission("android.permission.CAMERA", null, null, true, 6))));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: u32.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) throws Throwable {
                switch (i2) {
                    case 0:
                        r it8 = (r) obj4;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        aVar.C2(it8);
                        return Unit.f186387a;
                    default:
                        i permissionFlowOutput = (i) obj4;
                        Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                        boolean z = permissionFlowOutput instanceof e;
                        com.revolut.feature.apm.core.ui.impl.ui.qr.permissions.a aVar2 = aVar;
                        if (z || (permissionFlowOutput instanceof f)) {
                            aVar2.C1(new ExternalDestination.ByIntent(((b) aVar2.f62380q).b(), null));
                            aVar2.C2(aVar2.f62379p);
                        } else if (permissionFlowOutput instanceof h) {
                            oki.h.t2(aVar2, aVar2.f62381r, QrWrapperPermissionsFlowModel$Step.PermissionsGranted.f62378a, false, null, false, 12);
                        } else {
                            if (!(permissionFlowOutput instanceof g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            try {
                                m.Companion companion = m.INSTANCE;
                                throw new IllegalStateException("Unhandled secondary click");
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable th10) {
                                m.Companion companion2 = m.INSTANCE;
                                Throwable thA = m.a(o.a(th10));
                                if (thA != null) {
                                    hx7.e.n(thA);
                                }
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        permissionsController.H = block2;
        return permissionsController;
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a aVar = (com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a) this.f273321b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CeFiToDeFiAssetPickerContract$ModalStep step = (CeFiToDeFiAssetPickerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, CeFiToDeFiAssetPickerContract$ModalStep.AvailableAssetsInfo.f71744a)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.f71745p.getClass();
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature.defi.exchange.impl.R$string.crypto_defi_add_crypto_asset_picker_info_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.defi.exchange.impl.R$string.crypto_defi_add_crypto_asset_picker_info_description, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    private final Object g(Object obj2, Object obj3) {
        Iterable iterableK;
        final com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a) this.f273321b;
        l80.e eVar = aVar.u;
        cli.y yVar = aVar.f74351x;
        v vVar = aVar.f74349t;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TaxHubCreateProfileScreenContract$ModalStep step = (TaxHubCreateProfileScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, TaxHubCreateProfileScreenContract$ModalStep.NextPaymentDatePicker.f74342a)) {
            LocalDate localDateE = ((l80.f) eVar).e();
            vVar.getClass();
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_setup_next_payment_date_title_income, null, null, 14);
            LocalDate localDate = ((u37.g) ((j2) yVar.f22677a).getValue()).d;
            FreelancerDatePickerScreen freelancerDatePickerScreen = new FreelancerDatePickerScreen(new FreelancerDatePickerScreenContract$InputData(textLocalisedClause, localDate == null ? localDateE : localDate, ((u37.g) ((j2) yVar.f22677a).getValue()).d, localDateE, null, 16));
            final int i = 1;
            Function1 block = new Function1() { // from class: u37.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            final mw6.e outputData = (mw6.e) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof mw6.c) {
                                com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar2 = aVar;
                                final int i2 = 1;
                                aVar2.H2(aVar2.f74351x, new Function1() { // from class: u37.o
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        switch (i2) {
                                            case 0:
                                                g update = (g) obj5;
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                return g.a(update, null, null, ds6.a.valueOf(((mw6.c) outputData).f209401a), null, null, false, 43);
                                            default:
                                                g update2 = (g) obj5;
                                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                                return g.a(update2, null, null, null, null, Month.valueOf(((mw6.c) outputData).f209401a), false, 47);
                                        }
                                    }
                                });
                            }
                            return Unit.f186387a;
                        case 1:
                            kw6.b outputData2 = (kw6.b) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            if (outputData2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar3 = aVar;
                            aVar3.H2(aVar3.f74351x, new f0(outputData2, 2));
                            return Unit.f186387a;
                        default:
                            final mw6.e outputData3 = (mw6.e) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            if (outputData3 instanceof mw6.c) {
                                com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar4 = aVar;
                                final int i3 = 0;
                                aVar4.H2(aVar4.f74351x, new Function1() { // from class: u37.o
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        switch (i3) {
                                            case 0:
                                                g update = (g) obj5;
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                return g.a(update, null, null, ds6.a.valueOf(((mw6.c) outputData3).f209401a), null, null, false, 43);
                                            default:
                                                g update2 = (g) obj5;
                                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                                return g.a(update2, null, null, null, null, Month.valueOf(((mw6.c) outputData3).f209401a), false, 47);
                                        }
                                    }
                                });
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            freelancerDatePickerScreen.H = block;
            return freelancerDatePickerScreen;
        }
        if (Intrinsics.f(step, TaxHubCreateProfileScreenContract$ModalStep.TaxPeriodPicker.f74344a)) {
            Object content = ((u37.g) ((j2) yVar.f22677a).getValue()).f276792a.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            u37.l lVar = (u37.l) content;
            ds6.a aVar2 = ((u37.g) ((j2) yVar.f22677a).getValue()).f276794c;
            String strName = aVar2 != null ? aVar2.name() : null;
            Clause clauseD = vVar.d(lVar.f276798b);
            ArrayList<ds6.a> arrayList = lVar.f276797a.f117241b;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (ds6.a aVar3 : arrayList) {
                String strName2 = aVar3.name();
                aVar.f74348s.getClass();
                arrayList2.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(w37.b.a(aVar3), strName2));
            }
            FreelancerSingleChoiceScreen freelancerSingleChoiceScreen = new FreelancerSingleChoiceScreen(new FreelancerSingleChoiceScreenContract$InputData(clauseD, null, arrayList2, strName));
            final int i2 = 2;
            Function1 block2 = new Function1() { // from class: u37.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            final mw6.e outputData = (mw6.e) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof mw6.c) {
                                com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar22 = aVar;
                                final int i22 = 1;
                                aVar22.H2(aVar22.f74351x, new Function1() { // from class: u37.o
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        switch (i22) {
                                            case 0:
                                                g update = (g) obj5;
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                return g.a(update, null, null, ds6.a.valueOf(((mw6.c) outputData).f209401a), null, null, false, 43);
                                            default:
                                                g update2 = (g) obj5;
                                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                                return g.a(update2, null, null, null, null, Month.valueOf(((mw6.c) outputData).f209401a), false, 47);
                                        }
                                    }
                                });
                            }
                            return Unit.f186387a;
                        case 1:
                            kw6.b outputData2 = (kw6.b) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            if (outputData2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar32 = aVar;
                            aVar32.H2(aVar32.f74351x, new f0(outputData2, 2));
                            return Unit.f186387a;
                        default:
                            final mw6.e outputData3 = (mw6.e) obj4;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            if (outputData3 instanceof mw6.c) {
                                com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar4 = aVar;
                                final int i3 = 0;
                                aVar4.H2(aVar4.f74351x, new Function1() { // from class: u37.o
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        switch (i3) {
                                            case 0:
                                                g update = (g) obj5;
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                return g.a(update, null, null, ds6.a.valueOf(((mw6.c) outputData3).f209401a), null, null, false, 43);
                                            default:
                                                g update2 = (g) obj5;
                                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                                return g.a(update2, null, null, null, null, Month.valueOf(((mw6.c) outputData3).f209401a), false, 47);
                                        }
                                    }
                                });
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            freelancerSingleChoiceScreen.H = block2;
            return freelancerSingleChoiceScreen;
        }
        if (!Intrinsics.f(step, TaxHubCreateProfileScreenContract$ModalStep.ClosingMonthPicker.f74341a)) {
            if (step instanceof TaxHubCreateProfileScreenContract$ModalStep.NotificationToggle) {
                return new TaxHubReminderScreen(new TaxHubReminderScreenContract$InputData(((TaxHubCreateProfileScreenContract$ModalStep.NotificationToggle) step).f74343a, false));
            }
            throw new NoWhenBranchMatchedException();
        }
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        Object content2 = ((u37.g) j2Var.getValue()).f276792a.getContent();
        if (content2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Clause clauseB = vVar.b(((u37.l) content2).f276798b);
        ds6.a aVar4 = ((u37.g) j2Var2.getValue()).f276794c;
        if (aVar4 == null) {
            iterableK = zhm.f0.f322471a;
        } else if (q.f276809a[aVar4.ordinal()] == 1) {
            LocalDate localDatePlusDays = ((l80.f) eVar).e().plusDays(1L);
            iterableK = zhm.v.k(localDatePlusDays.getMonth(), localDatePlusDays.plusMonths(1L).getMonth(), localDatePlusDays.plusMonths(2L).getMonth());
        } else {
            iterableK = p.f276808a;
        }
        Iterable<Month> iterable = iterableK;
        ArrayList arrayList3 = new ArrayList(w.t(iterable, 10));
        for (Month month : iterable) {
            arrayList3.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(vVar.c(month), month.name()));
        }
        Month month2 = ((u37.g) j2Var2.getValue()).e;
        FreelancerSingleChoiceScreen freelancerSingleChoiceScreen2 = new FreelancerSingleChoiceScreen(new FreelancerSingleChoiceScreenContract$InputData(clauseB, null, arrayList3, month2 != null ? month2.name() : null));
        final int i3 = 0;
        Function1 block3 = new Function1() { // from class: u37.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i3) {
                    case 0:
                        final mw6.e outputData = (mw6.e) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        if (outputData instanceof mw6.c) {
                            com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar22 = aVar;
                            final int i22 = 1;
                            aVar22.H2(aVar22.f74351x, new Function1() { // from class: u37.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    switch (i22) {
                                        case 0:
                                            g update = (g) obj5;
                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                            return g.a(update, null, null, ds6.a.valueOf(((mw6.c) outputData).f209401a), null, null, false, 43);
                                        default:
                                            g update2 = (g) obj5;
                                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                                            return g.a(update2, null, null, null, null, Month.valueOf(((mw6.c) outputData).f209401a), false, 47);
                                    }
                                }
                            });
                        }
                        return Unit.f186387a;
                    case 1:
                        kw6.b outputData2 = (kw6.b) obj4;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        if (outputData2 == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar32 = aVar;
                        aVar32.H2(aVar32.f74351x, new f0(outputData2, 2));
                        return Unit.f186387a;
                    default:
                        final mw6.e outputData3 = (mw6.e) obj4;
                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                        if (outputData3 instanceof mw6.c) {
                            com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar42 = aVar;
                            final int i32 = 0;
                            aVar42.H2(aVar42.f74351x, new Function1() { // from class: u37.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    switch (i32) {
                                        case 0:
                                            g update = (g) obj5;
                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                            return g.a(update, null, null, ds6.a.valueOf(((mw6.c) outputData3).f209401a), null, null, false, 43);
                                        default:
                                            g update2 = (g) obj5;
                                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                                            return g.a(update2, null, null, null, null, Month.valueOf(((mw6.c) outputData3).f209401a), false, 47);
                                    }
                                }
                            });
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        freelancerSingleChoiceScreen2.H = block3;
        return freelancerSingleChoiceScreen2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object h(Object obj2, Object obj3) {
        CfdWithdrawScreen cfdWithdrawScreen = (CfdWithdrawScreen) this.f273321b;
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        KProperty[] kPropertyArr = CfdWithdrawScreen.V;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(field, "field");
        Object obj4 = model.f51981p;
        xi0.b bVar = obj4 instanceof xi0.b ? (xi0.b) obj4 : null;
        if (bVar != null) {
            return new zp0.d(field.getEditText(), bVar, (u80.d) cfdWithdrawScreen.L.getValue(), null, null, false, false, 0, false, null, 1944);
        }
        return null;
    }

    private final Object i(Object obj2, Object obj3) {
        BeneficiaryCreationType business;
        final com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f fVar = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f) this.f273321b;
        yki.l FlowCoordinator = (yki.l) obj2;
        final BeneficiaryCreationFlowContract$Step step = (BeneficiaryCreationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof BeneficiaryCreationFlowContract$Step.AccountFields) {
            AccountFieldsScreen accountFieldsScreen = new AccountFieldsScreen(new AccountFieldsScreenContract$InputData(((BeneficiaryCreationFlowContract$Step.AccountFields) step).f99740a));
            u4j.c block = new u4j.c(fVar, 0);
            Intrinsics.checkNotNullParameter(block, "block");
            accountFieldsScreen.H = block;
            return accountFieldsScreen;
        }
        if (step instanceof BeneficiaryCreationFlowContract$Step.MissingFields) {
            BeneficiaryCreationFlowContract$Step.MissingFields missingFields = (BeneficiaryCreationFlowContract$Step.MissingFields) step;
            BeneficiaryCreationFlowContract$CreationProcessState beneficiaryCreationFlowContract$CreationProcessState = missingFields.f99747a;
            MissingFieldsScreen missingFieldsScreen = new MissingFieldsScreen(new MissingFieldsScreenContract$InputData(missingFields.f99748b, new LocaleExtraData(beneficiaryCreationFlowContract$CreationProcessState.f99737a.getD().f99723a, beneficiaryCreationFlowContract$CreationProcessState.f99737a.getE().f99726a, missingFields.f99749c)));
            final int i = 0;
            Function1 block2 = new Function1() { // from class: u4j.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            k outputData = (k) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.a aVar = new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.a(step, outputData, null);
                            outputData.getClass();
                            fVar.J2("MissingFieldsScreenContract_BUTTON_TAG", aVar);
                            return Unit.f186387a;
                        case 1:
                            AddressFlowContract$OutputData output = (AddressFlowContract$OutputData) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.b bVar = new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.b(step, output, null);
                            String str = output.d;
                            if (str == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            fVar.J2(str, bVar);
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f fVar2 = fVar;
                            yki.a aVar2 = fVar2.f99761y;
                            f6d.d output2 = (f6d.d) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (Intrinsics.f(output2, f6d.a.f132415a)) {
                                oki.h.E2(aVar2, new u4e.i(5));
                                aVar2.e(false);
                            } else {
                                boolean zF = Intrinsics.f(output2, f6d.b.f132416a);
                                BeneficiaryCreationFlowContract$Step beneficiaryCreationFlowContract$Step = step;
                                if (zF) {
                                    fVar2.J2(((BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee) beneficiaryCreationFlowContract$Step).f99745c, new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.c(beneficiaryCreationFlowContract$Step, fVar2, null));
                                } else {
                                    if (!(output2 instanceof f6d.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fVar2.J2(((BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee) beneficiaryCreationFlowContract$Step).f99745c, new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.d(fVar2, output2, beneficiaryCreationFlowContract$Step, null));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            missingFieldsScreen.H = block2;
            return missingFieldsScreen;
        }
        if (step instanceof BeneficiaryCreationFlowContract$Step.Address) {
            ViewController viewControllerE1 = fVar.e1(new th1.a(new AddressFlowContract$InputData(new Address(null, null, null, null, null, ((BeneficiaryCreationFlowContract$Step.Address) step).f99742b.f297794a, null, null, null, null, null, null, null, null, null, 32735, null), new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.payments_profile_address, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.retail_main_transfer_bank_account_address_subtitle, null, null, 14), false, new TextLocalisedClause(com.revolut.retail.feature.beneficiary.impl.R$string.beneficiary_creation_cta_title, null, null, 14), null, null, null, false, null, 2097076), null, null, 6));
            final int i2 = 1;
            Function1 block3 = new Function1() { // from class: u4j.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            k outputData = (k) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.a aVar = new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.a(step, outputData, null);
                            outputData.getClass();
                            fVar.J2("MissingFieldsScreenContract_BUTTON_TAG", aVar);
                            return Unit.f186387a;
                        case 1:
                            AddressFlowContract$OutputData output = (AddressFlowContract$OutputData) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.b bVar = new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.b(step, output, null);
                            String str = output.d;
                            if (str == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            fVar.J2(str, bVar);
                            return Unit.f186387a;
                        default:
                            com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f fVar2 = fVar;
                            yki.a aVar2 = fVar2.f99761y;
                            f6d.d output2 = (f6d.d) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (Intrinsics.f(output2, f6d.a.f132415a)) {
                                oki.h.E2(aVar2, new u4e.i(5));
                                aVar2.e(false);
                            } else {
                                boolean zF = Intrinsics.f(output2, f6d.b.f132416a);
                                BeneficiaryCreationFlowContract$Step beneficiaryCreationFlowContract$Step = step;
                                if (zF) {
                                    fVar2.J2(((BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee) beneficiaryCreationFlowContract$Step).f99745c, new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.c(beneficiaryCreationFlowContract$Step, fVar2, null));
                                } else {
                                    if (!(output2 instanceof f6d.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fVar2.J2(((BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee) beneficiaryCreationFlowContract$Step).f99745c, new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.d(fVar2, output2, beneficiaryCreationFlowContract$Step, null));
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            viewControllerE1.H = block3;
            return viewControllerE1;
        }
        if (!(step instanceof BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee)) {
            if (!(step instanceof BeneficiaryCreationFlowContract$Step.DuplicateBeneficiary)) {
                throw new NoWhenBranchMatchedException();
            }
            DuplicateBeneficiaryDialogScreen duplicateBeneficiaryDialogScreen = new DuplicateBeneficiaryDialogScreen(new DuplicateBeneficiaryDialogScreenContract$InputData(((BeneficiaryCreationFlowContract$Step.DuplicateBeneficiary) step).f99746a));
            twg.a block4 = new twg.a(fVar, FlowCoordinator, 24);
            Intrinsics.checkNotNullParameter(block4, "block");
            duplicateBeneficiaryDialogScreen.H = block4;
            return duplicateBeneficiaryDialogScreen;
        }
        BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee confirmationOfPayee = (BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee) step;
        ConfirmationResult confirmationResult = confirmationOfPayee.f99744b;
        a5j.b bVar = fVar.f99758t;
        BeneficiaryCreationFlowContract$CreationProcessState creationProcessState = confirmationOfPayee.f99743a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(creationProcessState, "creationProcessState");
        aim.e eVarB = u.b();
        eVarB.addAll(creationProcessState.f99737a.getF99711g());
        List list = creationProcessState.f99738b;
        if (list != null) {
            eVarB.addAll(list);
        }
        aim.e eVarA = u.a(eVarB);
        ArrayList<Field$BackendDefinition.InputDefinition> arrayList = new ArrayList();
        ListIterator listIterator = eVarA.listIterator(0);
        while (true) {
            aim.b bVar2 = (aim.b) listIterator;
            if (!bVar2.hasNext()) {
                break;
            }
            Object next = bVar2.next();
            if (next instanceof Field$BackendDefinition.InputDefinition) {
                arrayList.add(next);
            }
        }
        int i3 = a5j.a.f1431a[creationProcessState.f99737a.getF99705c().ordinal()];
        if (i3 == 1) {
            for (Field$BackendDefinition.InputDefinition inputDefinition : arrayList) {
                if (Intrinsics.f(inputDefinition.f99715a.f60271a, "COMPANY_NAME")) {
                    business = new BeneficiaryCreationType.Business(inputDefinition.f99716b);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        for (Field$BackendDefinition.InputDefinition inputDefinition2 : arrayList) {
            if (Intrinsics.f(inputDefinition2.f99715a.f60271a, "FIRST_NAME")) {
                String str = inputDefinition2.f99716b;
                for (Field$BackendDefinition.InputDefinition inputDefinition3 : arrayList) {
                    if (Intrinsics.f(inputDefinition3.f99715a.f60271a, "LAST_NAME")) {
                        business = new BeneficiaryCreationType.Personal(str, inputDefinition3.f99716b);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
        ViewController viewControllerE12 = fVar.e1(new f6d.e(new ConfirmationOfPayeeScreenContract$InputData(confirmationResult, business)));
        final int i5 = 2;
        Function1 block5 = new Function1() { // from class: u4j.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i5) {
                    case 0:
                        k outputData = (k) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.a aVar = new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.a(step, outputData, null);
                        outputData.getClass();
                        fVar.J2("MissingFieldsScreenContract_BUTTON_TAG", aVar);
                        return Unit.f186387a;
                    case 1:
                        AddressFlowContract$OutputData output = (AddressFlowContract$OutputData) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.b bVar3 = new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.b(step, output, null);
                        String str2 = output.d;
                        if (str2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        fVar.J2(str2, bVar3);
                        return Unit.f186387a;
                    default:
                        com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f fVar2 = fVar;
                        yki.a aVar2 = fVar2.f99761y;
                        f6d.d output2 = (f6d.d) obj4;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (Intrinsics.f(output2, f6d.a.f132415a)) {
                            oki.h.E2(aVar2, new u4e.i(5));
                            aVar2.e(false);
                        } else {
                            boolean zF = Intrinsics.f(output2, f6d.b.f132416a);
                            BeneficiaryCreationFlowContract$Step beneficiaryCreationFlowContract$Step = step;
                            if (zF) {
                                fVar2.J2(((BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee) beneficiaryCreationFlowContract$Step).f99745c, new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.c(beneficiaryCreationFlowContract$Step, fVar2, null));
                            } else {
                                if (!(output2 instanceof f6d.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fVar2.J2(((BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee) beneficiaryCreationFlowContract$Step).f99745c, new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.d(fVar2, output2, beneficiaryCreationFlowContract$Step, null));
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block5, "block");
        viewControllerE12.H = block5;
        return viewControllerE12;
    }

    private final Object j(Object obj2, Object obj3) {
        u64.d dVar = (u64.d) this.f273321b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        ComboCardOrderingFlowContract$Step step = (ComboCardOrderingFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_combo_ordering_congratulations_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_combo_ordering_congratulations_description, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_combo_ordering_congratulations_primary, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(iy4.a.d(textLocalisedClause, textLocalisedClause2, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D151A", null, null, null, 30), resourceImage, new AnalyticsContext(v7.m(dVar.f277475p.f67241c, AnalyticsContext.INSTANCE)), null, button, null, null, null, 7904));
        p4 block = new p4(dVar, 27);
        Intrinsics.checkNotNullParameter(block, "block");
        promptMarketingScreen.H = block;
        return promptMarketingScreen;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06fe  */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v31, types: [com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable$Shimmering$Companion, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r46, java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 3674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tp8.l.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ l(h0 h0Var, twb.l lVar) {
        this.f273320a = 15;
        this.f273321b = lVar;
    }
}
