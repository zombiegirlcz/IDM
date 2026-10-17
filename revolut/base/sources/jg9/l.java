package jg9;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.date_year.YearPickerBottomSheetController;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_field.DropdownFieldSelectionScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.DropdownSearchableSelectionScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.DropdownSearchableSelectionScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.time.MonthPickerBottomSheetController;
import java.time.YearMonth;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends yji.n implements g {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tg9.d f173949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tg9.a f173950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l80.e f173951n;

    public l(tg9.d qrOrBarcodeDialogProvider, tg9.a qrHandler, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(qrOrBarcodeDialogProvider, "qrOrBarcodeDialogProvider");
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f173949l = qrOrBarcodeDialogProvider;
        this.f173950m = qrHandler;
        this.f173951n = dateProvider;
    }

    public final void Z2(BillFormField billFormField, Function1 function1) {
        TextClause textClause = new TextClause(billFormField.f61275b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        YearMonth yearMonthNow = YearMonth.now();
        Intrinsics.checkNotNullExpressionValue(yearMonthNow, "now(...)");
        N2(new MonthPickerBottomSheetController(new MonthPickerBottomSheetController.InputData(textClause, yearMonthNow, null, null)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new a31.k(21, function1));
    }

    public final void b3(DropdownField dropdownField, Function1 function1) {
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = dropdownField.d;
        if ((billFormFieldAttributes != null ? billFormFieldAttributes.e : null) != null) {
            N2(new DropdownSearchableSelectionScreen(new DropdownSearchableSelectionScreenContract$InputData(dropdownField)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new a31.k(22, function1));
        } else {
            N2(new DropdownFieldSelectionScreen(new mg9.d(dropdownField)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new a31.k(23, function1));
        }
    }

    public final void c3(BillFormField formField, Function1 onResult) {
        Intrinsics.checkNotNullParameter(formField, "formField");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        switch (k.f173948a[formField.f61276c.ordinal()]) {
            case 1:
                b3((DropdownField) u.g(formField), new h(onResult, formField, 2));
                return;
            case 2:
                e3(formField, new h(onResult, formField, 3));
                return;
            case 3:
                Z2(formField, new h(onResult, formField, 0));
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                onResult.invoke(null);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void d3(BillFormField formField, Function1 onResult) {
        Intrinsics.checkNotNullParameter(formField, "formField");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        switch (k.f173948a[formField.f61276c.ordinal()]) {
            case 1:
                b3((DropdownField) u.g(formField), new a31.k(19, onResult));
                return;
            case 2:
                e3(formField, new h(onResult, formField, 1));
                return;
            case 3:
                Z2(formField, new a31.k(20, onResult));
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                onResult.invoke(null);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void e3(BillFormField billFormField, Function1 function1) {
        N2(new YearPickerBottomSheetController(new kg9.a(new TextClause(billFormField.f61275b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((l80.f) this.f173951n).j(), null, null)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new a31.k(24, function1));
    }
}
