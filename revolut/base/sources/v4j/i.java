package v4j;

import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import com.revolut.domain.models.beneficiary.BankFieldFormat;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5j.b f286115a;

    public i(n4j.h fieldDefinitionTransformer, a5j.b beneficiaryCreationFlowModelUtils) {
        Intrinsics.checkNotNullParameter(fieldDefinitionTransformer, "fieldDefinitionTransformer");
        Intrinsics.checkNotNullParameter(beneficiaryCreationFlowModelUtils, "beneficiaryCreationFlowModelUtils");
        this.f286115a = beneficiaryCreationFlowModelUtils;
    }

    public static Field$BackendDefinition.InputDefinition a(AccountFieldType accountFieldType, String str) {
        String strName = accountFieldType.name();
        m70.a.c(t0.f186434a);
        return new Field$BackendDefinition.InputDefinition(new BankFieldDefinition(strName, "", BankFieldFormat.NONE, false, null, null, null, null, true), str, str, s4j.c.Valid);
    }

    public static ArrayList b(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!kotlin.collections.d.I(n61.j.f212688a, ((Field$BackendDefinition) obj2).getF99718a().f60271a)) {
                arrayList.add(obj2);
            }
        }
        return d0.E0(list2, arrayList);
    }
}
