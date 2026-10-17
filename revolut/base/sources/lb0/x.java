package lb0;

import aa0.b1;
import aa0.f1;
import aa0.u0;
import aw0.o9;
import com.revolut.core.backend_flow.impl.ui.card_photo.BackendFlowCardPhotoFlow;
import com.revolut.core.backend_flow.impl.ui.card_photo.BackendFlowCardPhotoFlowContract$InputData;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract$ModalStep;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.backend_flow.domain.models.CheckboxTextInputItem;
import com.revolut.feature.backend_flow.domain.models.DropDownItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.MoneyInputItem;
import com.revolut.feature.backend_flow.domain.models.MultiSelectionItem;
import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonTextInputItem;
import com.revolut.feature.backend_flow.domain.models.SignatureInputItem;
import com.revolut.feature.backend_flow.domain.models.SingleSelectionItem;
import com.revolut.feature.backend_flow.domain.models.TextInputItem;
import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import com.revolut.feature.picker.PickerController;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class x implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.backend_flow.impl.ui.form_screen.a f193568b;

    public /* synthetic */ x(com.revolut.core.backend_flow.impl.ui.form_screen.a aVar, int i) {
        this.f193567a = i;
        this.f193568b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object f1Var;
        PickerController pickerController;
        switch (this.f193567a) {
            case 0:
                xl2.h0 item = (xl2.h0) obj2;
                ValidationResult validationResult = (ValidationResult) obj3;
                Intrinsics.checkNotNullParameter(item, "item");
                if ((item instanceof TextInputItem) || (item instanceof SignatureInputItem)) {
                    f1Var = new f1(validationResult);
                } else if ((item instanceof CheckboxTextInputItem) || (item instanceof RadioButtonTextInputItem) || (item instanceof MultiSelectionItem) || (item instanceof SingleSelectionItem)) {
                    f1Var = new b1(validationResult);
                } else {
                    if (!(item instanceof MoneyInputItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f1Var = new u0(validationResult);
                }
                this.f193568b.S2(f1Var, ((InputItem) item).getId());
                return Unit.f186387a;
            default:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FormControllerContract$ModalStep step = (FormControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                com.revolut.core.backend_flow.impl.ui.form_screen.a aVar = this.f193568b;
                com.revolut.core.backend_flow.impl.ui.form_screen.b bVar = aVar.u;
                final laj.b onStepResult = new laj.b(aVar, 1);
                bVar.getClass();
                Intrinsics.checkNotNullParameter(step, "step");
                Intrinsics.checkNotNullParameter(onStepResult, "onStepResult");
                if (step instanceof FormControllerContract$ModalStep.CurrencySelection) {
                    s7a.w wVar = s7a.w.SHOWN;
                    MoneyInputItem moneyInputItem = ((FormControllerContract$ModalStep.CurrencySelection) step).f51280a;
                    s7a.x xVar = new s7a.x(null, new ob0.e(moneyInputItem.f63529a, moneyInputItem.f63530b), null, null, false, wVar, null, null, null, false, null, moneyInputItem.d.f306286a, null, null, false, null, null, null, null, null, 2147352312);
                    Object obj4 = bVar.f51290c.get();
                    Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                    PickerController pickerController2 = new PickerController(xVar, (x7a.d) obj4);
                    final int i = 0;
                    Function1 block = new Function1() { // from class: lb0.o0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            s7a.a0 it8 = (s7a.a0) obj5;
                            switch (i) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var = it8.f260599a;
                                    Intrinsics.i(c0Var, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.CurrencySelection");
                                    onStepResult.invoke((s) c0Var);
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var2 = it8.f260599a;
                                    if (c0Var2 instanceof ob0.d) {
                                        ob0.d dVar = (ob0.d) c0Var2;
                                        onStepResult.invoke(new r(dVar.f223816a, dVar.f223817b));
                                    }
                                    break;
                                case 2:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var3 = it8.f260599a;
                                    Intrinsics.i(c0Var3, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.PhoneCodeSelection");
                                    onStepResult.invoke((u) c0Var3);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var4 = it8.f260599a;
                                    Intrinsics.i(c0Var4, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.DropDownOptionSelection");
                                    onStepResult.invoke((t) c0Var4);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    pickerController2.H = block;
                    return pickerController2;
                }
                if (step instanceof FormControllerContract$ModalStep.CountrySelection) {
                    PickerController pickerControllerA = bVar.f51289b.a(((FormControllerContract$ModalStep.CountrySelection) step).f51279a, null, null);
                    final int i2 = 1;
                    Function1 block2 = new Function1() { // from class: lb0.o0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            s7a.a0 it8 = (s7a.a0) obj5;
                            switch (i2) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var = it8.f260599a;
                                    Intrinsics.i(c0Var, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.CurrencySelection");
                                    onStepResult.invoke((s) c0Var);
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var2 = it8.f260599a;
                                    if (c0Var2 instanceof ob0.d) {
                                        ob0.d dVar = (ob0.d) c0Var2;
                                        onStepResult.invoke(new r(dVar.f223816a, dVar.f223817b));
                                    }
                                    break;
                                case 2:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var3 = it8.f260599a;
                                    Intrinsics.i(c0Var3, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.PhoneCodeSelection");
                                    onStepResult.invoke((u) c0Var3);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var4 = it8.f260599a;
                                    Intrinsics.i(c0Var4, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.DropDownOptionSelection");
                                    onStepResult.invoke((t) c0Var4);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    pickerControllerA.H = block2;
                    return pickerControllerA;
                }
                if (step instanceof FormControllerContract$ModalStep.PhoneCodeSelection) {
                    s7a.w wVar2 = s7a.w.SHOWN;
                    PhoneInputItem phoneInputItem = ((FormControllerContract$ModalStep.PhoneCodeSelection) step).f51282a;
                    String str = phoneInputItem.d;
                    s7a.x xVar2 = new s7a.x(null, new ob0.t(phoneInputItem), null, null, false, wVar2, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, null, phoneInputItem.f63573h.f297794a, null, null, false, null, null, null, null, null, 2147351800);
                    Object obj5 = bVar.d.get();
                    Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                    pickerController = new PickerController(xVar2, (x7a.d) obj5);
                    final int i3 = 2;
                    Function1 block3 = new Function1() { // from class: lb0.o0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj52) {
                            s7a.a0 it8 = (s7a.a0) obj52;
                            switch (i3) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var = it8.f260599a;
                                    Intrinsics.i(c0Var, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.CurrencySelection");
                                    onStepResult.invoke((s) c0Var);
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var2 = it8.f260599a;
                                    if (c0Var2 instanceof ob0.d) {
                                        ob0.d dVar = (ob0.d) c0Var2;
                                        onStepResult.invoke(new r(dVar.f223816a, dVar.f223817b));
                                    }
                                    break;
                                case 2:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var3 = it8.f260599a;
                                    Intrinsics.i(c0Var3, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.PhoneCodeSelection");
                                    onStepResult.invoke((u) c0Var3);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var4 = it8.f260599a;
                                    Intrinsics.i(c0Var4, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.DropDownOptionSelection");
                                    onStepResult.invoke((t) c0Var4);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    pickerController.H = block3;
                } else {
                    if (!(step instanceof FormControllerContract$ModalStep.DropDownOptionSelection)) {
                        if (!(step instanceof FormControllerContract$ModalStep.CardPhoto)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BackendFlowCardPhotoFlow backendFlowCardPhotoFlow = new BackendFlowCardPhotoFlow(new BackendFlowCardPhotoFlowContract$InputData(((FormControllerContract$ModalStep.CardPhoto) step).f51278a), bVar.f51288a);
                        l9k.v block4 = new l9k.v(onStepResult, step, 4);
                        Intrinsics.checkNotNullParameter(block4, "block");
                        backendFlowCardPhotoFlow.H = block4;
                        return backendFlowCardPhotoFlow;
                    }
                    s7a.w wVar3 = s7a.w.SHOWN;
                    DropDownItem dropDownItem = ((FormControllerContract$ModalStep.DropDownOptionSelection) step).f51281a;
                    String str2 = dropDownItem.d;
                    s7a.x xVar3 = new s7a.x(null, new ob0.f(dropDownItem), null, null, false, wVar3, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, null, dropDownItem.f, null, null, false, null, null, null, null, null, 2147351800);
                    Object obj6 = bVar.e.get();
                    Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                    pickerController = new PickerController(xVar3, (x7a.d) obj6);
                    final int i5 = 3;
                    Function1 block5 = new Function1() { // from class: lb0.o0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj52) {
                            s7a.a0 it8 = (s7a.a0) obj52;
                            switch (i5) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var = it8.f260599a;
                                    Intrinsics.i(c0Var, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.CurrencySelection");
                                    onStepResult.invoke((s) c0Var);
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var2 = it8.f260599a;
                                    if (c0Var2 instanceof ob0.d) {
                                        ob0.d dVar = (ob0.d) c0Var2;
                                        onStepResult.invoke(new r(dVar.f223816a, dVar.f223817b));
                                    }
                                    break;
                                case 2:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var3 = it8.f260599a;
                                    Intrinsics.i(c0Var3, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.PhoneCodeSelection");
                                    onStepResult.invoke((u) c0Var3);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    s7a.c0 c0Var4 = it8.f260599a;
                                    Intrinsics.i(c0Var4, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.FormControllerContract.ModelStepResult.DropDownOptionSelection");
                                    onStepResult.invoke((t) c0Var4);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    pickerController.H = block5;
                }
                return pickerController;
        }
    }
}
