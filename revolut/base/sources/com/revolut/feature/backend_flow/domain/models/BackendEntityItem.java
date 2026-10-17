package com.revolut.feature.backend_flow.domain.models;

import java.util.List;
import kotlin.Metadata;
import xl2.t;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendEntityItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendItem;", "Lxl2/t;", "", "Lcom/revolut/feature/backend_flow/domain/models/EntitiesListItem;", "Lcom/revolut/feature/backend_flow/domain/models/EntitiesSelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/EntityCellItem;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BackendEntityItem extends BackendItem, t {
    BackendEntityItem c3(List list);

    List getEntities();

    EntityType z6();
}
