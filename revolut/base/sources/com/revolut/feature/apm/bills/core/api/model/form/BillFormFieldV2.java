package com.revolut.feature.apm.bills.core.api.model.form;

import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0012\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldV2;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/revolut/feature/apm/bills/core/api/model/form/AddressField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/BarcodeField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/CheckboxField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/DateMonthField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/DateOfBirthField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/DateYearField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/DropdownField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/FormNameField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/InfoField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/MoneyField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/NestedItemField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/NumberField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/QrCodeField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/QrCodeOrBarcodeField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/RepeaterDropdownField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/RepeaterField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/SearchField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/TextField;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BillFormFieldV2 implements Parcelable {
    private BillFormFieldV2() {
    }

    public abstract BillFormField.BillFormFieldAttributes a();

    public abstract boolean b();

    public abstract String getLabel();

    public abstract String getName();
}
