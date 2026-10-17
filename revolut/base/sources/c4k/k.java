package c4k;

import cli.n;
import cli.y;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceField;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceOption;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.payments.bank_transfer.impl.structured_reference_transfer_note.StructuredReferenceTransferNoteScreenContract$InputData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends oki.h implements h {
    public final e5k.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f21315p;

    public k(e5k.g structuredReferenceValidator, StructuredReferenceTransferNoteScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(structuredReferenceValidator, "structuredReferenceValidator");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = structuredReferenceValidator;
        this.f21315p = mra.d.b(this, new e(inputData.f102058a, inputData.f102059b, f0.f322471a), stateMapper, null, false, 12);
    }

    public final void I2(String listId, String newValue, String str) {
        Object next;
        RemittanceReferenceField remittanceReferenceField;
        List fields;
        Object next2;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String strE0 = d0.e0(listId, "ITEM_REFERENCE_FIELD_INPUT_ID_");
        if (Intrinsics.f(strE0, listId)) {
            return;
        }
        y yVar = this.f21315p;
        TransferNote.StructuredNote structuredNote = ((e) ((j2) yVar.f22677a).getValue()).f21305a;
        Iterator it8 = ((e) ((j2) yVar.f22677a).getValue()).f21306b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((RemittanceReferenceOption) next).getType(), structuredNote.f101984a)) {
                    break;
                }
            }
        }
        RemittanceReferenceOption remittanceReferenceOption = (RemittanceReferenceOption) next;
        if (remittanceReferenceOption == null || (fields = remittanceReferenceOption.getFields()) == null) {
            remittanceReferenceField = null;
        } else {
            Iterator it9 = fields.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it9.next();
                    if (Intrinsics.f(((RemittanceReferenceField) next2).getType(), strE0)) {
                        break;
                    }
                }
            }
            remittanceReferenceField = (RemittanceReferenceField) next2;
        }
        if (str == null) {
            if ((remittanceReferenceField != null ? remittanceReferenceField.getInputMask() : null) != null) {
                return;
            }
        }
        H2(yVar, new a5b.a(newValue, (Object) str, (Object) structuredNote, (Object) strE0, (Object) this, 7));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f21315p;
    }
}
