package n4j;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.definition_selector.DefinitionSelectorContract$Choice;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.definition_selector.DefinitionSelectorContract$InputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.definition_selector.DefinitionSelectorController;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.search_list.SearchListScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2j.c f212459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f212460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4j.b f212461c;

    public i(z2j.c beneficiaryAccountFieldTypeHelper, f countrySelectorInteractorFactory, p4j.b dropdownDefinitionMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryAccountFieldTypeHelper, "beneficiaryAccountFieldTypeHelper");
        Intrinsics.checkNotNullParameter(countrySelectorInteractorFactory, "countrySelectorInteractorFactory");
        Intrinsics.checkNotNullParameter(dropdownDefinitionMapper, "dropdownDefinitionMapper");
        this.f212459a = beneficiaryAccountFieldTypeHelper;
        this.f212460b = countrySelectorInteractorFactory;
        this.f212461c = dropdownDefinitionMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public final DefinitionSelectorController a(Field$BackendDefinition.DropdownDefinition dropdownDefinition) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(dropdownDefinition, "dropdownDefinition");
        TextLocalisedClause textLocalisedClauseA = this.f212459a.a(dropdownDefinition.f99713a.f60271a);
        List list = dropdownDefinition.f99713a.f60274g;
        if (list != null) {
            List<String> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (String str : list2) {
                arrayList.add(new DefinitionSelectorContract$Choice(this.f212461c.a(dropdownDefinition, str), str));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        return new DefinitionSelectorController(new DefinitionSelectorContract$InputData(textLocalisedClauseA, arrayList));
    }

    public final SearchListScreen b(Field$BackendDefinition.SearchList searchList) {
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        return new SearchListScreen(new m4j.g(this.f212459a.a(searchList.f99718a.f60271a), searchList.f99720c, searchList.f99718a));
    }
}
