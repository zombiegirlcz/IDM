package jg9;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.apm.bills.core.api.model.form.AddressField;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormV2;
import com.revolut.feature.apm.bills.core.api.model.form.ChoiceV2;
import com.revolut.feature.apm.bills.core.api.model.form.DateOfBirthField;
import com.revolut.feature.apm.bills.core.api.model.form.DateYearField;
import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import com.revolut.feature.apm.bills.core.api.model.form.FormNameField;
import com.revolut.feature.apm.bills.core.api.model.form.NestedItemField;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterDropdownField;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterField;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.BillFormFieldControllerModelExtensionV2$BillData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.date_year.YearPickerBottomSheetController;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_field.DropdownFieldSelectionScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.form_name.FormNameScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.form_name.FormNameScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.repeater_dropdown.RepeaterDropdownSelectionScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$SubformDataSource;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$SubformScreenAction;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$ToolbarAction;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.time.date_picker.DatePickerBottomSheetController;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends yji.n implements q {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l80.e f173957l;

    public s(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f173957l = dateProvider;
    }

    public static SubformScreenContract$SubformDataSource k3(BillFormFieldControllerModelExtensionV2$BillData billFormFieldControllerModelExtensionV2$BillData) {
        Bill bill = billFormFieldControllerModelExtensionV2$BillData.f78710a;
        return bill != null ? new SubformScreenContract$SubformDataSource.ExistingBill(bill) : new SubformScreenContract$SubformDataSource.NewInputs(billFormFieldControllerModelExtensionV2$BillData.f78711b);
    }

    public final void Z2(AddressField field, Address address, Function1 onResult) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        yji.n.P2(this, o2(new th1.a(new AddressFlowContract$InputData(address, new TextClause(field.f61353b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, new TextLocalisedClause(R$string.pay_bills_taxes_common_save, null, null, 14), null, null, null, false, null, 2097084), null, null, 6)), null, new a31.k(26, onResult), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b3(com.revolut.feature.apm.bills.core.api.model.form.DateMonthField r12, java.lang.String r13, kotlin.jvm.functions.Function1 r14) {
        /*
            r11 = this;
            java.lang.String r0 = "formField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r1 = 0
            if (r13 == 0) goto L25
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L14
            java.time.YearMonth r13 = java.time.YearMonth.parse(r13)     // Catch: java.lang.Throwable -> L14
            goto L1c
        L14:
            r0 = move-exception
            r13 = r0
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r13 = yhm.o.a(r13)
        L1c:
            boolean r0 = r13 instanceof yhm.n
            if (r0 == 0) goto L21
            r13 = r1
        L21:
            java.time.YearMonth r13 = (java.time.YearMonth) r13
            if (r13 != 0) goto L29
        L25:
            java.time.YearMonth r13 = java.time.YearMonth.now()
        L29:
            com.revolut.kompot.common.bottom_sheet.time.MonthPickerBottomSheetController r0 = new com.revolut.kompot.common.bottom_sheet.time.MonthPickerBottomSheetController
            com.revolut.kompot.common.bottom_sheet.time.MonthPickerBottomSheetController$InputData r2 = new com.revolut.kompot.common.bottom_sheet.time.MonthPickerBottomSheetController$InputData
            com.revolut.core.ui_kit.models.TextClause r3 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r4 = r12.f61371b
            r9 = 0
            r10 = 126(0x7e, float:1.77E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            kotlin.jvm.internal.Intrinsics.h(r13)
            r2.<init>(r3, r13, r1, r1)
            r0.<init>(r2)
            je2.d r13 = new je2.d
            r1 = 7
            r13.<init>(r14, r12, r1)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r12 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r11.N2(r0, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jg9.s.b3(com.revolut.feature.apm.bills.core.api.model.form.DateMonthField, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    public final void c3(DateOfBirthField formField, String str, Function1 onResult) {
        LocalDate localDate;
        Intrinsics.checkNotNullParameter(formField, "formField");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        LocalDate localDateE = ((l80.f) this.f173957l).e();
        N2(new DatePickerBottomSheetController(new DatePickerBottomSheetController.InputData(new TextLocalisedClause(formField.f61374b, (List) null, (Clause) null, false, 30), (str == null || (localDate = LocalDate.parse(str)) == null) ? localDateE : localDate, (LocalDate) null, localDateE, 4)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new je2.d(onResult, formField, 8));
    }

    public final void d3(DateYearField formField, String str, Function1 onResult) {
        Integer numM;
        Intrinsics.checkNotNullParameter(formField, "formField");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        TextClause textClause = new TextClause(formField.f61377b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        l80.e eVar = this.f173957l;
        N2(new YearPickerBottomSheetController(new kg9.a(textClause, (str == null || (numM = z.m(str)) == null) ? ((l80.f) eVar).j() : numM.intValue(), str != null ? z.m(str) : null, Integer.valueOf(((l80.f) eVar).j()))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new je2.d(onResult, formField, 6));
    }

    public final void e3(DropdownField formField, Function1 onResult) {
        Intrinsics.checkNotNullParameter(formField, "formField");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        N2(new DropdownFieldSelectionScreen(new mg9.d(formField)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new a31.k(28, onResult));
    }

    public final void f3(FormNameField formField, String str, Function1 onResult) {
        Intrinsics.checkNotNullParameter(formField, "formField");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        yji.n.P2(this, new FormNameScreen(new FormNameScreenContract$InputData(formField.f61386b, str)), null, new je2.d(onResult, formField, 9), 1);
    }

    public final void g3(NestedItemField formField, BillFormFieldControllerModelExtensionV2$BillData billData, Function1 onResult) {
        Intrinsics.checkNotNullParameter(formField, "formField");
        Intrinsics.checkNotNullParameter(billData, "billData");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        xo1.g gVar = billData.f78712c;
        String str = formField.f61394a;
        TextClause textClause = new TextClause(formField.f61395b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        BillFormV2 billFormV2 = formField.e;
        if (billFormV2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        yji.n.P2(this, new SubformScreen(new SubformScreenContract$InputData(gVar, str, billFormV2, k3(billData), textClause, null, null, 384)), null, new a31.k(25, onResult), 1);
    }

    public final void h3(RepeaterDropdownField field, BillFormFieldControllerModelExtensionV2$BillData billData, Function1 onResult) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(billData, "billData");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        BillInputV2 billInputV2G = foh.i.g(field.f61409a, billData.f78711b);
        BillInputV2.BillInputRepeaterDropdown billInputRepeaterDropdown = billInputV2G instanceof BillInputV2.BillInputRepeaterDropdown ? (BillInputV2.BillInputRepeaterDropdown) billInputV2G : null;
        List list = billInputRepeaterDropdown != null ? billInputRepeaterDropdown.f61315c : null;
        if (list == null) {
            list = f0.f322471a;
        }
        N2(new RepeaterDropdownSelectionScreen(new ug9.c(field, list)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new ja3.d(this, billData, field, onResult, 2));
    }

    public final void i3(RepeaterField field, BillFormFieldControllerModelExtensionV2$BillData billData, String parentName, String str, Clause clause, Function1 onResult) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(billData, "billData");
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        xo1.g gVar = billData.f78712c;
        String str2 = field.f61412a;
        Clause textClause = clause == null ? new TextClause(field.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : clause;
        BillFormV2 billFormV2 = field.f;
        if (billFormV2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        yji.n.P2(this, new SubformScreen(new SubformScreenContract$InputData(gVar, str2, billFormV2, k3(billData), textClause, SubformScreenContract$SubformScreenAction.Save.f78734a, str != null ? SubformScreenContract$ToolbarAction.Remove.f78735a : null, parentName, str)), null, new a31.k(27, onResult), 1);
    }

    public final void j3(ChoiceV2 choiceV2, BillFormFieldControllerModelExtensionV2$BillData billFormFieldControllerModelExtensionV2$BillData, String str, boolean z, Function1 function1) {
        xo1.g gVar = billFormFieldControllerModelExtensionV2$BillData.f78712c;
        String str2 = choiceV2.f61366a;
        TextClause textClause = new TextClause(choiceV2.f61367b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        BillFormV2 billFormV2 = choiceV2.e;
        if (billFormV2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        yji.n.P2(this, new SubformScreen(new SubformScreenContract$InputData(gVar, str2, billFormV2, k3(billFormFieldControllerModelExtensionV2$BillData), textClause, z ? SubformScreenContract$ToolbarAction.Remove.f78735a : null, str, 256)), null, new a31.k(29, function1), 1);
    }
}
