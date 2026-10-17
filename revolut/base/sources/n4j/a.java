package n4j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f212450a;

    public a(c beneficiaryCreationUtils) {
        Intrinsics.checkNotNullParameter(beneficiaryCreationUtils, "beneficiaryCreationUtils");
        this.f212450a = beneficiaryCreationUtils;
    }

    public final boolean a(List backendDefinitions) {
        Intrinsics.checkNotNullParameter(backendDefinitions, "backendDefinitions");
        if (backendDefinitions.isEmpty()) {
            return false;
        }
        List<Field$BackendDefinition> list = backendDefinitions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (Field$BackendDefinition field$BackendDefinition : list) {
            if (field$BackendDefinition instanceof Field$BackendDefinition.DropdownDefinition) {
                if (((Field$BackendDefinition.DropdownDefinition) field$BackendDefinition).f99714b.length() <= 0) {
                    return false;
                }
            } else if (field$BackendDefinition instanceof Field$BackendDefinition.InputDefinition) {
                Field$BackendDefinition.InputDefinition definition = (Field$BackendDefinition.InputDefinition) field$BackendDefinition;
                this.f212450a.getClass();
                Intrinsics.checkNotNullParameter(definition, "definition");
                s4j.c cVar = definition.d;
                if (cVar != s4j.c.Valid && (cVar != s4j.c.Empty || !Intrinsics.f(definition.f99715a.f60275h, Boolean.TRUE))) {
                    return false;
                }
            } else {
                if (!(field$BackendDefinition instanceof Field$BackendDefinition.SearchList)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((Field$BackendDefinition.SearchList) field$BackendDefinition).d == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
