package a4j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import n4j.c;
import n4j.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zq.a f1286a;

    public a(s4j.a idGenerator, h definitionTransformer, zq.a formattingValidator, c beneficiaryCreationUtils) {
        Intrinsics.checkNotNullParameter(idGenerator, "idGenerator");
        Intrinsics.checkNotNullParameter(definitionTransformer, "definitionTransformer");
        Intrinsics.checkNotNullParameter(formattingValidator, "formattingValidator");
        Intrinsics.checkNotNullParameter(beneficiaryCreationUtils, "beneficiaryCreationUtils");
        this.f1286a = formattingValidator;
    }

    public final Field$BackendDefinition a(BeneficiaryInfoState beneficiaryInfoState, String str) {
        Object next;
        Iterator it8 = beneficiaryInfoState.getF99711g().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(s4j.a.a(((Field$BackendDefinition) next).getF99718a()), str)) {
                break;
            }
        }
        Field$BackendDefinition field$BackendDefinition = (Field$BackendDefinition) next;
        if (field$BackendDefinition != null) {
            return field$BackendDefinition;
        }
        throw new IllegalStateException("Editable field is not in the state");
    }
}
