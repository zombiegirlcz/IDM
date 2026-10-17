package com.revolut.feature.backend_flow.domain.models;

import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectableItem;", "Option", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lcom/revolut/feature/backend_flow/domain/models/EntitiesSelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/TransactionsSelectionItem;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SelectableItem<Option> extends InputItem {
    SelectableItem D1(Set set);

    SelectionStyle h();

    Set p4();
}
