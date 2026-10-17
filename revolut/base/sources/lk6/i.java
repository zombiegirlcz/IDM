package lk6;

import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f196243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f196244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f196245c;
    public final OpenBankingBrazilPayment.EditableMoneyField d;
    public final OpenBankingBrazilPayment.EditableMoneyField e;
    public final OpenBankingBrazilPayment.EditableDateField f;

    public i(Data paymentData, Data data, Boolean bool, OpenBankingBrazilPayment.EditableMoneyField editableMoneyField, OpenBankingBrazilPayment.EditableMoneyField editableMoneyField2, OpenBankingBrazilPayment.EditableDateField editableDateField) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        this.f196243a = paymentData;
        this.f196244b = data;
        this.f196245c = bool;
        this.d = editableMoneyField;
        this.e = editableMoneyField2;
        this.f = editableDateField;
    }

    public static i a(i iVar, Data data, Data data2, Boolean bool, OpenBankingBrazilPayment.EditableMoneyField editableMoneyField, OpenBankingBrazilPayment.EditableMoneyField editableMoneyField2, OpenBankingBrazilPayment.EditableDateField editableDateField, int i) {
        if ((i & 1) != 0) {
            data = iVar.f196243a;
        }
        Data paymentData = data;
        if ((i & 2) != 0) {
            data2 = iVar.f196244b;
        }
        Data data3 = data2;
        if ((i & 4) != 0) {
            bool = iVar.f196245c;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            editableMoneyField = iVar.d;
        }
        OpenBankingBrazilPayment.EditableMoneyField editableMoneyField3 = editableMoneyField;
        if ((i & 16) != 0) {
            editableMoneyField2 = iVar.e;
        }
        OpenBankingBrazilPayment.EditableMoneyField editableMoneyField4 = editableMoneyField2;
        if ((i & 32) != 0) {
            editableDateField = iVar.f;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new i(paymentData, data3, bool2, editableMoneyField3, editableMoneyField4, editableDateField);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f196243a, iVar.f196243a) && Intrinsics.f(this.f196244b, iVar.f196244b) && Intrinsics.f(this.f196245c, iVar.f196245c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f196243a.hashCode() * 31;
        Data data = this.f196244b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Boolean bool = this.f196245c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        OpenBankingBrazilPayment.EditableMoneyField editableMoneyField = this.d;
        int iHashCode4 = (iHashCode3 + (editableMoneyField == null ? 0 : editableMoneyField.hashCode())) * 31;
        OpenBankingBrazilPayment.EditableMoneyField editableMoneyField2 = this.e;
        int iHashCode5 = (iHashCode4 + (editableMoneyField2 == null ? 0 : editableMoneyField2.hashCode())) * 31;
        OpenBankingBrazilPayment.EditableDateField editableDateField = this.f;
        return iHashCode5 + (editableDateField != null ? editableDateField.hashCode() : 0);
    }
}
